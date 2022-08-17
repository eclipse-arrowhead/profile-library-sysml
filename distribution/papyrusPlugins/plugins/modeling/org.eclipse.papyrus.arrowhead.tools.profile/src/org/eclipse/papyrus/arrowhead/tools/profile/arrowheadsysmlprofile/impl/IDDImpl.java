/**
 */
package org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.CertificateKind;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.IDD;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SecurityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IDD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.IDDImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.IDDImpl#getCertificate <em>Certificate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IDDImpl extends SDImpl implements IDD {
	/**
	 * The default value of the '{@link #getSecurity() <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected static final SecurityKind SECURITY_EDEFAULT = SecurityKind.NOT_SECURE;

	/**
	 * The cached value of the '{@link #getSecurity() <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected SecurityKind security = SECURITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCertificate() <em>Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificate()
	 * @generated
	 * @ordered
	 */
	protected static final CertificateKind CERTIFICATE_EDEFAULT = CertificateKind.DEVICE;

	/**
	 * The cached value of the '{@link #getCertificate() <em>Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificate()
	 * @generated
	 * @ordered
	 */
	protected CertificateKind certificate = CERTIFICATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IDDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadSysMLProfilePackage.Literals.IDD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityKind getSecurity() {
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurity(SecurityKind newSecurity) {
		SecurityKind oldSecurity = security;
		security = newSecurity == null ? SECURITY_EDEFAULT : newSecurity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.IDD__SECURITY, oldSecurity, security));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CertificateKind getCertificate() {
		return certificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCertificate(CertificateKind newCertificate) {
		CertificateKind oldCertificate = certificate;
		certificate = newCertificate == null ? CERTIFICATE_EDEFAULT : newCertificate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.IDD__CERTIFICATE, oldCertificate, certificate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.IDD__SECURITY:
				return getSecurity();
			case ArrowheadSysMLProfilePackage.IDD__CERTIFICATE:
				return getCertificate();
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
			case ArrowheadSysMLProfilePackage.IDD__SECURITY:
				setSecurity((SecurityKind)newValue);
				return;
			case ArrowheadSysMLProfilePackage.IDD__CERTIFICATE:
				setCertificate((CertificateKind)newValue);
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
			case ArrowheadSysMLProfilePackage.IDD__SECURITY:
				setSecurity(SECURITY_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.IDD__CERTIFICATE:
				setCertificate(CERTIFICATE_EDEFAULT);
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
			case ArrowheadSysMLProfilePackage.IDD__SECURITY:
				return security != SECURITY_EDEFAULT;
			case ArrowheadSysMLProfilePackage.IDD__CERTIFICATE:
				return certificate != CERTIFICATE_EDEFAULT;
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
		result.append(" (security: ");
		result.append(security);
		result.append(", certificate: ");
		result.append(certificate);
		result.append(')');
		return result.toString();
	}

} //IDDImpl
