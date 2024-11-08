/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceMaintenance;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudMaintenance;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysImplementation;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysMaintenance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sys Maintenance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SysMaintenanceImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SysMaintenanceImpl#getSysimplementation <em>Sysimplementation</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SysMaintenanceImpl#getLocalcloudmaintenance <em>Localcloudmaintenance</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SysMaintenanceImpl#getDevicemaintenance <em>Devicemaintenance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SysMaintenanceImpl extends MinimalEObjectImpl.Container implements SysMaintenance {
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
	 * The cached value of the '{@link #getSysimplementation() <em>Sysimplementation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSysimplementation()
	 * @generated
	 * @ordered
	 */
	protected SysImplementation sysimplementation;

	/**
	 * The cached value of the '{@link #getLocalcloudmaintenance() <em>Localcloudmaintenance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalcloudmaintenance()
	 * @generated
	 * @ordered
	 */
	protected LocalCloudMaintenance localcloudmaintenance;

	/**
	 * The cached value of the '{@link #getDevicemaintenance() <em>Devicemaintenance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevicemaintenance()
	 * @generated
	 * @ordered
	 */
	protected DeviceMaintenance devicemaintenance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SysMaintenanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadSysMLProfilePackage.Literals.SYS_MAINTENANCE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArrowheadSysMLProfilePackage.SYS_MAINTENANCE__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.SYS_MAINTENANCE__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SysImplementation getSysimplementation() {
		if (sysimplementation != null && sysimplementation.eIsProxy()) {
			InternalEObject oldSysimplementation = (InternalEObject)sysimplementation;
			sysimplementation = (SysImplementation)eResolveProxy(oldSysimplementation);
			if (sysimplementation != oldSysimplementation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArrowheadSysMLProfilePackage.SYS_MAINTENANCE__SYSIMPLEMENTATION, oldSysimplementation, sysimplementation));
			}
		}
		return sysimplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SysImplementation basicGetSysimplementation() {
		return sysimplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSysimplementation(SysImplementation newSysimplementation) {
		SysImplementation oldSysimplementation = sysimplementation;
		sysimplementation = newSysimplementation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.SYS_MAINTENANCE__SYSIMPLEMENTATION, oldSysimplementation, sysimplementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalCloudMaintenance getLocalcloudmaintenance() {
		if (localcloudmaintenance != null && localcloudmaintenance.eIsProxy()) {
			InternalEObject oldLocalcloudmaintenance = (InternalEObject)localcloudmaintenance;
			localcloudmaintenance = (LocalCloudMaintenance)eResolveProxy(oldLocalcloudmaintenance);
			if (localcloudmaintenance != oldLocalcloudmaintenance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArrowheadSysMLProfilePackage.SYS_MAINTENANCE__LOCALCLOUDMAINTENANCE, oldLocalcloudmaintenance, localcloudmaintenance));
			}
		}
		return localcloudmaintenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalCloudMaintenance basicGetLocalcloudmaintenance() {
		return localcloudmaintenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalcloudmaintenance(LocalCloudMaintenance newLocalcloudmaintenance) {
		LocalCloudMaintenance oldLocalcloudmaintenance = localcloudmaintenance;
		localcloudmaintenance = newLocalcloudmaintenance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.SYS_MAINTENANCE__LOCALCLOUDMAINTENANCE, oldLocalcloudmaintenance, localcloudmaintenance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMaintenance getDevicemaintenance() {
		if (devicemaintenance != null && devicemaintenance.eIsProxy()) {
			InternalEObject oldDevicemaintenance = (InternalEObject)devicemaintenance;
			devicemaintenance = (DeviceMaintenance)eResolveProxy(oldDevicemaintenance);
			if (devicemaintenance != oldDevicemaintenance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArrowheadSysMLProfilePackage.SYS_MAINTENANCE__DEVICEMAINTENANCE, oldDevicemaintenance, devicemaintenance));
			}
		}
		return devicemaintenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMaintenance basicGetDevicemaintenance() {
		return devicemaintenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevicemaintenance(DeviceMaintenance newDevicemaintenance) {
		DeviceMaintenance oldDevicemaintenance = devicemaintenance;
		devicemaintenance = newDevicemaintenance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.SYS_MAINTENANCE__DEVICEMAINTENANCE, oldDevicemaintenance, devicemaintenance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.SYS_MAINTENANCE__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case ArrowheadSysMLProfilePackage.SYS_MAINTENANCE__SYSIMPLEMENTATION:
				if (resolve) return getSysimplementation();
				return basicGetSysimplementation();
			case ArrowheadSysMLProfilePackage.SYS_MAINTENANCE__LOCALCLOUDMAINTENANCE:
				if (resolve) return getLocalcloudmaintenance();
				return basicGetLocalcloudmaintenance();
			case ArrowheadSysMLProfilePackage.SYS_MAINTENANCE__DEVICEMAINTENANCE:
				if (resolve) return getDevicemaintenance();
				return basicGetDevicemaintenance();
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
			case ArrowheadSysMLProfilePackage.SYS_MAINTENANCE__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case ArrowheadSysMLProfilePackage.SYS_MAINTENANCE__SYSIMPLEMENTATION:
				setSysimplementation((SysImplementation)newValue);
				return;
			case ArrowheadSysMLProfilePackage.SYS_MAINTENANCE__LOCALCLOUDMAINTENANCE:
				setLocalcloudmaintenance((LocalCloudMaintenance)newValue);
				return;
			case ArrowheadSysMLProfilePackage.SYS_MAINTENANCE__DEVICEMAINTENANCE:
				setDevicemaintenance((DeviceMaintenance)newValue);
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
			case ArrowheadSysMLProfilePackage.SYS_MAINTENANCE__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case ArrowheadSysMLProfilePackage.SYS_MAINTENANCE__SYSIMPLEMENTATION:
				setSysimplementation((SysImplementation)null);
				return;
			case ArrowheadSysMLProfilePackage.SYS_MAINTENANCE__LOCALCLOUDMAINTENANCE:
				setLocalcloudmaintenance((LocalCloudMaintenance)null);
				return;
			case ArrowheadSysMLProfilePackage.SYS_MAINTENANCE__DEVICEMAINTENANCE:
				setDevicemaintenance((DeviceMaintenance)null);
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
			case ArrowheadSysMLProfilePackage.SYS_MAINTENANCE__BASE_CLASS:
				return base_Class != null;
			case ArrowheadSysMLProfilePackage.SYS_MAINTENANCE__SYSIMPLEMENTATION:
				return sysimplementation != null;
			case ArrowheadSysMLProfilePackage.SYS_MAINTENANCE__LOCALCLOUDMAINTENANCE:
				return localcloudmaintenance != null;
			case ArrowheadSysMLProfilePackage.SYS_MAINTENANCE__DEVICEMAINTENANCE:
				return devicemaintenance != null;
		}
		return super.eIsSet(featureID);
	}

} //SysMaintenanceImpl
