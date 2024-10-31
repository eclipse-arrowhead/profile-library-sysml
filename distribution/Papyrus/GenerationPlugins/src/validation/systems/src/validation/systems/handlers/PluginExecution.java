package validation.systems.handlers;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Properties;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.util.UMLUtil;

import common.dialog.ProjectSelectWindow;
import common.dto.APXDeployedEntity;
import common.dto.APXInterfaceDesignDescription;
import common.dto.APXLocalCloudDesignDescription;
import common.dto.APXSystemDesignDescription;
import common.parsing.model.DefinitionParser;
import common.parsing.model.PhysicalParser;
import common.parsing.workspace.ParsingUtils;
import common.utils.CodgenUtil;
import common.utils.ExecutionUtils;
import validation.systems.modelling.DefinitionModeller;
import validation.systems.modelling.PhysicalModeller;

import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCLoudDesignDescription;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysDD;

/**
 * 
 * The main function coordinates the parsing from workspace and model, the addition and update checking and the modelling of the 
 * new .uml file. There are two approaches to this implementation, the static approach consists of selecting a certain model and 
 * its relative code and perform the analysis whereas the dynamic approach generates a task that periodically will update 
 * the model.
 * 
 * @author fernand0labra
 *
 */
public class PluginExecution {
	
	//=================================================================================================
	// attributes
	
	// Configuration parameters of runtime-EclipseApplication
	private static Properties configuration = CodgenUtil.getProperties("WorkSpaceConfiguration");
	private String workspace = configuration.getProperty("workspace");

	
	//=================================================================================================
	// methods
	
