/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Evolution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkEvolution#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkEvolution#getNetworkdeployed <em>Networkdeployed</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getNetworkEvolution()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Network-Evolution'"
 * @generated
 */
public interface NetworkEvolution extends EObject {
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
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getNetworkEvolution_Base_Class()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='extension_Network-Evolution'"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkEvolution#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Networkdeployed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Networkdeployed</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Networkdeployed</em>' reference.
	 * @see #setNetworkdeployed(NetworkDeployed)
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getNetworkEvolution_Networkdeployed()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='network-deployed'"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='network-evolution'"
	 * @generated
	 */
	NetworkDeployed getNetworkdeployed();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkEvolution#getNetworkdeployed <em>Networkdeployed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Networkdeployed</em>' reference.
	 * @see #getNetworkdeployed()
	 * @generated
	 */
	void setNetworkdeployed(NetworkDeployed value);

} // NetworkEvolution
