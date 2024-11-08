package validation.registry.handlers;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

import common.dialog.ProjectSelectWindow;
import common.dto.APXDeployedEntity;
import common.dto.APXLocalCloudDesignDescription;
import common.parsing.workspace.ParsingUtils;

import org.eclipse.jface.window.Window;

/**
 * Generation and Execution of Scripts
 * 
 * @author fernand0labra
 *
 */
public class ScriptDeployment {

	// =================================================================================================
	// attributes
	
	@Execute
	public void execute(Shell shell) throws Exception {
		IProject[] projects= ParsingUtils.readWorkspace(); // Read projects from workspace
		Shell projectShell = null;
		ProjectSelectWindow projectWindow = new ProjectSelectWindow(projectShell);
		projectWindow.setProjects(projects);

		IPath projectLocation = null;
		String modelPath = "";

		if(projectWindow.open() == Window.OK) { // Select a project
			projectLocation = projectWindow.getSelectedProject().getLocation();
			String[] projectFiles = ParsingUtils.readWorkspace(projectLocation.toString(), false);
			
			for(String file : projectFiles)
				if(file.endsWith(".uml"))
					modelPath = projectLocation.toString() + File.separator  + file;

			if(modelPath.equals("")) // If there is no .uml file
				throw new Exception("The selected project does not have an .uml file.");
			
		}
		
		common.parsing.model.ParsingSetup.parseModel(modelPath); // Parse UML model
		System.out.println(common.parsing.model.ParsingSetup.modelSystemDescriptionMap);
		
		ArrayList<String> databaseSystems = new ArrayList<String>(); // Registered DB Systems
		
		try {
			// Connect to the database
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/arrowhead", "arrowhead", "");
			
			// Select systems from system_ table
			Statement stmt  = conn.createStatement();
			ResultSet result = stmt.executeQuery("SELECT * FROM arrowhead.system_;");

			while(result.next())
				databaseSystems.add(result.getString("system_name"));
				
		} catch(Exception e) {
			MessageBox messageBox = new MessageBox(new Shell(), SWT.ERROR);
			messageBox.setMessage(e.getMessage());
			messageBox.open();
		}
		
		ArrayList<String> localClouds = new ArrayList<String>();
		ArrayList<String> nonSavedSystems = new ArrayList<String>();
		
		// UML Model Deployed Entity Identifier
		HashMap<String, String> deployedEntityID = new HashMap<String, String>(); 
		
		// For each local cloud in the UML model
		for(APXLocalCloudDesignDescription localCloud : common.parsing.model.ParsingSetup.modelLocalCloudMap.values()) {
			localClouds.add(localCloud.getName());
			
			// For each deployed entity in the UML model
			for(APXDeployedEntity deployedEntity : localCloud.getDeployedEntities().values()) {
				String deployedEntityKebab = ParsingUtils.toKebabCase(deployedEntity.getName());
				
				int index = 0;
				while(index < databaseSystems.size() && !databaseSystems.get(index).contains(deployedEntityKebab))
					index ++;
				
				// Add the deployed entity if it's not registered in the database
				if(index == databaseSystems.size()) 
					nonSavedSystems.add(deployedEntity.getName());
			}
		}

		// Build XML Document Reader
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
		documentBuilderFactory.setNamespaceAware(true);
		
		// Parse XML Document (UML Model)
		Document model = builder.parse(new InputSource(modelPath));
		Node child = model.getDocumentElement().getFirstChild().getNextSibling();
		child = child.getFirstChild();
		
		while(child.getNextSibling() != null) { // Iterate over XML nodes
			child = child.getNextSibling();
			
			if(child.getNodeName().equals("#text")) // Skip text nodes
				continue;
			
			Node name = child.getAttributes().getNamedItem("name");
			if(name != null)
				// If we have found the local cloud tag
				if(localClouds.contains(name.getNodeValue())) {
					child = child.getFirstChild(); // Update the node
					continue;
				}
			
			Node aggregation = child.getAttributes().getNamedItem("aggregation");
			
			if(aggregation != null)
				// If we have found the deployed entity tag
				if(aggregation.getNodeValue().equals("shared"))
					deployedEntityID.put( // Save the system identifier
							child.getAttributes().getNamedItem("name").getNodeValue(), 
							child.getAttributes().getNamedItem("xmi:id").getNodeValue());
		}
		
		
		// ############################################################################################################
		
		
		// Parse XML Document (UML Notation)
		String notationPath = modelPath.split(".uml")[0] + ".notation";
		Document notation = builder.parse(new InputSource(notationPath));
		
		child = notation.getDocumentElement().getFirstChild();
		ArrayList<Node> compositeStructures = new ArrayList<Node>(); // Local Clouds
		
		while(child.getNextSibling() != null) { // Iterate over XML nodes
			child = child.getNextSibling();
			
			if(child.getNodeName().equals("#text")) // Skip text nodes
				continue;
			
			if(child.getAttributes().getNamedItem("type") != null)
				// If we have found the local cloud tag
				if(child.getAttributes().getNamedItem("type").getNodeValue().equals("CompositeStructure"))
					compositeStructures.add(child);
		}

		// UML Notation Deployed Entity Identifier
		HashMap<String, Node> classShapeID = new HashMap<String, Node>();
		
		for(Node compositeStructure : compositeStructures) { // For each local cloud
			child = compositeStructure.getFirstChild().getNextSibling();
			
			Node propertyNode = null;
			
			while(child.getNextSibling() != null) { // Iterate over XML nodes
				child = child.getNextSibling();
				
				if(child.getNodeName().equals("#text"))
					continue;
				
				if(child.getAttributes().getNamedItem("type") != null) {
					String type = child.getAttributes().getNamedItem("type").getNodeValue();
					
					// If we have found the local cloud parent
					if(type.equals("Class_StructureCompartment") || type.equals("Class_Shape"))
						child = child.getFirstChild();
					
					// If we have found the deployed entity parent
					else if(type.equals("Property_Shape")) {
						propertyNode = child;
						child = child.getFirstChild();
					}
				}
				
				// If we have found a deployed entity
				else if(child.getAttributes().getNamedItem("xmi:type") != null && child.getAttributes().getNamedItem("href") != null) {
					String xmiType = child.getAttributes().getNamedItem("xmi:type").getNodeValue();
					String[] href = child.getAttributes().getNamedItem("href").getNodeValue().split("#");
				
					// If the local cloud is registered in the UML model
					if(xmiType.equals("uml:Property") && localClouds.contains(href[0].split(".uml")[0])) { // example-cloud.uml#ID
						classShapeID.put(href[1], propertyNode); // Save the UML Notation ID
						child = child.getParentNode().getNextSibling(); // Continue to the next deployed entity
					}
				}
			}	
		}

		for(String deployedEntity : deployedEntityID.keySet()) // For each deployed entity in the UML Model
			// Set color to red if not registered in the database, else set color to green
			
			// Color == Attribute in Notation XML node
			// deployedEntity == Name in UML Model Node
			
			((Element)classShapeID.get(deployedEntityID.get(deployedEntity))).setAttribute("fillColor",
					nonSavedSystems.contains(deployedEntity) ? "10265827" : "10011046");
		
		Transformer transformer = TransformerFactory.newInstance().newTransformer();
		Result output = new StreamResult(new File(notationPath));
		Source input = new DOMSource(notation);
		
		transformer.transform(input, output); // Save Notation XML file
	}
	
}
