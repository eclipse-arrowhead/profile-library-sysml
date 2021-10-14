/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCLoudDesignDescription;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsDesignDescription;

import org.eclipse.papyrus.sysml16.blocks.internal.impl.BlockImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Systemof Local Clouds Design Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SystemofLocalCloudsDesignDescriptionImpl#getLCDD <em>LCDD</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemofLocalCloudsDesignDescriptionImpl extends BlockImpl implements SystemofLocalCloudsDesignDescription {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemofLocalCloudsDesignDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadSysMLProfilePackage.Literals.SYSTEMOF_LOCAL_CLOUDS_DESIGN_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocalCLoudDesignDescription> getLCDD() {
		// TODO: implement this method to return the 'LCDD' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getLCDD(LocalCLoudDesignDescription LCDD) {
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
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_DESIGN_DESCRIPTION__LCDD:
				return getLCDD();
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
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_DESIGN_DESCRIPTION__LCDD:
				getLCDD().clear();
				getLCDD().addAll((Collection<? extends LocalCLoudDesignDescription>)newValue);
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
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_DESIGN_DESCRIPTION__LCDD:
				getLCDD().clear();
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
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_DESIGN_DESCRIPTION__LCDD:
				return !getLCDD().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_DESIGN_DESCRIPTION___GET_LCDD__LOCALCLOUDDESIGNDESCRIPTION:
				getLCDD((LocalCLoudDesignDescription)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SystemofLocalCloudsDesignDescriptionImpl
