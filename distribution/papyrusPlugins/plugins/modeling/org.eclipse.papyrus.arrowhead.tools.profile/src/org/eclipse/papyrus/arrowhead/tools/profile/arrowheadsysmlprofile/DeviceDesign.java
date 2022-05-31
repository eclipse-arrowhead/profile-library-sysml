/**
 */
package org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.papyrus.sysml16.blocks.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Design</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DeviceDesign#getNetworkDesign <em>Network Design</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getDeviceDesign()
 * @model
 * @generated
 */
public interface DeviceDesign extends Block, Identifiable {
	/**
	 * Returns the value of the '<em><b>Network Design</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.PhysicalLayerKind}.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.PhysicalLayerKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Design</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Design</em>' attribute list.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.PhysicalLayerKind
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getDeviceDesign_NetworkDesign()
	 * @model ordered="false"
	 * @generated
	 */
	EList<PhysicalLayerKind> getNetworkDesign();

} // DeviceDesign
