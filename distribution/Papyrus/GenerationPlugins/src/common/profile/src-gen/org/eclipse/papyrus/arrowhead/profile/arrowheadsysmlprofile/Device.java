/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile;

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
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Device#getCertificateLevel <em>Certificate Level</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getDevice()
 * @model
 * @generated
 */
public interface Device extends Block {
	/**
	 * Returns the value of the '<em><b>Certificate Level</b></em>' attribute.
	 * The default value is <code>"Device"</code>.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CertificateKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Certificate Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certificate Level</em>' attribute.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CertificateKind
	 * @see #setCertificateLevel(CertificateKind)
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getDevice_CertificateLevel()
	 * @model default="Device" required="true" ordered="false"
	 * @generated
	 */
	CertificateKind getCertificateLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Device#getCertificateLevel <em>Certificate Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate Level</em>' attribute.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CertificateKind
	 * @see #getCertificateLevel()
	 * @generated
	 */
	void setCertificateLevel(CertificateKind value);

} // Device
