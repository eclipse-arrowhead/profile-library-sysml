/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile;

import org.eclipse.papyrus.sysml16.blocks.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sys Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysImplementation#getLocalcloudimplementation <em>Localcloudimplementation</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysImplementation#getDeviceimplementation <em>Deviceimplementation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getSysImplementation()
 * @model
 * @generated
 */
public interface SysImplementation extends Block {
	/**
	 * Returns the value of the '<em><b>Localcloudimplementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Localcloudimplementation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localcloudimplementation</em>' reference.
	 * @see #setLocalcloudimplementation(LocalCLoudImplementation)
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getSysImplementation_Localcloudimplementation()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='localcloud-implementation'"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='sys-implementation'"
	 * @generated
	 */
	LocalCLoudImplementation getLocalcloudimplementation();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysImplementation#getLocalcloudimplementation <em>Localcloudimplementation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Localcloudimplementation</em>' reference.
	 * @see #getLocalcloudimplementation()
	 * @generated
	 */
	void setLocalcloudimplementation(LocalCLoudImplementation value);

	/**
	 * Returns the value of the '<em><b>Deviceimplementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deviceimplementation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deviceimplementation</em>' reference.
	 * @see #setDeviceimplementation(DeviceImplementation)
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getSysImplementation_Deviceimplementation()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='device-implementation'"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='sys-implementation'"
	 * @generated
	 */
	DeviceImplementation getDeviceimplementation();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysImplementation#getDeviceimplementation <em>Deviceimplementation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deviceimplementation</em>' reference.
	 * @see #getDeviceimplementation()
	 * @generated
	 */
	void setDeviceimplementation(DeviceImplementation value);

} // SysImplementation
