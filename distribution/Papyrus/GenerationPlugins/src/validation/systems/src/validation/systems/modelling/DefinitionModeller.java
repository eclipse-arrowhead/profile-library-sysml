package validation.systems.modelling;


import java.util.ArrayList;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.EncodingKind;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.HttpOperation;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ProtocolKind;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysDD;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.util.UMLUtil;

import common.dto.APXInterfaceDesignDescription;
import common.dto.APXSystemDesignDescription;
import common.dto.APXInterfaceDesignDescription.APXServiceDescription;
import common.dto.APXInterfaceDesignDescription.APXServiceDescription.APXPayload;
import validation.systems.handlers.PluginExecution;

/**
 * This class adds and updates the definition elements of the model, which are those blocks implementing
 * the SystemDesignDescription (SysDD) or InterfaceDesignDescription (IDD) stereotypes.
 * 
 * @author fernand0labra
 *
 */
public class DefinitionModeller {

	//=================================================================================================
	// attributes
	
	// UML stereotypes implemented by each class
	public static EList<Stereotype> systemDescriptionStereotypeList = null;
	public static EList<Stereotype> interfaceDescriptionStereotypeList = null;

	
	//=================================================================================================
	// methods
	
	//-------------------------------------------------------------------------------------------------
	/**
	 * Adds a system to the model from the SystemDesignDescription (SysDD) object that describes it
	 * 
	 * @param newSystem The SystemDesignDescription object describing the new system
	 * @param umlModel The UML Model object
	 * @return The UML PackageableElement describing the system
	 */
	public static PackageableElement addSystemDesignDescription(APXSystemDesignDescription newSystem, Model umlModel) {
		System.out.println("addSystemDesignDescription\t" + newSystem.getName()); // TODO Remove trace
		
		// Create new PackageableElement for the new system
		PackageableElement newModelSystem =  umlModel.getNearestPackage().createOwnedClass(newSystem.getName(), false);
		newModelSystem.setVisibility(VisibilityKind.PACKAGE_LITERAL);

		for (Stereotype stereotype : systemDescriptionStereotypeList) // Apply all of the SystemDesignDescription stereotypes
			newModelSystem.applyStereotype(stereotype);			

		Classifier classifier = (Classifier) newModelSystem;

		SysDD modelSystem = UMLUtil.getStereotypeApplication(classifier, SysDD.class);

		// Set the system's properties
		modelSystem.setCertificateLevel(null);
		modelSystem.setDevicedesigndesciption(null);
		
		// Clear the ports (interfaces) that the system implements
		modelSystem.getBase_Class().getOwnedPorts().clear(); // TODO Check if it's necessary
		
		ArrayList<APXInterfaceDesignDescription> newInterfaceList = newSystem.getIDDs();
		
		for(APXInterfaceDesignDescription newInterface : newInterfaceList) { // For each of the interfaces
			PackageableElement existingInterface = common.parsing.model.ParsingSetup.packageInterfaceDescriptionMap.get(newInterface.getName());
			
			// Create a new port on the existing interface (if any) or a newly created interface
			Port newPort = modelSystem.getBase_Class().createOwnedPort(newInterface.getName(), existingInterface == null 
					? (Type) addInterfaceDesignDescription(newInterface, umlModel)
					: (Type) existingInterface); 
			newPort.setName(newPort.getType().getName().substring(0,1).toLowerCase() + newPort.getType().getName().substring(1));
			newPort.setIsConjugated(newInterface.getRole().toLowerCase().equals("consumer"));
		}

		ModellingUtils.addNotation(""); // TODO Edit .notation file for the graphical representation

		return newModelSystem;
	}

	//-------------------------------------------------------------------------------------------------
	/**
	 * Updates the InterfaceDesignDescription list of a modelled SystemDesignDescription 
	 * 
	 * @param newInterfaceList A list of the new InterfaceDesignDescription objects of the system
	 * @param oldSystem The PackageableElement containing the old system
	 * @return A PackageableElement containing the new system
	 */
	public static PackageableElement updateSystemDesignDescription(ArrayList<APXInterfaceDesignDescription> newInterfaceList, PackageableElement oldSystem) {	
		System.out.println("updateSystemDesignDescription\t" + oldSystem.getName()); // TODO Remove trace
		Classifier classifier = (Classifier) oldSystem;

		SysDD modelSystem = UMLUtil.getStereotypeApplication(classifier, SysDD.class);
		
		// Set the system's properties
		modelSystem.setCertificateLevel(null);
		modelSystem.setDevicedesigndesciption(null);

		// Clear the ports (interfaces) and connectors (consuming/providing systems)
		modelSystem.getBase_Class().getOwnedPorts().clear();
		// modelSystem.getBase_Class().getOwnedConnectors().clear();
		
		for(APXInterfaceDesignDescription newInterface : newInterfaceList) { // For each of the interfaces
			PackageableElement existingInterface = common.parsing.model.ParsingSetup.packageInterfaceDescriptionMap.get(newInterface.getName());
			
			// Create a new port on the existing interface (if any) or a newly created interface
			Port newPort = modelSystem.getBase_Class().createOwnedPort(newInterface.getName(), existingInterface == null 
					? (Type) addInterfaceDesignDescription(newInterface, oldSystem.getModel())
					: (Type) existingInterface); 
			newPort.setName(newPort.getType().getName().substring(0,1).toLowerCase() + newPort.getType().getName().substring(1));
			newPort.setIsConjugated(newInterface.getRole().toLowerCase().equals("consumer"));
			
			// TODO Setup the connectors for this system (service registry)
			Connector newConnector = modelSystem.getBase_Class().createOwnedConnector(null);
			// newConnector.createEnd().setPartWithPort(modelPorts.get(0));
			// newConnector.createEnd().setRole(modelPorts.get(0));
		}

		ModellingUtils.addNotation(""); // TODO Edit .notation file for the graphical representation

		return oldSystem;
	}

