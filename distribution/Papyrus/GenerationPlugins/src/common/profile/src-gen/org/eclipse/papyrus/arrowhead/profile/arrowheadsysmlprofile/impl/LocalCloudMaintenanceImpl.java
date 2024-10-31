/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudDeployed;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudMaintenance;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsMaintenance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Cloud Maintenance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.LocalCloudMaintenanceImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.LocalCloudMaintenanceImpl#getSystemoflocalcloudsmaintenance <em>Systemoflocalcloudsmaintenance</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.LocalCloudMaintenanceImpl#getLocalclouddeployed <em>Localclouddeployed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalCloudMaintenanceImpl extends MinimalEObjectImpl.Container implements LocalCloudMaintenance {
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
	 * The cached value of the '{@link #getSystemoflocalcloudsmaintenance() <em>Systemoflocalcloudsmaintenance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemoflocalcloudsmaintenance()
	 * @generated
	 * @ordered
	 */
	protected SystemofLocalCloudsMaintenance systemoflocalcloudsmaintenance;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalCloudMaintenanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadSysMLProfilePackage.Literals.LOCAL_CLOUD_MAINTENANCE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArrowheadSysMLProfilePackage.LOCAL_CLOUD_MAINTENANCE__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.LOCAL_CLOUD_MAINTENANCE__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemofLocalCloudsMaintenance getSystemoflocalcloudsmaintenance() {
		if (systemoflocalcloudsmaintenance != null && systemoflocalcloudsmaintenance.eIsProxy()) {
			InternalEObject oldSystemoflocalcloudsmaintenance = (InternalEObject)systemoflocalcloudsmaintenance;
			systemoflocalcloudsmaintenance = (SystemofLocalCloudsMaintenance)eResolveProxy(oldSystemoflocalcloudsmaintenance);
			if (systemoflocalcloudsmaintenance != oldSystemoflocalcloudsmaintenance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArrowheadSysMLProfilePackage.LOCAL_CLOUD_MAINTENANCE__SYSTEMOFLOCALCLOUDSMAINTENANCE, oldSystemoflocalcloudsmaintenance, systemoflocalcloudsmaintenance));
			}
		}
		return systemoflocalcloudsmaintenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemofLocalCloudsMaintenance basicGetSystemoflocalcloudsmaintenance() {
		return systemoflocalcloudsmaintenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemoflocalcloudsmaintenance(SystemofLocalCloudsMaintenance newSystemoflocalcloudsmaintenance) {
		SystemofLocalCloudsMaintenance oldSystemoflocalcloudsmaintenance = systemoflocalcloudsmaintenance;
		systemoflocalcloudsmaintenance = newSystemoflocalcloudsmaintenance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.LOCAL_CLOUD_MAINTENANCE__SYSTEMOFLOCALCLOUDSMAINTENANCE, oldSystemoflocalcloudsmaintenance, systemoflocalcloudsmaintenance));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArrowheadSysMLProfilePackage.LOCAL_CLOUD_MAINTENANCE__LOCALCLOUDDEPLOYED, oldLocalclouddeployed, localclouddeployed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.LOCAL_CLOUD_MAINTENANCE__LOCALCLOUDDEPLOYED, oldLocalclouddeployed, localclouddeployed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.LOCAL_CLOUD_MAINTENANCE__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case ArrowheadSysMLProfilePackage.LOCAL_CLOUD_MAINTENANCE__SYSTEMOFLOCALCLOUDSMAINTENANCE:
				if (resolve) return getSystemoflocalcloudsmaintenance();
				return basicGetSystemoflocalcloudsmaintenance();
			case ArrowheadSysMLProfilePackage.LOCAL_CLOUD_MAINTENANCE__LOCALCLOUDDEPLOYED:
				if (resolve) return getLocalclouddeployed();
				return basicGetLocalclouddeployed();
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
			case ArrowheadSysMLProfilePackage.LOCAL_CLOUD_MAINTENANCE__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case ArrowheadSysMLProfilePackage.LOCAL_CLOUD_MAINTENANCE__SYSTEMOFLOCALCLOUDSMAINTENANCE:
				setSystemoflocalcloudsmaintenance((SystemofLocalCloudsMaintenance)newValue);
				return;
			case ArrowheadSysMLProfilePackage.LOCAL_CLOUD_MAINTENANCE__LOCALCLOUDDEPLOYED:
				setLocalclouddeployed((LocalCloudDeployed)newValue);
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
			case ArrowheadSysMLProfilePackage.LOCAL_CLOUD_MAINTENANCE__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case ArrowheadSysMLProfilePackage.LOCAL_CLOUD_MAINTENANCE__SYSTEMOFLOCALCLOUDSMAINTENANCE:
				setSystemoflocalcloudsmaintenance((SystemofLocalCloudsMaintenance)null);
				return;
			case ArrowheadSysMLProfilePackage.LOCAL_CLOUD_MAINTENANCE__LOCALCLOUDDEPLOYED:
				setLocalclouddeployed((LocalCloudDeployed)null);
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
			case ArrowheadSysMLProfilePackage.LOCAL_CLOUD_MAINTENANCE__BASE_CLASS:
				return base_Class != null;
			case ArrowheadSysMLProfilePackage.LOCAL_CLOUD_MAINTENANCE__SYSTEMOFLOCALCLOUDSMAINTENANCE:
				return systemoflocalcloudsmaintenance != null;
			case ArrowheadSysMLProfilePackage.LOCAL_CLOUD_MAINTENANCE__LOCALCLOUDDEPLOYED:
				return localclouddeployed != null;
		}
		return super.eIsSet(featureID);
	}

} //LocalCloudMaintenanceImpl
