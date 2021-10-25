/**
 */
package org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.Studio4EducationProfilePackage
 * @generated
 */
public interface Studio4EducationProfileFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Studio4EducationProfileFactory eINSTANCE = org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.impl.Studio4EducationProfileFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device</em>'.
	 * @generated
	 */
	Device createDevice();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Studio4EducationProfilePackage getStudio4EducationProfilePackage();

} //Studio4EducationProfileFactory
