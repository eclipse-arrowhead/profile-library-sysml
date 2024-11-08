package common.dto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

import common.dto.APXInterfaceDesignDescription.APXServiceDescription;
import common.dto.APXInterfaceDesignDescription.APXServiceDescription.APXParameter;

/**
 * 
 * The Local Cloud Design Description is a SysML stereotype that includes a list
 * of deployed entities with their associated System Design Descriptions
 *
 * @author fernand0labra
 *
 */
public class APXLocalCloudDesignDescription {
	
	//=================================================================================================
	// attributes
	
	private String name = ""; // Name of the Local Cloud
	private HashMap<String, APXDeployedEntity> deployedEntities = new HashMap<String, APXDeployedEntity>(); // List of deployed entities of the Local Cloud
	private HashMap<String, ArrayList<APXConnector>> connectors = new HashMap<String, ArrayList<APXConnector>>();
	
	//=================================================================================================
	// auxiliary methods
	
	//-------------------------------------------------------------------------------------------------	
	public String getName() { return name; }
	public HashMap<String, APXDeployedEntity> getDeployedEntities() { return deployedEntities; }
	public HashMap<String, ArrayList<APXConnector>> getConnectors() { return connectors; }
	
	//-------------------------------------------------------------------------------------------------
	public void setName(String name) { this.name = name; }
	public void setDeployedEntities(HashMap<String, APXDeployedEntity> deployedEntities) { this.deployedEntities = deployedEntities; }
	public void setConnectors(HashMap<String, ArrayList<APXConnector>> connectors) { this.connectors = connectors; }

	//-------------------------------------------------------------------------------------------------
	@Override
	public String toString() {
		String deployedEntitiesString = "";
		for (APXDeployedEntity entity : deployedEntities.values())
			deployedEntitiesString += entity.toString();
		
		return name + "\n" + deployedEntitiesString;
	}
	
	//-------------------------------------------------------------------------------------------------
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof APXLocalCloudDesignDescription))
			return false;
		
		APXLocalCloudDesignDescription lc = (APXLocalCloudDesignDescription) o;
		
		return lc.getName().equals(this.getName());
	}
	
	
	//=================================================================================================
	// auxiliary classes
	
	//-------------------------------------------------------------------------------------------------	
	public static class LocalCloudComparator implements Comparator<APXLocalCloudDesignDescription> {

		//=================================================================================================
		// methods
		
		//-------------------------------------------------------------------------------------------------			
		@Override
		public int compare(APXLocalCloudDesignDescription o1, APXLocalCloudDesignDescription o2) {
			return o1.getName().compareTo(o2.getName());
		}
		
	}
	
	//-------------------------------------------------------------------------------------------------
	/**
	 * 
	 * The APXConnection is a data structure of the uml connection
	 * 
	 * @author fernand0labra
	 *
	 */
	public class APXConnector{
		
		//=================================================================================================
		// attributes
		
		private String service;
		
		private String providerName;
		private String consumerName;
		
		private String providerPort;
		private String consumerPort;
		
		private String providerAddress;
		private String consumerAddress;
		
		//=================================================================================================
		// auxiliary methods
		
		//-------------------------------------------------------------------------------------------------
		public String getService() { return service; }
		public String getProviderName() { return providerName; }
		public String getConsumerName() { return consumerName; }
		public String getProviderPort() { return providerPort; }
		public String getConsumerPort() { return consumerPort; }
		public String getProviderAddress() { return providerAddress; }
		public String getConsumerAddress() { return consumerAddress; }
		
		//-------------------------------------------------------------------------------------------------
		public void setService(String service) {this.service = service; }
		public void setProviderName(String providerName) { this.providerName = providerName; }
		public void setConsumerName(String consumerName) { this.consumerName = consumerName; }
		public void setProviderPort(String providerPort) { this.providerPort = providerPort; }
		public void setConsumerPort(String consumerPort) { this.consumerPort = consumerPort; }
		public void setProviderAddress(String providerAddress) { this.providerAddress = providerAddress; }
		public void setConsumerAddress(String consumerAddress) { this.consumerAddress = consumerAddress; }
		
		//-------------------------------------------------------------------------------------------------	
		public APXConnector() {
			this.service = "";
			this.providerName="";
			this.consumerName="";
			this.providerPort="";
			this.consumerPort="";
			this.providerAddress="";
			this.consumerAddress="";
		}

		//-------------------------------------------------------------------------------------------------	
		public APXConnector(APXConnector other) {
			this.service = other.getService();
			this.providerName = other.getProviderName();
			this.consumerName = other.getConsumerName();
			this.providerPort = other.getProviderPort();
			this.consumerPort = other.getConsumerPort();
			this.providerAddress = other.getProviderAddress();
			this.consumerAddress = other.getConsumerAddress();
		}
		
		//-------------------------------------------------------------------------------------------------
		@Override
		public String toString() {
			return "\n\tService: " + service 
					+ "\n\t\t Provider Name: " + providerName 
					+ "\n\t\t Consumer Name: " + consumerName 
					+ "\n\t\t Provider Address: " + providerAddress 
					+ "\n\t\t Provider Port: " + providerPort 
					+ "\n\t\t Consumer Address: " + consumerAddress
					+ "\n\t\t Consumer Port: " + consumerPort;
		}
		
		//=================================================================================================
		// auxiliary classes
			
		//-------------------------------------------------------------------------------------------------
		public class ConnectionComparator implements Comparator<APXConnector> { // TODO Use at some point

			//=================================================================================================
			// methods
				
			//-------------------------------------------------------------------------------------------------
			@Override
			public int compare(APXConnector o1, APXConnector o2) {
				return o1.getService().compareTo(o2.getService());
			}
		}
	}
}
