package deployment.systems.generator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

/**
 * 
 * Generation of the application.properties file
 * 
 * @author cripan
 *
 */
public class ApplicationProperties {

	// =================================================================================================
	// methods

	// -------------------------------------------------------------------------------------------------
	/**
	 * 
	 * Generation of the application.properties file
	 * 
	 * @param directory The path to the file
	 * @param name      The name of the local cloud
	 * @param SysName   The name of the system
	 * @param SysType   The type of the system (Consumer/Provider)
	 */
	public static void GenerateAppProperties(String directory, String name, String SysName, String SysType, String port) {
		// Initialise Velocity Engine
		VelocityEngine velocityEngine = new VelocityEngine();
		velocityEngine.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
		velocityEngine.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
		velocityEngine.init();
		
		try {
			// Generate application.properties file from template
			Template t = velocityEngine.getTemplate("templates/general/properties.vm");
			VelocityContext context = new VelocityContext();
			context.put("port", port);
			context.put("type", SysType);
			context.put("sysName", SysName);
			
			Writer writer = new FileWriter(new File(directory + File.separator + "arrowhead"+ File.separator +  name + File.separator + "cloud-systems"+ File.separator +  SysName +  File.separator + "src"+ File.separator + "main"+ File.separator + "resources"+ File.separator + "application.properties"));
			t.merge(context, writer);
			writer.flush();
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
