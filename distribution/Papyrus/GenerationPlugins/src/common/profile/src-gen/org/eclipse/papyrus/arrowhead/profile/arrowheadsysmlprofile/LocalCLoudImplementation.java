/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.papyrus.sysml16.blocks.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local CLoud Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCLoudImplementation#getSystemoflocalcloudsimplementation <em>Systemoflocalcloudsimplementation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getLocalCLoudImplementation()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='LocalCLoud-Implementation'"
 * @generated
 */
public interface LocalCLoudImplementation extends Block {
	/**
	 * Returns the value of the '<em><b>Systemoflocalcloudsimplementation</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsImplementation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Systemoflocalcloudsimplementation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systemoflocalcloudsimplementation</em>' reference list.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getLocalCLoudImplementation_Systemoflocalcloudsimplementation()
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='system-of-localclouds-implementation'"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='localcloud-implementation'"
	 * @generated
	 */
	EList<SystemofLocalCloudsImplementation> getSystemoflocalcloudsimplementation();

} // LocalCLoudImplementation
