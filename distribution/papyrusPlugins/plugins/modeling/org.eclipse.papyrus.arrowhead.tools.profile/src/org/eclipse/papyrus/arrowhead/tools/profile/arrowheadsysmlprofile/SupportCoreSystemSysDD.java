/**
 */
package org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Support Core System Sys DD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SupportCoreSystemSysDD#getSystemKind <em>System Kind</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getSupportCoreSystemSysDD()
 * @model
 * @generated
 */
public interface SupportCoreSystemSysDD extends SysDD {
	/**
	 * Returns the value of the '<em><b>System Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SupportCoreSystemKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Kind</em>' attribute.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SupportCoreSystemKind
	 * @see #setSystemKind(SupportCoreSystemKind)
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getSupportCoreSystemSysDD_SystemKind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SupportCoreSystemKind getSystemKind();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SupportCoreSystemSysDD#getSystemKind <em>System Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Kind</em>' attribute.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SupportCoreSystemKind
	 * @see #getSystemKind()
	 * @generated
	 */
	void setSystemKind(SupportCoreSystemKind value);

} // SupportCoreSystemSysDD
