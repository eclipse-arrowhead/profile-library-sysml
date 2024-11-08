package deployment.systems.generator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.io.IOException;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import common.dto.APXDeployedEntity;
import common.dto.APXInterfaceDesignDescription;
import common.parsing.workspace.ParsingUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

/**
 * 
 * Generation of the ConsumerMain.java file
 * 
 * @author cripan
 *
 */
public class ConsumerMain {

	// =================================================================================================
	// methods

	// -------------------------------------------------------------------------------------------------
	/**
	 * 
	 * Generation of the Consumer Main
	 * 
	 * @param workspace The path to the file
	 * @param localCloud The name of the local cloud
	 * @param system The name of the system
	 * @param systemServiceRegistry List of systems in the service registry
	 * @param interfaces List of interfaces of the consumer
	 */
	public static void generateConsumerMain(String workspace, String localCloud, String system, HashMap<String, APXDeployedEntity> deployedEntityMap) {

		HashSet<String> dtoList = new HashSet<String>();
		
		APXDeployedEntity deployedEntity = deployedEntityMap.get(ParsingUtils.toKebabCase(system));
		ArrayList<APXInterfaceDesignDescription> serviceInterfaceList = deployedEntity.getSysDD().getIDDs();
		String port = deployedEntity.getServerPort();
		
		for (APXInterfaceDesignDescription serviceInterface : serviceInterfaceList) // For each registered service interface
			// Generate response and request payload
			for (APXInterfaceDesignDescription.APXServiceDescription operation : serviceInterface.getOperations()) {
				GenerationUtils.buildDTO(workspace, localCloud, system, operation, "consumer");
				if(!operation.getRequestType().equals(""))
					dtoList.add(operation.getRequestType());
				if(!operation.getResponseType().equals(""))
					dtoList.add(operation.getResponseType());
			}

		// Check protocol type
		boolean httpFlag = GenerationUtils.checkHttpProtocol(serviceInterfaceList);
		boolean coapFlag = GenerationUtils.checkCoapProtocol(serviceInterfaceList);

		// Initialise Velocity Engine
		VelocityEngine velocityEngine = new VelocityEngine();
		velocityEngine.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
		velocityEngine.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
		velocityEngine.init();

		try {
			serviceInterfaceList = GenerationUtils.removeRepetitions(serviceInterfaceList);

			// Create and write Consumer Main class file
			Template t = velocityEngine.getTemplate("templates/consumer/consumerMain.vm");
			VelocityContext context = new VelocityContext();
			context.put("packagename", "consumer");
			context.put("sysName", system);
			context.put("interfaces", serviceInterfaceList);
			context.put("address", "http://127.0.0.1:" + port);
			context.put("httpFlag", httpFlag);
			context.put("coapFlag", coapFlag);
			context.put("dtos", dtoList);

			Writer writer = new FileWriter(new File(workspace + File.separator + "arrowhead"+ File.separator +  localCloud + File.separator + "cloud-systems"+ File.separator + ParsingUtils.toKebabCase(system) + "-consumer"+ File.separator + "src"+ File.separator + "main"+ File.separator + "java"+ File.separator + "eu"+ File.separator + "arrowhead"+ File.separator + "consumer"+ File.separator +  system + "ConsumerMain.java"));
			t.merge(context, writer);
			writer.flush();
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}