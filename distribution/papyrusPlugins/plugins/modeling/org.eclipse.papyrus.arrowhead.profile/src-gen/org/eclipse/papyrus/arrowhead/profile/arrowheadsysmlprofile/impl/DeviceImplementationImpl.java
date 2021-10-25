/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceImplementation;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkImplementation;

import org.eclipse.papyrus.sysml16.blocks.internal.impl.BlockImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceImplementationImpl#getNetworkimplementation <em>Networkimplementation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceImplementationImpl extends BlockImpl implements DeviceImplementation {
	/**
	 * The cached value of the '{@link #getNetworkimplementation() <em>Networkimplementation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkimplementation()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkImplementation> networkimplementation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadSysMLProfilePackage.Literals.DEVICE_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkImplementation> getNetworkimplementation() {
		if (networkimplementation == null) {
			networkimplementation = new EObjectResolvingEList<NetworkImplementation>(NetworkImplementation.class, this, ArrowheadSysMLProfilePackage.DEVICE_IMPLEMENTATION__NETWORKIMPLEMENTATION);
		}
		return networkimplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.DEVICE_IMPLEMENTATION__NETWORKIMPLEMENTATION:
				return getNetworkimplementation();
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
			case ArrowheadSysMLProfilePackage.DEVICE_IMPLEMENTATION__NETWORKIMPLEMENTATION:
				getNetworkimplementation().clear();
				getNetworkimplementation().addAll((Collection<? extends NetworkImplementation>)newValue);
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
			case ArrowheadSysMLProfilePackage.DEVICE_IMPLEMENTATION__NETWORKIMPLEMENTATION:
				getNetworkimplementation().clear();
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
			case ArrowheadSysMLProfilePackage.DEVICE_IMPLEMENTATION__NETWORKIMPLEMENTATION:
				return networkimplementation != null && !networkimplementation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeviceImplementationImpl
