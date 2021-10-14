/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ApplicationSysDDHTTP;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfileFactory;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CertificateCreationForm;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CertificateKind;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ChoreographyDefinition;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CoAPMetodKind;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CompresionKind;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CryptoAlgorithmKind;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DataSemantics;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedDevice;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedEntity;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedLocalCloud;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedService;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Deployment;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeploymentLocationKind;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeploymentTimeKind;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Device;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceDeployed;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceDesign;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceDesignDesciption;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceEvolution;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceImplementation;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceKind;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceMaintenance;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRegistryForm;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRequirements;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.EncodingKind;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.EngineeringProcedureKind;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Evolution;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.FunctionalDesign;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.HttpMethodKind;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.HttpOperation;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InstanceNamingStandardKind;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LinuxKind;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocaCloudRequirements;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCLoudDesignDescription;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCLoudImplementation;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudDeployed;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudDesign;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudEvolution;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudMaintenance;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.MQTT_topic;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.MacKind;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Maintenance;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.MetaDataEntry;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Network;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkDeployed;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkDesign;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkDesignDescriptiion;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkEvolution;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkImplementation;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkMaintenance;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkRequirements;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.OSKind;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.OntologyKind;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.PayloadEncryptionKind;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.PhysicalLayerKind;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ProcessortKind;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ProcurementEngineering;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ProtocolKind;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Requirements;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SchemaType;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SecurityKind;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SemanticsKind;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceDescription;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.StatusCodeKind;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SubsetOf;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysD;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysDD;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysDeployed;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysEvolution;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysImplementation;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysMaintenance;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemRegistryForm;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemRequirements;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsDeployed;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsDesign;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsDesignDescription;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsEvolution;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsImplementation;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsMaintenance;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsRequirements;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.TimeFormatKind;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.TokenKind;

import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.util.ArrowheadSysMLProfileValidator;

import org.eclipse.papyrus.sysml16.blocks.BlocksPackage;

import org.eclipse.papyrus.sysml16.portsandflows.PortsAndFlowsPackage;

