package common.dto;

import java.util.Comparator;

/**
 * 
 * The deployed entity is a SysML stereotype for a certain block type, it represents any of
 * the sensors or microprocessors included in the environment.
 * 
 * @author fernand0labra
 *
 */
public class APXDeployedEntity {	
	
	//=================================================================================================
	// attributes
	
	private String name; // Name of the deployed entity
	
	private String serverAddress; // Server address of the system
	private String serverPort; // Server port of the system
	
	private APXSystemDesignDescription sysDD; // Block type of the deployed entity
	
	
	//=================================================================================================
	// auxiliary methods
	
	//-------------------------------------------------------------------------------------------------
	public String getName() { return name; }
	public String getServerAddress() { return serverAddress; }
	public String getServerPort() { return serverPort; }
	public APXSystemDesignDescription getSysDD() { return sysDD; }
	
	//-------------------------------------------------------------------------------------------------
	public void setName(String name) { this.name = name; }
	public void setServerAddress(String serverAddress) { this.serverAddress = serverAddress; }
	public void setServerPort(String serverPort) { this.serverPort = serverPort; }
	public void setSysDD(APXSystemDesignDescription sysDD) { this.sysDD = sysDD; }
	
	//-------------------------------------------------------------------------------------------------
	public APXDeployedEntity() {
		this.name = "";
		this.serverAddress = "";
		this.serverPort = "";
		this.sysDD = new APXSystemDesignDescription();
	}
	
	public APXDeployedEntity(APXDeployedEntity other) {
		this.name = other.getName();
		this.serverAddress = other.getServerAddress();
		this.serverPort = other.getServerPort();
		this.sysDD = new APXSystemDesignDescription(other.getSysDD());
	}
	
	//-------------------------------------------------------------------------------------------------
	@Override
	public String toString() {
		return "\n\t" + name + "\n\t\tDescription: " + "\n\t\tServer Address: " + serverAddress + "\n\t\tserverPort: " + serverPort + "\n\t\tSystemDesignDescription: " + sysDD.toString(); 
	}
	
	//-------------------------------------------------------------------------------------------------
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof APXDeployedEntity))
			return false;
		
		APXDeployedEntity entity = (APXDeployedEntity) o;
		
		return entity.getName().equals(this.getName());
	}
	
	//-------------------------------------------------------------------------------------------------
	public boolean checkConsistency(APXDeployedEntity other) {
		return 
				this.getServerAddress() == other.getServerAddress() &&
				this.getServerPort() == other.getServerPort();
	}
	
	
	//=================================================================================================
	// auxiliary classes
	
	//-------------------------------------------------------------------------------------------------
	public static class DeployedEntityComparator implements Comparator<APXDeployedEntity> {

		//=================================================================================================
		// methods
		
		//-------------------------------------------------------------------------------------------------
		@Override
		public int compare(APXDeployedEntity o1, APXDeployedEntity o2) {
			return o1.getName().compareTo(o2.getName());
		}
		
	}
}
