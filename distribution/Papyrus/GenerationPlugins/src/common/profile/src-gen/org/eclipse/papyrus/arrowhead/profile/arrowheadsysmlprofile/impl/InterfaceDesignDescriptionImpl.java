/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CertificateKind;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CompresionKind;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CryptoAlgorithmKind;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.EncodingKind;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.PayloadEncryptionKind;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ProtocolKind;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SecurityKind;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.TimeFormatKind;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.TokenKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Design Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.InterfaceDesignDescriptionImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.InterfaceDesignDescriptionImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.InterfaceDesignDescriptionImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.InterfaceDesignDescriptionImpl#getCompression <em>Compression</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.InterfaceDesignDescriptionImpl#getCryptoAlgorithm <em>Crypto Algorithm</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.InterfaceDesignDescriptionImpl#getToken <em>Token</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.InterfaceDesignDescriptionImpl#getCertificateLevel <em>Certificate Level</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.InterfaceDesignDescriptionImpl#getPayloadEncryption <em>Payload Encryption</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.InterfaceDesignDescriptionImpl#getTimeFormat <em>Time Format</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceDesignDescriptionImpl extends ServiceDescriptionImpl implements InterfaceDesignDescription {
	/**
	 * The default value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final EncodingKind ENCODING_EDEFAULT = EncodingKind.JSON;

	/**
	 * The cached value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected EncodingKind encoding = ENCODING_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurity() <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected static final SecurityKind SECURITY_EDEFAULT = SecurityKind.CERTIFICATE;

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
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final ProtocolKind PROTOCOL_EDEFAULT = ProtocolKind.HTTP_11;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected ProtocolKind protocol = PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompression() <em>Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompression()
	 * @generated
	 * @ordered
	 */
	protected static final CompresionKind COMPRESSION_EDEFAULT = CompresionKind.NONE;

	/**
	 * The cached value of the '{@link #getCompression() <em>Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompression()
	 * @generated
	 * @ordered
	 */
	protected CompresionKind compression = COMPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCryptoAlgorithm() <em>Crypto Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCryptoAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final CryptoAlgorithmKind CRYPTO_ALGORITHM_EDEFAULT = CryptoAlgorithmKind.RSA;

	/**
	 * The cached value of the '{@link #getCryptoAlgorithm() <em>Crypto Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCryptoAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected CryptoAlgorithmKind cryptoAlgorithm = CRYPTO_ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final TokenKind TOKEN_EDEFAULT = TokenKind.ARROWHEAD_TOKEN;

	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected TokenKind token = TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCertificateLevel() <em>Certificate Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificateLevel()
	 * @generated
	 * @ordered
	 */
	protected static final CertificateKind CERTIFICATE_LEVEL_EDEFAULT = CertificateKind.APPLICATION_SERVICE;

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
	 * The default value of the '{@link #getPayloadEncryption() <em>Payload Encryption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayloadEncryption()
	 * @generated
	 * @ordered
	 */
	protected static final PayloadEncryptionKind PAYLOAD_ENCRYPTION_EDEFAULT = PayloadEncryptionKind.DTLS;

	/**
	 * The cached value of the '{@link #getPayloadEncryption() <em>Payload Encryption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayloadEncryption()
	 * @generated
	 * @ordered
	 */
	protected PayloadEncryptionKind payloadEncryption = PAYLOAD_ENCRYPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeFormat() <em>Time Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeFormat()
	 * @generated
	 * @ordered
	 */
	protected static final TimeFormatKind TIME_FORMAT_EDEFAULT = TimeFormatKind.RFC_3339;

	/**
	 * The cached value of the '{@link #getTimeFormat() <em>Time Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeFormat()
	 * @generated
	 * @ordered
	 */
	protected TimeFormatKind timeFormat = TIME_FORMAT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceDesignDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadSysMLProfilePackage.Literals.INTERFACE_DESIGN_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncodingKind getEncoding() {
		return encoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncoding(EncodingKind newEncoding) {
		EncodingKind oldEncoding = encoding;
		encoding = newEncoding == null ? ENCODING_EDEFAULT : newEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__ENCODING, oldEncoding, encoding));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__SECURITY, oldSecurity, security));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolKind getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(ProtocolKind newProtocol) {
		ProtocolKind oldProtocol = protocol;
		protocol = newProtocol == null ? PROTOCOL_EDEFAULT : newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompresionKind getCompression() {
		return compression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompression(CompresionKind newCompression) {
		CompresionKind oldCompression = compression;
		compression = newCompression == null ? COMPRESSION_EDEFAULT : newCompression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__COMPRESSION, oldCompression, compression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CryptoAlgorithmKind getCryptoAlgorithm() {
		return cryptoAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCryptoAlgorithm(CryptoAlgorithmKind newCryptoAlgorithm) {
		CryptoAlgorithmKind oldCryptoAlgorithm = cryptoAlgorithm;
		cryptoAlgorithm = newCryptoAlgorithm == null ? CRYPTO_ALGORITHM_EDEFAULT : newCryptoAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__CRYPTO_ALGORITHM, oldCryptoAlgorithm, cryptoAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenKind getToken() {
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToken(TokenKind newToken) {
		TokenKind oldToken = token;
		token = newToken == null ? TOKEN_EDEFAULT : newToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__TOKEN, oldToken, token));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__CERTIFICATE_LEVEL, oldCertificateLevel, certificateLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayloadEncryptionKind getPayloadEncryption() {
		return payloadEncryption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayloadEncryption(PayloadEncryptionKind newPayloadEncryption) {
		PayloadEncryptionKind oldPayloadEncryption = payloadEncryption;
		payloadEncryption = newPayloadEncryption == null ? PAYLOAD_ENCRYPTION_EDEFAULT : newPayloadEncryption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__PAYLOAD_ENCRYPTION, oldPayloadEncryption, payloadEncryption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeFormatKind getTimeFormat() {
		return timeFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeFormat(TimeFormatKind newTimeFormat) {
		TimeFormatKind oldTimeFormat = timeFormat;
		timeFormat = newTimeFormat == null ? TIME_FORMAT_EDEFAULT : newTimeFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__TIME_FORMAT, oldTimeFormat, timeFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__ENCODING:
				return getEncoding();
			case ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__SECURITY:
				return getSecurity();
			case ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__PROTOCOL:
				return getProtocol();
			case ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__COMPRESSION:
				return getCompression();
			case ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__CRYPTO_ALGORITHM:
				return getCryptoAlgorithm();
			case ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__TOKEN:
				return getToken();
			case ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__CERTIFICATE_LEVEL:
				return getCertificateLevel();
			case ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__PAYLOAD_ENCRYPTION:
				return getPayloadEncryption();
			case ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__TIME_FORMAT:
				return getTimeFormat();
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
			case ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__ENCODING:
				setEncoding((EncodingKind)newValue);
				return;
			case ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__SECURITY:
				setSecurity((SecurityKind)newValue);
				return;
			case ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__PROTOCOL:
				setProtocol((ProtocolKind)newValue);
				return;
			case ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__COMPRESSION:
				setCompression((CompresionKind)newValue);
				return;
			case ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__CRYPTO_ALGORITHM:
				setCryptoAlgorithm((CryptoAlgorithmKind)newValue);
				return;
			case ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__TOKEN:
				setToken((TokenKind)newValue);
				return;
			case ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__CERTIFICATE_LEVEL:
				setCertificateLevel((CertificateKind)newValue);
				return;
			case ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__PAYLOAD_ENCRYPTION:
				setPayloadEncryption((PayloadEncryptionKind)newValue);
				return;
			case ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__TIME_FORMAT:
				setTimeFormat((TimeFormatKind)newValue);
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
			case ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__ENCODING:
				setEncoding(ENCODING_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__SECURITY:
				setSecurity(SECURITY_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__COMPRESSION:
				setCompression(COMPRESSION_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__CRYPTO_ALGORITHM:
				setCryptoAlgorithm(CRYPTO_ALGORITHM_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__TOKEN:
				setToken(TOKEN_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__CERTIFICATE_LEVEL:
				setCertificateLevel(CERTIFICATE_LEVEL_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__PAYLOAD_ENCRYPTION:
				setPayloadEncryption(PAYLOAD_ENCRYPTION_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__TIME_FORMAT:
				setTimeFormat(TIME_FORMAT_EDEFAULT);
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
			case ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__ENCODING:
				return encoding != ENCODING_EDEFAULT;
			case ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__SECURITY:
				return security != SECURITY_EDEFAULT;
			case ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__PROTOCOL:
				return protocol != PROTOCOL_EDEFAULT;
			case ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__COMPRESSION:
				return compression != COMPRESSION_EDEFAULT;
			case ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__CRYPTO_ALGORITHM:
				return cryptoAlgorithm != CRYPTO_ALGORITHM_EDEFAULT;
			case ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__TOKEN:
				return token != TOKEN_EDEFAULT;
			case ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__CERTIFICATE_LEVEL:
				return certificateLevel != CERTIFICATE_LEVEL_EDEFAULT;
			case ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__PAYLOAD_ENCRYPTION:
				return payloadEncryption != PAYLOAD_ENCRYPTION_EDEFAULT;
			case ArrowheadSysMLProfilePackage.INTERFACE_DESIGN_DESCRIPTION__TIME_FORMAT:
				return timeFormat != TIME_FORMAT_EDEFAULT;
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
		result.append(" (Encoding: ");
		result.append(encoding);
		result.append(", Security: ");
		result.append(security);
		result.append(", Protocol: ");
		result.append(protocol);
		result.append(", Compression: ");
		result.append(compression);
		result.append(", CryptoAlgorithm: ");
		result.append(cryptoAlgorithm);
		result.append(", Token: ");
		result.append(token);
		result.append(", CertificateLevel: ");
		result.append(certificateLevel);
		result.append(", PayloadEncryption: ");
		result.append(payloadEncryption);
		result.append(", TimeFormat: ");
		result.append(timeFormat);
		result.append(')');
		return result.toString();
	}

} //InterfaceDesignDescriptionImpl
