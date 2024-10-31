/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRegistryForm;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Registry Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceRegistryFormImpl#getHostDevice <em>Host Device</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceRegistryFormImpl#getAuthenticationInfo <em>Authentication Info</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceRegistryFormImpl#getEndOfValidity <em>End Of Validity</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceRegistryFormImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceRegistryFormImpl#getDeployTime <em>Deploy Time</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceRegistryFormImpl#getMetadata1 <em>Metadata1</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceRegistryFormImpl#getMetadata2 <em>Metadata2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceRegistryFormImpl extends DataSemanticsImpl implements DeviceRegistryForm {
	/**
	 * The default value of the '{@link #getHostDevice() <em>Host Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostDevice()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_DEVICE_EDEFAULT = "_devicename._localcloudname._interface._mac-protocl._macaddress";

	/**
	 * The cached value of the '{@link #getHostDevice() <em>Host Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostDevice()
	 * @generated
	 * @ordered
	 */
	protected String hostDevice = HOST_DEVICE_EDEFAULT;

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
	 * The default value of the '{@link #getEndOfValidity() <em>End Of Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndOfValidity()
	 * @generated
	 * @ordered
	 */
	protected static final String END_OF_VALIDITY_EDEFAULT = "TTL= 2 month";

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
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = "version=data";

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeployTime() <em>Deploy Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployTime()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPLOY_TIME_EDEFAULT = "DeployTime=data";

	/**
	 * The cached value of the '{@link #getDeployTime() <em>Deploy Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployTime()
	 * @generated
	 * @ordered
	 */
	protected String deployTime = DEPLOY_TIME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceRegistryFormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadSysMLProfilePackage.Literals.DEVICE_REGISTRY_FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHostDevice() {
		return hostDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostDevice(String newHostDevice) {
		String oldHostDevice = hostDevice;
		hostDevice = newHostDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.DEVICE_REGISTRY_FORM__HOST_DEVICE, oldHostDevice, hostDevice));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.DEVICE_REGISTRY_FORM__AUTHENTICATION_INFO, oldAuthenticationInfo, authenticationInfo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.DEVICE_REGISTRY_FORM__END_OF_VALIDITY, oldEndOfValidity, endOfValidity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.DEVICE_REGISTRY_FORM__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeployTime() {
		return deployTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeployTime(String newDeployTime) {
		String oldDeployTime = deployTime;
		deployTime = newDeployTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.DEVICE_REGISTRY_FORM__DEPLOY_TIME, oldDeployTime, deployTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.DEVICE_REGISTRY_FORM__METADATA1, oldMetadata1, metadata1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.DEVICE_REGISTRY_FORM__METADATA2, oldMetadata2, metadata2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.DEVICE_REGISTRY_FORM__HOST_DEVICE:
				return getHostDevice();
			case ArrowheadSysMLProfilePackage.DEVICE_REGISTRY_FORM__AUTHENTICATION_INFO:
				return getAuthenticationInfo();
			case ArrowheadSysMLProfilePackage.DEVICE_REGISTRY_FORM__END_OF_VALIDITY:
				return getEndOfValidity();
			case ArrowheadSysMLProfilePackage.DEVICE_REGISTRY_FORM__VERSION:
				return getVersion();
			case ArrowheadSysMLProfilePackage.DEVICE_REGISTRY_FORM__DEPLOY_TIME:
				return getDeployTime();
			case ArrowheadSysMLProfilePackage.DEVICE_REGISTRY_FORM__METADATA1:
				return getMetadata1();
			case ArrowheadSysMLProfilePackage.DEVICE_REGISTRY_FORM__METADATA2:
				return getMetadata2();
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
			case ArrowheadSysMLProfilePackage.DEVICE_REGISTRY_FORM__HOST_DEVICE:
				setHostDevice((String)newValue);
				return;
			case ArrowheadSysMLProfilePackage.DEVICE_REGISTRY_FORM__AUTHENTICATION_INFO:
				setAuthenticationInfo((String)newValue);
				return;
			case ArrowheadSysMLProfilePackage.DEVICE_REGISTRY_FORM__END_OF_VALIDITY:
				setEndOfValidity((String)newValue);
				return;
			case ArrowheadSysMLProfilePackage.DEVICE_REGISTRY_FORM__VERSION:
				setVersion((String)newValue);
				return;
			case ArrowheadSysMLProfilePackage.DEVICE_REGISTRY_FORM__DEPLOY_TIME:
				setDeployTime((String)newValue);
				return;
			case ArrowheadSysMLProfilePackage.DEVICE_REGISTRY_FORM__METADATA1:
				setMetadata1((String)newValue);
				return;
			case ArrowheadSysMLProfilePackage.DEVICE_REGISTRY_FORM__METADATA2:
				setMetadata2((String)newValue);
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
			case ArrowheadSysMLProfilePackage.DEVICE_REGISTRY_FORM__HOST_DEVICE:
				setHostDevice(HOST_DEVICE_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.DEVICE_REGISTRY_FORM__AUTHENTICATION_INFO:
				setAuthenticationInfo(AUTHENTICATION_INFO_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.DEVICE_REGISTRY_FORM__END_OF_VALIDITY:
				setEndOfValidity(END_OF_VALIDITY_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.DEVICE_REGISTRY_FORM__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.DEVICE_REGISTRY_FORM__DEPLOY_TIME:
				setDeployTime(DEPLOY_TIME_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.DEVICE_REGISTRY_FORM__METADATA1:
				setMetadata1(METADATA1_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.DEVICE_REGISTRY_FORM__METADATA2:
				setMetadata2(METADATA2_EDEFAULT);
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
			case ArrowheadSysMLProfilePackage.DEVICE_REGISTRY_FORM__HOST_DEVICE:
				return HOST_DEVICE_EDEFAULT == null ? hostDevice != null : !HOST_DEVICE_EDEFAULT.equals(hostDevice);
			case ArrowheadSysMLProfilePackage.DEVICE_REGISTRY_FORM__AUTHENTICATION_INFO:
				return AUTHENTICATION_INFO_EDEFAULT == null ? authenticationInfo != null : !AUTHENTICATION_INFO_EDEFAULT.equals(authenticationInfo);
			case ArrowheadSysMLProfilePackage.DEVICE_REGISTRY_FORM__END_OF_VALIDITY:
				return END_OF_VALIDITY_EDEFAULT == null ? endOfValidity != null : !END_OF_VALIDITY_EDEFAULT.equals(endOfValidity);
			case ArrowheadSysMLProfilePackage.DEVICE_REGISTRY_FORM__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case ArrowheadSysMLProfilePackage.DEVICE_REGISTRY_FORM__DEPLOY_TIME:
				return DEPLOY_TIME_EDEFAULT == null ? deployTime != null : !DEPLOY_TIME_EDEFAULT.equals(deployTime);
			case ArrowheadSysMLProfilePackage.DEVICE_REGISTRY_FORM__METADATA1:
				return METADATA1_EDEFAULT == null ? metadata1 != null : !METADATA1_EDEFAULT.equals(metadata1);
			case ArrowheadSysMLProfilePackage.DEVICE_REGISTRY_FORM__METADATA2:
				return METADATA2_EDEFAULT == null ? metadata2 != null : !METADATA2_EDEFAULT.equals(metadata2);
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
		result.append(" (HostDevice: ");
		result.append(hostDevice);
		result.append(", authenticationInfo: ");
		result.append(authenticationInfo);
		result.append(", endOfValidity: ");
		result.append(endOfValidity);
		result.append(", version: ");
		result.append(version);
		result.append(", deployTime: ");
		result.append(deployTime);
		result.append(", metadata1: ");
		result.append(metadata1);
		result.append(", metadata2: ");
		result.append(metadata2);
		result.append(')');
		return result.toString();
	}

} //DeviceRegistryFormImpl
