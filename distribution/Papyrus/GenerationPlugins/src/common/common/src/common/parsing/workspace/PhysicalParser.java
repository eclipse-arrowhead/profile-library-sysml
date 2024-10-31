package common.parsing.workspace;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import common.dto.APXDeployedEntity;
import common.dto.APXLocalCloudDesignDescription;

/**
 * 
 * This class parses the physical elements of the workspace, which are those files describing
 * the LocalCloudDesignDescription or DeployedEntity.
 * 
 * @author fernand0labra
 *
 */
public class PhysicalParser {
	
	//=================================================================================================
	// methods
	
	//-------------------------------------------------------------------------------------------------	
	/**
	 * Parses a local cloud from the workspace folder that contains the files defining the LocalCloudDesignDescription.
	 * 
	 * @param workspace The path of the workspace
	 * @param localCloudPath The path of the local cloud folder
	 * @return The parsed LocalCloudDesignDescription object
	 */
	public static APXLocalCloudDesignDescription parseLocalCloud(String workspace, String localCloudPath){

		APXLocalCloudDesignDescription localCloud = new APXLocalCloudDesignDescription();
		localCloud.setName(ParsingUtils.toCamelCase(localCloudPath));

		// Identify deployed entities 
		ArrayList<String> deployedEntitiesImplementation = new ArrayList<String>();
		for (String deployedEntityPath : common.parsing.workspace.ParsingUtils.readWorkspace(workspace + localCloudPath + File.separator +"cloud-systems"+ File.separator , true))
			if(deployedEntityPath.endsWith("-consumer") || deployedEntityPath.endsWith("-provider"))
				deployedEntitiesImplementation.add(deployedEntityPath);

		for (String deployedEntityPath : deployedEntitiesImplementation) { // For each provider and consumer folders
			APXDeployedEntity deployedEntity = parseDeployedEntity(workspace + localCloudPath + File.separator +"cloud-systems"+File.separator, deployedEntityPath);
			// Parse system into a DeployedEntity
			localCloud.getDeployedEntities().put(deployedEntity.getName(), deployedEntity);

		}
		return localCloud;
	}

	//-------------------------------------------------------------------------------------------------
	/**
	 * Parses a deployed entity from the workspace folder that contains the files defining the DeployedEntity
	 * 
	 * @param workspace The path of the workspace
	 * @param deployedEntityPath The path of the deployed entity folder
	 * @return The parsed DeploydEntity object
	 */
	public static APXDeployedEntity parseDeployedEntity(String workspace, String deployedEntityPath) {

		APXDeployedEntity deployedEntity = new APXDeployedEntity();
		String deployedEntityName = deployedEntityPath.split("-provider")[0].contains("-consumer") ? 
				deployedEntityPath.split("-consumer")[0] : deployedEntityPath.split("-provider")[0];
		
		deployedEntity.setName(deployedEntityName); // Obtain name of the deployed entity

		BufferedReader reader;

		try {
			// Open and read application.properties file
			reader = new BufferedReader(new FileReader(workspace + deployedEntityPath + "\\src\\main\\resources\\application.properties"));
			String line = reader.readLine();

			while (line != null) {
				if(line.contains("application_system_name")) {
					String kebabCaseName = line.split("=")[1];
					kebabCaseName = kebabCaseName.contains("provider") ? kebabCaseName.split("provider")[0] : kebabCaseName.split("consumer")[0];
					String camelCaseName = ParsingUtils.toCamelCase(kebabCaseName);
					// Set name of the system
					deployedEntity.setName(camelCaseName.substring(0, 1) + camelCaseName.substring(1));
				}
				
				// Save the server address and port
				if(line.contains("server.address"))
					deployedEntity.setServerAddress(line.split("=")[1]);
				else if(line.contains("server.port"))
					deployedEntity.setServerPort(line.split("=")[1]);

				line = reader.readLine();
			}

			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Obtain the SystemDesignDescription (SysDD) of the deployed entity
		deployedEntity.setSysDD(DefinitionParser.parseSystem(workspace + deployedEntityPath, deployedEntityPath));

		return deployedEntity;
	}
}
