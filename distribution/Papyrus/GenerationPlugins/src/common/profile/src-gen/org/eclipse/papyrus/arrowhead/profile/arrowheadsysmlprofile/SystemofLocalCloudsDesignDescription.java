/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.papyrus.sysml16.blocks.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Systemof Local Clouds Design Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsDesignDescription#getLCDD <em>LCDD</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getSystemofLocalCloudsDesignDescription()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='System-of-LocalClouds-DesignDescription'"
 * @generated
 */
public interface SystemofLocalCloudsDesignDescription extends Block {
	/**
	 * Returns the value of the '<em><b>LCDD</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCLoudDesignDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LCDD</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LCDD</em>' reference list.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getSystemofLocalCloudsDesignDescription_LCDD()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='SoLCDD'"
	 * @generated
	 */
	EList<LocalCLoudDesignDescription> getLCDD();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model LCDDRequired="true" LCDDOrdered="false"
	 * @generated
	 */
	void getLCDD(LocalCLoudDesignDescription LCDD);

} // SystemofLocalCloudsDesignDescription
