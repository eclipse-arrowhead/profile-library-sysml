/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile;

import org.eclipse.papyrus.sysml16.blocks.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sys DD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysDD#getCertificateLevel <em>Certificate Level</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysDD#getDevicedesigndesciption <em>Devicedesigndesciption</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getSysDD()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='Deployed at Device'"
 * @generated
 */
public interface SysDD extends Block {
	/**
	 * Returns the value of the '<em><b>Certificate Level</b></em>' attribute.
	 * The default value is <code>"System"</code>.
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
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getSysDD_CertificateLevel()
	 * @model default="System" required="true" ordered="false"
	 * @generated
	 */
	CertificateKind getCertificateLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysDD#getCertificateLevel <em>Certificate Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate Level</em>' attribute.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CertificateKind
	 * @see #getCertificateLevel()
	 * @generated
	 */
	void setCertificateLevel(CertificateKind value);

	/**
	 * Returns the value of the '<em><b>Devicedesigndesciption</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Devicedesigndesciption</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devicedesigndesciption</em>' reference.
	 * @see #setDevicedesigndesciption(DeviceDesignDesciption)
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getSysDD_Devicedesigndesciption()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='device-designdesciption'"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='sysdd'"
	 * @generated
	 */
	DeviceDesignDesciption getDevicedesigndesciption();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysDD#getDevicedesigndesciption <em>Devicedesigndesciption</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Devicedesigndesciption</em>' reference.
	 * @see #getDevicedesigndesciption()
	 * @generated
	 */
	void setDevicedesigndesciption(DeviceDesignDesciption value);

} // SysDD
