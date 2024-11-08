package deployment.coresystems.handlers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;
import org.eclipse.swt.widgets.Shell;

import common.utils.CodgenUtil;
import common.utils.ExecutionUtils;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.window.Window;

import org.apache.commons.io.FileUtils;

/**
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
	private String os = "";
	private String disk = "";
	private String language = ""; // TODO Not Used
	private Boolean mandatorySys = false;
	private Boolean supportSys = false; // TODO Not Used
	private Boolean skipTest = false;
	private String workspace = configuration.getProperty("workspace");

	
	// =================================================================================================
	// methods

	// -------------------------------------------------------------------------------------------------
	@Execute
	public void execute(Shell shell) {

		DialogWindow dialog = new DialogWindow(shell);
		dialog.setWorkspace(workspace);
		if (dialog.open() == Window.OK) {
			if (!dialog.getBadDirectory()) {
				System.out.println("OK"); // TODO Remove Trace

				
				// Obtain parameters from dialog window
				directory = dialog.getDirectory();
				os = dialog.getOs();
				System.out.println("OS: " + os); // TODO Remove Trace
				language = dialog.getLanguage(); // TODO Not Used
				mandatorySys = dialog.getMandatorySys();
				supportSys = dialog.getSupportSys(); // TODO Not Used
				disk = dialog.getDisk();
				skipTest = dialog.getSkipTest();

				final ClassLoader oldContextClassLoader = Thread.currentThread().getContextClassLoader();
				Thread.currentThread().setContextClassLoader(ScriptDeployment.class.getClassLoader());

				if (!(directory == null || directory.isEmpty())) {
					// Initialise Velocity Engine
					VelocityEngine velocityEngine = new VelocityEngine();
					velocityEngine.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
					velocityEngine.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
					velocityEngine.init();
					
					// Select the template based on the user selection
					Template t = null;
					VelocityContext context = new VelocityContext();
					context.put("outputDirectory", directory);
					if (mandatorySys) { // If the user selected only the mandatory systems
						if (os.equalsIgnoreCase("linux") || os.equalsIgnoreCase("mac")) {
							t = velocityEngine.getTemplate("/templates/java/coreSystemsUnix.vm");
						} else {
							disk = dialog.getDisk();
							t = velocityEngine.getTemplate("/templates/java/coreSystemsWin.vm");
							context.put("disk", disk);
							context.put("version", "4.4.1");
						}
					} else { // If the user selected the mandatory and support systems
						if (os.equalsIgnoreCase("linux") || os.equalsIgnoreCase("mac")) {
							t = velocityEngine.getTemplate("/templates/java/allSystemsUnix.vm");
						} else {
							disk = dialog.getDisk();
							t = velocityEngine.getTemplate("/templates/java/allSystemsWin.vm");
							context.put("disk", disk);
							context.put("version", "4.6.0");
						}
					}
					context.put("workSpace", workspace);
					context.put("skipTest", skipTest ? "-DskipTests" : "  ");

					try {
						Writer writer = null;
						
						FileUtils.forceMkdir(new File(workspace + File.separator +".temp" +File.separator ));
						
						///*************** MAC/LINUX *****************************************************//
						
						if (os.equalsIgnoreCase("linux") || os.equalsIgnoreCase("mac")) {

							String terminal = os.equalsIgnoreCase("linux") ? "gnome-terminal" : "open -a terminal";

							// Generation of the init.sh script
							Template tInit = velocityEngine.getTemplate("/templates/initUnix.vm");
							VelocityContext contextInit = new VelocityContext();
							contextInit.put("terminal", terminal);
							Writer wInit = new FileWriter(new File(workspace + File.separator +".temp" +File.separator+"init.sh"));
							tInit.merge(contextInit, wInit);
							wInit.flush();
							wInit.close();

							// Generation of the corescript.sh
							context.put("fileEnd", "sh");
							writer = new FileWriter(new File(workspace + File.separator +".temp" +File.separator+"corescript.sh"));
							
							// Start-Stop TODO
						
						///*************** WINDOWS *****************************************************//
						} else {
							// Generation of the init.bat script
							Template tInit = velocityEngine.getTemplate("/templates/initWin.vm");
							VelocityContext contextInit = new VelocityContext();
							contextInit.put("workSpace", workspace);
							Writer wInit = new FileWriter(new File(workspace + "\\.temp\\init.bat"));
							tInit.merge(contextInit, wInit);
							wInit.flush();
							wInit.close();

							// Generation of the corescript.bat script
							context.put("fileEnd", "bat");
							writer = new FileWriter(new File(workspace + "\\.temp\\corescript.bat"));
							
							// Generation of the startCoreSystems.bat script
							Template tScripts = velocityEngine.getTemplate("/scripts/startCoreSystems.vm");
							Writer wScripts = new FileWriter(new File(workspace + "\\.temp\\startCoreSystems.bat"));
							tScripts.merge(context, wScripts);
							wScripts.flush();
							wScripts.close();
							
							// Generation of the stopCoreSystems.bat script
							FileUtils.copyURLToFile(
									this.getClass().getResource("/scripts/stopCoreSystems.bat"), 
									new File(workspace + "\\.temp\\stopCoreSystems.bat"));
							
							if(!mandatorySys) {
								// Generation of the startAllSystems.bat script
								tScripts = velocityEngine.getTemplate("/scripts/startAllSystems.vm");
								wScripts = new FileWriter(new File(workspace + "\\.temp\\startAllSystems.bat"));
								tScripts.merge(context, wScripts);
								wScripts.flush();
								wScripts.close();
								
								// Generation of the stopAllSystems.bat script
								FileUtils.copyURLToFile(
										this.getClass().getResource("/scripts/stopAllSystems.bat"), 
										new File(workspace + "\\.temp\\stopAllSystems.bat"));
							}
						}

						t.merge(context, writer);
						writer.flush();
						writer.close();

						// Execute script
						if (os.equalsIgnoreCase("windows")) {
							ExecutionUtils.executebat(workspace + "\\.temp\\init.bat");
						} else
							ExecutionUtils.executesh(workspace + File.separator +".temp" +File.separator, "init");

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
