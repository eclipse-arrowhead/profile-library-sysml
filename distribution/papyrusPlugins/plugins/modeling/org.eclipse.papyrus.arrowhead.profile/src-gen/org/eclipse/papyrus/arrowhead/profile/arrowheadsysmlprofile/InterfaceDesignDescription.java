/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Design Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription#getCompression <em>Compression</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription#getCryptoAlgorithm <em>Crypto Algorithm</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription#getToken <em>Token</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription#getCertificateLevel <em>Certificate Level</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription#getPayloadEncryption <em>Payload Encryption</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription#getTimeFormat <em>Time Format</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getInterfaceDesignDescription()
 * @model
 * @generated
 */
public interface InterfaceDesignDescription extends ServiceDescription {
	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute.
	 * The default value is <code>"JSON"</code>.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.EncodingKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encoding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoding</em>' attribute.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.EncodingKind
	 * @see #setEncoding(EncodingKind)
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getInterfaceDesignDescription_Encoding()
	 * @model default="JSON" required="true" ordered="false"
	 * @generated
	 */
	EncodingKind getEncoding();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.EncodingKind
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(EncodingKind value);

	/**
	 * Returns the value of the '<em><b>Security</b></em>' attribute.
	 * The default value is <code>"CERTIFICATE"</code>.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SecurityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' attribute.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SecurityKind
	 * @see #setSecurity(SecurityKind)
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getInterfaceDesignDescription_Security()
	 * @model default="CERTIFICATE" required="true" ordered="false"
	 * @generated
	 */
	SecurityKind getSecurity();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription#getSecurity <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security</em>' attribute.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SecurityKind
	 * @see #getSecurity()
	 * @generated
	 */
	void setSecurity(SecurityKind value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * The default value is <code>"HTTP_1_1"</code>.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ProtocolKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ProtocolKind
	 * @see #setProtocol(ProtocolKind)
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getInterfaceDesignDescription_Protocol()
	 * @model default="HTTP_1_1" required="true" ordered="false"
	 * @generated
	 */
	ProtocolKind getProtocol();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ProtocolKind
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(ProtocolKind value);

	/**
	 * Returns the value of the '<em><b>Compression</b></em>' attribute.
	 * The default value is <code>"NONE"</code>.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CompresionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compression</em>' attribute.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CompresionKind
	 * @see #setCompression(CompresionKind)
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getInterfaceDesignDescription_Compression()
	 * @model default="NONE" required="true" ordered="false"
	 * @generated
	 */
	CompresionKind getCompression();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription#getCompression <em>Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compression</em>' attribute.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CompresionKind
	 * @see #getCompression()
	 * @generated
	 */
	void setCompression(CompresionKind value);

	/**
	 * Returns the value of the '<em><b>Crypto Algorithm</b></em>' attribute.
	 * The default value is <code>"RSA"</code>.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CryptoAlgorithmKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crypto Algorithm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crypto Algorithm</em>' attribute.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CryptoAlgorithmKind
	 * @see #setCryptoAlgorithm(CryptoAlgorithmKind)
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getInterfaceDesignDescription_CryptoAlgorithm()
	 * @model default="RSA" required="true" ordered="false"
	 * @generated
	 */
	CryptoAlgorithmKind getCryptoAlgorithm();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription#getCryptoAlgorithm <em>Crypto Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crypto Algorithm</em>' attribute.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CryptoAlgorithmKind
	 * @see #getCryptoAlgorithm()
	 * @generated
	 */
	void setCryptoAlgorithm(CryptoAlgorithmKind value);

	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * The default value is <code>"ArrowheadToken"</code>.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.TokenKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.TokenKind
	 * @see #setToken(TokenKind)
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getInterfaceDesignDescription_Token()
	 * @model default="ArrowheadToken" required="true" ordered="false"
	 * @generated
	 */
	TokenKind getToken();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' attribute.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.TokenKind
	 * @see #getToken()
	 * @generated
	 */
	void setToken(TokenKind value);

	/**
	 * Returns the value of the '<em><b>Certificate Level</b></em>' attribute.
	 * The default value is <code>"ApplicationService"</code>.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CertificateKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Certificate Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certificate Level</em>' attribute.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CertificateKind
	 * @see #setCertificateLevel(CertificateKind)
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getInterfaceDesignDescription_CertificateLevel()
	 * @model default="ApplicationService" required="true" ordered="false"
	 * @generated
	 */
	CertificateKind getCertificateLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription#getCertificateLevel <em>Certificate Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate Level</em>' attribute.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CertificateKind
	 * @see #getCertificateLevel()
	 * @generated
	 */
	void setCertificateLevel(CertificateKind value);

	/**
	 * Returns the value of the '<em><b>Payload Encryption</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.PayloadEncryptionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payload Encryption</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payload Encryption</em>' attribute.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.PayloadEncryptionKind
	 * @see #setPayloadEncryption(PayloadEncryptionKind)
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getInterfaceDesignDescription_PayloadEncryption()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PayloadEncryptionKind getPayloadEncryption();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription#getPayloadEncryption <em>Payload Encryption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payload Encryption</em>' attribute.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.PayloadEncryptionKind
	 * @see #getPayloadEncryption()
	 * @generated
	 */
	void setPayloadEncryption(PayloadEncryptionKind value);

	/**
	 * Returns the value of the '<em><b>Time Format</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.TimeFormatKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Format</em>' attribute.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.TimeFormatKind
	 * @see #setTimeFormat(TimeFormatKind)
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getInterfaceDesignDescription_TimeFormat()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TimeFormatKind getTimeFormat();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription#getTimeFormat <em>Time Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Format</em>' attribute.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.TimeFormatKind
	 * @see #getTimeFormat()
	 * @generated
	 */
	void setTimeFormat(TimeFormatKind value);

} // InterfaceDesignDescription
