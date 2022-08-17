/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Cloud Maintenance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudMaintenance#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudMaintenance#getSystemoflocalcloudsmaintenance <em>Systemoflocalcloudsmaintenance</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudMaintenance#getLocalclouddeployed <em>Localclouddeployed</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getLocalCloudMaintenance()
 * @model
 * @generated
 */
public interface LocalCloudMaintenance extends EObject {
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
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getLocalCloudMaintenance_Base_Class()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='extension_LocalCloud-Maintenance'"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudMaintenance#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Systemoflocalcloudsmaintenance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Systemoflocalcloudsmaintenance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systemoflocalcloudsmaintenance</em>' reference.
	 * @see #setSystemoflocalcloudsmaintenance(SystemofLocalCloudsMaintenance)
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getLocalCloudMaintenance_Systemoflocalcloudsmaintenance()
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='system-of-localclouds-maintenance'"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='localcloud-maintenance'"
	 * @generated
	 */
	SystemofLocalCloudsMaintenance getSystemoflocalcloudsmaintenance();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudMaintenance#getSystemoflocalcloudsmaintenance <em>Systemoflocalcloudsmaintenance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Systemoflocalcloudsmaintenance</em>' reference.
	 * @see #getSystemoflocalcloudsmaintenance()
	 * @generated
	 */
	void setSystemoflocalcloudsmaintenance(SystemofLocalCloudsMaintenance value);

	/**
	 * Returns the value of the '<em><b>Localclouddeployed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Localclouddeployed</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localclouddeployed</em>' reference.
	 * @see #setLocalclouddeployed(LocalCloudDeployed)
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getLocalCloudMaintenance_Localclouddeployed()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='localcloud-deployed'"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='localcloud-maintenance'"
	 * @generated
	 */
	LocalCloudDeployed getLocalclouddeployed();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudMaintenance#getLocalclouddeployed <em>Localclouddeployed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Localclouddeployed</em>' reference.
	 * @see #getLocalclouddeployed()
	 * @generated
	 */
	void setLocalclouddeployed(LocalCloudDeployed value);

} // LocalCloudMaintenance
