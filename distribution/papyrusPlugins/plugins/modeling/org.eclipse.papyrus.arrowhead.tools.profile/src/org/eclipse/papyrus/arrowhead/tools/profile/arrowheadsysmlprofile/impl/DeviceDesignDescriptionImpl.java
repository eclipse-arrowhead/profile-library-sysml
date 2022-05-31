/**
 */
package org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.CertificateLevel;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DeviceDesignDescription;

import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.util.ArrowheadSysMLProfileValidator;

import org.eclipse.papyrus.sysml16.blocks.internal.impl.BlockImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Design Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.DeviceDesignDescriptionImpl#getNetworkinterface <em>Networkinterface</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.DeviceDesignDescriptionImpl#getOperatingSystem <em>Operating System</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.DeviceDesignDescriptionImpl#getMemory <em>Memory</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.DeviceDesignDescriptionImpl#getProcessor <em>Processor</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.DeviceDesignDescriptionImpl#getCertificateLevel <em>Certificate Level</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.DeviceDesignDescriptionImpl#getDeviceDesign <em>Device Design</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceDesignDescriptionImpl extends BlockImpl implements DeviceDesignDescription {
	/**
	 * The cached value of the '{@link #getNetworkinterface() <em>Networkinterface</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkinterface()
	 * @generated
	 * @ordered
	 */
	protected EList<String> networkinterface;

	/**
	 * The default value of the '{@link #getOperatingSystem() <em>Operating System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATING_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperatingSystem() <em>Operating System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingSystem()
	 * @generated
	 * @ordered
	 */
	protected String operatingSystem = OPERATING_SYSTEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemory() <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected static final String MEMORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemory() <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected String memory = MEMORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessor() <em>Processor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessor()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESSOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessor() <em>Processor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessor()
	 * @generated
	 * @ordered
	 */
	protected String processor = PROCESSOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCertificateLevel() <em>Certificate Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificateLevel()
	 * @generated
	 * @ordered
	 */
	protected static final CertificateLevel CERTIFICATE_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCertificateLevel() <em>Certificate Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificateLevel()
	 * @generated
	 * @ordered
	 */
	protected CertificateLevel certificateLevel = CERTIFICATE_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeviceDesign() <em>Device Design</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceDesign()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_DESIGN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceDesign() <em>Device Design</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceDesign()
	 * @generated
	 * @ordered
	 */
	protected String deviceDesign = DEVICE_DESIGN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceDesignDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadSysMLProfilePackage.Literals.DEVICE_DESIGN_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getNetworkinterface() {
		if (networkinterface == null) {
			networkinterface = new EDataTypeUniqueEList<String>(String.class, this, ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCRIPTION__NETWORKINTERFACE);
		}
		return networkinterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperatingSystem() {
		return operatingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperatingSystem(String newOperatingSystem) {
		String oldOperatingSystem = operatingSystem;
		operatingSystem = newOperatingSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCRIPTION__OPERATING_SYSTEM, oldOperatingSystem, operatingSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMemory() {
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemory(String newMemory) {
		String oldMemory = memory;
		memory = newMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCRIPTION__MEMORY, oldMemory, memory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProcessor() {
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessor(String newProcessor) {
		String oldProcessor = processor;
		processor = newProcessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCRIPTION__PROCESSOR, oldProcessor, processor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CertificateLevel getCertificateLevel() {
		return certificateLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCertificateLevel(CertificateLevel newCertificateLevel) {
		CertificateLevel oldCertificateLevel = certificateLevel;
		certificateLevel = newCertificateLevel == null ? CERTIFICATE_LEVEL_EDEFAULT : newCertificateLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCRIPTION__CERTIFICATE_LEVEL, oldCertificateLevel, certificateLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeviceDesign() {
		return deviceDesign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceDesign(String newDeviceDesign) {
		String oldDeviceDesign = deviceDesign;
		deviceDesign = newDeviceDesign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCRIPTION__DEVICE_DESIGN, oldDeviceDesign, deviceDesign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean Constraint53(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ArrowheadSysMLProfileValidator.DIAGNOSTIC_SOURCE,
						 ArrowheadSysMLProfileValidator.DEVICE_DESIGN_DESCRIPTION__CONSTRAINT53,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "Constraint53", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCRIPTION__NETWORKINTERFACE:
				return getNetworkinterface();
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCRIPTION__OPERATING_SYSTEM:
				return getOperatingSystem();
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCRIPTION__MEMORY:
				return getMemory();
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCRIPTION__PROCESSOR:
				return getProcessor();
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCRIPTION__CERTIFICATE_LEVEL:
				return getCertificateLevel();
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCRIPTION__DEVICE_DESIGN:
				return getDeviceDesign();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCRIPTION__NETWORKINTERFACE:
				getNetworkinterface().clear();
				getNetworkinterface().addAll((Collection<? extends String>)newValue);
				return;
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCRIPTION__OPERATING_SYSTEM:
				setOperatingSystem((String)newValue);
				return;
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCRIPTION__MEMORY:
				setMemory((String)newValue);
				return;
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCRIPTION__PROCESSOR:
				setProcessor((String)newValue);
				return;
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCRIPTION__CERTIFICATE_LEVEL:
				setCertificateLevel((CertificateLevel)newValue);
				return;
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCRIPTION__DEVICE_DESIGN:
				setDeviceDesign((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCRIPTION__NETWORKINTERFACE:
				getNetworkinterface().clear();
				return;
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCRIPTION__OPERATING_SYSTEM:
				setOperatingSystem(OPERATING_SYSTEM_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCRIPTION__MEMORY:
				setMemory(MEMORY_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCRIPTION__PROCESSOR:
				setProcessor(PROCESSOR_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCRIPTION__CERTIFICATE_LEVEL:
				setCertificateLevel(CERTIFICATE_LEVEL_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCRIPTION__DEVICE_DESIGN:
				setDeviceDesign(DEVICE_DESIGN_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCRIPTION__NETWORKINTERFACE:
				return networkinterface != null && !networkinterface.isEmpty();
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCRIPTION__OPERATING_SYSTEM:
				return OPERATING_SYSTEM_EDEFAULT == null ? operatingSystem != null : !OPERATING_SYSTEM_EDEFAULT.equals(operatingSystem);
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCRIPTION__MEMORY:
				return MEMORY_EDEFAULT == null ? memory != null : !MEMORY_EDEFAULT.equals(memory);
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCRIPTION__PROCESSOR:
				return PROCESSOR_EDEFAULT == null ? processor != null : !PROCESSOR_EDEFAULT.equals(processor);
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCRIPTION__CERTIFICATE_LEVEL:
				return certificateLevel != CERTIFICATE_LEVEL_EDEFAULT;
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCRIPTION__DEVICE_DESIGN:
				return DEVICE_DESIGN_EDEFAULT == null ? deviceDesign != null : !DEVICE_DESIGN_EDEFAULT.equals(deviceDesign);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCRIPTION___CONSTRAINT53__DIAGNOSTICCHAIN_MAP:
				return Constraint53((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (networkinterface: ");
		result.append(networkinterface);
		result.append(", operatingSystem: ");
		result.append(operatingSystem);
		result.append(", memory: ");
		result.append(memory);
		result.append(", processor: ");
		result.append(processor);
		result.append(", certificateLevel: ");
		result.append(certificateLevel);
		result.append(", deviceDesign: ");
		result.append(deviceDesign);
		result.append(')');
		return result.toString();
	}

} //DeviceDesignDescriptionImpl
