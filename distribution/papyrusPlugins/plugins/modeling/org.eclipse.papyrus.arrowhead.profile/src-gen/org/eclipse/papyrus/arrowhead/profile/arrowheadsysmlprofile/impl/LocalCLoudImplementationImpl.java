/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCLoudImplementation;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsImplementation;

import org.eclipse.papyrus.sysml16.blocks.internal.impl.BlockImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local CLoud Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.LocalCLoudImplementationImpl#getSystemoflocalcloudsimplementation <em>Systemoflocalcloudsimplementation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalCLoudImplementationImpl extends BlockImpl implements LocalCLoudImplementation {
	/**
	 * The cached value of the '{@link #getSystemoflocalcloudsimplementation() <em>Systemoflocalcloudsimplementation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemoflocalcloudsimplementation()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemofLocalCloudsImplementation> systemoflocalcloudsimplementation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalCLoudImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadSysMLProfilePackage.Literals.LOCAL_CLOUD_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemofLocalCloudsImplementation> getSystemoflocalcloudsimplementation() {
		if (systemoflocalcloudsimplementation == null) {
			systemoflocalcloudsimplementation = new EObjectResolvingEList<SystemofLocalCloudsImplementation>(SystemofLocalCloudsImplementation.class, this, ArrowheadSysMLProfilePackage.LOCAL_CLOUD_IMPLEMENTATION__SYSTEMOFLOCALCLOUDSIMPLEMENTATION);
		}
		return systemoflocalcloudsimplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.LOCAL_CLOUD_IMPLEMENTATION__SYSTEMOFLOCALCLOUDSIMPLEMENTATION:
				return getSystemoflocalcloudsimplementation();
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
			case ArrowheadSysMLProfilePackage.LOCAL_CLOUD_IMPLEMENTATION__SYSTEMOFLOCALCLOUDSIMPLEMENTATION:
				getSystemoflocalcloudsimplementation().clear();
				getSystemoflocalcloudsimplementation().addAll((Collection<? extends SystemofLocalCloudsImplementation>)newValue);
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
			case ArrowheadSysMLProfilePackage.LOCAL_CLOUD_IMPLEMENTATION__SYSTEMOFLOCALCLOUDSIMPLEMENTATION:
				getSystemoflocalcloudsimplementation().clear();
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
			case ArrowheadSysMLProfilePackage.LOCAL_CLOUD_IMPLEMENTATION__SYSTEMOFLOCALCLOUDSIMPLEMENTATION:
				return systemoflocalcloudsimplementation != null && !systemoflocalcloudsimplementation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LocalCLoudImplementationImpl
