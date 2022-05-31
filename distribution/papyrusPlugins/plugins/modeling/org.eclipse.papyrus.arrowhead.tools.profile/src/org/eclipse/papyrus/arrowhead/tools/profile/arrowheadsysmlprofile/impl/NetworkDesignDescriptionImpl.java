/**
 */
package org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.NetworkDesignDescription;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.PhysicalLayerKind;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ProtocolKind;

import org.eclipse.papyrus.sysml16.portsandflows.internal.impl.InterfaceBlockImpl;

import org.eclipse.uml2.uml.Port;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Design Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.NetworkDesignDescriptionImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.NetworkDesignDescriptionImpl#getPhysicalNetworkInterface <em>Physical Network Interface</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.NetworkDesignDescriptionImpl#getBase_Port <em>Base Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkDesignDescriptionImpl extends InterfaceBlockImpl implements NetworkDesignDescription {
	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final ProtocolKind PROTOCOL_EDEFAULT = ProtocolKind.HTTP_09;

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
	 * The default value of the '{@link #getPhysicalNetworkInterface() <em>Physical Network Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalNetworkInterface()
	 * @generated
	 * @ordered
	 */
	protected static final PhysicalLayerKind PHYSICAL_NETWORK_INTERFACE_EDEFAULT = PhysicalLayerKind.ETHERNET;

	/**
	 * The cached value of the '{@link #getPhysicalNetworkInterface() <em>Physical Network Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalNetworkInterface()
	 * @generated
	 * @ordered
	 */
	protected PhysicalLayerKind physicalNetworkInterface = PHYSICAL_NETWORK_INTERFACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Port() <em>Base Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Port()
	 * @generated
	 * @ordered
	 */
	protected Port base_Port;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkDesignDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadSysMLProfilePackage.Literals.NETWORK_DESIGN_DESCRIPTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.NETWORK_DESIGN_DESCRIPTION__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalLayerKind getPhysicalNetworkInterface() {
		return physicalNetworkInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalNetworkInterface(PhysicalLayerKind newPhysicalNetworkInterface) {
		PhysicalLayerKind oldPhysicalNetworkInterface = physicalNetworkInterface;
		physicalNetworkInterface = newPhysicalNetworkInterface == null ? PHYSICAL_NETWORK_INTERFACE_EDEFAULT : newPhysicalNetworkInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.NETWORK_DESIGN_DESCRIPTION__PHYSICAL_NETWORK_INTERFACE, oldPhysicalNetworkInterface, physicalNetworkInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getBase_Port() {
		if (base_Port != null && base_Port.eIsProxy()) {
			InternalEObject oldBase_Port = (InternalEObject)base_Port;
			base_Port = (Port)eResolveProxy(oldBase_Port);
			if (base_Port != oldBase_Port) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArrowheadSysMLProfilePackage.NETWORK_DESIGN_DESCRIPTION__BASE_PORT, oldBase_Port, base_Port));
			}
		}
		return base_Port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetBase_Port() {
		return base_Port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Port(Port newBase_Port) {
		Port oldBase_Port = base_Port;
		base_Port = newBase_Port;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.NETWORK_DESIGN_DESCRIPTION__BASE_PORT, oldBase_Port, base_Port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.NETWORK_DESIGN_DESCRIPTION__PROTOCOL:
				return getProtocol();
			case ArrowheadSysMLProfilePackage.NETWORK_DESIGN_DESCRIPTION__PHYSICAL_NETWORK_INTERFACE:
				return getPhysicalNetworkInterface();
			case ArrowheadSysMLProfilePackage.NETWORK_DESIGN_DESCRIPTION__BASE_PORT:
				if (resolve) return getBase_Port();
				return basicGetBase_Port();
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
			case ArrowheadSysMLProfilePackage.NETWORK_DESIGN_DESCRIPTION__PROTOCOL:
				setProtocol((ProtocolKind)newValue);
				return;
			case ArrowheadSysMLProfilePackage.NETWORK_DESIGN_DESCRIPTION__PHYSICAL_NETWORK_INTERFACE:
				setPhysicalNetworkInterface((PhysicalLayerKind)newValue);
				return;
			case ArrowheadSysMLProfilePackage.NETWORK_DESIGN_DESCRIPTION__BASE_PORT:
				setBase_Port((Port)newValue);
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
			case ArrowheadSysMLProfilePackage.NETWORK_DESIGN_DESCRIPTION__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.NETWORK_DESIGN_DESCRIPTION__PHYSICAL_NETWORK_INTERFACE:
				setPhysicalNetworkInterface(PHYSICAL_NETWORK_INTERFACE_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.NETWORK_DESIGN_DESCRIPTION__BASE_PORT:
				setBase_Port((Port)null);
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
			case ArrowheadSysMLProfilePackage.NETWORK_DESIGN_DESCRIPTION__PROTOCOL:
				return protocol != PROTOCOL_EDEFAULT;
			case ArrowheadSysMLProfilePackage.NETWORK_DESIGN_DESCRIPTION__PHYSICAL_NETWORK_INTERFACE:
				return physicalNetworkInterface != PHYSICAL_NETWORK_INTERFACE_EDEFAULT;
			case ArrowheadSysMLProfilePackage.NETWORK_DESIGN_DESCRIPTION__BASE_PORT:
				return base_Port != null;
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
		result.append(" (protocol: ");
		result.append(protocol);
		result.append(", physicalNetworkInterface: ");
		result.append(physicalNetworkInterface);
		result.append(')');
		return result.toString();
	}

} //NetworkDesignDescriptionImpl
