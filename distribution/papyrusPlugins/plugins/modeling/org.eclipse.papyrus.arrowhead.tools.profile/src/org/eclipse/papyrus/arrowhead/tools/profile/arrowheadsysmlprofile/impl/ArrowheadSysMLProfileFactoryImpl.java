/**
 */
package org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.*;

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
			case ArrowheadSysMLProfilePackage.IDENTIFIABLE: return createIdentifiable();
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCRIPTION: return createDeviceDesignDescription();
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN: return createDeviceDesign();
			case ArrowheadSysMLProfilePackage.LOCAL_CLOUD_DESIGN: return createLocalCloudDesign();
			case ArrowheadSysMLProfilePackage.LOCAL_CLOUD_DESIGN_DESCRIPTION: return createLocalCLoudDesignDescription();
			case ArrowheadSysMLProfilePackage.NETWORK_DESIGN: return createNetworkDesign();
			case ArrowheadSysMLProfilePackage.NETWORK_DESIGN_DESCRIPTIION: return createNetworkDesignDescriptiion();
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_DESIGN: return createSystemofLocalCloudsDesign();
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_DESIGN_DESCRIPTION: return createSystemofLocalCloudsDesignDescription();
			case ArrowheadSysMLProfilePackage.CONSUMER: return createConsumer();
			case ArrowheadSysMLProfilePackage.PROVIDER: return createProvider();
			case ArrowheadSysMLProfilePackage.IDD: return createIDD();
			case ArrowheadSysMLProfilePackage.SD: return createSD();
			case ArrowheadSysMLProfilePackage.MANDATORY_CORE_SYSTEM_SYS_D: return createMandatoryCoreSystemSysD();
			case ArrowheadSysMLProfilePackage.SUPPORT_CORE_SYSTEM_SYS_D: return createSupportCoreSystemSysD();
			case ArrowheadSysMLProfilePackage.APPLICATION_SYS_D: return createApplicationSysD();
			case ArrowheadSysMLProfilePackage.MANDATORY_CORE_SYSTEM_SYS_DD: return createMandatoryCoreSystemSysDD();
			case ArrowheadSysMLProfilePackage.SUPPORT_CORE_SYSTEM_SYS_DD: return createSupportCoreSystemSysDD();
			case ArrowheadSysMLProfilePackage.APPLICATION_SYS_DD: return createApplicationSysDD();
			case ArrowheadSysMLProfilePackage.DATA_SEMANTICS: return createDataSemantics();
			case ArrowheadSysMLProfilePackage.OPERATION: return createOperation();
			case ArrowheadSysMLProfilePackage.NETWORK_DESIGN_DESCRIPTION: return createNetworkDesignDescription();
			case ArrowheadSysMLProfilePackage.DEPLOY: return createDeploy();
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
			case ArrowheadSysMLProfilePackage.CERTIFICATE_LEVEL:
				return createCertificateLevelFromString(eDataType, initialValue);
			case ArrowheadSysMLProfilePackage.PHYSICAL_LAYER_KIND:
				return createPhysicalLayerKindFromString(eDataType, initialValue);
			case ArrowheadSysMLProfilePackage.SECURITY_KIND:
				return createSecurityKindFromString(eDataType, initialValue);
			case ArrowheadSysMLProfilePackage.CERTIFICATE_KIND:
				return createCertificateKindFromString(eDataType, initialValue);
			case ArrowheadSysMLProfilePackage.MANDATORY_CORE_SYSTEM_KIND:
				return createMandatoryCoreSystemKindFromString(eDataType, initialValue);
			case ArrowheadSysMLProfilePackage.APPLICATION_SYSTEM_KIND:
				return createApplicationSystemKindFromString(eDataType, initialValue);
			case ArrowheadSysMLProfilePackage.SUPPORT_CORE_SYSTEM_KIND:
				return createSupportCoreSystemKindFromString(eDataType, initialValue);
			case ArrowheadSysMLProfilePackage.ONTOLOGY_KIND:
				return createOntologyKindFromString(eDataType, initialValue);
			case ArrowheadSysMLProfilePackage.METHOD_KIND:
				return createMethodKindFromString(eDataType, initialValue);
			case ArrowheadSysMLProfilePackage.PROTOCOL_KIND:
				return createProtocolKindFromString(eDataType, initialValue);
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
			case ArrowheadSysMLProfilePackage.CERTIFICATE_LEVEL:
				return convertCertificateLevelToString(eDataType, instanceValue);
			case ArrowheadSysMLProfilePackage.PHYSICAL_LAYER_KIND:
				return convertPhysicalLayerKindToString(eDataType, instanceValue);
			case ArrowheadSysMLProfilePackage.SECURITY_KIND:
				return convertSecurityKindToString(eDataType, instanceValue);
			case ArrowheadSysMLProfilePackage.CERTIFICATE_KIND:
				return convertCertificateKindToString(eDataType, instanceValue);
			case ArrowheadSysMLProfilePackage.MANDATORY_CORE_SYSTEM_KIND:
				return convertMandatoryCoreSystemKindToString(eDataType, instanceValue);
			case ArrowheadSysMLProfilePackage.APPLICATION_SYSTEM_KIND:
				return convertApplicationSystemKindToString(eDataType, instanceValue);
			case ArrowheadSysMLProfilePackage.SUPPORT_CORE_SYSTEM_KIND:
				return convertSupportCoreSystemKindToString(eDataType, instanceValue);
			case ArrowheadSysMLProfilePackage.ONTOLOGY_KIND:
				return convertOntologyKindToString(eDataType, instanceValue);
			case ArrowheadSysMLProfilePackage.METHOD_KIND:
				return convertMethodKindToString(eDataType, instanceValue);
			case ArrowheadSysMLProfilePackage.PROTOCOL_KIND:
				return convertProtocolKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifiable createIdentifiable() {
		IdentifiableImpl identifiable = new IdentifiableImpl();
		return identifiable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceDesignDescription createDeviceDesignDescription() {
		DeviceDesignDescriptionImpl deviceDesignDescription = new DeviceDesignDescriptionImpl();
		return deviceDesignDescription;
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
	public NetworkDesign createNetworkDesign() {
		NetworkDesignImpl networkDesign = new NetworkDesignImpl();
		return networkDesign;
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
	public Consumer createConsumer() {
		ConsumerImpl consumer = new ConsumerImpl();
		return consumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provider createProvider() {
		ProviderImpl provider = new ProviderImpl();
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDD createIDD() {
		IDDImpl idd = new IDDImpl();
		return idd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SD createSD() {
		SDImpl sd = new SDImpl();
		return sd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandatoryCoreSystemSysD createMandatoryCoreSystemSysD() {
		MandatoryCoreSystemSysDImpl mandatoryCoreSystemSysD = new MandatoryCoreSystemSysDImpl();
		return mandatoryCoreSystemSysD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportCoreSystemSysD createSupportCoreSystemSysD() {
		SupportCoreSystemSysDImpl supportCoreSystemSysD = new SupportCoreSystemSysDImpl();
		return supportCoreSystemSysD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationSysD createApplicationSysD() {
		ApplicationSysDImpl applicationSysD = new ApplicationSysDImpl();
		return applicationSysD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandatoryCoreSystemSysDD createMandatoryCoreSystemSysDD() {
		MandatoryCoreSystemSysDDImpl mandatoryCoreSystemSysDD = new MandatoryCoreSystemSysDDImpl();
		return mandatoryCoreSystemSysDD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportCoreSystemSysDD createSupportCoreSystemSysDD() {
		SupportCoreSystemSysDDImpl supportCoreSystemSysDD = new SupportCoreSystemSysDDImpl();
		return supportCoreSystemSysDD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationSysDD createApplicationSysDD() {
		ApplicationSysDDImpl applicationSysDD = new ApplicationSysDDImpl();
		return applicationSysDD;
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
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkDesignDescription createNetworkDesignDescription() {
		NetworkDesignDescriptionImpl networkDesignDescription = new NetworkDesignDescriptionImpl();
		return networkDesignDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deploy createDeploy() {
		DeployImpl deploy = new DeployImpl();
		return deploy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CertificateLevel createCertificateLevelFromString(EDataType eDataType, String initialValue) {
		CertificateLevel result = CertificateLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCertificateLevelToString(EDataType eDataType, Object instanceValue) {
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
	public MandatoryCoreSystemKind createMandatoryCoreSystemKindFromString(EDataType eDataType, String initialValue) {
		MandatoryCoreSystemKind result = MandatoryCoreSystemKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMandatoryCoreSystemKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationSystemKind createApplicationSystemKindFromString(EDataType eDataType, String initialValue) {
		ApplicationSystemKind result = ApplicationSystemKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApplicationSystemKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportCoreSystemKind createSupportCoreSystemKindFromString(EDataType eDataType, String initialValue) {
		SupportCoreSystemKind result = SupportCoreSystemKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupportCoreSystemKindToString(EDataType eDataType, Object instanceValue) {
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
	public MethodKind createMethodKindFromString(EDataType eDataType, String initialValue) {
		MethodKind result = MethodKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMethodKindToString(EDataType eDataType, Object instanceValue) {
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
