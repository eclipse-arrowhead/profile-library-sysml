/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CertificateKind;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Device;

import org.eclipse.papyrus.sysml16.blocks.internal.impl.BlockImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceImpl#getCertificateLevel <em>Certificate Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceImpl extends BlockImpl implements Device {
	/**
	 * The default value of the '{@link #getCertificateLevel() <em>Certificate Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificateLevel()
	 * @generated
	 * @ordered
	 */
	protected static final CertificateKind CERTIFICATE_LEVEL_EDEFAULT = CertificateKind.DEVICE;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadSysMLProfilePackage.Literals.DEVICE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.DEVICE__CERTIFICATE_LEVEL, oldCertificateLevel, certificateLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.DEVICE__CERTIFICATE_LEVEL:
				return getCertificateLevel();
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
			case ArrowheadSysMLProfilePackage.DEVICE__CERTIFICATE_LEVEL:
				setCertificateLevel((CertificateKind)newValue);
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
			case ArrowheadSysMLProfilePackage.DEVICE__CERTIFICATE_LEVEL:
				setCertificateLevel(CERTIFICATE_LEVEL_EDEFAULT);
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
			case ArrowheadSysMLProfilePackage.DEVICE__CERTIFICATE_LEVEL:
				return certificateLevel != CERTIFICATE_LEVEL_EDEFAULT;
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

} //DeviceImpl
