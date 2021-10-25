/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployed Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The identifier of any deployed entity is a string which (ideally) uniquely identifies that given entity in an SoS.
 * For making the identifiers compatible with the rest of the Arrowhead ecosystem, it is highly advisable to use the following conventions:
 * System identifiers: _systemname._devicename._protocol._transport._domain
 * Device identifiers: _devicename._localcloudname._interface._mac−protocol._macaddress
 * Local cloud identifiers: _gatekeeper−system−name._InterCloudNegotiations. _protocol._transport._domain:port
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedEntity#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getDeployedEntity()
 * @model
 * @generated
 */
public interface DeployedEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Property</em>' reference.
	 * @see #setBase_Property(Property)
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getDeployedEntity_Base_Property()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='extension_DeployedEntity'"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedEntity#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

} // DeployedEntity
