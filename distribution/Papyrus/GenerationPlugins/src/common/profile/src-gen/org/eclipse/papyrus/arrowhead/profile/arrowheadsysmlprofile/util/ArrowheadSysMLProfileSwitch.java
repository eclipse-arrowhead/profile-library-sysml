/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.*;

import org.eclipse.papyrus.sysml16.blocks.Block;

import org.eclipse.papyrus.sysml16.portsandflows.InterfaceBlock;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage
 * @generated
 */
public class ArrowheadSysMLProfileSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArrowheadSysMLProfilePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrowheadSysMLProfileSwitch() {
		if (modelPackage == null) {
			modelPackage = ArrowheadSysMLProfilePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ArrowheadSysMLProfilePackage.SYS_D: {
				SysD sysD = (SysD)theEObject;
				T result = caseSysD(sysD);
				if (result == null) result = caseBlock(sysD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN: {
				DeviceDesign deviceDesign = (DeviceDesign)theEObject;
				T result = caseDeviceDesign(deviceDesign);
				if (result == null) result = caseBlock(deviceDesign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.NETWORK_DESIGN: {
				NetworkDesign networkDesign = (NetworkDesign)theEObject;
				T result = caseNetworkDesign(networkDesign);
				if (result == null) result = caseBlock(networkDesign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.SYS_DD: {
				SysDD sysDD = (SysDD)theEObject;
				T result = caseSysDD(sysDD);
				if (result == null) result = caseBlock(sysDD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCIPTION: {
				DeviceDesignDesciption deviceDesignDesciption = (DeviceDesignDesciption)theEObject;
				T result = caseDeviceDesignDesciption(deviceDesignDesciption);
				if (result == null) result = caseBlock(deviceDesignDesciption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.NETWORK_DESIGN_DESCRIPTIION: {
				NetworkDesignDescriptiion networkDesignDescriptiion = (NetworkDesignDescriptiion)theEObject;
				T result = caseNetworkDesignDescriptiion(networkDesignDescriptiion);
				if (result == null) result = caseBlock(networkDesignDescriptiion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION: {
				InterfaceDesignDescription interfaceDesignDescription = (InterfaceDesignDescription)theEObject;
				T result = caseInterfaceDesignDescription(interfaceDesignDescription);
				if (result == null) result = caseServiceDescription(interfaceDesignDescription);
				if (result == null) result = caseInterfaceBlock(interfaceDesignDescription);
				if (result == null) result = caseBlock(interfaceDesignDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.SERVICE_DESCRIPTION: {
				ServiceDescription serviceDescription = (ServiceDescription)theEObject;
				T result = caseServiceDescription(serviceDescription);
				if (result == null) result = caseInterfaceBlock(serviceDescription);
				if (result == null) result = caseBlock(serviceDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.SUBSET_OF: {
				SubsetOf subsetOf = (SubsetOf)theEObject;
				T result = caseSubsetOf(subsetOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.DEVICE: {
				Device device = (Device)theEObject;
				T result = caseDevice(device);
				if (result == null) result = caseBlock(device);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.META_DATA_ENTRY: {
				MetaDataEntry metaDataEntry = (MetaDataEntry)theEObject;
				T result = caseMetaDataEntry(metaDataEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.DEPLOYED_SERVICE: {
				DeployedService deployedService = (DeployedService)theEObject;
				T result = caseDeployedService(deployedService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.LOCAL_CLOUD_DESIGN: {
				LocalCloudDesign localCloudDesign = (LocalCloudDesign)theEObject;
				T result = caseLocalCloudDesign(localCloudDesign);
				if (result == null) result = caseBlock(localCloudDesign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.LOCAL_CLOUD_DESIGN_DESCRIPTION: {
				LocalCLoudDesignDescription localCLoudDesignDescription = (LocalCLoudDesignDescription)theEObject;
				T result = caseLocalCLoudDesignDescription(localCLoudDesignDescription);
				if (result == null) result = caseBlock(localCLoudDesignDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.DEPLOYED_DEVICE: {
				DeployedDevice deployedDevice = (DeployedDevice)theEObject;
				T result = caseDeployedDevice(deployedDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.DEPLOYED_LOCAL_CLOUD: {
				DeployedLocalCloud deployedLocalCloud = (DeployedLocalCloud)theEObject;
				T result = caseDeployedLocalCloud(deployedLocalCloud);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.DATA_SEMANTICS: {
				DataSemantics dataSemantics = (DataSemantics)theEObject;
				T result = caseDataSemantics(dataSemantics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.DEPLOYED_ENTITY: {
				DeployedEntity deployedEntity = (DeployedEntity)theEObject;
				T result = caseDeployedEntity(deployedEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM: {
				ServiceRegistryForm serviceRegistryForm = (ServiceRegistryForm)theEObject;
				T result = caseServiceRegistryForm(serviceRegistryForm);
				if (result == null) result = caseDataSemantics(serviceRegistryForm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.SYSTEM_REGISTRY_FORM: {
				SystemRegistryForm systemRegistryForm = (SystemRegistryForm)theEObject;
				T result = caseSystemRegistryForm(systemRegistryForm);
				if (result == null) result = caseDataSemantics(systemRegistryForm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.DEVICE_REGISTRY_FORM: {
				DeviceRegistryForm deviceRegistryForm = (DeviceRegistryForm)theEObject;
				T result = caseDeviceRegistryForm(deviceRegistryForm);
				if (result == null) result = caseDataSemantics(deviceRegistryForm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.CERTIFICATE_CREATION_FORM: {
				CertificateCreationForm certificateCreationForm = (CertificateCreationForm)theEObject;
				T result = caseCertificateCreationForm(certificateCreationForm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_DESIGN: {
				SystemofLocalCloudsDesign systemofLocalCloudsDesign = (SystemofLocalCloudsDesign)theEObject;
				T result = caseSystemofLocalCloudsDesign(systemofLocalCloudsDesign);
				if (result == null) result = caseBlock(systemofLocalCloudsDesign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_DESIGN_DESCRIPTION: {
				SystemofLocalCloudsDesignDescription systemofLocalCloudsDesignDescription = (SystemofLocalCloudsDesignDescription)theEObject;
				T result = caseSystemofLocalCloudsDesignDescription(systemofLocalCloudsDesignDescription);
				if (result == null) result = caseBlock(systemofLocalCloudsDesignDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.NETWORK: {
				Network network = (Network)theEObject;
				T result = caseNetwork(network);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.APPLICATION_SYS_DDHTTP: {
				ApplicationSysDDHTTP applicationSysDDHTTP = (ApplicationSysDDHTTP)theEObject;
				T result = caseApplicationSysDDHTTP(applicationSysDDHTTP);
				if (result == null) result = caseBlock(applicationSysDDHTTP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_DEPLOYED: {
				SystemofLocalCloudsDeployed systemofLocalCloudsDeployed = (SystemofLocalCloudsDeployed)theEObject;
				T result = caseSystemofLocalCloudsDeployed(systemofLocalCloudsDeployed);
				if (result == null) result = caseBlock(systemofLocalCloudsDeployed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.LOCAL_CLOUD_DEPLOYED: {
				LocalCloudDeployed localCloudDeployed = (LocalCloudDeployed)theEObject;
				T result = caseLocalCloudDeployed(localCloudDeployed);
				if (result == null) result = caseBlock(localCloudDeployed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.DEVICE_DEPLOYED: {
				DeviceDeployed deviceDeployed = (DeviceDeployed)theEObject;
				T result = caseDeviceDeployed(deviceDeployed);
				if (result == null) result = caseBlock(deviceDeployed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.NETWORK_DEPLOYED: {
				NetworkDeployed networkDeployed = (NetworkDeployed)theEObject;
				T result = caseNetworkDeployed(networkDeployed);
				if (result == null) result = caseBlock(networkDeployed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.SDDD: {
				SDDD sddd = (SDDD)theEObject;
				T result = caseSDDD(sddd);
				if (result == null) result = caseServiceDescription(sddd);
				if (result == null) result = caseInterfaceBlock(sddd);
				if (result == null) result = caseBlock(sddd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.MQTT_TOPIC: {
				MQTT_topic mqtT_topic = (MQTT_topic)theEObject;
				T result = caseMQTT_topic(mqtT_topic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.HTTP_OPERATION: {
				HttpOperation httpOperation = (HttpOperation)theEObject;
				T result = caseHttpOperation(httpOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.SYSTEM_REQUIREMENTS: {
				SystemRequirements systemRequirements = (SystemRequirements)theEObject;
				T result = caseSystemRequirements(systemRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.NETWORK_REQUIREMENTS: {
				NetworkRequirements networkRequirements = (NetworkRequirements)theEObject;
				T result = caseNetworkRequirements(networkRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.LOCA_CLOUD_REQUIREMENTS: {
				LocaCloudRequirements locaCloudRequirements = (LocaCloudRequirements)theEObject;
				T result = caseLocaCloudRequirements(locaCloudRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_REQUIREMENTS: {
				SystemofLocalCloudsRequirements systemofLocalCloudsRequirements = (SystemofLocalCloudsRequirements)theEObject;
				T result = caseSystemofLocalCloudsRequirements(systemofLocalCloudsRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.DEVICE_REQUIREMENTS: {
				DeviceRequirements deviceRequirements = (DeviceRequirements)theEObject;
				T result = caseDeviceRequirements(deviceRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_MAINTENANCE: {
				SystemofLocalCloudsMaintenance systemofLocalCloudsMaintenance = (SystemofLocalCloudsMaintenance)theEObject;
				T result = caseSystemofLocalCloudsMaintenance(systemofLocalCloudsMaintenance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_EVOLUTION: {
				SystemofLocalCloudsEvolution systemofLocalCloudsEvolution = (SystemofLocalCloudsEvolution)theEObject;
				T result = caseSystemofLocalCloudsEvolution(systemofLocalCloudsEvolution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.LOCAL_CLOUD_MAINTENANCE: {
				LocalCloudMaintenance localCloudMaintenance = (LocalCloudMaintenance)theEObject;
				T result = caseLocalCloudMaintenance(localCloudMaintenance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.LOCAL_CLOUD_EVOLUTION: {
				LocalCloudEvolution localCloudEvolution = (LocalCloudEvolution)theEObject;
				T result = caseLocalCloudEvolution(localCloudEvolution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.SYS_MAINTENANCE: {
				SysMaintenance sysMaintenance = (SysMaintenance)theEObject;
				T result = caseSysMaintenance(sysMaintenance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.SYS_IMPLEMENTATION: {
				SysImplementation sysImplementation = (SysImplementation)theEObject;
				T result = caseSysImplementation(sysImplementation);
				if (result == null) result = caseBlock(sysImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.LOCAL_CLOUD_IMPLEMENTATION: {
				LocalCLoudImplementation localCLoudImplementation = (LocalCLoudImplementation)theEObject;
				T result = caseLocalCLoudImplementation(localCLoudImplementation);
				if (result == null) result = caseBlock(localCLoudImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_IMPLEMENTATION: {
				SystemofLocalCloudsImplementation systemofLocalCloudsImplementation = (SystemofLocalCloudsImplementation)theEObject;
				T result = caseSystemofLocalCloudsImplementation(systemofLocalCloudsImplementation);
				if (result == null) result = caseBlock(systemofLocalCloudsImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.DEVICE_IMPLEMENTATION: {
				DeviceImplementation deviceImplementation = (DeviceImplementation)theEObject;
				T result = caseDeviceImplementation(deviceImplementation);
				if (result == null) result = caseBlock(deviceImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.NETWORK_IMPLEMENTATION: {
				NetworkImplementation networkImplementation = (NetworkImplementation)theEObject;
				T result = caseNetworkImplementation(networkImplementation);
				if (result == null) result = caseBlock(networkImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.DEVICE_MAINTENANCE: {
				DeviceMaintenance deviceMaintenance = (DeviceMaintenance)theEObject;
				T result = caseDeviceMaintenance(deviceMaintenance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.NETWORK_MAINTENANCE: {
				NetworkMaintenance networkMaintenance = (NetworkMaintenance)theEObject;
				T result = caseNetworkMaintenance(networkMaintenance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.SYS_EVOLUTION: {
				SysEvolution sysEvolution = (SysEvolution)theEObject;
				T result = caseSysEvolution(sysEvolution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.DEVICE_EVOLUTION: {
				DeviceEvolution deviceEvolution = (DeviceEvolution)theEObject;
				T result = caseDeviceEvolution(deviceEvolution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.NETWORK_EVOLUTION: {
				NetworkEvolution networkEvolution = (NetworkEvolution)theEObject;
				T result = caseNetworkEvolution(networkEvolution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.DEPLOYMENT: {
				Deployment deployment = (Deployment)theEObject;
				T result = caseDeployment(deployment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.REQUIREMENTS: {
				Requirements requirements = (Requirements)theEObject;
				T result = caseRequirements(requirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.FUNCTIONAL_DESIGN: {
				FunctionalDesign functionalDesign = (FunctionalDesign)theEObject;
				T result = caseFunctionalDesign(functionalDesign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.PROCUREMENT_ENGINEERING: {
				ProcurementEngineering procurementEngineering = (ProcurementEngineering)theEObject;
				T result = caseProcurementEngineering(procurementEngineering);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.MAINTENANCE: {
				Maintenance maintenance = (Maintenance)theEObject;
				T result = caseMaintenance(maintenance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.EVOLUTION: {
				Evolution evolution = (Evolution)theEObject;
				T result = caseEvolution(evolution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.SYS_DEPLOYED: {
				SysDeployed sysDeployed = (SysDeployed)theEObject;
				T result = caseSysDeployed(sysDeployed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.CHOREOGRAPHY_DEFINITION: {
				ChoreographyDefinition choreographyDefinition = (ChoreographyDefinition)theEObject;
				T result = caseChoreographyDefinition(choreographyDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sys D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sys D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSysD(SysD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Design</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Design</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceDesign(DeviceDesign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Design</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Design</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkDesign(NetworkDesign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sys DD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sys DD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSysDD(SysDD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Design Desciption</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Design Desciption</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceDesignDesciption(DeviceDesignDesciption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Design Descriptiion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Design Descriptiion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkDesignDescriptiion(NetworkDesignDescriptiion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Design Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Design Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceDesignDescription(InterfaceDesignDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceDescription(ServiceDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subset Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subset Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubsetOf(SubsetOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevice(Device object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Data Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Data Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaDataEntry(MetaDataEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployed Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployed Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeployedService(DeployedService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Cloud Design</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Cloud Design</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalCloudDesign(LocalCloudDesign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local CLoud Design Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local CLoud Design Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalCLoudDesignDescription(LocalCLoudDesignDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployed Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployed Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeployedDevice(DeployedDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployed Local Cloud</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployed Local Cloud</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeployedLocalCloud(DeployedLocalCloud object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Semantics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Semantics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSemantics(DataSemantics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployed Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployed Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeployedEntity(DeployedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Registry Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Registry Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceRegistryForm(ServiceRegistryForm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Registry Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Registry Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemRegistryForm(SystemRegistryForm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Registry Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Registry Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceRegistryForm(DeviceRegistryForm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Certificate Creation Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Certificate Creation Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCertificateCreationForm(CertificateCreationForm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Systemof Local Clouds Design</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Systemof Local Clouds Design</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemofLocalCloudsDesign(SystemofLocalCloudsDesign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Systemof Local Clouds Design Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Systemof Local Clouds Design Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemofLocalCloudsDesignDescription(SystemofLocalCloudsDesignDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetwork(Network object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Sys DDHTTP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Sys DDHTTP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationSysDDHTTP(ApplicationSysDDHTTP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Systemof Local Clouds Deployed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Systemof Local Clouds Deployed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemofLocalCloudsDeployed(SystemofLocalCloudsDeployed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Cloud Deployed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Cloud Deployed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalCloudDeployed(LocalCloudDeployed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Deployed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Deployed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceDeployed(DeviceDeployed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Deployed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Deployed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkDeployed(NetworkDeployed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SDDD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SDDD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSDDD(SDDD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MQTT topic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MQTT topic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMQTT_topic(MQTT_topic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Http Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Http Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHttpOperation(HttpOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemRequirements(SystemRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkRequirements(NetworkRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loca Cloud Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loca Cloud Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocaCloudRequirements(LocaCloudRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Systemof Local Clouds Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Systemof Local Clouds Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemofLocalCloudsRequirements(SystemofLocalCloudsRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceRequirements(DeviceRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Systemof Local Clouds Maintenance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Systemof Local Clouds Maintenance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemofLocalCloudsMaintenance(SystemofLocalCloudsMaintenance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Systemof Local Clouds Evolution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Systemof Local Clouds Evolution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemofLocalCloudsEvolution(SystemofLocalCloudsEvolution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Cloud Maintenance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Cloud Maintenance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalCloudMaintenance(LocalCloudMaintenance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Cloud Evolution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Cloud Evolution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalCloudEvolution(LocalCloudEvolution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sys Maintenance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sys Maintenance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSysMaintenance(SysMaintenance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sys Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sys Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSysImplementation(SysImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local CLoud Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local CLoud Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalCLoudImplementation(LocalCLoudImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Systemof Local Clouds Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Systemof Local Clouds Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemofLocalCloudsImplementation(SystemofLocalCloudsImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceImplementation(DeviceImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkImplementation(NetworkImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Maintenance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Maintenance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceMaintenance(DeviceMaintenance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Maintenance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Maintenance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkMaintenance(NetworkMaintenance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sys Evolution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sys Evolution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSysEvolution(SysEvolution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Evolution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Evolution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceEvolution(DeviceEvolution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Evolution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Evolution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkEvolution(NetworkEvolution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeployment(Deployment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirements(Requirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Design</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Design</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalDesign(FunctionalDesign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procurement Engineering</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procurement Engineering</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcurementEngineering(ProcurementEngineering object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maintenance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maintenance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaintenance(Maintenance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evolution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evolution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvolution(Evolution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sys Deployed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sys Deployed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSysDeployed(SysDeployed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choreography Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choreography Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoreographyDefinition(ChoreographyDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceBlock(InterfaceBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ArrowheadSysMLProfileSwitch
