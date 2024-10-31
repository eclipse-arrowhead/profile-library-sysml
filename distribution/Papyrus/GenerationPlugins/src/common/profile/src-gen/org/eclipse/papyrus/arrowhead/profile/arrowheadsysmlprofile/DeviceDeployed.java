/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.papyrus.sysml16.blocks.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Deployed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceDeployed#getLocalclouddeployed <em>Localclouddeployed</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceDeployed#getNetworkdeployed <em>Networkdeployed</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getDeviceDeployed()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Device-Deployed'"
 * @generated
 */
public interface DeviceDeployed extends Block {
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
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getDeviceDeployed_Localclouddeployed()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='localcloud-deployed'"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='device-deployed'"
	 * @generated
	 */
	LocalCloudDeployed getLocalclouddeployed();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceDeployed#getLocalclouddeployed <em>Localclouddeployed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Localclouddeployed</em>' reference.
	 * @see #getLocalclouddeployed()
	 * @generated
	 */
	void setLocalclouddeployed(LocalCloudDeployed value);

	/**
	 * Returns the value of the '<em><b>Networkdeployed</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkDeployed}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Networkdeployed</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Networkdeployed</em>' reference list.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getDeviceDeployed_Networkdeployed()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='network-deployed'"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='device-deployed'"
	 * @generated
	 */
	EList<NetworkDeployed> getNetworkdeployed();

} // DeviceDeployed