import org.eclipse.papyrus.sysml16.sysml.SysMLPackage;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.profile.standard.StandardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArrowheadSysMLProfilePackageImpl extends EPackageImpl implements ArrowheadSysMLProfilePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sysDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceDesignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkDesignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sysDDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceDesignDesciptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkDesignDescriptiionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceDesignDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subsetOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaDataEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deployedServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localCloudDesignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localCLoudDesignDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deployedDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deployedLocalCloudEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSemanticsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deployedEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceRegistryFormEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemRegistryFormEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceRegistryFormEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass certificateCreationFormEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemofLocalCloudsDesignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemofLocalCloudsDesignDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationSysDDHTTPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemofLocalCloudsDeployedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localCloudDeployedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceDeployedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkDeployedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sdddEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mqtT_topicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httpOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locaCloudRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemofLocalCloudsRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemofLocalCloudsMaintenanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemofLocalCloudsEvolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localCloudMaintenanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localCloudEvolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sysMaintenanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sysImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localCLoudImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemofLocalCloudsImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceMaintenanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkMaintenanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sysEvolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEvolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkEvolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalDesignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procurementEngineeringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maintenanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sysDeployedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choreographyDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum certificateKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum encodingKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum securityKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum protocolKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compresionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cryptoAlgorithmKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tokenKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum payloadEncryptionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeFormatKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ontologyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum httpMethodKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum semanticsKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum instanceNamingStandardKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statusCodeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum coAPMetodKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum schemaTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum physicalLayerKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum macKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum engineeringProcedureKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum osKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum linuxKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deploymentLocationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deploymentTimeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deviceKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum processortKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArrowheadSysMLProfilePackageImpl() {
		super(eNS_URI, ArrowheadSysMLProfileFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ArrowheadSysMLProfilePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArrowheadSysMLProfilePackage init() {
		if (isInited) return (ArrowheadSysMLProfilePackage)EPackage.Registry.INSTANCE.getEPackage(ArrowheadSysMLProfilePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredArrowheadSysMLProfilePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ArrowheadSysMLProfilePackageImpl theArrowheadSysMLProfilePackage = registeredArrowheadSysMLProfilePackage instanceof ArrowheadSysMLProfilePackageImpl ? (ArrowheadSysMLProfilePackageImpl)registeredArrowheadSysMLProfilePackage : new ArrowheadSysMLProfilePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		StandardPackage.eINSTANCE.eClass();
		SysMLPackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theArrowheadSysMLProfilePackage.createPackageContents();

		// Initialize created meta-data
		theArrowheadSysMLProfilePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theArrowheadSysMLProfilePackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ArrowheadSysMLProfileValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theArrowheadSysMLProfilePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArrowheadSysMLProfilePackage.eNS_URI, theArrowheadSysMLProfilePackage);
		return theArrowheadSysMLProfilePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSysD() {
		return sysDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSysD_Devicedesign() {
		return (EReference)sysDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceDesign() {
		return deviceDesignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceDesign_Networkdesign() {
		return (EReference)deviceDesignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkDesign() {
		return networkDesignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSysDD() {
		return sysDDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSysDD_CertificateLevel() {
		return (EAttribute)sysDDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSysDD_Devicedesigndesciption() {
		return (EReference)sysDDEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceDesignDesciption() {
		return deviceDesignDesciptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceDesignDesciption_CertificateLevel() {
		return (EAttribute)deviceDesignDesciptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceDesignDesciption_NetworkDesignDescription() {
		return (EReference)deviceDesignDesciptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkDesignDescriptiion() {
		return networkDesignDescriptiionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceDesignDescription() {
		return interfaceDesignDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceDesignDescription_Encoding() {
		return (EAttribute)interfaceDesignDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceDesignDescription_Security() {
		return (EAttribute)interfaceDesignDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceDesignDescription_Protocol() {
		return (EAttribute)interfaceDesignDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceDesignDescription_Compression() {
		return (EAttribute)interfaceDesignDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceDesignDescription_CryptoAlgorithm() {
		return (EAttribute)interfaceDesignDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceDesignDescription_Token() {
		return (EAttribute)interfaceDesignDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceDesignDescription_CertificateLevel() {
		return (EAttribute)interfaceDesignDescriptionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceDesignDescription_PayloadEncryption() {
		return (EAttribute)interfaceDesignDescriptionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceDesignDescription_TimeFormat() {
		return (EAttribute)interfaceDesignDescriptionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceDescription() {
		return serviceDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubsetOf() {
		return subsetOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubsetOf_Base_Dependency() {
		return (EReference)subsetOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_CertificateLevel() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaDataEntry() {
		return metaDataEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaDataEntry_Base_Class() {
		return (EReference)metaDataEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaDataEntry_Data() {
		return (EAttribute)metaDataEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployedService() {
		return deployedServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployedService_DeployedServiceName() {
		return (EAttribute)deployedServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployedService_URL() {
		return (EAttribute)deployedServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployedService_Port() {
		return (EAttribute)deployedServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployedService_Certificate() {
		return (EAttribute)deployedServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployedService_Metadata() {
		return (EReference)deployedServiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployedService_Base_Property() {
		return (EReference)deployedServiceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalCloudDesign() {
		return localCloudDesignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalCloudDesign_Sysd() {
		return (EReference)localCloudDesignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalCLoudDesignDescription() {
		return localCLoudDesignDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalCLoudDesignDescription_SysDD() {
		return (EReference)localCLoudDesignDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocalCLoudDesignDescription__GetSysDD__SysDD() {
		return localCLoudDesignDescriptionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployedDevice() {
		return deployedDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployedDevice_Metadata() {
		return (EReference)deployedDeviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployedDevice_MacAddress() {
		return (EAttribute)deployedDeviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployedDevice_NetworkInterface() {
		return (EReference)deployedDeviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployedDevice_MacProtocol() {
		return (EAttribute)deployedDeviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployedDevice_Base_Property() {
		return (EReference)deployedDeviceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployedLocalCloud() {
		return deployedLocalCloudEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployedLocalCloud_GatekeeperSystemName() {
		return (EAttribute)deployedLocalCloudEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployedLocalCloud_Base_Property() {
		return (EReference)deployedLocalCloudEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSemantics() {
		return dataSemanticsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSemantics_SemanticModel() {
		return (EAttribute)dataSemanticsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSemantics_Ontology() {
		return (EAttribute)dataSemanticsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSemantics_Schema() {
		return (EAttribute)dataSemanticsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSemantics_Base_Class() {
		return (EReference)dataSemanticsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployedEntity() {
		return deployedEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployedEntity_Base_Property() {
		return (EReference)deployedEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceRegistryForm() {
		return serviceRegistryFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceRegistryForm_Metadata4() {
		return (EAttribute)serviceRegistryFormEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceRegistryForm_ServiceName() {
		return (EAttribute)serviceRegistryFormEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceRegistryForm_ProducingSystem() {
		return (EAttribute)serviceRegistryFormEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceRegistryForm_Encoding() {
		return (EAttribute)serviceRegistryFormEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceRegistryForm_EndOfValidity() {
		return (EAttribute)serviceRegistryFormEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceRegistryForm_ServiceURI() {
		return (EAttribute)serviceRegistryFormEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceRegistryForm_AuthenticationInfo() {
		return (EAttribute)serviceRegistryFormEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceRegistryForm_Secure() {
		return (EAttribute)serviceRegistryFormEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceRegistryForm_Compression() {
		return (EAttribute)serviceRegistryFormEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceRegistryForm_Metadata1() {
		return (EAttribute)serviceRegistryFormEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceRegistryForm_Metadata2() {
		return (EAttribute)serviceRegistryFormEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceRegistryForm_Metadata3() {
		return (EAttribute)serviceRegistryFormEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemRegistryForm() {
		return systemRegistryFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemRegistryForm_SystemName() {
		return (EAttribute)systemRegistryFormEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemRegistryForm_HostDevice() {
		return (EAttribute)systemRegistryFormEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemRegistryForm_AuthenticationInfo() {
		return (EAttribute)systemRegistryFormEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemRegistryForm_EndOfValidity() {
		return (EAttribute)systemRegistryFormEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemRegistryForm_ServiceURI() {
		return (EAttribute)systemRegistryFormEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemRegistryForm_Version() {
		return (EAttribute)systemRegistryFormEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemRegistryForm_DeployTime() {
		return (EAttribute)systemRegistryFormEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemRegistryForm_Metadata1() {
		return (EAttribute)systemRegistryFormEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemRegistryForm_Metadata2() {
		return (EAttribute)systemRegistryFormEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceRegistryForm() {
		return deviceRegistryFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceRegistryForm_HostDevice() {
		return (EAttribute)deviceRegistryFormEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceRegistryForm_AuthenticationInfo() {
		return (EAttribute)deviceRegistryFormEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceRegistryForm_EndOfValidity() {
		return (EAttribute)deviceRegistryFormEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceRegistryForm_Version() {
		return (EAttribute)deviceRegistryFormEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceRegistryForm_DeployTime() {
		return (EAttribute)deviceRegistryFormEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceRegistryForm_Metadata1() {
		return (EAttribute)deviceRegistryFormEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceRegistryForm_Metadata2() {
		return (EAttribute)deviceRegistryFormEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCertificateCreationForm() {
		return certificateCreationFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCertificateCreationForm_Base_Class() {
		return (EReference)certificateCreationFormEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCertificateCreationForm_CommomName() {
		return (EAttribute)certificateCreationFormEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCertificateCreationForm_KeyAlgorithm() {
		return (EAttribute)certificateCreationFormEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCertificateCreationForm_KeyFormat() {
		return (EAttribute)certificateCreationFormEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCertificateCreationForm_PrivatKey() {
		return (EAttribute)certificateCreationFormEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCertificateCreationForm_PublicKey() {
		return (EAttribute)certificateCreationFormEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemofLocalCloudsDesign() {
		return systemofLocalCloudsDesignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemofLocalCloudsDesign_LCD() {
		return (EReference)systemofLocalCloudsDesignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemofLocalCloudsDesign__GetLCD__LocalCloudDesign() {
		return systemofLocalCloudsDesignEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemofLocalCloudsDesignDescription() {
		return systemofLocalCloudsDesignDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemofLocalCloudsDesignDescription_LCDD() {
		return (EReference)systemofLocalCloudsDesignDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemofLocalCloudsDesignDescription__GetLCDD__LocalCLoudDesignDescription() {
		return systemofLocalCloudsDesignDescriptionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetwork() {
		return networkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetwork_Base_Class() {
		return (EReference)networkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationSysDDHTTP() {
		return applicationSysDDHTTPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemofLocalCloudsDeployed() {
		return systemofLocalCloudsDeployedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemofLocalCloudsDeployed_LocalCloudDeployed() {
		return (EReference)systemofLocalCloudsDeployedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemofLocalCloudsDeployed__GetLocalCloudDeployed__EList() {
		return systemofLocalCloudsDeployedEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalCloudDeployed() {
		return localCloudDeployedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceDeployed() {
		return deviceDeployedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceDeployed_Localclouddeployed() {
		return (EReference)deviceDeployedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceDeployed_Networkdeployed() {
		return (EReference)deviceDeployedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkDeployed() {
		return networkDeployedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSDDD() {
		return sdddEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMQTT_topic() {
		return mqtT_topicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMQTT_topic_Base_Class() {
		return (EReference)mqtT_topicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMQTT_topic_Security() {
		return (EAttribute)mqtT_topicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMQTT_topic_TopicName() {
		return (EAttribute)mqtT_topicEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHttpOperation() {
		return httpOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttpOperation_Kind() {
		return (EAttribute)httpOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHttpOperation_Base_Operation() {
		return (EReference)httpOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemRequirements() {
		return systemRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemRequirements_Base_Package() {
		return (EReference)systemRequirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkRequirements() {
		return networkRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkRequirements_Base_Package() {
		return (EReference)networkRequirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocaCloudRequirements() {
		return locaCloudRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocaCloudRequirements_Base_Package() {
		return (EReference)locaCloudRequirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemofLocalCloudsRequirements() {
		return systemofLocalCloudsRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemofLocalCloudsRequirements_Base_Package() {
		return (EReference)systemofLocalCloudsRequirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceRequirements() {
		return deviceRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceRequirements_Base_Package() {
		return (EReference)deviceRequirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemofLocalCloudsMaintenance() {
		return systemofLocalCloudsMaintenanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemofLocalCloudsMaintenance_Base_Class() {
		return (EReference)systemofLocalCloudsMaintenanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemofLocalCloudsMaintenance_Systemoflocalcloudsdeployed() {
		return (EReference)systemofLocalCloudsMaintenanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemofLocalCloudsEvolution() {
		return systemofLocalCloudsEvolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemofLocalCloudsEvolution_Base_Class() {
		return (EReference)systemofLocalCloudsEvolutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemofLocalCloudsEvolution_Systemoflocalcloudsdeployed() {
		return (EReference)systemofLocalCloudsEvolutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalCloudMaintenance() {
		return localCloudMaintenanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalCloudMaintenance_Base_Class() {
		return (EReference)localCloudMaintenanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalCloudMaintenance_Systemoflocalcloudsmaintenance() {
		return (EReference)localCloudMaintenanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalCloudMaintenance_Localclouddeployed() {
		return (EReference)localCloudMaintenanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalCloudEvolution() {
		return localCloudEvolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalCloudEvolution_Base_Class() {
		return (EReference)localCloudEvolutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalCloudEvolution_Systemoflocalcloudsevolution() {
		return (EReference)localCloudEvolutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalCloudEvolution_Localclouddeployed() {
		return (EReference)localCloudEvolutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSysMaintenance() {
		return sysMaintenanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSysMaintenance_Base_Class() {
		return (EReference)sysMaintenanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSysMaintenance_Sysimplementation() {
		return (EReference)sysMaintenanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSysMaintenance_Localcloudmaintenance() {
		return (EReference)sysMaintenanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSysMaintenance_Devicemaintenance() {
		return (EReference)sysMaintenanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSysImplementation() {
		return sysImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSysImplementation_Localcloudimplementation() {
		return (EReference)sysImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSysImplementation_Deviceimplementation() {
		return (EReference)sysImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalCLoudImplementation() {
		return localCLoudImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalCLoudImplementation_Systemoflocalcloudsimplementation() {
		return (EReference)localCLoudImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemofLocalCloudsImplementation() {
		return systemofLocalCloudsImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceImplementation() {
		return deviceImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceImplementation_Networkimplementation() {
		return (EReference)deviceImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkImplementation() {
		return networkImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceMaintenance() {
		return deviceMaintenanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMaintenance_Base_Class() {
		return (EReference)deviceMaintenanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMaintenance_Devicedeployed() {
		return (EReference)deviceMaintenanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMaintenance_Networkmaintenance() {
		return (EReference)deviceMaintenanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkMaintenance() {
		return networkMaintenanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkMaintenance_Base_Class() {
		return (EReference)networkMaintenanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkMaintenance_Networkdeployed() {
		return (EReference)networkMaintenanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSysEvolution() {
		return sysEvolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSysEvolution_Base_Class() {
		return (EReference)sysEvolutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSysEvolution_Localcloudevolution() {
		return (EReference)sysEvolutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSysEvolution_Sysimplementation() {
		return (EReference)sysEvolutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSysEvolution_Deviceevolution() {
		return (EReference)sysEvolutionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceEvolution() {
		return deviceEvolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceEvolution_Base_Class() {
		return (EReference)deviceEvolutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceEvolution_Networkevolution() {
		return (EReference)deviceEvolutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceEvolution_Devicedeployed() {
		return (EReference)deviceEvolutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkEvolution() {
		return networkEvolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkEvolution_Base_Class() {
		return (EReference)networkEvolutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkEvolution_Networkdeployed() {
		return (EReference)networkEvolutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployment() {
		return deploymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployment_Base_Package() {
		return (EReference)deploymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirements() {
		return requirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirements_Base_Package() {
		return (EReference)requirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalDesign() {
		return functionalDesignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalDesign_Base_Package() {
		return (EReference)functionalDesignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcurementEngineering() {
		return procurementEngineeringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcurementEngineering_Base_Package() {
		return (EReference)procurementEngineeringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaintenance() {
		return maintenanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaintenance_Base_Package() {
		return (EReference)maintenanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvolution() {
		return evolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvolution_Base_Package() {
		return (EReference)evolutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSysDeployed() {
		return sysDeployedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSysDeployed_Base_Class() {
		return (EReference)sysDeployedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoreographyDefinition() {
		return choreographyDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChoreographyDefinition_Base_Collaboration() {
		return (EReference)choreographyDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCertificateKind() {
		return certificateKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEncodingKind() {
		return encodingKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSecurityKind() {
		return securityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProtocolKind() {
		return protocolKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompresionKind() {
		return compresionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCryptoAlgorithmKind() {
		return cryptoAlgorithmKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTokenKind() {
		return tokenKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPayloadEncryptionKind() {
		return payloadEncryptionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeFormatKind() {
		return timeFormatKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOntologyKind() {
		return ontologyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHttpMethodKind() {
		return httpMethodKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSemanticsKind() {
		return semanticsKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInstanceNamingStandardKind() {
		return instanceNamingStandardKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStatusCodeKind() {
		return statusCodeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCoAPMetodKind() {
		return coAPMetodKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSchemaType() {
		return schemaTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPhysicalLayerKind() {
		return physicalLayerKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMacKind() {
		return macKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEngineeringProcedureKind() {
		return engineeringProcedureKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOSKind() {
		return osKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLinuxKind() {
		return linuxKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeploymentLocationKind() {
		return deploymentLocationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeploymentTimeKind() {
		return deploymentTimeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeviceKind() {
		return deviceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcessortKind() {
		return processortKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrowheadSysMLProfileFactory getArrowheadSysMLProfileFactory() {
		return (ArrowheadSysMLProfileFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		sysDEClass = createEClass(SYS_D);
		createEReference(sysDEClass, SYS_D__DEVICEDESIGN);

		deviceDesignEClass = createEClass(DEVICE_DESIGN);
		createEReference(deviceDesignEClass, DEVICE_DESIGN__NETWORKDESIGN);

		networkDesignEClass = createEClass(NETWORK_DESIGN);

		sysDDEClass = createEClass(SYS_DD);
		createEAttribute(sysDDEClass, SYS_DD__CERTIFICATE_LEVEL);
		createEReference(sysDDEClass, SYS_DD__DEVICEDESIGNDESCIPTION);

		deviceDesignDesciptionEClass = createEClass(DEVICE_DESIGN_DESCIPTION);
		createEAttribute(deviceDesignDesciptionEClass, DEVICE_DESIGN_DESCIPTION__CERTIFICATE_LEVEL);
		createEReference(deviceDesignDesciptionEClass, DEVICE_DESIGN_DESCIPTION__NETWORK_DESIGN_DESCRIPTION);

		networkDesignDescriptiionEClass = createEClass(NETWORK_DESIGN_DESCRIPTIION);

		interfaceDesignDescriptionEClass = createEClass(INTERFACE_DESIGN_DESCRIPTION);
		createEAttribute(interfaceDesignDescriptionEClass, INTERFACE_DESIGN_DESCRIPTION__ENCODING);
		createEAttribute(interfaceDesignDescriptionEClass, INTERFACE_DESIGN_DESCRIPTION__SECURITY);
		createEAttribute(interfaceDesignDescriptionEClass, INTERFACE_DESIGN_DESCRIPTION__PROTOCOL);
		createEAttribute(interfaceDesignDescriptionEClass, INTERFACE_DESIGN_DESCRIPTION__COMPRESSION);
		createEAttribute(interfaceDesignDescriptionEClass, INTERFACE_DESIGN_DESCRIPTION__CRYPTO_ALGORITHM);
		createEAttribute(interfaceDesignDescriptionEClass, INTERFACE_DESIGN_DESCRIPTION__TOKEN);
		createEAttribute(interfaceDesignDescriptionEClass, INTERFACE_DESIGN_DESCRIPTION__CERTIFICATE_LEVEL);
		createEAttribute(interfaceDesignDescriptionEClass, INTERFACE_DESIGN_DESCRIPTION__PAYLOAD_ENCRYPTION);
		createEAttribute(interfaceDesignDescriptionEClass, INTERFACE_DESIGN_DESCRIPTION__TIME_FORMAT);

		serviceDescriptionEClass = createEClass(SERVICE_DESCRIPTION);

		subsetOfEClass = createEClass(SUBSET_OF);
		createEReference(subsetOfEClass, SUBSET_OF__BASE_DEPENDENCY);

		deviceEClass = createEClass(DEVICE);
		createEAttribute(deviceEClass, DEVICE__CERTIFICATE_LEVEL);

		metaDataEntryEClass = createEClass(META_DATA_ENTRY);
		createEReference(metaDataEntryEClass, META_DATA_ENTRY__BASE_CLASS);
		createEAttribute(metaDataEntryEClass, META_DATA_ENTRY__DATA);

		deployedServiceEClass = createEClass(DEPLOYED_SERVICE);
		createEAttribute(deployedServiceEClass, DEPLOYED_SERVICE__DEPLOYED_SERVICE_NAME);
		createEAttribute(deployedServiceEClass, DEPLOYED_SERVICE__URL);
		createEAttribute(deployedServiceEClass, DEPLOYED_SERVICE__PORT);
		createEAttribute(deployedServiceEClass, DEPLOYED_SERVICE__CERTIFICATE);
		createEReference(deployedServiceEClass, DEPLOYED_SERVICE__METADATA);
		createEReference(deployedServiceEClass, DEPLOYED_SERVICE__BASE_PROPERTY);

		localCloudDesignEClass = createEClass(LOCAL_CLOUD_DESIGN);
		createEReference(localCloudDesignEClass, LOCAL_CLOUD_DESIGN__SYSD);

		localCLoudDesignDescriptionEClass = createEClass(LOCAL_CLOUD_DESIGN_DESCRIPTION);
		createEReference(localCLoudDesignDescriptionEClass, LOCAL_CLOUD_DESIGN_DESCRIPTION__SYS_DD);
		createEOperation(localCLoudDesignDescriptionEClass, LOCAL_CLOUD_DESIGN_DESCRIPTION___GET_SYS_DD__SYSDD);

		deployedDeviceEClass = createEClass(DEPLOYED_DEVICE);
		createEReference(deployedDeviceEClass, DEPLOYED_DEVICE__METADATA);
		createEAttribute(deployedDeviceEClass, DEPLOYED_DEVICE__MAC_ADDRESS);
		createEReference(deployedDeviceEClass, DEPLOYED_DEVICE__NETWORK_INTERFACE);
		createEAttribute(deployedDeviceEClass, DEPLOYED_DEVICE__MAC_PROTOCOL);
		createEReference(deployedDeviceEClass, DEPLOYED_DEVICE__BASE_PROPERTY);

		deployedLocalCloudEClass = createEClass(DEPLOYED_LOCAL_CLOUD);
		createEAttribute(deployedLocalCloudEClass, DEPLOYED_LOCAL_CLOUD__GATEKEEPER_SYSTEM_NAME);
		createEReference(deployedLocalCloudEClass, DEPLOYED_LOCAL_CLOUD__BASE_PROPERTY);

		dataSemanticsEClass = createEClass(DATA_SEMANTICS);
		createEAttribute(dataSemanticsEClass, DATA_SEMANTICS__SEMANTIC_MODEL);
		createEAttribute(dataSemanticsEClass, DATA_SEMANTICS__ONTOLOGY);
		createEAttribute(dataSemanticsEClass, DATA_SEMANTICS__SCHEMA);
		createEReference(dataSemanticsEClass, DATA_SEMANTICS__BASE_CLASS);

		deployedEntityEClass = createEClass(DEPLOYED_ENTITY);
		createEReference(deployedEntityEClass, DEPLOYED_ENTITY__BASE_PROPERTY);

		serviceRegistryFormEClass = createEClass(SERVICE_REGISTRY_FORM);
		createEAttribute(serviceRegistryFormEClass, SERVICE_REGISTRY_FORM__METADATA4);
		createEAttribute(serviceRegistryFormEClass, SERVICE_REGISTRY_FORM__SERVICE_NAME);
		createEAttribute(serviceRegistryFormEClass, SERVICE_REGISTRY_FORM__PRODUCING_SYSTEM);
		createEAttribute(serviceRegistryFormEClass, SERVICE_REGISTRY_FORM__ENCODING);
		createEAttribute(serviceRegistryFormEClass, SERVICE_REGISTRY_FORM__END_OF_VALIDITY);
		createEAttribute(serviceRegistryFormEClass, SERVICE_REGISTRY_FORM__SERVICE_URI);
		createEAttribute(serviceRegistryFormEClass, SERVICE_REGISTRY_FORM__AUTHENTICATION_INFO);
		createEAttribute(serviceRegistryFormEClass, SERVICE_REGISTRY_FORM__SECURE);
		createEAttribute(serviceRegistryFormEClass, SERVICE_REGISTRY_FORM__COMPRESSION);
		createEAttribute(serviceRegistryFormEClass, SERVICE_REGISTRY_FORM__METADATA1);
		createEAttribute(serviceRegistryFormEClass, SERVICE_REGISTRY_FORM__METADATA2);
		createEAttribute(serviceRegistryFormEClass, SERVICE_REGISTRY_FORM__METADATA3);

		systemRegistryFormEClass = createEClass(SYSTEM_REGISTRY_FORM);
		createEAttribute(systemRegistryFormEClass, SYSTEM_REGISTRY_FORM__SYSTEM_NAME);
		createEAttribute(systemRegistryFormEClass, SYSTEM_REGISTRY_FORM__HOST_DEVICE);
		createEAttribute(systemRegistryFormEClass, SYSTEM_REGISTRY_FORM__AUTHENTICATION_INFO);
		createEAttribute(systemRegistryFormEClass, SYSTEM_REGISTRY_FORM__END_OF_VALIDITY);
		createEAttribute(systemRegistryFormEClass, SYSTEM_REGISTRY_FORM__SERVICE_URI);
		createEAttribute(systemRegistryFormEClass, SYSTEM_REGISTRY_FORM__VERSION);
		createEAttribute(systemRegistryFormEClass, SYSTEM_REGISTRY_FORM__DEPLOY_TIME);
		createEAttribute(systemRegistryFormEClass, SYSTEM_REGISTRY_FORM__METADATA1);
		createEAttribute(systemRegistryFormEClass, SYSTEM_REGISTRY_FORM__METADATA2);

		deviceRegistryFormEClass = createEClass(DEVICE_REGISTRY_FORM);
		createEAttribute(deviceRegistryFormEClass, DEVICE_REGISTRY_FORM__HOST_DEVICE);
		createEAttribute(deviceRegistryFormEClass, DEVICE_REGISTRY_FORM__AUTHENTICATION_INFO);
		createEAttribute(deviceRegistryFormEClass, DEVICE_REGISTRY_FORM__END_OF_VALIDITY);
		createEAttribute(deviceRegistryFormEClass, DEVICE_REGISTRY_FORM__VERSION);
		createEAttribute(deviceRegistryFormEClass, DEVICE_REGISTRY_FORM__DEPLOY_TIME);
		createEAttribute(deviceRegistryFormEClass, DEVICE_REGISTRY_FORM__METADATA1);
		createEAttribute(deviceRegistryFormEClass, DEVICE_REGISTRY_FORM__METADATA2);

		certificateCreationFormEClass = createEClass(CERTIFICATE_CREATION_FORM);
		createEReference(certificateCreationFormEClass, CERTIFICATE_CREATION_FORM__BASE_CLASS);
		createEAttribute(certificateCreationFormEClass, CERTIFICATE_CREATION_FORM__COMMOM_NAME);
		createEAttribute(certificateCreationFormEClass, CERTIFICATE_CREATION_FORM__KEY_ALGORITHM);
		createEAttribute(certificateCreationFormEClass, CERTIFICATE_CREATION_FORM__KEY_FORMAT);
		createEAttribute(certificateCreationFormEClass, CERTIFICATE_CREATION_FORM__PRIVAT_KEY);
		createEAttribute(certificateCreationFormEClass, CERTIFICATE_CREATION_FORM__PUBLIC_KEY);

		systemofLocalCloudsDesignEClass = createEClass(SYSTEMOF_LOCAL_CLOUDS_DESIGN);
		createEReference(systemofLocalCloudsDesignEClass, SYSTEMOF_LOCAL_CLOUDS_DESIGN__LCD);
		createEOperation(systemofLocalCloudsDesignEClass, SYSTEMOF_LOCAL_CLOUDS_DESIGN___GET_LCD__LOCALCLOUDDESIGN);

		systemofLocalCloudsDesignDescriptionEClass = createEClass(SYSTEMOF_LOCAL_CLOUDS_DESIGN_DESCRIPTION);
		createEReference(systemofLocalCloudsDesignDescriptionEClass, SYSTEMOF_LOCAL_CLOUDS_DESIGN_DESCRIPTION__LCDD);
		createEOperation(systemofLocalCloudsDesignDescriptionEClass, SYSTEMOF_LOCAL_CLOUDS_DESIGN_DESCRIPTION___GET_LCDD__LOCALCLOUDDESIGNDESCRIPTION);

		networkEClass = createEClass(NETWORK);
		createEReference(networkEClass, NETWORK__BASE_CLASS);

		applicationSysDDHTTPEClass = createEClass(APPLICATION_SYS_DDHTTP);

		systemofLocalCloudsDeployedEClass = createEClass(SYSTEMOF_LOCAL_CLOUDS_DEPLOYED);
		createEReference(systemofLocalCloudsDeployedEClass, SYSTEMOF_LOCAL_CLOUDS_DEPLOYED__LOCAL_CLOUD_DEPLOYED);
		createEOperation(systemofLocalCloudsDeployedEClass, SYSTEMOF_LOCAL_CLOUDS_DEPLOYED___GET_LOCAL_CLOUD_DEPLOYED__ELIST);

		localCloudDeployedEClass = createEClass(LOCAL_CLOUD_DEPLOYED);

		deviceDeployedEClass = createEClass(DEVICE_DEPLOYED);
		createEReference(deviceDeployedEClass, DEVICE_DEPLOYED__LOCALCLOUDDEPLOYED);
		createEReference(deviceDeployedEClass, DEVICE_DEPLOYED__NETWORKDEPLOYED);

		networkDeployedEClass = createEClass(NETWORK_DEPLOYED);

		sdddEClass = createEClass(SDDD);

		mqtT_topicEClass = createEClass(MQTT_TOPIC);
		createEReference(mqtT_topicEClass, MQTT_TOPIC__BASE_CLASS);
		createEAttribute(mqtT_topicEClass, MQTT_TOPIC__SECURITY);
		createEAttribute(mqtT_topicEClass, MQTT_TOPIC__TOPIC_NAME);

		httpOperationEClass = createEClass(HTTP_OPERATION);
		createEAttribute(httpOperationEClass, HTTP_OPERATION__KIND);
		createEReference(httpOperationEClass, HTTP_OPERATION__BASE_OPERATION);

		systemRequirementsEClass = createEClass(SYSTEM_REQUIREMENTS);
		createEReference(systemRequirementsEClass, SYSTEM_REQUIREMENTS__BASE_PACKAGE);

		networkRequirementsEClass = createEClass(NETWORK_REQUIREMENTS);
		createEReference(networkRequirementsEClass, NETWORK_REQUIREMENTS__BASE_PACKAGE);

		locaCloudRequirementsEClass = createEClass(LOCA_CLOUD_REQUIREMENTS);
		createEReference(locaCloudRequirementsEClass, LOCA_CLOUD_REQUIREMENTS__BASE_PACKAGE);

		systemofLocalCloudsRequirementsEClass = createEClass(SYSTEMOF_LOCAL_CLOUDS_REQUIREMENTS);
		createEReference(systemofLocalCloudsRequirementsEClass, SYSTEMOF_LOCAL_CLOUDS_REQUIREMENTS__BASE_PACKAGE);

		deviceRequirementsEClass = createEClass(DEVICE_REQUIREMENTS);
		createEReference(deviceRequirementsEClass, DEVICE_REQUIREMENTS__BASE_PACKAGE);

		systemofLocalCloudsMaintenanceEClass = createEClass(SYSTEMOF_LOCAL_CLOUDS_MAINTENANCE);
		createEReference(systemofLocalCloudsMaintenanceEClass, SYSTEMOF_LOCAL_CLOUDS_MAINTENANCE__BASE_CLASS);
		createEReference(systemofLocalCloudsMaintenanceEClass, SYSTEMOF_LOCAL_CLOUDS_MAINTENANCE__SYSTEMOFLOCALCLOUDSDEPLOYED);

		systemofLocalCloudsEvolutionEClass = createEClass(SYSTEMOF_LOCAL_CLOUDS_EVOLUTION);
		createEReference(systemofLocalCloudsEvolutionEClass, SYSTEMOF_LOCAL_CLOUDS_EVOLUTION__BASE_CLASS);
		createEReference(systemofLocalCloudsEvolutionEClass, SYSTEMOF_LOCAL_CLOUDS_EVOLUTION__SYSTEMOFLOCALCLOUDSDEPLOYED);

		localCloudMaintenanceEClass = createEClass(LOCAL_CLOUD_MAINTENANCE);
		createEReference(localCloudMaintenanceEClass, LOCAL_CLOUD_MAINTENANCE__BASE_CLASS);
		createEReference(localCloudMaintenanceEClass, LOCAL_CLOUD_MAINTENANCE__SYSTEMOFLOCALCLOUDSMAINTENANCE);
		createEReference(localCloudMaintenanceEClass, LOCAL_CLOUD_MAINTENANCE__LOCALCLOUDDEPLOYED);

		localCloudEvolutionEClass = createEClass(LOCAL_CLOUD_EVOLUTION);
		createEReference(localCloudEvolutionEClass, LOCAL_CLOUD_EVOLUTION__BASE_CLASS);
		createEReference(localCloudEvolutionEClass, LOCAL_CLOUD_EVOLUTION__SYSTEMOFLOCALCLOUDSEVOLUTION);
		createEReference(localCloudEvolutionEClass, LOCAL_CLOUD_EVOLUTION__LOCALCLOUDDEPLOYED);

		sysMaintenanceEClass = createEClass(SYS_MAINTENANCE);
		createEReference(sysMaintenanceEClass, SYS_MAINTENANCE__BASE_CLASS);
		createEReference(sysMaintenanceEClass, SYS_MAINTENANCE__SYSIMPLEMENTATION);
		createEReference(sysMaintenanceEClass, SYS_MAINTENANCE__LOCALCLOUDMAINTENANCE);
		createEReference(sysMaintenanceEClass, SYS_MAINTENANCE__DEVICEMAINTENANCE);

		sysImplementationEClass = createEClass(SYS_IMPLEMENTATION);
		createEReference(sysImplementationEClass, SYS_IMPLEMENTATION__LOCALCLOUDIMPLEMENTATION);
		createEReference(sysImplementationEClass, SYS_IMPLEMENTATION__DEVICEIMPLEMENTATION);

		localCLoudImplementationEClass = createEClass(LOCAL_CLOUD_IMPLEMENTATION);
		createEReference(localCLoudImplementationEClass, LOCAL_CLOUD_IMPLEMENTATION__SYSTEMOFLOCALCLOUDSIMPLEMENTATION);

		systemofLocalCloudsImplementationEClass = createEClass(SYSTEMOF_LOCAL_CLOUDS_IMPLEMENTATION);

		deviceImplementationEClass = createEClass(DEVICE_IMPLEMENTATION);
		createEReference(deviceImplementationEClass, DEVICE_IMPLEMENTATION__NETWORKIMPLEMENTATION);

		networkImplementationEClass = createEClass(NETWORK_IMPLEMENTATION);

		deviceMaintenanceEClass = createEClass(DEVICE_MAINTENANCE);
		createEReference(deviceMaintenanceEClass, DEVICE_MAINTENANCE__BASE_CLASS);
		createEReference(deviceMaintenanceEClass, DEVICE_MAINTENANCE__DEVICEDEPLOYED);
		createEReference(deviceMaintenanceEClass, DEVICE_MAINTENANCE__NETWORKMAINTENANCE);

		networkMaintenanceEClass = createEClass(NETWORK_MAINTENANCE);
		createEReference(networkMaintenanceEClass, NETWORK_MAINTENANCE__BASE_CLASS);
		createEReference(networkMaintenanceEClass, NETWORK_MAINTENANCE__NETWORKDEPLOYED);

		sysEvolutionEClass = createEClass(SYS_EVOLUTION);
		createEReference(sysEvolutionEClass, SYS_EVOLUTION__BASE_CLASS);
		createEReference(sysEvolutionEClass, SYS_EVOLUTION__LOCALCLOUDEVOLUTION);
		createEReference(sysEvolutionEClass, SYS_EVOLUTION__SYSIMPLEMENTATION);
		createEReference(sysEvolutionEClass, SYS_EVOLUTION__DEVICEEVOLUTION);

		deviceEvolutionEClass = createEClass(DEVICE_EVOLUTION);
		createEReference(deviceEvolutionEClass, DEVICE_EVOLUTION__BASE_CLASS);
		createEReference(deviceEvolutionEClass, DEVICE_EVOLUTION__NETWORKEVOLUTION);
		createEReference(deviceEvolutionEClass, DEVICE_EVOLUTION__DEVICEDEPLOYED);

		networkEvolutionEClass = createEClass(NETWORK_EVOLUTION);
		createEReference(networkEvolutionEClass, NETWORK_EVOLUTION__BASE_CLASS);
		createEReference(networkEvolutionEClass, NETWORK_EVOLUTION__NETWORKDEPLOYED);

		deploymentEClass = createEClass(DEPLOYMENT);
		createEReference(deploymentEClass, DEPLOYMENT__BASE_PACKAGE);

		requirementsEClass = createEClass(REQUIREMENTS);
		createEReference(requirementsEClass, REQUIREMENTS__BASE_PACKAGE);

		functionalDesignEClass = createEClass(FUNCTIONAL_DESIGN);
		createEReference(functionalDesignEClass, FUNCTIONAL_DESIGN__BASE_PACKAGE);

		procurementEngineeringEClass = createEClass(PROCUREMENT_ENGINEERING);
		createEReference(procurementEngineeringEClass, PROCUREMENT_ENGINEERING__BASE_PACKAGE);

		maintenanceEClass = createEClass(MAINTENANCE);
		createEReference(maintenanceEClass, MAINTENANCE__BASE_PACKAGE);

		evolutionEClass = createEClass(EVOLUTION);
		createEReference(evolutionEClass, EVOLUTION__BASE_PACKAGE);

		sysDeployedEClass = createEClass(SYS_DEPLOYED);
		createEReference(sysDeployedEClass, SYS_DEPLOYED__BASE_CLASS);

		choreographyDefinitionEClass = createEClass(CHOREOGRAPHY_DEFINITION);
		createEReference(choreographyDefinitionEClass, CHOREOGRAPHY_DEFINITION__BASE_COLLABORATION);

		// Create enums
		certificateKindEEnum = createEEnum(CERTIFICATE_KIND);
		encodingKindEEnum = createEEnum(ENCODING_KIND);
		securityKindEEnum = createEEnum(SECURITY_KIND);
		protocolKindEEnum = createEEnum(PROTOCOL_KIND);
		compresionKindEEnum = createEEnum(COMPRESION_KIND);
		cryptoAlgorithmKindEEnum = createEEnum(CRYPTO_ALGORITHM_KIND);
		tokenKindEEnum = createEEnum(TOKEN_KIND);
		payloadEncryptionKindEEnum = createEEnum(PAYLOAD_ENCRYPTION_KIND);
		timeFormatKindEEnum = createEEnum(TIME_FORMAT_KIND);
		ontologyKindEEnum = createEEnum(ONTOLOGY_KIND);
		httpMethodKindEEnum = createEEnum(HTTP_METHOD_KIND);
		semanticsKindEEnum = createEEnum(SEMANTICS_KIND);
		instanceNamingStandardKindEEnum = createEEnum(INSTANCE_NAMING_STANDARD_KIND);
		statusCodeKindEEnum = createEEnum(STATUS_CODE_KIND);
		coAPMetodKindEEnum = createEEnum(CO_AP_METOD_KIND);
		schemaTypeEEnum = createEEnum(SCHEMA_TYPE);
		physicalLayerKindEEnum = createEEnum(PHYSICAL_LAYER_KIND);
		macKindEEnum = createEEnum(MAC_KIND);
		engineeringProcedureKindEEnum = createEEnum(ENGINEERING_PROCEDURE_KIND);
		osKindEEnum = createEEnum(OS_KIND);
		linuxKindEEnum = createEEnum(LINUX_KIND);
		deploymentLocationKindEEnum = createEEnum(DEPLOYMENT_LOCATION_KIND);
		deploymentTimeKindEEnum = createEEnum(DEPLOYMENT_TIME_KIND);
		deviceKindEEnum = createEEnum(DEVICE_KIND);
		processortKindEEnum = createEEnum(PROCESSORT_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BlocksPackage theBlocksPackage = (BlocksPackage)EPackage.Registry.INSTANCE.getEPackage(BlocksPackage.eNS_URI);
		PortsAndFlowsPackage thePortsAndFlowsPackage = (PortsAndFlowsPackage)EPackage.Registry.INSTANCE.getEPackage(PortsAndFlowsPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sysDEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		deviceDesignEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		networkDesignEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		sysDDEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		deviceDesignDesciptionEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		networkDesignDescriptiionEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		interfaceDesignDescriptionEClass.getESuperTypes().add(this.getServiceDescription());
		serviceDescriptionEClass.getESuperTypes().add(thePortsAndFlowsPackage.getInterfaceBlock());
		deviceEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		localCloudDesignEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		localCLoudDesignDescriptionEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		serviceRegistryFormEClass.getESuperTypes().add(this.getDataSemantics());
		systemRegistryFormEClass.getESuperTypes().add(this.getDataSemantics());
		deviceRegistryFormEClass.getESuperTypes().add(this.getDataSemantics());
		systemofLocalCloudsDesignEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		systemofLocalCloudsDesignDescriptionEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		applicationSysDDHTTPEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		systemofLocalCloudsDeployedEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		localCloudDeployedEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		deviceDeployedEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		networkDeployedEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		sdddEClass.getESuperTypes().add(this.getServiceDescription());
		sysImplementationEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		localCLoudImplementationEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		systemofLocalCloudsImplementationEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		deviceImplementationEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		networkImplementationEClass.getESuperTypes().add(theBlocksPackage.getBlock());

		// Initialize classes, features, and operations; add parameters
		initEClass(sysDEClass, SysD.class, "SysD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSysD_Devicedesign(), this.getDeviceDesign(), null, "devicedesign", null, 1, 1, SysD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(deviceDesignEClass, DeviceDesign.class, "DeviceDesign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceDesign_Networkdesign(), this.getNetworkDesign(), null, "networkdesign", null, 1, 1, DeviceDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(networkDesignEClass, NetworkDesign.class, "NetworkDesign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sysDDEClass, SysDD.class, "SysDD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSysDD_CertificateLevel(), this.getCertificateKind(), "CertificateLevel", "System", 1, 1, SysDD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSysDD_Devicedesigndesciption(), this.getDeviceDesignDesciption(), null, "devicedesigndesciption", null, 1, 1, SysDD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(deviceDesignDesciptionEClass, DeviceDesignDesciption.class, "DeviceDesignDesciption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeviceDesignDesciption_CertificateLevel(), this.getCertificateKind(), "CertificateLevel", null, 1, 1, DeviceDesignDesciption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeviceDesignDesciption_NetworkDesignDescription(), this.getNetworkDesignDescriptiion(), null, "networkDesignDescription", null, 1, 1, DeviceDesignDesciption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(networkDesignDescriptiionEClass, NetworkDesignDescriptiion.class, "NetworkDesignDescriptiion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interfaceDesignDescriptionEClass, InterfaceDesignDescription.class, "InterfaceDesignDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterfaceDesignDescription_Encoding(), this.getEncodingKind(), "Encoding", "JSON", 1, 1, InterfaceDesignDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInterfaceDesignDescription_Security(), this.getSecurityKind(), "Security", "CERTIFICATE", 1, 1, InterfaceDesignDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInterfaceDesignDescription_Protocol(), this.getProtocolKind(), "Protocol", "HTTP_1_1", 1, 1, InterfaceDesignDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInterfaceDesignDescription_Compression(), this.getCompresionKind(), "Compression", "NONE", 1, 1, InterfaceDesignDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInterfaceDesignDescription_CryptoAlgorithm(), this.getCryptoAlgorithmKind(), "CryptoAlgorithm", "RSA", 1, 1, InterfaceDesignDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInterfaceDesignDescription_Token(), this.getTokenKind(), "Token", "ArrowheadToken", 1, 1, InterfaceDesignDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInterfaceDesignDescription_CertificateLevel(), this.getCertificateKind(), "CertificateLevel", "ApplicationService", 1, 1, InterfaceDesignDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInterfaceDesignDescription_PayloadEncryption(), this.getPayloadEncryptionKind(), "PayloadEncryption", null, 1, 1, InterfaceDesignDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInterfaceDesignDescription_TimeFormat(), this.getTimeFormatKind(), "TimeFormat", null, 1, 1, InterfaceDesignDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(serviceDescriptionEClass, ServiceDescription.class, "ServiceDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subsetOfEClass, SubsetOf.class, "SubsetOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubsetOf_Base_Dependency(), theUMLPackage.getDependency(), null, "base_Dependency", null, 1, 1, SubsetOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDevice_CertificateLevel(), this.getCertificateKind(), "CertificateLevel", "Device", 1, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(metaDataEntryEClass, MetaDataEntry.class, "MetaDataEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetaDataEntry_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, MetaDataEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMetaDataEntry_Data(), theTypesPackage.getString(), "data", null, 0, -1, MetaDataEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(deployedServiceEClass, DeployedService.class, "DeployedService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeployedService_DeployedServiceName(), theTypesPackage.getString(), "DeployedServiceName", null, 1, 1, DeployedService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDeployedService_URL(), theTypesPackage.getString(), "URL", "", 1, 1, DeployedService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDeployedService_Port(), theTypesPackage.getInteger(), "port", "0", 1, 1, DeployedService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDeployedService_Certificate(), theTypesPackage.getString(), "Certificate", null, 0, 1, DeployedService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeployedService_Metadata(), this.getMetaDataEntry(), null, "metadata", null, 0, -1, DeployedService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeployedService_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 0, 1, DeployedService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(localCloudDesignEClass, LocalCloudDesign.class, "LocalCloudDesign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalCloudDesign_Sysd(), this.getSysD(), null, "sysd", null, 0, -1, LocalCloudDesign.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(localCLoudDesignDescriptionEClass, LocalCLoudDesignDescription.class, "LocalCLoudDesignDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalCLoudDesignDescription_SysDD(), this.getSysDD(), null, "SysDD", null, 0, -1, LocalCLoudDesignDescription.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getLocalCLoudDesignDescription__GetSysDD__SysDD(), null, "getSysDD", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getSysDD(), "SysDD", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(deployedDeviceEClass, DeployedDevice.class, "DeployedDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeployedDevice_Metadata(), this.getMetaDataEntry(), null, "Metadata", null, 1, -1, DeployedDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDeployedDevice_MacAddress(), theTypesPackage.getString(), "MacAddress", null, 0, 1, DeployedDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeployedDevice_NetworkInterface(), theUMLPackage.getInterfaceRealization(), null, "NetworkInterface", null, 0, 1, DeployedDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDeployedDevice_MacProtocol(), theTypesPackage.getString(), "MacProtocol", null, 0, 1, DeployedDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeployedDevice_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 0, 1, DeployedDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(deployedLocalCloudEClass, DeployedLocalCloud.class, "DeployedLocalCloud", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeployedLocalCloud_GatekeeperSystemName(), theTypesPackage.getString(), "GatekeeperSystemName", null, 0, 1, DeployedLocalCloud.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeployedLocalCloud_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 0, 1, DeployedLocalCloud.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataSemanticsEClass, DataSemantics.class, "DataSemantics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSemantics_SemanticModel(), theTypesPackage.getString(), "SemanticModel", null, 0, -1, DataSemantics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataSemantics_Ontology(), this.getOntologyKind(), "Ontology", "SenML", 0, -1, DataSemantics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataSemantics_Schema(), theTypesPackage.getString(), "Schema", null, 0, -1, DataSemantics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataSemantics_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, DataSemantics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(deployedEntityEClass, DeployedEntity.class, "DeployedEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeployedEntity_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 0, 1, DeployedEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(serviceRegistryFormEClass, ServiceRegistryForm.class, "ServiceRegistryForm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceRegistryForm_Metadata4(), theTypesPackage.getString(), "metadata4", "key=data", 1, 1, ServiceRegistryForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceRegistryForm_ServiceName(), theTypesPackage.getString(), "ServiceName", "_servicename._systemname._protocol._transport._domain:port", 1, 1, ServiceRegistryForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceRegistryForm_ProducingSystem(), theTypesPackage.getString(), "ProducingSystem", "_systemname._devicename._protocol._transport._domain", 1, 1, ServiceRegistryForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceRegistryForm_Encoding(), this.getEncodingKind(), "encoding", "", 1, 1, ServiceRegistryForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceRegistryForm_EndOfValidity(), theTypesPackage.getString(), "endOfValidity", "TTL=3600s", 1, 1, ServiceRegistryForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceRegistryForm_ServiceURI(), theTypesPackage.getString(), "serviceURI", "URI=http://<host>:<port>/service-interface", 1, 1, ServiceRegistryForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceRegistryForm_AuthenticationInfo(), theTypesPackage.getString(), "authenticationInfo", "Certificate_X509", 1, 1, ServiceRegistryForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceRegistryForm_Secure(), this.getSecurityKind(), "secure", "CERTIFICATE", 1, 1, ServiceRegistryForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceRegistryForm_Compression(), theTypesPackage.getString(), "compression", "compresion=NON", 1, 1, ServiceRegistryForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceRegistryForm_Metadata1(), theTypesPackage.getString(), "metadata1", "key=data", 1, 1, ServiceRegistryForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceRegistryForm_Metadata2(), theTypesPackage.getString(), "metadata2", "key=data", 1, 1, ServiceRegistryForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceRegistryForm_Metadata3(), theTypesPackage.getString(), "metadata3", "key=data", 1, 1, ServiceRegistryForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(systemRegistryFormEClass, SystemRegistryForm.class, "SystemRegistryForm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemRegistryForm_SystemName(), theTypesPackage.getString(), "SystemName", "_systemname._devicename._protocol._transport._domain", 1, 1, SystemRegistryForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSystemRegistryForm_HostDevice(), theTypesPackage.getString(), "HostDevice", "_devicename._localcloudname._interface._mac-protocl._macaddress", 1, 1, SystemRegistryForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSystemRegistryForm_AuthenticationInfo(), theTypesPackage.getString(), "authenticationInfo", "Certificate_X509", 1, 1, SystemRegistryForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSystemRegistryForm_EndOfValidity(), theTypesPackage.getString(), "endOfValidity", "TTL= 2 month", 1, 1, SystemRegistryForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSystemRegistryForm_ServiceURI(), theTypesPackage.getString(), "serviceURI", "URI=http://<host>:<port>/service-interface", 1, 1, SystemRegistryForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSystemRegistryForm_Version(), theTypesPackage.getString(), "version", "version=data", 1, 1, SystemRegistryForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSystemRegistryForm_DeployTime(), theTypesPackage.getString(), "deployTime", "DeployTime=data", 1, 1, SystemRegistryForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSystemRegistryForm_Metadata1(), theTypesPackage.getString(), "metadata1", "key=data", 1, 1, SystemRegistryForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSystemRegistryForm_Metadata2(), theTypesPackage.getString(), "metadata2", "key=data", 1, 1, SystemRegistryForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(deviceRegistryFormEClass, DeviceRegistryForm.class, "DeviceRegistryForm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeviceRegistryForm_HostDevice(), theTypesPackage.getString(), "HostDevice", "_devicename._localcloudname._interface._mac-protocl._macaddress", 1, 1, DeviceRegistryForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDeviceRegistryForm_AuthenticationInfo(), theTypesPackage.getString(), "authenticationInfo", "Certificate_X509", 1, 1, DeviceRegistryForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDeviceRegistryForm_EndOfValidity(), theTypesPackage.getString(), "endOfValidity", "TTL= 2 month", 1, 1, DeviceRegistryForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDeviceRegistryForm_Version(), theTypesPackage.getString(), "version", "version=data", 1, 1, DeviceRegistryForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDeviceRegistryForm_DeployTime(), theTypesPackage.getString(), "deployTime", "DeployTime=data", 1, 1, DeviceRegistryForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDeviceRegistryForm_Metadata1(), theTypesPackage.getString(), "metadata1", "key=data", 1, 1, DeviceRegistryForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDeviceRegistryForm_Metadata2(), theTypesPackage.getString(), "metadata2", "key=data", 1, 1, DeviceRegistryForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(certificateCreationFormEClass, CertificateCreationForm.class, "CertificateCreationForm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCertificateCreationForm_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, CertificateCreationForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCertificateCreationForm_CommomName(), theTypesPackage.getString(), "commomName", null, 1, 1, CertificateCreationForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCertificateCreationForm_KeyAlgorithm(), this.getCryptoAlgorithmKind(), "keyAlgorithm", "RSA", 1, 1, CertificateCreationForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCertificateCreationForm_KeyFormat(), theTypesPackage.getString(), "keyFormat", null, 1, 1, CertificateCreationForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCertificateCreationForm_PrivatKey(), theTypesPackage.getString(), "privatKey", null, 1, 1, CertificateCreationForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCertificateCreationForm_PublicKey(), theTypesPackage.getString(), "publicKey", null, 1, 1, CertificateCreationForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(systemofLocalCloudsDesignEClass, SystemofLocalCloudsDesign.class, "SystemofLocalCloudsDesign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemofLocalCloudsDesign_LCD(), this.getLocalCloudDesign(), null, "LCD", null, 0, -1, SystemofLocalCloudsDesign.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getSystemofLocalCloudsDesign__GetLCD__LocalCloudDesign(), null, "getLCD", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getLocalCloudDesign(), "LCD", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(systemofLocalCloudsDesignDescriptionEClass, SystemofLocalCloudsDesignDescription.class, "SystemofLocalCloudsDesignDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemofLocalCloudsDesignDescription_LCDD(), this.getLocalCLoudDesignDescription(), null, "LCDD", null, 0, -1, SystemofLocalCloudsDesignDescription.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getSystemofLocalCloudsDesignDescription__GetLCDD__LocalCLoudDesignDescription(), null, "getLCDD", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getLocalCLoudDesignDescription(), "LCDD", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(networkEClass, Network.class, "Network", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNetwork_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(applicationSysDDHTTPEClass, ApplicationSysDDHTTP.class, "ApplicationSysDDHTTP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemofLocalCloudsDeployedEClass, SystemofLocalCloudsDeployed.class, "SystemofLocalCloudsDeployed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemofLocalCloudsDeployed_LocalCloudDeployed(), this.getLocalCloudDeployed(), null, "localCloudDeployed", null, 0, -1, SystemofLocalCloudsDeployed.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getSystemofLocalCloudsDeployed__GetLocalCloudDeployed__EList(), null, "getLocalCloudDeployed", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getLocalCloudDeployed(), "localCloudsDeployed", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(localCloudDeployedEClass, LocalCloudDeployed.class, "LocalCloudDeployed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deviceDeployedEClass, DeviceDeployed.class, "DeviceDeployed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceDeployed_Localclouddeployed(), this.getLocalCloudDeployed(), null, "localclouddeployed", null, 1, 1, DeviceDeployed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeviceDeployed_Networkdeployed(), this.getNetworkDeployed(), null, "networkdeployed", null, 1, -1, DeviceDeployed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(networkDeployedEClass, NetworkDeployed.class, "NetworkDeployed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sdddEClass, org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SDDD.class, "SDDD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mqtT_topicEClass, MQTT_topic.class, "MQTT_topic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMQTT_topic_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, MQTT_topic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMQTT_topic_Security(), theTypesPackage.getString(), "Security", null, 1, 1, MQTT_topic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMQTT_topic_TopicName(), theTypesPackage.getString(), "TopicName", null, 1, 1, MQTT_topic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(httpOperationEClass, HttpOperation.class, "HttpOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHttpOperation_Kind(), this.getHttpMethodKind(), "kind", null, 1, 1, HttpOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHttpOperation_Base_Operation(), theUMLPackage.getOperation(), null, "base_Operation", null, 0, 1, HttpOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(systemRequirementsEClass, SystemRequirements.class, "SystemRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemRequirements_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 0, 1, SystemRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(networkRequirementsEClass, NetworkRequirements.class, "NetworkRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNetworkRequirements_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 0, 1, NetworkRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(locaCloudRequirementsEClass, LocaCloudRequirements.class, "LocaCloudRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocaCloudRequirements_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 0, 1, LocaCloudRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(systemofLocalCloudsRequirementsEClass, SystemofLocalCloudsRequirements.class, "SystemofLocalCloudsRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemofLocalCloudsRequirements_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 0, 1, SystemofLocalCloudsRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(deviceRequirementsEClass, DeviceRequirements.class, "DeviceRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceRequirements_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 0, 1, DeviceRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(systemofLocalCloudsMaintenanceEClass, SystemofLocalCloudsMaintenance.class, "SystemofLocalCloudsMaintenance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemofLocalCloudsMaintenance_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, SystemofLocalCloudsMaintenance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSystemofLocalCloudsMaintenance_Systemoflocalcloudsdeployed(), this.getSystemofLocalCloudsDeployed(), null, "systemoflocalcloudsdeployed", null, 1, 1, SystemofLocalCloudsMaintenance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(systemofLocalCloudsEvolutionEClass, SystemofLocalCloudsEvolution.class, "SystemofLocalCloudsEvolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemofLocalCloudsEvolution_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, SystemofLocalCloudsEvolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSystemofLocalCloudsEvolution_Systemoflocalcloudsdeployed(), this.getSystemofLocalCloudsDeployed(), null, "systemoflocalcloudsdeployed", null, 1, 1, SystemofLocalCloudsEvolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(localCloudMaintenanceEClass, LocalCloudMaintenance.class, "LocalCloudMaintenance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalCloudMaintenance_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, LocalCloudMaintenance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLocalCloudMaintenance_Systemoflocalcloudsmaintenance(), this.getSystemofLocalCloudsMaintenance(), null, "systemoflocalcloudsmaintenance", null, 0, 1, LocalCloudMaintenance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLocalCloudMaintenance_Localclouddeployed(), this.getLocalCloudDeployed(), null, "localclouddeployed", null, 1, 1, LocalCloudMaintenance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(localCloudEvolutionEClass, LocalCloudEvolution.class, "LocalCloudEvolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalCloudEvolution_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, LocalCloudEvolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLocalCloudEvolution_Systemoflocalcloudsevolution(), this.getSystemofLocalCloudsEvolution(), null, "systemoflocalcloudsevolution", null, 0, 1, LocalCloudEvolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLocalCloudEvolution_Localclouddeployed(), this.getLocalCloudDeployed(), null, "localclouddeployed", null, 1, 1, LocalCloudEvolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sysMaintenanceEClass, SysMaintenance.class, "SysMaintenance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSysMaintenance_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, SysMaintenance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSysMaintenance_Sysimplementation(), this.getSysImplementation(), null, "sysimplementation", null, 1, 1, SysMaintenance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSysMaintenance_Localcloudmaintenance(), this.getLocalCloudMaintenance(), null, "localcloudmaintenance", null, 1, 1, SysMaintenance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSysMaintenance_Devicemaintenance(), this.getDeviceMaintenance(), null, "devicemaintenance", null, 1, 1, SysMaintenance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sysImplementationEClass, SysImplementation.class, "SysImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSysImplementation_Localcloudimplementation(), this.getLocalCLoudImplementation(), null, "localcloudimplementation", null, 1, 1, SysImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSysImplementation_Deviceimplementation(), this.getDeviceImplementation(), null, "deviceimplementation", null, 1, 1, SysImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(localCLoudImplementationEClass, LocalCLoudImplementation.class, "LocalCLoudImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalCLoudImplementation_Systemoflocalcloudsimplementation(), this.getSystemofLocalCloudsImplementation(), null, "systemoflocalcloudsimplementation", null, 0, -1, LocalCLoudImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(systemofLocalCloudsImplementationEClass, SystemofLocalCloudsImplementation.class, "SystemofLocalCloudsImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deviceImplementationEClass, DeviceImplementation.class, "DeviceImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceImplementation_Networkimplementation(), this.getNetworkImplementation(), null, "networkimplementation", null, 1, -1, DeviceImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(networkImplementationEClass, NetworkImplementation.class, "NetworkImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deviceMaintenanceEClass, DeviceMaintenance.class, "DeviceMaintenance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceMaintenance_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, DeviceMaintenance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeviceMaintenance_Devicedeployed(), this.getDeviceDeployed(), null, "devicedeployed", null, 1, 1, DeviceMaintenance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeviceMaintenance_Networkmaintenance(), this.getNetworkMaintenance(), null, "networkmaintenance", null, 1, -1, DeviceMaintenance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(networkMaintenanceEClass, NetworkMaintenance.class, "NetworkMaintenance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNetworkMaintenance_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, NetworkMaintenance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNetworkMaintenance_Networkdeployed(), this.getNetworkDeployed(), null, "networkdeployed", null, 1, 1, NetworkMaintenance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sysEvolutionEClass, SysEvolution.class, "SysEvolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSysEvolution_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, SysEvolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSysEvolution_Localcloudevolution(), this.getLocalCloudEvolution(), null, "localcloudevolution", null, 1, 1, SysEvolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSysEvolution_Sysimplementation(), this.getSysImplementation(), null, "sysimplementation", null, 1, 1, SysEvolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSysEvolution_Deviceevolution(), this.getDeviceEvolution(), null, "deviceevolution", null, 1, 1, SysEvolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(deviceEvolutionEClass, DeviceEvolution.class, "DeviceEvolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceEvolution_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, DeviceEvolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeviceEvolution_Networkevolution(), this.getNetworkEvolution(), null, "networkevolution", null, 1, -1, DeviceEvolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeviceEvolution_Devicedeployed(), this.getDeviceDeployed(), null, "devicedeployed", null, 1, 1, DeviceEvolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(networkEvolutionEClass, NetworkEvolution.class, "NetworkEvolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNetworkEvolution_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, NetworkEvolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNetworkEvolution_Networkdeployed(), this.getNetworkDeployed(), null, "networkdeployed", null, 1, 1, NetworkEvolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(deploymentEClass, Deployment.class, "Deployment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeployment_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(requirementsEClass, Requirements.class, "Requirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirements_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 0, 1, Requirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(functionalDesignEClass, FunctionalDesign.class, "FunctionalDesign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionalDesign_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 0, 1, FunctionalDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(procurementEngineeringEClass, ProcurementEngineering.class, "ProcurementEngineering", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcurementEngineering_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 0, 1, ProcurementEngineering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(maintenanceEClass, Maintenance.class, "Maintenance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMaintenance_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 0, 1, Maintenance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(evolutionEClass, Evolution.class, "Evolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvolution_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 0, 1, Evolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sysDeployedEClass, SysDeployed.class, "SysDeployed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSysDeployed_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, SysDeployed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(choreographyDefinitionEClass, ChoreographyDefinition.class, "ChoreographyDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChoreographyDefinition_Base_Collaboration(), theUMLPackage.getCollaboration(), null, "base_Collaboration", null, 0, 1, ChoreographyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(certificateKindEEnum, CertificateKind.class, "CertificateKind");
		addEEnumLiteral(certificateKindEEnum, CertificateKind.DEVICE);
		addEEnumLiteral(certificateKindEEnum, CertificateKind.SYSTEM);
		addEEnumLiteral(certificateKindEEnum, CertificateKind.CORE_SERVICE);
		addEEnumLiteral(certificateKindEEnum, CertificateKind.APPLICATION_SERVICE);
		addEEnumLiteral(certificateKindEEnum, CertificateKind.MANAGEMENT_SERVICE);

		initEEnum(encodingKindEEnum, EncodingKind.class, "EncodingKind");
		addEEnumLiteral(encodingKindEEnum, EncodingKind.JSON);
		addEEnumLiteral(encodingKindEEnum, EncodingKind.XML);
		addEEnumLiteral(encodingKindEEnum, EncodingKind.CBOR);
		addEEnumLiteral(encodingKindEEnum, EncodingKind.OTHER);

		initEEnum(securityKindEEnum, SecurityKind.class, "SecurityKind");
		addEEnumLiteral(securityKindEEnum, SecurityKind.CERTIFICATE);
		addEEnumLiteral(securityKindEEnum, SecurityKind.NOT_SECURE);
		addEEnumLiteral(securityKindEEnum, SecurityKind.TOKEN);

		initEEnum(protocolKindEEnum, ProtocolKind.class, "ProtocolKind");
		addEEnumLiteral(protocolKindEEnum, ProtocolKind.HTTP_09);
		addEEnumLiteral(protocolKindEEnum, ProtocolKind.HTTP_10);
		addEEnumLiteral(protocolKindEEnum, ProtocolKind.HTTP_11);
		addEEnumLiteral(protocolKindEEnum, ProtocolKind.HTTP_20);
		addEEnumLiteral(protocolKindEEnum, ProtocolKind.CO_AP);
		addEEnumLiteral(protocolKindEEnum, ProtocolKind.CO_AP_TCP);
		addEEnumLiteral(protocolKindEEnum, ProtocolKind.CO_APS);
		addEEnumLiteral(protocolKindEEnum, ProtocolKind.CO_APS_TCP);
		addEEnumLiteral(protocolKindEEnum, ProtocolKind.MQTT_311);
		addEEnumLiteral(protocolKindEEnum, ProtocolKind.MQTT_50);
		addEEnumLiteral(protocolKindEEnum, ProtocolKind.WEBSOCKET);
		addEEnumLiteral(protocolKindEEnum, ProtocolKind.OTHER);

		initEEnum(compresionKindEEnum, CompresionKind.class, "CompresionKind");
		addEEnumLiteral(compresionKindEEnum, CompresionKind.EXI);
		addEEnumLiteral(compresionKindEEnum, CompresionKind.OTHER);
		addEEnumLiteral(compresionKindEEnum, CompresionKind.NONE);

		initEEnum(cryptoAlgorithmKindEEnum, CryptoAlgorithmKind.class, "CryptoAlgorithmKind");
		addEEnumLiteral(cryptoAlgorithmKindEEnum, CryptoAlgorithmKind.RSA);
		addEEnumLiteral(cryptoAlgorithmKindEEnum, CryptoAlgorithmKind.ELLIPTIC_CURVE);
		addEEnumLiteral(cryptoAlgorithmKindEEnum, CryptoAlgorithmKind.DIFFIE_HELLMAN);
		addEEnumLiteral(cryptoAlgorithmKindEEnum, CryptoAlgorithmKind.SERPENT);
		addEEnumLiteral(cryptoAlgorithmKindEEnum, CryptoAlgorithmKind.AES);

		initEEnum(tokenKindEEnum, TokenKind.class, "TokenKind");
		addEEnumLiteral(tokenKindEEnum, TokenKind.ARROWHEAD_TOKEN);
		addEEnumLiteral(tokenKindEEnum, TokenKind.OTHER);

		initEEnum(payloadEncryptionKindEEnum, PayloadEncryptionKind.class, "PayloadEncryptionKind");
		addEEnumLiteral(payloadEncryptionKindEEnum, PayloadEncryptionKind.DTLS);
		addEEnumLiteral(payloadEncryptionKindEEnum, PayloadEncryptionKind.TLS);

		initEEnum(timeFormatKindEEnum, TimeFormatKind.class, "TimeFormatKind");
		addEEnumLiteral(timeFormatKindEEnum, TimeFormatKind.RFC_3339);
		addEEnumLiteral(timeFormatKindEEnum, TimeFormatKind.ISO_8601);
		addEEnumLiteral(timeFormatKindEEnum, TimeFormatKind.OTHER);

		initEEnum(ontologyKindEEnum, OntologyKind.class, "OntologyKind");
		addEEnumLiteral(ontologyKindEEnum, OntologyKind.SEN_ML);
		addEEnumLiteral(ontologyKindEEnum, OntologyKind.ISO10303_AP203);
		addEEnumLiteral(ontologyKindEEnum, OntologyKind.ISO15396);

		initEEnum(httpMethodKindEEnum, HttpMethodKind.class, "HttpMethodKind");
		addEEnumLiteral(httpMethodKindEEnum, HttpMethodKind.GET);
		addEEnumLiteral(httpMethodKindEEnum, HttpMethodKind.PUT);
		addEEnumLiteral(httpMethodKindEEnum, HttpMethodKind.POST);
		addEEnumLiteral(httpMethodKindEEnum, HttpMethodKind.DELETE);
		addEEnumLiteral(httpMethodKindEEnum, HttpMethodKind.PATCH);
		addEEnumLiteral(httpMethodKindEEnum, HttpMethodKind.HEAD);
		addEEnumLiteral(httpMethodKindEEnum, HttpMethodKind.CONNECT);
		addEEnumLiteral(httpMethodKindEEnum, HttpMethodKind.OPTIONS);
		addEEnumLiteral(httpMethodKindEEnum, HttpMethodKind.TRACE);

		initEEnum(semanticsKindEEnum, SemanticsKind.class, "SemanticsKind");
		addEEnumLiteral(semanticsKindEEnum, SemanticsKind.SEN_ML);

		initEEnum(instanceNamingStandardKindEEnum, InstanceNamingStandardKind.class, "InstanceNamingStandardKind");
		addEEnumLiteral(instanceNamingStandardKindEEnum, InstanceNamingStandardKind.ISO15296);
		addEEnumLiteral(instanceNamingStandardKindEEnum, InstanceNamingStandardKind.ISO10303);
		addEEnumLiteral(instanceNamingStandardKindEEnum, InstanceNamingStandardKind.BIM_V5);
		addEEnumLiteral(instanceNamingStandardKindEEnum, InstanceNamingStandardKind.BIM_V4);
		addEEnumLiteral(instanceNamingStandardKindEEnum, InstanceNamingStandardKind.BIM_V3);
		addEEnumLiteral(instanceNamingStandardKindEEnum, InstanceNamingStandardKind.OTHER);

		initEEnum(statusCodeKindEEnum, StatusCodeKind.class, "StatusCodeKind");
		addEEnumLiteral(statusCodeKindEEnum, StatusCodeKind._100);
		addEEnumLiteral(statusCodeKindEEnum, StatusCodeKind._200);
		addEEnumLiteral(statusCodeKindEEnum, StatusCodeKind._201);
		addEEnumLiteral(statusCodeKindEEnum, StatusCodeKind._400);
		addEEnumLiteral(statusCodeKindEEnum, StatusCodeKind._401);
		addEEnumLiteral(statusCodeKindEEnum, StatusCodeKind._422);
		addEEnumLiteral(statusCodeKindEEnum, StatusCodeKind._500);

		initEEnum(coAPMetodKindEEnum, CoAPMetodKind.class, "CoAPMetodKind");
		addEEnumLiteral(coAPMetodKindEEnum, CoAPMetodKind.GET);
		addEEnumLiteral(coAPMetodKindEEnum, CoAPMetodKind.PUT);
		addEEnumLiteral(coAPMetodKindEEnum, CoAPMetodKind.POST);
		addEEnumLiteral(coAPMetodKindEEnum, CoAPMetodKind.DELETE);
		addEEnumLiteral(coAPMetodKindEEnum, CoAPMetodKind.PATCH);

		initEEnum(schemaTypeEEnum, SchemaType.class, "SchemaType");
		addEEnumLiteral(schemaTypeEEnum, SchemaType.XML_SCHEMA);
		addEEnumLiteral(schemaTypeEEnum, SchemaType.JSON_SCHEMA);

		initEEnum(physicalLayerKindEEnum, PhysicalLayerKind.class, "PhysicalLayerKind");
		addEEnumLiteral(physicalLayerKindEEnum, PhysicalLayerKind._802_3);
		addEEnumLiteral(physicalLayerKindEEnum, PhysicalLayerKind._802_15_4);
		addEEnumLiteral(physicalLayerKindEEnum, PhysicalLayerKind._802_11A);
		addEEnumLiteral(physicalLayerKindEEnum, PhysicalLayerKind._802_11_B);

		initEEnum(macKindEEnum, MacKind.class, "MacKind");
		addEEnumLiteral(macKindEEnum, MacKind.CDMA);
		addEEnumLiteral(macKindEEnum, MacKind.TDMA);

		initEEnum(engineeringProcedureKindEEnum, EngineeringProcedureKind.class, "EngineeringProcedureKind");

		initEEnum(osKindEEnum, OSKind.class, "OSKind");
		addEEnumLiteral(osKindEEnum, OSKind.LINUX);
		addEEnumLiteral(osKindEEnum, OSKind.MAC_OS);
		addEEnumLiteral(osKindEEnum, OSKind.WINDOWS);
		addEEnumLiteral(osKindEEnum, OSKind.ROS);

		initEEnum(linuxKindEEnum, LinuxKind.class, "LinuxKind");
		addEEnumLiteral(linuxKindEEnum, LinuxKind.UBUNTU_20_10);
		addEEnumLiteral(linuxKindEEnum, LinuxKind.UBUNTU_20_04_LTS);
		addEEnumLiteral(linuxKindEEnum, LinuxKind.UBUNTU_RASPBERRY_PI_2);
		addEEnumLiteral(linuxKindEEnum, LinuxKind.UBUNTU_RASPBERRY_PI_3);
		addEEnumLiteral(linuxKindEEnum, LinuxKind.UBUNTU_RASPBERRY_PI_4);

		initEEnum(deploymentLocationKindEEnum, DeploymentLocationKind.class, "DeploymentLocationKind");
		addEEnumLiteral(deploymentLocationKindEEnum, DeploymentLocationKind.COORDINATES);
		addEEnumLiteral(deploymentLocationKindEEnum, DeploymentLocationKind.LOCATION_ID);
		addEEnumLiteral(deploymentLocationKindEEnum, DeploymentLocationKind.POWER_ID);
		addEEnumLiteral(deploymentLocationKindEEnum, DeploymentLocationKind.NETWORK_ID);

		initEEnum(deploymentTimeKindEEnum, DeploymentTimeKind.class, "DeploymentTimeKind");
		addEEnumLiteral(deploymentTimeKindEEnum, DeploymentTimeKind.DEPLOYMENT_TIME);

		initEEnum(deviceKindEEnum, DeviceKind.class, "DeviceKind");
		addEEnumLiteral(deviceKindEEnum, DeviceKind.STM32);
		addEEnumLiteral(deviceKindEEnum, DeviceKind.RASPBEERY_PI);

		initEEnum(processortKindEEnum, ProcessortKind.class, "ProcessortKind");
		addEEnumLiteral(processortKindEEnum, ProcessortKind.ARM_M1);
		addEEnumLiteral(processortKindEEnum, ProcessortKind.ARM_M2);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
		// http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName
		createEmofAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "originalName", "Arrowhead"
		   });
		addAnnotation
		  (getSysD_Devicedesign(),
		   source,
		   new String[] {
			   "originalName", "device-design"
		   });
		addAnnotation
		  (deviceDesignEClass,
		   source,
		   new String[] {
			   "originalName", "Device-Design"
		   });
		addAnnotation
		  (getDeviceDesign_Networkdesign(),
		   source,
		   new String[] {
			   "originalName", "network-design"
		   });
		addAnnotation
		  (networkDesignEClass,
		   source,
		   new String[] {
			   "originalName", "Network-Design"
		   });
		addAnnotation
		  (getSysDD_Devicedesigndesciption(),
		   source,
		   new String[] {
			   "originalName", "device-designdesciption"
		   });
		addAnnotation
		  (deviceDesignDesciptionEClass,
		   source,
		   new String[] {
			   "originalName", "Device-DesignDesciption"
		   });
		addAnnotation
		  (getDeviceDesignDesciption_NetworkDesignDescription(),
		   source,
		   new String[] {
			   "originalName", "network-DesignDescription"
		   });
		addAnnotation
		  (networkDesignDescriptiionEClass,
		   source,
		   new String[] {
			   "originalName", "Network-DesignDescriptiion"
		   });
		addAnnotation
		  (getServiceRegistryForm_Metadata4(),
		   source,
		   new String[] {
			   "originalName", "metadata-4"
		   });
		addAnnotation
		  (getServiceRegistryForm_Metadata1(),
		   source,
		   new String[] {
			   "originalName", "metadata-1"
		   });
		addAnnotation
		  (getServiceRegistryForm_Metadata2(),
		   source,
		   new String[] {
			   "originalName", "metadata-2"
		   });
		addAnnotation
		  (getServiceRegistryForm_Metadata3(),
		   source,
		   new String[] {
			   "originalName", "metadata-3"
		   });
		addAnnotation
		  (getSystemRegistryForm_Metadata1(),
		   source,
		   new String[] {
			   "originalName", "metadata-1"
		   });
		addAnnotation
		  (getSystemRegistryForm_Metadata2(),
		   source,
		   new String[] {
			   "originalName", "metadata-2"
		   });
		addAnnotation
		  (getDeviceRegistryForm_Metadata1(),
		   source,
		   new String[] {
			   "originalName", "metadata-1"
		   });
		addAnnotation
		  (getDeviceRegistryForm_Metadata2(),
		   source,
		   new String[] {
			   "originalName", "metadata-2"
		   });
		addAnnotation
		  (systemofLocalCloudsDesignEClass,
		   source,
		   new String[] {
			   "originalName", "System-of-LocalClouds-Design"
		   });
		addAnnotation
		  (systemofLocalCloudsDesignDescriptionEClass,
		   source,
		   new String[] {
			   "originalName", "System-of-LocalClouds-DesignDescription"
		   });
		addAnnotation
		  (applicationSysDDHTTPEClass,
		   source,
		   new String[] {
			   "originalName", "ApplicationSysDD-HTTP"
		   });
		addAnnotation
		  (systemofLocalCloudsDeployedEClass,
		   source,
		   new String[] {
			   "originalName", "System-of-LocalClouds-Deployed"
		   });
		addAnnotation
		  (getSystemofLocalCloudsDeployed__GetLocalCloudDeployed__EList(),
		   source,
		   new String[] {
			   "originalName", "getLocalCloud-Deployed"
		   });
		addAnnotation
		  ((getSystemofLocalCloudsDeployed__GetLocalCloudDeployed__EList()).getEParameters().get(0),
		   source,
		   new String[] {
			   "originalName", "localClouds-Deployed"
		   });
		addAnnotation
		  (getSystemofLocalCloudsDeployed_LocalCloudDeployed(),
		   source,
		   new String[] {
			   "originalName", "localCloud-Deployed"
		   });
		addAnnotation
		  (localCloudDeployedEClass,
		   source,
		   new String[] {
			   "originalName", "LocalCloud-Deployed"
		   });
		addAnnotation
		  (deviceDeployedEClass,
		   source,
		   new String[] {
			   "originalName", "Device-Deployed"
		   });
		addAnnotation
		  (getDeviceDeployed_Localclouddeployed(),
		   source,
		   new String[] {
			   "originalName", "localcloud-deployed"
		   });
		addAnnotation
		  (getDeviceDeployed_Networkdeployed(),
		   source,
		   new String[] {
			   "originalName", "network-deployed"
		   });
		addAnnotation
		  (networkDeployedEClass,
		   source,
		   new String[] {
			   "originalName", "Network-Deployed"
		   });
		addAnnotation
		  (sdddEClass,
		   source,
		   new String[] {
			   "originalName", "SD-DD"
		   });
		addAnnotation
		  (systemRequirementsEClass,
		   source,
		   new String[] {
			   "originalName", "System-Requirements"
		   });
		addAnnotation
		  (networkRequirementsEClass,
		   source,
		   new String[] {
			   "originalName", "Network-Requirements"
		   });
		addAnnotation
		  (locaCloudRequirementsEClass,
		   source,
		   new String[] {
			   "originalName", "LocaCloud-Requirements"
		   });
		addAnnotation
		  (systemofLocalCloudsRequirementsEClass,
		   source,
		   new String[] {
			   "originalName", "System-of-LocalClouds-Requirements"
		   });
		addAnnotation
		  (deviceRequirementsEClass,
		   source,
		   new String[] {
			   "originalName", "Device-Requirements"
		   });
		addAnnotation
		  (systemofLocalCloudsMaintenanceEClass,
		   source,
		   new String[] {
			   "originalName", "System-of-LocalClouds-Maintenance"
		   });
		addAnnotation
		  (getSystemofLocalCloudsMaintenance_Systemoflocalcloudsdeployed(),
		   source,
		   new String[] {
			   "originalName", "system-of-localclouds-deployed"
		   });
		addAnnotation
		  (systemofLocalCloudsEvolutionEClass,
		   source,
		   new String[] {
			   "originalName", "System-of-LocalClouds-Evolution"
		   });
		addAnnotation
		  (getSystemofLocalCloudsEvolution_Systemoflocalcloudsdeployed(),
		   source,
		   new String[] {
			   "originalName", "system-of-localclouds-deployed"
		   });
		addAnnotation
		  (localCloudMaintenanceEClass,
		   source,
		   new String[] {
			   "originalName", "LocalCloud-Maintenance"
		   });
		addAnnotation
		  (getLocalCloudMaintenance_Systemoflocalcloudsmaintenance(),
		   source,
		   new String[] {
			   "originalName", "system-of-localclouds-maintenance"
		   });
		addAnnotation
		  (getLocalCloudMaintenance_Localclouddeployed(),
		   source,
		   new String[] {
			   "originalName", "localcloud-deployed"
		   });
		addAnnotation
		  (localCloudEvolutionEClass,
		   source,
		   new String[] {
			   "originalName", "LocalCloud-Evolution"
		   });
		addAnnotation
		  (getLocalCloudEvolution_Systemoflocalcloudsevolution(),
		   source,
		   new String[] {
			   "originalName", "system-of-localclouds-evolution"
		   });
		addAnnotation
		  (getLocalCloudEvolution_Localclouddeployed(),
		   source,
		   new String[] {
			   "originalName", "localcloud-deployed"
		   });
		addAnnotation
		  (sysMaintenanceEClass,
		   source,
		   new String[] {
			   "originalName", "Sys-Maintenance"
		   });
		addAnnotation
		  (getSysMaintenance_Sysimplementation(),
		   source,
		   new String[] {
			   "originalName", "sys-implementation"
		   });
		addAnnotation
		  (getSysMaintenance_Localcloudmaintenance(),
		   source,
		   new String[] {
			   "originalName", "localcloud-maintenance"
		   });
		addAnnotation
		  (getSysMaintenance_Devicemaintenance(),
		   source,
		   new String[] {
			   "originalName", "device-maintenance"
		   });
		addAnnotation
		  (sysImplementationEClass,
		   source,
		   new String[] {
			   "originalName", "Sys-Implementation"
		   });
		addAnnotation
		  (getSysImplementation_Localcloudimplementation(),
		   source,
		   new String[] {
			   "originalName", "localcloud-implementation"
		   });
		addAnnotation
		  (getSysImplementation_Deviceimplementation(),
		   source,
		   new String[] {
			   "originalName", "device-implementation"
		   });
		addAnnotation
		  (localCLoudImplementationEClass,
		   source,
		   new String[] {
			   "originalName", "LocalCLoud-Implementation"
		   });
		addAnnotation
		  (getLocalCLoudImplementation_Systemoflocalcloudsimplementation(),
		   source,
		   new String[] {
			   "originalName", "system-of-localclouds-implementation"
		   });
		addAnnotation
		  (systemofLocalCloudsImplementationEClass,
		   source,
		   new String[] {
			   "originalName", "System-of-LocalClouds-Implementation"
		   });
		addAnnotation
		  (deviceImplementationEClass,
		   source,
		   new String[] {
			   "originalName", "Device-Implementation"
		   });
		addAnnotation
		  (getDeviceImplementation_Networkimplementation(),
		   source,
		   new String[] {
			   "originalName", "network-implementation"
		   });
		addAnnotation
		  (networkImplementationEClass,
		   source,
		   new String[] {
			   "originalName", "Network-Implementation"
		   });
		addAnnotation
		  (deviceMaintenanceEClass,
		   source,
		   new String[] {
			   "originalName", "Device-Maintenance"
		   });
		addAnnotation
		  (getDeviceMaintenance_Devicedeployed(),
		   source,
		   new String[] {
			   "originalName", "device-deployed"
		   });
		addAnnotation
		  (getDeviceMaintenance_Networkmaintenance(),
		   source,
		   new String[] {
			   "originalName", "network-maintenance"
		   });
		addAnnotation
		  (networkMaintenanceEClass,
		   source,
		   new String[] {
			   "originalName", "Network-Maintenance"
		   });
		addAnnotation
		  (getNetworkMaintenance_Networkdeployed(),
		   source,
		   new String[] {
			   "originalName", "network-deployed"
		   });
		addAnnotation
		  (sysEvolutionEClass,
		   source,
		   new String[] {
			   "originalName", "Sys-Evolution"
		   });
		addAnnotation
		  (getSysEvolution_Localcloudevolution(),
		   source,
		   new String[] {
			   "originalName", "localcloud-evolution"
		   });
		addAnnotation
		  (getSysEvolution_Sysimplementation(),
		   source,
		   new String[] {
			   "originalName", "sys-implementation"
		   });
		addAnnotation
		  (getSysEvolution_Deviceevolution(),
		   source,
		   new String[] {
			   "originalName", "device-evolution"
		   });
		addAnnotation
		  (deviceEvolutionEClass,
		   source,
		   new String[] {
			   "originalName", "Device-Evolution"
		   });
		addAnnotation
		  (getDeviceEvolution_Networkevolution(),
		   source,
		   new String[] {
			   "originalName", "network-evolution"
		   });
		addAnnotation
		  (getDeviceEvolution_Devicedeployed(),
		   source,
		   new String[] {
			   "originalName", "device-deployed"
		   });
		addAnnotation
		  (networkEvolutionEClass,
		   source,
		   new String[] {
			   "originalName", "Network-Evolution"
		   });
		addAnnotation
		  (getNetworkEvolution_Networkdeployed(),
		   source,
		   new String[] {
			   "originalName", "network-deployed"
		   });
		addAnnotation
		  (procurementEngineeringEClass,
		   source,
		   new String[] {
			   "originalName", "Procurement&Engineering"
		   });
		addAnnotation
		  (sysDeployedEClass,
		   source,
		   new String[] {
			   "originalName", "Sys-Deployed"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEmofAnnotations() {
		String source = "http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName";
		addAnnotation
		  (getSysD_Devicedesign(),
		   source,
		   new String[] {
			   "body", "sysd"
		   });
		addAnnotation
		  (getDeviceDesign_Networkdesign(),
		   source,
		   new String[] {
			   "body", "device-design"
		   });
		addAnnotation
		  (getSysDD_Devicedesigndesciption(),
		   source,
		   new String[] {
			   "body", "sysdd"
		   });
		addAnnotation
		  (getDeployedService_Base_Property(),
		   source,
		   new String[] {
			   "body", "extension_DeployedService"
		   });
		addAnnotation
		  (getLocalCloudDesign_Sysd(),
		   source,
		   new String[] {
			   "body", "localclouddesign"
		   });
		addAnnotation
		  (getLocalCLoudDesignDescription_SysDD(),
		   source,
		   new String[] {
			   "body", "LCDD"
		   });
		addAnnotation
		  (getDeployedDevice_Base_Property(),
		   source,
		   new String[] {
			   "body", "extension_DeployedDevice"
		   });
		addAnnotation
		  (getDeployedLocalCloud_Base_Property(),
		   source,
		   new String[] {
			   "body", "extension_DeployedLocalCloud"
		   });
		addAnnotation
		  (getDeployedEntity_Base_Property(),
		   source,
		   new String[] {
			   "body", "extension_DeployedEntity"
		   });
		addAnnotation
		  (getSystemofLocalCloudsDesign_LCD(),
		   source,
		   new String[] {
			   "body", "SoLCD"
		   });
		addAnnotation
		  (getSystemofLocalCloudsDesignDescription_LCDD(),
		   source,
		   new String[] {
			   "body", "SoLCDD"
		   });
		addAnnotation
		  (getDeviceDeployed_Localclouddeployed(),
		   source,
		   new String[] {
			   "body", "device-deployed"
		   });
		addAnnotation
		  (getDeviceDeployed_Networkdeployed(),
		   source,
		   new String[] {
			   "body", "device-deployed"
		   });
		addAnnotation
		  (getHttpOperation_Base_Operation(),
		   source,
		   new String[] {
			   "body", "extension_HttpOperation"
		   });
		addAnnotation
		  (getSystemRequirements_Base_Package(),
		   source,
		   new String[] {
			   "body", "extension_System-Requirements"
		   });
		addAnnotation
		  (getNetworkRequirements_Base_Package(),
		   source,
		   new String[] {
			   "body", "extension_Network-Requirements"
		   });
		addAnnotation
		  (getLocaCloudRequirements_Base_Package(),
		   source,
		   new String[] {
			   "body", "extension_LocaCloud-Requirements"
		   });
		addAnnotation
		  (getSystemofLocalCloudsRequirements_Base_Package(),
		   source,
		   new String[] {
			   "body", "extension_System-of-LocalClouds-Requirements"
		   });
		addAnnotation
		  (getDeviceRequirements_Base_Package(),
		   source,
		   new String[] {
			   "body", "extension_Device-Requirements"
		   });
		addAnnotation
		  (getSystemofLocalCloudsMaintenance_Base_Class(),
		   source,
		   new String[] {
			   "body", "extension_System-of-LocalClouds-Maintenance"
		   });
		addAnnotation
		  (getSystemofLocalCloudsMaintenance_Systemoflocalcloudsdeployed(),
		   source,
		   new String[] {
			   "body", "system-of-localclouds-maintenance"
		   });
		addAnnotation
		  (getSystemofLocalCloudsEvolution_Base_Class(),
		   source,
		   new String[] {
			   "body", "extension_System-of-LocalClouds-Evolution"
		   });
		addAnnotation
		  (getSystemofLocalCloudsEvolution_Systemoflocalcloudsdeployed(),
		   source,
		   new String[] {
			   "body", "system-of-localclouds-evolution"
		   });
		addAnnotation
		  (getLocalCloudMaintenance_Base_Class(),
		   source,
		   new String[] {
			   "body", "extension_LocalCloud-Maintenance"
		   });
		addAnnotation
		  (getLocalCloudMaintenance_Systemoflocalcloudsmaintenance(),
		   source,
		   new String[] {
			   "body", "localcloud-maintenance"
		   });
		addAnnotation
		  (getLocalCloudMaintenance_Localclouddeployed(),
		   source,
		   new String[] {
			   "body", "localcloud-maintenance"
		   });
		addAnnotation
		  (getLocalCloudEvolution_Base_Class(),
		   source,
		   new String[] {
			   "body", "extension_LocalCloud-Evolution"
		   });
		addAnnotation
		  (getLocalCloudEvolution_Systemoflocalcloudsevolution(),
		   source,
		   new String[] {
			   "body", "localcloud-evolution"
		   });
		addAnnotation
		  (getLocalCloudEvolution_Localclouddeployed(),
		   source,
		   new String[] {
			   "body", "localcloud-evolution"
		   });
		addAnnotation
		  (getSysMaintenance_Base_Class(),
		   source,
		   new String[] {
			   "body", "extension_Sys-Maintenance"
		   });
		addAnnotation
		  (getSysMaintenance_Sysimplementation(),
		   source,
		   new String[] {
			   "body", "sys-maintenance"
		   });
		addAnnotation
		  (getSysMaintenance_Localcloudmaintenance(),
		   source,
		   new String[] {
			   "body", "sys-maintenance"
		   });
		addAnnotation
		  (getSysMaintenance_Devicemaintenance(),
		   source,
		   new String[] {
			   "body", "sys-maintenance"
		   });
		addAnnotation
		  (getSysImplementation_Localcloudimplementation(),
		   source,
		   new String[] {
			   "body", "sys-implementation"
		   });
		addAnnotation
		  (getSysImplementation_Deviceimplementation(),
		   source,
		   new String[] {
			   "body", "sys-implementation"
		   });
		addAnnotation
		  (getLocalCLoudImplementation_Systemoflocalcloudsimplementation(),
		   source,
		   new String[] {
			   "body", "localcloud-implementation"
		   });
		addAnnotation
		  (getDeviceImplementation_Networkimplementation(),
		   source,
		   new String[] {
			   "body", "device-implementation"
		   });
		addAnnotation
		  (getDeviceMaintenance_Base_Class(),
		   source,
		   new String[] {
			   "body", "extension_Device-Maintenance"
		   });
		addAnnotation
		  (getDeviceMaintenance_Devicedeployed(),
		   source,
		   new String[] {
			   "body", "device-maintenance"
		   });
		addAnnotation
		  (getDeviceMaintenance_Networkmaintenance(),
		   source,
		   new String[] {
			   "body", "device-maintenance"
		   });
		addAnnotation
		  (getNetworkMaintenance_Base_Class(),
		   source,
		   new String[] {
			   "body", "extension_Network-Maintenance"
		   });
		addAnnotation
		  (getNetworkMaintenance_Networkdeployed(),
		   source,
		   new String[] {
			   "body", "network-maintenance"
		   });
		addAnnotation
		  (getSysEvolution_Base_Class(),
		   source,
		   new String[] {
			   "body", "extension_Sys-Evolution"
		   });
		addAnnotation
		  (getSysEvolution_Localcloudevolution(),
		   source,
		   new String[] {
			   "body", "sys-evolution"
		   });
		addAnnotation
		  (getSysEvolution_Sysimplementation(),
		   source,
		   new String[] {
			   "body", "sys-evolution"
		   });
		addAnnotation
		  (getSysEvolution_Deviceevolution(),
		   source,
		   new String[] {
			   "body", "sys-evolution"
		   });
		addAnnotation
		  (getDeviceEvolution_Base_Class(),
		   source,
		   new String[] {
			   "body", "extension_Device-Evolution"
		   });
		addAnnotation
		  (getDeviceEvolution_Networkevolution(),
		   source,
		   new String[] {
			   "body", "device-evolution"
		   });
		addAnnotation
		  (getDeviceEvolution_Devicedeployed(),
		   source,
		   new String[] {
			   "body", "device-evolution"
		   });
		addAnnotation
		  (getNetworkEvolution_Base_Class(),
		   source,
		   new String[] {
			   "body", "extension_Network-Evolution"
		   });
		addAnnotation
		  (getNetworkEvolution_Networkdeployed(),
		   source,
		   new String[] {
			   "body", "network-evolution"
		   });
		addAnnotation
		  (getDeployment_Base_Package(),
		   source,
		   new String[] {
			   "body", "extension_Deployment"
		   });
		addAnnotation
		  (getRequirements_Base_Package(),
		   source,
		   new String[] {
			   "body", "extension_Requirements"
		   });
		addAnnotation
		  (getFunctionalDesign_Base_Package(),
		   source,
		   new String[] {
			   "body", "extension_FunctionalDesign"
		   });
		addAnnotation
		  (getProcurementEngineering_Base_Package(),
		   source,
		   new String[] {
			   "body", "extension_Procurement&Engineering"
		   });
		addAnnotation
		  (getMaintenance_Base_Package(),
		   source,
		   new String[] {
			   "body", "extension_Maintenance"
		   });
		addAnnotation
		  (getEvolution_Base_Package(),
		   source,
		   new String[] {
			   "body", "extension_Evolution"
		   });
		addAnnotation
		  (getChoreographyDefinition_Base_Collaboration(),
		   source,
		   new String[] {
			   "body", "extension_ChoreographyDefinition"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (sysDDEClass,
		   source,
		   new String[] {
			   "constraints", "Deployed at Device"
		   });
		addAnnotation
		  (deployedServiceEClass,
		   source,
		   new String[] {
			   "constraints", "unnamed1"
		   });
		addAnnotation
		  (networkEClass,
		   source,
		   new String[] {
			   "constraints", "MAC"
		   });
	}

} //ArrowheadSysMLProfilePackageImpl
