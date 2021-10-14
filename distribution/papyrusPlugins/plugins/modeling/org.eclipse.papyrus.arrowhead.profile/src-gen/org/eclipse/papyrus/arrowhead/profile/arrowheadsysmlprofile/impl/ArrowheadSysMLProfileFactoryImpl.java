/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArrowheadSysMLProfileFactoryImpl extends EFactoryImpl implements ArrowheadSysMLProfileFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArrowheadSysMLProfileFactory init() {
		try {
			ArrowheadSysMLProfileFactory theArrowheadSysMLProfileFactory = (ArrowheadSysMLProfileFactory)EPackage.Registry.INSTANCE.getEFactory(ArrowheadSysMLProfilePackage.eNS_URI);
			if (theArrowheadSysMLProfileFactory != null) {
				return theArrowheadSysMLProfileFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArrowheadSysMLProfileFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrowheadSysMLProfileFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ArrowheadSysMLProfilePackage.SYS_D: return createSysD();
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN: return createDeviceDesign();
			case ArrowheadSysMLProfilePackage.NETWORK_DESIGN: return createNetworkDesign();
			case ArrowheadSysMLProfilePackage.SYS_DD: return createSysDD();
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCIPTION: return createDeviceDesignDesciption();
			case ArrowheadSysMLProfilePackage.NETWORK_DESIGN_DESCRIPTIION: return createNetworkDesignDescriptiion();
			case ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION: return createInterfaceDesignDescription();
			case ArrowheadSysMLProfilePackage.SERVICE_DESCRIPTION: return createServiceDescription();
			case ArrowheadSysMLProfilePackage.SUBSET_OF: return createSubsetOf();
			case ArrowheadSysMLProfilePackage.DEVICE: return createDevice();
			case ArrowheadSysMLProfilePackage.META_DATA_ENTRY: return createMetaDataEntry();
			case ArrowheadSysMLProfilePackage.DEPLOYED_SERVICE: return createDeployedService();
			case ArrowheadSysMLProfilePackage.LOCAL_CLOUD_DESIGN: return createLocalCloudDesign();
			case ArrowheadSysMLProfilePackage.LOCAL_CLOUD_DESIGN_DESCRIPTION: return createLocalCLoudDesignDescription();
			case ArrowheadSysMLProfilePackage.DEPLOYED_DEVICE: return createDeployedDevice();
			case ArrowheadSysMLProfilePackage.DEPLOYED_LOCAL_CLOUD: return createDeployedLocalCloud();
			case ArrowheadSysMLProfilePackage.DATA_SEMANTICS: return createDataSemantics();
			case ArrowheadSysMLProfilePackage.DEPLOYED_ENTITY: return createDeployedEntity();
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM: return createServiceRegistryForm();
			case ArrowheadSysMLProfilePackage.SYSTEM_REGISTRY_FORM: return createSystemRegistryForm();
			case ArrowheadSysMLProfilePackage.DEVICE_REGISTRY_FORM: return createDeviceRegistryForm();
			case ArrowheadSysMLProfilePackage.CERTIFICATE_CREATION_FORM: return createCertificateCreationForm();
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_DESIGN: return createSystemofLocalCloudsDesign();
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_DESIGN_DESCRIPTION: return createSystemofLocalCloudsDesignDescription();
			case ArrowheadSysMLProfilePackage.NETWORK: return createNetwork();
			case ArrowheadSysMLProfilePackage.APPLICATION_SYS_DDHTTP: return createApplicationSysDDHTTP();
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_DEPLOYED: return createSystemofLocalCloudsDeployed();
			case ArrowheadSysMLProfilePackage.LOCAL_CLOUD_DEPLOYED: return createLocalCloudDeployed();
			case ArrowheadSysMLProfilePackage.DEVICE_DEPLOYED: return createDeviceDeployed();
			case ArrowheadSysMLProfilePackage.NETWORK_DEPLOYED: return createNetworkDeployed();
			case ArrowheadSysMLProfilePackage.SDDD: return createSDDD();
			case ArrowheadSysMLProfilePackage.MQTT_TOPIC: return createMQTT_topic();
			case ArrowheadSysMLProfilePackage.HTTP_OPERATION: return createHttpOperation();
			case ArrowheadSysMLProfilePackage.SYSTEM_REQUIREMENTS: return createSystemRequirements();
			case ArrowheadSysMLProfilePackage.NETWORK_REQUIREMENTS: return createNetworkRequirements();
			case ArrowheadSysMLProfilePackage.LOCA_CLOUD_REQUIREMENTS: return createLocaCloudRequirements();
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_REQUIREMENTS: return createSystemofLocalCloudsRequirements();
			case ArrowheadSysMLProfilePackage.DEVICE_REQUIREMENTS: return createDeviceRequirements();
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_MAINTENANCE: return createSystemofLocalCloudsMaintenance();
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_EVOLUTION: return createSystemofLocalCloudsEvolution();
			case ArrowheadSysMLProfilePackage.LOCAL_CLOUD_MAINTENANCE: return createLocalCloudMaintenance();
			case ArrowheadSysMLProfilePackage.LOCAL_CLOUD_EVOLUTION: return createLocalCloudEvolution();
			case ArrowheadSysMLProfilePackage.SYS_MAINTENANCE: return createSysMaintenance();
			case ArrowheadSysMLProfilePackage.SYS_IMPLEMENTATION: return createSysImplementation();
			case ArrowheadSysMLProfilePackage.LOCAL_CLOUD_IMPLEMENTATION: return createLocalCLoudImplementation();
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_IMPLEMENTATION: return createSystemofLocalCloudsImplementation();
			case ArrowheadSysMLProfilePackage.DEVICE_IMPLEMENTATION: return createDeviceImplementation();
			case ArrowheadSysMLProfilePackage.NETWORK_IMPLEMENTATION: return createNetworkImplementation();
			case ArrowheadSysMLProfilePackage.DEVICE_MAINTENANCE: return createDeviceMaintenance();
			case ArrowheadSysMLProfilePackage.NETWORK_MAINTENANCE: return createNetworkMaintenance();
			case ArrowheadSysMLProfilePackage.SYS_EVOLUTION: return createSysEvolution();
			case ArrowheadSysMLProfilePackage.DEVICE_EVOLUTION: return createDeviceEvolution();
			case ArrowheadSysMLProfilePackage.NETWORK_EVOLUTION: return createNetworkEvolution();
			case ArrowheadSysMLProfilePackage.DEPLOYMENT: return createDeployment();
			case ArrowheadSysMLProfilePackage.REQUIREMENTS: return createRequirements();
			case ArrowheadSysMLProfilePackage.FUNCTIONAL_DESIGN: return createFunctionalDesign();
			case ArrowheadSysMLProfilePackage.PROCUREMENT_ENGINEERING: return createProcurementEngineering();
			case ArrowheadSysMLProfilePackage.MAINTENANCE: return createMaintenance();
			case ArrowheadSysMLProfilePackage.EVOLUTION: return createEvolution();
			case ArrowheadSysMLProfilePackage.SYS_DEPLOYED: return createSysDeployed();
			case ArrowheadSysMLProfilePackage.CHOREOGRAPHY_DEFINITION: return createChoreographyDefinition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ArrowheadSysMLProfilePackage.CERTIFICATE_KIND:
				return createCertificateKindFromString(eDataType, initialValue);
			case ArrowheadSysMLProfilePackage.ENCODING_KIND:
				return createEncodingKindFromString(eDataType, initialValue);
			case ArrowheadSysMLProfilePackage.SECURITY_KIND:
				return createSecurityKindFromString(eDataType, initialValue);
			case ArrowheadSysMLProfilePackage.PROTOCOL_KIND:
				return createProtocolKindFromString(eDataType, initialValue);
			case ArrowheadSysMLProfilePackage.COMPRESION_KIND:
				return createCompresionKindFromString(eDataType, initialValue);
			case ArrowheadSysMLProfilePackage.CRYPTO_ALGORITHM_KIND:
				return createCryptoAlgorithmKindFromString(eDataType, initialValue);
			case ArrowheadSysMLProfilePackage.TOKEN_KIND:
				return createTokenKindFromString(eDataType, initialValue);
			case ArrowheadSysMLProfilePackage.PAYLOAD_ENCRYPTION_KIND:
				return createPayloadEncryptionKindFromString(eDataType, initialValue);
			case ArrowheadSysMLProfilePackage.TIME_FORMAT_KIND:
				return createTimeFormatKindFromString(eDataType, initialValue);
			case ArrowheadSysMLProfilePackage.ONTOLOGY_KIND:
				return createOntologyKindFromString(eDataType, initialValue);
			case ArrowheadSysMLProfilePackage.HTTP_METHOD_KIND:
				return createHttpMethodKindFromString(eDataType, initialValue);
			case ArrowheadSysMLProfilePackage.SEMANTICS_KIND:
				return createSemanticsKindFromString(eDataType, initialValue);
			case ArrowheadSysMLProfilePackage.INSTANCE_NAMING_STANDARD_KIND:
				return createInstanceNamingStandardKindFromString(eDataType, initialValue);
			case ArrowheadSysMLProfilePackage.STATUS_CODE_KIND:
				return createStatusCodeKindFromString(eDataType, initialValue);
			case ArrowheadSysMLProfilePackage.CO_AP_METOD_KIND:
				return createCoAPMetodKindFromString(eDataType, initialValue);
			case ArrowheadSysMLProfilePackage.SCHEMA_TYPE:
				return createSchemaTypeFromString(eDataType, initialValue);
			case ArrowheadSysMLProfilePackage.PHYSICAL_LAYER_KIND:
				return createPhysicalLayerKindFromString(eDataType, initialValue);
			case ArrowheadSysMLProfilePackage.MAC_KIND:
				return createMacKindFromString(eDataType, initialValue);
			case ArrowheadSysMLProfilePackage.ENGINEERING_PROCEDURE_KIND:
				return createEngineeringProcedureKindFromString(eDataType, initialValue);
			case ArrowheadSysMLProfilePackage.OS_KIND:
				return createOSKindFromString(eDataType, initialValue);
			case ArrowheadSysMLProfilePackage.LINUX_KIND:
				return createLinuxKindFromString(eDataType, initialValue);
			case ArrowheadSysMLProfilePackage.DEPLOYMENT_LOCATION_KIND:
				return createDeploymentLocationKindFromString(eDataType, initialValue);
			case ArrowheadSysMLProfilePackage.DEPLOYMENT_TIME_KIND:
				return createDeploymentTimeKindFromString(eDataType, initialValue);
			case ArrowheadSysMLProfilePackage.DEVICE_KIND:
				return createDeviceKindFromString(eDataType, initialValue);
			case ArrowheadSysMLProfilePackage.PROCESSORT_KIND:
				return createProcessortKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ArrowheadSysMLProfilePackage.CERTIFICATE_KIND:
				return convertCertificateKindToString(eDataType, instanceValue);
			case ArrowheadSysMLProfilePackage.ENCODING_KIND:
				return convertEncodingKindToString(eDataType, instanceValue);
			case ArrowheadSysMLProfilePackage.SECURITY_KIND:
				return convertSecurityKindToString(eDataType, instanceValue);
			case ArrowheadSysMLProfilePackage.PROTOCOL_KIND:
				return convertProtocolKindToString(eDataType, instanceValue);
			case ArrowheadSysMLProfilePackage.COMPRESION_KIND:
				return convertCompresionKindToString(eDataType, instanceValue);
			case ArrowheadSysMLProfilePackage.CRYPTO_ALGORITHM_KIND:
				return convertCryptoAlgorithmKindToString(eDataType, instanceValue);
			case ArrowheadSysMLProfilePackage.TOKEN_KIND:
				return convertTokenKindToString(eDataType, instanceValue);
			case ArrowheadSysMLProfilePackage.PAYLOAD_ENCRYPTION_KIND:
				return convertPayloadEncryptionKindToString(eDataType, instanceValue);
			case ArrowheadSysMLProfilePackage.TIME_FORMAT_KIND:
				return convertTimeFormatKindToString(eDataType, instanceValue);
			case ArrowheadSysMLProfilePackage.ONTOLOGY_KIND:
				return convertOntologyKindToString(eDataType, instanceValue);
			case ArrowheadSysMLProfilePackage.HTTP_METHOD_KIND:
				return convertHttpMethodKindToString(eDataType, instanceValue);
			case ArrowheadSysMLProfilePackage.SEMANTICS_KIND:
				return convertSemanticsKindToString(eDataType, instanceValue);
			case ArrowheadSysMLProfilePackage.INSTANCE_NAMING_STANDARD_KIND:
				return convertInstanceNamingStandardKindToString(eDataType, instanceValue);
			case ArrowheadSysMLProfilePackage.STATUS_CODE_KIND:
				return convertStatusCodeKindToString(eDataType, instanceValue);
			case ArrowheadSysMLProfilePackage.CO_AP_METOD_KIND:
				return convertCoAPMetodKindToString(eDataType, instanceValue);
			case ArrowheadSysMLProfilePackage.SCHEMA_TYPE:
				return convertSchemaTypeToString(eDataType, instanceValue);
			case ArrowheadSysMLProfilePackage.PHYSICAL_LAYER_KIND:
				return convertPhysicalLayerKindToString(eDataType, instanceValue);
			case ArrowheadSysMLProfilePackage.MAC_KIND:
				return convertMacKindToString(eDataType, instanceValue);
			case ArrowheadSysMLProfilePackage.ENGINEERING_PROCEDURE_KIND:
				return convertEngineeringProcedureKindToString(eDataType, instanceValue);
			case ArrowheadSysMLProfilePackage.OS_KIND:
				return convertOSKindToString(eDataType, instanceValue);
			case ArrowheadSysMLProfilePackage.LINUX_KIND:
				return convertLinuxKindToString(eDataType, instanceValue);
			case ArrowheadSysMLProfilePackage.DEPLOYMENT_LOCATION_KIND:
				return convertDeploymentLocationKindToString(eDataType, instanceValue);
			case ArrowheadSysMLProfilePackage.DEPLOYMENT_TIME_KIND:
				return convertDeploymentTimeKindToString(eDataType, instanceValue);
			case ArrowheadSysMLProfilePackage.DEVICE_KIND:
				return convertDeviceKindToString(eDataType, instanceValue);
			case ArrowheadSysMLProfilePackage.PROCESSORT_KIND:
				return convertProcessortKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SysD createSysD() {
		SysDImpl sysD = new SysDImpl();
		return sysD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceDesign createDeviceDesign() {
		DeviceDesignImpl deviceDesign = new DeviceDesignImpl();
		return deviceDesign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkDesign createNetworkDesign() {
		NetworkDesignImpl networkDesign = new NetworkDesignImpl();
		return networkDesign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SysDD createSysDD() {
		SysDDImpl sysDD = new SysDDImpl();
		return sysDD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceDesignDesciption createDeviceDesignDesciption() {
		DeviceDesignDesciptionImpl deviceDesignDesciption = new DeviceDesignDesciptionImpl();
		return deviceDesignDesciption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkDesignDescriptiion createNetworkDesignDescriptiion() {
		NetworkDesignDescriptiionImpl networkDesignDescriptiion = new NetworkDesignDescriptiionImpl();
		return networkDesignDescriptiion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDesignDescription createInterfaceDesignDescription() {
		InterfaceDesignDescriptionImpl interfaceDesignDescription = new InterfaceDesignDescriptionImpl();
		return interfaceDesignDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDescription createServiceDescription() {
		ServiceDescriptionImpl serviceDescription = new ServiceDescriptionImpl();
		return serviceDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubsetOf createSubsetOf() {
		SubsetOfImpl subsetOf = new SubsetOfImpl();
		return subsetOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device createDevice() {
		DeviceImpl device = new DeviceImpl();
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaDataEntry createMetaDataEntry() {
		MetaDataEntryImpl metaDataEntry = new MetaDataEntryImpl();
		return metaDataEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployedService createDeployedService() {
		DeployedServiceImpl deployedService = new DeployedServiceImpl();
		return deployedService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalCloudDesign createLocalCloudDesign() {
		LocalCloudDesignImpl localCloudDesign = new LocalCloudDesignImpl();
		return localCloudDesign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalCLoudDesignDescription createLocalCLoudDesignDescription() {
		LocalCLoudDesignDescriptionImpl localCLoudDesignDescription = new LocalCLoudDesignDescriptionImpl();
		return localCLoudDesignDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployedDevice createDeployedDevice() {
		DeployedDeviceImpl deployedDevice = new DeployedDeviceImpl();
		return deployedDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployedLocalCloud createDeployedLocalCloud() {
		DeployedLocalCloudImpl deployedLocalCloud = new DeployedLocalCloudImpl();
		return deployedLocalCloud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSemantics createDataSemantics() {
		DataSemanticsImpl dataSemantics = new DataSemanticsImpl();
		return dataSemantics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployedEntity createDeployedEntity() {
		DeployedEntityImpl deployedEntity = new DeployedEntityImpl();
		return deployedEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRegistryForm createServiceRegistryForm() {
		ServiceRegistryFormImpl serviceRegistryForm = new ServiceRegistryFormImpl();
		return serviceRegistryForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemRegistryForm createSystemRegistryForm() {
		SystemRegistryFormImpl systemRegistryForm = new SystemRegistryFormImpl();
		return systemRegistryForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceRegistryForm createDeviceRegistryForm() {
		DeviceRegistryFormImpl deviceRegistryForm = new DeviceRegistryFormImpl();
		return deviceRegistryForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CertificateCreationForm createCertificateCreationForm() {
		CertificateCreationFormImpl certificateCreationForm = new CertificateCreationFormImpl();
		return certificateCreationForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemofLocalCloudsDesign createSystemofLocalCloudsDesign() {
		SystemofLocalCloudsDesignImpl systemofLocalCloudsDesign = new SystemofLocalCloudsDesignImpl();
		return systemofLocalCloudsDesign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemofLocalCloudsDesignDescription createSystemofLocalCloudsDesignDescription() {
		SystemofLocalCloudsDesignDescriptionImpl systemofLocalCloudsDesignDescription = new SystemofLocalCloudsDesignDescriptionImpl();
		return systemofLocalCloudsDesignDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network createNetwork() {
		NetworkImpl network = new NetworkImpl();
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationSysDDHTTP createApplicationSysDDHTTP() {
		ApplicationSysDDHTTPImpl applicationSysDDHTTP = new ApplicationSysDDHTTPImpl();
		return applicationSysDDHTTP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemofLocalCloudsDeployed createSystemofLocalCloudsDeployed() {
		SystemofLocalCloudsDeployedImpl systemofLocalCloudsDeployed = new SystemofLocalCloudsDeployedImpl();
		return systemofLocalCloudsDeployed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalCloudDeployed createLocalCloudDeployed() {
		LocalCloudDeployedImpl localCloudDeployed = new LocalCloudDeployedImpl();
		return localCloudDeployed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceDeployed createDeviceDeployed() {
		DeviceDeployedImpl deviceDeployed = new DeviceDeployedImpl();
		return deviceDeployed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkDeployed createNetworkDeployed() {
		NetworkDeployedImpl networkDeployed = new NetworkDeployedImpl();
		return networkDeployed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDDD createSDDD() {
		SDDDImpl sddd = new SDDDImpl();
		return sddd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MQTT_topic createMQTT_topic() {
		MQTT_topicImpl mqtT_topic = new MQTT_topicImpl();
		return mqtT_topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpOperation createHttpOperation() {
		HttpOperationImpl httpOperation = new HttpOperationImpl();
		return httpOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemRequirements createSystemRequirements() {
		SystemRequirementsImpl systemRequirements = new SystemRequirementsImpl();
		return systemRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkRequirements createNetworkRequirements() {
		NetworkRequirementsImpl networkRequirements = new NetworkRequirementsImpl();
		return networkRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocaCloudRequirements createLocaCloudRequirements() {
		LocaCloudRequirementsImpl locaCloudRequirements = new LocaCloudRequirementsImpl();
		return locaCloudRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemofLocalCloudsRequirements createSystemofLocalCloudsRequirements() {
		SystemofLocalCloudsRequirementsImpl systemofLocalCloudsRequirements = new SystemofLocalCloudsRequirementsImpl();
		return systemofLocalCloudsRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceRequirements createDeviceRequirements() {
		DeviceRequirementsImpl deviceRequirements = new DeviceRequirementsImpl();
		return deviceRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemofLocalCloudsMaintenance createSystemofLocalCloudsMaintenance() {
		SystemofLocalCloudsMaintenanceImpl systemofLocalCloudsMaintenance = new SystemofLocalCloudsMaintenanceImpl();
		return systemofLocalCloudsMaintenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemofLocalCloudsEvolution createSystemofLocalCloudsEvolution() {
		SystemofLocalCloudsEvolutionImpl systemofLocalCloudsEvolution = new SystemofLocalCloudsEvolutionImpl();
		return systemofLocalCloudsEvolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalCloudMaintenance createLocalCloudMaintenance() {
		LocalCloudMaintenanceImpl localCloudMaintenance = new LocalCloudMaintenanceImpl();
		return localCloudMaintenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalCloudEvolution createLocalCloudEvolution() {
		LocalCloudEvolutionImpl localCloudEvolution = new LocalCloudEvolutionImpl();
		return localCloudEvolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SysMaintenance createSysMaintenance() {
		SysMaintenanceImpl sysMaintenance = new SysMaintenanceImpl();
		return sysMaintenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SysImplementation createSysImplementation() {
		SysImplementationImpl sysImplementation = new SysImplementationImpl();
		return sysImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalCLoudImplementation createLocalCLoudImplementation() {
		LocalCLoudImplementationImpl localCLoudImplementation = new LocalCLoudImplementationImpl();
		return localCLoudImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemofLocalCloudsImplementation createSystemofLocalCloudsImplementation() {
		SystemofLocalCloudsImplementationImpl systemofLocalCloudsImplementation = new SystemofLocalCloudsImplementationImpl();
		return systemofLocalCloudsImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceImplementation createDeviceImplementation() {
		DeviceImplementationImpl deviceImplementation = new DeviceImplementationImpl();
		return deviceImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkImplementation createNetworkImplementation() {
		NetworkImplementationImpl networkImplementation = new NetworkImplementationImpl();
		return networkImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMaintenance createDeviceMaintenance() {
		DeviceMaintenanceImpl deviceMaintenance = new DeviceMaintenanceImpl();
		return deviceMaintenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkMaintenance createNetworkMaintenance() {
		NetworkMaintenanceImpl networkMaintenance = new NetworkMaintenanceImpl();
		return networkMaintenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SysEvolution createSysEvolution() {
		SysEvolutionImpl sysEvolution = new SysEvolutionImpl();
		return sysEvolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceEvolution createDeviceEvolution() {
		DeviceEvolutionImpl deviceEvolution = new DeviceEvolutionImpl();
		return deviceEvolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkEvolution createNetworkEvolution() {
		NetworkEvolutionImpl networkEvolution = new NetworkEvolutionImpl();
		return networkEvolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment createDeployment() {
		DeploymentImpl deployment = new DeploymentImpl();
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirements createRequirements() {
		RequirementsImpl requirements = new RequirementsImpl();
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalDesign createFunctionalDesign() {
		FunctionalDesignImpl functionalDesign = new FunctionalDesignImpl();
		return functionalDesign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcurementEngineering createProcurementEngineering() {
		ProcurementEngineeringImpl procurementEngineering = new ProcurementEngineeringImpl();
		return procurementEngineering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Maintenance createMaintenance() {
		MaintenanceImpl maintenance = new MaintenanceImpl();
		return maintenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Evolution createEvolution() {
		EvolutionImpl evolution = new EvolutionImpl();
		return evolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SysDeployed createSysDeployed() {
		SysDeployedImpl sysDeployed = new SysDeployedImpl();
		return sysDeployed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoreographyDefinition createChoreographyDefinition() {
		ChoreographyDefinitionImpl choreographyDefinition = new ChoreographyDefinitionImpl();
		return choreographyDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CertificateKind createCertificateKindFromString(EDataType eDataType, String initialValue) {
		CertificateKind result = CertificateKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCertificateKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncodingKind createEncodingKindFromString(EDataType eDataType, String initialValue) {
		EncodingKind result = EncodingKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncodingKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityKind createSecurityKindFromString(EDataType eDataType, String initialValue) {
		SecurityKind result = SecurityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSecurityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolKind createProtocolKindFromString(EDataType eDataType, String initialValue) {
		ProtocolKind result = ProtocolKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProtocolKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompresionKind createCompresionKindFromString(EDataType eDataType, String initialValue) {
		CompresionKind result = CompresionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompresionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CryptoAlgorithmKind createCryptoAlgorithmKindFromString(EDataType eDataType, String initialValue) {
		CryptoAlgorithmKind result = CryptoAlgorithmKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCryptoAlgorithmKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenKind createTokenKindFromString(EDataType eDataType, String initialValue) {
		TokenKind result = TokenKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTokenKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayloadEncryptionKind createPayloadEncryptionKindFromString(EDataType eDataType, String initialValue) {
		PayloadEncryptionKind result = PayloadEncryptionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPayloadEncryptionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeFormatKind createTimeFormatKindFromString(EDataType eDataType, String initialValue) {
		TimeFormatKind result = TimeFormatKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeFormatKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntologyKind createOntologyKindFromString(EDataType eDataType, String initialValue) {
		OntologyKind result = OntologyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOntologyKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpMethodKind createHttpMethodKindFromString(EDataType eDataType, String initialValue) {
		HttpMethodKind result = HttpMethodKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHttpMethodKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticsKind createSemanticsKindFromString(EDataType eDataType, String initialValue) {
		SemanticsKind result = SemanticsKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSemanticsKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceNamingStandardKind createInstanceNamingStandardKindFromString(EDataType eDataType, String initialValue) {
		InstanceNamingStandardKind result = InstanceNamingStandardKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstanceNamingStandardKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusCodeKind createStatusCodeKindFromString(EDataType eDataType, String initialValue) {
		StatusCodeKind result = StatusCodeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusCodeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoAPMetodKind createCoAPMetodKindFromString(EDataType eDataType, String initialValue) {
		CoAPMetodKind result = CoAPMetodKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCoAPMetodKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaType createSchemaTypeFromString(EDataType eDataType, String initialValue) {
		SchemaType result = SchemaType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchemaTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalLayerKind createPhysicalLayerKindFromString(EDataType eDataType, String initialValue) {
		PhysicalLayerKind result = PhysicalLayerKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPhysicalLayerKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MacKind createMacKindFromString(EDataType eDataType, String initialValue) {
		MacKind result = MacKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMacKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineeringProcedureKind createEngineeringProcedureKindFromString(EDataType eDataType, String initialValue) {
		EngineeringProcedureKind result = EngineeringProcedureKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEngineeringProcedureKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSKind createOSKindFromString(EDataType eDataType, String initialValue) {
		OSKind result = OSKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOSKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinuxKind createLinuxKindFromString(EDataType eDataType, String initialValue) {
		LinuxKind result = LinuxKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinuxKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentLocationKind createDeploymentLocationKindFromString(EDataType eDataType, String initialValue) {
		DeploymentLocationKind result = DeploymentLocationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeploymentLocationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentTimeKind createDeploymentTimeKindFromString(EDataType eDataType, String initialValue) {
		DeploymentTimeKind result = DeploymentTimeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeploymentTimeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceKind createDeviceKindFromString(EDataType eDataType, String initialValue) {
		DeviceKind result = DeviceKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessortKind createProcessortKindFromString(EDataType eDataType, String initialValue) {
		ProcessortKind result = ProcessortKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessortKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrowheadSysMLProfilePackage getArrowheadSysMLProfilePackage() {
		return (ArrowheadSysMLProfilePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArrowheadSysMLProfilePackage getPackage() {
		return ArrowheadSysMLProfilePackage.eINSTANCE;
	}

} //ArrowheadSysMLProfileFactoryImpl