	//-------------------------------------------------------------------------------------------------
	@Execute
	public void execute(Shell shell) throws Exception { 

		// ************************************************************************************************ //
		//										Pre-processing Steps										//
		// ************************************************************************************************ //

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
		else // If there is no project
			throw new Exception("The selected project does not have an .uml file.");

		Object objectModel = common.parsing.model.ParsingSetup.parseModel(modelPath);
		
		// Save the stereotypes for block modelling
		PhysicalModeller.localCloudDescriptionStereotypeList = common.parsing.model.ParsingSetup.packageLocalCloudDescriptionMap.
				values().iterator().next().getAppliedStereotypes();
		// Save the stereotypes for block modelling
		DefinitionModeller.systemDescriptionStereotypeList = common.parsing.model.ParsingSetup.packageSystemDescriptionMap.
				values().iterator().next().getAppliedStereotypes();
		// Save the stereotypes for block modelling
		DefinitionModeller.interfaceDescriptionStereotypeList = common.parsing.model.ParsingSetup.packageInterfaceDescriptionMap.
				values().iterator().next().getAppliedStereotypes();
		
		common.parsing.workspace.ParsingSetup.parseWorkspace(workspace + File.separator + "Tests"+ File.separator +"arrowhead"+File.separator ); //TODO ask for the directory. Now it is hard-coded
		System.out.println(workspace + File.separator + "Tests"+ File.separator +"arrowhead"+File.separator );
		System.out.println(common.parsing.workspace.ParsingSetup.workspaceLocalCloudMap); // TODO Remove trace
		System.out.println(common.parsing.model.ParsingSetup.modelLocalCloudMap); // TODO Remove trace
		
		// ************************************************************************************************ //
		//								 	 Definition Additions Check										//
		// ************************************************************************************************ //
		
		HashMap<String, APXSystemDesignDescription> modelSystemMap = common.parsing.model.ParsingSetup.modelSystemDescriptionMap;
		HashMap<String, APXSystemDesignDescription> workspaceSystemMap = common.parsing.workspace.ParsingSetup.workspaceSystemDescriptionMap;
		
		HashMap<String, APXInterfaceDesignDescription> modelInterfaceMap = common.parsing.model.ParsingSetup.modelInterfaceDescriptionMap;
		HashMap<String, APXInterfaceDesignDescription> workspaceInterfaceMap = common.parsing.workspace.ParsingSetup.workspaceInterfaceDescriptionMap;
		
		HashMap<String, APXLocalCloudDesignDescription> modelLocalCloudMap = common.parsing.model.ParsingSetup.modelLocalCloudMap;
		HashMap<String, APXLocalCloudDesignDescription> workspaceLocalCloudMap = common.parsing.workspace.ParsingSetup.workspaceLocalCloudMap;
		
		// Interface Design Description
		for (String interfaceName : workspaceInterfaceMap.keySet()){ // For each interface design description in the workspace
			if(modelInterfaceMap.get(interfaceName) == null) // If the workspace interface is not in the model
				// Create a packageable element from the workspace object
				common.parsing.model.ParsingSetup.packageInterfaceDescriptionMap.put(
						interfaceName,
						DefinitionModeller.addInterfaceDesignDescription(workspaceInterfaceMap.get(interfaceName), (Model) objectModel));
				
				APXInterfaceDesignDescription newInterface = workspaceInterfaceMap.get(interfaceName);
				
				// Save the workspace Interface Design Description object
				modelInterfaceMap.put(interfaceName, newInterface);
				common.parsing.model.ParsingSetup.modelInterfaceDescriptionMap.put(newInterface.getName(), newInterface);
			}
		
		// System Design Description
		for(String systemName : workspaceSystemMap.keySet()) { // For each system design description in the workspace
			if(modelSystemMap.get(systemName) == null) { // If the workspace system is not in the model
				// Create a packageable element from the workspace object
				common.parsing.model.ParsingSetup.packageSystemDescriptionMap.put(
						systemName,
						DefinitionModeller.addSystemDesignDescription(workspaceSystemMap.get(systemName), (Model) objectModel));
				
				APXSystemDesignDescription newSystem = workspaceSystemMap.get(systemName);
				
				// Save the workspace System Design Description object
				modelSystemMap.put(systemName, newSystem);
				common.parsing.model.ParsingSetup.modelSystemDescriptionMap.put(newSystem.getName(), newSystem);
			}
				
		}
		
		// Local Cloud
		for(String localCloudName : workspaceLocalCloudMap.keySet()) { // For each local cloud design description in the workspace
			if(modelLocalCloudMap.get(localCloudName) == null) { // If the workspace local cloud is not in the model
				// Create a packageable element from the workspace object
				common.parsing.model.ParsingSetup.packageLocalCloudDescriptionMap.put(
						localCloudName,
						PhysicalModeller.addLocalCloud(workspaceLocalCloudMap.get(localCloudName), (Model) objectModel));
				
				// Save the workspace Local Cloud Description Object
				APXLocalCloudDesignDescription workspaceLocalCloud = workspaceLocalCloudMap.get(localCloudName);
				common.parsing.model.ParsingSetup.modelLocalCloudMap.put(workspaceLocalCloud.getName(), workspaceLocalCloud);
			}
		}
		
		// ************************************************************************************************ //
		//									  Definition Update Check										//
		// ************************************************************************************************ //
		
		// TODO Currently assumed that there is the same number of local clouds
		for(String localCloudName : workspaceLocalCloudMap.keySet()) { // For each local cloud in the workspace
			APXLocalCloudDesignDescription modelLocalCloud = modelLocalCloudMap.get(localCloudName);
			APXLocalCloudDesignDescription workspaceLocalCloud = workspaceLocalCloudMap.get(localCloudName);		
			
			for(String entityName : workspaceLocalCloud.getDeployedEntities().keySet()) { // For each deployed entity in the workspace
				APXDeployedEntity workspaceEntity = workspaceLocalCloud.getDeployedEntities().get(entityName);
				
				// If the deployed entity is not in the model
				if(modelLocalCloud.getDeployedEntities().get(entityName) == null)
					// Add the deployed entity
					PhysicalModeller.addDeployedEntity(workspaceEntity, (Model) objectModel);
				
				else {
					// Check the basic attributes of the deployed entity
					APXDeployedEntity modelEntity = modelLocalCloud.getDeployedEntities().get(entityName);
					if(modelEntity.checkConsistency(workspaceEntity))
						PhysicalModeller.updateInternalDeployedEntity(workspaceEntity, null); // TODO Update basic elements of block
					
					// Check the basic attributes of the system
					APXSystemDesignDescription modelSystem = modelEntity.getSysDD();
					APXSystemDesignDescription workspaceSystem = workspaceEntity.getSysDD();
					if(modelSystem.checkConsistency(workspaceSystem))// Update internal elements of block
						DefinitionModeller.updateInternalSystemDesignDescription(workspaceSystem, common.parsing.model.ParsingSetup.packageSystemDescriptionMap.get(modelSystem.getName()));
						
					Comparator comparator = new APXInterfaceDesignDescription.InterfaceComparator();
					modelSystem.getIDDs().sort(comparator);
					workspaceSystem.getIDDs().sort(comparator);
					
					for(APXInterfaceDesignDescription workspaceInterface : workspaceSystem.getIDDs()) { // For each interface in the workspace
						// If the interface is not in the model
						if(!modelSystem.getIDDs().contains(workspaceInterface)) {							
							// Add the interface
							DefinitionModeller.updateSystemDesignDescription(workspaceSystem.getIDDs(), common.parsing.model.ParsingSetup.packageSystemDescriptionMap.get(modelSystem.getName()));
							System.out.println(workspaceInterface); // TODO Remove trace
						}
						else {
							// Check the basic attributes of the interface
							APXInterfaceDesignDescription modelInterface = modelSystem.getIDDs().get(modelSystem.getIDDs().indexOf(workspaceInterface));
							if(modelInterface.checkConsistency(workspaceInterface)) // Update internal elements of block
								DefinitionModeller.updateInternalInterfaceDesignDescription(workspaceInterface, common.parsing.model.ParsingSetup.packageInterfaceDescriptionMap.get(modelInterface.getName()));
					
							comparator = modelInterface.getOperations().get(0) . new OperationComparator();
							modelInterface.getOperations().sort(comparator);
							workspaceInterface.getOperations().sort(comparator);
							
							for(APXInterfaceDesignDescription.APXServiceDescription workspaceService : workspaceInterface.getOperations()) {
								// If the operation is not in the model
								if(!modelInterface.getOperations().contains(workspaceService))
									// Add the operation
									DefinitionModeller.updateInterfaceDesignDescription(workspaceInterface.getOperations(), common.parsing.model.ParsingSetup.packageInterfaceDescriptionMap.get(modelInterface.getName()));
								
								else {
									// Check the basic attributes of the operation
									APXInterfaceDesignDescription.APXServiceDescription modelService = modelInterface.getOperations().get(modelInterface.getOperations().indexOf(workspaceService));
									modelService.checkConsistency(workspaceService); // TODO Update basic elements of block
								}
							}
						}
					}
				}
			}
		}
		
		common.parsing.model.ParsingUtils.saveModel(((Model) objectModel));
		
		// TODO Display information tab with identified changes (Static Analysis)
		// TODO If the user selected dynamic analysis generate a periodic task for code checking

	}

}
