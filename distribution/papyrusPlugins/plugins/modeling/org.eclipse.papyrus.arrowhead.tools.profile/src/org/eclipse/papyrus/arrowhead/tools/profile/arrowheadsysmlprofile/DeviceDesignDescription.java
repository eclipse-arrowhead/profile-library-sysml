/**
 */
package org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.papyrus.sysml16.blocks.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Design Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * change the types of properties inside DeviceDesignDescription
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DeviceDesignDescription#getNetworkinterface <em>Networkinterface</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DeviceDesignDescription#getOperatingSystem <em>Operating System</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DeviceDesignDescription#getMemory <em>Memory</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DeviceDesignDescription#getProcessor <em>Processor</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DeviceDesignDescription#getCertificateLevel <em>Certificate Level</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DeviceDesignDescription#getDeviceDesign <em>Device Design</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getDeviceDesignDescription()
 * @model
 * @generated
 */
public interface DeviceDesignDescription extends Block, Identifiable {
	/**
	 * Returns the value of the '<em><b>Networkinterface</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Networkinterface</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Networkinterface</em>' attribute list.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getDeviceDesignDescription_Networkinterface()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getNetworkinterface();

	/**
	 * Returns the value of the '<em><b>Operating System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operating System</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operating System</em>' attribute.
	 * @see #setOperatingSystem(String)
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getDeviceDesignDescription_OperatingSystem()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getOperatingSystem();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DeviceDesignDescription#getOperatingSystem <em>Operating System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operating System</em>' attribute.
	 * @see #getOperatingSystem()
	 * @generated
	 */
	void setOperatingSystem(String value);

	/**
	 * Returns the value of the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory</em>' attribute.
	 * @see #setMemory(String)
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getDeviceDesignDescription_Memory()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getMemory();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DeviceDesignDescription#getMemory <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory</em>' attribute.
	 * @see #getMemory()
	 * @generated
	 */
	void setMemory(String value);

	/**
	 * Returns the value of the '<em><b>Processor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor</em>' attribute.
	 * @see #setProcessor(String)
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getDeviceDesignDescription_Processor()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getProcessor();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DeviceDesignDescription#getProcessor <em>Processor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor</em>' attribute.
	 * @see #getProcessor()
	 * @generated
	 */
	void setProcessor(String value);

	/**
	 * Returns the value of the '<em><b>Certificate Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.CertificateLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Certificate Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certificate Level</em>' attribute.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.CertificateLevel
	 * @see #setCertificateLevel(CertificateLevel)
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getDeviceDesignDescription_CertificateLevel()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CertificateLevel getCertificateLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DeviceDesignDescription#getCertificateLevel <em>Certificate Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate Level</em>' attribute.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.CertificateLevel
	 * @see #getCertificateLevel()
	 * @generated
	 */
	void setCertificateLevel(CertificateLevel value);

	/**
	 * Returns the value of the '<em><b>Device Design</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Design</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Design</em>' attribute.
	 * @see #setDeviceDesign(String)
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getDeviceDesignDescription_DeviceDesign()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDeviceDesign();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DeviceDesignDescription#getDeviceDesign <em>Device Design</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Design</em>' attribute.
	 * @see #getDeviceDesign()
	 * @generated
	 */
	void setDeviceDesign(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ports of DeviceDesignDescription must be typed by NetworkDesignDescription
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean Constraint53(DiagnosticChain diagnostics, Map<Object, Object> context);

} // DeviceDesignDescription
