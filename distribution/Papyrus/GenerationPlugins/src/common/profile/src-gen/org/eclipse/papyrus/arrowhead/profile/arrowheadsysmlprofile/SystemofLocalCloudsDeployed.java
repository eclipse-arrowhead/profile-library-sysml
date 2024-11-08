/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.papyrus.sysml16.blocks.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Systemof Local Clouds Deployed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsDeployed#getLocalCloudDeployed <em>Local Cloud Deployed</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getSystemofLocalCloudsDeployed()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='System-of-LocalClouds-Deployed'"
 * @generated
 */
public interface SystemofLocalCloudsDeployed extends Block {
	/**
	 * Returns the value of the '<em><b>Local Cloud Deployed</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudDeployed}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Cloud Deployed</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Cloud Deployed</em>' reference list.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getSystemofLocalCloudsDeployed_LocalCloudDeployed()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='localCloud-Deployed'"
	 * @generated
	 */
	EList<LocalCloudDeployed> getLocalCloudDeployed();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model localCloudsDeployedMany="true" localCloudsDeployedOrdered="false"
	 *        localCloudsDeployedAnnotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='localClouds-Deployed'"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getLocalCloud-Deployed'"
	 * @generated
	 */
	void getLocalCloudDeployed(EList<LocalCloudDeployed> localCloudsDeployed);

} // SystemofLocalCloudsDeployed
