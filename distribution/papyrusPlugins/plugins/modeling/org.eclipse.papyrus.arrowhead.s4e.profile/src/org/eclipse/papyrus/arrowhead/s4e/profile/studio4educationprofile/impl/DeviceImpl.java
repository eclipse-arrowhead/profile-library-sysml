/**
 */
package org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.Device;
import org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.DeviceKind;
import org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.Studio4EducationProfilePackage;

import org.eclipse.papyrus.sysml16.blocks.internal.impl.BlockImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.impl.DeviceImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.impl.DeviceImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.impl.DeviceImpl#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceImpl extends BlockImpl implements Device {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final DeviceKind KIND_EDEFAULT = DeviceKind.SENSOR;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected DeviceKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected String level = LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Studio4EducationProfilePackage.Literals.DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Studio4EducationProfilePackage.DEVICE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(DeviceKind newKind) {
		DeviceKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Studio4EducationProfilePackage.DEVICE__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(String newLevel) {
		String oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Studio4EducationProfilePackage.DEVICE__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Studio4EducationProfilePackage.DEVICE__LABEL:
				return getLabel();
			case Studio4EducationProfilePackage.DEVICE__KIND:
				return getKind();
			case Studio4EducationProfilePackage.DEVICE__LEVEL:
				return getLevel();
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
			case Studio4EducationProfilePackage.DEVICE__LABEL:
				setLabel((String)newValue);
				return;
			case Studio4EducationProfilePackage.DEVICE__KIND:
				setKind((DeviceKind)newValue);
				return;
			case Studio4EducationProfilePackage.DEVICE__LEVEL:
				setLevel((String)newValue);
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
			case Studio4EducationProfilePackage.DEVICE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case Studio4EducationProfilePackage.DEVICE__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case Studio4EducationProfilePackage.DEVICE__LEVEL:
				setLevel(LEVEL_EDEFAULT);
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
			case Studio4EducationProfilePackage.DEVICE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case Studio4EducationProfilePackage.DEVICE__KIND:
				return kind != KIND_EDEFAULT;
			case Studio4EducationProfilePackage.DEVICE__LEVEL:
				return LEVEL_EDEFAULT == null ? level != null : !LEVEL_EDEFAULT.equals(level);
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
		result.append(" (label: ");
		result.append(label);
		result.append(", kind: ");
		result.append(kind);
		result.append(", level: ");
		result.append(level);
		result.append(')');
		return result.toString();
	}

} //DeviceImpl
