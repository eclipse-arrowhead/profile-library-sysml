package deployment.systems.handlers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Properties;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;
import org.eclipse.swt.widgets.Shell;

import common.dialog.ProjectSelectWindow;
import common.dto.APXInterfaceDesignDescription;
import common.dto.APXLocalCloudDesignDescription;
import common.parsing.model.ParsingSetup;
import common.parsing.workspace.ParsingUtils;
import common.utils.CodgenUtil;
import common.utils.ExecutionUtils;
import deployment.systems.generator.ApplicationProperties;
import deployment.systems.generator.ConsumerAppList;
import deployment.systems.generator.ConsumerMain;
import deployment.systems.generator.ProviderMain;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.window.Window;

import org.apache.commons.io.FileUtils;

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
	private String name = "";
	private String language = ""; // TODO Not Used
	private String disk = "";
	private String[] selectedSys = null;
	private int selectedLC;
	private String os = "";
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

			ArrayList<APXInterfaceDesignDescription> interfaces =
					new ArrayList<APXInterfaceDesignDescription> (ParsingSetup.modelInterfaceDescriptionMap.values());
			ArrayList<APXLocalCloudDesignDescription> localClouds = new ArrayList<APXLocalCloudDesignDescription>(ParsingSetup.modelLocalCloudMap.values());

			System.out.println(interfaces);
			System.out.println(localClouds);
			
			// Display Local Clouds and open a dialog window
			DialogWindow dialog = new DialogWindow(shell);
			dialog.setWorkDirectory(workspace);
			dialog.setLocalClouds(localClouds);

			if (dialog.open() == Window.OK) {

				if (!dialog.getBadDirectory()) {

					// Obtain information from dialog window
					directory = dialog.getDirectory();
					name = ParsingUtils.toKebabCase(dialog.getName());
					selectedSys = dialog.getSelectedSys();
					selectedLC = dialog.getSelectedLC();
					disk = dialog.getDisk();
					os = dialog.getOs();
					
					// Obtain selected local cloud and the associated connections
					APXLocalCloudDesignDescription localCloud= localClouds.get(selectedLC);

					final ClassLoader oldContextClassLoader = Thread.currentThread().getContextClassLoader();
					Thread.currentThread().setContextClassLoader(ScriptDeployment.class.getClassLoader());

					if (!(directory == null || directory.isEmpty())) {
						
						// Initialise Velocity Engine
						VelocityEngine velocityEngine = new VelocityEngine();
						velocityEngine.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
						velocityEngine.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
						velocityEngine.init();

						// Maven pom file generation
						Template tpom = velocityEngine.getTemplate("templates/general/pom.vm");
						VelocityContext context = new VelocityContext();
						context.put("name", name);
						context.put("outputDirectory", directory);

						VelocityContext contextpom = new VelocityContext();
						contextpom.put("name", name);
						String modules = "";
						String folders = "";
						String type = "";

						ParsingUtils.newFolder(directory, "arrowhead");
						ParsingUtils.newFolder(directory + "/arrowhead/", name);
						ParsingUtils.newFolder(directory + "/arrowhead/" + name + "/", "cloud-systems");
						
						for (String system : selectedSys) { // For each of the systems
							String kebabCaseSystem = ParsingUtils.toKebabCase(system);
							
							// Identify its type (provider/consumer/both)
							type = localCloud.getDeployedEntities().get(kebabCaseSystem).getSysDD().getRole().contains("Provider") ?
									"-provider" : "-consumer";
							
							modules = modules + "    <module>" + kebabCaseSystem + type + "</module>\r\n";
							folders = os.equalsIgnoreCase("linux") || os.equalsIgnoreCase("mac") 
									? folders + "mkdir " + kebabCaseSystem + type + "\n"
									: folders + "mkdir " + kebabCaseSystem + type + "\r\n";
						}
						
						context.put("createFolders", folders);
						contextpom.put("modules", modules);
						
						String scriptPath = "";
						
						// Generation of the temporal folder
						FileUtils.forceMkdir(new File(workspace + File.separator +".temp"+File.separator));	
						
						// Generation of the consumer resources folder
						FileUtils.forceMkdir(new File(workspace + File.separator +".temp"+ File.separator +"resources"+ File.separator +"consumer"+ File.separator +"src"+ File.separator +"main"+ File.separator +"java"+ File.separator +"eu"+ File.separator +"arrowhead"+File.separator));
						FileUtils.forceMkdir(new File(workspace + File.separator +".temp"+ File.separator +"resources"+ File.separator +"consumer"+ File.separator +"src"+ File.separator +"main"+ File.separator +"resources"+ File.separator +"certificates"+File.separator));
						FileUtils.forceMkdir(new File(workspace + File.separator +".temp"+ File.separator +"resources"+ File.separator +"consumer"+ File.separator +"src"+ File.separator +"main"+ File.separator +"resources"+ File.separator +"META-INF"+File.separator));
						
						FileUtils.copyURLToFile(
								this.getClass().getResource("/resources/consumer/.classpath"), 
								new File(workspace + File.separator +".temp"+ File.separator +"resources"+ File.separator +"consumer"+ File.separator +".classpath"));
						
						FileUtils.copyURLToFile(
								this.getClass().getResource("/resources/consumer/src/main/resources/info.txt"), 
								new File(workspace + File.separator +".temp"+ File.separator +"resources"+ File.separator +"consumer"+ File.separator +"src"+ File.separator +"main"+ File.separator +"resources"+ File.separator +"info.txt"));

						FileUtils.copyURLToFile(
								this.getClass().getResource("/resources/consumer/src/main/resources/META-INF/additional-spring-configuration-metadata.json"), 
								new File(workspace + File.separator +".temp"+ File.separator +"resources"+ File.separator +"consumer"+ File.separator +"src"+ File.separator +"main"+ File.separator +"resources"+ File.separator +"META-INF"+ File.separator +"additional-spring-configuration-metadata.json"));
						
						// Generation of the provider resources folder
						FileUtils.forceMkdir(new File(workspace + File.separator +".temp"+ File.separator +"resources"+ File.separator +"provider"+ File.separator +"src"+ File.separator +"main"+ File.separator +"java"+ File.separator +"eu"+ File.separator +"arrowhead"+File.separator));
						FileUtils.forceMkdir(new File(workspace + File.separator +".temp"+ File.separator +"resources"+ File.separator +"provider"+ File.separator +"src"+ File.separator +"main"+ File.separator +"resources"+ File.separator +"certificates"+File.separator));
						FileUtils.forceMkdir(new File(workspace + File.separator +".temp"+ File.separator +"resources"+ File.separator +"provider"+ File.separator +"src"+ File.separator +"main"+ File.separator +"resources"+ File.separator +"META-INF"+File.separator));

						FileUtils.copyURLToFile(
								this.getClass().getResource("/resources/provider/.classpath"), 
								new File(workspace + File.separator +".temp"+ File.separator +"resources"+ File.separator +"provider"+ File.separator +".classpath"));
						
						FileUtils.copyURLToFile(
								this.getClass().getResource("/resources/provider/.springBeans"), 
								new File(workspace + File.separator +".temp"+ File.separator +"resources"+ File.separator +"provider"+ File.separator +".springBeans"));
						
						FileUtils.copyURLToFile(
								this.getClass().getResource("/resources/provider/src/main/resources/info.txt"), 
								new File(workspace + File.separator +".temp"+ File.separator +"resources"+ File.separator +"provider"+ File.separator +"src"+ File.separator +"main"+ File.separator +"resources"+ File.separator +"info.txt"));
						
						FileUtils.copyURLToFile(
								this.getClass().getResource("/resources/provider/src/main/resources/META-INF/additional-spring-configuration-metadata.json"), 
								new File(workspace + File.separator +".temp"+ File.separator +"resources"+ File.separator +"provider"+ File.separator +"src"+ File.separator +"main"+ File.separator +"resources"+ File.separator +"META-INF"+ File.separator +"additional-spring-configuration-metadata.json"));
						
						try {
							
							
							///*************** MAC/LINUX *****************************************************//

							if (os.equalsIgnoreCase("linux") || os.equalsIgnoreCase("mac")) { // Linux Folder Generation
								scriptPath = workspace + File.separator +".temp" +File.separator+"folderGenUnix.sh";
								System.out.println(scriptPath);
								
								Template t = velocityEngine.getTemplate("templates/general/folderGenUnix.vm");
								Writer writer = new FileWriter(scriptPath);
								context.put("workspace", workspace);
								t.merge(context, writer);
								writer.flush();
								writer.close();

								ExecutionUtils.executesh(workspace + File.separator +".temp" +File.separator, "folderGenUnix");
							} 
							
							
							
							///*************** WINDOWS *****************************************************//
							
							else { // Windows Folder Generation
								scriptPath = workspace + File.separator +".temp"+ File.separator +"folderGenWin.bat";
								
								Writer writer = new FileWriter(scriptPath);
								Template t = velocityEngine.getTemplate("templates/general/folderGenWin.vm");
								context.put("workspace", workspace);
								context.put("disk", disk);
								t.merge(context, writer);
								writer.flush();
								writer.close();

								ExecutionUtils.executebat(scriptPath);
							}
							///********************************************************************//

							String kebabCaseSystem = ParsingUtils.toKebabCase(selectedSys[selectedSys.length - 1]);
							
							// While the local cloud directory hasn't been created wait
							System.out.println(directory + File.separator +"arrowhead" + File.separator + name + File.separator + "cloud-systems" + File.separator + kebabCaseSystem + type + File.separator);
							while (!new File(directory + File.separator +"arrowhead" + File.separator + name + File.separator + "cloud-systems" + File.separator + kebabCaseSystem + type + File.separator ).exists()) {}

							Writer writerpom = new FileWriter(new File(directory + File.separator +"arrowhead"+File.separator + name + File.separator +"cloud-systems"+ File.separator +"pom.xml"));
							tpom.merge(contextpom, writerpom);
							writerpom.flush();
							writerpom.close();
							
							// Project file generation
							Template tProject = velocityEngine.getTemplate("templates/general/cloudProject.vm");
							VelocityContext projectContext = new VelocityContext();
							projectContext.put("name", dialog.getName());
							Writer writerProject = new FileWriter(new File(directory + File.separator +"arrowhead"+File.separator + name + File.separator +"cloud-systems"+ File.separator +".project"));
							tProject.merge(projectContext, writerProject);
							writerProject.flush();
							writerProject.close();
							
							for (int j = 0; j < selectedSys.length; j++) {
								
								kebabCaseSystem = ParsingUtils.toKebabCase(selectedSys[j]);
								
								// If the system is a PROVIDER
								if (localCloud.getDeployedEntities().get(kebabCaseSystem).getSysDD().getRole().equals("Provider")) {
									
									String port = "";
									for(Entry<String, ArrayList<APXLocalCloudDesignDescription.APXConnector>> connection : localCloud.getConnectors().entrySet())
										if(connection.getKey().split(":")[0].toLowerCase().contains(kebabCaseSystem.toLowerCase())) {
											port = connection.getValue().get(0).getProviderPort();
											break;
										}
									
									
									// Maven pom file generation
									Template tpomPro = velocityEngine.getTemplate("templates/general/pomProvider.vm");
									VelocityContext contextpomPro = new VelocityContext();
									contextpomPro.put("name", name);
									contextpomPro.put("sysName", kebabCaseSystem);
									Writer writerpomPro = new FileWriter(new File(directory + File.separator +"arrowhead"+File.separator + name + File.separator +"cloud-systems"+File.separator + kebabCaseSystem + "-provider"+ File.separator +"pom.xml"));
									tpomPro.merge(contextpomPro, writerpomPro);
									writerpomPro.flush();
									writerpomPro.close();

									// Folder Structure Generation
									VelocityContext contextFoldPro = new VelocityContext();
									contextFoldPro.put("outputDirectory", directory);
									contextFoldPro.put("name", name);
									contextFoldPro.put("disk", disk);
									contextFoldPro.put("workspace", workspace);
									contextFoldPro.put("sysName", kebabCaseSystem);
									
									///*************** MAC/LINUX *****************************************************//

									if (os.equalsIgnoreCase("linux") || os.equalsIgnoreCase("mac")) { // Linux Provider Folder Generation
										scriptPath = workspace + File.separator +".temp" +File.separator + kebabCaseSystem + "ProviderStructure.sh";
										System.out.println(scriptPath);
										
										Writer writerFoldPro = new FileWriter(new File(scriptPath));
										Template tFoldPro = velocityEngine.getTemplate("templates/provider/structureUnix.vm");
										tFoldPro.merge(contextFoldPro, writerFoldPro);
										writerFoldPro.flush();
										writerFoldPro.close();
										
										ExecutionUtils.executesh(workspace + File.separator +".temp" +File.separator, kebabCaseSystem + "ProviderStructure");
									} 
									
									
									///*************** WINDOWS *****************************************************//
									
									else { // Windows Provider Folder Generation
										scriptPath = workspace + File.separator +".temp"+File.separator + kebabCaseSystem + "ProviderStructure.bat";
										
										contextFoldPro.put("disk", disk);
										Writer writerFoldPro = new FileWriter(new File(scriptPath));
										Template tFoldPro = velocityEngine.getTemplate("templates/provider/structureWin.vm");
										tFoldPro.merge(contextFoldPro, writerFoldPro);
										writerFoldPro.flush();
										writerFoldPro.close();
										
										ExecutionUtils.executebat(scriptPath);
									}
									///********************************************************************//
									
									while (!new File(directory + File.separator +"arrowhead" + File.separator + name + File.separator + "cloud-systems" + File.separator +  kebabCaseSystem + "-provider" + File.separator +"src" + File.separator +"main" + File.separator +"java" + File.separator +"eu" + File.separator +"arrowhead" + File.separator +"provider" + File.separator +"dto" + File.separator ).exists()) {}
									
									// Project file generation
									tProject = velocityEngine.getTemplate("templates/general/systemProject.vm");
									projectContext.put("name", selectedSys[j] + "Provider");
									writerProject = new FileWriter(new File(directory + File.separator +"arrowhead"+File.separator + name + File.separator +"cloud-systems"+File.separator + kebabCaseSystem + "-provider"+ File.separator +".project"));
									tProject.merge(projectContext, writerProject);
									writerProject.flush();
									writerProject.close();
									
									// Generate the Provider Main
									ProviderMain.generateProviderMain(directory, name, selectedSys[j], localCloud.getDeployedEntities());
									// Generate the Application Properties
									ApplicationProperties.GenerateAppProperties(directory, name, kebabCaseSystem + "-provider", "provider", port);

									// Security files generation
									VelocityContext contextSecurity = new VelocityContext();
									Writer writerSecurity1 = new FileWriter(new File(directory + File.separator +"arrowhead"+File.separator + name + File.separator +"cloud-systems"+File.separator + kebabCaseSystem + "-provider"+ File.separator +"src"+ File.separator +"main"+ File.separator +"java"+ File.separator +"eu"+ File.separator +"arrowhead"+ File.separator +"provider"+ File.separator +"security"+ File.separator +"ProviderTokenSecurityFilter.java"));
									Template tsec1 = velocityEngine.getTemplate("templates/provider/tokenSecurityFilter.vm");
									tsec1.merge(contextSecurity, writerSecurity1);
									writerSecurity1.flush();
									writerSecurity1.close();

									Writer writerSecurity2 = new FileWriter(new File(directory + File.separator +"arrowhead"+File.separator + name + File.separator +"cloud-systems"+File.separator + kebabCaseSystem + "-provider"+ File.separator +"src"+ File.separator +"main"+ File.separator +"java"+ File.separator +"eu"+ File.separator +"arrowhead"+ File.separator +"provider"+ File.separator +"security"+ File.separator +"ProviderSecurityConfig.java"));
									Template tsec2 = velocityEngine.getTemplate("templates/provider/securityConfig.vm");
									tsec2.merge(contextSecurity, writerSecurity2);
									writerSecurity2.flush();
									writerSecurity2.close();

									Writer writerSecurity3 = new FileWriter(new File(directory + File.separator +"arrowhead"+File.separator + name + File.separator +"cloud-systems"+File.separator + kebabCaseSystem + "-provider"+ File.separator +"src"+ File.separator +"main"+ File.separator +"java"+ File.separator +"eu"+ File.separator +"arrowhead"+ File.separator +"provider"+ File.separator +"security"+ File.separator +"ProviderAccessControlFilter.java"));
									Template tsec3 = velocityEngine.getTemplate("templates/provider/accessControlFilter.vm");
									tsec3.merge(contextSecurity, writerSecurity3);
									writerSecurity3.flush();
									writerSecurity3.close();

								} 
								
								// If the system is a provider/consumer
								else if (localCloud.getDeployedEntities().get(kebabCaseSystem).getSysDD().getRole().equals("ProviderConsumer")) {
									
									String port = "";
									for(Entry<String, ArrayList<APXLocalCloudDesignDescription.APXConnector>> connection : localClouds.get(selectedLC).getConnectors().entrySet())
										if(connection.getKey().toLowerCase().contains(kebabCaseSystem.toLowerCase() + ":")) { // Provider behavior
											port = connection.getValue().get(0).getProviderPort();
											break;
										}
										else if (connection.getKey().toLowerCase().contains(":" + kebabCaseSystem.toLowerCase())) { // Consumer behavior
											port = connection.getValue().get(0).getConsumerPort();
											break;
										}
									
									// Maven pom file generation
									Template tpomPro = velocityEngine.getTemplate("templates/general/pomProvider.vm");
									VelocityContext contextpomPro = new VelocityContext();
									contextpomPro.put("name", name);
									contextpomPro.put("sysName", kebabCaseSystem);
									Writer writerpomPro = new FileWriter(new File(directory + File.separator +"arrowhead"+File.separator + name + File.separator +"cloud-systems"+File.separator + kebabCaseSystem + "-provider"+ File.separator +"pom.xml"));
									tpomPro.merge(contextpomPro, writerpomPro);
									writerpomPro.flush();
									writerpomPro.close();

									// Folder Structure Generation
									VelocityContext contextFoldPro = new VelocityContext();
									contextFoldPro.put("outputDirectory", directory);
									contextFoldPro.put("name", name);
									contextFoldPro.put("disk", disk);
									contextFoldPro.put("workspace", workspace);
									contextFoldPro.put("sysName", kebabCaseSystem);
									
									///*************** MAC/LINUX *****************************************************//

									if (os.equalsIgnoreCase("linux") || os.equalsIgnoreCase("mac")) { // Linux Provider/Consumer Folder Generation
										scriptPath = workspace + File.separator +".temp"+File.separator + kebabCaseSystem + "ProviderStructure.sh";
										
										System.out.println(scriptPath);
										Writer writerFoldPro = new FileWriter(new File(scriptPath));
										Template tFoldPro = velocityEngine.getTemplate("templates/provider/structureUnix.vm");
										tFoldPro.merge(contextFoldPro, writerFoldPro);
										writerFoldPro.flush();
										writerFoldPro.close();
										
										ExecutionUtils.executesh(workspace + File.separator +".temp"+File.separator, kebabCaseSystem + "ProviderStructure");
									} 
									
									///*************** WINDOWS *****************************************************//
									
									else { // Windows Provider/Consumer Folder Generation
										scriptPath = workspace + File.separator +".temp"+File.separator + kebabCaseSystem + "ProviderStructure.bat";
										
										contextFoldPro.put("disk", disk);
										Writer writerFoldPro = new FileWriter(new File(scriptPath));
										Template tFoldPro = velocityEngine.getTemplate("templates/provider/structureWin.vm");
										tFoldPro.merge(contextFoldPro, writerFoldPro);
										writerFoldPro.flush();
										writerFoldPro.close();
										ExecutionUtils.executebat(scriptPath);
									}
									
									///********************************************************************//

									// While the provider/consumer directories haven't been created wait
									while (!new File(directory + File.separator +"arrowhead"+File.separator + name + File.separator +"cloud-systems"+File.separator + kebabCaseSystem + "-provider"+ File.separator +"src"+ File.separator +"main"+ File.separator +"java"+ File.separator +"eu"+ File.separator +"arrowhead"+ File.separator +"provider"+ File.separator +"dto"+File.separator).exists()) {}
					
									// Project file generation
									tProject = velocityEngine.getTemplate("templates/general/systemProject.vm");
									projectContext.put("name", selectedSys[j] + "ProviderConsumer");
									writerProject = new FileWriter(new File(directory + File.separator +"arrowhead"+File.separator + name + File.separator +"cloud-systems"+File.separator + kebabCaseSystem + "-provider"+ File.separator +".project"));
									tProject.merge(projectContext, writerProject);
									writerProject.flush();
									writerProject.close();

									// Generate Provider/Consumer Main
									ProviderMain.generateProvConsMain(directory, name, selectedSys[j], localCloud.getDeployedEntities());
									// Generate Application Properties
									ApplicationProperties.GenerateAppProperties(directory, name, kebabCaseSystem + "-provider", "provider-consumer", port);
									
									// Security files generation
									VelocityContext contextSecurity = new VelocityContext();
									Writer writerSecurity1 = new FileWriter(new File(directory + File.separator +"arrowhead"+File.separator + name + File.separator +"cloud-systems"+File.separator + kebabCaseSystem + "-provider"+ File.separator +"src"+ File.separator +"main"+ File.separator +"java"+ File.separator +"eu"+ File.separator +"arrowhead"+ File.separator +"provider"+ File.separator +"security"+ File.separator +"ProviderTokenSecurityFilter.java"));
									Template tsec1 = velocityEngine.getTemplate("templates/provider/tokenSecurityFilter.vm");
									tsec1.merge(contextSecurity, writerSecurity1);
									writerSecurity1.flush();
									writerSecurity1.close();

									Writer writerSecurity2 = new FileWriter(new File(directory + File.separator +"arrowhead"+File.separator + name + File.separator +"cloud-systems"+File.separator + kebabCaseSystem + "-provider"+ File.separator +"src"+ File.separator +"main"+ File.separator +"java"+ File.separator +"eu"+ File.separator +"arrowhead"+ File.separator +"provider"+ File.separator +"security"+ File.separator +"ProviderSecurityConfig.java"));
									Template tsec2 = velocityEngine.getTemplate("templates/provider/securityConfig.vm");
									tsec2.merge(contextSecurity, writerSecurity2);
									writerSecurity2.flush();
									writerSecurity2.close();

									Writer writerSecurity3 = new FileWriter(new File(directory + File.separator +"arrowhead"+File.separator + name + File.separator +"cloud-systems"+File.separator + kebabCaseSystem + "-provider"+ File.separator +"src"+ File.separator +"main"+ File.separator +"java"+ File.separator +"eu"+ File.separator +"arrowhead"+ File.separator +"provider"+ File.separator +"security"+ File.separator +"ProviderAccessControlFilter.java"));
									Template tsec3 = velocityEngine.getTemplate("templates/provider/accessControlFilter.vm");
									tsec3.merge(contextSecurity, writerSecurity3);
									writerSecurity3.flush();
									writerSecurity3.close();
								} 
								
								// If the system is a consumer
								else {
									
									String port = "";
									for(Entry<String, ArrayList<APXLocalCloudDesignDescription.APXConnector>> connection : localClouds.get(selectedLC).getConnectors().entrySet())
										if(connection.getKey().split(":")[1].toLowerCase().contains(kebabCaseSystem.toLowerCase())) {
											port = connection.getValue().get(0).getConsumerPort();
											break;
										}
									
									// Maven pom file generation
									Template tpomcon = velocityEngine.getTemplate("templates/general/pomConsumer.vm");
									VelocityContext contextpomCons = new VelocityContext();
									contextpomCons.put("name", name);
									contextpomCons.put("sysName", kebabCaseSystem);
									Writer writerpomCons = new FileWriter(new File(directory + File.separator +"arrowhead"+File.separator + name + File.separator +"cloud-systems"+File.separator + kebabCaseSystem + "-consumer"+ File.separator +"pom.xml"));
									tpomcon.merge(contextpomCons, writerpomCons);
									writerpomCons.flush();
									writerpomCons.close();

									// Folder Structure Generation
									VelocityContext contextFoldCon = new VelocityContext();
									contextFoldCon.put("outputDirectory", directory);
									contextFoldCon.put("name", name);
									contextFoldCon.put("disk", disk);
									contextFoldCon.put("workspace", workspace);
									contextFoldCon.put("sysName", kebabCaseSystem);
									
									///*************** MAC/LINUX *****************************************************//

									if (os.equalsIgnoreCase("linux") || os.equalsIgnoreCase("mac")) { // Linux Consumer Folder Generation
										scriptPath = workspace + File.separator +".temp"+File.separator + kebabCaseSystem + "ConsumerStructure.sh";
										
										Template tFoldCon = velocityEngine.getTemplate("templates/consumer/structureUnix.vm");
										Writer writerFoldCon = new FileWriter(new File(scriptPath));
										tFoldCon.merge(contextFoldCon, writerFoldCon);
										writerFoldCon.flush();
										writerFoldCon.close();
								
										ExecutionUtils.executesh(workspace + File.separator +".temp"+File.separator, kebabCaseSystem + "ConsumerStructure");
										
										///*************** WINDOWS *****************************************************//
										
									} else { // Windows Consumer Folder Generation
										scriptPath = workspace + File.separator +".temp"+File.separator + kebabCaseSystem + "ConsumerStructure.bat";
										
										Template tFoldCon = velocityEngine.getTemplate("templates/consumer/structureWin.vm");
										Writer writerFoldCon = new FileWriter(new File(scriptPath));
										contextFoldCon.put("disk", disk);
										tFoldCon.merge(contextFoldCon, writerFoldCon);
										writerFoldCon.flush();
										writerFoldCon.close();
										
										ExecutionUtils.executebat(scriptPath);
									}
									
									///********************************************************************//
									

									// While the provider/consumer directories haven't been created wait
									while (!new File(directory + File.separator +"arrowhead"+File.separator + name + File.separator +"cloud-systems"+File.separator + kebabCaseSystem + "-consumer"+ File.separator +"src"+ File.separator +"main"+ File.separator +"java"+ File.separator +"eu"+ File.separator +"arrowhead"+ File.separator +"consumer"+File.separator).exists()) {}
									
									// Project file generation
									tProject = velocityEngine.getTemplate("templates/general/systemProject.vm");
									projectContext.put("name", selectedSys[j] + "Consumer");
									writerProject = new FileWriter(new File(directory + File.separator +"arrowhead"+File.separator + name + File.separator +"cloud-systems"+File.separator + kebabCaseSystem + "-consumer"+ File.separator +".project"));
									tProject.merge(projectContext, writerProject);
									writerProject.flush();
									writerProject.close();
									
									// Generate Application Listener
									ConsumerAppList.GenerateAppList(directory, name, kebabCaseSystem + "-consumer");
									// Generate Consumer Main
									ConsumerMain.generateConsumerMain(directory, name, selectedSys[j], localCloud.getDeployedEntities());
									// Generate Application Properties
									ApplicationProperties.GenerateAppProperties(directory, name, kebabCaseSystem + "-consumer", "consumer", port);
								}
							}
						
							FileUtils.forceDelete(new File(workspace + File.separator +".temp"+File.separator));
						} catch (IOException e) {
							e.printStackTrace();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}

					} else // If the directory is not valid show dialog window again
						dialog.open();

					// Set back default class loader
					Thread.currentThread().setContextClassLoader(oldContextClassLoader);

				}
			}
		}
	}
}
