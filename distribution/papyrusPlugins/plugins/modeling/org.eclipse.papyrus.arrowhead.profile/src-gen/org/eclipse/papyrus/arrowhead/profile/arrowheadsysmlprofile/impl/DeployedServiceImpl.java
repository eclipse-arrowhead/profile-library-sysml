/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedService;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.MetaDataEntry;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployed Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeployedServiceImpl#getDeployedServiceName <em>Deployed Service Name</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeployedServiceImpl#getURL <em>URL</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeployedServiceImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeployedServiceImpl#getCertificate <em>Certificate</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeployedServiceImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeployedServiceImpl#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeployedServiceImpl extends MinimalEObjectImpl.Container implements DeployedService {
	/**
	 * The default value of the '{@link #getDeployedServiceName() <em>Deployed Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPLOYED_SERVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeployedServiceName() <em>Deployed Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedServiceName()
	 * @generated
	 * @ordered
	 */
	protected String deployedServiceName = DEPLOYED_SERVICE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getURL() <em>URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURL()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getURL() <em>URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURL()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCertificate() <em>Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificate()
	 * @generated
	 * @ordered
	 */
	protected static final String CERTIFICATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCertificate() <em>Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificate()
	 * @generated
	 * @ordered
	 */
	protected String certificate = CERTIFICATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected EList<MetaDataEntry> metadata;

	/**
	 * The cached value of the '{@link #getBase_Property() <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Property()
	 * @generated
	 * @ordered
	 */
	protected Property base_Property;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeployedServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadSysMLProfilePackage.Literals.DEPLOYED_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeployedServiceName() {
		return deployedServiceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeployedServiceName(String newDeployedServiceName) {
		String oldDeployedServiceName = deployedServiceName;
		deployedServiceName = newDeployedServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.DEPLOYED_SERVICE__DEPLOYED_SERVICE_NAME, oldDeployedServiceName, deployedServiceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getURL() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setURL(String newURL) {
		String oldURL = url;
		url = newURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.DEPLOYED_SERVICE__URL, oldURL, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.DEPLOYED_SERVICE__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCertificate() {
		return certificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCertificate(String newCertificate) {
		String oldCertificate = certificate;
		certificate = newCertificate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.DEPLOYED_SERVICE__CERTIFICATE, oldCertificate, certificate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetaDataEntry> getMetadata() {
		if (metadata == null) {
			metadata = new EObjectResolvingEList<MetaDataEntry>(MetaDataEntry.class, this, ArrowheadSysMLProfilePackage.DEPLOYED_SERVICE__METADATA);
		}
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getBase_Property() {
		if (base_Property != null && base_Property.eIsProxy()) {
			InternalEObject oldBase_Property = (InternalEObject)base_Property;
			base_Property = (Property)eResolveProxy(oldBase_Property);
			if (base_Property != oldBase_Property) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArrowheadSysMLProfilePackage.DEPLOYED_SERVICE__BASE_PROPERTY, oldBase_Property, base_Property));
			}
		}
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetBase_Property() {
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Property(Property newBase_Property) {
		Property oldBase_Property = base_Property;
		base_Property = newBase_Property;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.DEPLOYED_SERVICE__BASE_PROPERTY, oldBase_Property, base_Property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.DEPLOYED_SERVICE__DEPLOYED_SERVICE_NAME:
				return getDeployedServiceName();
			case ArrowheadSysMLProfilePackage.DEPLOYED_SERVICE__URL:
				return getURL();
			case ArrowheadSysMLProfilePackage.DEPLOYED_SERVICE__PORT:
				return getPort();
			case ArrowheadSysMLProfilePackage.DEPLOYED_SERVICE__CERTIFICATE:
				return getCertificate();
			case ArrowheadSysMLProfilePackage.DEPLOYED_SERVICE__METADATA:
				return getMetadata();
			case ArrowheadSysMLProfilePackage.DEPLOYED_SERVICE__BASE_PROPERTY:
				if (resolve) return getBase_Property();
				return basicGetBase_Property();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.DEPLOYED_SERVICE__DEPLOYED_SERVICE_NAME:
				setDeployedServiceName((String)newValue);
				return;
			case ArrowheadSysMLProfilePackage.DEPLOYED_SERVICE__URL:
				setURL((String)newValue);
				return;
			case ArrowheadSysMLProfilePackage.DEPLOYED_SERVICE__PORT:
				setPort((Integer)newValue);
				return;
			case ArrowheadSysMLProfilePackage.DEPLOYED_SERVICE__CERTIFICATE:
				setCertificate((String)newValue);
				return;
			case ArrowheadSysMLProfilePackage.DEPLOYED_SERVICE__METADATA:
				getMetadata().clear();
				getMetadata().addAll((Collection<? extends MetaDataEntry>)newValue);
				return;
			case ArrowheadSysMLProfilePackage.DEPLOYED_SERVICE__BASE_PROPERTY:
				setBase_Property((Property)newValue);
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
			case ArrowheadSysMLProfilePackage.DEPLOYED_SERVICE__DEPLOYED_SERVICE_NAME:
				setDeployedServiceName(DEPLOYED_SERVICE_NAME_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.DEPLOYED_SERVICE__URL:
				setURL(URL_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.DEPLOYED_SERVICE__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.DEPLOYED_SERVICE__CERTIFICATE:
				setCertificate(CERTIFICATE_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.DEPLOYED_SERVICE__METADATA:
				getMetadata().clear();
				return;
			case ArrowheadSysMLProfilePackage.DEPLOYED_SERVICE__BASE_PROPERTY:
				setBase_Property((Property)null);
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
			case ArrowheadSysMLProfilePackage.DEPLOYED_SERVICE__DEPLOYED_SERVICE_NAME:
				return DEPLOYED_SERVICE_NAME_EDEFAULT == null ? deployedServiceName != null : !DEPLOYED_SERVICE_NAME_EDEFAULT.equals(deployedServiceName);
			case ArrowheadSysMLProfilePackage.DEPLOYED_SERVICE__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case ArrowheadSysMLProfilePackage.DEPLOYED_SERVICE__PORT:
				return port != PORT_EDEFAULT;
			case ArrowheadSysMLProfilePackage.DEPLOYED_SERVICE__CERTIFICATE:
				return CERTIFICATE_EDEFAULT == null ? certificate != null : !CERTIFICATE_EDEFAULT.equals(certificate);
			case ArrowheadSysMLProfilePackage.DEPLOYED_SERVICE__METADATA:
				return metadata != null && !metadata.isEmpty();
			case ArrowheadSysMLProfilePackage.DEPLOYED_SERVICE__BASE_PROPERTY:
				return base_Property != null;
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
		result.append(" (DeployedServiceName: ");
		result.append(deployedServiceName);
		result.append(", URL: ");
		result.append(url);
		result.append(", port: ");
		result.append(port);
		result.append(", Certificate: ");
		result.append(certificate);
		result.append(')');
		return result.toString();
	}

} //DeployedServiceImpl
