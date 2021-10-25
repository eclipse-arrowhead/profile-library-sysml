/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceImplementation;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCLoudImplementation;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysImplementation;

import org.eclipse.papyrus.sysml16.blocks.internal.impl.BlockImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sys Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SysImplementationImpl#getLocalcloudimplementation <em>Localcloudimplementation</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SysImplementationImpl#getDeviceimplementation <em>Deviceimplementation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SysImplementationImpl extends BlockImpl implements SysImplementation {
	/**
	 * The cached value of the '{@link #getLocalcloudimplementation() <em>Localcloudimplementation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalcloudimplementation()
	 * @generated
	 * @ordered
	 */
	protected LocalCLoudImplementation localcloudimplementation;

	/**
	 * The cached value of the '{@link #getDeviceimplementation() <em>Deviceimplementation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceimplementation()
	 * @generated
	 * @ordered
	 */
	protected DeviceImplementation deviceimplementation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SysImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadSysMLProfilePackage.Literals.SYS_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalCLoudImplementation getLocalcloudimplementation() {
		if (localcloudimplementation != null && localcloudimplementation.eIsProxy()) {
			InternalEObject oldLocalcloudimplementation = (InternalEObject)localcloudimplementation;
			localcloudimplementation = (LocalCLoudImplementation)eResolveProxy(oldLocalcloudimplementation);
			if (localcloudimplementation != oldLocalcloudimplementation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArrowheadSysMLProfilePackage.SYS_IMPLEMENTATION__LOCALCLOUDIMPLEMENTATION, oldLocalcloudimplementation, localcloudimplementation));
			}
		}
		return localcloudimplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalCLoudImplementation basicGetLocalcloudimplementation() {
		return localcloudimplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalcloudimplementation(LocalCLoudImplementation newLocalcloudimplementation) {
		LocalCLoudImplementation oldLocalcloudimplementation = localcloudimplementation;
		localcloudimplementation = newLocalcloudimplementation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.SYS_IMPLEMENTATION__LOCALCLOUDIMPLEMENTATION, oldLocalcloudimplementation, localcloudimplementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceImplementation getDeviceimplementation() {
		if (deviceimplementation != null && deviceimplementation.eIsProxy()) {
			InternalEObject oldDeviceimplementation = (InternalEObject)deviceimplementation;
			deviceimplementation = (DeviceImplementation)eResolveProxy(oldDeviceimplementation);
			if (deviceimplementation != oldDeviceimplementation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArrowheadSysMLProfilePackage.SYS_IMPLEMENTATION__DEVICEIMPLEMENTATION, oldDeviceimplementation, deviceimplementation));
			}
		}
		return deviceimplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceImplementation basicGetDeviceimplementation() {
		return deviceimplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceimplementation(DeviceImplementation newDeviceimplementation) {
		DeviceImplementation oldDeviceimplementation = deviceimplementation;
		deviceimplementation = newDeviceimplementation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.SYS_IMPLEMENTATION__DEVICEIMPLEMENTATION, oldDeviceimplementation, deviceimplementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.SYS_IMPLEMENTATION__LOCALCLOUDIMPLEMENTATION:
				if (resolve) return getLocalcloudimplementation();
				return basicGetLocalcloudimplementation();
			case ArrowheadSysMLProfilePackage.SYS_IMPLEMENTATION__DEVICEIMPLEMENTATION:
				if (resolve) return getDeviceimplementation();
				return basicGetDeviceimplementation();
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
			case ArrowheadSysMLProfilePackage.SYS_IMPLEMENTATION__LOCALCLOUDIMPLEMENTATION:
				setLocalcloudimplementation((LocalCLoudImplementation)newValue);
				return;
			case ArrowheadSysMLProfilePackage.SYS_IMPLEMENTATION__DEVICEIMPLEMENTATION:
				setDeviceimplementation((DeviceImplementation)newValue);
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
			case ArrowheadSysMLProfilePackage.SYS_IMPLEMENTATION__LOCALCLOUDIMPLEMENTATION:
				setLocalcloudimplementation((LocalCLoudImplementation)null);
				return;
			case ArrowheadSysMLProfilePackage.SYS_IMPLEMENTATION__DEVICEIMPLEMENTATION:
				setDeviceimplementation((DeviceImplementation)null);
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
			case ArrowheadSysMLProfilePackage.SYS_IMPLEMENTATION__LOCALCLOUDIMPLEMENTATION:
				return localcloudimplementation != null;
			case ArrowheadSysMLProfilePackage.SYS_IMPLEMENTATION__DEVICEIMPLEMENTATION:
				return deviceimplementation != null;
		}
		return super.eIsSet(featureID);
	}

} //SysImplementationImpl