	//-------------------------------------------------------------------------------------------------
	/**
	 * Updates the internal parameters of a modelled SystemDesignDescription
	 * 
	 * @param newSystem The SystemDesignDescription object describing the new system
	 * @param oldSystem The PackageableElement containing the old system
	 */
	public static void updateInternalSystemDesignDescription(APXSystemDesignDescription newSystem, PackageableElement oldSystem) {
		System.out.println("updateInternalSystemDesignDescription\t" + oldSystem.getName()); // TODO Remove trace
		// TODO Complete
	}
	
	//-------------------------------------------------------------------------------------------------
	/**
	 * Adds an interface to the model from the InterfaceDesignDescription (IDD) object that describes it
	 * 
	 * @param newInterface The InterfaceDesignDescription object describing the new interface
	 * @param umlModel The UML Model object
	 * @return The UML PackageableElement describing the interface
	 */
	public static PackageableElement addInterfaceDesignDescription(APXInterfaceDesignDescription newInterface, Model umlModel) {
		System.out.println("addInterfaceDesignDescription\t" + newInterface.getName()); // TODO Remove trace
		
		// Create new PackageableElement for the new interface
		PackageableElement newModelInterface =  umlModel.getNearestPackage().createOwnedClass(newInterface.getName(), false);
		newModelInterface.setVisibility(VisibilityKind.PACKAGE_LITERAL);

		for (Stereotype stereotype : interfaceDescriptionStereotypeList)  // Apply all of the InterfaceDesignDescription stereotypes
			newModelInterface.applyStereotype(stereotype);			

		Classifier classifier = (Classifier) newModelInterface;

		org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription modelInterface = 
				UMLUtil.getStereotypeApplication(classifier, org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription.class);

		// Set the interface's properties
		modelInterface.setProtocol(ProtocolKind.get(newInterface.getProtocol()));
		modelInterface.setEncoding(EncodingKind.get(newInterface.getEncoding()));

		modelInterface.setCompression(null);
		modelInterface.setCryptoAlgorithm(null);
		modelInterface.setIsEncapsulated(false);
		modelInterface.setPayloadEncryption(null);
		modelInterface.setSecurity(null);
		modelInterface.setTimeFormat(null);
		modelInterface.setCertificateLevel(null);
		modelInterface.setToken(null);

		EList<Operation> modelOperations = classifier.getAllOperations();
		modelOperations.clear(); // TODO Check if it's necessary
		
		for(APXServiceDescription operation : newInterface.getOperations()) { // For each of the operations
			// Set the operation's type
			BasicEList<String> stringType = new BasicEList<String>();
			stringType.add(HttpOperation.class.getName());
			
			BasicEList<Type> type = new BasicEList<Type>();
			// type.add((Type)HttpOperation.class); // TODO  Obtain type from HttpOperation.class
			
			Operation newOperation = modelInterface.getBase_Class().createOwnedOperation(operation.getName(), stringType, type);
			
			if(!operation.getRequestType().equals("String") && !operation.getRequestType().equals("")) // If the operation has a complex request
				for(APXPayload payload : operation.getRequestPayload()) {
					Parameter parameter = newOperation.createOwnedParameter(payload.getName(), null); // TODO Obtain type from payload.getType()
					parameter.setDirection(ParameterDirectionKind.IN_LITERAL);
				}
			
			if(!operation.getResponseType().equals("String") && !operation.getResponseType().equals("")) // If the operation has a complex response
				for(APXPayload payload : operation.getResponsePayload()) {
					Parameter parameter = newOperation.createOwnedParameter(payload.getName(), null); // TODO Obtain type from payload.getType()
					parameter.setDirection(ParameterDirectionKind.RETURN_LITERAL);
				}
		}	

		ModellingUtils.addNotation(""); // TODO Edit .notation file for the graphical representation
		
		return newModelInterface;
	}

	//-------------------------------------------------------------------------------------------------
	/**
	 * Updates the ServiceDescription list of a modelled InterfaceDesignDescription 
	 * 
	 * @param newOperationList A list of the new ServiceDescription objects of the system
	 * @param oldInterface The PackageableElement containing the old interface
	 */
	public static void updateInterfaceDesignDescription(ArrayList<APXServiceDescription> newOperationList, PackageableElement oldInterface) {
		System.out.println("updateInterfaceDesignDescription\t" + oldInterface.getName()); // TODO Remove trace
		System.out.println(newOperationList);
		// TODO Complete
	}
	
	//-------------------------------------------------------------------------------------------------
	/**
	 * Updates the internal parameters of a modelled InterfaceDesignDescription
	 * 
	 * @param newInterface The InterfaceDesignDescription object describing the new system
	 * @param oldInterface The PackageableElement containing the old interface
	 * @return A PackageableElement containing the new interface
	 */
	public static void updateInternalInterfaceDesignDescription(APXInterfaceDesignDescription newInterface, PackageableElement oldInterface) {
		System.out.println("updateInternalInterfaceDesignDescription\t" + oldInterface.getName()); // TODO Remove trace
		// TODO Complete
	}
	
	//-------------------------------------------------------------------------------------------------
	/**
	 * Adds an new payload to the model from the Payload object that describes it
	 * 
	 * @param newPayload The Payload object describing the new payload
	 * @param umlModel The UML Model object
	 */
	public static void addPayload(APXPayload newPayload, Model umlModel) {
		// TODO Complete
	}

}
