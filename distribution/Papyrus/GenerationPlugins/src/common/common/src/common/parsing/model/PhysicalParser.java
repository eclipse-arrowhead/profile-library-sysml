package common.parsing.model;

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedEntity;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.util.UMLUtil;

import common.dto.APXDeployedEntity;
import common.dto.APXLocalCloudDesignDescription;
import common.dto.APXLocalCloudDesignDescription.APXConnector;
import common.parsing.workspace.ParsingUtils;

/**
 * This class parses the physical elements of the model, which are those blocks implementing
 * the LocalCloudDesignDescription or DeployedEntity stereotypes.
 * 
 * @author fernand0labra
 *
 */
public class PhysicalParser {

	//=================================================================================================
	// methods
	
	//-------------------------------------------------------------------------------------------------
	/**
	 * Parses a local cloud from a packageable element that potentially implements the 
	 * LocalCloudDesignDescription stereotype.
	 * 
	 * @param element The packageable element of the block
	 * @return The parsed LocalCloudDesignDescription
	 */
	public static APXLocalCloudDesignDescription parseLocalCloud(PackageableElement element){
		Classifier classifier = (Classifier) element;

		APXLocalCloudDesignDescription localCloud = new APXLocalCloudDesignDescription();

		// Set the name of the local cloud
		localCloud.setName(element.getName());
		
		// Get the attributes of the local cloud (deployed entities)
		EList<Property> umlDeployedEntities = classifier.getAllAttributes();
		HashMap<String, APXDeployedEntity> deployedEntities = new HashMap<String, APXDeployedEntity>();

		for (Property umlDeployedEntity : umlDeployedEntities) { // For each deployed entity
			APXDeployedEntity deployedEntity = new APXDeployedEntity();
			DeployedEntity modelDeployedEntity = UMLUtil.getStereotypeApplication(umlDeployedEntity, DeployedEntity.class);

			if (modelDeployedEntity != null) { // If it has the DeployedEntity stereotype
				
				// Build the description of the deployed entity
				String addressPort = ((Comment) (umlDeployedEntity.getOwnedComments().iterator().next())).getBody();
				
				// Set the name, address, port and SystemDesignDescription
				deployedEntity.setName(umlDeployedEntity.getName());
				deployedEntity.setServerAddress(addressPort.split(":")[0]);
				deployedEntity.setServerPort(addressPort.split(":")[1]);
				deployedEntity.setSysDD(ParsingSetup.modelSystemDescriptionMap.get(umlDeployedEntity.getType().getName()));
				
				deployedEntities.put(ParsingUtils.toKebabCase(deployedEntity.getName()), deployedEntity);
			}						
		}

		localCloud.setDeployedEntities(deployedEntities);

		// Parse deployed entity connections
		APXConnector connector;
		for (Connector modelConnector : ((Class) element).getOwnedConnectors()) {
			// Obtain connector and end systems
			EList<ConnectorEnd> connectorsEndList = modelConnector.getEnds();
			
			connector = localCloud . new APXConnector();
			
			for (ConnectorEnd end : connectorsEndList) { // For each end system
				ConnectableElement role = end.getRole();
				connector.setService(role.getType().getName()); // Service provided by the system
				
				String connectorName = common.parsing.workspace.ParsingUtils.toKebabCase(end.getPartWithPort().getName()); // Name of the system
				String connectorAddress = deployedEntities.get(connectorName).getServerAddress(); // Address of the system
				String connectorPort = deployedEntities.get(connectorName).getServerPort(); // Port of the system
				
				if(((Port) role).isConjugated()) { // If the system is consumer
					connector.setConsumerName(connectorName);
					connector.setConsumerAddress(connectorAddress);
					connector.setConsumerPort(connectorPort);
				} else { // If the system is provider
					connector.setProviderName(connectorName);
					connector.setProviderAddress(connectorAddress);
					connector.setProviderPort(connectorPort);
				}
			}
			
			String connectionName = connector.getProviderName() + ":" + connector.getConsumerName(); // name-provider:name-consumer
			if(localCloud.getConnectors().get(connectionName) == null) 
				localCloud.getConnectors().put(connectionName, new ArrayList<APXConnector>());
			
			localCloud.getConnectors().get(connectionName).add(connector);
		}
		
		return localCloud;
	}	
	
}
