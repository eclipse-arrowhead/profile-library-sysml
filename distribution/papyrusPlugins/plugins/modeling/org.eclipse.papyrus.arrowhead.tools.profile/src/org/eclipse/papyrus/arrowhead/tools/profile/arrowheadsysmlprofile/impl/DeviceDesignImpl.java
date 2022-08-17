/**
 */
package org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DeviceDesign;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.PhysicalLayerKind;

import org.eclipse.papyrus.sysml16.blocks.internal.impl.BlockImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Design</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.DeviceDesignImpl#getNetworkDesign <em>Network Design</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceDesignImpl extends BlockImpl implements DeviceDesign {
	/**
	 * The cached value of the '{@link #getNetworkDesign() <em>Network Design</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkDesign()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalLayerKind> networkDesign;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceDesignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadSysMLProfilePackage.Literals.DEVICE_DESIGN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalLayerKind> getNetworkDesign() {
		if (networkDesign == null) {
			networkDesign = new EDataTypeUniqueEList<PhysicalLayerKind>(PhysicalLayerKind.class, this, ArrowheadSysMLProfilePackage.DEVICE_DESIGN__NETWORK_DESIGN);
		}
		return networkDesign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN__NETWORK_DESIGN:
				return getNetworkDesign();
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
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN__NETWORK_DESIGN:
				getNetworkDesign().clear();
				getNetworkDesign().addAll((Collection<? extends PhysicalLayerKind>)newValue);
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
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN__NETWORK_DESIGN:
				getNetworkDesign().clear();
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
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN__NETWORK_DESIGN:
				return networkDesign != null && !networkDesign.isEmpty();
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
		result.append(" (networkDesign: ");
		result.append(networkDesign);
		result.append(')');
		return result.toString();
	}

} //DeviceDesignImpl
