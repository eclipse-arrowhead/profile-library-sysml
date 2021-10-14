/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CertificateKind;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceDesignDesciption;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysDD;

import org.eclipse.papyrus.sysml16.blocks.internal.impl.BlockImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sys DD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SysDDImpl#getCertificateLevel <em>Certificate Level</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SysDDImpl#getDevicedesigndesciption <em>Devicedesigndesciption</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SysDDImpl extends BlockImpl implements SysDD {
	/**
	 * The default value of the '{@link #getCertificateLevel() <em>Certificate Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificateLevel()
	 * @generated
	 * @ordered
	 */
	protected static final CertificateKind CERTIFICATE_LEVEL_EDEFAULT = CertificateKind.SYSTEM;

	/**
	 * The cached value of the '{@link #getCertificateLevel() <em>Certificate Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificateLevel()
	 * @generated
	 * @ordered
	 */
	protected CertificateKind certificateLevel = CERTIFICATE_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDevicedesigndesciption() <em>Devicedesigndesciption</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevicedesigndesciption()
	 * @generated
	 * @ordered
	 */
	protected DeviceDesignDesciption devicedesigndesciption;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SysDDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadSysMLProfilePackage.Literals.SYS_DD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CertificateKind getCertificateLevel() {
		return certificateLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCertificateLevel(CertificateKind newCertificateLevel) {
		CertificateKind oldCertificateLevel = certificateLevel;
		certificateLevel = newCertificateLevel == null ? CERTIFICATE_LEVEL_EDEFAULT : newCertificateLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.SYS_DD__CERTIFICATE_LEVEL, oldCertificateLevel, certificateLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceDesignDesciption getDevicedesigndesciption() {
		if (devicedesigndesciption != null && devicedesigndesciption.eIsProxy()) {
			InternalEObject oldDevicedesigndesciption = (InternalEObject)devicedesigndesciption;
			devicedesigndesciption = (DeviceDesignDesciption)eResolveProxy(oldDevicedesigndesciption);
			if (devicedesigndesciption != oldDevicedesigndesciption) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArrowheadSysMLProfilePackage.SYS_DD__DEVICEDESIGNDESCIPTION, oldDevicedesigndesciption, devicedesigndesciption));
			}
		}
		return devicedesigndesciption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceDesignDesciption basicGetDevicedesigndesciption() {
		return devicedesigndesciption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevicedesigndesciption(DeviceDesignDesciption newDevicedesigndesciption) {
		DeviceDesignDesciption oldDevicedesigndesciption = devicedesigndesciption;
		devicedesigndesciption = newDevicedesigndesciption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.SYS_DD__DEVICEDESIGNDESCIPTION, oldDevicedesigndesciption, devicedesigndesciption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.SYS_DD__CERTIFICATE_LEVEL:
				return getCertificateLevel();
			case ArrowheadSysMLProfilePackage.SYS_DD__DEVICEDESIGNDESCIPTION:
				if (resolve) return getDevicedesigndesciption();
				return basicGetDevicedesigndesciption();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.SYS_DD__CERTIFICATE_LEVEL:
				setCertificateLevel((CertificateKind)newValue);
				return;
			case ArrowheadSysMLProfilePackage.SYS_DD__DEVICEDESIGNDESCIPTION:
				setDevicedesigndesciption((DeviceDesignDesciption)newValue);
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
			case ArrowheadSysMLProfilePackage.SYS_DD__CERTIFICATE_LEVEL:
				setCertificateLevel(CERTIFICATE_LEVEL_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.SYS_DD__DEVICEDESIGNDESCIPTION:
				setDevicedesigndesciption((DeviceDesignDesciption)null);
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
			case ArrowheadSysMLProfilePackage.SYS_DD__CERTIFICATE_LEVEL:
				return certificateLevel != CERTIFICATE_LEVEL_EDEFAULT;
			case ArrowheadSysMLProfilePackage.SYS_DD__DEVICEDESIGNDESCIPTION:
				return devicedesigndesciption != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (CertificateLevel: ");
		result.append(certificateLevel);
		result.append(')');
		return result.toString();
	}

} //SysDDImpl
