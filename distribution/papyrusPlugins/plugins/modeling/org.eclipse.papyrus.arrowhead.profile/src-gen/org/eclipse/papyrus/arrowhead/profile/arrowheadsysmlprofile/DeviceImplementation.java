/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.papyrus.sysml16.blocks.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceImplementation#getNetworkimplementation <em>Networkimplementation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getDeviceImplementation()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Device-Implementation'"
 * @generated
 */
public interface DeviceImplementation extends Block {
	/**
	 * Returns the value of the '<em><b>Networkimplementation</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkImplementation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Networkimplementation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Networkimplementation</em>' reference list.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getDeviceImplementation_Networkimplementation()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='network-implementation'"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='device-implementation'"
	 * @generated
	 */
	EList<NetworkImplementation> getNetworkimplementation();

} // DeviceImplementation
