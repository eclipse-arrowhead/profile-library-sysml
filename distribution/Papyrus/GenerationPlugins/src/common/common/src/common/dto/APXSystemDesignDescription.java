package common.dto;

import java.util.ArrayList;

/**
 * 
 * The System Design Description is a SysML stereotype that describes the properties of a 
 * system regarding every interface that might work with
 *
 * @author fernand0labra
 *
 */
public class APXSystemDesignDescription {
	
	//=================================================================================================
	// attributes
	
	private String name; // Name of the System
	private String role; // Role of the System (Consumer, Provider, Provider_Consumer)
	
	private ArrayList<APXInterfaceDesignDescription> IDDs; // List of implementing interfaces
	
	
	//=================================================================================================
	// auxiliary methods
	
	//-------------------------------------------------------------------------------------------------	
	public String getName() { return name; }
	public String getRole() { return role; }
	public ArrayList<APXInterfaceDesignDescription> getIDDs() { return IDDs; }
	
	public void setName(String name) { this.name = name; }
	public void setRole(String role) { this.role = role; }
	public void setIDDs(ArrayList<APXInterfaceDesignDescription> iDDs) { IDDs = iDDs; }
	
	//-------------------------------------------------------------------------------------------------
	public APXSystemDesignDescription() {
		this.name = "";
		this.role = "";
		this.IDDs = new ArrayList<APXInterfaceDesignDescription>();
	}
	
	public APXSystemDesignDescription(APXSystemDesignDescription other) {
		this.name = other.getName();
		this.role = other.getRole();
		this.IDDs = new ArrayList<APXInterfaceDesignDescription>();
		
		for(APXInterfaceDesignDescription idd : other.getIDDs())
			this.IDDs.add(new APXInterfaceDesignDescription(idd));
	}
	
	//-------------------------------------------------------------------------------------------------
	@Override
	public String toString() {
		String interfaceDesignString = "";
		for(APXInterfaceDesignDescription idd : IDDs)
			interfaceDesignString += idd.toString();
		
		return name + "\n\t\t\tRole: " + role + "\n\t\t\tInterfaceDesignDescriptions:" + interfaceDesignString; 
	}
	
	//-------------------------------------------------------------------------------------------------
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof APXSystemDesignDescription))
			return false;
		
		APXSystemDesignDescription system = (APXSystemDesignDescription) o;
		
		return system.getName().equals(this.getName());
	}
	
	//-------------------------------------------------------------------------------------------------
	public boolean checkConsistency(APXSystemDesignDescription other) {
		return
				this.getName() == other.getName() &&
				this.getRole() == other.getRole() &&
				this.getIDDs().size() == other.getIDDs().size();
	}
}
