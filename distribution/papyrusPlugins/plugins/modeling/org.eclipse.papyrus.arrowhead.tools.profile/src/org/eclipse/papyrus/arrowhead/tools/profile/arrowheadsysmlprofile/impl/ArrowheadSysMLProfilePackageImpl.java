/**
 */
package org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ApplicationSysD;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ApplicationSysDD;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ApplicationSystemKind;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ArrowheadSysMLProfileFactory;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.CertificateKind;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.CertificateLevel;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.Consumer;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DataSemantics;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.Deploy;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DeviceDesign;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DeviceDesignDescription;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.Identifiable;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.LocalCLoudDesignDescription;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.LocalCloudDesign;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.MandatoryCoreSystemKind;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.MandatoryCoreSystemSysD;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.MandatoryCoreSystemSysDD;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.MethodKind;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.NetworkDesign;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.NetworkDesignDescriptiion;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.NetworkDesignDescription;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.OntologyKind;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.Operation;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.PhysicalLayerKind;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ProtocolKind;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.Provider;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SecurityKind;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SupportCoreSystemKind;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SupportCoreSystemSysD;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SupportCoreSystemSysDD;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SysD;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SysDD;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SystemofLocalCloudsDesign;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SystemofLocalCloudsDesignDescription;

import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.util.ArrowheadSysMLProfileValidator;

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
	private EClass sysDDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceDesignDescriptionEClass = null;

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
	private EClass localCloudDesignEClass = null;

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
	private EClass localCLoudDesignDescriptionEClass = null;

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
	private EClass networkDesignDescriptiionEClass = null;

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
	private EClass consumerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iddEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mandatoryCoreSystemSysDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportCoreSystemSysDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationSysDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mandatoryCoreSystemSysDDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportCoreSystemSysDDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationSysDDEClass = null;

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
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkDesignDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deployEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum certificateLevelEEnum = null;

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
	private EEnum securityKindEEnum = null;

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
	private EEnum mandatoryCoreSystemKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum applicationSystemKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum supportCoreSystemKindEEnum = null;

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
	private EEnum methodKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum protocolKindEEnum = null;

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
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#eNS_URI
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
	public EOperation getSysDD__DeployedatDevice__DiagnosticChain_Map() {
		return sysDDEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSysDD__Constraint27__DiagnosticChain_Map() {
		return sysDDEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiable() {
		return identifiableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceDesignDescription() {
		return deviceDesignDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceDesignDescription_Networkinterface() {
		return (EAttribute)deviceDesignDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceDesignDescription_OperatingSystem() {
		return (EAttribute)deviceDesignDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceDesignDescription_Memory() {
		return (EAttribute)deviceDesignDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceDesignDescription_Processor() {
		return (EAttribute)deviceDesignDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceDesignDescription_CertificateLevel() {
		return (EAttribute)deviceDesignDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceDesignDescription_DeviceDesign() {
		return (EAttribute)deviceDesignDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDeviceDesignDescription__Constraint53__DiagnosticChain_Map() {
		return deviceDesignDescriptionEClass.getEOperations().get(0);
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
	public EAttribute getDeviceDesign_NetworkDesign() {
		return (EAttribute)deviceDesignEClass.getEStructuralFeatures().get(0);
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
	public EClass getSysD() {
		return sysDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSysD_SystemKind() {
		return (EAttribute)sysDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSysD__Constraint180__DiagnosticChain_Map() {
		return sysDEClass.getEOperations().get(0);
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
	public EClass getNetworkDesign() {
		return networkDesignEClass;
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
	public EClass getSystemofLocalCloudsDesign() {
		return systemofLocalCloudsDesignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemofLocalCloudsDesign__SoLCDpropertyType__DiagnosticChain_Map() {
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
	public EClass getConsumer() {
		return consumerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvider() {
		return providerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIDD() {
		return iddEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIDD_Security() {
		return (EAttribute)iddEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIDD_Certificate() {
		return (EAttribute)iddEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSD() {
		return sdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMandatoryCoreSystemSysD() {
		return mandatoryCoreSystemSysDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupportCoreSystemSysD() {
		return supportCoreSystemSysDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationSysD() {
		return applicationSysDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMandatoryCoreSystemSysDD() {
		return mandatoryCoreSystemSysDDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMandatoryCoreSystemSysDD_SystemKind() {
		return (EAttribute)mandatoryCoreSystemSysDDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupportCoreSystemSysDD() {
		return supportCoreSystemSysDDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupportCoreSystemSysDD_SystemKind() {
		return (EAttribute)supportCoreSystemSysDDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationSysDD() {
		return applicationSysDDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationSysDD_SystemKind() {
		return (EAttribute)applicationSysDDEClass.getEStructuralFeatures().get(0);
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
	public EReference getDataSemantics_Base_NamedElement() {
		return (EReference)dataSemanticsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Method() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Base_Operation() {
		return (EReference)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkDesignDescription() {
		return networkDesignDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkDesignDescription_Protocol() {
		return (EAttribute)networkDesignDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkDesignDescription_PhysicalNetworkInterface() {
		return (EAttribute)networkDesignDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkDesignDescription_Base_Port() {
		return (EReference)networkDesignDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploy() {
		return deployEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploy_Base_Dependency() {
		return (EReference)deployEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCertificateLevel() {
		return certificateLevelEEnum;
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
	public EEnum getSecurityKind() {
		return securityKindEEnum;
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
	public EEnum getMandatoryCoreSystemKind() {
		return mandatoryCoreSystemKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getApplicationSystemKind() {
		return applicationSystemKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSupportCoreSystemKind() {
		return supportCoreSystemKindEEnum;
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
	public EEnum getMethodKind() {
		return methodKindEEnum;
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
		sysDDEClass = createEClass(SYS_DD);
		createEAttribute(sysDDEClass, SYS_DD__CERTIFICATE_LEVEL);
		createEOperation(sysDDEClass, SYS_DD___DEPLOYEDAT_DEVICE__DIAGNOSTICCHAIN_MAP);
		createEOperation(sysDDEClass, SYS_DD___CONSTRAINT27__DIAGNOSTICCHAIN_MAP);

		identifiableEClass = createEClass(IDENTIFIABLE);

		deviceDesignDescriptionEClass = createEClass(DEVICE_DESIGN_DESCRIPTION);
		createEAttribute(deviceDesignDescriptionEClass, DEVICE_DESIGN_DESCRIPTION__NETWORKINTERFACE);
		createEAttribute(deviceDesignDescriptionEClass, DEVICE_DESIGN_DESCRIPTION__OPERATING_SYSTEM);
		createEAttribute(deviceDesignDescriptionEClass, DEVICE_DESIGN_DESCRIPTION__MEMORY);
		createEAttribute(deviceDesignDescriptionEClass, DEVICE_DESIGN_DESCRIPTION__PROCESSOR);
		createEAttribute(deviceDesignDescriptionEClass, DEVICE_DESIGN_DESCRIPTION__CERTIFICATE_LEVEL);
		createEAttribute(deviceDesignDescriptionEClass, DEVICE_DESIGN_DESCRIPTION__DEVICE_DESIGN);
		createEOperation(deviceDesignDescriptionEClass, DEVICE_DESIGN_DESCRIPTION___CONSTRAINT53__DIAGNOSTICCHAIN_MAP);

		deviceDesignEClass = createEClass(DEVICE_DESIGN);
		createEAttribute(deviceDesignEClass, DEVICE_DESIGN__NETWORK_DESIGN);

		localCloudDesignEClass = createEClass(LOCAL_CLOUD_DESIGN);
		createEReference(localCloudDesignEClass, LOCAL_CLOUD_DESIGN__SYSD);

		sysDEClass = createEClass(SYS_D);
		createEAttribute(sysDEClass, SYS_D__SYSTEM_KIND);
		createEOperation(sysDEClass, SYS_D___CONSTRAINT180__DIAGNOSTICCHAIN_MAP);

		localCLoudDesignDescriptionEClass = createEClass(LOCAL_CLOUD_DESIGN_DESCRIPTION);

		networkDesignEClass = createEClass(NETWORK_DESIGN);

		networkDesignDescriptiionEClass = createEClass(NETWORK_DESIGN_DESCRIPTIION);

		systemofLocalCloudsDesignEClass = createEClass(SYSTEMOF_LOCAL_CLOUDS_DESIGN);
		createEOperation(systemofLocalCloudsDesignEClass, SYSTEMOF_LOCAL_CLOUDS_DESIGN___SO_LC_DPROPERTY_TYPE__DIAGNOSTICCHAIN_MAP);

		systemofLocalCloudsDesignDescriptionEClass = createEClass(SYSTEMOF_LOCAL_CLOUDS_DESIGN_DESCRIPTION);

		consumerEClass = createEClass(CONSUMER);

		providerEClass = createEClass(PROVIDER);

		iddEClass = createEClass(IDD);
		createEAttribute(iddEClass, IDD__SECURITY);
		createEAttribute(iddEClass, IDD__CERTIFICATE);

		sdEClass = createEClass(SD);

		mandatoryCoreSystemSysDEClass = createEClass(MANDATORY_CORE_SYSTEM_SYS_D);

		supportCoreSystemSysDEClass = createEClass(SUPPORT_CORE_SYSTEM_SYS_D);

		applicationSysDEClass = createEClass(APPLICATION_SYS_D);

		mandatoryCoreSystemSysDDEClass = createEClass(MANDATORY_CORE_SYSTEM_SYS_DD);
		createEAttribute(mandatoryCoreSystemSysDDEClass, MANDATORY_CORE_SYSTEM_SYS_DD__SYSTEM_KIND);

		supportCoreSystemSysDDEClass = createEClass(SUPPORT_CORE_SYSTEM_SYS_DD);
		createEAttribute(supportCoreSystemSysDDEClass, SUPPORT_CORE_SYSTEM_SYS_DD__SYSTEM_KIND);

		applicationSysDDEClass = createEClass(APPLICATION_SYS_DD);
		createEAttribute(applicationSysDDEClass, APPLICATION_SYS_DD__SYSTEM_KIND);

		dataSemanticsEClass = createEClass(DATA_SEMANTICS);
		createEAttribute(dataSemanticsEClass, DATA_SEMANTICS__SEMANTIC_MODEL);
		createEAttribute(dataSemanticsEClass, DATA_SEMANTICS__ONTOLOGY);
		createEAttribute(dataSemanticsEClass, DATA_SEMANTICS__SCHEMA);
		createEReference(dataSemanticsEClass, DATA_SEMANTICS__BASE_NAMED_ELEMENT);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__METHOD);
		createEReference(operationEClass, OPERATION__BASE_OPERATION);

		networkDesignDescriptionEClass = createEClass(NETWORK_DESIGN_DESCRIPTION);
		createEAttribute(networkDesignDescriptionEClass, NETWORK_DESIGN_DESCRIPTION__PROTOCOL);
		createEAttribute(networkDesignDescriptionEClass, NETWORK_DESIGN_DESCRIPTION__PHYSICAL_NETWORK_INTERFACE);
		createEReference(networkDesignDescriptionEClass, NETWORK_DESIGN_DESCRIPTION__BASE_PORT);

		deployEClass = createEClass(DEPLOY);
		createEReference(deployEClass, DEPLOY__BASE_DEPENDENCY);

		// Create enums
		certificateLevelEEnum = createEEnum(CERTIFICATE_LEVEL);
		physicalLayerKindEEnum = createEEnum(PHYSICAL_LAYER_KIND);
		securityKindEEnum = createEEnum(SECURITY_KIND);
		certificateKindEEnum = createEEnum(CERTIFICATE_KIND);
		mandatoryCoreSystemKindEEnum = createEEnum(MANDATORY_CORE_SYSTEM_KIND);
		applicationSystemKindEEnum = createEEnum(APPLICATION_SYSTEM_KIND);
		supportCoreSystemKindEEnum = createEEnum(SUPPORT_CORE_SYSTEM_KIND);
		ontologyKindEEnum = createEEnum(ONTOLOGY_KIND);
		methodKindEEnum = createEEnum(METHOD_KIND);
		protocolKindEEnum = createEEnum(PROTOCOL_KIND);
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
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		PortsAndFlowsPackage thePortsAndFlowsPackage = (PortsAndFlowsPackage)EPackage.Registry.INSTANCE.getEPackage(PortsAndFlowsPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sysDDEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		sysDDEClass.getESuperTypes().add(this.getIdentifiable());
		deviceDesignDescriptionEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		deviceDesignDescriptionEClass.getESuperTypes().add(this.getIdentifiable());
		deviceDesignEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		deviceDesignEClass.getESuperTypes().add(this.getIdentifiable());
		localCloudDesignEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		localCloudDesignEClass.getESuperTypes().add(this.getIdentifiable());
		sysDEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		sysDEClass.getESuperTypes().add(this.getIdentifiable());
		localCLoudDesignDescriptionEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		localCLoudDesignDescriptionEClass.getESuperTypes().add(this.getIdentifiable());
		networkDesignEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		networkDesignEClass.getESuperTypes().add(this.getIdentifiable());
		networkDesignDescriptiionEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		networkDesignDescriptiionEClass.getESuperTypes().add(this.getIdentifiable());
		systemofLocalCloudsDesignEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		systemofLocalCloudsDesignEClass.getESuperTypes().add(this.getIdentifiable());
		systemofLocalCloudsDesignDescriptionEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		systemofLocalCloudsDesignDescriptionEClass.getESuperTypes().add(this.getIdentifiable());
		consumerEClass.getESuperTypes().add(thePortsAndFlowsPackage.getFullPort());
		providerEClass.getESuperTypes().add(thePortsAndFlowsPackage.getFullPort());
		iddEClass.getESuperTypes().add(this.getSD());
		sdEClass.getESuperTypes().add(thePortsAndFlowsPackage.getInterfaceBlock());
		mandatoryCoreSystemSysDEClass.getESuperTypes().add(this.getSysD());
		supportCoreSystemSysDEClass.getESuperTypes().add(this.getSysD());
		applicationSysDEClass.getESuperTypes().add(this.getSysD());
		mandatoryCoreSystemSysDDEClass.getESuperTypes().add(this.getSysDD());
		supportCoreSystemSysDDEClass.getESuperTypes().add(this.getSysDD());
		applicationSysDDEClass.getESuperTypes().add(this.getSysDD());
		networkDesignDescriptionEClass.getESuperTypes().add(thePortsAndFlowsPackage.getInterfaceBlock());

		// Initialize classes, features, and operations; add parameters
		initEClass(sysDDEClass, SysDD.class, "SysDD", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSysDD_CertificateLevel(), this.getCertificateLevel(), "CertificateLevel", null, 1, 1, SysDD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getSysDD__DeployedatDevice__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "DeployedatDevice", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSysDD__Constraint27__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Constraint27", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(identifiableEClass, Identifiable.class, "Identifiable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deviceDesignDescriptionEClass, DeviceDesignDescription.class, "DeviceDesignDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeviceDesignDescription_Networkinterface(), theTypesPackage.getString(), "networkinterface", null, 0, -1, DeviceDesignDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDeviceDesignDescription_OperatingSystem(), theTypesPackage.getString(), "operatingSystem", null, 1, 1, DeviceDesignDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDeviceDesignDescription_Memory(), theTypesPackage.getString(), "memory", null, 1, 1, DeviceDesignDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDeviceDesignDescription_Processor(), theTypesPackage.getString(), "processor", null, 1, 1, DeviceDesignDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDeviceDesignDescription_CertificateLevel(), this.getCertificateLevel(), "certificateLevel", null, 1, 1, DeviceDesignDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDeviceDesignDescription_DeviceDesign(), theTypesPackage.getString(), "deviceDesign", null, 0, 1, DeviceDesignDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getDeviceDesignDescription__Constraint53__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Constraint53", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(deviceDesignEClass, DeviceDesign.class, "DeviceDesign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeviceDesign_NetworkDesign(), this.getPhysicalLayerKind(), "networkDesign", null, 0, -1, DeviceDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(localCloudDesignEClass, LocalCloudDesign.class, "LocalCloudDesign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalCloudDesign_Sysd(), this.getSysD(), null, "sysd", null, 0, -1, LocalCloudDesign.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(sysDEClass, SysD.class, "SysD", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSysD_SystemKind(), theTypesPackage.getString(), "systemKind", null, 1, 1, SysD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getSysD__Constraint180__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Constraint180", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(localCLoudDesignDescriptionEClass, LocalCLoudDesignDescription.class, "LocalCLoudDesignDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(networkDesignEClass, NetworkDesign.class, "NetworkDesign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(networkDesignDescriptiionEClass, NetworkDesignDescriptiion.class, "NetworkDesignDescriptiion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemofLocalCloudsDesignEClass, SystemofLocalCloudsDesign.class, "SystemofLocalCloudsDesign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getSystemofLocalCloudsDesign__SoLCDpropertyType__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "SoLCDpropertyType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(systemofLocalCloudsDesignDescriptionEClass, SystemofLocalCloudsDesignDescription.class, "SystemofLocalCloudsDesignDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(consumerEClass, Consumer.class, "Consumer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(providerEClass, Provider.class, "Provider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iddEClass, org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.IDD.class, "IDD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIDD_Security(), this.getSecurityKind(), "security", null, 0, 1, org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.IDD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIDD_Certificate(), this.getCertificateKind(), "certificate", null, 1, 1, org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.IDD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sdEClass, org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SD.class, "SD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mandatoryCoreSystemSysDEClass, MandatoryCoreSystemSysD.class, "MandatoryCoreSystemSysD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(supportCoreSystemSysDEClass, SupportCoreSystemSysD.class, "SupportCoreSystemSysD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(applicationSysDEClass, ApplicationSysD.class, "ApplicationSysD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mandatoryCoreSystemSysDDEClass, MandatoryCoreSystemSysDD.class, "MandatoryCoreSystemSysDD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMandatoryCoreSystemSysDD_SystemKind(), this.getMandatoryCoreSystemKind(), "systemKind", null, 1, 1, MandatoryCoreSystemSysDD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(supportCoreSystemSysDDEClass, SupportCoreSystemSysDD.class, "SupportCoreSystemSysDD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSupportCoreSystemSysDD_SystemKind(), this.getSupportCoreSystemKind(), "systemKind", null, 1, 1, SupportCoreSystemSysDD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(applicationSysDDEClass, ApplicationSysDD.class, "ApplicationSysDD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplicationSysDD_SystemKind(), this.getApplicationSystemKind(), "systemKind", null, 1, 1, ApplicationSysDD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataSemanticsEClass, DataSemantics.class, "DataSemantics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSemantics_SemanticModel(), theTypesPackage.getString(), "semanticModel", null, 1, 1, DataSemantics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataSemantics_Ontology(), this.getOntologyKind(), "ontology", null, 1, 1, DataSemantics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataSemantics_Schema(), theTypesPackage.getString(), "schema", null, 1, 1, DataSemantics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataSemantics_Base_NamedElement(), theUMLPackage.getNamedElement(), null, "base_NamedElement", null, 0, 1, DataSemantics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_Method(), this.getMethodKind(), "method", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOperation_Base_Operation(), theUMLPackage.getOperation(), null, "base_Operation", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(networkDesignDescriptionEClass, NetworkDesignDescription.class, "NetworkDesignDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetworkDesignDescription_Protocol(), this.getProtocolKind(), "protocol", null, 1, 1, NetworkDesignDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNetworkDesignDescription_PhysicalNetworkInterface(), this.getPhysicalLayerKind(), "physicalNetworkInterface", null, 1, 1, NetworkDesignDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNetworkDesignDescription_Base_Port(), theUMLPackage.getPort(), null, "base_Port", null, 0, 1, NetworkDesignDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(deployEClass, Deploy.class, "Deploy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeploy_Base_Dependency(), theUMLPackage.getDependency(), null, "base_Dependency", null, 0, 1, Deploy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(certificateLevelEEnum, CertificateLevel.class, "CertificateLevel");

		initEEnum(physicalLayerKindEEnum, PhysicalLayerKind.class, "PhysicalLayerKind");
		addEEnumLiteral(physicalLayerKindEEnum, PhysicalLayerKind.ETHERNET);
		addEEnumLiteral(physicalLayerKindEEnum, PhysicalLayerKind.IEEE802_11);

		initEEnum(securityKindEEnum, SecurityKind.class, "SecurityKind");
		addEEnumLiteral(securityKindEEnum, SecurityKind.NOT_SECURE);
		addEEnumLiteral(securityKindEEnum, SecurityKind.CERTIFICATE);
		addEEnumLiteral(securityKindEEnum, SecurityKind.TOKEN);

		initEEnum(certificateKindEEnum, CertificateKind.class, "CertificateKind");
		addEEnumLiteral(certificateKindEEnum, CertificateKind.DEVICE);
		addEEnumLiteral(certificateKindEEnum, CertificateKind.APPLICATION_SYSTEM);
		addEEnumLiteral(certificateKindEEnum, CertificateKind.CORE_SYSTEM);
		addEEnumLiteral(certificateKindEEnum, CertificateKind.MANAGEMENT);
		addEEnumLiteral(certificateKindEEnum, CertificateKind.INTERCLOUD);

		initEEnum(mandatoryCoreSystemKindEEnum, MandatoryCoreSystemKind.class, "MandatoryCoreSystemKind");
		addEEnumLiteral(mandatoryCoreSystemKindEEnum, MandatoryCoreSystemKind.ORCH);
		addEEnumLiteral(mandatoryCoreSystemKindEEnum, MandatoryCoreSystemKind.AUTH);
		addEEnumLiteral(mandatoryCoreSystemKindEEnum, MandatoryCoreSystemKind.SR);

		initEEnum(applicationSystemKindEEnum, ApplicationSystemKind.class, "ApplicationSystemKind");

		initEEnum(supportCoreSystemKindEEnum, SupportCoreSystemKind.class, "SupportCoreSystemKind");
		addEEnumLiteral(supportCoreSystemKindEEnum, SupportCoreSystemKind.QO_S);
		addEEnumLiteral(supportCoreSystemKindEEnum, SupportCoreSystemKind.GATEWAY);

		initEEnum(ontologyKindEEnum, OntologyKind.class, "OntologyKind");
		addEEnumLiteral(ontologyKindEEnum, OntologyKind.SEN_ML);

		initEEnum(methodKindEEnum, MethodKind.class, "MethodKind");
		addEEnumLiteral(methodKindEEnum, MethodKind.POST);
		addEEnumLiteral(methodKindEEnum, MethodKind.GET);
		addEEnumLiteral(methodKindEEnum, MethodKind.DELETE);
		addEEnumLiteral(methodKindEEnum, MethodKind.UPDATE);
		addEEnumLiteral(methodKindEEnum, MethodKind.PUBLISH);
		addEEnumLiteral(methodKindEEnum, MethodKind.SUBSCRIBE);

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

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
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
		  (getSysDD__DeployedatDevice__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "originalName", "Deployed at Device"
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
		  (applicationSystemKindEEnum,
		   source,
		   new String[] {
			   "constraints", "Constraint27"
		   });
	}

} //ArrowheadSysMLProfilePackageImpl
