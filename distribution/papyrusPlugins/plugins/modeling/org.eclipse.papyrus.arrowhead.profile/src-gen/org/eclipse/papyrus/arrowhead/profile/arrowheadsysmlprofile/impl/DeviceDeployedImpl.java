/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceDeployed;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudDeployed;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkDeployed;

import org.eclipse.papyrus.sysml16.blocks.internal.impl.BlockImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Deployed</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceDeployedImpl#getLocalclouddeployed <em>Localclouddeployed</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceDeployedImpl#getNetworkdeployed <em>Networkdeployed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceDeployedImpl extends BlockImpl implements DeviceDeployed {
	/**
	 * The cached value of the '{@link #getLocalclouddeployed() <em>Localclouddeployed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalclouddeployed()
	 * @generated
	 * @ordered
	 */
	protected LocalCloudDeployed localclouddeployed;

	/**
	 * The cached value of the '{@link #getNetworkdeployed() <em>Networkdeployed</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkdeployed()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkDeployed> networkdeployed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceDeployedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadSysMLProfilePackage.Literals.DEVICE_DEPLOYED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalCloudDeployed getLocalclouddeployed() {
		if (localclouddeployed != null && localclouddeployed.eIsProxy()) {
			InternalEObject oldLocalclouddeployed = (InternalEObject)localclouddeployed;
			localclouddeployed = (LocalCloudDeployed)eResolveProxy(oldLocalclouddeployed);
			if (localclouddeployed != oldLocalclouddeployed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArrowheadSysMLProfilePackage.DEVICE_DEPLOYED__LOCALCLOUDDEPLOYED, oldLocalclouddeployed, localclouddeployed));
			}
		}
		return localclouddeployed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalCloudDeployed basicGetLocalclouddeployed() {
		return localclouddeployed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalclouddeployed(LocalCloudDeployed newLocalclouddeployed) {
		LocalCloudDeployed oldLocalclouddeployed = localclouddeployed;
		localclouddeployed = newLocalclouddeployed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.DEVICE_DEPLOYED__LOCALCLOUDDEPLOYED, oldLocalclouddeployed, localclouddeployed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkDeployed> getNetworkdeployed() {
		if (networkdeployed == null) {
			networkdeployed = new EObjectResolvingEList<NetworkDeployed>(NetworkDeployed.class, this, ArrowheadSysMLProfilePackage.DEVICE_DEPLOYED__NETWORKDEPLOYED);
		}
		return networkdeployed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.DEVICE_DEPLOYED__LOCALCLOUDDEPLOYED:
				if (resolve) return getLocalclouddeployed();
				return basicGetLocalclouddeployed();
			case ArrowheadSysMLProfilePackage.DEVICE_DEPLOYED__NETWORKDEPLOYED:
				return getNetworkdeployed();
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
			case ArrowheadSysMLProfilePackage.DEVICE_DEPLOYED__LOCALCLOUDDEPLOYED:
				setLocalclouddeployed((LocalCloudDeployed)newValue);
				return;
			case ArrowheadSysMLProfilePackage.DEVICE_DEPLOYED__NETWORKDEPLOYED:
				getNetworkdeployed().clear();
				getNetworkdeployed().addAll((Collection<? extends NetworkDeployed>)newValue);
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
			case ArrowheadSysMLProfilePackage.DEVICE_DEPLOYED__LOCALCLOUDDEPLOYED:
				setLocalclouddeployed((LocalCloudDeployed)null);
				return;
			case ArrowheadSysMLProfilePackage.DEVICE_DEPLOYED__NETWORKDEPLOYED:
				getNetworkdeployed().clear();
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
			case ArrowheadSysMLProfilePackage.DEVICE_DEPLOYED__LOCALCLOUDDEPLOYED:
				return localclouddeployed != null;
			case ArrowheadSysMLProfilePackage.DEVICE_DEPLOYED__NETWORKDEPLOYED:
				return networkdeployed != null && !networkdeployed.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeviceDeployedImpl
