package common.parsing.model;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.HttpOperation;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.util.UMLUtil;

import common.dto.APXInterfaceDesignDescription;
import common.dto.APXSystemDesignDescription;
import common.dto.APXInterfaceDesignDescription.APXServiceDescription;
import common.dto.APXInterfaceDesignDescription.APXServiceDescription.APXPayload;

/**
 *
 * This class parses the definition elements of the model, which are those blocks implementing
 * the SystemDesignDescription (SysDD) or InterfaceDesignDescription (IDD) stereotypes.
 * 
 * @author fernand0labra
 * 
 */
public class DefinitionParser {

	//=================================================================================================
	// methods
	
	//-------------------------------------------------------------------------------------------------
	/**
	 * Parses a system from a packageable element that potentially implements the SystemDesignDescription
	 * (SysDD) stereotype.
	 * 
	 * @param element The packageable element of the block
	 * @return The parsed SystemDesignDescription (SysDD)
	 */
	public static APXSystemDesignDescription parseSystem(PackageableElement element) {
		Classifier classifier = (Classifier) element;

		APXSystemDesignDescription systemDescription = new APXSystemDesignDescription();
		org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysDD modelSystem = 
				UMLUtil.getStereotypeApplication(classifier, org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysDD.class);

		// Set name of the system
		systemDescription.setName(element.getName());

		// Get the ports of the system (implemented interfaces)
		EList<Port> modelPorts = modelSystem.getBase_Class().getOwnedPorts();
		for (Port modelPort : modelPorts) { // For each of the interfaces
			
			// Get a copy of the interface from the parsed interfaces map
			APXInterfaceDesignDescription portInterface = new APXInterfaceDesignDescription(ParsingSetup.modelInterfaceDescriptionMap.get(modelPort.getType().getName()));

			// Set role of the interface
			portInterface.setRole(modelPort.isConjugated() ? "Consumer" : "Provider");
			
			// Set role of the system
			boolean providerConsumer = (portInterface.getRole().equals("Provider") && systemDescription.getRole().equals("Consumer")) ||
					(portInterface.getRole().equals("Consumer") && systemDescription.getRole().equals("Provider"));
			
			if(providerConsumer)
				systemDescription.setRole("ProviderConsumer");
			else if(!systemDescription.getRole().equals("ProviderConsumer"))
				systemDescription.setRole(portInterface.getRole());
			
			// Add interface as long as it's not included already
			if(!systemDescription.getIDDs().contains(portInterface))
				systemDescription.getIDDs().add(portInterface);			
		}

		return systemDescription;
	}

	//-------------------------------------------------------------------------------------------------
	/**
	 * Parses an interface from a packageable element that potentially implements the InterfaceDesignDescription
	 * (IDD) stereotype.
	 * 
	 * @param element The packageable element of the block
	 * @return The parsed InterfaceDesignDescription (IDD)
	 */
	public static APXInterfaceDesignDescription parseInterface(PackageableElement element) {
		Classifier classifier = (Classifier) element;

		APXInterfaceDesignDescription interfaceDescription = new APXInterfaceDesignDescription();
		InterfaceDesignDescription modelInterface = UMLUtil.getStereotypeApplication(classifier, InterfaceDesignDescription.class);

		// Set name, protocol and encoding of the interface
		interfaceDescription.setName(element.getName());
		interfaceDescription.setProtocol(modelInterface.getProtocol().toString());
		interfaceDescription.setEncoding(modelInterface.getEncoding().toString());
		
		// Get the operations of the interface
		EList<Operation> modelOperations = classifier.getAllOperations();
		ArrayList<APXServiceDescription> operationList = new ArrayList<APXServiceDescription>();

		for (Operation modelOperation : modelOperations) { // For each of the operations		
			APXServiceDescription operation = interfaceDescription . new APXServiceDescription();
			modelOperation = UMLUtil.getStereotypeApplication(modelOperation, HttpOperation.class).getBase_Operation();
			
			// Set name and method of the operation
			operation.setName(modelOperation.getName());
			operation.setPath("/" + modelOperation.getName());
			operation.setMethod(UMLUtil.getStereotypeApplication(modelOperation, HttpOperation.class).getKind().toString());

			// Get the parameters of the operation
			EList<org.eclipse.uml2.uml.Parameter> modelParameters = modelOperation.getOwnedParameters(); 

			for(org.eclipse.uml2.uml.Parameter modelParameter : modelParameters) { // For each of the parameters
				APXPayload payload = operation . new APXPayload();
				Type parameterType = modelParameter.getType();

				if(parameterType != null) {

					// Set name and type of the parameter
					payload.setName(modelParameter.getName());
					payload.setType(parameterType.getName());

					// If it is a request parameter
					if(modelParameter.getDirection().getName().equals("in")) { // Request
						if(operation.getRequestType().equals("")) // If the request type was not set
							operation.setRequestType(operation.getName().substring(0, 1).toUpperCase() + operation.getName().substring(1) + "RequestDTO");
						operation.getRequestPayload().add(payload);
					}

					// If it is a response parameter
					else if(modelParameter.getDirection().getName().equals("return")) { // Response
						if(operation.getResponseType().equals("")) // If the response type was not set
							operation.setResponseType(operation.getName().substring(0, 1).toUpperCase() + operation.getName().substring(1) + "ResponseDTO");
						operation.getResponsePayload().add(payload);
					}		

				}
			}

			operationList.add(operation);
		}

		interfaceDescription.setOperations(operationList);
		
		return interfaceDescription;
	}

}
