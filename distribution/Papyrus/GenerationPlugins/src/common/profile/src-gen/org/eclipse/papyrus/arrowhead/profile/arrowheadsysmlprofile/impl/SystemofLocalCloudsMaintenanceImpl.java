/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsDeployed;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsMaintenance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Systemof Local Clouds Maintenance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SystemofLocalCloudsMaintenanceImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SystemofLocalCloudsMaintenanceImpl#getSystemoflocalcloudsdeployed <em>Systemoflocalcloudsdeployed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemofLocalCloudsMaintenanceImpl extends MinimalEObjectImpl.Container implements SystemofLocalCloudsMaintenance {
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
	 * The cached value of the '{@link #getSystemoflocalcloudsdeployed() <em>Systemoflocalcloudsdeployed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemoflocalcloudsdeployed()
	 * @generated
	 * @ordered
	 */
	protected SystemofLocalCloudsDeployed systemoflocalcloudsdeployed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemofLocalCloudsMaintenanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadSysMLProfilePackage.Literals.SYSTEMOF_LOCAL_CLOUDS_MAINTENANCE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_MAINTENANCE__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_MAINTENANCE__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemofLocalCloudsDeployed getSystemoflocalcloudsdeployed() {
		if (systemoflocalcloudsdeployed != null && systemoflocalcloudsdeployed.eIsProxy()) {
			InternalEObject oldSystemoflocalcloudsdeployed = (InternalEObject)systemoflocalcloudsdeployed;
			systemoflocalcloudsdeployed = (SystemofLocalCloudsDeployed)eResolveProxy(oldSystemoflocalcloudsdeployed);
			if (systemoflocalcloudsdeployed != oldSystemoflocalcloudsdeployed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_MAINTENANCE__SYSTEMOFLOCALCLOUDSDEPLOYED, oldSystemoflocalcloudsdeployed, systemoflocalcloudsdeployed));
			}
		}
		return systemoflocalcloudsdeployed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemofLocalCloudsDeployed basicGetSystemoflocalcloudsdeployed() {
		return systemoflocalcloudsdeployed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemoflocalcloudsdeployed(SystemofLocalCloudsDeployed newSystemoflocalcloudsdeployed) {
		SystemofLocalCloudsDeployed oldSystemoflocalcloudsdeployed = systemoflocalcloudsdeployed;
		systemoflocalcloudsdeployed = newSystemoflocalcloudsdeployed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_MAINTENANCE__SYSTEMOFLOCALCLOUDSDEPLOYED, oldSystemoflocalcloudsdeployed, systemoflocalcloudsdeployed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_MAINTENANCE__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_MAINTENANCE__SYSTEMOFLOCALCLOUDSDEPLOYED:
				if (resolve) return getSystemoflocalcloudsdeployed();
				return basicGetSystemoflocalcloudsdeployed();
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
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_MAINTENANCE__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_MAINTENANCE__SYSTEMOFLOCALCLOUDSDEPLOYED:
				setSystemoflocalcloudsdeployed((SystemofLocalCloudsDeployed)newValue);
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
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_MAINTENANCE__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_MAINTENANCE__SYSTEMOFLOCALCLOUDSDEPLOYED:
				setSystemoflocalcloudsdeployed((SystemofLocalCloudsDeployed)null);
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
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_MAINTENANCE__BASE_CLASS:
				return base_Class != null;
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_MAINTENANCE__SYSTEMOFLOCALCLOUDSDEPLOYED:
				return systemoflocalcloudsdeployed != null;
		}
		return super.eIsSet(featureID);
	}

} //SystemofLocalCloudsMaintenanceImpl
