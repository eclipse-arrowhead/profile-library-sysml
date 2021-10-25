/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceEvolution;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudEvolution;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysEvolution;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysImplementation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sys Evolution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SysEvolutionImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SysEvolutionImpl#getLocalcloudevolution <em>Localcloudevolution</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SysEvolutionImpl#getSysimplementation <em>Sysimplementation</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SysEvolutionImpl#getDeviceevolution <em>Deviceevolution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SysEvolutionImpl extends MinimalEObjectImpl.Container implements SysEvolution {
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
	 * The cached value of the '{@link #getLocalcloudevolution() <em>Localcloudevolution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalcloudevolution()
	 * @generated
	 * @ordered
	 */
	protected LocalCloudEvolution localcloudevolution;

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
	 * The cached value of the '{@link #getDeviceevolution() <em>Deviceevolution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceevolution()
	 * @generated
	 * @ordered
	 */
	protected DeviceEvolution deviceevolution;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SysEvolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadSysMLProfilePackage.Literals.SYS_EVOLUTION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArrowheadSysMLProfilePackage.SYS_EVOLUTION__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.SYS_EVOLUTION__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalCloudEvolution getLocalcloudevolution() {
		if (localcloudevolution != null && localcloudevolution.eIsProxy()) {
			InternalEObject oldLocalcloudevolution = (InternalEObject)localcloudevolution;
			localcloudevolution = (LocalCloudEvolution)eResolveProxy(oldLocalcloudevolution);
			if (localcloudevolution != oldLocalcloudevolution) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArrowheadSysMLProfilePackage.SYS_EVOLUTION__LOCALCLOUDEVOLUTION, oldLocalcloudevolution, localcloudevolution));
			}
		}
		return localcloudevolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalCloudEvolution basicGetLocalcloudevolution() {
		return localcloudevolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalcloudevolution(LocalCloudEvolution newLocalcloudevolution) {
		LocalCloudEvolution oldLocalcloudevolution = localcloudevolution;
		localcloudevolution = newLocalcloudevolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.SYS_EVOLUTION__LOCALCLOUDEVOLUTION, oldLocalcloudevolution, localcloudevolution));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArrowheadSysMLProfilePackage.SYS_EVOLUTION__SYSIMPLEMENTATION, oldSysimplementation, sysimplementation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.SYS_EVOLUTION__SYSIMPLEMENTATION, oldSysimplementation, sysimplementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceEvolution getDeviceevolution() {
		if (deviceevolution != null && deviceevolution.eIsProxy()) {
			InternalEObject oldDeviceevolution = (InternalEObject)deviceevolution;
			deviceevolution = (DeviceEvolution)eResolveProxy(oldDeviceevolution);
			if (deviceevolution != oldDeviceevolution) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArrowheadSysMLProfilePackage.SYS_EVOLUTION__DEVICEEVOLUTION, oldDeviceevolution, deviceevolution));
			}
		}
		return deviceevolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceEvolution basicGetDeviceevolution() {
		return deviceevolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceevolution(DeviceEvolution newDeviceevolution) {
		DeviceEvolution oldDeviceevolution = deviceevolution;
		deviceevolution = newDeviceevolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.SYS_EVOLUTION__DEVICEEVOLUTION, oldDeviceevolution, deviceevolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.SYS_EVOLUTION__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case ArrowheadSysMLProfilePackage.SYS_EVOLUTION__LOCALCLOUDEVOLUTION:
				if (resolve) return getLocalcloudevolution();
				return basicGetLocalcloudevolution();
			case ArrowheadSysMLProfilePackage.SYS_EVOLUTION__SYSIMPLEMENTATION:
				if (resolve) return getSysimplementation();
				return basicGetSysimplementation();
			case ArrowheadSysMLProfilePackage.SYS_EVOLUTION__DEVICEEVOLUTION:
				if (resolve) return getDeviceevolution();
				return basicGetDeviceevolution();
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
			case ArrowheadSysMLProfilePackage.SYS_EVOLUTION__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case ArrowheadSysMLProfilePackage.SYS_EVOLUTION__LOCALCLOUDEVOLUTION:
				setLocalcloudevolution((LocalCloudEvolution)newValue);
				return;
			case ArrowheadSysMLProfilePackage.SYS_EVOLUTION__SYSIMPLEMENTATION:
				setSysimplementation((SysImplementation)newValue);
				return;
			case ArrowheadSysMLProfilePackage.SYS_EVOLUTION__DEVICEEVOLUTION:
				setDeviceevolution((DeviceEvolution)newValue);
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
			case ArrowheadSysMLProfilePackage.SYS_EVOLUTION__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case ArrowheadSysMLProfilePackage.SYS_EVOLUTION__LOCALCLOUDEVOLUTION:
				setLocalcloudevolution((LocalCloudEvolution)null);
				return;
			case ArrowheadSysMLProfilePackage.SYS_EVOLUTION__SYSIMPLEMENTATION:
				setSysimplementation((SysImplementation)null);
				return;
			case ArrowheadSysMLProfilePackage.SYS_EVOLUTION__DEVICEEVOLUTION:
				setDeviceevolution((DeviceEvolution)null);
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
			case ArrowheadSysMLProfilePackage.SYS_EVOLUTION__BASE_CLASS:
				return base_Class != null;
			case ArrowheadSysMLProfilePackage.SYS_EVOLUTION__LOCALCLOUDEVOLUTION:
				return localcloudevolution != null;
			case ArrowheadSysMLProfilePackage.SYS_EVOLUTION__SYSIMPLEMENTATION:
				return sysimplementation != null;
			case ArrowheadSysMLProfilePackage.SYS_EVOLUTION__DEVICEEVOLUTION:
				return deviceevolution != null;
		}
		return super.eIsSet(featureID);
	}

} //SysEvolutionImpl
