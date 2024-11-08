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
 * Generation of the ConsumerApplicationInitListener.java file
 * 
 * @author cripan
 *
 */
public class ConsumerAppList {

	// =================================================================================================
	// methods

	// -------------------------------------------------------------------------------------------------
	/**
	 * 
	 * Generation of Consumer Application Listener
	 * 
	 * @param workspace The path to the workspacae
	 * @param localCloud The name of the local cloud
	 * @param system The name of the system
	 */
	public static void GenerateAppList(String workspace, String localCloud, String system) {
		// Initialise Velocity Engine
		VelocityEngine velocityEngine = new VelocityEngine();
		velocityEngine.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
		velocityEngine.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
		velocityEngine.init();
		
		try {
			// Generate consumer application listener from template
			Template t = velocityEngine.getTemplate("templates/consumer/applicationListener.vm");
			VelocityContext context = new VelocityContext();
			context.put("packagename", "consumer");
			Writer writer = new FileWriter(new File(workspace + File.separator + "arrowhead"+ File.separator +  localCloud + File.separator + "cloud-systems"+ File.separator +  system +  File.separator + "src"+ File.separator + "main"+ File.separator + "java"+ File.separator + "eu"+ File.separator + "arrowhead"+ File.separator + "consumer"+ File.separator + "ConsumerApplicationInitListener.java"));
			t.merge(context, writer);
			writer.flush();
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
