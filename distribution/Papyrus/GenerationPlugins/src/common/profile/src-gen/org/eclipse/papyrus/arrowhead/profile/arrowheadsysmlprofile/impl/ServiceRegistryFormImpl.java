/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.EncodingKind;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SecurityKind;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Registry Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ServiceRegistryFormImpl#getMetadata4 <em>Metadata4</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ServiceRegistryFormImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ServiceRegistryFormImpl#getProducingSystem <em>Producing System</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ServiceRegistryFormImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ServiceRegistryFormImpl#getEndOfValidity <em>End Of Validity</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ServiceRegistryFormImpl#getServiceURI <em>Service URI</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ServiceRegistryFormImpl#getAuthenticationInfo <em>Authentication Info</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ServiceRegistryFormImpl#getSecure <em>Secure</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ServiceRegistryFormImpl#getCompression <em>Compression</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ServiceRegistryFormImpl#getMetadata1 <em>Metadata1</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ServiceRegistryFormImpl#getMetadata2 <em>Metadata2</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ServiceRegistryFormImpl#getMetadata3 <em>Metadata3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceRegistryFormImpl extends DataSemanticsImpl implements ServiceRegistryForm {
	/**
	 * The default value of the '{@link #getMetadata4() <em>Metadata4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata4()
	 * @generated
	 * @ordered
	 */
	protected static final String METADATA4_EDEFAULT = "key=data";

	/**
	 * The cached value of the '{@link #getMetadata4() <em>Metadata4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata4()
	 * @generated
	 * @ordered
	 */
	protected String metadata4 = METADATA4_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_EDEFAULT = "_servicename._systemname._protocol._transport._domain:port";

	/**
	 * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected String serviceName = SERVICE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProducingSystem() <em>Producing System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducingSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCING_SYSTEM_EDEFAULT = "_systemname._devicename._protocol._transport._domain";

	/**
	 * The cached value of the '{@link #getProducingSystem() <em>Producing System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducingSystem()
	 * @generated
	 * @ordered
	 */
	protected String producingSystem = PRODUCING_SYSTEM_EDEFAULT;

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
	 * The default value of the '{@link #getEndOfValidity() <em>End Of Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndOfValidity()
	 * @generated
	 * @ordered
	 */
	protected static final String END_OF_VALIDITY_EDEFAULT = "TTL=3600s";

	/**
	 * The cached value of the '{@link #getEndOfValidity() <em>End Of Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndOfValidity()
	 * @generated
	 * @ordered
	 */
	protected String endOfValidity = END_OF_VALIDITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceURI() <em>Service URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceURI()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_URI_EDEFAULT = "URI=http://<host>:<port>/service-interface";

	/**
	 * The cached value of the '{@link #getServiceURI() <em>Service URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceURI()
	 * @generated
	 * @ordered
	 */
	protected String serviceURI = SERVICE_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthenticationInfo() <em>Authentication Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHENTICATION_INFO_EDEFAULT = "Certificate_X509";

	/**
	 * The cached value of the '{@link #getAuthenticationInfo() <em>Authentication Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationInfo()
	 * @generated
	 * @ordered
	 */
	protected String authenticationInfo = AUTHENTICATION_INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecure() <em>Secure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecure()
	 * @generated
	 * @ordered
	 */
	protected static final SecurityKind SECURE_EDEFAULT = SecurityKind.CERTIFICATE;

	/**
	 * The cached value of the '{@link #getSecure() <em>Secure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecure()
	 * @generated
	 * @ordered
	 */
	protected SecurityKind secure = SECURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompression() <em>Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompression()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPRESSION_EDEFAULT = "compresion=NON";

	/**
	 * The cached value of the '{@link #getCompression() <em>Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompression()
	 * @generated
	 * @ordered
	 */
	protected String compression = COMPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetadata1() <em>Metadata1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata1()
	 * @generated
	 * @ordered
	 */
	protected static final String METADATA1_EDEFAULT = "key=data";

	/**
	 * The cached value of the '{@link #getMetadata1() <em>Metadata1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata1()
	 * @generated
	 * @ordered
	 */
	protected String metadata1 = METADATA1_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetadata2() <em>Metadata2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata2()
	 * @generated
	 * @ordered
	 */
	protected static final String METADATA2_EDEFAULT = "key=data";

	/**
	 * The cached value of the '{@link #getMetadata2() <em>Metadata2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata2()
	 * @generated
	 * @ordered
	 */
	protected String metadata2 = METADATA2_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetadata3() <em>Metadata3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata3()
	 * @generated
	 * @ordered
	 */
	protected static final String METADATA3_EDEFAULT = "key=data";

	/**
	 * The cached value of the '{@link #getMetadata3() <em>Metadata3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata3()
	 * @generated
	 * @ordered
	 */
	protected String metadata3 = METADATA3_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceRegistryFormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadSysMLProfilePackage.Literals.SERVICE_REGISTRY_FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetadata4() {
		return metadata4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadata4(String newMetadata4) {
		String oldMetadata4 = metadata4;
		metadata4 = newMetadata4;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__METADATA4, oldMetadata4, metadata4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceName(String newServiceName) {
		String oldServiceName = serviceName;
		serviceName = newServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__SERVICE_NAME, oldServiceName, serviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProducingSystem() {
		return producingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProducingSystem(String newProducingSystem) {
		String oldProducingSystem = producingSystem;
		producingSystem = newProducingSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__PRODUCING_SYSTEM, oldProducingSystem, producingSystem));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__ENCODING, oldEncoding, encoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndOfValidity() {
		return endOfValidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndOfValidity(String newEndOfValidity) {
		String oldEndOfValidity = endOfValidity;
		endOfValidity = newEndOfValidity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__END_OF_VALIDITY, oldEndOfValidity, endOfValidity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceURI() {
		return serviceURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceURI(String newServiceURI) {
		String oldServiceURI = serviceURI;
		serviceURI = newServiceURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__SERVICE_URI, oldServiceURI, serviceURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthenticationInfo() {
		return authenticationInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthenticationInfo(String newAuthenticationInfo) {
		String oldAuthenticationInfo = authenticationInfo;
		authenticationInfo = newAuthenticationInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__AUTHENTICATION_INFO, oldAuthenticationInfo, authenticationInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityKind getSecure() {
		return secure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecure(SecurityKind newSecure) {
		SecurityKind oldSecure = secure;
		secure = newSecure == null ? SECURE_EDEFAULT : newSecure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__SECURE, oldSecure, secure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompression() {
		return compression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompression(String newCompression) {
		String oldCompression = compression;
		compression = newCompression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__COMPRESSION, oldCompression, compression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetadata1() {
		return metadata1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadata1(String newMetadata1) {
		String oldMetadata1 = metadata1;
		metadata1 = newMetadata1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__METADATA1, oldMetadata1, metadata1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetadata2() {
		return metadata2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadata2(String newMetadata2) {
		String oldMetadata2 = metadata2;
		metadata2 = newMetadata2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__METADATA2, oldMetadata2, metadata2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetadata3() {
		return metadata3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadata3(String newMetadata3) {
		String oldMetadata3 = metadata3;
		metadata3 = newMetadata3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__METADATA3, oldMetadata3, metadata3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__METADATA4:
				return getMetadata4();
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__SERVICE_NAME:
				return getServiceName();
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__PRODUCING_SYSTEM:
				return getProducingSystem();
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__ENCODING:
				return getEncoding();
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__END_OF_VALIDITY:
				return getEndOfValidity();
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__SERVICE_URI:
				return getServiceURI();
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__AUTHENTICATION_INFO:
				return getAuthenticationInfo();
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__SECURE:
				return getSecure();
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__COMPRESSION:
				return getCompression();
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__METADATA1:
				return getMetadata1();
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__METADATA2:
				return getMetadata2();
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__METADATA3:
				return getMetadata3();
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
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__METADATA4:
				setMetadata4((String)newValue);
				return;
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__PRODUCING_SYSTEM:
				setProducingSystem((String)newValue);
				return;
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__ENCODING:
				setEncoding((EncodingKind)newValue);
				return;
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__END_OF_VALIDITY:
				setEndOfValidity((String)newValue);
				return;
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__SERVICE_URI:
				setServiceURI((String)newValue);
				return;
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__AUTHENTICATION_INFO:
				setAuthenticationInfo((String)newValue);
				return;
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__SECURE:
				setSecure((SecurityKind)newValue);
				return;
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__COMPRESSION:
				setCompression((String)newValue);
				return;
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__METADATA1:
				setMetadata1((String)newValue);
				return;
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__METADATA2:
				setMetadata2((String)newValue);
				return;
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__METADATA3:
				setMetadata3((String)newValue);
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
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__METADATA4:
				setMetadata4(METADATA4_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__PRODUCING_SYSTEM:
				setProducingSystem(PRODUCING_SYSTEM_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__ENCODING:
				setEncoding(ENCODING_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__END_OF_VALIDITY:
				setEndOfValidity(END_OF_VALIDITY_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__SERVICE_URI:
				setServiceURI(SERVICE_URI_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__AUTHENTICATION_INFO:
				setAuthenticationInfo(AUTHENTICATION_INFO_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__SECURE:
				setSecure(SECURE_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__COMPRESSION:
				setCompression(COMPRESSION_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__METADATA1:
				setMetadata1(METADATA1_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__METADATA2:
				setMetadata2(METADATA2_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__METADATA3:
				setMetadata3(METADATA3_EDEFAULT);
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
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__METADATA4:
				return METADATA4_EDEFAULT == null ? metadata4 != null : !METADATA4_EDEFAULT.equals(metadata4);
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__PRODUCING_SYSTEM:
				return PRODUCING_SYSTEM_EDEFAULT == null ? producingSystem != null : !PRODUCING_SYSTEM_EDEFAULT.equals(producingSystem);
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__ENCODING:
				return encoding != ENCODING_EDEFAULT;
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__END_OF_VALIDITY:
				return END_OF_VALIDITY_EDEFAULT == null ? endOfValidity != null : !END_OF_VALIDITY_EDEFAULT.equals(endOfValidity);
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__SERVICE_URI:
				return SERVICE_URI_EDEFAULT == null ? serviceURI != null : !SERVICE_URI_EDEFAULT.equals(serviceURI);
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__AUTHENTICATION_INFO:
				return AUTHENTICATION_INFO_EDEFAULT == null ? authenticationInfo != null : !AUTHENTICATION_INFO_EDEFAULT.equals(authenticationInfo);
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__SECURE:
				return secure != SECURE_EDEFAULT;
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__COMPRESSION:
				return COMPRESSION_EDEFAULT == null ? compression != null : !COMPRESSION_EDEFAULT.equals(compression);
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__METADATA1:
				return METADATA1_EDEFAULT == null ? metadata1 != null : !METADATA1_EDEFAULT.equals(metadata1);
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__METADATA2:
				return METADATA2_EDEFAULT == null ? metadata2 != null : !METADATA2_EDEFAULT.equals(metadata2);
			case ArrowheadSysMLProfilePackage.SERVICE_REGISTRY_FORM__METADATA3:
				return METADATA3_EDEFAULT == null ? metadata3 != null : !METADATA3_EDEFAULT.equals(metadata3);
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
		result.append(" (metadata4: ");
		result.append(metadata4);
		result.append(", ServiceName: ");
		result.append(serviceName);
		result.append(", ProducingSystem: ");
		result.append(producingSystem);
		result.append(", encoding: ");
		result.append(encoding);
		result.append(", endOfValidity: ");
		result.append(endOfValidity);
		result.append(", serviceURI: ");
		result.append(serviceURI);
		result.append(", authenticationInfo: ");
		result.append(authenticationInfo);
		result.append(", secure: ");
		result.append(secure);
		result.append(", compression: ");
		result.append(compression);
		result.append(", metadata1: ");
		result.append(metadata1);
		result.append(", metadata2: ");
		result.append(metadata2);
		result.append(", metadata3: ");
		result.append(metadata3);
		result.append(')');
		return result.toString();
	}

} //ServiceRegistryFormImpl
