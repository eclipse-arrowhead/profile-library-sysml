/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Systemof Local Clouds Maintenance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsMaintenance#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsMaintenance#getSystemoflocalcloudsdeployed <em>Systemoflocalcloudsdeployed</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getSystemofLocalCloudsMaintenance()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='System-of-LocalClouds-Maintenance'"
 * @generated
 */
public interface SystemofLocalCloudsMaintenance extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getSystemofLocalCloudsMaintenance_Base_Class()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='extension_System-of-LocalClouds-Maintenance'"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsMaintenance#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Systemoflocalcloudsdeployed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Systemoflocalcloudsdeployed</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systemoflocalcloudsdeployed</em>' reference.
	 * @see #setSystemoflocalcloudsdeployed(SystemofLocalCloudsDeployed)
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getSystemofLocalCloudsMaintenance_Systemoflocalcloudsdeployed()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='system-of-localclouds-deployed'"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='system-of-localclouds-maintenance'"
	 * @generated
	 */
	SystemofLocalCloudsDeployed getSystemoflocalcloudsdeployed();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsMaintenance#getSystemoflocalcloudsdeployed <em>Systemoflocalcloudsdeployed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Systemoflocalcloudsdeployed</em>' reference.
	 * @see #getSystemoflocalcloudsdeployed()
	 * @generated
	 */
	void setSystemoflocalcloudsdeployed(SystemofLocalCloudsDeployed value);

} // SystemofLocalCloudsMaintenance
