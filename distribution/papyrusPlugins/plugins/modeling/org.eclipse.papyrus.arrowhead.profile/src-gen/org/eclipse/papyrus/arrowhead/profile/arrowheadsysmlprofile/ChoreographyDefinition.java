/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Collaboration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choreography Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ChoreographyDefinition#getBase_Collaboration <em>Base Collaboration</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getChoreographyDefinition()
 * @model
 * @generated
 */
public interface ChoreographyDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Collaboration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Collaboration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Collaboration</em>' reference.
	 * @see #setBase_Collaboration(Collaboration)
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getChoreographyDefinition_Base_Collaboration()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='extension_ChoreographyDefinition'"
	 * @generated
	 */
	Collaboration getBase_Collaboration();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ChoreographyDefinition#getBase_Collaboration <em>Base Collaboration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Collaboration</em>' reference.
	 * @see #getBase_Collaboration()
	 * @generated
	 */
	void setBase_Collaboration(Collaboration value);

} // ChoreographyDefinition
