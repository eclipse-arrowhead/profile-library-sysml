/**
 */
package org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage
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
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Deployedat Device' of 'Sys DD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SYS_DD__DEPLOYEDAT_DEVICE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint27' of 'Sys DD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SYS_DD__CONSTRAINT27 = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint53' of 'Device Design Description'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DEVICE_DESIGN_DESCRIPTION__CONSTRAINT53 = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint180' of 'Sys D'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SYS_D__CONSTRAINT180 = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'So LC Dproperty Type' of 'Systemof Local Clouds Design'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SYSTEMOF_LOCAL_CLOUDS_DESIGN__SO_LC_DPROPERTY_TYPE = 5;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 5;

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
			case ArrowheadSysMLProfilePackage.SYS_DD:
				return validateSysDD((SysDD)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.IDENTIFIABLE:
				return validateIdentifiable((Identifiable)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCRIPTION:
				return validateDeviceDesignDescription((DeviceDesignDescription)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN:
				return validateDeviceDesign((DeviceDesign)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.LOCAL_CLOUD_DESIGN:
				return validateLocalCloudDesign((LocalCloudDesign)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.SYS_D:
				return validateSysD((SysD)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.LOCAL_CLOUD_DESIGN_DESCRIPTION:
				return validateLocalCLoudDesignDescription((LocalCLoudDesignDescription)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.NETWORK_DESIGN:
				return validateNetworkDesign((NetworkDesign)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.NETWORK_DESIGN_DESCRIPTIION:
				return validateNetworkDesignDescriptiion((NetworkDesignDescriptiion)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_DESIGN:
				return validateSystemofLocalCloudsDesign((SystemofLocalCloudsDesign)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_DESIGN_DESCRIPTION:
				return validateSystemofLocalCloudsDesignDescription((SystemofLocalCloudsDesignDescription)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.CONSUMER:
				return validateConsumer((Consumer)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.PROVIDER:
				return validateProvider((Provider)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.IDD:
				return validateIDD((IDD)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.SD:
				return validateSD((SD)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.MANDATORY_CORE_SYSTEM_SYS_D:
				return validateMandatoryCoreSystemSysD((MandatoryCoreSystemSysD)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.SUPPORT_CORE_SYSTEM_SYS_D:
				return validateSupportCoreSystemSysD((SupportCoreSystemSysD)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.APPLICATION_SYS_D:
				return validateApplicationSysD((ApplicationSysD)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.MANDATORY_CORE_SYSTEM_SYS_DD:
				return validateMandatoryCoreSystemSysDD((MandatoryCoreSystemSysDD)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.SUPPORT_CORE_SYSTEM_SYS_DD:
				return validateSupportCoreSystemSysDD((SupportCoreSystemSysDD)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.APPLICATION_SYS_DD:
				return validateApplicationSysDD((ApplicationSysDD)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.DATA_SEMANTICS:
				return validateDataSemantics((DataSemantics)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.OPERATION:
				return validateOperation((Operation)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.NETWORK_DESIGN_DESCRIPTION:
				return validateNetworkDesignDescription((NetworkDesignDescription)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.DEPLOY:
				return validateDeploy((Deploy)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.CERTIFICATE_LEVEL:
				return validateCertificateLevel((CertificateLevel)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.PHYSICAL_LAYER_KIND:
				return validatePhysicalLayerKind((PhysicalLayerKind)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.SECURITY_KIND:
				return validateSecurityKind((SecurityKind)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.CERTIFICATE_KIND:
				return validateCertificateKind((CertificateKind)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.MANDATORY_CORE_SYSTEM_KIND:
				return validateMandatoryCoreSystemKind((MandatoryCoreSystemKind)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.APPLICATION_SYSTEM_KIND:
				return validateApplicationSystemKind((ApplicationSystemKind)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.SUPPORT_CORE_SYSTEM_KIND:
				return validateSupportCoreSystemKind((SupportCoreSystemKind)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.ONTOLOGY_KIND:
				return validateOntologyKind((OntologyKind)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.METHOD_KIND:
				return validateMethodKind((MethodKind)value, diagnostics, context);
			case ArrowheadSysMLProfilePackage.PROTOCOL_KIND:
				return validateProtocolKind((ProtocolKind)value, diagnostics, context);
			default:
				return true;
		}
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
		if (result || diagnostics != null) result &= validateSysDD_DeployedatDevice(sysDD, diagnostics, context);
		if (result || diagnostics != null) result &= validateSysDD_Constraint27(sysDD, diagnostics, context);
		return result;
	}

	/**
	 * Validates the DeployedatDevice constraint of '<em>Sys DD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSysDD_DeployedatDevice(SysDD sysDD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sysDD.DeployedatDevice(diagnostics, context);
	}

	/**
	 * Validates the Constraint27 constraint of '<em>Sys DD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSysDD_Constraint27(SysDD sysDD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sysDD.Constraint27(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifiable(Identifiable identifiable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identifiable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceDesignDescription(DeviceDesignDescription deviceDesignDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(deviceDesignDescription, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(deviceDesignDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(deviceDesignDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(deviceDesignDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(deviceDesignDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(deviceDesignDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(deviceDesignDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(deviceDesignDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(deviceDesignDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validateDeviceDesignDescription_Constraint53(deviceDesignDescription, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Constraint53 constraint of '<em>Device Design Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceDesignDescription_Constraint53(DeviceDesignDescription deviceDesignDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return deviceDesignDescription.Constraint53(diagnostics, context);
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
	public boolean validateLocalCloudDesign(LocalCloudDesign localCloudDesign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(localCloudDesign, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSysD(SysD sysD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sysD, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sysD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sysD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sysD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sysD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sysD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sysD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sysD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sysD, diagnostics, context);
		if (result || diagnostics != null) result &= validateSysD_Constraint180(sysD, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Constraint180 constraint of '<em>Sys D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSysD_Constraint180(SysD sysD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sysD.Constraint180(diagnostics, context);
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
	public boolean validateNetworkDesign(NetworkDesign networkDesign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(networkDesign, diagnostics, context);
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
	public boolean validateSystemofLocalCloudsDesign(SystemofLocalCloudsDesign systemofLocalCloudsDesign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(systemofLocalCloudsDesign, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(systemofLocalCloudsDesign, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(systemofLocalCloudsDesign, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(systemofLocalCloudsDesign, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(systemofLocalCloudsDesign, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(systemofLocalCloudsDesign, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(systemofLocalCloudsDesign, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(systemofLocalCloudsDesign, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(systemofLocalCloudsDesign, diagnostics, context);
		if (result || diagnostics != null) result &= validateSystemofLocalCloudsDesign_SoLCDpropertyType(systemofLocalCloudsDesign, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SoLCDpropertyType constraint of '<em>Systemof Local Clouds Design</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemofLocalCloudsDesign_SoLCDpropertyType(SystemofLocalCloudsDesign systemofLocalCloudsDesign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return systemofLocalCloudsDesign.SoLCDpropertyType(diagnostics, context);
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
	public boolean validateConsumer(Consumer consumer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(consumer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvider(Provider provider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(provider, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIDD(IDD idd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(idd, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSD(SD sd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sd, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMandatoryCoreSystemSysD(MandatoryCoreSystemSysD mandatoryCoreSystemSysD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mandatoryCoreSystemSysD, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mandatoryCoreSystemSysD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mandatoryCoreSystemSysD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mandatoryCoreSystemSysD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mandatoryCoreSystemSysD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mandatoryCoreSystemSysD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mandatoryCoreSystemSysD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mandatoryCoreSystemSysD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mandatoryCoreSystemSysD, diagnostics, context);
		if (result || diagnostics != null) result &= validateSysD_Constraint180(mandatoryCoreSystemSysD, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportCoreSystemSysD(SupportCoreSystemSysD supportCoreSystemSysD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(supportCoreSystemSysD, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(supportCoreSystemSysD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(supportCoreSystemSysD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(supportCoreSystemSysD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(supportCoreSystemSysD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(supportCoreSystemSysD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(supportCoreSystemSysD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(supportCoreSystemSysD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(supportCoreSystemSysD, diagnostics, context);
		if (result || diagnostics != null) result &= validateSysD_Constraint180(supportCoreSystemSysD, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplicationSysD(ApplicationSysD applicationSysD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(applicationSysD, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(applicationSysD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(applicationSysD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(applicationSysD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(applicationSysD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(applicationSysD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(applicationSysD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(applicationSysD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(applicationSysD, diagnostics, context);
		if (result || diagnostics != null) result &= validateSysD_Constraint180(applicationSysD, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMandatoryCoreSystemSysDD(MandatoryCoreSystemSysDD mandatoryCoreSystemSysDD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mandatoryCoreSystemSysDD, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mandatoryCoreSystemSysDD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mandatoryCoreSystemSysDD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mandatoryCoreSystemSysDD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mandatoryCoreSystemSysDD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mandatoryCoreSystemSysDD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mandatoryCoreSystemSysDD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mandatoryCoreSystemSysDD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mandatoryCoreSystemSysDD, diagnostics, context);
		if (result || diagnostics != null) result &= validateSysDD_DeployedatDevice(mandatoryCoreSystemSysDD, diagnostics, context);
		if (result || diagnostics != null) result &= validateSysDD_Constraint27(mandatoryCoreSystemSysDD, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportCoreSystemSysDD(SupportCoreSystemSysDD supportCoreSystemSysDD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(supportCoreSystemSysDD, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(supportCoreSystemSysDD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(supportCoreSystemSysDD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(supportCoreSystemSysDD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(supportCoreSystemSysDD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(supportCoreSystemSysDD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(supportCoreSystemSysDD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(supportCoreSystemSysDD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(supportCoreSystemSysDD, diagnostics, context);
		if (result || diagnostics != null) result &= validateSysDD_DeployedatDevice(supportCoreSystemSysDD, diagnostics, context);
		if (result || diagnostics != null) result &= validateSysDD_Constraint27(supportCoreSystemSysDD, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplicationSysDD(ApplicationSysDD applicationSysDD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(applicationSysDD, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(applicationSysDD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(applicationSysDD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(applicationSysDD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(applicationSysDD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(applicationSysDD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(applicationSysDD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(applicationSysDD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(applicationSysDD, diagnostics, context);
		if (result || diagnostics != null) result &= validateSysDD_DeployedatDevice(applicationSysDD, diagnostics, context);
		if (result || diagnostics != null) result &= validateSysDD_Constraint27(applicationSysDD, diagnostics, context);
		return result;
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
	public boolean validateOperation(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkDesignDescription(NetworkDesignDescription networkDesignDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(networkDesignDescription, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeploy(Deploy deploy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deploy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCertificateLevel(CertificateLevel certificateLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateSecurityKind(SecurityKind securityKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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
	public boolean validateMandatoryCoreSystemKind(MandatoryCoreSystemKind mandatoryCoreSystemKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplicationSystemKind(ApplicationSystemKind applicationSystemKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateApplicationSystemKind_Constraint27(applicationSystemKind, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Constraint27 constraint of '<em>Application System Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplicationSystemKind_Constraint27(ApplicationSystemKind applicationSystemKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "Constraint27", getValueLabel(ArrowheadSysMLProfilePackage.Literals.APPLICATION_SYSTEM_KIND, applicationSystemKind, context) },
						 new Object[] { applicationSystemKind },
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
	public boolean validateSupportCoreSystemKind(SupportCoreSystemKind supportCoreSystemKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateMethodKind(MethodKind methodKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
