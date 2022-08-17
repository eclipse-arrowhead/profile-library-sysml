/**
 */
package org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ApplicationSysDD;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ApplicationSystemKind;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Sys DD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ApplicationSysDDImpl#getSystemKind <em>System Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationSysDDImpl extends SysDDImpl implements ApplicationSysDD {
	/**
	 * The default value of the '{@link #getSystemKind() <em>System Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemKind()
	 * @generated
	 * @ordered
	 */
	protected static final ApplicationSystemKind SYSTEM_KIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemKind() <em>System Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemKind()
	 * @generated
	 * @ordered
	 */
	protected ApplicationSystemKind systemKind = SYSTEM_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationSysDDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadSysMLProfilePackage.Literals.APPLICATION_SYS_DD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationSystemKind getSystemKind() {
		return systemKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemKind(ApplicationSystemKind newSystemKind) {
		ApplicationSystemKind oldSystemKind = systemKind;
		systemKind = newSystemKind == null ? SYSTEM_KIND_EDEFAULT : newSystemKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.APPLICATION_SYS_DD__SYSTEM_KIND, oldSystemKind, systemKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.APPLICATION_SYS_DD__SYSTEM_KIND:
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
			case ArrowheadSysMLProfilePackage.APPLICATION_SYS_DD__SYSTEM_KIND:
				setSystemKind((ApplicationSystemKind)newValue);
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
			case ArrowheadSysMLProfilePackage.APPLICATION_SYS_DD__SYSTEM_KIND:
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
			case ArrowheadSysMLProfilePackage.APPLICATION_SYS_DD__SYSTEM_KIND:
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

} //ApplicationSysDDImpl
