package common.parsing.workspace;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import common.dto.APXInterfaceDesignDescription;
import common.dto.APXSystemDesignDescription;
import common.dto.APXInterfaceDesignDescription.APXServiceDescription;
import common.dto.APXInterfaceDesignDescription.APXServiceDescription.APXPayload;

/**
*
* This class parses the definition elements of the workspace, which are those files describing
* the SystemDesignDescription (SysDD) or InterfaceDesignDescription (IDD).
* 
* @author fernand0labra
* 
*/
public class DefinitionParser {

	//=================================================================================================
	// attributes
	
	private static String systemPath = ""; // Path to the system's folder
	
	
	//=================================================================================================
	// methods
	
	//-------------------------------------------------------------------------------------------------
	/**
	 * Parses a system from the workspace folder that contains the files defining the 
	 * SystemDesignDescription (SysDD).
	 * 
	 * @param workspace Workspace path
	 * @param deployedEntityPath Path of the deployed entity folder
	 * @return The parsed SystemDesignDescription (SysDD)
	 */
	public static APXSystemDesignDescription parseSystem(String workspace, String deployedEntityPath) {		
		APXSystemDesignDescription systemDesignDescription = new APXSystemDesignDescription();	

		// Set role of the system from the name of the folder (-consumer || -provider)
		String systemRole = deployedEntityPath.split("-provider")[0].contains("-consumer") ? 
				"consumer" : "provider";

		BufferedReader reader;

		try {
			// Open and read application.properties file
			System.out.println(workspace + File.separator +"src"+ File.separator +"main"+ File.separator +"resources"+ File.separator +"application.properties");
			reader = new BufferedReader(new FileReader(workspace + File.separator +"src"+ File.separator +"main"+ File.separator +"resources"+ File.separator +"application.properties"));
			String line = reader.readLine();

			while (line != null) {
				if(line.contains("application_system_name"))
					// Set name of the system
					systemDesignDescription.setName(ParsingUtils.toCamelCase(line.split("=")[1].split(systemRole)[0]));
				line = reader.readLine();
			}

			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Build the system path
		systemPath = workspace + File.separator +"src"+ File.separator +"main"+ File.separator +"java"+ File.separator +"eu"+ File.separator +"arrowhead"+ File.separator + systemRole + File.separator ;
		
		// Set the InterfaceDesignDescription list
		systemDesignDescription.setIDDs(parseInterface());
		systemDesignDescription.setRole(systemRole.substring(0, 1).toUpperCase() + systemRole.substring(1));
		if(systemDesignDescription.getRole().equals("Provider"))
			for(APXInterfaceDesignDescription workspaceInterface : systemDesignDescription.getIDDs())
				if(workspaceInterface.getRole().equals("Consumer")) {
					systemDesignDescription.setRole("ProviderConsumer");
					break;
				}
			
		// TODO Check if it is necessary
		if(!ParsingSetup.workspaceSystemDescriptionMap.containsKey(systemDesignDescription.getName()))
			ParsingSetup.workspaceSystemDescriptionMap.put(systemDesignDescription.getName(), systemDesignDescription);
		
		return systemDesignDescription;
	}

	//-------------------------------------------------------------------------------------------------
	/**
	 * Parses an interface from the workspace folder that contains the files defining the 
	 * InterfaceDesignDescription (IDD) of a specific system.
	 * 
	 * @return The parsed InterfaceDesignDescription (IDD)
	 */
	public static ArrayList<APXInterfaceDesignDescription> parseInterface() {
		ArrayList<String> dtoPaths = new ArrayList<String>();
		String mainPath = "";
		String serviceControllerPath = "";

		// Identify IDDs based on the file names of the folder
		for (String filePath : ParsingUtils.readWorkspace(systemPath, false))
			if (filePath.contains("Main")) // Consumer or Consumer/Provider operations
				mainPath = filePath;
			else if (filePath.contains("DTO")) // Consumer or Provider payload
				dtoPaths.add(filePath);
			else if (filePath.contains("ServiceController")) // Provider operations
				serviceControllerPath = filePath;

		ArrayList<APXInterfaceDesignDescription> interfaceDesignList = new ArrayList<APXInterfaceDesignDescription>();

		if(!mainPath.equals("")) // If the system behaves as a consumer
			interfaceDesignList.addAll(InterfaceParsingUtils.parseMain(systemPath + mainPath));

		if(!serviceControllerPath.equals("")) // If the system behaves as a provider
			interfaceDesignList.addAll(InterfaceParsingUtils.parseServiceController(systemPath + serviceControllerPath));
		
		return interfaceDesignList;
	}

	//-------------------------------------------------------------------------------------------------
	/**
	 * This class offers a set of utils for the parsing of the files describing the IDD operations and payload.
	 * 
	 * @author fernand0labra
	 *
	 */
	private static class InterfaceParsingUtils {

		/**
		 * Parse the file containing the main method and the consumer operations performed by the specific system
		 * 
		 * @param mainPath The path to the __Main.java file
		 * @return A list of consumer InterfaceDesignDescription objects
		 */
		public static ArrayList<APXInterfaceDesignDescription> parseMain(String mainPath) {
			BufferedReader reader;
			ArrayList<APXInterfaceDesignDescription> interfaceDesignList = new ArrayList<APXInterfaceDesignDescription>();
			HashMap<String, HashMap<String, HashMap<String, String>>> consumerInterfaces = new HashMap<String, HashMap<String, HashMap<String, String>>>();

			try {
				// Open ___Main.java file
				reader = new BufferedReader(new FileReader(mainPath));
				String line = reader.readLine();

				String currentInterface = "";
				String currentOperation = "";

				while (line != null) { // Parse information into POJO object

					if (line.contains("public void") && line.contains("()")) {
						String[] splitMethod = line.split(" ")[6].split("_"); // TODO Not very consistent to use the space as delimiter
						currentInterface = splitMethod[0];
						currentOperation = splitMethod[1];

						// If the interface is registered
						if (consumerInterfaces.containsKey(currentInterface))
							// Add a new operation structure
							consumerInterfaces.get(currentInterface).put(currentOperation, new HashMap<String, String>());

						else { // If the interface is not registered
							HashMap<String, HashMap<String, String>> operationMap = new HashMap<String, HashMap<String, String>>();														
							operationMap.put(currentOperation, new HashMap<String, String>());
							
							// Add a new interface structure with a new operation structure
							consumerInterfaces.put(currentInterface, operationMap);
						}
					}

					// Obtain method of the operation and response type
					if (line.contains("result") && line.contains("send")) {
						consumerInterfaces.get(currentInterface).get(currentOperation).put("responseType", currentOperation.substring(0, 1).toUpperCase() + currentOperation.substring(1) + "ResponseDTO");
						consumerInterfaces.get(currentInterface).get(currentOperation).put("method", line.split("send")[1].split("\\(")[0]);
					}

					// Obtain request and response payload (if any)
					if(line.contains("DTO") && (line.contains("request") || line.contains("response")) && line.contains("new"))
						if(line.contains("request"))
							consumerInterfaces.get(currentInterface).get(currentOperation).put("requestType", line.split("request")[0].strip());
						else
							consumerInterfaces.get(currentInterface).get(currentOperation).put("responseType", line.split("response")[0].strip());

					line = reader.readLine();
				}

				reader.close(); // Close info.txt file (IO operations)

			} catch (IOException e) {
				e.printStackTrace();
			}

			for (String interfaceName : consumerInterfaces.keySet()) { // For each of the interfaces
				// Parse the interface to an InterfaceDesignDescription object
				APXInterfaceDesignDescription interfaceDesign = new APXInterfaceDesignDescription();
				interfaceDesign.setName(interfaceName);
				interfaceDesign.setRole("Consumer");
				interfaceDesign.setProtocol("HTTP_1_1"); // TODO Code not adjusted for COAP so far
				interfaceDesign.setEncoding("JSON"); // TODO HTTP-SECURE-JSON  HTTP-INSECURE-JSON

				ArrayList<APXInterfaceDesignDescription.APXServiceDescription> operationList = new ArrayList<APXInterfaceDesignDescription.APXServiceDescription>();
				for (String serviceName : consumerInterfaces.get(interfaceName).keySet()) { // For each of the operations
					// Parse the operation to a ServiceDescription object
					APXInterfaceDesignDescription.APXServiceDescription operation = interfaceDesign . new APXServiceDescription ();
					operation.setName(serviceName);
					operation.setMethod(consumerInterfaces.get(interfaceName).get(serviceName).get("method"));

					// Set request type
					String requestType = consumerInterfaces.get(interfaceName).get(serviceName).get("requestType");
					operation.setRequestType(requestType != null ? requestType : "");
					requestType = operation.getRequestType();
					
					// If the request type is not a base type (e.g. String, int, float, etc.)
					if(!requestType.equals("String") && !requestType.equals("")) // TODO Check if "String" condition is necessary
						// Parse the payload into a Payload object
						operation.setRequestPayload(
								InterfaceParsingUtils.parsePayload(operation, systemPath + File.separator +"dto"+ File.separator  + serviceName.substring(0, 1).toUpperCase() + serviceName.substring(1) + "RequestDTO.java"));
					
					// Set response type
					String responseType = consumerInterfaces.get(interfaceName).get(serviceName).get("responseType");
					operation.setResponseType(responseType != null ? responseType : "");
					responseType = operation.getResponseType();
					
					// If the request type is not a base type (e.g. String, int, float, etc.)
					if(!responseType.equals("String") && !responseType.equals(""))
						// Parse the payload into a Payload object
						operation.setResponsePayload(
								InterfaceParsingUtils.parsePayload(operation, systemPath + File.separator +"dto"+ File.separator   + serviceName.substring(0, 1).toUpperCase() + serviceName.substring(1) + "ResponseDTO.java"));

					operationList.add(operation);
				}

				interfaceDesign.setOperations(operationList);
				interfaceDesignList.add(interfaceDesign);
			}

			return interfaceDesignList;
		}

		//-------------------------------------------------------------------------------------------------
		/**
		 * Parse the file containing the provider operations performed by the specific system
		 * 
		 * @param serviceControllerPath The path to the ServiceController__.java file
		 * @return A list of provider InterfaceDesignDescription objects
		 */
		public static ArrayList<APXInterfaceDesignDescription> parseServiceController(String serviceControllerPath){
			BufferedReader reader;
			HashMap<String, HashMap<String, HashMap<String, String>>> providerInterfaces = new HashMap<String, HashMap<String, HashMap<String, String>>>();
			ArrayList<APXInterfaceDesignDescription> interfaceDesignList = new ArrayList<APXInterfaceDesignDescription>();

			try {
				// Open ServiceController__.java file
				reader = new BufferedReader(new FileReader(serviceControllerPath));
				String line = reader.readLine();

				String currentInterface = "";
				String currentOperation = "";

				while (line != null) { // Parse information into POJO object

					// Obtain the operation and associated interface
					if(line.contains("@") && line.contains("Mapping") && !line.contains("Request")) {
						String nextLine = reader.readLine();
						currentInterface = nextLine.split("public")[1].split(" ")[2].split("_")[0];
						currentOperation = nextLine.split("public")[1].split(" ")[2].split("_")[1];

						// If the interface is registered
						if (providerInterfaces.containsKey(currentInterface))
							// Add a new operation structure
							providerInterfaces.get(currentInterface).put(currentOperation, new HashMap<String, String>());

						else { // If the interface is not registered
							HashMap<String, HashMap<String, String>> operationMap = new HashMap<String, HashMap<String, String>>();														
							operationMap.put(currentOperation, new HashMap<String, String>());
							
							// Add a new interface structure with a new operation structure
							providerInterfaces.put(currentInterface, operationMap);
						}

						// Obtain the method and the encoding of the operation
						providerInterfaces.get(currentInterface).get(currentOperation).put("method", line.split("@")[1].split("Mapping")[0]);
						providerInterfaces.get(currentInterface).get(currentOperation).put("encoding", line.split("MediaType")[1].split("_")[1]);

						// Obtain the response type (if any)
						providerInterfaces.get(currentInterface).get(currentOperation).put("responseType", nextLine.split("public")[1].split(" ")[1]);			

						// Obtain the request type (if any)
						if(nextLine.contains("RequestBody"))
							providerInterfaces.get(currentInterface).get(currentOperation).put("requestType", nextLine.split("final")[1].split(" ")[1]);
					}

					line = reader.readLine();
				}

				reader.close(); // Close ServiceController__.java file (IO operations)

			} catch (IOException e) {
				e.printStackTrace();
			}

			for (String interfaceName : providerInterfaces.keySet()) { // For each of the interfaces
				// Parse the interface into a InterfaceDesignDescription object
				APXInterfaceDesignDescription interfaceDesign = new APXInterfaceDesignDescription();
				
				// Obtain the name, protocol and encoding of the interface
				interfaceDesign.setName(interfaceName);
				interfaceDesign.setProtocol(serviceControllerPath.split("ServiceController")[1].split("\\.")[0].toUpperCase());
				interfaceDesign.setEncoding("JSON"); // TODO HTTP-SECURE-JSON  HTTP-INSECURE-JSON

				ArrayList<APXInterfaceDesignDescription.APXServiceDescription> operationList	= new ArrayList<APXInterfaceDesignDescription.APXServiceDescription>();

				for(String operationName : providerInterfaces.get(interfaceName).keySet()) { // For each of the operations
					// Parse the operation into a ServiceDescription object
					APXInterfaceDesignDescription.APXServiceDescription operation = interfaceDesign . new APXServiceDescription ();

					// Set name and method of the operation
					operation.setName(operationName);
					operation.setMethod(providerInterfaces.get(interfaceName).get(operationName).get("method"));
					
					// Obtain request type of the operation
					String requestType = providerInterfaces.get(interfaceName).get(operationName).get("requestType");
					operation.setRequestType(requestType != null ? requestType : "");
					requestType = operation.getRequestType();
					
					// If the request type is not a base type (e.g. String, int, float, etc.)
					if(!requestType.equals("String") && !requestType.equals("")) // TODO Check if "String" condition is necessary
						// Parse the payload into a Payload object
						operation.setRequestPayload(
								InterfaceParsingUtils.parsePayload(operation, systemPath + File.separator +"dto"+ File.separator  + operationName.substring(0, 1).toUpperCase() + operationName.substring(1) + "RequestDTO.java"));

					// Obtain response type of the operation
					String responseType = providerInterfaces.get(interfaceName).get(operationName).get("responseType");
					operation.setResponseType(responseType != null ? responseType : "");
					responseType = operation.getResponseType();
					
					// If the request type is not a base type (e.g. String, int, float, etc.)
					if(!responseType.equals("String") && !responseType.equals(""))
						// Parse the payload into a Payload object
						operation.setResponsePayload(
								InterfaceParsingUtils.parsePayload(operation, systemPath + File.separator +"dto"+ File.separator   + operationName.substring(0, 1).toUpperCase() + operationName.substring(1) + "ResponseDTO.java"));
								
					operationList.add(operation);
				}
				
				interfaceDesign.setOperations(operationList);
				
				// TODO Check if it is necessary
				if(!ParsingSetup.workspaceInterfaceDescriptionMap.containsKey(interfaceName))
					ParsingSetup.workspaceInterfaceDescriptionMap.put(interfaceName, new APXInterfaceDesignDescription(interfaceDesign));
				
				// Set role of the interface (if it has one provided service it's considered a provider)
				interfaceDesign.setRole("Provider");
				interfaceDesignList.add(interfaceDesign);
			}

			return interfaceDesignList;
		}

		//-------------------------------------------------------------------------------------------------
		/**
		 * Parse the file containing the payload of a specific operation
		 * 
		 * @param service The ServiceDescription object describing the operation
		 * @param pathDTO The path to the __DTO.java file
		 * @return A list of Payload objects
		 */
		public static ArrayList<APXPayload> parsePayload(APXServiceDescription service, String pathDTO) {
			BufferedReader reader;
			ArrayList<APXPayload> payload = new ArrayList<APXPayload>();

			try {
				// Open ___DTO.java file
				reader = new BufferedReader(new FileReader(pathDTO));
				String line = reader.readLine();

				while (line != null) { // Parse information into POJO object

					if (line.contains("private") && !line.contains("\\(\\)")) {
						APXPayload element = service . new APXPayload();
						
						// Obtain name and type of the payload element
						element.setName(line.split("private")[1].strip().split(" ")[1].split(";")[0]);
						element.setType(line.split("private")[1].strip().split(" ")[0]);
						
						payload.add(element);
					}

					line = reader.readLine();
				}

				reader.close();

			} catch (IOException e) {
				service.setResponseType("");
			}

			return payload;

		}
	}
}
