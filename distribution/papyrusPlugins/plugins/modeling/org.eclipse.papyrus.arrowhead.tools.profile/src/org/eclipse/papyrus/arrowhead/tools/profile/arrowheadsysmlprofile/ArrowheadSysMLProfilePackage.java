/**
 */
package org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.papyrus.sysml16.blocks.BlocksPackage;

import org.eclipse.papyrus.sysml16.portsandflows.PortsAndFlowsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ArrowheadSysMLProfileFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Arrowhead'"
 * @generated
 */
public interface ArrowheadSysMLProfilePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "arrowheadsysmlprofile";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://Papyrus/ArrowheadSysMLProfile";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ArrowheadSysMLProfile";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArrowheadSysMLProfilePackage eINSTANCE = org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.SysDDImpl <em>Sys DD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.SysDDImpl
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSysDD()
	 * @generated
	 */
	int SYS_DD = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_DD__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_DD__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Certificate Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_DD__CERTIFICATE_LEVEL = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sys DD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_DD_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_DD___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_DD___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_DD___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;

	/**
	 * The operation id for the '<em>Deployedat Device</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_DD___DEPLOYEDAT_DEVICE__DIAGNOSTICCHAIN_MAP = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Constraint27</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_DD___CONSTRAINT27__DIAGNOSTICCHAIN_MAP = BlocksPackage.BLOCK_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sys DD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_DD_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.IdentifiableImpl <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.IdentifiableImpl
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getIdentifiable()
	 * @generated
	 */
	int IDENTIFIABLE = 1;

	/**
	 * The number of structural features of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.DeviceDesignDescriptionImpl <em>Device Design Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.DeviceDesignDescriptionImpl
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDeviceDesignDescription()
	 * @generated
	 */
	int DEVICE_DESIGN_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_DESCRIPTION__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_DESCRIPTION__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Networkinterface</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_DESCRIPTION__NETWORKINTERFACE = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operating System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_DESCRIPTION__OPERATING_SYSTEM = BlocksPackage.BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_DESCRIPTION__MEMORY = BlocksPackage.BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Processor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_DESCRIPTION__PROCESSOR = BlocksPackage.BLOCK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Certificate Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_DESCRIPTION__CERTIFICATE_LEVEL = BlocksPackage.BLOCK_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Device Design</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_DESCRIPTION__DEVICE_DESIGN = BlocksPackage.BLOCK_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Device Design Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_DESCRIPTION_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_DESCRIPTION___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_DESCRIPTION___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_DESCRIPTION___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;

	/**
	 * The operation id for the '<em>Constraint53</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_DESCRIPTION___CONSTRAINT53__DIAGNOSTICCHAIN_MAP = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Device Design Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_DESCRIPTION_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.DeviceDesignImpl <em>Device Design</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.DeviceDesignImpl
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDeviceDesign()
	 * @generated
	 */
	int DEVICE_DESIGN = 3;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Network Design</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN__NETWORK_DESIGN = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Device Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Device Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.LocalCloudDesignImpl <em>Local Cloud Design</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.LocalCloudDesignImpl
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getLocalCloudDesign()
	 * @generated
	 */
	int LOCAL_CLOUD_DESIGN = 4;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_DESIGN__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_DESIGN__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Sysd</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_DESIGN__SYSD = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Local Cloud Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_DESIGN_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_DESIGN___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_DESIGN___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_DESIGN___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Local Cloud Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_DESIGN_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.SysDImpl <em>Sys D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.SysDImpl
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSysD()
	 * @generated
	 */
	int SYS_D = 5;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_D__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_D__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>System Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_D__SYSTEM_KIND = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sys D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_D_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_D___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_D___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_D___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;

	/**
	 * The operation id for the '<em>Constraint180</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_D___CONSTRAINT180__DIAGNOSTICCHAIN_MAP = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sys D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_D_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.LocalCLoudDesignDescriptionImpl <em>Local CLoud Design Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.LocalCLoudDesignDescriptionImpl
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getLocalCLoudDesignDescription()
	 * @generated
	 */
	int LOCAL_CLOUD_DESIGN_DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_DESIGN_DESCRIPTION__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_DESIGN_DESCRIPTION__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The number of structural features of the '<em>Local CLoud Design Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_DESIGN_DESCRIPTION_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_DESIGN_DESCRIPTION___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_DESIGN_DESCRIPTION___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_DESIGN_DESCRIPTION___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Local CLoud Design Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_DESIGN_DESCRIPTION_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.NetworkDesignImpl <em>Network Design</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.NetworkDesignImpl
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getNetworkDesign()
	 * @generated
	 */
	int NETWORK_DESIGN = 7;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DESIGN__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DESIGN__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The number of structural features of the '<em>Network Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DESIGN_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DESIGN___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DESIGN___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DESIGN___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Network Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DESIGN_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.NetworkDesignDescriptiionImpl <em>Network Design Descriptiion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.NetworkDesignDescriptiionImpl
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getNetworkDesignDescriptiion()
	 * @generated
	 */
	int NETWORK_DESIGN_DESCRIPTIION = 8;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DESIGN_DESCRIPTIION__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DESIGN_DESCRIPTIION__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The number of structural features of the '<em>Network Design Descriptiion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DESIGN_DESCRIPTIION_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DESIGN_DESCRIPTIION___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DESIGN_DESCRIPTIION___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DESIGN_DESCRIPTIION___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Network Design Descriptiion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DESIGN_DESCRIPTIION_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.SystemofLocalCloudsDesignImpl <em>Systemof Local Clouds Design</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.SystemofLocalCloudsDesignImpl
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSystemofLocalCloudsDesign()
	 * @generated
	 */
	int SYSTEMOF_LOCAL_CLOUDS_DESIGN = 9;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_DESIGN__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_DESIGN__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The number of structural features of the '<em>Systemof Local Clouds Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_DESIGN_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_DESIGN___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_DESIGN___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_DESIGN___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;

	/**
	 * The operation id for the '<em>So LC Dproperty Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_DESIGN___SO_LC_DPROPERTY_TYPE__DIAGNOSTICCHAIN_MAP = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Systemof Local Clouds Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_DESIGN_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.SystemofLocalCloudsDesignDescriptionImpl <em>Systemof Local Clouds Design Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.SystemofLocalCloudsDesignDescriptionImpl
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSystemofLocalCloudsDesignDescription()
	 * @generated
	 */
	int SYSTEMOF_LOCAL_CLOUDS_DESIGN_DESCRIPTION = 10;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_DESIGN_DESCRIPTION__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_DESIGN_DESCRIPTION__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The number of structural features of the '<em>Systemof Local Clouds Design Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_DESIGN_DESCRIPTION_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_DESIGN_DESCRIPTION___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_DESIGN_DESCRIPTION___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_DESIGN_DESCRIPTION___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Systemof Local Clouds Design Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_DESIGN_DESCRIPTION_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ConsumerImpl <em>Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ConsumerImpl
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getConsumer()
	 * @generated
	 */
	int CONSUMER = 11;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER__BASE_PORT = PortsAndFlowsPackage.FULL_PORT__BASE_PORT;

	/**
	 * The number of structural features of the '<em>Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_FEATURE_COUNT = PortsAndFlowsPackage.FULL_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_OPERATION_COUNT = PortsAndFlowsPackage.FULL_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ProviderImpl <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ProviderImpl
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getProvider()
	 * @generated
	 */
	int PROVIDER = 12;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__BASE_PORT = PortsAndFlowsPackage.FULL_PORT__BASE_PORT;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_FEATURE_COUNT = PortsAndFlowsPackage.FULL_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_OPERATION_COUNT = PortsAndFlowsPackage.FULL_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.SDImpl <em>SD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.SDImpl
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSD()
	 * @generated
	 */
	int SD = 14;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD__BASE_CLASS = PortsAndFlowsPackage.INTERFACE_BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD__IS_ENCAPSULATED = PortsAndFlowsPackage.INTERFACE_BLOCK__IS_ENCAPSULATED;

	/**
	 * The number of structural features of the '<em>SD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_FEATURE_COUNT = PortsAndFlowsPackage.INTERFACE_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD___GET_REFERENCES = PortsAndFlowsPackage.INTERFACE_BLOCK___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD___GET_PARTS = PortsAndFlowsPackage.INTERFACE_BLOCK___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD___GET_FLOW_PROPERTIES = PortsAndFlowsPackage.INTERFACE_BLOCK___GET_FLOW_PROPERTIES;

	/**
	 * The operation id for the '<em>Get Conjugated</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD___GET_CONJUGATED = PortsAndFlowsPackage.INTERFACE_BLOCK___GET_CONJUGATED;

	/**
	 * The number of operations of the '<em>SD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_OPERATION_COUNT = PortsAndFlowsPackage.INTERFACE_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.IDDImpl <em>IDD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.IDDImpl
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getIDD()
	 * @generated
	 */
	int IDD = 13;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD__BASE_CLASS = SD__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD__IS_ENCAPSULATED = SD__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Security</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD__SECURITY = SD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Certificate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD__CERTIFICATE = SD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IDD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD_FEATURE_COUNT = SD_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD___GET_REFERENCES = SD___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD___GET_PARTS = SD___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD___GET_FLOW_PROPERTIES = SD___GET_FLOW_PROPERTIES;

	/**
	 * The operation id for the '<em>Get Conjugated</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD___GET_CONJUGATED = SD___GET_CONJUGATED;

	/**
	 * The number of operations of the '<em>IDD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDD_OPERATION_COUNT = SD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.MandatoryCoreSystemSysDImpl <em>Mandatory Core System Sys D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.MandatoryCoreSystemSysDImpl
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getMandatoryCoreSystemSysD()
	 * @generated
	 */
	int MANDATORY_CORE_SYSTEM_SYS_D = 15;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_CORE_SYSTEM_SYS_D__BASE_CLASS = SYS_D__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_CORE_SYSTEM_SYS_D__IS_ENCAPSULATED = SYS_D__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>System Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_CORE_SYSTEM_SYS_D__SYSTEM_KIND = SYS_D__SYSTEM_KIND;

	/**
	 * The number of structural features of the '<em>Mandatory Core System Sys D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_CORE_SYSTEM_SYS_D_FEATURE_COUNT = SYS_D_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_CORE_SYSTEM_SYS_D___GET_REFERENCES = SYS_D___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_CORE_SYSTEM_SYS_D___GET_PARTS = SYS_D___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_CORE_SYSTEM_SYS_D___GET_FLOW_PROPERTIES = SYS_D___GET_FLOW_PROPERTIES;

	/**
	 * The operation id for the '<em>Constraint180</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_CORE_SYSTEM_SYS_D___CONSTRAINT180__DIAGNOSTICCHAIN_MAP = SYS_D___CONSTRAINT180__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Mandatory Core System Sys D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_CORE_SYSTEM_SYS_D_OPERATION_COUNT = SYS_D_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.SupportCoreSystemSysDImpl <em>Support Core System Sys D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.SupportCoreSystemSysDImpl
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSupportCoreSystemSysD()
	 * @generated
	 */
	int SUPPORT_CORE_SYSTEM_SYS_D = 16;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_CORE_SYSTEM_SYS_D__BASE_CLASS = SYS_D__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_CORE_SYSTEM_SYS_D__IS_ENCAPSULATED = SYS_D__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>System Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_CORE_SYSTEM_SYS_D__SYSTEM_KIND = SYS_D__SYSTEM_KIND;

	/**
	 * The number of structural features of the '<em>Support Core System Sys D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_CORE_SYSTEM_SYS_D_FEATURE_COUNT = SYS_D_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_CORE_SYSTEM_SYS_D___GET_REFERENCES = SYS_D___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_CORE_SYSTEM_SYS_D___GET_PARTS = SYS_D___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_CORE_SYSTEM_SYS_D___GET_FLOW_PROPERTIES = SYS_D___GET_FLOW_PROPERTIES;

	/**
	 * The operation id for the '<em>Constraint180</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_CORE_SYSTEM_SYS_D___CONSTRAINT180__DIAGNOSTICCHAIN_MAP = SYS_D___CONSTRAINT180__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Support Core System Sys D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_CORE_SYSTEM_SYS_D_OPERATION_COUNT = SYS_D_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ApplicationSysDImpl <em>Application Sys D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ApplicationSysDImpl
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getApplicationSysD()
	 * @generated
	 */
	int APPLICATION_SYS_D = 17;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SYS_D__BASE_CLASS = SYS_D__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SYS_D__IS_ENCAPSULATED = SYS_D__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>System Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SYS_D__SYSTEM_KIND = SYS_D__SYSTEM_KIND;

	/**
	 * The number of structural features of the '<em>Application Sys D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SYS_D_FEATURE_COUNT = SYS_D_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SYS_D___GET_REFERENCES = SYS_D___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SYS_D___GET_PARTS = SYS_D___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SYS_D___GET_FLOW_PROPERTIES = SYS_D___GET_FLOW_PROPERTIES;

	/**
	 * The operation id for the '<em>Constraint180</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SYS_D___CONSTRAINT180__DIAGNOSTICCHAIN_MAP = SYS_D___CONSTRAINT180__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Application Sys D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SYS_D_OPERATION_COUNT = SYS_D_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.MandatoryCoreSystemSysDDImpl <em>Mandatory Core System Sys DD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.MandatoryCoreSystemSysDDImpl
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getMandatoryCoreSystemSysDD()
	 * @generated
	 */
	int MANDATORY_CORE_SYSTEM_SYS_DD = 18;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_CORE_SYSTEM_SYS_DD__BASE_CLASS = SYS_DD__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_CORE_SYSTEM_SYS_DD__IS_ENCAPSULATED = SYS_DD__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Certificate Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_CORE_SYSTEM_SYS_DD__CERTIFICATE_LEVEL = SYS_DD__CERTIFICATE_LEVEL;

	/**
	 * The feature id for the '<em><b>System Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_CORE_SYSTEM_SYS_DD__SYSTEM_KIND = SYS_DD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mandatory Core System Sys DD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_CORE_SYSTEM_SYS_DD_FEATURE_COUNT = SYS_DD_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_CORE_SYSTEM_SYS_DD___GET_REFERENCES = SYS_DD___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_CORE_SYSTEM_SYS_DD___GET_PARTS = SYS_DD___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_CORE_SYSTEM_SYS_DD___GET_FLOW_PROPERTIES = SYS_DD___GET_FLOW_PROPERTIES;

	/**
	 * The operation id for the '<em>Deployedat Device</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_CORE_SYSTEM_SYS_DD___DEPLOYEDAT_DEVICE__DIAGNOSTICCHAIN_MAP = SYS_DD___DEPLOYEDAT_DEVICE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Constraint27</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_CORE_SYSTEM_SYS_DD___CONSTRAINT27__DIAGNOSTICCHAIN_MAP = SYS_DD___CONSTRAINT27__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Mandatory Core System Sys DD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_CORE_SYSTEM_SYS_DD_OPERATION_COUNT = SYS_DD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.SupportCoreSystemSysDDImpl <em>Support Core System Sys DD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.SupportCoreSystemSysDDImpl
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSupportCoreSystemSysDD()
	 * @generated
	 */
	int SUPPORT_CORE_SYSTEM_SYS_DD = 19;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_CORE_SYSTEM_SYS_DD__BASE_CLASS = SYS_DD__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_CORE_SYSTEM_SYS_DD__IS_ENCAPSULATED = SYS_DD__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Certificate Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_CORE_SYSTEM_SYS_DD__CERTIFICATE_LEVEL = SYS_DD__CERTIFICATE_LEVEL;

	/**
	 * The feature id for the '<em><b>System Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_CORE_SYSTEM_SYS_DD__SYSTEM_KIND = SYS_DD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Support Core System Sys DD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_CORE_SYSTEM_SYS_DD_FEATURE_COUNT = SYS_DD_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_CORE_SYSTEM_SYS_DD___GET_REFERENCES = SYS_DD___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_CORE_SYSTEM_SYS_DD___GET_PARTS = SYS_DD___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_CORE_SYSTEM_SYS_DD___GET_FLOW_PROPERTIES = SYS_DD___GET_FLOW_PROPERTIES;

	/**
	 * The operation id for the '<em>Deployedat Device</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_CORE_SYSTEM_SYS_DD___DEPLOYEDAT_DEVICE__DIAGNOSTICCHAIN_MAP = SYS_DD___DEPLOYEDAT_DEVICE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Constraint27</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_CORE_SYSTEM_SYS_DD___CONSTRAINT27__DIAGNOSTICCHAIN_MAP = SYS_DD___CONSTRAINT27__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Support Core System Sys DD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_CORE_SYSTEM_SYS_DD_OPERATION_COUNT = SYS_DD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ApplicationSysDDImpl <em>Application Sys DD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ApplicationSysDDImpl
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getApplicationSysDD()
	 * @generated
	 */
	int APPLICATION_SYS_DD = 20;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SYS_DD__BASE_CLASS = SYS_DD__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SYS_DD__IS_ENCAPSULATED = SYS_DD__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Certificate Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SYS_DD__CERTIFICATE_LEVEL = SYS_DD__CERTIFICATE_LEVEL;

	/**
	 * The feature id for the '<em><b>System Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SYS_DD__SYSTEM_KIND = SYS_DD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Application Sys DD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SYS_DD_FEATURE_COUNT = SYS_DD_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SYS_DD___GET_REFERENCES = SYS_DD___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SYS_DD___GET_PARTS = SYS_DD___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SYS_DD___GET_FLOW_PROPERTIES = SYS_DD___GET_FLOW_PROPERTIES;

	/**
	 * The operation id for the '<em>Deployedat Device</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SYS_DD___DEPLOYEDAT_DEVICE__DIAGNOSTICCHAIN_MAP = SYS_DD___DEPLOYEDAT_DEVICE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Constraint27</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SYS_DD___CONSTRAINT27__DIAGNOSTICCHAIN_MAP = SYS_DD___CONSTRAINT27__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Application Sys DD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SYS_DD_OPERATION_COUNT = SYS_DD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.DataSemanticsImpl <em>Data Semantics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.DataSemanticsImpl
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDataSemantics()
	 * @generated
	 */
	int DATA_SEMANTICS = 21;

	/**
	 * The feature id for the '<em><b>Semantic Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SEMANTICS__SEMANTIC_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SEMANTICS__ONTOLOGY = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SEMANTICS__SCHEMA = 2;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SEMANTICS__BASE_NAMED_ELEMENT = 3;

	/**
	 * The number of structural features of the '<em>Data Semantics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SEMANTICS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Data Semantics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SEMANTICS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.OperationImpl
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 22;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__METHOD = 0;

	/**
	 * The feature id for the '<em><b>Base Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__BASE_OPERATION = 1;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.NetworkDesignDescriptionImpl <em>Network Design Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.NetworkDesignDescriptionImpl
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getNetworkDesignDescription()
	 * @generated
	 */
	int NETWORK_DESIGN_DESCRIPTION = 23;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DESIGN_DESCRIPTION__BASE_CLASS = PortsAndFlowsPackage.INTERFACE_BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DESIGN_DESCRIPTION__IS_ENCAPSULATED = PortsAndFlowsPackage.INTERFACE_BLOCK__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DESIGN_DESCRIPTION__PROTOCOL = PortsAndFlowsPackage.INTERFACE_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Physical Network Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DESIGN_DESCRIPTION__PHYSICAL_NETWORK_INTERFACE = PortsAndFlowsPackage.INTERFACE_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DESIGN_DESCRIPTION__BASE_PORT = PortsAndFlowsPackage.INTERFACE_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Network Design Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DESIGN_DESCRIPTION_FEATURE_COUNT = PortsAndFlowsPackage.INTERFACE_BLOCK_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DESIGN_DESCRIPTION___GET_REFERENCES = PortsAndFlowsPackage.INTERFACE_BLOCK___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DESIGN_DESCRIPTION___GET_PARTS = PortsAndFlowsPackage.INTERFACE_BLOCK___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DESIGN_DESCRIPTION___GET_FLOW_PROPERTIES = PortsAndFlowsPackage.INTERFACE_BLOCK___GET_FLOW_PROPERTIES;

	/**
	 * The operation id for the '<em>Get Conjugated</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DESIGN_DESCRIPTION___GET_CONJUGATED = PortsAndFlowsPackage.INTERFACE_BLOCK___GET_CONJUGATED;

	/**
	 * The number of operations of the '<em>Network Design Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DESIGN_DESCRIPTION_OPERATION_COUNT = PortsAndFlowsPackage.INTERFACE_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.DeployImpl <em>Deploy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.DeployImpl
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDeploy()
	 * @generated
	 */
	int DEPLOY = 24;

	/**
	 * The feature id for the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__BASE_DEPENDENCY = 0;

	/**
	 * The number of structural features of the '<em>Deploy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Deploy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.CertificateLevel <em>Certificate Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.CertificateLevel
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getCertificateLevel()
	 * @generated
	 */
	int CERTIFICATE_LEVEL = 25;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.PhysicalLayerKind <em>Physical Layer Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.PhysicalLayerKind
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getPhysicalLayerKind()
	 * @generated
	 */
	int PHYSICAL_LAYER_KIND = 26;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SecurityKind <em>Security Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SecurityKind
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSecurityKind()
	 * @generated
	 */
	int SECURITY_KIND = 27;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.CertificateKind <em>Certificate Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.CertificateKind
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getCertificateKind()
	 * @generated
	 */
	int CERTIFICATE_KIND = 28;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.MandatoryCoreSystemKind <em>Mandatory Core System Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.MandatoryCoreSystemKind
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getMandatoryCoreSystemKind()
	 * @generated
	 */
	int MANDATORY_CORE_SYSTEM_KIND = 29;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ApplicationSystemKind <em>Application System Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ApplicationSystemKind
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getApplicationSystemKind()
	 * @generated
	 */
	int APPLICATION_SYSTEM_KIND = 30;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SupportCoreSystemKind <em>Support Core System Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SupportCoreSystemKind
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSupportCoreSystemKind()
	 * @generated
	 */
	int SUPPORT_CORE_SYSTEM_KIND = 31;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.OntologyKind <em>Ontology Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.OntologyKind
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getOntologyKind()
	 * @generated
	 */
	int ONTOLOGY_KIND = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.MethodKind <em>Method Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.MethodKind
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getMethodKind()
	 * @generated
	 */
	int METHOD_KIND = 33;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ProtocolKind <em>Protocol Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ProtocolKind
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getProtocolKind()
	 * @generated
	 */
	int PROTOCOL_KIND = 34;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SysDD <em>Sys DD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sys DD</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SysDD
	 * @generated
	 */
	EClass getSysDD();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SysDD#getCertificateLevel <em>Certificate Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Certificate Level</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SysDD#getCertificateLevel()
	 * @see #getSysDD()
	 * @generated
	 */
	EAttribute getSysDD_CertificateLevel();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SysDD#DeployedatDevice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Deployedat Device</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Deployedat Device</em>' operation.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SysDD#DeployedatDevice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSysDD__DeployedatDevice__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SysDD#Constraint27(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint27</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Constraint27</em>' operation.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SysDD#Constraint27(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSysDD__Constraint27__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.Identifiable
	 * @generated
	 */
	EClass getIdentifiable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DeviceDesignDescription <em>Device Design Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Design Description</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DeviceDesignDescription
	 * @generated
	 */
	EClass getDeviceDesignDescription();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DeviceDesignDescription#getNetworkinterface <em>Networkinterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Networkinterface</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DeviceDesignDescription#getNetworkinterface()
	 * @see #getDeviceDesignDescription()
	 * @generated
	 */
	EAttribute getDeviceDesignDescription_Networkinterface();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DeviceDesignDescription#getOperatingSystem <em>Operating System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operating System</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DeviceDesignDescription#getOperatingSystem()
	 * @see #getDeviceDesignDescription()
	 * @generated
	 */
	EAttribute getDeviceDesignDescription_OperatingSystem();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DeviceDesignDescription#getMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DeviceDesignDescription#getMemory()
	 * @see #getDeviceDesignDescription()
	 * @generated
	 */
	EAttribute getDeviceDesignDescription_Memory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DeviceDesignDescription#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processor</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DeviceDesignDescription#getProcessor()
	 * @see #getDeviceDesignDescription()
	 * @generated
	 */
	EAttribute getDeviceDesignDescription_Processor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DeviceDesignDescription#getCertificateLevel <em>Certificate Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Certificate Level</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DeviceDesignDescription#getCertificateLevel()
	 * @see #getDeviceDesignDescription()
	 * @generated
	 */
	EAttribute getDeviceDesignDescription_CertificateLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DeviceDesignDescription#getDeviceDesign <em>Device Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Design</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DeviceDesignDescription#getDeviceDesign()
	 * @see #getDeviceDesignDescription()
	 * @generated
	 */
	EAttribute getDeviceDesignDescription_DeviceDesign();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DeviceDesignDescription#Constraint53(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint53</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Constraint53</em>' operation.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DeviceDesignDescription#Constraint53(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDeviceDesignDescription__Constraint53__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DeviceDesign <em>Device Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Design</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DeviceDesign
	 * @generated
	 */
	EClass getDeviceDesign();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DeviceDesign#getNetworkDesign <em>Network Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Network Design</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DeviceDesign#getNetworkDesign()
	 * @see #getDeviceDesign()
	 * @generated
	 */
	EAttribute getDeviceDesign_NetworkDesign();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.LocalCloudDesign <em>Local Cloud Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Cloud Design</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.LocalCloudDesign
	 * @generated
	 */
	EClass getLocalCloudDesign();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.LocalCloudDesign#getSysd <em>Sysd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sysd</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.LocalCloudDesign#getSysd()
	 * @see #getLocalCloudDesign()
	 * @generated
	 */
	EReference getLocalCloudDesign_Sysd();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SysD <em>Sys D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sys D</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SysD
	 * @generated
	 */
	EClass getSysD();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SysD#getSystemKind <em>System Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Kind</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SysD#getSystemKind()
	 * @see #getSysD()
	 * @generated
	 */
	EAttribute getSysD_SystemKind();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SysD#Constraint180(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint180</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Constraint180</em>' operation.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SysD#Constraint180(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSysD__Constraint180__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.LocalCLoudDesignDescription <em>Local CLoud Design Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local CLoud Design Description</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.LocalCLoudDesignDescription
	 * @generated
	 */
	EClass getLocalCLoudDesignDescription();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.NetworkDesign <em>Network Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Design</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.NetworkDesign
	 * @generated
	 */
	EClass getNetworkDesign();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.NetworkDesignDescriptiion <em>Network Design Descriptiion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Design Descriptiion</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.NetworkDesignDescriptiion
	 * @generated
	 */
	EClass getNetworkDesignDescriptiion();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SystemofLocalCloudsDesign <em>Systemof Local Clouds Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Systemof Local Clouds Design</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SystemofLocalCloudsDesign
	 * @generated
	 */
	EClass getSystemofLocalCloudsDesign();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SystemofLocalCloudsDesign#SoLCDpropertyType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>So LC Dproperty Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>So LC Dproperty Type</em>' operation.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SystemofLocalCloudsDesign#SoLCDpropertyType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSystemofLocalCloudsDesign__SoLCDpropertyType__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SystemofLocalCloudsDesignDescription <em>Systemof Local Clouds Design Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Systemof Local Clouds Design Description</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SystemofLocalCloudsDesignDescription
	 * @generated
	 */
	EClass getSystemofLocalCloudsDesignDescription();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.Consumer <em>Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consumer</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.Consumer
	 * @generated
	 */
	EClass getConsumer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.Provider
	 * @generated
	 */
	EClass getProvider();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.IDD <em>IDD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDD</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.IDD
	 * @generated
	 */
	EClass getIDD();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.IDD#getSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.IDD#getSecurity()
	 * @see #getIDD()
	 * @generated
	 */
	EAttribute getIDD_Security();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.IDD#getCertificate <em>Certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Certificate</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.IDD#getCertificate()
	 * @see #getIDD()
	 * @generated
	 */
	EAttribute getIDD_Certificate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SD <em>SD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SD</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SD
	 * @generated
	 */
	EClass getSD();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.MandatoryCoreSystemSysD <em>Mandatory Core System Sys D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mandatory Core System Sys D</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.MandatoryCoreSystemSysD
	 * @generated
	 */
	EClass getMandatoryCoreSystemSysD();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SupportCoreSystemSysD <em>Support Core System Sys D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Support Core System Sys D</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SupportCoreSystemSysD
	 * @generated
	 */
	EClass getSupportCoreSystemSysD();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ApplicationSysD <em>Application Sys D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Sys D</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ApplicationSysD
	 * @generated
	 */
	EClass getApplicationSysD();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.MandatoryCoreSystemSysDD <em>Mandatory Core System Sys DD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mandatory Core System Sys DD</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.MandatoryCoreSystemSysDD
	 * @generated
	 */
	EClass getMandatoryCoreSystemSysDD();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.MandatoryCoreSystemSysDD#getSystemKind <em>System Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Kind</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.MandatoryCoreSystemSysDD#getSystemKind()
	 * @see #getMandatoryCoreSystemSysDD()
	 * @generated
	 */
	EAttribute getMandatoryCoreSystemSysDD_SystemKind();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SupportCoreSystemSysDD <em>Support Core System Sys DD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Support Core System Sys DD</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SupportCoreSystemSysDD
	 * @generated
	 */
	EClass getSupportCoreSystemSysDD();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SupportCoreSystemSysDD#getSystemKind <em>System Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Kind</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SupportCoreSystemSysDD#getSystemKind()
	 * @see #getSupportCoreSystemSysDD()
	 * @generated
	 */
	EAttribute getSupportCoreSystemSysDD_SystemKind();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ApplicationSysDD <em>Application Sys DD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Sys DD</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ApplicationSysDD
	 * @generated
	 */
	EClass getApplicationSysDD();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ApplicationSysDD#getSystemKind <em>System Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Kind</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ApplicationSysDD#getSystemKind()
	 * @see #getApplicationSysDD()
	 * @generated
	 */
	EAttribute getApplicationSysDD_SystemKind();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DataSemantics <em>Data Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Semantics</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DataSemantics
	 * @generated
	 */
	EClass getDataSemantics();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DataSemantics#getSemanticModel <em>Semantic Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantic Model</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DataSemantics#getSemanticModel()
	 * @see #getDataSemantics()
	 * @generated
	 */
	EAttribute getDataSemantics_SemanticModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DataSemantics#getOntology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ontology</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DataSemantics#getOntology()
	 * @see #getDataSemantics()
	 * @generated
	 */
	EAttribute getDataSemantics_Ontology();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DataSemantics#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DataSemantics#getSchema()
	 * @see #getDataSemantics()
	 * @generated
	 */
	EAttribute getDataSemantics_Schema();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DataSemantics#getBase_NamedElement <em>Base Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Named Element</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DataSemantics#getBase_NamedElement()
	 * @see #getDataSemantics()
	 * @generated
	 */
	EReference getDataSemantics_Base_NamedElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.Operation#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.Operation#getMethod()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Method();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.Operation#getBase_Operation <em>Base Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Operation</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.Operation#getBase_Operation()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Base_Operation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.NetworkDesignDescription <em>Network Design Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Design Description</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.NetworkDesignDescription
	 * @generated
	 */
	EClass getNetworkDesignDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.NetworkDesignDescription#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.NetworkDesignDescription#getProtocol()
	 * @see #getNetworkDesignDescription()
	 * @generated
	 */
	EAttribute getNetworkDesignDescription_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.NetworkDesignDescription#getPhysicalNetworkInterface <em>Physical Network Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physical Network Interface</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.NetworkDesignDescription#getPhysicalNetworkInterface()
	 * @see #getNetworkDesignDescription()
	 * @generated
	 */
	EAttribute getNetworkDesignDescription_PhysicalNetworkInterface();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.NetworkDesignDescription#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.NetworkDesignDescription#getBase_Port()
	 * @see #getNetworkDesignDescription()
	 * @generated
	 */
	EReference getNetworkDesignDescription_Base_Port();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.Deploy <em>Deploy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deploy</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.Deploy
	 * @generated
	 */
	EClass getDeploy();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.Deploy#getBase_Dependency <em>Base Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Dependency</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.Deploy#getBase_Dependency()
	 * @see #getDeploy()
	 * @generated
	 */
	EReference getDeploy_Base_Dependency();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.CertificateLevel <em>Certificate Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Certificate Level</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.CertificateLevel
	 * @generated
	 */
	EEnum getCertificateLevel();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.PhysicalLayerKind <em>Physical Layer Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Physical Layer Kind</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.PhysicalLayerKind
	 * @generated
	 */
	EEnum getPhysicalLayerKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SecurityKind <em>Security Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Security Kind</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SecurityKind
	 * @generated
	 */
	EEnum getSecurityKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.CertificateKind <em>Certificate Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Certificate Kind</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.CertificateKind
	 * @generated
	 */
	EEnum getCertificateKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.MandatoryCoreSystemKind <em>Mandatory Core System Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mandatory Core System Kind</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.MandatoryCoreSystemKind
	 * @generated
	 */
	EEnum getMandatoryCoreSystemKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ApplicationSystemKind <em>Application System Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Application System Kind</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ApplicationSystemKind
	 * @generated
	 */
	EEnum getApplicationSystemKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SupportCoreSystemKind <em>Support Core System Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Support Core System Kind</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SupportCoreSystemKind
	 * @generated
	 */
	EEnum getSupportCoreSystemKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.OntologyKind <em>Ontology Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ontology Kind</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.OntologyKind
	 * @generated
	 */
	EEnum getOntologyKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.MethodKind <em>Method Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Method Kind</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.MethodKind
	 * @generated
	 */
	EEnum getMethodKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ProtocolKind <em>Protocol Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Protocol Kind</em>'.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ProtocolKind
	 * @generated
	 */
	EEnum getProtocolKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArrowheadSysMLProfileFactory getArrowheadSysMLProfileFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.SysDDImpl <em>Sys DD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.SysDDImpl
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSysDD()
		 * @generated
		 */
		EClass SYS_DD = eINSTANCE.getSysDD();

		/**
		 * The meta object literal for the '<em><b>Certificate Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYS_DD__CERTIFICATE_LEVEL = eINSTANCE.getSysDD_CertificateLevel();

		/**
		 * The meta object literal for the '<em><b>Deployedat Device</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYS_DD___DEPLOYEDAT_DEVICE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSysDD__DeployedatDevice__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Constraint27</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYS_DD___CONSTRAINT27__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSysDD__Constraint27__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.IdentifiableImpl <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.IdentifiableImpl
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getIdentifiable()
		 * @generated
		 */
		EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.DeviceDesignDescriptionImpl <em>Device Design Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.DeviceDesignDescriptionImpl
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDeviceDesignDescription()
		 * @generated
		 */
		EClass DEVICE_DESIGN_DESCRIPTION = eINSTANCE.getDeviceDesignDescription();

		/**
		 * The meta object literal for the '<em><b>Networkinterface</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_DESIGN_DESCRIPTION__NETWORKINTERFACE = eINSTANCE.getDeviceDesignDescription_Networkinterface();

		/**
		 * The meta object literal for the '<em><b>Operating System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_DESIGN_DESCRIPTION__OPERATING_SYSTEM = eINSTANCE.getDeviceDesignDescription_OperatingSystem();

		/**
		 * The meta object literal for the '<em><b>Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_DESIGN_DESCRIPTION__MEMORY = eINSTANCE.getDeviceDesignDescription_Memory();

		/**
		 * The meta object literal for the '<em><b>Processor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_DESIGN_DESCRIPTION__PROCESSOR = eINSTANCE.getDeviceDesignDescription_Processor();

		/**
		 * The meta object literal for the '<em><b>Certificate Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_DESIGN_DESCRIPTION__CERTIFICATE_LEVEL = eINSTANCE.getDeviceDesignDescription_CertificateLevel();

		/**
		 * The meta object literal for the '<em><b>Device Design</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_DESIGN_DESCRIPTION__DEVICE_DESIGN = eINSTANCE.getDeviceDesignDescription_DeviceDesign();

		/**
		 * The meta object literal for the '<em><b>Constraint53</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEVICE_DESIGN_DESCRIPTION___CONSTRAINT53__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDeviceDesignDescription__Constraint53__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.DeviceDesignImpl <em>Device Design</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.DeviceDesignImpl
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDeviceDesign()
		 * @generated
		 */
		EClass DEVICE_DESIGN = eINSTANCE.getDeviceDesign();

		/**
		 * The meta object literal for the '<em><b>Network Design</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_DESIGN__NETWORK_DESIGN = eINSTANCE.getDeviceDesign_NetworkDesign();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.LocalCloudDesignImpl <em>Local Cloud Design</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.LocalCloudDesignImpl
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getLocalCloudDesign()
		 * @generated
		 */
		EClass LOCAL_CLOUD_DESIGN = eINSTANCE.getLocalCloudDesign();

		/**
		 * The meta object literal for the '<em><b>Sysd</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_CLOUD_DESIGN__SYSD = eINSTANCE.getLocalCloudDesign_Sysd();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.SysDImpl <em>Sys D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.SysDImpl
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSysD()
		 * @generated
		 */
		EClass SYS_D = eINSTANCE.getSysD();

		/**
		 * The meta object literal for the '<em><b>System Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYS_D__SYSTEM_KIND = eINSTANCE.getSysD_SystemKind();

		/**
		 * The meta object literal for the '<em><b>Constraint180</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYS_D___CONSTRAINT180__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSysD__Constraint180__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.LocalCLoudDesignDescriptionImpl <em>Local CLoud Design Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.LocalCLoudDesignDescriptionImpl
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getLocalCLoudDesignDescription()
		 * @generated
		 */
		EClass LOCAL_CLOUD_DESIGN_DESCRIPTION = eINSTANCE.getLocalCLoudDesignDescription();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.NetworkDesignImpl <em>Network Design</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.NetworkDesignImpl
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getNetworkDesign()
		 * @generated
		 */
		EClass NETWORK_DESIGN = eINSTANCE.getNetworkDesign();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.NetworkDesignDescriptiionImpl <em>Network Design Descriptiion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.NetworkDesignDescriptiionImpl
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getNetworkDesignDescriptiion()
		 * @generated
		 */
		EClass NETWORK_DESIGN_DESCRIPTIION = eINSTANCE.getNetworkDesignDescriptiion();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.SystemofLocalCloudsDesignImpl <em>Systemof Local Clouds Design</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.SystemofLocalCloudsDesignImpl
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSystemofLocalCloudsDesign()
		 * @generated
		 */
		EClass SYSTEMOF_LOCAL_CLOUDS_DESIGN = eINSTANCE.getSystemofLocalCloudsDesign();

		/**
		 * The meta object literal for the '<em><b>So LC Dproperty Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYSTEMOF_LOCAL_CLOUDS_DESIGN___SO_LC_DPROPERTY_TYPE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSystemofLocalCloudsDesign__SoLCDpropertyType__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.SystemofLocalCloudsDesignDescriptionImpl <em>Systemof Local Clouds Design Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.SystemofLocalCloudsDesignDescriptionImpl
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSystemofLocalCloudsDesignDescription()
		 * @generated
		 */
		EClass SYSTEMOF_LOCAL_CLOUDS_DESIGN_DESCRIPTION = eINSTANCE.getSystemofLocalCloudsDesignDescription();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ConsumerImpl <em>Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ConsumerImpl
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getConsumer()
		 * @generated
		 */
		EClass CONSUMER = eINSTANCE.getConsumer();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ProviderImpl <em>Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ProviderImpl
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getProvider()
		 * @generated
		 */
		EClass PROVIDER = eINSTANCE.getProvider();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.IDDImpl <em>IDD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.IDDImpl
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getIDD()
		 * @generated
		 */
		EClass IDD = eINSTANCE.getIDD();

		/**
		 * The meta object literal for the '<em><b>Security</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDD__SECURITY = eINSTANCE.getIDD_Security();

		/**
		 * The meta object literal for the '<em><b>Certificate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDD__CERTIFICATE = eINSTANCE.getIDD_Certificate();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.SDImpl <em>SD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.SDImpl
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSD()
		 * @generated
		 */
		EClass SD = eINSTANCE.getSD();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.MandatoryCoreSystemSysDImpl <em>Mandatory Core System Sys D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.MandatoryCoreSystemSysDImpl
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getMandatoryCoreSystemSysD()
		 * @generated
		 */
		EClass MANDATORY_CORE_SYSTEM_SYS_D = eINSTANCE.getMandatoryCoreSystemSysD();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.SupportCoreSystemSysDImpl <em>Support Core System Sys D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.SupportCoreSystemSysDImpl
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSupportCoreSystemSysD()
		 * @generated
		 */
		EClass SUPPORT_CORE_SYSTEM_SYS_D = eINSTANCE.getSupportCoreSystemSysD();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ApplicationSysDImpl <em>Application Sys D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ApplicationSysDImpl
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getApplicationSysD()
		 * @generated
		 */
		EClass APPLICATION_SYS_D = eINSTANCE.getApplicationSysD();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.MandatoryCoreSystemSysDDImpl <em>Mandatory Core System Sys DD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.MandatoryCoreSystemSysDDImpl
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getMandatoryCoreSystemSysDD()
		 * @generated
		 */
		EClass MANDATORY_CORE_SYSTEM_SYS_DD = eINSTANCE.getMandatoryCoreSystemSysDD();

		/**
		 * The meta object literal for the '<em><b>System Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANDATORY_CORE_SYSTEM_SYS_DD__SYSTEM_KIND = eINSTANCE.getMandatoryCoreSystemSysDD_SystemKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.SupportCoreSystemSysDDImpl <em>Support Core System Sys DD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.SupportCoreSystemSysDDImpl
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSupportCoreSystemSysDD()
		 * @generated
		 */
		EClass SUPPORT_CORE_SYSTEM_SYS_DD = eINSTANCE.getSupportCoreSystemSysDD();

		/**
		 * The meta object literal for the '<em><b>System Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPORT_CORE_SYSTEM_SYS_DD__SYSTEM_KIND = eINSTANCE.getSupportCoreSystemSysDD_SystemKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ApplicationSysDDImpl <em>Application Sys DD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ApplicationSysDDImpl
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getApplicationSysDD()
		 * @generated
		 */
		EClass APPLICATION_SYS_DD = eINSTANCE.getApplicationSysDD();

		/**
		 * The meta object literal for the '<em><b>System Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_SYS_DD__SYSTEM_KIND = eINSTANCE.getApplicationSysDD_SystemKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.DataSemanticsImpl <em>Data Semantics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.DataSemanticsImpl
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDataSemantics()
		 * @generated
		 */
		EClass DATA_SEMANTICS = eINSTANCE.getDataSemantics();

		/**
		 * The meta object literal for the '<em><b>Semantic Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SEMANTICS__SEMANTIC_MODEL = eINSTANCE.getDataSemantics_SemanticModel();

		/**
		 * The meta object literal for the '<em><b>Ontology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SEMANTICS__ONTOLOGY = eINSTANCE.getDataSemantics_Ontology();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SEMANTICS__SCHEMA = eINSTANCE.getDataSemantics_Schema();

		/**
		 * The meta object literal for the '<em><b>Base Named Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SEMANTICS__BASE_NAMED_ELEMENT = eINSTANCE.getDataSemantics_Base_NamedElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.OperationImpl
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__METHOD = eINSTANCE.getOperation_Method();

		/**
		 * The meta object literal for the '<em><b>Base Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__BASE_OPERATION = eINSTANCE.getOperation_Base_Operation();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.NetworkDesignDescriptionImpl <em>Network Design Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.NetworkDesignDescriptionImpl
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getNetworkDesignDescription()
		 * @generated
		 */
		EClass NETWORK_DESIGN_DESCRIPTION = eINSTANCE.getNetworkDesignDescription();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_DESIGN_DESCRIPTION__PROTOCOL = eINSTANCE.getNetworkDesignDescription_Protocol();

		/**
		 * The meta object literal for the '<em><b>Physical Network Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_DESIGN_DESCRIPTION__PHYSICAL_NETWORK_INTERFACE = eINSTANCE.getNetworkDesignDescription_PhysicalNetworkInterface();

		/**
		 * The meta object literal for the '<em><b>Base Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_DESIGN_DESCRIPTION__BASE_PORT = eINSTANCE.getNetworkDesignDescription_Base_Port();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.DeployImpl <em>Deploy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.DeployImpl
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDeploy()
		 * @generated
		 */
		EClass DEPLOY = eINSTANCE.getDeploy();

		/**
		 * The meta object literal for the '<em><b>Base Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOY__BASE_DEPENDENCY = eINSTANCE.getDeploy_Base_Dependency();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.CertificateLevel <em>Certificate Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.CertificateLevel
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getCertificateLevel()
		 * @generated
		 */
		EEnum CERTIFICATE_LEVEL = eINSTANCE.getCertificateLevel();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.PhysicalLayerKind <em>Physical Layer Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.PhysicalLayerKind
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getPhysicalLayerKind()
		 * @generated
		 */
		EEnum PHYSICAL_LAYER_KIND = eINSTANCE.getPhysicalLayerKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SecurityKind <em>Security Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SecurityKind
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSecurityKind()
		 * @generated
		 */
		EEnum SECURITY_KIND = eINSTANCE.getSecurityKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.CertificateKind <em>Certificate Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.CertificateKind
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getCertificateKind()
		 * @generated
		 */
		EEnum CERTIFICATE_KIND = eINSTANCE.getCertificateKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.MandatoryCoreSystemKind <em>Mandatory Core System Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.MandatoryCoreSystemKind
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getMandatoryCoreSystemKind()
		 * @generated
		 */
		EEnum MANDATORY_CORE_SYSTEM_KIND = eINSTANCE.getMandatoryCoreSystemKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ApplicationSystemKind <em>Application System Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ApplicationSystemKind
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getApplicationSystemKind()
		 * @generated
		 */
		EEnum APPLICATION_SYSTEM_KIND = eINSTANCE.getApplicationSystemKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SupportCoreSystemKind <em>Support Core System Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SupportCoreSystemKind
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSupportCoreSystemKind()
		 * @generated
		 */
		EEnum SUPPORT_CORE_SYSTEM_KIND = eINSTANCE.getSupportCoreSystemKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.OntologyKind <em>Ontology Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.OntologyKind
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getOntologyKind()
		 * @generated
		 */
		EEnum ONTOLOGY_KIND = eINSTANCE.getOntologyKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.MethodKind <em>Method Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.MethodKind
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getMethodKind()
		 * @generated
		 */
		EEnum METHOD_KIND = eINSTANCE.getMethodKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ProtocolKind <em>Protocol Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ProtocolKind
		 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getProtocolKind()
		 * @generated
		 */
		EEnum PROTOCOL_KIND = eINSTANCE.getProtocolKind();

	}

} //ArrowheadSysMLProfilePackage
