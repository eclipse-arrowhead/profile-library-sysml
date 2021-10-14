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
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceDeployed;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceEvolution;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkEvolution;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Evolution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceEvolutionImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceEvolutionImpl#getNetworkevolution <em>Networkevolution</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceEvolutionImpl#getDevicedeployed <em>Devicedeployed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceEvolutionImpl extends MinimalEObjectImpl.Container implements DeviceEvolution {
	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * The cached value of the '{@link #getNetworkevolution() <em>Networkevolution</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkevolution()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkEvolution> networkevolution;

	/**
	 * The cached value of the '{@link #getDevicedeployed() <em>Devicedeployed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevicedeployed()
	 * @generated
	 * @ordered
	 */
	protected DeviceDeployed devicedeployed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceEvolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadSysMLProfilePackage.Literals.DEVICE_EVOLUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArrowheadSysMLProfilePackage.DEVICE_EVOLUTION__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.DEVICE_EVOLUTION__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkEvolution> getNetworkevolution() {
		if (networkevolution == null) {
			networkevolution = new EObjectResolvingEList<NetworkEvolution>(NetworkEvolution.class, this, ArrowheadSysMLProfilePackage.DEVICE_EVOLUTION__NETWORKEVOLUTION);
		}
		return networkevolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceDeployed getDevicedeployed() {
		if (devicedeployed != null && devicedeployed.eIsProxy()) {
			InternalEObject oldDevicedeployed = (InternalEObject)devicedeployed;
			devicedeployed = (DeviceDeployed)eResolveProxy(oldDevicedeployed);
			if (devicedeployed != oldDevicedeployed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArrowheadSysMLProfilePackage.DEVICE_EVOLUTION__DEVICEDEPLOYED, oldDevicedeployed, devicedeployed));
			}
		}
		return devicedeployed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceDeployed basicGetDevicedeployed() {
		return devicedeployed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevicedeployed(DeviceDeployed newDevicedeployed) {
		DeviceDeployed oldDevicedeployed = devicedeployed;
		devicedeployed = newDevicedeployed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.DEVICE_EVOLUTION__DEVICEDEPLOYED, oldDevicedeployed, devicedeployed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.DEVICE_EVOLUTION__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case ArrowheadSysMLProfilePackage.DEVICE_EVOLUTION__NETWORKEVOLUTION:
				return getNetworkevolution();
			case ArrowheadSysMLProfilePackage.DEVICE_EVOLUTION__DEVICEDEPLOYED:
				if (resolve) return getDevicedeployed();
				return basicGetDevicedeployed();
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
			case ArrowheadSysMLProfilePackage.DEVICE_EVOLUTION__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case ArrowheadSysMLProfilePackage.DEVICE_EVOLUTION__NETWORKEVOLUTION:
				getNetworkevolution().clear();
				getNetworkevolution().addAll((Collection<? extends NetworkEvolution>)newValue);
				return;
			case ArrowheadSysMLProfilePackage.DEVICE_EVOLUTION__DEVICEDEPLOYED:
				setDevicedeployed((DeviceDeployed)newValue);
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
			case ArrowheadSysMLProfilePackage.DEVICE_EVOLUTION__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case ArrowheadSysMLProfilePackage.DEVICE_EVOLUTION__NETWORKEVOLUTION:
				getNetworkevolution().clear();
				return;
			case ArrowheadSysMLProfilePackage.DEVICE_EVOLUTION__DEVICEDEPLOYED:
				setDevicedeployed((DeviceDeployed)null);
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
			case ArrowheadSysMLProfilePackage.DEVICE_EVOLUTION__BASE_CLASS:
				return base_Class != null;
			case ArrowheadSysMLProfilePackage.DEVICE_EVOLUTION__NETWORKEVOLUTION:
				return networkevolution != null && !networkevolution.isEmpty();
			case ArrowheadSysMLProfilePackage.DEVICE_EVOLUTION__DEVICEDEPLOYED:
				return devicedeployed != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceEvolutionImpl
