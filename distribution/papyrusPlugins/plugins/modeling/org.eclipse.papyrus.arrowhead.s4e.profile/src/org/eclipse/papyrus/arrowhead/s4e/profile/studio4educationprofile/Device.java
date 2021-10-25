/**
 */
package org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile;

import org.eclipse.papyrus.sysml16.blocks.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.Device#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.Device#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.Device#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.Studio4EducationProfilePackage#getDevice()
 * @model
 * @generated
 */
public interface Device extends Block {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.Studio4EducationProfilePackage#getDevice_Label()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.Device#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.DeviceKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.DeviceKind
	 * @see #setKind(DeviceKind)
	 * @see org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.Studio4EducationProfilePackage#getDevice_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DeviceKind getKind();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.Device#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.DeviceKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(DeviceKind value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(String)
	 * @see org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.Studio4EducationProfilePackage#getDevice_Level()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.Device#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(String value);

} // Device
