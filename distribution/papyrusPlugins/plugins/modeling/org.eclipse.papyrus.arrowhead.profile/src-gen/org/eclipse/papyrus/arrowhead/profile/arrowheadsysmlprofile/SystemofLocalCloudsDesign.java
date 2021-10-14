/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.papyrus.sysml16.blocks.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Systemof Local Clouds Design</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsDesign#getLCD <em>LCD</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getSystemofLocalCloudsDesign()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='System-of-LocalClouds-Design'"
 * @generated
 */
public interface SystemofLocalCloudsDesign extends Block {
	/**
	 * Returns the value of the '<em><b>LCD</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudDesign}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LCD</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LCD</em>' reference list.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getSystemofLocalCloudsDesign_LCD()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='SoLCD'"
	 * @generated
	 */
	EList<LocalCloudDesign> getLCD();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model LCDRequired="true" LCDOrdered="false"
	 * @generated
	 */
	void getLCD(LocalCloudDesign LCD);

} // SystemofLocalCloudsDesign
