/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Registry Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRegistryForm#getHostDevice <em>Host Device</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRegistryForm#getAuthenticationInfo <em>Authentication Info</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRegistryForm#getEndOfValidity <em>End Of Validity</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRegistryForm#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRegistryForm#getDeployTime <em>Deploy Time</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRegistryForm#getMetadata1 <em>Metadata1</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRegistryForm#getMetadata2 <em>Metadata2</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getDeviceRegistryForm()
 * @model
 * @generated
 */
public interface DeviceRegistryForm extends DataSemantics {
	/**
	 * Returns the value of the '<em><b>Host Device</b></em>' attribute.
	 * The default value is <code>"_devicename._localcloudname._interface._mac-protocl._macaddress"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Device</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Device</em>' attribute.
	 * @see #setHostDevice(String)
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getDeviceRegistryForm_HostDevice()
	 * @model default="_devicename._localcloudname._interface._mac-protocl._macaddress" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getHostDevice();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRegistryForm#getHostDevice <em>Host Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Device</em>' attribute.
	 * @see #getHostDevice()
	 * @generated
	 */
	void setHostDevice(String value);

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
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getDeviceRegistryForm_AuthenticationInfo()
	 * @model default="Certificate_X509" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getAuthenticationInfo();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRegistryForm#getAuthenticationInfo <em>Authentication Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication Info</em>' attribute.
	 * @see #getAuthenticationInfo()
	 * @generated
	 */
	void setAuthenticationInfo(String value);

	/**
	 * Returns the value of the '<em><b>End Of Validity</b></em>' attribute.
	 * The default value is <code>"TTL= 2 month"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Of Validity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Of Validity</em>' attribute.
	 * @see #setEndOfValidity(String)
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getDeviceRegistryForm_EndOfValidity()
	 * @model default="TTL= 2 month" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getEndOfValidity();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRegistryForm#getEndOfValidity <em>End Of Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Of Validity</em>' attribute.
	 * @see #getEndOfValidity()
	 * @generated
	 */
	void setEndOfValidity(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"version=data"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getDeviceRegistryForm_Version()
	 * @model default="version=data" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRegistryForm#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Deploy Time</b></em>' attribute.
	 * The default value is <code>"DeployTime=data"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deploy Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deploy Time</em>' attribute.
	 * @see #setDeployTime(String)
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getDeviceRegistryForm_DeployTime()
	 * @model default="DeployTime=data" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDeployTime();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRegistryForm#getDeployTime <em>Deploy Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deploy Time</em>' attribute.
	 * @see #getDeployTime()
	 * @generated
	 */
	void setDeployTime(String value);

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
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getDeviceRegistryForm_Metadata1()
	 * @model default="key=data" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='metadata-1'"
	 * @generated
	 */
	String getMetadata1();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRegistryForm#getMetadata1 <em>Metadata1</em>}' attribute.
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
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getDeviceRegistryForm_Metadata2()
	 * @model default="key=data" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='metadata-2'"
	 * @generated
	 */
	String getMetadata2();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRegistryForm#getMetadata2 <em>Metadata2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata2</em>' attribute.
	 * @see #getMetadata2()
	 * @generated
	 */
	void setMetadata2(String value);

} // DeviceRegistryForm
