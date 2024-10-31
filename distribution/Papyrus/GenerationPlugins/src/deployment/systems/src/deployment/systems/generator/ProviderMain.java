package deployment.systems.generator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import common.dto.APXDeployedEntity;
import common.dto.APXInterfaceDesignDescription;
import common.parsing.workspace.ParsingUtils;

/**
 * 
 * Generation of the ProviderMain.java, ServerApplication.java  and ApplicationInitListener.java files
 * 
 * @author cripan
 *
 */
public class ProviderMain {

	// =================================================================================================
	// attributes
	
	private static HashSet<String> dtoList = new HashSet<String>();
	
	
	// =================================================================================================
	// methods

	// -------------------------------------------------------------------------------------------------
	/**
	 * 
	 * Generation of the Provider Main and Server Application for providing system
	 * 
	 * @param workspace The path to the file
	 * @param localCloud The name of the local cloud
	 * @param system The name of the system
	 * @param interfaceList List of interfaces of the consumer
	 */
	public static void generateProviderMain(String workspace, String localCloud, String system, HashMap<String, APXDeployedEntity> deployedEntityMap) {
		
		dtoList.clear();
		
		APXDeployedEntity deployedEntity = deployedEntityMap.get(ParsingUtils.toKebabCase(system));
		ArrayList<APXInterfaceDesignDescription> serviceInterfaceList = deployedEntity.getSysDD().getIDDs();
		
		for (APXInterfaceDesignDescription serviceInterface : serviceInterfaceList) // For each registered service interface
			// Generate response and request payload
			for (APXInterfaceDesignDescription.APXServiceDescription operation : serviceInterface.getOperations()) {
				GenerationUtils.buildDTO(workspace, localCloud, system, operation, "provider");
				if(!operation.getRequestType().equals(""))
					dtoList.add(operation.getRequestType());
				if(!operation.getResponseType().equals(""))
					dtoList.add(operation.getResponseType());
			}

		// Check protocol type
		boolean coap = GenerationUtils.checkCoapProtocol(serviceInterfaceList);

		// Initialise Velocity Engine
		VelocityEngine velocityEngine = new VelocityEngine();
		velocityEngine.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
		velocityEngine.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
		velocityEngine.init();

		try {
			// Create and write Provider Main class file
			Template t = velocityEngine.getTemplate("templates/provider/providerMain.vm");
			VelocityContext context = new VelocityContext();
			context.put("packagename", "provider");
			context.put("sysName", system);
			context.put("coap", coap);

			Writer writer = new FileWriter(new File(workspace + File.separator +"arrowhead"+ File.separator + localCloud + File.separator +"cloud-systems"+ File.separator + ParsingUtils.toKebabCase(system) + "-provider"+ File.separator + "src"+ File.separator + "main"+ File.separator + "java"+ File.separator + "eu"+ File.separator + "arrowhead"+ File.separator + "provider"+ File.separator + system + "ProviderMain.java"));
			t.merge(context, writer);
			writer.flush();
			writer.close();

			if (coap) {
				// Create and write Coap Server Application class file
				Template tc = velocityEngine.getTemplate("templates/provider/coapServer.vm");
				VelocityContext contextc = new VelocityContext();
				contextc.put("packagename", "provider");
				
				Writer writerc = new FileWriter(new File(workspace + File.separator +"arrowhead"+ File.separator + localCloud + File.separator +"cloud-systems"+ File.separator + ParsingUtils.toKebabCase(system) + "-provider"+ File.separator + "src"+ File.separator + "main"+ File.separator + "java"+ File.separator + "eu"+ File.separator + "arrowhead"+ File.separator + "provider"+ File.separator + "ServerApplication.java"));
				tc.merge(contextc, writerc);
				writerc.flush();
				writerc.close();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		// Generate the Application Listener
		providerGenAppListener(serviceInterfaceList, system, workspace, localCloud, false);
		// Generate the Controller
		providerController(serviceInterfaceList, system, workspace, localCloud);

	}

	// -------------------------------------------------------------------------------------------------
	/**
	 * 
	 * Generation of the Provider Main and Server Application for consuming and providing system
	 * 
	 * @param workspace The path to the file
	 * @param localCloud The name of the local cloud
	 * @param system The name of the system
	 * @param systemServiceRegistry List of systems in the service registry
	 * @param interfaces List of interfaces of the consumer
	 */
	public static void generateProvConsMain(String workspace, String localCloud, String system,  HashMap<String, APXDeployedEntity> deployedEntityMap) {

		dtoList.clear();
		
		ArrayList<APXInterfaceDesignDescription> serviceInterfacesProvider = new ArrayList<APXInterfaceDesignDescription>();
		ArrayList<APXInterfaceDesignDescription> serviceInterfacesConsumer = new ArrayList<APXInterfaceDesignDescription>();

		APXDeployedEntity deployedEntity = deployedEntityMap.get(ParsingUtils.toKebabCase(system));
		ArrayList<APXInterfaceDesignDescription> serviceInterfaceList = deployedEntity.getSysDD().getIDDs();
		String port = deployedEntity.getServerPort();
		
		for (APXInterfaceDesignDescription serviceInterface : serviceInterfaceList) { // For each registered service interface
			// Generate response and request payload
			for (APXInterfaceDesignDescription.APXServiceDescription operation : serviceInterface.getOperations()) {
				GenerationUtils.buildDTO(workspace, localCloud, system, operation, "provider");
				if(!operation.getRequestType().equals(""))
					dtoList.add(operation.getRequestType());
				if(!operation.getResponseType().equals(""))
					dtoList.add(operation.getResponseType());
			}
	
			if(serviceInterface.getRole().equals("Provider"))
				serviceInterfacesProvider.add(serviceInterface);
			else
				serviceInterfacesConsumer.add(serviceInterface);
			
		}
		
		// For each service that the system provides
		for (APXInterfaceDesignDescription serviceInterface : serviceInterfacesProvider)
			
			// Generate response and request payload
			for (APXInterfaceDesignDescription.APXServiceDescription operation : serviceInterface.getOperations())
				GenerationUtils.buildDTO(workspace, localCloud, system, operation, "provider");

		// Generate the Controller
		providerController(serviceInterfacesProvider, system, workspace, localCloud);
		
		// For each service that the system consumes
		for (APXInterfaceDesignDescription serviceInterface : serviceInterfacesConsumer)
			
			// Generate response and request payload
			for (APXInterfaceDesignDescription.APXServiceDescription operation : serviceInterface.getOperations())
				GenerationUtils.buildDTO(workspace, localCloud, system, operation, "provider-consumer");

		// Check protocol type
		boolean providerCoap = GenerationUtils.checkCoapProtocol(serviceInterfacesProvider);
		boolean consumerCoap = GenerationUtils.checkCoapProtocol(serviceInterfacesConsumer);
		boolean consumerHttp = GenerationUtils.checkHttpProtocol(serviceInterfacesConsumer);

		// Initialise Velocity Engine
		VelocityEngine velocityEngine = new VelocityEngine();
		velocityEngine.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
		velocityEngine.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
		velocityEngine.init();
		
		try {
			serviceInterfacesConsumer = GenerationUtils.removeRepetitions(serviceInterfacesConsumer);

			// Create and write Provider Main class file
			Template t = velocityEngine.getTemplate("templates/provider/providerConsumerMain.vm");
			VelocityContext context = new VelocityContext();
			context.put("packagename", "provider"); // _Provider
			context.put("sysName", system);
			context.put("interfaces", serviceInterfacesConsumer);
			context.put("address", "http://127.0.0.1:" +  port);
			context.put("httpFlag", consumerHttp);
			context.put("coapFlag", consumerCoap);
			context.put("dtos", dtoList);

			Writer writer = new FileWriter(new File(workspace + File.separator +"arrowhead"+ File.separator + localCloud + File.separator +"cloud-systems"+ File.separator + ParsingUtils.toKebabCase(system) + "-provider"+ File.separator + "src"+ File.separator + "main"+ File.separator + "java"+ File.separator + "eu"+ File.separator + "arrowhead"+ File.separator + "provider"+ File.separator + system + "ProviderMain.java"));
			t.merge(context, writer);
			writer.flush();
			writer.close();

			if (providerCoap) {
				// Create and write Coap Server Application class file
				Template tc = velocityEngine.getTemplate("templates/provider/coapServer.vm");
				VelocityContext contextc = new VelocityContext();
				contextc.put("packagename", "provider");

				Writer writerc = new FileWriter(new File(workspace + File.separator +"arrowhead"+ File.separator + localCloud + File.separator +"cloud-systems"+ File.separator + ParsingUtils.toKebabCase(system) + "-provider"+ File.separator + "src"+ File.separator + "main"+ File.separator + "java"+ File.separator + "eu"+ File.separator + "arrowhead"+ File.separator + "provider"+ File.separator + "ServerApplication.java"));
				tc.merge(contextc, writerc);
				writerc.flush();
				writerc.close();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		// Generate Application Listener
		providerGenAppListener(serviceInterfacesProvider, system, workspace, localCloud, true);

	}

	// -------------------------------------------------------------------------------------------------
	/**
	 * 
	 * Generation of the Application Listeners
	 * 
	 * @param serviceInterfaceList List of service interfaces of the system
	 * @param system The name of the system
	 * @param workspace The path of the file
	 * @param localCloud The name of the local cloud
	 */
	public static void providerGenAppListener(ArrayList<APXInterfaceDesignDescription> serviceInterfaceList, String system, String workspace, String localCloud, Boolean providerConsumer) {
		serviceInterfaceList = GenerationUtils.removeRepetitions(serviceInterfaceList);

		// Initialise VelocityEngine
		VelocityEngine velocityEngine = new VelocityEngine();
		velocityEngine.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
		velocityEngine.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
		velocityEngine.init();
		
		try {
			// Create and write the Application Listener
			Template t = velocityEngine.getTemplate("templates/provider/applicationListener.vm");
			VelocityContext context = new VelocityContext();
			context.put("packagename", "provider");
			context.put("interfaces", serviceInterfaceList);
			
			context.put("type", providerConsumer ? "provider-consumer" : "provider");
			context.put("dtos", dtoList);

			Writer writer = new FileWriter(new File(workspace + File.separator +"arrowhead"+ File.separator + localCloud + File.separator +"cloud-systems"+ File.separator + ParsingUtils.toKebabCase(system) + "-provider"+ File.separator + "src"+ File.separator + "main"+ File.separator + "java"+ File.separator + "eu"+ File.separator + "arrowhead"+ File.separator + "provider"+ File.separator + "ProviderApplicationInitListener.java"));
			t.merge(context, writer);
			writer.flush();
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// -------------------------------------------------------------------------------------------------
	/**
	 * 
	 * Generation of the Service Controller for providing system
	 * 
	 * @param serviceInterfaces List of service interfaces of the system
	 * @param system The name of the system
	 * @param Directory The path of the file
	 * @param name The name of the local cloud
	 */
	public static void providerController(ArrayList<APXInterfaceDesignDescription> serviceInterfaces, String system, String Directory, String name) {
		serviceInterfaces = GenerationUtils.removeRepetitions(serviceInterfaces);
		
		ArrayList<APXInterfaceDesignDescription> serviceInterfacesCoap = new ArrayList<APXInterfaceDesignDescription>();
		ArrayList<APXInterfaceDesignDescription> serviceInterfacesHttp = new ArrayList<APXInterfaceDesignDescription>();
		
		// Assign interface with type of protocol
		for (int i = 0; i < serviceInterfaces.size(); i++) {
			APXInterfaceDesignDescription interfaceM = serviceInterfaces.get(i);
			if (interfaceM.getProtocol().toLowerCase().contains("CoAP".toLowerCase()))
				serviceInterfacesCoap.add(interfaceM);
			if(interfaceM.getProtocol().toLowerCase().contains("HTTP".toLowerCase()))
				serviceInterfacesHttp.add(interfaceM);
		}

		// Initialise Velocity Engine
		VelocityEngine velocityEngine = new VelocityEngine();
		velocityEngine.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
		velocityEngine.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
		velocityEngine.init();
		
		try {
			if (serviceInterfacesHttp.size() > 0) {
				// Create and write Service Controller file for HTTP
				Template th = velocityEngine.getTemplate("templates/provider/controllerHttp.vm");
				VelocityContext contexth = new VelocityContext();
				contexth.put("packagename", "provider");
				contexth.put("interfaces", serviceInterfacesHttp);
				contexth.put("dtos", dtoList);
				
				Writer writerh = new FileWriter(new File(Directory + File.separator +"arrowhead"+ File.separator + name + File.separator +"cloud-systems"+ File.separator + ParsingUtils.toKebabCase(system) + "-provider"+ File.separator + "src"+ File.separator + "main"+ File.separator + "java"+ File.separator + "eu"+ File.separator + "arrowhead"+ File.separator + "provider"+ File.separator + "ServiceControllerHttp.java"));
				th.merge(contexth, writerh);
				writerh.flush();
				writerh.close();
			}

			if (serviceInterfacesCoap.size() > 0) {
				// Create and write Service Controller file for CoAP
				Template tc = velocityEngine.getTemplate("templates/provider/controllerCoap.vm");
				VelocityContext contextc = new VelocityContext();
				contextc.put("packagename", "provider");
				contextc.put("interfaces", serviceInterfacesCoap);

				Writer writerc = new FileWriter(new File(Directory + File.separator +"arrowhead"+ File.separator + name + File.separator +"cloud-systems"+ File.separator + ParsingUtils.toKebabCase(system) + "-provider"+ File.separator + "src"+ File.separator + "main"+ File.separator + "java"+ File.separator + "eu"+ File.separator + "arrowhead"+ File.separator + "provider"+ File.separator + "ServiceControllerCoap.java"));
				tc.merge(contextc, writerc);
				writerc.flush();
				writerc.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
