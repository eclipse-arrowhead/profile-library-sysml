/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile;

import org.eclipse.papyrus.sysml16.blocks.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Design Desciption</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceDesignDesciption#getCertificateLevel <em>Certificate Level</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceDesignDesciption#getNetworkDesignDescription <em>Network Design Description</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getDeviceDesignDesciption()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Device-DesignDesciption'"
 * @generated
 */
public interface DeviceDesignDesciption extends Block {
	/**
	 * Returns the value of the '<em><b>Certificate Level</b></em>' attribute.
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
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getDeviceDesignDesciption_CertificateLevel()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CertificateKind getCertificateLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceDesignDesciption#getCertificateLevel <em>Certificate Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate Level</em>' attribute.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CertificateKind
	 * @see #getCertificateLevel()
	 * @generated
	 */
	void setCertificateLevel(CertificateKind value);

	/**
	 * Returns the value of the '<em><b>Network Design Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Design Description</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Design Description</em>' reference.
	 * @see #setNetworkDesignDescription(NetworkDesignDescriptiion)
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getDeviceDesignDesciption_NetworkDesignDescription()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='network-DesignDescription'"
	 * @generated
	 */
	NetworkDesignDescriptiion getNetworkDesignDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceDesignDesciption#getNetworkDesignDescription <em>Network Design Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Design Description</em>' reference.
	 * @see #getNetworkDesignDescription()
	 * @generated
	 */
	void setNetworkDesignDescription(NetworkDesignDescriptiion value);

} // DeviceDesignDesciption
