/**
 */
package org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IDD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.IDD#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.IDD#getCertificate <em>Certificate</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getIDD()
 * @model
 * @generated
 */
public interface IDD extends SD {
	/**
	 * Returns the value of the '<em><b>Security</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SecurityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' attribute.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SecurityKind
	 * @see #setSecurity(SecurityKind)
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getIDD_Security()
	 * @model ordered="false"
	 * @generated
	 */
	SecurityKind getSecurity();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.IDD#getSecurity <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security</em>' attribute.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SecurityKind
	 * @see #getSecurity()
	 * @generated
	 */
	void setSecurity(SecurityKind value);

	/**
	 * Returns the value of the '<em><b>Certificate</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.CertificateKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Certificate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certificate</em>' attribute.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.CertificateKind
	 * @see #setCertificate(CertificateKind)
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getIDD_Certificate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CertificateKind getCertificate();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.IDD#getCertificate <em>Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate</em>' attribute.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.CertificateKind
	 * @see #getCertificate()
	 * @generated
	 */
	void setCertificate(CertificateKind value);

} // IDD
