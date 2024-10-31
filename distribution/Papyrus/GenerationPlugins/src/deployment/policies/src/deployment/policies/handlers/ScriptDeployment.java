package deployment.policies.handlers;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Properties;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;

import common.dialog.ProjectSelectWindow;
import common.dto.APXInterfaceDesignDescription;
import common.dto.APXLocalCloudDesignDescription;
import common.parsing.model.ParsingSetup;
import common.parsing.workspace.ParsingUtils;
import common.utils.CodgenUtil;

/**
 * 
 * Generation and Execution of Scripts
 * 
 * @author cripan
 *
 */
public class ScriptDeployment {

	// =================================================================================================
	// attributes
	
	protected static Shell shell;
	private static Properties configuration = CodgenUtil.getProperties("WorkSpaceConfiguration");
	
	private String directory = "";
	private String policyType = "";
	private String disk = ""; // TODO Not Used
	private int selectedLC;
	private String workspace = configuration.getProperty("workspace");

	
	// =================================================================================================
	// methods
	
	// -------------------------------------------------------------------------------------------------
	@Execute
	public void execute(Shell shell) throws Exception {

		// Read workspace projects and show them in the dialog window
		IProject[] projects = ParsingUtils.readWorkspace();
		ProjectSelectWindow projWin = new ProjectSelectWindow(null);
		projWin.setProjects(projects);

		if (projWin.open() == Window.OK) {

			// Get selected project and display the contents
			IProject selectedProject = projWin.getSelectedProject();
			IPath projectLocation = selectedProject.getLocation();
			
			String[] projectFiles = ParsingUtils.readWorkspace(projectLocation.toString(), false);
			String selectedPathModel = "";
			
			for(String file : projectFiles)
				if(file.endsWith(".uml"))
					selectedPathModel = projectLocation.toString() + "/" + file;

			if(selectedPathModel.equals("")) // If there is no .uml file
				throw new Exception("The selected project does not have an .uml file.");

			// Read model and parse information
			ParsingSetup.parseModel(selectedPathModel);
			ArrayList<APXLocalCloudDesignDescription> localClouds = new ArrayList<APXLocalCloudDesignDescription>(ParsingSetup.modelLocalCloudMap.values());

			// Display Local Clouds and open a dialog window
			DialogWindow dialog = new DialogWindow(shell);
			dialog.setWorkDirectory(workspace);
			dialog.setLocalClouds(localClouds);

			if (dialog.open() == Window.OK) {

				if (!dialog.getBadDirectory()) {
					// Obtain information from dialog window
					directory = dialog.getDirectory();
					policyType = dialog.getPolicyType();
					selectedLC = dialog.getSelectedLC();
					disk = dialog.getDisk();
					
					final ClassLoader oldContextClassLoader = Thread.currentThread().getContextClassLoader();
					Thread.currentThread().setContextClassLoader(ScriptDeployment.class.getClassLoader());

					if (!(directory == null || directory.isEmpty())) {
						APXLocalCloudDesignDescription localCloud = localClouds.get(selectedLC);
						
						// Obtain information about selected local cloud
						String localCloudName = ParsingUtils.toKebabCase(localCloud.getName());
						ParsingUtils.newFolder(directory, "arrowhead");
						ParsingUtils.newFolder(directory + "/arrowhead/", localCloudName);
						ParsingUtils.newFolder(directory + "/arrowhead/" + localCloudName + "/", "db-rules");
						
						// Initialise Velocity Engine
						VelocityEngine velocityEngine = new VelocityEngine();
						velocityEngine.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
						velocityEngine.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
						velocityEngine.init();

						// { operationName-providerName: [serviceName, providerName, providerUrl] }
						HashMap<String, String[]> serviceMap = new HashMap<String, String[]>();
						HashSet<String> interfaceNameList = new HashSet<String>();
						
						// For each connection save the provided interfaces/services
						for(Entry<String, ArrayList<APXLocalCloudDesignDescription.APXConnector>> connector : localCloud.getConnectors().entrySet()) {
							String providerName = ParsingUtils.toKebabCase(connector.getKey().split(":")[0]);
							String interfaceName = connector.getValue().get(0).getService(); // Get provided service
							
							for(APXInterfaceDesignDescription.APXServiceDescription operation : ParsingSetup.modelInterfaceDescriptionMap.get(interfaceName).getOperations()) {
								String[] service = {
										interfaceName,
										providerName + "-provider",
										operation.getPath()
								};
								serviceMap.put(operation.getName() + "-" + providerName, service);
							}
							
							interfaceNameList.add(interfaceName); // The HashSet allows no repetition of interfaces
						}
						
						// System Registry SQL Script Generation
						if (policyType.equalsIgnoreCase("System-Service Registry")) {							
							// { systemName: [systemName, address, port] }
							HashMap<String, String[]> consumerMap = new HashMap<String, String[]>();
							HashMap<String, String[]> providerMap = new HashMap<String, String[]>();
							
							for(Entry<String, ArrayList<APXLocalCloudDesignDescription.APXConnector>> connector : localCloud.getConnectors().entrySet()) {
								String[] connectorName = connector.getKey().split(":"); // provider:consumer
								
								String providerName = connectorName[0];
								String[] provider = {
										providerName + "-provider",
										connector.getValue().get(0).getProviderAddress(),
										connector.getValue().get(0).getProviderPort()
								};
								providerMap.put(providerName, provider);	
								
								String consumerName = ParsingUtils.toKebabCase(connectorName[1]); 
								String[] consumer = {
										consumerName + "-consumer",
										connector.getValue().get(0).getConsumerAddress(),
										connector.getValue().get(0).getConsumerPort()
								};
								consumerMap.put(consumerName, consumer);		
							}
							
							// Remove provider-consumers from consumer map
							for (String provider : providerMap.keySet())
								consumerMap.remove(provider);
							
							Template t = velocityEngine.getTemplate("templates/system.vm");
							VelocityContext context = new VelocityContext();
							
							consumerMap.putAll(providerMap);
							context.put("systemList", consumerMap.values());
							context.put("interfaceNameList", interfaceNameList);
							context.put("serviceList", serviceMap.values());
									
							try {
								Writer writer = new FileWriter(directory + "/arrowhead/" + ParsingUtils.toKebabCase(localCloudName) + "/db-rules/system-service-registry.sql");
								t.merge(context, writer);
								writer.flush();
								writer.close();
							} catch (IOException e) {
								e.printStackTrace();
							}
							
						} else { // Policy Rule SQL Script Generation
							HashSet<String[]> connections = new HashSet<String[]>(); // [serviceName, providerName, consumerName, priority]
							HashMap<String, Integer> priorities = new HashMap<String, Integer>();
							
							// For each connector build a connection between provider and consumer
							for (ArrayList<APXLocalCloudDesignDescription.APXConnector> connectorList : localCloud.getConnectors().values())
								for (APXLocalCloudDesignDescription.APXConnector connector : connectorList) {
									
									Integer priority = priorities.get(connector.getService()) == null ? 1 : priorities.get(connector.getService());
									String consumerName = connector.getConsumerName();
									
									int index = 0;
									String[] serviceProviderArray = serviceMap.keySet().toArray(new String[serviceMap.size()]);
									while(index < serviceProviderArray.length && !serviceProviderArray[index].contains("-" + consumerName))
										index++;
									
									// If a the list of providers contains the system's name it is a provider, else a consumer
									String providerConsumer = index < serviceProviderArray.length ? "-provider" : "-consumer";
									
									String providerName = connector.getProviderName();
									String[] connection = {
											connector.getService(),
											providerName + "-provider",
											connector.getConsumerName() + providerConsumer,
											priority.toString()
									};
									connections.add(connection);
									
									priorities.put(connector.getService(), priority+1);
								}
							
							// Orchestration Rule SQL Script Generation
							if (policyType.equalsIgnoreCase("orchestration")) {
								
								Template t = velocityEngine.getTemplate("templates/orchstore.vm");
								VelocityContext context = new VelocityContext();
								context.put("connections", connections);
										
								try {
									Writer writer = new FileWriter(directory + "/arrowhead/" + ParsingUtils.toKebabCase(localCloudName) + "/db-rules/orchstore-rules.sql");
									t.merge(context, writer);
									writer.flush();
									writer.close();
								} catch (IOException e) {
									e.printStackTrace();
								}
							} 
							
							// Security Rule SQL Script Generation
							else if(policyType.equalsIgnoreCase("security")){ 
	
								Template t = velocityEngine.getTemplate("templates/security.vm");
								VelocityContext context = new VelocityContext();
								context.put("connections", connections);
	
								try {
									Writer writer = new FileWriter(directory + "/arrowhead/" + ParsingUtils.toKebabCase(localCloudName) + "/db-rules/security-rules.sql");
									t.merge(context, writer);
									writer.flush();
									writer.close();
								} catch (IOException e) {
									e.printStackTrace();
								}
							}
						}

					} else // If the directory is not valid show dialog window again
						dialog.open();

					// Set back default class loader
					Thread.currentThread().setContextClassLoader(oldContextClassLoader);

				} else
					System.err.println("ERROR: Directory no correct"); // TODO Remove Trace
			}
		}
	}
}
