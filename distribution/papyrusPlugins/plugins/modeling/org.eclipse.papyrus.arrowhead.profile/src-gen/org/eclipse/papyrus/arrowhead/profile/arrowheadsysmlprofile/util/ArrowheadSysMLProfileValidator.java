/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage
 * @generated
 */
public class ArrowheadSysMLProfileValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ArrowheadSysMLProfileValidator INSTANCE = new ArrowheadSysMLProfileValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrowheadSysMLProfileValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ArrowheadSysMLProfilePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ArrowheadSysMLProfilePackage.SYS_D:
				return validateSysD((SysD)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN:
				return validateDeviceDesign((DeviceDesign)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.NETWORK_DESIGN:
				return validateNetworkDesign((NetworkDesign)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.SYS_DD:
				return validateSysDD((SysDD)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCIPTION:
				return validateDeviceDesignDesciption((DeviceDesignDesciption)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.NETWORK_DESIGN_DESCRIPTIION:
				return validateNetworkDesignDescriptiion((NetworkDesignDescriptiion)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION:
				return validateInterfaceDesignDescription((InterfaceDesignDescription)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.SERVICE_DESCRIPTION:
				return validateServiceDescription((ServiceDescription)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.SUBSET_OF:
				return validateSubsetOf((SubsetOf)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.DEVICE:
				return validateDevice((Device)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.META_DATA_ENTRY:
				return validateMetaDataEntry((MetaDataEntry)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.DEPLOYED_SERVICE:
				return validateDeployedService((DeployedService)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.LOCAL_CLOUD_DESIGN:
				return validateLocalCloudDesign((LocalCloudDesign)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.LOCAL_CLOUD_DESIGN_DESCRIPTION:
				return validateLocalCLoudDesignDescription((LocalCLoudDesignDescription)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.DEPLOYED_DEVICE:
				return validateDeployedDevice((DeployedDevice)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.DEPLOYED_LOCAL_CLOUD:
				return validateDeployedLocalCloud((DeployedLocalCloud)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.DATA_SEMANTICS:
				return validateDataSemantics((DataSemantics)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.DEPLOYED_ENTITY:
				return validateDeployedEntity((DeployedEntity)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM:
				return validateServiceRegistryForm((ServiceRegistryForm)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.SYSTEM_REGISTRY_FORM:
				return validateSystemRegistryForm((SystemRegistryForm)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.DEVICE_REGISTRY_FORM:
				return validateDeviceRegistryForm((DeviceRegistryForm)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.CERTIFICATE_CREATION_FORM:
				return validateCertificateCreationForm((CertificateCreationForm)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_DESIGN:
				return validateSystemofLocalCloudsDesign((SystemofLocalCloudsDesign)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_DESIGN_DESCRIPTION:
				return validateSystemofLocalCloudsDesignDescription((SystemofLocalCloudsDesignDescription)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.NETWORK:
				return validateNetwork((Network)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.APPLICATION_SYS_DDHTTP:
				return validateApplicationSysDDHTTP((ApplicationSysDDHTTP)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_DEPLOYED:
				return validateSystemofLocalCloudsDeployed((SystemofLocalCloudsDeployed)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.LOCAL_CLOUD_DEPLOYED:
				return validateLocalCloudDeployed((LocalCloudDeployed)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.DEVICE_DEPLOYED:
				return validateDeviceDeployed((DeviceDeployed)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.NETWORK_DEPLOYED:
				return validateNetworkDeployed((NetworkDeployed)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.SDDD:
				return validateSDDD((SDDD)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.MQTT_TOPIC:
				return validateMQTT_topic((MQTT_topic)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.HTTP_OPERATION:
				return validateHttpOperation((HttpOperation)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.SYSTEM_REQUIREMENTS:
				return validateSystemRequirements((SystemRequirements)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.NETWORK_REQUIREMENTS:
				return validateNetworkRequirements((NetworkRequirements)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.LOCA_CLOUD_REQUIREMENTS:
				return validateLocaCloudRequirements((LocaCloudRequirements)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_REQUIREMENTS:
				return validateSystemofLocalCloudsRequirements((SystemofLocalCloudsRequirements)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.DEVICE_REQUIREMENTS:
				return validateDeviceRequirements((DeviceRequirements)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_MAINTENANCE:
				return validateSystemofLocalCloudsMaintenance((SystemofLocalCloudsMaintenance)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_EVOLUTION:
				return validateSystemofLocalCloudsEvolution((SystemofLocalCloudsEvolution)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.LOCAL_CLOUD_MAINTENANCE:
				return validateLocalCloudMaintenance((LocalCloudMaintenance)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.LOCAL_CLOUD_EVOLUTION:
				return validateLocalCloudEvolution((LocalCloudEvolution)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.SYS_MAINTENANCE:
				return validateSysMaintenance((SysMaintenance)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.SYS_IMPLEMENTATION:
				return validateSysImplementation((SysImplementation)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.LOCAL_CLOUD_IMPLEMENTATION:
				return validateLocalCLoudImplementation((LocalCLoudImplementation)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_IMPLEMENTATION:
				return validateSystemofLocalCloudsImplementation((SystemofLocalCloudsImplementation)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.DEVICE_IMPLEMENTATION:
				return validateDeviceImplementation((DeviceImplementation)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.NETWORK_IMPLEMENTATION:
				return validateNetworkImplementation((NetworkImplementation)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.DEVICE_MAINTENANCE:
				return validateDeviceMaintenance((DeviceMaintenance)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.NETWORK_MAINTENANCE:
				return validateNetworkMaintenance((NetworkMaintenance)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.SYS_EVOLUTION:
				return validateSysEvolution((SysEvolution)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.DEVICE_EVOLUTION:
				return validateDeviceEvolution((DeviceEvolution)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.NETWORK_EVOLUTION:
				return validateNetworkEvolution((NetworkEvolution)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.DEPLOYMENT:
				return validateDeployment((Deployment)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.REQUIREMENTS:
				return validateRequirements((Requirements)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.FUNCTIONAL_DESIGN:
				return validateFunctionalDesign((FunctionalDesign)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.PROCUREMENT_ENGINEERING:
				return validateProcurementEngineering((ProcurementEngineering)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.MAINTENANCE:
				return validateMaintenance((Maintenance)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.EVOLUTION:
				return validateEvolution((Evolution)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.SYS_DEPLOYED:
				return validateSysDeployed((SysDeployed)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.CHOREOGRAPHY_DEFINITION:
				return validateChoreographyDefinition((ChoreographyDefinition)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.CERTIFICATE_KIND:
				return validateCertificateKind((CertificateKind)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.ENCODING_KIND:
				return validateEncodingKind((EncodingKind)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.SECURITY_KIND:
				return validateSecurityKind((SecurityKind)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.PROTOCOL_KIND:
				return validateProtocolKind((ProtocolKind)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.COMPRESION_KIND:
				return validateCompresionKind((CompresionKind)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.CRYPTO_ALGORITHM_KIND:
				return validateCryptoAlgorithmKind((CryptoAlgorithmKind)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.TOKEN_KIND:
				return validateTokenKind((TokenKind)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.PAYLOAD_ENCRYPTION_KIND:
				return validatePayloadEncryptionKind((PayloadEncryptionKind)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.TIME_FORMAT_KIND:
				return validateTimeFormatKind((TimeFormatKind)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.ONTOLOGY_KIND:
				return validateOntologyKind((OntologyKind)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.HTTP_METHOD_KIND:
				return validateHttpMethodKind((HttpMethodKind)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.SEMANTICS_KIND:
				return validateSemanticsKind((SemanticsKind)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.INSTANCE_NAMING_STANDARD_KIND:
				return validateInstanceNamingStandardKind((InstanceNamingStandardKind)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.STATUS_CODE_KIND:
				return validateStatusCodeKind((StatusCodeKind)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.CO_AP_METOD_KIND:
				return validateCoAPMetodKind((CoAPMetodKind)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.SCHEMA_TYPE:
				return validateSchemaType((SchemaType)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.PHYSICAL_LAYER_KIND:
				return validatePhysicalLayerKind((PhysicalLayerKind)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.MAC_KIND:
				return validateMacKind((MacKind)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.ENGINEERING_PROCEDURE_KIND:
				return validateEngineeringProcedureKind((EngineeringProcedureKind)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.OS_KIND:
				return validateOSKind((OSKind)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.LINUX_KIND:
				return validateLinuxKind((LinuxKind)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.DEPLOYMENT_LOCATION_KIND:
				return validateDeploymentLocationKind((DeploymentLocationKind)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.DEPLOYMENT_TIME_KIND:
				return validateDeploymentTimeKind((DeploymentTimeKind)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.DEVICE_KIND:
				return validateDeviceKind((DeviceKind)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.PROCESSORT_KIND:
				return validateProcessortKind((ProcessortKind)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSysD(SysD sysD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sysD, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceDesign(DeviceDesign deviceDesign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceDesign, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkDesign(NetworkDesign networkDesign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(networkDesign, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSysDD(SysDD sysDD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sysDD, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sysDD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sysDD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sysDD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sysDD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sysDD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sysDD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sysDD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sysDD, diagnostics, context);
		if (result || diagnostics != null) result &= validateSysDD_Deployed(sysDD, diagnostics, context);
		if (result || diagnostics != null) result &= validateSysDD_at(sysDD, diagnostics, context);
		if (result || diagnostics != null) result &= validateSysDD_Device(sysDD, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Deployed constraint of '<em>Sys DD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSysDD_Deployed(SysDD sysDD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "Deployed", getObjectLabel(sysDD, context) },
						 new Object[] { sysDD },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the at constraint of '<em>Sys DD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSysDD_at(SysDD sysDD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "at", getObjectLabel(sysDD, context) },
						 new Object[] { sysDD },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the Device constraint of '<em>Sys DD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSysDD_Device(SysDD sysDD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "Device", getObjectLabel(sysDD, context) },
						 new Object[] { sysDD },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceDesignDesciption(DeviceDesignDesciption deviceDesignDesciption, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceDesignDesciption, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkDesignDescriptiion(NetworkDesignDescriptiion networkDesignDescriptiion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(networkDesignDescriptiion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceDesignDescription(InterfaceDesignDescription interfaceDesignDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interfaceDesignDescription, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceDescription(ServiceDescription serviceDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceDescription, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubsetOf(SubsetOf subsetOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subsetOf, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDevice(Device device, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(device, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetaDataEntry(MetaDataEntry metaDataEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(metaDataEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeployedService(DeployedService deployedService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(deployedService, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(deployedService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(deployedService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(deployedService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(deployedService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(deployedService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(deployedService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(deployedService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(deployedService, diagnostics, context);
		if (result || diagnostics != null) result &= validateDeployedService_unnamed1(deployedService, diagnostics, context);
		return result;
	}

	/**
	 * Validates the unnamed1 constraint of '<em>Deployed Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeployedService_unnamed1(DeployedService deployedService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "unnamed1", getObjectLabel(deployedService, context) },
						 new Object[] { deployedService },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalCloudDesign(LocalCloudDesign localCloudDesign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(localCloudDesign, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalCLoudDesignDescription(LocalCLoudDesignDescription localCLoudDesignDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(localCLoudDesignDescription, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeployedDevice(DeployedDevice deployedDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deployedDevice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeployedLocalCloud(DeployedLocalCloud deployedLocalCloud, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deployedLocalCloud, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataSemantics(DataSemantics dataSemantics, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataSemantics, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeployedEntity(DeployedEntity deployedEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deployedEntity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceRegistryForm(ServiceRegistryForm serviceRegistryForm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceRegistryForm, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemRegistryForm(SystemRegistryForm systemRegistryForm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemRegistryForm, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceRegistryForm(DeviceRegistryForm deviceRegistryForm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceRegistryForm, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCertificateCreationForm(CertificateCreationForm certificateCreationForm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(certificateCreationForm, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemofLocalCloudsDesign(SystemofLocalCloudsDesign systemofLocalCloudsDesign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemofLocalCloudsDesign, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemofLocalCloudsDesignDescription(SystemofLocalCloudsDesignDescription systemofLocalCloudsDesignDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemofLocalCloudsDesignDescription, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetwork(Network network, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(network, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(network, diagnostics, context);
		if (result || diagnostics != null) result &= validateNetwork_MAC(network, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MAC constraint of '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetwork_MAC(Network network, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "MAC", getObjectLabel(network, context) },
						 new Object[] { network },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplicationSysDDHTTP(ApplicationSysDDHTTP applicationSysDDHTTP, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(applicationSysDDHTTP, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemofLocalCloudsDeployed(SystemofLocalCloudsDeployed systemofLocalCloudsDeployed, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemofLocalCloudsDeployed, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalCloudDeployed(LocalCloudDeployed localCloudDeployed, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(localCloudDeployed, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceDeployed(DeviceDeployed deviceDeployed, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceDeployed, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkDeployed(NetworkDeployed networkDeployed, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(networkDeployed, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSDDD(SDDD sddd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sddd, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMQTT_topic(MQTT_topic mqtT_topic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mqtT_topic, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHttpOperation(HttpOperation httpOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(httpOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemRequirements(SystemRequirements systemRequirements, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemRequirements, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkRequirements(NetworkRequirements networkRequirements, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(networkRequirements, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocaCloudRequirements(LocaCloudRequirements locaCloudRequirements, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(locaCloudRequirements, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemofLocalCloudsRequirements(SystemofLocalCloudsRequirements systemofLocalCloudsRequirements, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemofLocalCloudsRequirements, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceRequirements(DeviceRequirements deviceRequirements, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceRequirements, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemofLocalCloudsMaintenance(SystemofLocalCloudsMaintenance systemofLocalCloudsMaintenance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemofLocalCloudsMaintenance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemofLocalCloudsEvolution(SystemofLocalCloudsEvolution systemofLocalCloudsEvolution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemofLocalCloudsEvolution, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalCloudMaintenance(LocalCloudMaintenance localCloudMaintenance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(localCloudMaintenance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalCloudEvolution(LocalCloudEvolution localCloudEvolution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(localCloudEvolution, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSysMaintenance(SysMaintenance sysMaintenance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sysMaintenance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSysImplementation(SysImplementation sysImplementation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sysImplementation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalCLoudImplementation(LocalCLoudImplementation localCLoudImplementation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(localCLoudImplementation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemofLocalCloudsImplementation(SystemofLocalCloudsImplementation systemofLocalCloudsImplementation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemofLocalCloudsImplementation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceImplementation(DeviceImplementation deviceImplementation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceImplementation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkImplementation(NetworkImplementation networkImplementation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(networkImplementation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMaintenance(DeviceMaintenance deviceMaintenance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceMaintenance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkMaintenance(NetworkMaintenance networkMaintenance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(networkMaintenance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSysEvolution(SysEvolution sysEvolution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sysEvolution, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceEvolution(DeviceEvolution deviceEvolution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceEvolution, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkEvolution(NetworkEvolution networkEvolution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(networkEvolution, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeployment(Deployment deployment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deployment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirements(Requirements requirements, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requirements, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalDesign(FunctionalDesign functionalDesign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionalDesign, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcurementEngineering(ProcurementEngineering procurementEngineering, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(procurementEngineering, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaintenance(Maintenance maintenance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(maintenance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvolution(Evolution evolution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evolution, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSysDeployed(SysDeployed sysDeployed, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sysDeployed, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChoreographyDefinition(ChoreographyDefinition choreographyDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(choreographyDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCertificateKind(CertificateKind certificateKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncodingKind(EncodingKind encodingKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityKind(SecurityKind securityKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolKind(ProtocolKind protocolKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompresionKind(CompresionKind compresionKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCryptoAlgorithmKind(CryptoAlgorithmKind cryptoAlgorithmKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTokenKind(TokenKind tokenKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayloadEncryptionKind(PayloadEncryptionKind payloadEncryptionKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeFormatKind(TimeFormatKind timeFormatKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOntologyKind(OntologyKind ontologyKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHttpMethodKind(HttpMethodKind httpMethodKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemanticsKind(SemanticsKind semanticsKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceNamingStandardKind(InstanceNamingStandardKind instanceNamingStandardKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusCodeKind(StatusCodeKind statusCodeKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoAPMetodKind(CoAPMetodKind coAPMetodKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchemaType(SchemaType schemaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalLayerKind(PhysicalLayerKind physicalLayerKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMacKind(MacKind macKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEngineeringProcedureKind(EngineeringProcedureKind engineeringProcedureKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOSKind(OSKind osKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinuxKind(LinuxKind linuxKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeploymentLocationKind(DeploymentLocationKind deploymentLocationKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeploymentTimeKind(DeploymentTimeKind deploymentTimeKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceKind(DeviceKind deviceKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessortKind(ProcessortKind processortKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ArrowheadSysMLProfileValidator
