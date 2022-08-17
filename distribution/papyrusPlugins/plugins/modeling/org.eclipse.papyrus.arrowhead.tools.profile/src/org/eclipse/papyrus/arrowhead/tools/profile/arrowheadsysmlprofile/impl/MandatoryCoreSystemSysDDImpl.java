/**
 */
package org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.MandatoryCoreSystemKind;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.MandatoryCoreSystemSysDD;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mandatory Core System Sys DD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.MandatoryCoreSystemSysDDImpl#getSystemKind <em>System Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MandatoryCoreSystemSysDDImpl extends SysDDImpl implements MandatoryCoreSystemSysDD {
	/**
	 * The default value of the '{@link #getSystemKind() <em>System Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemKind()
	 * @generated
	 * @ordered
	 */
	protected static final MandatoryCoreSystemKind SYSTEM_KIND_EDEFAULT = MandatoryCoreSystemKind.ORCH;

	/**
	 * The cached value of the '{@link #getSystemKind() <em>System Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemKind()
	 * @generated
	 * @ordered
	 */
	protected MandatoryCoreSystemKind systemKind = SYSTEM_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MandatoryCoreSystemSysDDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadSysMLProfilePackage.Literals.MANDATORY_CORE_SYSTEM_SYS_DD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandatoryCoreSystemKind getSystemKind() {
		return systemKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemKind(MandatoryCoreSystemKind newSystemKind) {
		MandatoryCoreSystemKind oldSystemKind = systemKind;
		systemKind = newSystemKind == null ? SYSTEM_KIND_EDEFAULT : newSystemKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.MANDATORY_CORE_SYSTEM_SYS_DD__SYSTEM_KIND, oldSystemKind, systemKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.MANDATORY_CORE_SYSTEM_SYS_DD__SYSTEM_KIND:
				return getSystemKind();
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
			case ArrowheadSysMLProfilePackage.MANDATORY_CORE_SYSTEM_SYS_DD__SYSTEM_KIND:
				setSystemKind((MandatoryCoreSystemKind)newValue);
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
			case ArrowheadSysMLProfilePackage.MANDATORY_CORE_SYSTEM_SYS_DD__SYSTEM_KIND:
				setSystemKind(SYSTEM_KIND_EDEFAULT);
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
			case ArrowheadSysMLProfilePackage.MANDATORY_CORE_SYSTEM_SYS_DD__SYSTEM_KIND:
				return systemKind != SYSTEM_KIND_EDEFAULT;
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
		result.append(" (systemKind: ");
		result.append(systemKind);
		result.append(')');
		return result.toString();
	}

} //MandatoryCoreSystemSysDDImpl
