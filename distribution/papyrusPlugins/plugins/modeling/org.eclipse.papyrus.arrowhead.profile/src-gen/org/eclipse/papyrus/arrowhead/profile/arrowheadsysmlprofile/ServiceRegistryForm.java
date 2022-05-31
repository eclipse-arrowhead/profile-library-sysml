/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Registry Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getMetadata4 <em>Metadata4</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getProducingSystem <em>Producing System</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getEndOfValidity <em>End Of Validity</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getServiceURI <em>Service URI</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getAuthenticationInfo <em>Authentication Info</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getSecure <em>Secure</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getCompression <em>Compression</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getMetadata1 <em>Metadata1</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getMetadata2 <em>Metadata2</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getMetadata3 <em>Metadata3</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getServiceRegistryForm()
 * @model
 * @generated
 */
public interface ServiceRegistryForm extends DataSemantics {
	/**
	 * Returns the value of the '<em><b>Metadata4</b></em>' attribute.
	 * The default value is <code>"key=data"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata4</em>' attribute.
	 * @see #setMetadata4(String)
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getServiceRegistryForm_Metadata4()
	 * @model default="key=data" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='metadata-4'"
	 * @generated
	 */
	String getMetadata4();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getMetadata4 <em>Metadata4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata4</em>' attribute.
	 * @see #getMetadata4()
	 * @generated
	 */
	void setMetadata4(String value);

	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * The default value is <code>"_servicename._systemname._protocol._transport._domain:port"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getServiceRegistryForm_ServiceName()
	 * @model default="_servicename._systemname._protocol._transport._domain:port" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Producing System</b></em>' attribute.
	 * The default value is <code>"_systemname._devicename._protocol._transport._domain"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Producing System</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Producing System</em>' attribute.
	 * @see #setProducingSystem(String)
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getServiceRegistryForm_ProducingSystem()
	 * @model default="_systemname._devicename._protocol._transport._domain" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getProducingSystem();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getProducingSystem <em>Producing System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Producing System</em>' attribute.
	 * @see #getProducingSystem()
	 * @generated
	 */
	void setProducingSystem(String value);

	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute.
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
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getServiceRegistryForm_Encoding()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EncodingKind getEncoding();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.EncodingKind
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(EncodingKind value);

	/**
	 * Returns the value of the '<em><b>End Of Validity</b></em>' attribute.
	 * The default value is <code>"TTL=3600s"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Of Validity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Of Validity</em>' attribute.
	 * @see #setEndOfValidity(String)
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getServiceRegistryForm_EndOfValidity()
	 * @model default="TTL=3600s" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getEndOfValidity();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getEndOfValidity <em>End Of Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Of Validity</em>' attribute.
	 * @see #getEndOfValidity()
	 * @generated
	 */
	void setEndOfValidity(String value);

	/**
	 * Returns the value of the '<em><b>Service URI</b></em>' attribute.
	 * The default value is <code>"URI=http://<host>:<port>/service-interface"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service URI</em>' attribute.
	 * @see #setServiceURI(String)
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getServiceRegistryForm_ServiceURI()
	 * @model default="URI=http://&lt;host&gt;:&lt;port&gt;/service-interface" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getServiceURI();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getServiceURI <em>Service URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service URI</em>' attribute.
	 * @see #getServiceURI()
	 * @generated
	 */
	void setServiceURI(String value);

	/**
	 * Returns the value of the '<em><b>Authentication Info</b></em>' attribute.
	 * The default value is <code>"Certificate_X509"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authentication Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication Info</em>' attribute.
	 * @see #setAuthenticationInfo(String)
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getServiceRegistryForm_AuthenticationInfo()
	 * @model default="Certificate_X509" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getAuthenticationInfo();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getAuthenticationInfo <em>Authentication Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication Info</em>' attribute.
	 * @see #getAuthenticationInfo()
	 * @generated
	 */
	void setAuthenticationInfo(String value);

	/**
	 * Returns the value of the '<em><b>Secure</b></em>' attribute.
	 * The default value is <code>"CERTIFICATE"</code>.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SecurityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secure</em>' attribute.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SecurityKind
	 * @see #setSecure(SecurityKind)
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getServiceRegistryForm_Secure()
	 * @model default="CERTIFICATE" required="true" ordered="false"
	 * @generated
	 */
	SecurityKind getSecure();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getSecure <em>Secure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secure</em>' attribute.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SecurityKind
	 * @see #getSecure()
	 * @generated
	 */
	void setSecure(SecurityKind value);

	/**
	 * Returns the value of the '<em><b>Compression</b></em>' attribute.
	 * The default value is <code>"compresion=NON"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compression</em>' attribute.
	 * @see #setCompression(String)
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getServiceRegistryForm_Compression()
	 * @model default="compresion=NON" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCompression();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getCompression <em>Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compression</em>' attribute.
	 * @see #getCompression()
	 * @generated
	 */
	void setCompression(String value);

	/**
	 * Returns the value of the '<em><b>Metadata1</b></em>' attribute.
	 * The default value is <code>"key=data"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata1</em>' attribute.
	 * @see #setMetadata1(String)
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getServiceRegistryForm_Metadata1()
	 * @model default="key=data" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='metadata-1'"
	 * @generated
	 */
	String getMetadata1();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getMetadata1 <em>Metadata1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata1</em>' attribute.
	 * @see #getMetadata1()
	 * @generated
	 */
	void setMetadata1(String value);

	/**
	 * Returns the value of the '<em><b>Metadata2</b></em>' attribute.
	 * The default value is <code>"key=data"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata2</em>' attribute.
	 * @see #setMetadata2(String)
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getServiceRegistryForm_Metadata2()
	 * @model default="key=data" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='metadata-2'"
	 * @generated
	 */
	String getMetadata2();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getMetadata2 <em>Metadata2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata2</em>' attribute.
	 * @see #getMetadata2()
	 * @generated
	 */
	void setMetadata2(String value);

	/**
	 * Returns the value of the '<em><b>Metadata3</b></em>' attribute.
	 * The default value is <code>"key=data"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata3</em>' attribute.
	 * @see #setMetadata3(String)
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getServiceRegistryForm_Metadata3()
	 * @model default="key=data" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='metadata-3'"
	 * @generated
	 */
	String getMetadata3();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getMetadata3 <em>Metadata3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata3</em>' attribute.
	 * @see #getMetadata3()
	 * @generated
	 */
	void setMetadata3(String value);

} // ServiceRegistryForm
