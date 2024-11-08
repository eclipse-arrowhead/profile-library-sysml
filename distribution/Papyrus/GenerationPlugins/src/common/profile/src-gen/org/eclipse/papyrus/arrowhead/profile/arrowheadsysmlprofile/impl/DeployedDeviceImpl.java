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
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedDevice;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.MetaDataEntry;

import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployed Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeployedDeviceImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeployedDeviceImpl#getMacAddress <em>Mac Address</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeployedDeviceImpl#getNetworkInterface <em>Network Interface</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeployedDeviceImpl#getMacProtocol <em>Mac Protocol</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeployedDeviceImpl#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeployedDeviceImpl extends MinimalEObjectImpl.Container implements DeployedDevice {
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
	 * The default value of the '{@link #getMacAddress() <em>Mac Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMacAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String MAC_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMacAddress() <em>Mac Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMacAddress()
	 * @generated
	 * @ordered
	 */
	protected String macAddress = MAC_ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNetworkInterface() <em>Network Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkInterface()
	 * @generated
	 * @ordered
	 */
	protected InterfaceRealization networkInterface;

	/**
	 * The default value of the '{@link #getMacProtocol() <em>Mac Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMacProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String MAC_PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMacProtocol() <em>Mac Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMacProtocol()
	 * @generated
	 * @ordered
	 */
	protected String macProtocol = MAC_PROTOCOL_EDEFAULT;

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
	protected DeployedDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadSysMLProfilePackage.Literals.DEPLOYED_DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetaDataEntry> getMetadata() {
		if (metadata == null) {
			metadata = new EObjectResolvingEList<MetaDataEntry>(MetaDataEntry.class, this, ArrowheadSysMLProfilePackage.DEPLOYED_DEVICE__METADATA);
		}
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMacAddress() {
		return macAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMacAddress(String newMacAddress) {
		String oldMacAddress = macAddress;
		macAddress = newMacAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.DEPLOYED_DEVICE__MAC_ADDRESS, oldMacAddress, macAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRealization getNetworkInterface() {
		if (networkInterface != null && networkInterface.eIsProxy()) {
			InternalEObject oldNetworkInterface = (InternalEObject)networkInterface;
			networkInterface = (InterfaceRealization)eResolveProxy(oldNetworkInterface);
			if (networkInterface != oldNetworkInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArrowheadSysMLProfilePackage.DEPLOYED_DEVICE__NETWORK_INTERFACE, oldNetworkInterface, networkInterface));
			}
		}
		return networkInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRealization basicGetNetworkInterface() {
		return networkInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkInterface(InterfaceRealization newNetworkInterface) {
		InterfaceRealization oldNetworkInterface = networkInterface;
		networkInterface = newNetworkInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.DEPLOYED_DEVICE__NETWORK_INTERFACE, oldNetworkInterface, networkInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMacProtocol() {
		return macProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMacProtocol(String newMacProtocol) {
		String oldMacProtocol = macProtocol;
		macProtocol = newMacProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.DEPLOYED_DEVICE__MAC_PROTOCOL, oldMacProtocol, macProtocol));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArrowheadSysMLProfilePackage.DEPLOYED_DEVICE__BASE_PROPERTY, oldBase_Property, base_Property));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.DEPLOYED_DEVICE__BASE_PROPERTY, oldBase_Property, base_Property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.DEPLOYED_DEVICE__METADATA:
				return getMetadata();
			case ArrowheadSysMLProfilePackage.DEPLOYED_DEVICE__MAC_ADDRESS:
				return getMacAddress();
			case ArrowheadSysMLProfilePackage.DEPLOYED_DEVICE__NETWORK_INTERFACE:
				if (resolve) return getNetworkInterface();
				return basicGetNetworkInterface();
			case ArrowheadSysMLProfilePackage.DEPLOYED_DEVICE__MAC_PROTOCOL:
				return getMacProtocol();
			case ArrowheadSysMLProfilePackage.DEPLOYED_DEVICE__BASE_PROPERTY:
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
			case ArrowheadSysMLProfilePackage.DEPLOYED_DEVICE__METADATA:
				getMetadata().clear();
				getMetadata().addAll((Collection<? extends MetaDataEntry>)newValue);
				return;
			case ArrowheadSysMLProfilePackage.DEPLOYED_DEVICE__MAC_ADDRESS:
				setMacAddress((String)newValue);
				return;
			case ArrowheadSysMLProfilePackage.DEPLOYED_DEVICE__NETWORK_INTERFACE:
				setNetworkInterface((InterfaceRealization)newValue);
				return;
			case ArrowheadSysMLProfilePackage.DEPLOYED_DEVICE__MAC_PROTOCOL:
				setMacProtocol((String)newValue);
				return;
			case ArrowheadSysMLProfilePackage.DEPLOYED_DEVICE__BASE_PROPERTY:
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
			case ArrowheadSysMLProfilePackage.DEPLOYED_DEVICE__METADATA:
				getMetadata().clear();
				return;
			case ArrowheadSysMLProfilePackage.DEPLOYED_DEVICE__MAC_ADDRESS:
				setMacAddress(MAC_ADDRESS_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.DEPLOYED_DEVICE__NETWORK_INTERFACE:
				setNetworkInterface((InterfaceRealization)null);
				return;
			case ArrowheadSysMLProfilePackage.DEPLOYED_DEVICE__MAC_PROTOCOL:
				setMacProtocol(MAC_PROTOCOL_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.DEPLOYED_DEVICE__BASE_PROPERTY:
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
			case ArrowheadSysMLProfilePackage.DEPLOYED_DEVICE__METADATA:
				return metadata != null && !metadata.isEmpty();
			case ArrowheadSysMLProfilePackage.DEPLOYED_DEVICE__MAC_ADDRESS:
				return MAC_ADDRESS_EDEFAULT == null ? macAddress != null : !MAC_ADDRESS_EDEFAULT.equals(macAddress);
			case ArrowheadSysMLProfilePackage.DEPLOYED_DEVICE__NETWORK_INTERFACE:
				return networkInterface != null;
			case ArrowheadSysMLProfilePackage.DEPLOYED_DEVICE__MAC_PROTOCOL:
				return MAC_PROTOCOL_EDEFAULT == null ? macProtocol != null : !MAC_PROTOCOL_EDEFAULT.equals(macProtocol);
			case ArrowheadSysMLProfilePackage.DEPLOYED_DEVICE__BASE_PROPERTY:
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
		result.append(" (MacAddress: ");
		result.append(macAddress);
		result.append(", MacProtocol: ");
		result.append(macProtocol);
		result.append(')');
		return result.toString();
	}

} //DeployedDeviceImpl
