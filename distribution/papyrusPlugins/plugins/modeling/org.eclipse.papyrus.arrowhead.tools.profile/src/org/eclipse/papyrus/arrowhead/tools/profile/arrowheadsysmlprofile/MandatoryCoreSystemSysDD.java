/**
 */
package org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mandatory Core System Sys DD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.MandatoryCoreSystemSysDD#getSystemKind <em>System Kind</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getMandatoryCoreSystemSysDD()
 * @model
 * @generated
 */
public interface MandatoryCoreSystemSysDD extends SysDD {
	/**
	 * Returns the value of the '<em><b>System Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.MandatoryCoreSystemKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Kind</em>' attribute.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.MandatoryCoreSystemKind
	 * @see #setSystemKind(MandatoryCoreSystemKind)
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getMandatoryCoreSystemSysDD_SystemKind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MandatoryCoreSystemKind getSystemKind();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.MandatoryCoreSystemSysDD#getSystemKind <em>System Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Kind</em>' attribute.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.MandatoryCoreSystemKind
	 * @see #getSystemKind()
	 * @generated
	 */
	void setSystemKind(MandatoryCoreSystemKind value);

} // MandatoryCoreSystemSysDD
