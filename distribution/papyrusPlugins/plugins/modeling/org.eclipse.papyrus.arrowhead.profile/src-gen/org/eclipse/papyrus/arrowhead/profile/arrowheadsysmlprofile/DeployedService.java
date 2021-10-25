/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployed Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedService#getDeployedServiceName <em>Deployed Service Name</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedService#getURL <em>URL</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedService#getPort <em>Port</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedService#getCertificate <em>Certificate</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedService#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedService#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getDeployedService()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='unnamed1'"
 * @generated
 */
public interface DeployedService extends EObject {
	/**
	 * Returns the value of the '<em><b>Deployed Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployed Service Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployed Service Name</em>' attribute.
	 * @see #setDeployedServiceName(String)
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getDeployedService_DeployedServiceName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDeployedServiceName();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedService#getDeployedServiceName <em>Deployed Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployed Service Name</em>' attribute.
	 * @see #getDeployedServiceName()
	 * @generated
	 */
	void setDeployedServiceName(String value);

	/**
	 * Returns the value of the '<em><b>URL</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URL</em>' attribute.
	 * @see #setURL(String)
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getDeployedService_URL()
	 * @model default="" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getURL();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedService#getURL <em>URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URL</em>' attribute.
	 * @see #getURL()
	 * @generated
	 */
	void setURL(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getDeployedService_Port()
	 * @model default="0" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedService#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Certificate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Certificate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certificate</em>' attribute.
	 * @see #setCertificate(String)
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getDeployedService_Certificate()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getCertificate();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedService#getCertificate <em>Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate</em>' attribute.
	 * @see #getCertificate()
	 * @generated
	 */
	void setCertificate(String value);

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.MetaDataEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' reference list.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getDeployedService_Metadata()
	 * @model ordered="false"
	 * @generated
	 */
	EList<MetaDataEntry> getMetadata();

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
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getDeployedService_Base_Property()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='extension_DeployedService'"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedService#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

} // DeployedService
