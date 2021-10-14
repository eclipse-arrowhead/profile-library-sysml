/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceDesign;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkDesign;

import org.eclipse.papyrus.sysml16.blocks.internal.impl.BlockImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Design</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceDesignImpl#getNetworkdesign <em>Networkdesign</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceDesignImpl extends BlockImpl implements DeviceDesign {
	/**
	 * The cached value of the '{@link #getNetworkdesign() <em>Networkdesign</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkdesign()
	 * @generated
	 * @ordered
	 */
	protected NetworkDesign networkdesign;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceDesignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadSysMLProfilePackage.Literals.DEVICE_DESIGN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkDesign getNetworkdesign() {
		if (networkdesign != null && networkdesign.eIsProxy()) {
			InternalEObject oldNetworkdesign = (InternalEObject)networkdesign;
			networkdesign = (NetworkDesign)eResolveProxy(oldNetworkdesign);
			if (networkdesign != oldNetworkdesign) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArrowheadSysMLProfilePackage.DEVICE_DESIGN__NETWORKDESIGN, oldNetworkdesign, networkdesign));
			}
		}
		return networkdesign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkDesign basicGetNetworkdesign() {
		return networkdesign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkdesign(NetworkDesign newNetworkdesign) {
		NetworkDesign oldNetworkdesign = networkdesign;
		networkdesign = newNetworkdesign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.DEVICE_DESIGN__NETWORKDESIGN, oldNetworkdesign, networkdesign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN__NETWORKDESIGN:
				if (resolve) return getNetworkdesign();
				return basicGetNetworkdesign();
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
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN__NETWORKDESIGN:
				setNetworkdesign((NetworkDesign)newValue);
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
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN__NETWORKDESIGN:
				setNetworkdesign((NetworkDesign)null);
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
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN__NETWORKDESIGN:
				return networkdesign != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceDesignImpl
