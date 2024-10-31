/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CertificateCreationForm;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CryptoAlgorithmKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Certificate Creation Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.CertificateCreationFormImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.CertificateCreationFormImpl#getCommomName <em>Commom Name</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.CertificateCreationFormImpl#getKeyAlgorithm <em>Key Algorithm</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.CertificateCreationFormImpl#getKeyFormat <em>Key Format</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.CertificateCreationFormImpl#getPrivatKey <em>Privat Key</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.CertificateCreationFormImpl#getPublicKey <em>Public Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CertificateCreationFormImpl extends MinimalEObjectImpl.Container implements CertificateCreationForm {
	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * The default value of the '{@link #getCommomName() <em>Commom Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommomName()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMOM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommomName() <em>Commom Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommomName()
	 * @generated
	 * @ordered
	 */
	protected String commomName = COMMOM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyAlgorithm() <em>Key Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final CryptoAlgorithmKind KEY_ALGORITHM_EDEFAULT = CryptoAlgorithmKind.RSA;

	/**
	 * The cached value of the '{@link #getKeyAlgorithm() <em>Key Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected CryptoAlgorithmKind keyAlgorithm = KEY_ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyFormat() <em>Key Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyFormat() <em>Key Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyFormat()
	 * @generated
	 * @ordered
	 */
	protected String keyFormat = KEY_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrivatKey() <em>Privat Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivatKey()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIVAT_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivatKey() <em>Privat Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivatKey()
	 * @generated
	 * @ordered
	 */
	protected String privatKey = PRIVAT_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublicKey() <em>Public Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicKey()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLIC_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicKey() <em>Public Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicKey()
	 * @generated
	 * @ordered
	 */
	protected String publicKey = PUBLIC_KEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CertificateCreationFormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadSysMLProfilePackage.Literals.CERTIFICATE_CREATION_FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArrowheadSysMLProfilePackage.CERTIFICATE_CREATION_FORM__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.CERTIFICATE_CREATION_FORM__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommomName() {
		return commomName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommomName(String newCommomName) {
		String oldCommomName = commomName;
		commomName = newCommomName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.CERTIFICATE_CREATION_FORM__COMMOM_NAME, oldCommomName, commomName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CryptoAlgorithmKind getKeyAlgorithm() {
		return keyAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyAlgorithm(CryptoAlgorithmKind newKeyAlgorithm) {
		CryptoAlgorithmKind oldKeyAlgorithm = keyAlgorithm;
		keyAlgorithm = newKeyAlgorithm == null ? KEY_ALGORITHM_EDEFAULT : newKeyAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.CERTIFICATE_CREATION_FORM__KEY_ALGORITHM, oldKeyAlgorithm, keyAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyFormat() {
		return keyFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyFormat(String newKeyFormat) {
		String oldKeyFormat = keyFormat;
		keyFormat = newKeyFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.CERTIFICATE_CREATION_FORM__KEY_FORMAT, oldKeyFormat, keyFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrivatKey() {
		return privatKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivatKey(String newPrivatKey) {
		String oldPrivatKey = privatKey;
		privatKey = newPrivatKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.CERTIFICATE_CREATION_FORM__PRIVAT_KEY, oldPrivatKey, privatKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublicKey() {
		return publicKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicKey(String newPublicKey) {
		String oldPublicKey = publicKey;
		publicKey = newPublicKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.CERTIFICATE_CREATION_FORM__PUBLIC_KEY, oldPublicKey, publicKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.CERTIFICATE_CREATION_FORM__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case ArrowheadSysMLProfilePackage.CERTIFICATE_CREATION_FORM__COMMOM_NAME:
				return getCommomName();
			case ArrowheadSysMLProfilePackage.CERTIFICATE_CREATION_FORM__KEY_ALGORITHM:
				return getKeyAlgorithm();
			case ArrowheadSysMLProfilePackage.CERTIFICATE_CREATION_FORM__KEY_FORMAT:
				return getKeyFormat();
			case ArrowheadSysMLProfilePackage.CERTIFICATE_CREATION_FORM__PRIVAT_KEY:
				return getPrivatKey();
			case ArrowheadSysMLProfilePackage.CERTIFICATE_CREATION_FORM__PUBLIC_KEY:
				return getPublicKey();
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
			case ArrowheadSysMLProfilePackage.CERTIFICATE_CREATION_FORM__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case ArrowheadSysMLProfilePackage.CERTIFICATE_CREATION_FORM__COMMOM_NAME:
				setCommomName((String)newValue);
				return;
			case ArrowheadSysMLProfilePackage.CERTIFICATE_CREATION_FORM__KEY_ALGORITHM:
				setKeyAlgorithm((CryptoAlgorithmKind)newValue);
				return;
			case ArrowheadSysMLProfilePackage.CERTIFICATE_CREATION_FORM__KEY_FORMAT:
				setKeyFormat((String)newValue);
				return;
			case ArrowheadSysMLProfilePackage.CERTIFICATE_CREATION_FORM__PRIVAT_KEY:
				setPrivatKey((String)newValue);
				return;
			case ArrowheadSysMLProfilePackage.CERTIFICATE_CREATION_FORM__PUBLIC_KEY:
				setPublicKey((String)newValue);
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
			case ArrowheadSysMLProfilePackage.CERTIFICATE_CREATION_FORM__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case ArrowheadSysMLProfilePackage.CERTIFICATE_CREATION_FORM__COMMOM_NAME:
				setCommomName(COMMOM_NAME_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.CERTIFICATE_CREATION_FORM__KEY_ALGORITHM:
				setKeyAlgorithm(KEY_ALGORITHM_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.CERTIFICATE_CREATION_FORM__KEY_FORMAT:
				setKeyFormat(KEY_FORMAT_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.CERTIFICATE_CREATION_FORM__PRIVAT_KEY:
				setPrivatKey(PRIVAT_KEY_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.CERTIFICATE_CREATION_FORM__PUBLIC_KEY:
				setPublicKey(PUBLIC_KEY_EDEFAULT);
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
			case ArrowheadSysMLProfilePackage.CERTIFICATE_CREATION_FORM__BASE_CLASS:
				return base_Class != null;
			case ArrowheadSysMLProfilePackage.CERTIFICATE_CREATION_FORM__COMMOM_NAME:
				return COMMOM_NAME_EDEFAULT == null ? commomName != null : !COMMOM_NAME_EDEFAULT.equals(commomName);
			case ArrowheadSysMLProfilePackage.CERTIFICATE_CREATION_FORM__KEY_ALGORITHM:
				return keyAlgorithm != KEY_ALGORITHM_EDEFAULT;
			case ArrowheadSysMLProfilePackage.CERTIFICATE_CREATION_FORM__KEY_FORMAT:
				return KEY_FORMAT_EDEFAULT == null ? keyFormat != null : !KEY_FORMAT_EDEFAULT.equals(keyFormat);
			case ArrowheadSysMLProfilePackage.CERTIFICATE_CREATION_FORM__PRIVAT_KEY:
				return PRIVAT_KEY_EDEFAULT == null ? privatKey != null : !PRIVAT_KEY_EDEFAULT.equals(privatKey);
			case ArrowheadSysMLProfilePackage.CERTIFICATE_CREATION_FORM__PUBLIC_KEY:
				return PUBLIC_KEY_EDEFAULT == null ? publicKey != null : !PUBLIC_KEY_EDEFAULT.equals(publicKey);
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
		result.append(" (commomName: ");
		result.append(commomName);
		result.append(", keyAlgorithm: ");
		result.append(keyAlgorithm);
		result.append(", keyFormat: ");
		result.append(keyFormat);
		result.append(", privatKey: ");
		result.append(privatKey);
		result.append(", publicKey: ");
		result.append(publicKey);
		result.append(')');
		return result.toString();
	}

} //CertificateCreationFormImpl
