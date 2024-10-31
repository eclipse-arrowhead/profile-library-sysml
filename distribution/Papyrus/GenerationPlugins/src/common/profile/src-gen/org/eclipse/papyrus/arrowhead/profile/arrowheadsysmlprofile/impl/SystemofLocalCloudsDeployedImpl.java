/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudDeployed;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsDeployed;

import org.eclipse.papyrus.sysml16.blocks.internal.impl.BlockImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Systemof Local Clouds Deployed</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SystemofLocalCloudsDeployedImpl#getLocalCloudDeployed <em>Local Cloud Deployed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemofLocalCloudsDeployedImpl extends BlockImpl implements SystemofLocalCloudsDeployed {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemofLocalCloudsDeployedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadSysMLProfilePackage.Literals.SYSTEMOF_LOCAL_CLOUDS_DEPLOYED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocalCloudDeployed> getLocalCloudDeployed() {
		// TODO: implement this method to return the 'Local Cloud Deployed' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getLocalCloudDeployed(EList<LocalCloudDeployed> localCloudsDeployed) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_DEPLOYED__LOCAL_CLOUD_DEPLOYED:
				return getLocalCloudDeployed();
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
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_DEPLOYED__LOCAL_CLOUD_DEPLOYED:
				getLocalCloudDeployed().clear();
				getLocalCloudDeployed().addAll((Collection<? extends LocalCloudDeployed>)newValue);
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
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_DEPLOYED__LOCAL_CLOUD_DEPLOYED:
				getLocalCloudDeployed().clear();
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
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_DEPLOYED__LOCAL_CLOUD_DEPLOYED:
				return !getLocalCloudDeployed().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_DEPLOYED___GET_LOCAL_CLOUD_DEPLOYED__ELIST:
				getLocalCloudDeployed((EList<LocalCloudDeployed>)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SystemofLocalCloudsDeployedImpl
