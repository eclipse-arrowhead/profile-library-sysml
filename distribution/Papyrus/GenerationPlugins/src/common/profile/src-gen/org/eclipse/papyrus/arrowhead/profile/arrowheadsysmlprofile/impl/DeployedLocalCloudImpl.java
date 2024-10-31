/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedLocalCloud;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployed Local Cloud</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeployedLocalCloudImpl#getGatekeeperSystemName <em>Gatekeeper System Name</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeployedLocalCloudImpl#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeployedLocalCloudImpl extends MinimalEObjectImpl.Container implements DeployedLocalCloud {
	/**
	 * The default value of the '{@link #getGatekeeperSystemName() <em>Gatekeeper System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatekeeperSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String GATEKEEPER_SYSTEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGatekeeperSystemName() <em>Gatekeeper System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatekeeperSystemName()
	 * @generated
	 * @ordered
	 */
	protected String gatekeeperSystemName = GATEKEEPER_SYSTEM_NAME_EDEFAULT;

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
	protected DeployedLocalCloudImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadSysMLProfilePackage.Literals.DEPLOYED_LOCAL_CLOUD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGatekeeperSystemName() {
		return gatekeeperSystemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGatekeeperSystemName(String newGatekeeperSystemName) {
		String oldGatekeeperSystemName = gatekeeperSystemName;
		gatekeeperSystemName = newGatekeeperSystemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.DEPLOYED_LOCAL_CLOUD__GATEKEEPER_SYSTEM_NAME, oldGatekeeperSystemName, gatekeeperSystemName));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArrowheadSysMLProfilePackage.DEPLOYED_LOCAL_CLOUD__BASE_PROPERTY, oldBase_Property, base_Property));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.DEPLOYED_LOCAL_CLOUD__BASE_PROPERTY, oldBase_Property, base_Property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.DEPLOYED_LOCAL_CLOUD__GATEKEEPER_SYSTEM_NAME:
				return getGatekeeperSystemName();
			case ArrowheadSysMLProfilePackage.DEPLOYED_LOCAL_CLOUD__BASE_PROPERTY:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.DEPLOYED_LOCAL_CLOUD__GATEKEEPER_SYSTEM_NAME:
				setGatekeeperSystemName((String)newValue);
				return;
			case ArrowheadSysMLProfilePackage.DEPLOYED_LOCAL_CLOUD__BASE_PROPERTY:
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
			case ArrowheadSysMLProfilePackage.DEPLOYED_LOCAL_CLOUD__GATEKEEPER_SYSTEM_NAME:
				setGatekeeperSystemName(GATEKEEPER_SYSTEM_NAME_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.DEPLOYED_LOCAL_CLOUD__BASE_PROPERTY:
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
			case ArrowheadSysMLProfilePackage.DEPLOYED_LOCAL_CLOUD__GATEKEEPER_SYSTEM_NAME:
				return GATEKEEPER_SYSTEM_NAME_EDEFAULT == null ? gatekeeperSystemName != null : !GATEKEEPER_SYSTEM_NAME_EDEFAULT.equals(gatekeeperSystemName);
			case ArrowheadSysMLProfilePackage.DEPLOYED_LOCAL_CLOUD__BASE_PROPERTY:
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
		result.append(" (GatekeeperSystemName: ");
		result.append(gatekeeperSystemName);
		result.append(')');
		return result.toString();
	}

} //DeployedLocalCloudImpl
