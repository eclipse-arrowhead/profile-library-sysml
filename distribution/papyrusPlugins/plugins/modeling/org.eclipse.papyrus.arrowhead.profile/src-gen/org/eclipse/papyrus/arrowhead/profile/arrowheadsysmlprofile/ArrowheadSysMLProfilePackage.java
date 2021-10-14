/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile;

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
 * <!-- begin-model-doc -->
 * Within an IDD, a service interface with input, output and return parameters can be modeled as operations.
 * <!-- end-model-doc -->
 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfileFactory
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
	ArrowheadSysMLProfilePackage eINSTANCE = org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SysDImpl <em>Sys D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SysDImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSysD()
	 * @generated
	 */
	int SYS_D = 0;

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
	 * The feature id for the '<em><b>Devicedesign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_D__DEVICEDESIGN = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

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
	 * The number of operations of the '<em>Sys D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_D_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceDesignImpl <em>Device Design</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceDesignImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDeviceDesign()
	 * @generated
	 */
	int DEVICE_DESIGN = 1;

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
	 * The feature id for the '<em><b>Networkdesign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN__NETWORKDESIGN = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.NetworkDesignImpl <em>Network Design</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.NetworkDesignImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getNetworkDesign()
	 * @generated
	 */
	int NETWORK_DESIGN = 2;

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
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SysDDImpl <em>Sys DD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SysDDImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSysDD()
	 * @generated
	 */
	int SYS_DD = 3;

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
	 * The feature id for the '<em><b>Devicedesigndesciption</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_DD__DEVICEDESIGNDESCIPTION = BlocksPackage.BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sys DD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_DD_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 2;

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
	 * The number of operations of the '<em>Sys DD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_DD_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceDesignDesciptionImpl <em>Device Design Desciption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceDesignDesciptionImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDeviceDesignDesciption()
	 * @generated
	 */
	int DEVICE_DESIGN_DESCIPTION = 4;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_DESCIPTION__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_DESCIPTION__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Certificate Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_DESCIPTION__CERTIFICATE_LEVEL = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Network Design Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_DESCIPTION__NETWORK_DESIGN_DESCRIPTION = BlocksPackage.BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Device Design Desciption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_DESCIPTION_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_DESCIPTION___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_DESCIPTION___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_DESCIPTION___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Device Design Desciption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DESIGN_DESCIPTION_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.NetworkDesignDescriptiionImpl <em>Network Design Descriptiion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.NetworkDesignDescriptiionImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getNetworkDesignDescriptiion()
	 * @generated
	 */
	int NETWORK_DESIGN_DESCRIPTIION = 5;

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
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ServiceDescriptionImpl <em>Service Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ServiceDescriptionImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getServiceDescription()
	 * @generated
	 */
	int SERVICE_DESCRIPTION = 7;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__BASE_CLASS = PortsAndFlowsPackage.INTERFACE_BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__IS_ENCAPSULATED = PortsAndFlowsPackage.INTERFACE_BLOCK__IS_ENCAPSULATED;

	/**
	 * The number of structural features of the '<em>Service Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION_FEATURE_COUNT = PortsAndFlowsPackage.INTERFACE_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION___GET_REFERENCES = PortsAndFlowsPackage.INTERFACE_BLOCK___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION___GET_PARTS = PortsAndFlowsPackage.INTERFACE_BLOCK___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION___GET_FLOW_PROPERTIES = PortsAndFlowsPackage.INTERFACE_BLOCK___GET_FLOW_PROPERTIES;

	/**
	 * The operation id for the '<em>Get Conjugated</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION___GET_CONJUGATED = PortsAndFlowsPackage.INTERFACE_BLOCK___GET_CONJUGATED;

	/**
	 * The number of operations of the '<em>Service Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION_OPERATION_COUNT = PortsAndFlowsPackage.INTERFACE_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.InterfaceDesignDescriptionImpl <em>Interface Design Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.InterfaceDesignDescriptionImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getInterfaceDesignDescription()
	 * @generated
	 */
	int INTERFACE_DESIGN_DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DESIGN_DESCRIPTION__BASE_CLASS = SERVICE_DESCRIPTION__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DESIGN_DESCRIPTION__IS_ENCAPSULATED = SERVICE_DESCRIPTION__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DESIGN_DESCRIPTION__ENCODING = SERVICE_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Security</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DESIGN_DESCRIPTION__SECURITY = SERVICE_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DESIGN_DESCRIPTION__PROTOCOL = SERVICE_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Compression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DESIGN_DESCRIPTION__COMPRESSION = SERVICE_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Crypto Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DESIGN_DESCRIPTION__CRYPTO_ALGORITHM = SERVICE_DESCRIPTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DESIGN_DESCRIPTION__TOKEN = SERVICE_DESCRIPTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Certificate Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DESIGN_DESCRIPTION__CERTIFICATE_LEVEL = SERVICE_DESCRIPTION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Payload Encryption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DESIGN_DESCRIPTION__PAYLOAD_ENCRYPTION = SERVICE_DESCRIPTION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Time Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DESIGN_DESCRIPTION__TIME_FORMAT = SERVICE_DESCRIPTION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Interface Design Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DESIGN_DESCRIPTION_FEATURE_COUNT = SERVICE_DESCRIPTION_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DESIGN_DESCRIPTION___GET_REFERENCES = SERVICE_DESCRIPTION___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DESIGN_DESCRIPTION___GET_PARTS = SERVICE_DESCRIPTION___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DESIGN_DESCRIPTION___GET_FLOW_PROPERTIES = SERVICE_DESCRIPTION___GET_FLOW_PROPERTIES;

	/**
	 * The operation id for the '<em>Get Conjugated</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DESIGN_DESCRIPTION___GET_CONJUGATED = SERVICE_DESCRIPTION___GET_CONJUGATED;

	/**
	 * The number of operations of the '<em>Interface Design Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DESIGN_DESCRIPTION_OPERATION_COUNT = SERVICE_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SubsetOfImpl <em>Subset Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SubsetOfImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSubsetOf()
	 * @generated
	 */
	int SUBSET_OF = 8;

	/**
	 * The feature id for the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET_OF__BASE_DEPENDENCY = 0;

	/**
	 * The number of structural features of the '<em>Subset Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET_OF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Subset Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET_OF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 9;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Certificate Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__CERTIFICATE_LEVEL = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.MetaDataEntryImpl <em>Meta Data Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.MetaDataEntryImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getMetaDataEntry()
	 * @generated
	 */
	int META_DATA_ENTRY = 10;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA_ENTRY__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA_ENTRY__DATA = 1;

	/**
	 * The number of structural features of the '<em>Meta Data Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Meta Data Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeployedServiceImpl <em>Deployed Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeployedServiceImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDeployedService()
	 * @generated
	 */
	int DEPLOYED_SERVICE = 11;

	/**
	 * The feature id for the '<em><b>Deployed Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_SERVICE__DEPLOYED_SERVICE_NAME = 0;

	/**
	 * The feature id for the '<em><b>URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_SERVICE__URL = 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_SERVICE__PORT = 2;

	/**
	 * The feature id for the '<em><b>Certificate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_SERVICE__CERTIFICATE = 3;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_SERVICE__METADATA = 4;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_SERVICE__BASE_PROPERTY = 5;

	/**
	 * The number of structural features of the '<em>Deployed Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_SERVICE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Deployed Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.LocalCloudDesignImpl <em>Local Cloud Design</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.LocalCloudDesignImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getLocalCloudDesign()
	 * @generated
	 */
	int LOCAL_CLOUD_DESIGN = 12;

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
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.LocalCLoudDesignDescriptionImpl <em>Local CLoud Design Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.LocalCLoudDesignDescriptionImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getLocalCLoudDesignDescription()
	 * @generated
	 */
	int LOCAL_CLOUD_DESIGN_DESCRIPTION = 13;

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
	 * The feature id for the '<em><b>Sys DD</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_DESIGN_DESCRIPTION__SYS_DD = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Local CLoud Design Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_DESIGN_DESCRIPTION_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 1;

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
	 * The operation id for the '<em>Get Sys DD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_DESIGN_DESCRIPTION___GET_SYS_DD__SYSDD = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Local CLoud Design Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_DESIGN_DESCRIPTION_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeployedDeviceImpl <em>Deployed Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeployedDeviceImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDeployedDevice()
	 * @generated
	 */
	int DEPLOYED_DEVICE = 14;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_DEVICE__METADATA = 0;

	/**
	 * The feature id for the '<em><b>Mac Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_DEVICE__MAC_ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Network Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_DEVICE__NETWORK_INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Mac Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_DEVICE__MAC_PROTOCOL = 3;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_DEVICE__BASE_PROPERTY = 4;

	/**
	 * The number of structural features of the '<em>Deployed Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_DEVICE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Deployed Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_DEVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeployedLocalCloudImpl <em>Deployed Local Cloud</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeployedLocalCloudImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDeployedLocalCloud()
	 * @generated
	 */
	int DEPLOYED_LOCAL_CLOUD = 15;

	/**
	 * The feature id for the '<em><b>Gatekeeper System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_LOCAL_CLOUD__GATEKEEPER_SYSTEM_NAME = 0;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_LOCAL_CLOUD__BASE_PROPERTY = 1;

	/**
	 * The number of structural features of the '<em>Deployed Local Cloud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_LOCAL_CLOUD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Deployed Local Cloud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_LOCAL_CLOUD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DataSemanticsImpl <em>Data Semantics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DataSemanticsImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDataSemantics()
	 * @generated
	 */
	int DATA_SEMANTICS = 16;

	/**
	 * The feature id for the '<em><b>Semantic Model</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SEMANTICS__SEMANTIC_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SEMANTICS__ONTOLOGY = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SEMANTICS__SCHEMA = 2;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SEMANTICS__BASE_CLASS = 3;

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
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeployedEntityImpl <em>Deployed Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeployedEntityImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDeployedEntity()
	 * @generated
	 */
	int DEPLOYED_ENTITY = 17;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_ENTITY__BASE_PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>Deployed Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_ENTITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Deployed Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ServiceRegistryFormImpl <em>Service Registry Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ServiceRegistryFormImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getServiceRegistryForm()
	 * @generated
	 */
	int SERVICE_REGISTRY_FORM = 18;

	/**
	 * The feature id for the '<em><b>Semantic Model</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_FORM__SEMANTIC_MODEL = DATA_SEMANTICS__SEMANTIC_MODEL;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_FORM__ONTOLOGY = DATA_SEMANTICS__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_FORM__SCHEMA = DATA_SEMANTICS__SCHEMA;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_FORM__BASE_CLASS = DATA_SEMANTICS__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Metadata4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_FORM__METADATA4 = DATA_SEMANTICS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_FORM__SERVICE_NAME = DATA_SEMANTICS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Producing System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_FORM__PRODUCING_SYSTEM = DATA_SEMANTICS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_FORM__ENCODING = DATA_SEMANTICS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>End Of Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_FORM__END_OF_VALIDITY = DATA_SEMANTICS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Service URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_FORM__SERVICE_URI = DATA_SEMANTICS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Authentication Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_FORM__AUTHENTICATION_INFO = DATA_SEMANTICS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_FORM__SECURE = DATA_SEMANTICS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Compression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_FORM__COMPRESSION = DATA_SEMANTICS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Metadata1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_FORM__METADATA1 = DATA_SEMANTICS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Metadata2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_FORM__METADATA2 = DATA_SEMANTICS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Metadata3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_FORM__METADATA3 = DATA_SEMANTICS_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Service Registry Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_FORM_FEATURE_COUNT = DATA_SEMANTICS_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Service Registry Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_FORM_OPERATION_COUNT = DATA_SEMANTICS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SystemRegistryFormImpl <em>System Registry Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SystemRegistryFormImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSystemRegistryForm()
	 * @generated
	 */
	int SYSTEM_REGISTRY_FORM = 19;

	/**
	 * The feature id for the '<em><b>Semantic Model</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REGISTRY_FORM__SEMANTIC_MODEL = DATA_SEMANTICS__SEMANTIC_MODEL;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REGISTRY_FORM__ONTOLOGY = DATA_SEMANTICS__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REGISTRY_FORM__SCHEMA = DATA_SEMANTICS__SCHEMA;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REGISTRY_FORM__BASE_CLASS = DATA_SEMANTICS__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REGISTRY_FORM__SYSTEM_NAME = DATA_SEMANTICS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Host Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REGISTRY_FORM__HOST_DEVICE = DATA_SEMANTICS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Authentication Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REGISTRY_FORM__AUTHENTICATION_INFO = DATA_SEMANTICS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End Of Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REGISTRY_FORM__END_OF_VALIDITY = DATA_SEMANTICS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Service URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REGISTRY_FORM__SERVICE_URI = DATA_SEMANTICS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REGISTRY_FORM__VERSION = DATA_SEMANTICS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Deploy Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REGISTRY_FORM__DEPLOY_TIME = DATA_SEMANTICS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Metadata1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REGISTRY_FORM__METADATA1 = DATA_SEMANTICS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Metadata2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REGISTRY_FORM__METADATA2 = DATA_SEMANTICS_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>System Registry Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REGISTRY_FORM_FEATURE_COUNT = DATA_SEMANTICS_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>System Registry Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REGISTRY_FORM_OPERATION_COUNT = DATA_SEMANTICS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceRegistryFormImpl <em>Device Registry Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceRegistryFormImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDeviceRegistryForm()
	 * @generated
	 */
	int DEVICE_REGISTRY_FORM = 20;

	/**
	 * The feature id for the '<em><b>Semantic Model</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_REGISTRY_FORM__SEMANTIC_MODEL = DATA_SEMANTICS__SEMANTIC_MODEL;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_REGISTRY_FORM__ONTOLOGY = DATA_SEMANTICS__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_REGISTRY_FORM__SCHEMA = DATA_SEMANTICS__SCHEMA;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_REGISTRY_FORM__BASE_CLASS = DATA_SEMANTICS__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Host Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_REGISTRY_FORM__HOST_DEVICE = DATA_SEMANTICS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Authentication Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_REGISTRY_FORM__AUTHENTICATION_INFO = DATA_SEMANTICS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End Of Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_REGISTRY_FORM__END_OF_VALIDITY = DATA_SEMANTICS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_REGISTRY_FORM__VERSION = DATA_SEMANTICS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Deploy Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_REGISTRY_FORM__DEPLOY_TIME = DATA_SEMANTICS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Metadata1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_REGISTRY_FORM__METADATA1 = DATA_SEMANTICS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Metadata2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_REGISTRY_FORM__METADATA2 = DATA_SEMANTICS_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Device Registry Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_REGISTRY_FORM_FEATURE_COUNT = DATA_SEMANTICS_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Device Registry Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_REGISTRY_FORM_OPERATION_COUNT = DATA_SEMANTICS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.CertificateCreationFormImpl <em>Certificate Creation Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.CertificateCreationFormImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getCertificateCreationForm()
	 * @generated
	 */
	int CERTIFICATE_CREATION_FORM = 21;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_CREATION_FORM__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Commom Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_CREATION_FORM__COMMOM_NAME = 1;

	/**
	 * The feature id for the '<em><b>Key Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_CREATION_FORM__KEY_ALGORITHM = 2;

	/**
	 * The feature id for the '<em><b>Key Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_CREATION_FORM__KEY_FORMAT = 3;

	/**
	 * The feature id for the '<em><b>Privat Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_CREATION_FORM__PRIVAT_KEY = 4;

	/**
	 * The feature id for the '<em><b>Public Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_CREATION_FORM__PUBLIC_KEY = 5;

	/**
	 * The number of structural features of the '<em>Certificate Creation Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_CREATION_FORM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Certificate Creation Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_CREATION_FORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SystemofLocalCloudsDesignImpl <em>Systemof Local Clouds Design</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SystemofLocalCloudsDesignImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSystemofLocalCloudsDesign()
	 * @generated
	 */
	int SYSTEMOF_LOCAL_CLOUDS_DESIGN = 22;

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
	 * The feature id for the '<em><b>LCD</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_DESIGN__LCD = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Systemof Local Clouds Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_DESIGN_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 1;

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
	 * The operation id for the '<em>Get LCD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_DESIGN___GET_LCD__LOCALCLOUDDESIGN = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Systemof Local Clouds Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_DESIGN_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SystemofLocalCloudsDesignDescriptionImpl <em>Systemof Local Clouds Design Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SystemofLocalCloudsDesignDescriptionImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSystemofLocalCloudsDesignDescription()
	 * @generated
	 */
	int SYSTEMOF_LOCAL_CLOUDS_DESIGN_DESCRIPTION = 23;

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
	 * The feature id for the '<em><b>LCDD</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_DESIGN_DESCRIPTION__LCDD = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Systemof Local Clouds Design Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_DESIGN_DESCRIPTION_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 1;

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
	 * The operation id for the '<em>Get LCDD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_DESIGN_DESCRIPTION___GET_LCDD__LOCALCLOUDDESIGNDESCRIPTION = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Systemof Local Clouds Design Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_DESIGN_DESCRIPTION_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.NetworkImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 24;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__BASE_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ApplicationSysDDHTTPImpl <em>Application Sys DDHTTP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ApplicationSysDDHTTPImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getApplicationSysDDHTTP()
	 * @generated
	 */
	int APPLICATION_SYS_DDHTTP = 25;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SYS_DDHTTP__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SYS_DDHTTP__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The number of structural features of the '<em>Application Sys DDHTTP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SYS_DDHTTP_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SYS_DDHTTP___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SYS_DDHTTP___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SYS_DDHTTP___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Application Sys DDHTTP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SYS_DDHTTP_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SystemofLocalCloudsDeployedImpl <em>Systemof Local Clouds Deployed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SystemofLocalCloudsDeployedImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSystemofLocalCloudsDeployed()
	 * @generated
	 */
	int SYSTEMOF_LOCAL_CLOUDS_DEPLOYED = 26;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_DEPLOYED__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_DEPLOYED__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Local Cloud Deployed</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_DEPLOYED__LOCAL_CLOUD_DEPLOYED = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Systemof Local Clouds Deployed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_DEPLOYED_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_DEPLOYED___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_DEPLOYED___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_DEPLOYED___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;

	/**
	 * The operation id for the '<em>Get Local Cloud Deployed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_DEPLOYED___GET_LOCAL_CLOUD_DEPLOYED__ELIST = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Systemof Local Clouds Deployed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_DEPLOYED_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.LocalCloudDeployedImpl <em>Local Cloud Deployed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.LocalCloudDeployedImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getLocalCloudDeployed()
	 * @generated
	 */
	int LOCAL_CLOUD_DEPLOYED = 27;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_DEPLOYED__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_DEPLOYED__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The number of structural features of the '<em>Local Cloud Deployed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_DEPLOYED_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_DEPLOYED___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_DEPLOYED___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_DEPLOYED___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Local Cloud Deployed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_DEPLOYED_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceDeployedImpl <em>Device Deployed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceDeployedImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDeviceDeployed()
	 * @generated
	 */
	int DEVICE_DEPLOYED = 28;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DEPLOYED__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DEPLOYED__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Localclouddeployed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DEPLOYED__LOCALCLOUDDEPLOYED = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Networkdeployed</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DEPLOYED__NETWORKDEPLOYED = BlocksPackage.BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Device Deployed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DEPLOYED_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DEPLOYED___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DEPLOYED___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DEPLOYED___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Device Deployed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DEPLOYED_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.NetworkDeployedImpl <em>Network Deployed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.NetworkDeployedImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getNetworkDeployed()
	 * @generated
	 */
	int NETWORK_DEPLOYED = 29;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DEPLOYED__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DEPLOYED__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The number of structural features of the '<em>Network Deployed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DEPLOYED_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DEPLOYED___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DEPLOYED___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DEPLOYED___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Network Deployed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DEPLOYED_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SDDDImpl <em>SDDD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SDDDImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSDDD()
	 * @generated
	 */
	int SDDD = 30;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDDD__BASE_CLASS = SERVICE_DESCRIPTION__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDDD__IS_ENCAPSULATED = SERVICE_DESCRIPTION__IS_ENCAPSULATED;

	/**
	 * The number of structural features of the '<em>SDDD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDDD_FEATURE_COUNT = SERVICE_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDDD___GET_REFERENCES = SERVICE_DESCRIPTION___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDDD___GET_PARTS = SERVICE_DESCRIPTION___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDDD___GET_FLOW_PROPERTIES = SERVICE_DESCRIPTION___GET_FLOW_PROPERTIES;

	/**
	 * The operation id for the '<em>Get Conjugated</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDDD___GET_CONJUGATED = SERVICE_DESCRIPTION___GET_CONJUGATED;

	/**
	 * The number of operations of the '<em>SDDD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDDD_OPERATION_COUNT = SERVICE_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.MQTT_topicImpl <em>MQTT topic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.MQTT_topicImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getMQTT_topic()
	 * @generated
	 */
	int MQTT_TOPIC = 31;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_TOPIC__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Security</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_TOPIC__SECURITY = 1;

	/**
	 * The feature id for the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_TOPIC__TOPIC_NAME = 2;

	/**
	 * The number of structural features of the '<em>MQTT topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_TOPIC_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>MQTT topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_TOPIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.HttpOperationImpl <em>Http Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.HttpOperationImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getHttpOperation()
	 * @generated
	 */
	int HTTP_OPERATION = 32;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_OPERATION__KIND = 0;

	/**
	 * The feature id for the '<em><b>Base Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_OPERATION__BASE_OPERATION = 1;

	/**
	 * The number of structural features of the '<em>Http Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_OPERATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Http Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SystemRequirementsImpl <em>System Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SystemRequirementsImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSystemRequirements()
	 * @generated
	 */
	int SYSTEM_REQUIREMENTS = 33;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENTS__BASE_PACKAGE = 0;

	/**
	 * The number of structural features of the '<em>System Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>System Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.NetworkRequirementsImpl <em>Network Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.NetworkRequirementsImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getNetworkRequirements()
	 * @generated
	 */
	int NETWORK_REQUIREMENTS = 34;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_REQUIREMENTS__BASE_PACKAGE = 0;

	/**
	 * The number of structural features of the '<em>Network Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_REQUIREMENTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Network Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_REQUIREMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.LocaCloudRequirementsImpl <em>Loca Cloud Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.LocaCloudRequirementsImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getLocaCloudRequirements()
	 * @generated
	 */
	int LOCA_CLOUD_REQUIREMENTS = 35;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCA_CLOUD_REQUIREMENTS__BASE_PACKAGE = 0;

	/**
	 * The number of structural features of the '<em>Loca Cloud Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCA_CLOUD_REQUIREMENTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Loca Cloud Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCA_CLOUD_REQUIREMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SystemofLocalCloudsRequirementsImpl <em>Systemof Local Clouds Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SystemofLocalCloudsRequirementsImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSystemofLocalCloudsRequirements()
	 * @generated
	 */
	int SYSTEMOF_LOCAL_CLOUDS_REQUIREMENTS = 36;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_REQUIREMENTS__BASE_PACKAGE = 0;

	/**
	 * The number of structural features of the '<em>Systemof Local Clouds Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_REQUIREMENTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Systemof Local Clouds Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_REQUIREMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceRequirementsImpl <em>Device Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceRequirementsImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDeviceRequirements()
	 * @generated
	 */
	int DEVICE_REQUIREMENTS = 37;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_REQUIREMENTS__BASE_PACKAGE = 0;

	/**
	 * The number of structural features of the '<em>Device Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_REQUIREMENTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Device Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_REQUIREMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SystemofLocalCloudsMaintenanceImpl <em>Systemof Local Clouds Maintenance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SystemofLocalCloudsMaintenanceImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSystemofLocalCloudsMaintenance()
	 * @generated
	 */
	int SYSTEMOF_LOCAL_CLOUDS_MAINTENANCE = 38;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_MAINTENANCE__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Systemoflocalcloudsdeployed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_MAINTENANCE__SYSTEMOFLOCALCLOUDSDEPLOYED = 1;

	/**
	 * The number of structural features of the '<em>Systemof Local Clouds Maintenance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_MAINTENANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Systemof Local Clouds Maintenance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_MAINTENANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SystemofLocalCloudsEvolutionImpl <em>Systemof Local Clouds Evolution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SystemofLocalCloudsEvolutionImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSystemofLocalCloudsEvolution()
	 * @generated
	 */
	int SYSTEMOF_LOCAL_CLOUDS_EVOLUTION = 39;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_EVOLUTION__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Systemoflocalcloudsdeployed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_EVOLUTION__SYSTEMOFLOCALCLOUDSDEPLOYED = 1;

	/**
	 * The number of structural features of the '<em>Systemof Local Clouds Evolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_EVOLUTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Systemof Local Clouds Evolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_EVOLUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.LocalCloudMaintenanceImpl <em>Local Cloud Maintenance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.LocalCloudMaintenanceImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getLocalCloudMaintenance()
	 * @generated
	 */
	int LOCAL_CLOUD_MAINTENANCE = 40;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_MAINTENANCE__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Systemoflocalcloudsmaintenance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_MAINTENANCE__SYSTEMOFLOCALCLOUDSMAINTENANCE = 1;

	/**
	 * The feature id for the '<em><b>Localclouddeployed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_MAINTENANCE__LOCALCLOUDDEPLOYED = 2;

	/**
	 * The number of structural features of the '<em>Local Cloud Maintenance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_MAINTENANCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Local Cloud Maintenance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_MAINTENANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.LocalCloudEvolutionImpl <em>Local Cloud Evolution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.LocalCloudEvolutionImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getLocalCloudEvolution()
	 * @generated
	 */
	int LOCAL_CLOUD_EVOLUTION = 41;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_EVOLUTION__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Systemoflocalcloudsevolution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_EVOLUTION__SYSTEMOFLOCALCLOUDSEVOLUTION = 1;

	/**
	 * The feature id for the '<em><b>Localclouddeployed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_EVOLUTION__LOCALCLOUDDEPLOYED = 2;

	/**
	 * The number of structural features of the '<em>Local Cloud Evolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_EVOLUTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Local Cloud Evolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_EVOLUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SysMaintenanceImpl <em>Sys Maintenance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SysMaintenanceImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSysMaintenance()
	 * @generated
	 */
	int SYS_MAINTENANCE = 42;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_MAINTENANCE__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Sysimplementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_MAINTENANCE__SYSIMPLEMENTATION = 1;

	/**
	 * The feature id for the '<em><b>Localcloudmaintenance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_MAINTENANCE__LOCALCLOUDMAINTENANCE = 2;

	/**
	 * The feature id for the '<em><b>Devicemaintenance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_MAINTENANCE__DEVICEMAINTENANCE = 3;

	/**
	 * The number of structural features of the '<em>Sys Maintenance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_MAINTENANCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Sys Maintenance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_MAINTENANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SysImplementationImpl <em>Sys Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SysImplementationImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSysImplementation()
	 * @generated
	 */
	int SYS_IMPLEMENTATION = 43;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_IMPLEMENTATION__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_IMPLEMENTATION__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Localcloudimplementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_IMPLEMENTATION__LOCALCLOUDIMPLEMENTATION = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deviceimplementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_IMPLEMENTATION__DEVICEIMPLEMENTATION = BlocksPackage.BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sys Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_IMPLEMENTATION_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_IMPLEMENTATION___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_IMPLEMENTATION___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_IMPLEMENTATION___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Sys Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_IMPLEMENTATION_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.LocalCLoudImplementationImpl <em>Local CLoud Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.LocalCLoudImplementationImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getLocalCLoudImplementation()
	 * @generated
	 */
	int LOCAL_CLOUD_IMPLEMENTATION = 44;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_IMPLEMENTATION__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_IMPLEMENTATION__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Systemoflocalcloudsimplementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_IMPLEMENTATION__SYSTEMOFLOCALCLOUDSIMPLEMENTATION = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Local CLoud Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_IMPLEMENTATION_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_IMPLEMENTATION___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_IMPLEMENTATION___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_IMPLEMENTATION___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Local CLoud Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLOUD_IMPLEMENTATION_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SystemofLocalCloudsImplementationImpl <em>Systemof Local Clouds Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SystemofLocalCloudsImplementationImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSystemofLocalCloudsImplementation()
	 * @generated
	 */
	int SYSTEMOF_LOCAL_CLOUDS_IMPLEMENTATION = 45;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_IMPLEMENTATION__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_IMPLEMENTATION__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The number of structural features of the '<em>Systemof Local Clouds Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_IMPLEMENTATION_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_IMPLEMENTATION___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_IMPLEMENTATION___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_IMPLEMENTATION___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Systemof Local Clouds Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMOF_LOCAL_CLOUDS_IMPLEMENTATION_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceImplementationImpl <em>Device Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceImplementationImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDeviceImplementation()
	 * @generated
	 */
	int DEVICE_IMPLEMENTATION = 46;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_IMPLEMENTATION__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_IMPLEMENTATION__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Networkimplementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_IMPLEMENTATION__NETWORKIMPLEMENTATION = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Device Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_IMPLEMENTATION_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_IMPLEMENTATION___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_IMPLEMENTATION___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_IMPLEMENTATION___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Device Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_IMPLEMENTATION_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.NetworkImplementationImpl <em>Network Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.NetworkImplementationImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getNetworkImplementation()
	 * @generated
	 */
	int NETWORK_IMPLEMENTATION = 47;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_IMPLEMENTATION__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_IMPLEMENTATION__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The number of structural features of the '<em>Network Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_IMPLEMENTATION_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_IMPLEMENTATION___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_IMPLEMENTATION___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_IMPLEMENTATION___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Network Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_IMPLEMENTATION_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceMaintenanceImpl <em>Device Maintenance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceMaintenanceImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDeviceMaintenance()
	 * @generated
	 */
	int DEVICE_MAINTENANCE = 48;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MAINTENANCE__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Devicedeployed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MAINTENANCE__DEVICEDEPLOYED = 1;

	/**
	 * The feature id for the '<em><b>Networkmaintenance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MAINTENANCE__NETWORKMAINTENANCE = 2;

	/**
	 * The number of structural features of the '<em>Device Maintenance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MAINTENANCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Device Maintenance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_MAINTENANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.NetworkMaintenanceImpl <em>Network Maintenance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.NetworkMaintenanceImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getNetworkMaintenance()
	 * @generated
	 */
	int NETWORK_MAINTENANCE = 49;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_MAINTENANCE__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Networkdeployed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_MAINTENANCE__NETWORKDEPLOYED = 1;

	/**
	 * The number of structural features of the '<em>Network Maintenance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_MAINTENANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Network Maintenance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_MAINTENANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SysEvolutionImpl <em>Sys Evolution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SysEvolutionImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSysEvolution()
	 * @generated
	 */
	int SYS_EVOLUTION = 50;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_EVOLUTION__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Localcloudevolution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_EVOLUTION__LOCALCLOUDEVOLUTION = 1;

	/**
	 * The feature id for the '<em><b>Sysimplementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_EVOLUTION__SYSIMPLEMENTATION = 2;

	/**
	 * The feature id for the '<em><b>Deviceevolution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_EVOLUTION__DEVICEEVOLUTION = 3;

	/**
	 * The number of structural features of the '<em>Sys Evolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_EVOLUTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Sys Evolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_EVOLUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceEvolutionImpl <em>Device Evolution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceEvolutionImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDeviceEvolution()
	 * @generated
	 */
	int DEVICE_EVOLUTION = 51;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_EVOLUTION__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Networkevolution</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_EVOLUTION__NETWORKEVOLUTION = 1;

	/**
	 * The feature id for the '<em><b>Devicedeployed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_EVOLUTION__DEVICEDEPLOYED = 2;

	/**
	 * The number of structural features of the '<em>Device Evolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_EVOLUTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Device Evolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_EVOLUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.NetworkEvolutionImpl <em>Network Evolution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.NetworkEvolutionImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getNetworkEvolution()
	 * @generated
	 */
	int NETWORK_EVOLUTION = 52;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_EVOLUTION__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Networkdeployed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_EVOLUTION__NETWORKDEPLOYED = 1;

	/**
	 * The number of structural features of the '<em>Network Evolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_EVOLUTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Network Evolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_EVOLUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeploymentImpl <em>Deployment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeploymentImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDeployment()
	 * @generated
	 */
	int DEPLOYMENT = 53;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__BASE_PACKAGE = 0;

	/**
	 * The number of structural features of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.RequirementsImpl <em>Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.RequirementsImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getRequirements()
	 * @generated
	 */
	int REQUIREMENTS = 54;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS__BASE_PACKAGE = 0;

	/**
	 * The number of structural features of the '<em>Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.FunctionalDesignImpl <em>Functional Design</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.FunctionalDesignImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getFunctionalDesign()
	 * @generated
	 */
	int FUNCTIONAL_DESIGN = 55;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DESIGN__BASE_PACKAGE = 0;

	/**
	 * The number of structural features of the '<em>Functional Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DESIGN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Functional Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DESIGN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ProcurementEngineeringImpl <em>Procurement Engineering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ProcurementEngineeringImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getProcurementEngineering()
	 * @generated
	 */
	int PROCUREMENT_ENGINEERING = 56;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCUREMENT_ENGINEERING__BASE_PACKAGE = 0;

	/**
	 * The number of structural features of the '<em>Procurement Engineering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCUREMENT_ENGINEERING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Procurement Engineering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCUREMENT_ENGINEERING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.MaintenanceImpl <em>Maintenance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.MaintenanceImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getMaintenance()
	 * @generated
	 */
	int MAINTENANCE = 57;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE__BASE_PACKAGE = 0;

	/**
	 * The number of structural features of the '<em>Maintenance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Maintenance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.EvolutionImpl <em>Evolution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.EvolutionImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getEvolution()
	 * @generated
	 */
	int EVOLUTION = 58;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION__BASE_PACKAGE = 0;

	/**
	 * The number of structural features of the '<em>Evolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Evolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SysDeployedImpl <em>Sys Deployed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SysDeployedImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSysDeployed()
	 * @generated
	 */
	int SYS_DEPLOYED = 59;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_DEPLOYED__BASE_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Sys Deployed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_DEPLOYED_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sys Deployed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_DEPLOYED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ChoreographyDefinitionImpl <em>Choreography Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ChoreographyDefinitionImpl
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getChoreographyDefinition()
	 * @generated
	 */
	int CHOREOGRAPHY_DEFINITION = 60;

	/**
	 * The feature id for the '<em><b>Base Collaboration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_DEFINITION__BASE_COLLABORATION = 0;

	/**
	 * The number of structural features of the '<em>Choreography Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_DEFINITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Choreography Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CertificateKind <em>Certificate Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CertificateKind
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getCertificateKind()
	 * @generated
	 */
	int CERTIFICATE_KIND = 61;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.EncodingKind <em>Encoding Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.EncodingKind
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getEncodingKind()
	 * @generated
	 */
	int ENCODING_KIND = 62;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SecurityKind <em>Security Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SecurityKind
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSecurityKind()
	 * @generated
	 */
	int SECURITY_KIND = 63;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ProtocolKind <em>Protocol Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ProtocolKind
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getProtocolKind()
	 * @generated
	 */
	int PROTOCOL_KIND = 64;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CompresionKind <em>Compresion Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CompresionKind
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getCompresionKind()
	 * @generated
	 */
	int COMPRESION_KIND = 65;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CryptoAlgorithmKind <em>Crypto Algorithm Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CryptoAlgorithmKind
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getCryptoAlgorithmKind()
	 * @generated
	 */
	int CRYPTO_ALGORITHM_KIND = 66;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.TokenKind <em>Token Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.TokenKind
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getTokenKind()
	 * @generated
	 */
	int TOKEN_KIND = 67;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.PayloadEncryptionKind <em>Payload Encryption Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.PayloadEncryptionKind
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getPayloadEncryptionKind()
	 * @generated
	 */
	int PAYLOAD_ENCRYPTION_KIND = 68;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.TimeFormatKind <em>Time Format Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.TimeFormatKind
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getTimeFormatKind()
	 * @generated
	 */
	int TIME_FORMAT_KIND = 69;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.OntologyKind <em>Ontology Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.OntologyKind
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getOntologyKind()
	 * @generated
	 */
	int ONTOLOGY_KIND = 70;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.HttpMethodKind <em>Http Method Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.HttpMethodKind
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getHttpMethodKind()
	 * @generated
	 */
	int HTTP_METHOD_KIND = 71;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SemanticsKind <em>Semantics Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SemanticsKind
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSemanticsKind()
	 * @generated
	 */
	int SEMANTICS_KIND = 72;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InstanceNamingStandardKind <em>Instance Naming Standard Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InstanceNamingStandardKind
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getInstanceNamingStandardKind()
	 * @generated
	 */
	int INSTANCE_NAMING_STANDARD_KIND = 73;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.StatusCodeKind <em>Status Code Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.StatusCodeKind
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getStatusCodeKind()
	 * @generated
	 */
	int STATUS_CODE_KIND = 74;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CoAPMetodKind <em>Co AP Metod Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CoAPMetodKind
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getCoAPMetodKind()
	 * @generated
	 */
	int CO_AP_METOD_KIND = 75;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SchemaType <em>Schema Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SchemaType
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSchemaType()
	 * @generated
	 */
	int SCHEMA_TYPE = 76;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.PhysicalLayerKind <em>Physical Layer Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.PhysicalLayerKind
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getPhysicalLayerKind()
	 * @generated
	 */
	int PHYSICAL_LAYER_KIND = 77;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.MacKind <em>Mac Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.MacKind
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getMacKind()
	 * @generated
	 */
	int MAC_KIND = 78;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.EngineeringProcedureKind <em>Engineering Procedure Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.EngineeringProcedureKind
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getEngineeringProcedureKind()
	 * @generated
	 */
	int ENGINEERING_PROCEDURE_KIND = 79;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.OSKind <em>OS Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.OSKind
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getOSKind()
	 * @generated
	 */
	int OS_KIND = 80;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LinuxKind <em>Linux Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LinuxKind
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getLinuxKind()
	 * @generated
	 */
	int LINUX_KIND = 81;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeploymentLocationKind <em>Deployment Location Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeploymentLocationKind
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDeploymentLocationKind()
	 * @generated
	 */
	int DEPLOYMENT_LOCATION_KIND = 82;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeploymentTimeKind <em>Deployment Time Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeploymentTimeKind
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDeploymentTimeKind()
	 * @generated
	 */
	int DEPLOYMENT_TIME_KIND = 83;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceKind <em>Device Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceKind
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDeviceKind()
	 * @generated
	 */
	int DEVICE_KIND = 84;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ProcessortKind <em>Processort Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ProcessortKind
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getProcessortKind()
	 * @generated
	 */
	int PROCESSORT_KIND = 85;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysD <em>Sys D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sys D</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysD
	 * @generated
	 */
	EClass getSysD();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysD#getDevicedesign <em>Devicedesign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Devicedesign</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysD#getDevicedesign()
	 * @see #getSysD()
	 * @generated
	 */
	EReference getSysD_Devicedesign();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceDesign <em>Device Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Design</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceDesign
	 * @generated
	 */
	EClass getDeviceDesign();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceDesign#getNetworkdesign <em>Networkdesign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Networkdesign</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceDesign#getNetworkdesign()
	 * @see #getDeviceDesign()
	 * @generated
	 */
	EReference getDeviceDesign_Networkdesign();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkDesign <em>Network Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Design</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkDesign
	 * @generated
	 */
	EClass getNetworkDesign();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysDD <em>Sys DD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sys DD</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysDD
	 * @generated
	 */
	EClass getSysDD();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysDD#getCertificateLevel <em>Certificate Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Certificate Level</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysDD#getCertificateLevel()
	 * @see #getSysDD()
	 * @generated
	 */
	EAttribute getSysDD_CertificateLevel();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysDD#getDevicedesigndesciption <em>Devicedesigndesciption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Devicedesigndesciption</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysDD#getDevicedesigndesciption()
	 * @see #getSysDD()
	 * @generated
	 */
	EReference getSysDD_Devicedesigndesciption();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceDesignDesciption <em>Device Design Desciption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Design Desciption</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceDesignDesciption
	 * @generated
	 */
	EClass getDeviceDesignDesciption();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceDesignDesciption#getCertificateLevel <em>Certificate Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Certificate Level</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceDesignDesciption#getCertificateLevel()
	 * @see #getDeviceDesignDesciption()
	 * @generated
	 */
	EAttribute getDeviceDesignDesciption_CertificateLevel();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceDesignDesciption#getNetworkDesignDescription <em>Network Design Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Network Design Description</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceDesignDesciption#getNetworkDesignDescription()
	 * @see #getDeviceDesignDesciption()
	 * @generated
	 */
	EReference getDeviceDesignDesciption_NetworkDesignDescription();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkDesignDescriptiion <em>Network Design Descriptiion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Design Descriptiion</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkDesignDescriptiion
	 * @generated
	 */
	EClass getNetworkDesignDescriptiion();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription <em>Interface Design Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Design Description</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription
	 * @generated
	 */
	EClass getInterfaceDesignDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription#getEncoding()
	 * @see #getInterfaceDesignDescription()
	 * @generated
	 */
	EAttribute getInterfaceDesignDescription_Encoding();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription#getSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription#getSecurity()
	 * @see #getInterfaceDesignDescription()
	 * @generated
	 */
	EAttribute getInterfaceDesignDescription_Security();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription#getProtocol()
	 * @see #getInterfaceDesignDescription()
	 * @generated
	 */
	EAttribute getInterfaceDesignDescription_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription#getCompression <em>Compression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compression</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription#getCompression()
	 * @see #getInterfaceDesignDescription()
	 * @generated
	 */
	EAttribute getInterfaceDesignDescription_Compression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription#getCryptoAlgorithm <em>Crypto Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crypto Algorithm</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription#getCryptoAlgorithm()
	 * @see #getInterfaceDesignDescription()
	 * @generated
	 */
	EAttribute getInterfaceDesignDescription_CryptoAlgorithm();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription#getToken()
	 * @see #getInterfaceDesignDescription()
	 * @generated
	 */
	EAttribute getInterfaceDesignDescription_Token();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription#getCertificateLevel <em>Certificate Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Certificate Level</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription#getCertificateLevel()
	 * @see #getInterfaceDesignDescription()
	 * @generated
	 */
	EAttribute getInterfaceDesignDescription_CertificateLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription#getPayloadEncryption <em>Payload Encryption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payload Encryption</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription#getPayloadEncryption()
	 * @see #getInterfaceDesignDescription()
	 * @generated
	 */
	EAttribute getInterfaceDesignDescription_PayloadEncryption();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription#getTimeFormat <em>Time Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Format</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription#getTimeFormat()
	 * @see #getInterfaceDesignDescription()
	 * @generated
	 */
	EAttribute getInterfaceDesignDescription_TimeFormat();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceDescription <em>Service Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Description</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceDescription
	 * @generated
	 */
	EClass getServiceDescription();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SubsetOf <em>Subset Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subset Of</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SubsetOf
	 * @generated
	 */
	EClass getSubsetOf();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SubsetOf#getBase_Dependency <em>Base Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Dependency</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SubsetOf#getBase_Dependency()
	 * @see #getSubsetOf()
	 * @generated
	 */
	EReference getSubsetOf_Base_Dependency();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Device#getCertificateLevel <em>Certificate Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Certificate Level</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Device#getCertificateLevel()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_CertificateLevel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.MetaDataEntry <em>Meta Data Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Data Entry</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.MetaDataEntry
	 * @generated
	 */
	EClass getMetaDataEntry();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.MetaDataEntry#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.MetaDataEntry#getBase_Class()
	 * @see #getMetaDataEntry()
	 * @generated
	 */
	EReference getMetaDataEntry_Base_Class();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.MetaDataEntry#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Data</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.MetaDataEntry#getData()
	 * @see #getMetaDataEntry()
	 * @generated
	 */
	EAttribute getMetaDataEntry_Data();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedService <em>Deployed Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployed Service</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedService
	 * @generated
	 */
	EClass getDeployedService();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedService#getDeployedServiceName <em>Deployed Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deployed Service Name</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedService#getDeployedServiceName()
	 * @see #getDeployedService()
	 * @generated
	 */
	EAttribute getDeployedService_DeployedServiceName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedService#getURL <em>URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URL</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedService#getURL()
	 * @see #getDeployedService()
	 * @generated
	 */
	EAttribute getDeployedService_URL();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedService#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedService#getPort()
	 * @see #getDeployedService()
	 * @generated
	 */
	EAttribute getDeployedService_Port();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedService#getCertificate <em>Certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Certificate</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedService#getCertificate()
	 * @see #getDeployedService()
	 * @generated
	 */
	EAttribute getDeployedService_Certificate();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedService#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Metadata</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedService#getMetadata()
	 * @see #getDeployedService()
	 * @generated
	 */
	EReference getDeployedService_Metadata();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedService#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedService#getBase_Property()
	 * @see #getDeployedService()
	 * @generated
	 */
	EReference getDeployedService_Base_Property();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudDesign <em>Local Cloud Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Cloud Design</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudDesign
	 * @generated
	 */
	EClass getLocalCloudDesign();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudDesign#getSysd <em>Sysd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sysd</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudDesign#getSysd()
	 * @see #getLocalCloudDesign()
	 * @generated
	 */
	EReference getLocalCloudDesign_Sysd();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCLoudDesignDescription <em>Local CLoud Design Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local CLoud Design Description</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCLoudDesignDescription
	 * @generated
	 */
	EClass getLocalCLoudDesignDescription();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCLoudDesignDescription#getSysDD <em>Sys DD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sys DD</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCLoudDesignDescription#getSysDD()
	 * @see #getLocalCLoudDesignDescription()
	 * @generated
	 */
	EReference getLocalCLoudDesignDescription_SysDD();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCLoudDesignDescription#getSysDD(org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysDD) <em>Get Sys DD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sys DD</em>' operation.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCLoudDesignDescription#getSysDD(org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysDD)
	 * @generated
	 */
	EOperation getLocalCLoudDesignDescription__GetSysDD__SysDD();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedDevice <em>Deployed Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployed Device</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedDevice
	 * @generated
	 */
	EClass getDeployedDevice();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedDevice#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Metadata</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedDevice#getMetadata()
	 * @see #getDeployedDevice()
	 * @generated
	 */
	EReference getDeployedDevice_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedDevice#getMacAddress <em>Mac Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mac Address</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedDevice#getMacAddress()
	 * @see #getDeployedDevice()
	 * @generated
	 */
	EAttribute getDeployedDevice_MacAddress();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedDevice#getNetworkInterface <em>Network Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Network Interface</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedDevice#getNetworkInterface()
	 * @see #getDeployedDevice()
	 * @generated
	 */
	EReference getDeployedDevice_NetworkInterface();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedDevice#getMacProtocol <em>Mac Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mac Protocol</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedDevice#getMacProtocol()
	 * @see #getDeployedDevice()
	 * @generated
	 */
	EAttribute getDeployedDevice_MacProtocol();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedDevice#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedDevice#getBase_Property()
	 * @see #getDeployedDevice()
	 * @generated
	 */
	EReference getDeployedDevice_Base_Property();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedLocalCloud <em>Deployed Local Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployed Local Cloud</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedLocalCloud
	 * @generated
	 */
	EClass getDeployedLocalCloud();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedLocalCloud#getGatekeeperSystemName <em>Gatekeeper System Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gatekeeper System Name</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedLocalCloud#getGatekeeperSystemName()
	 * @see #getDeployedLocalCloud()
	 * @generated
	 */
	EAttribute getDeployedLocalCloud_GatekeeperSystemName();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedLocalCloud#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedLocalCloud#getBase_Property()
	 * @see #getDeployedLocalCloud()
	 * @generated
	 */
	EReference getDeployedLocalCloud_Base_Property();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DataSemantics <em>Data Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Semantics</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DataSemantics
	 * @generated
	 */
	EClass getDataSemantics();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DataSemantics#getSemanticModel <em>Semantic Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Semantic Model</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DataSemantics#getSemanticModel()
	 * @see #getDataSemantics()
	 * @generated
	 */
	EAttribute getDataSemantics_SemanticModel();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DataSemantics#getOntology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ontology</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DataSemantics#getOntology()
	 * @see #getDataSemantics()
	 * @generated
	 */
	EAttribute getDataSemantics_Ontology();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DataSemantics#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Schema</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DataSemantics#getSchema()
	 * @see #getDataSemantics()
	 * @generated
	 */
	EAttribute getDataSemantics_Schema();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DataSemantics#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DataSemantics#getBase_Class()
	 * @see #getDataSemantics()
	 * @generated
	 */
	EReference getDataSemantics_Base_Class();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedEntity <em>Deployed Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployed Entity</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedEntity
	 * @generated
	 */
	EClass getDeployedEntity();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedEntity#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedEntity#getBase_Property()
	 * @see #getDeployedEntity()
	 * @generated
	 */
	EReference getDeployedEntity_Base_Property();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm <em>Service Registry Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Registry Form</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm
	 * @generated
	 */
	EClass getServiceRegistryForm();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getMetadata4 <em>Metadata4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata4</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getMetadata4()
	 * @see #getServiceRegistryForm()
	 * @generated
	 */
	EAttribute getServiceRegistryForm_Metadata4();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getServiceName()
	 * @see #getServiceRegistryForm()
	 * @generated
	 */
	EAttribute getServiceRegistryForm_ServiceName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getProducingSystem <em>Producing System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Producing System</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getProducingSystem()
	 * @see #getServiceRegistryForm()
	 * @generated
	 */
	EAttribute getServiceRegistryForm_ProducingSystem();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getEncoding()
	 * @see #getServiceRegistryForm()
	 * @generated
	 */
	EAttribute getServiceRegistryForm_Encoding();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getEndOfValidity <em>End Of Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Of Validity</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getEndOfValidity()
	 * @see #getServiceRegistryForm()
	 * @generated
	 */
	EAttribute getServiceRegistryForm_EndOfValidity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getServiceURI <em>Service URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service URI</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getServiceURI()
	 * @see #getServiceRegistryForm()
	 * @generated
	 */
	EAttribute getServiceRegistryForm_ServiceURI();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getAuthenticationInfo <em>Authentication Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authentication Info</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getAuthenticationInfo()
	 * @see #getServiceRegistryForm()
	 * @generated
	 */
	EAttribute getServiceRegistryForm_AuthenticationInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getSecure <em>Secure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secure</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getSecure()
	 * @see #getServiceRegistryForm()
	 * @generated
	 */
	EAttribute getServiceRegistryForm_Secure();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getCompression <em>Compression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compression</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getCompression()
	 * @see #getServiceRegistryForm()
	 * @generated
	 */
	EAttribute getServiceRegistryForm_Compression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getMetadata1 <em>Metadata1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata1</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getMetadata1()
	 * @see #getServiceRegistryForm()
	 * @generated
	 */
	EAttribute getServiceRegistryForm_Metadata1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getMetadata2 <em>Metadata2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata2</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getMetadata2()
	 * @see #getServiceRegistryForm()
	 * @generated
	 */
	EAttribute getServiceRegistryForm_Metadata2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getMetadata3 <em>Metadata3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata3</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm#getMetadata3()
	 * @see #getServiceRegistryForm()
	 * @generated
	 */
	EAttribute getServiceRegistryForm_Metadata3();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemRegistryForm <em>System Registry Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Registry Form</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemRegistryForm
	 * @generated
	 */
	EClass getSystemRegistryForm();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemRegistryForm#getSystemName <em>System Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Name</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemRegistryForm#getSystemName()
	 * @see #getSystemRegistryForm()
	 * @generated
	 */
	EAttribute getSystemRegistryForm_SystemName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemRegistryForm#getHostDevice <em>Host Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Device</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemRegistryForm#getHostDevice()
	 * @see #getSystemRegistryForm()
	 * @generated
	 */
	EAttribute getSystemRegistryForm_HostDevice();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemRegistryForm#getAuthenticationInfo <em>Authentication Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authentication Info</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemRegistryForm#getAuthenticationInfo()
	 * @see #getSystemRegistryForm()
	 * @generated
	 */
	EAttribute getSystemRegistryForm_AuthenticationInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemRegistryForm#getEndOfValidity <em>End Of Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Of Validity</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemRegistryForm#getEndOfValidity()
	 * @see #getSystemRegistryForm()
	 * @generated
	 */
	EAttribute getSystemRegistryForm_EndOfValidity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemRegistryForm#getServiceURI <em>Service URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service URI</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemRegistryForm#getServiceURI()
	 * @see #getSystemRegistryForm()
	 * @generated
	 */
	EAttribute getSystemRegistryForm_ServiceURI();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemRegistryForm#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemRegistryForm#getVersion()
	 * @see #getSystemRegistryForm()
	 * @generated
	 */
	EAttribute getSystemRegistryForm_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemRegistryForm#getDeployTime <em>Deploy Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deploy Time</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemRegistryForm#getDeployTime()
	 * @see #getSystemRegistryForm()
	 * @generated
	 */
	EAttribute getSystemRegistryForm_DeployTime();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemRegistryForm#getMetadata1 <em>Metadata1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata1</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemRegistryForm#getMetadata1()
	 * @see #getSystemRegistryForm()
	 * @generated
	 */
	EAttribute getSystemRegistryForm_Metadata1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemRegistryForm#getMetadata2 <em>Metadata2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata2</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemRegistryForm#getMetadata2()
	 * @see #getSystemRegistryForm()
	 * @generated
	 */
	EAttribute getSystemRegistryForm_Metadata2();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRegistryForm <em>Device Registry Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Registry Form</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRegistryForm
	 * @generated
	 */
	EClass getDeviceRegistryForm();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRegistryForm#getHostDevice <em>Host Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Device</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRegistryForm#getHostDevice()
	 * @see #getDeviceRegistryForm()
	 * @generated
	 */
	EAttribute getDeviceRegistryForm_HostDevice();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRegistryForm#getAuthenticationInfo <em>Authentication Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authentication Info</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRegistryForm#getAuthenticationInfo()
	 * @see #getDeviceRegistryForm()
	 * @generated
	 */
	EAttribute getDeviceRegistryForm_AuthenticationInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRegistryForm#getEndOfValidity <em>End Of Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Of Validity</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRegistryForm#getEndOfValidity()
	 * @see #getDeviceRegistryForm()
	 * @generated
	 */
	EAttribute getDeviceRegistryForm_EndOfValidity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRegistryForm#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRegistryForm#getVersion()
	 * @see #getDeviceRegistryForm()
	 * @generated
	 */
	EAttribute getDeviceRegistryForm_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRegistryForm#getDeployTime <em>Deploy Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deploy Time</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRegistryForm#getDeployTime()
	 * @see #getDeviceRegistryForm()
	 * @generated
	 */
	EAttribute getDeviceRegistryForm_DeployTime();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRegistryForm#getMetadata1 <em>Metadata1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata1</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRegistryForm#getMetadata1()
	 * @see #getDeviceRegistryForm()
	 * @generated
	 */
	EAttribute getDeviceRegistryForm_Metadata1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRegistryForm#getMetadata2 <em>Metadata2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata2</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRegistryForm#getMetadata2()
	 * @see #getDeviceRegistryForm()
	 * @generated
	 */
	EAttribute getDeviceRegistryForm_Metadata2();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CertificateCreationForm <em>Certificate Creation Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Certificate Creation Form</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CertificateCreationForm
	 * @generated
	 */
	EClass getCertificateCreationForm();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CertificateCreationForm#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CertificateCreationForm#getBase_Class()
	 * @see #getCertificateCreationForm()
	 * @generated
	 */
	EReference getCertificateCreationForm_Base_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CertificateCreationForm#getCommomName <em>Commom Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commom Name</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CertificateCreationForm#getCommomName()
	 * @see #getCertificateCreationForm()
	 * @generated
	 */
	EAttribute getCertificateCreationForm_CommomName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CertificateCreationForm#getKeyAlgorithm <em>Key Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Algorithm</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CertificateCreationForm#getKeyAlgorithm()
	 * @see #getCertificateCreationForm()
	 * @generated
	 */
	EAttribute getCertificateCreationForm_KeyAlgorithm();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CertificateCreationForm#getKeyFormat <em>Key Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Format</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CertificateCreationForm#getKeyFormat()
	 * @see #getCertificateCreationForm()
	 * @generated
	 */
	EAttribute getCertificateCreationForm_KeyFormat();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CertificateCreationForm#getPrivatKey <em>Privat Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Privat Key</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CertificateCreationForm#getPrivatKey()
	 * @see #getCertificateCreationForm()
	 * @generated
	 */
	EAttribute getCertificateCreationForm_PrivatKey();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CertificateCreationForm#getPublicKey <em>Public Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public Key</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CertificateCreationForm#getPublicKey()
	 * @see #getCertificateCreationForm()
	 * @generated
	 */
	EAttribute getCertificateCreationForm_PublicKey();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsDesign <em>Systemof Local Clouds Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Systemof Local Clouds Design</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsDesign
	 * @generated
	 */
	EClass getSystemofLocalCloudsDesign();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsDesign#getLCD <em>LCD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>LCD</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsDesign#getLCD()
	 * @see #getSystemofLocalCloudsDesign()
	 * @generated
	 */
	EReference getSystemofLocalCloudsDesign_LCD();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsDesign#getLCD(org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudDesign) <em>Get LCD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get LCD</em>' operation.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsDesign#getLCD(org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudDesign)
	 * @generated
	 */
	EOperation getSystemofLocalCloudsDesign__GetLCD__LocalCloudDesign();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsDesignDescription <em>Systemof Local Clouds Design Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Systemof Local Clouds Design Description</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsDesignDescription
	 * @generated
	 */
	EClass getSystemofLocalCloudsDesignDescription();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsDesignDescription#getLCDD <em>LCDD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>LCDD</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsDesignDescription#getLCDD()
	 * @see #getSystemofLocalCloudsDesignDescription()
	 * @generated
	 */
	EReference getSystemofLocalCloudsDesignDescription_LCDD();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsDesignDescription#getLCDD(org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCLoudDesignDescription) <em>Get LCDD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get LCDD</em>' operation.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsDesignDescription#getLCDD(org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCLoudDesignDescription)
	 * @generated
	 */
	EOperation getSystemofLocalCloudsDesignDescription__GetLCDD__LocalCLoudDesignDescription();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Network#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Network#getBase_Class()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Base_Class();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ApplicationSysDDHTTP <em>Application Sys DDHTTP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Sys DDHTTP</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ApplicationSysDDHTTP
	 * @generated
	 */
	EClass getApplicationSysDDHTTP();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsDeployed <em>Systemof Local Clouds Deployed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Systemof Local Clouds Deployed</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsDeployed
	 * @generated
	 */
	EClass getSystemofLocalCloudsDeployed();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsDeployed#getLocalCloudDeployed <em>Local Cloud Deployed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Local Cloud Deployed</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsDeployed#getLocalCloudDeployed()
	 * @see #getSystemofLocalCloudsDeployed()
	 * @generated
	 */
	EReference getSystemofLocalCloudsDeployed_LocalCloudDeployed();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsDeployed#getLocalCloudDeployed(org.eclipse.emf.common.util.EList) <em>Get Local Cloud Deployed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Local Cloud Deployed</em>' operation.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsDeployed#getLocalCloudDeployed(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getSystemofLocalCloudsDeployed__GetLocalCloudDeployed__EList();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudDeployed <em>Local Cloud Deployed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Cloud Deployed</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudDeployed
	 * @generated
	 */
	EClass getLocalCloudDeployed();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceDeployed <em>Device Deployed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Deployed</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceDeployed
	 * @generated
	 */
	EClass getDeviceDeployed();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceDeployed#getLocalclouddeployed <em>Localclouddeployed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Localclouddeployed</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceDeployed#getLocalclouddeployed()
	 * @see #getDeviceDeployed()
	 * @generated
	 */
	EReference getDeviceDeployed_Localclouddeployed();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceDeployed#getNetworkdeployed <em>Networkdeployed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Networkdeployed</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceDeployed#getNetworkdeployed()
	 * @see #getDeviceDeployed()
	 * @generated
	 */
	EReference getDeviceDeployed_Networkdeployed();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkDeployed <em>Network Deployed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Deployed</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkDeployed
	 * @generated
	 */
	EClass getNetworkDeployed();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SDDD <em>SDDD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SDDD</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SDDD
	 * @generated
	 */
	EClass getSDDD();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.MQTT_topic <em>MQTT topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MQTT topic</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.MQTT_topic
	 * @generated
	 */
	EClass getMQTT_topic();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.MQTT_topic#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.MQTT_topic#getBase_Class()
	 * @see #getMQTT_topic()
	 * @generated
	 */
	EReference getMQTT_topic_Base_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.MQTT_topic#getSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.MQTT_topic#getSecurity()
	 * @see #getMQTT_topic()
	 * @generated
	 */
	EAttribute getMQTT_topic_Security();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.MQTT_topic#getTopicName <em>Topic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic Name</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.MQTT_topic#getTopicName()
	 * @see #getMQTT_topic()
	 * @generated
	 */
	EAttribute getMQTT_topic_TopicName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.HttpOperation <em>Http Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Http Operation</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.HttpOperation
	 * @generated
	 */
	EClass getHttpOperation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.HttpOperation#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.HttpOperation#getKind()
	 * @see #getHttpOperation()
	 * @generated
	 */
	EAttribute getHttpOperation_Kind();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.HttpOperation#getBase_Operation <em>Base Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Operation</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.HttpOperation#getBase_Operation()
	 * @see #getHttpOperation()
	 * @generated
	 */
	EReference getHttpOperation_Base_Operation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemRequirements <em>System Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Requirements</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemRequirements
	 * @generated
	 */
	EClass getSystemRequirements();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemRequirements#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemRequirements#getBase_Package()
	 * @see #getSystemRequirements()
	 * @generated
	 */
	EReference getSystemRequirements_Base_Package();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkRequirements <em>Network Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Requirements</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkRequirements
	 * @generated
	 */
	EClass getNetworkRequirements();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkRequirements#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkRequirements#getBase_Package()
	 * @see #getNetworkRequirements()
	 * @generated
	 */
	EReference getNetworkRequirements_Base_Package();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocaCloudRequirements <em>Loca Cloud Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loca Cloud Requirements</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocaCloudRequirements
	 * @generated
	 */
	EClass getLocaCloudRequirements();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocaCloudRequirements#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocaCloudRequirements#getBase_Package()
	 * @see #getLocaCloudRequirements()
	 * @generated
	 */
	EReference getLocaCloudRequirements_Base_Package();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsRequirements <em>Systemof Local Clouds Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Systemof Local Clouds Requirements</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsRequirements
	 * @generated
	 */
	EClass getSystemofLocalCloudsRequirements();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsRequirements#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsRequirements#getBase_Package()
	 * @see #getSystemofLocalCloudsRequirements()
	 * @generated
	 */
	EReference getSystemofLocalCloudsRequirements_Base_Package();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRequirements <em>Device Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Requirements</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRequirements
	 * @generated
	 */
	EClass getDeviceRequirements();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRequirements#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRequirements#getBase_Package()
	 * @see #getDeviceRequirements()
	 * @generated
	 */
	EReference getDeviceRequirements_Base_Package();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsMaintenance <em>Systemof Local Clouds Maintenance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Systemof Local Clouds Maintenance</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsMaintenance
	 * @generated
	 */
	EClass getSystemofLocalCloudsMaintenance();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsMaintenance#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsMaintenance#getBase_Class()
	 * @see #getSystemofLocalCloudsMaintenance()
	 * @generated
	 */
	EReference getSystemofLocalCloudsMaintenance_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsMaintenance#getSystemoflocalcloudsdeployed <em>Systemoflocalcloudsdeployed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Systemoflocalcloudsdeployed</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsMaintenance#getSystemoflocalcloudsdeployed()
	 * @see #getSystemofLocalCloudsMaintenance()
	 * @generated
	 */
	EReference getSystemofLocalCloudsMaintenance_Systemoflocalcloudsdeployed();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsEvolution <em>Systemof Local Clouds Evolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Systemof Local Clouds Evolution</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsEvolution
	 * @generated
	 */
	EClass getSystemofLocalCloudsEvolution();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsEvolution#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsEvolution#getBase_Class()
	 * @see #getSystemofLocalCloudsEvolution()
	 * @generated
	 */
	EReference getSystemofLocalCloudsEvolution_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsEvolution#getSystemoflocalcloudsdeployed <em>Systemoflocalcloudsdeployed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Systemoflocalcloudsdeployed</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsEvolution#getSystemoflocalcloudsdeployed()
	 * @see #getSystemofLocalCloudsEvolution()
	 * @generated
	 */
	EReference getSystemofLocalCloudsEvolution_Systemoflocalcloudsdeployed();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudMaintenance <em>Local Cloud Maintenance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Cloud Maintenance</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudMaintenance
	 * @generated
	 */
	EClass getLocalCloudMaintenance();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudMaintenance#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudMaintenance#getBase_Class()
	 * @see #getLocalCloudMaintenance()
	 * @generated
	 */
	EReference getLocalCloudMaintenance_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudMaintenance#getSystemoflocalcloudsmaintenance <em>Systemoflocalcloudsmaintenance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Systemoflocalcloudsmaintenance</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudMaintenance#getSystemoflocalcloudsmaintenance()
	 * @see #getLocalCloudMaintenance()
	 * @generated
	 */
	EReference getLocalCloudMaintenance_Systemoflocalcloudsmaintenance();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudMaintenance#getLocalclouddeployed <em>Localclouddeployed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Localclouddeployed</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudMaintenance#getLocalclouddeployed()
	 * @see #getLocalCloudMaintenance()
	 * @generated
	 */
	EReference getLocalCloudMaintenance_Localclouddeployed();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudEvolution <em>Local Cloud Evolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Cloud Evolution</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudEvolution
	 * @generated
	 */
	EClass getLocalCloudEvolution();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudEvolution#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudEvolution#getBase_Class()
	 * @see #getLocalCloudEvolution()
	 * @generated
	 */
	EReference getLocalCloudEvolution_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudEvolution#getSystemoflocalcloudsevolution <em>Systemoflocalcloudsevolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Systemoflocalcloudsevolution</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudEvolution#getSystemoflocalcloudsevolution()
	 * @see #getLocalCloudEvolution()
	 * @generated
	 */
	EReference getLocalCloudEvolution_Systemoflocalcloudsevolution();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudEvolution#getLocalclouddeployed <em>Localclouddeployed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Localclouddeployed</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudEvolution#getLocalclouddeployed()
	 * @see #getLocalCloudEvolution()
	 * @generated
	 */
	EReference getLocalCloudEvolution_Localclouddeployed();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysMaintenance <em>Sys Maintenance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sys Maintenance</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysMaintenance
	 * @generated
	 */
	EClass getSysMaintenance();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysMaintenance#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysMaintenance#getBase_Class()
	 * @see #getSysMaintenance()
	 * @generated
	 */
	EReference getSysMaintenance_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysMaintenance#getSysimplementation <em>Sysimplementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sysimplementation</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysMaintenance#getSysimplementation()
	 * @see #getSysMaintenance()
	 * @generated
	 */
	EReference getSysMaintenance_Sysimplementation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysMaintenance#getLocalcloudmaintenance <em>Localcloudmaintenance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Localcloudmaintenance</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysMaintenance#getLocalcloudmaintenance()
	 * @see #getSysMaintenance()
	 * @generated
	 */
	EReference getSysMaintenance_Localcloudmaintenance();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysMaintenance#getDevicemaintenance <em>Devicemaintenance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Devicemaintenance</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysMaintenance#getDevicemaintenance()
	 * @see #getSysMaintenance()
	 * @generated
	 */
	EReference getSysMaintenance_Devicemaintenance();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysImplementation <em>Sys Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sys Implementation</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysImplementation
	 * @generated
	 */
	EClass getSysImplementation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysImplementation#getLocalcloudimplementation <em>Localcloudimplementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Localcloudimplementation</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysImplementation#getLocalcloudimplementation()
	 * @see #getSysImplementation()
	 * @generated
	 */
	EReference getSysImplementation_Localcloudimplementation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysImplementation#getDeviceimplementation <em>Deviceimplementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deviceimplementation</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysImplementation#getDeviceimplementation()
	 * @see #getSysImplementation()
	 * @generated
	 */
	EReference getSysImplementation_Deviceimplementation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCLoudImplementation <em>Local CLoud Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local CLoud Implementation</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCLoudImplementation
	 * @generated
	 */
	EClass getLocalCLoudImplementation();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCLoudImplementation#getSystemoflocalcloudsimplementation <em>Systemoflocalcloudsimplementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Systemoflocalcloudsimplementation</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCLoudImplementation#getSystemoflocalcloudsimplementation()
	 * @see #getLocalCLoudImplementation()
	 * @generated
	 */
	EReference getLocalCLoudImplementation_Systemoflocalcloudsimplementation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsImplementation <em>Systemof Local Clouds Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Systemof Local Clouds Implementation</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsImplementation
	 * @generated
	 */
	EClass getSystemofLocalCloudsImplementation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceImplementation <em>Device Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Implementation</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceImplementation
	 * @generated
	 */
	EClass getDeviceImplementation();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceImplementation#getNetworkimplementation <em>Networkimplementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Networkimplementation</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceImplementation#getNetworkimplementation()
	 * @see #getDeviceImplementation()
	 * @generated
	 */
	EReference getDeviceImplementation_Networkimplementation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkImplementation <em>Network Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Implementation</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkImplementation
	 * @generated
	 */
	EClass getNetworkImplementation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceMaintenance <em>Device Maintenance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Maintenance</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceMaintenance
	 * @generated
	 */
	EClass getDeviceMaintenance();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceMaintenance#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceMaintenance#getBase_Class()
	 * @see #getDeviceMaintenance()
	 * @generated
	 */
	EReference getDeviceMaintenance_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceMaintenance#getDevicedeployed <em>Devicedeployed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Devicedeployed</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceMaintenance#getDevicedeployed()
	 * @see #getDeviceMaintenance()
	 * @generated
	 */
	EReference getDeviceMaintenance_Devicedeployed();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceMaintenance#getNetworkmaintenance <em>Networkmaintenance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Networkmaintenance</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceMaintenance#getNetworkmaintenance()
	 * @see #getDeviceMaintenance()
	 * @generated
	 */
	EReference getDeviceMaintenance_Networkmaintenance();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkMaintenance <em>Network Maintenance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Maintenance</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkMaintenance
	 * @generated
	 */
	EClass getNetworkMaintenance();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkMaintenance#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkMaintenance#getBase_Class()
	 * @see #getNetworkMaintenance()
	 * @generated
	 */
	EReference getNetworkMaintenance_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkMaintenance#getNetworkdeployed <em>Networkdeployed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Networkdeployed</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkMaintenance#getNetworkdeployed()
	 * @see #getNetworkMaintenance()
	 * @generated
	 */
	EReference getNetworkMaintenance_Networkdeployed();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysEvolution <em>Sys Evolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sys Evolution</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysEvolution
	 * @generated
	 */
	EClass getSysEvolution();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysEvolution#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysEvolution#getBase_Class()
	 * @see #getSysEvolution()
	 * @generated
	 */
	EReference getSysEvolution_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysEvolution#getLocalcloudevolution <em>Localcloudevolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Localcloudevolution</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysEvolution#getLocalcloudevolution()
	 * @see #getSysEvolution()
	 * @generated
	 */
	EReference getSysEvolution_Localcloudevolution();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysEvolution#getSysimplementation <em>Sysimplementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sysimplementation</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysEvolution#getSysimplementation()
	 * @see #getSysEvolution()
	 * @generated
	 */
	EReference getSysEvolution_Sysimplementation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysEvolution#getDeviceevolution <em>Deviceevolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deviceevolution</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysEvolution#getDeviceevolution()
	 * @see #getSysEvolution()
	 * @generated
	 */
	EReference getSysEvolution_Deviceevolution();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceEvolution <em>Device Evolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Evolution</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceEvolution
	 * @generated
	 */
	EClass getDeviceEvolution();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceEvolution#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceEvolution#getBase_Class()
	 * @see #getDeviceEvolution()
	 * @generated
	 */
	EReference getDeviceEvolution_Base_Class();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceEvolution#getNetworkevolution <em>Networkevolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Networkevolution</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceEvolution#getNetworkevolution()
	 * @see #getDeviceEvolution()
	 * @generated
	 */
	EReference getDeviceEvolution_Networkevolution();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceEvolution#getDevicedeployed <em>Devicedeployed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Devicedeployed</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceEvolution#getDevicedeployed()
	 * @see #getDeviceEvolution()
	 * @generated
	 */
	EReference getDeviceEvolution_Devicedeployed();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkEvolution <em>Network Evolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Evolution</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkEvolution
	 * @generated
	 */
	EClass getNetworkEvolution();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkEvolution#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkEvolution#getBase_Class()
	 * @see #getNetworkEvolution()
	 * @generated
	 */
	EReference getNetworkEvolution_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkEvolution#getNetworkdeployed <em>Networkdeployed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Networkdeployed</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkEvolution#getNetworkdeployed()
	 * @see #getNetworkEvolution()
	 * @generated
	 */
	EReference getNetworkEvolution_Networkdeployed();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Deployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Deployment
	 * @generated
	 */
	EClass getDeployment();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Deployment#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Deployment#getBase_Package()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_Base_Package();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Requirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirements</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Requirements
	 * @generated
	 */
	EClass getRequirements();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Requirements#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Requirements#getBase_Package()
	 * @see #getRequirements()
	 * @generated
	 */
	EReference getRequirements_Base_Package();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.FunctionalDesign <em>Functional Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Design</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.FunctionalDesign
	 * @generated
	 */
	EClass getFunctionalDesign();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.FunctionalDesign#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.FunctionalDesign#getBase_Package()
	 * @see #getFunctionalDesign()
	 * @generated
	 */
	EReference getFunctionalDesign_Base_Package();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ProcurementEngineering <em>Procurement Engineering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procurement Engineering</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ProcurementEngineering
	 * @generated
	 */
	EClass getProcurementEngineering();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ProcurementEngineering#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ProcurementEngineering#getBase_Package()
	 * @see #getProcurementEngineering()
	 * @generated
	 */
	EReference getProcurementEngineering_Base_Package();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Maintenance <em>Maintenance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maintenance</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Maintenance
	 * @generated
	 */
	EClass getMaintenance();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Maintenance#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Maintenance#getBase_Package()
	 * @see #getMaintenance()
	 * @generated
	 */
	EReference getMaintenance_Base_Package();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Evolution <em>Evolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evolution</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Evolution
	 * @generated
	 */
	EClass getEvolution();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Evolution#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Evolution#getBase_Package()
	 * @see #getEvolution()
	 * @generated
	 */
	EReference getEvolution_Base_Package();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysDeployed <em>Sys Deployed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sys Deployed</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysDeployed
	 * @generated
	 */
	EClass getSysDeployed();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysDeployed#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysDeployed#getBase_Class()
	 * @see #getSysDeployed()
	 * @generated
	 */
	EReference getSysDeployed_Base_Class();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ChoreographyDefinition <em>Choreography Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choreography Definition</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ChoreographyDefinition
	 * @generated
	 */
	EClass getChoreographyDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ChoreographyDefinition#getBase_Collaboration <em>Base Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Collaboration</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ChoreographyDefinition#getBase_Collaboration()
	 * @see #getChoreographyDefinition()
	 * @generated
	 */
	EReference getChoreographyDefinition_Base_Collaboration();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CertificateKind <em>Certificate Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Certificate Kind</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CertificateKind
	 * @generated
	 */
	EEnum getCertificateKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.EncodingKind <em>Encoding Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Encoding Kind</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.EncodingKind
	 * @generated
	 */
	EEnum getEncodingKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SecurityKind <em>Security Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Security Kind</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SecurityKind
	 * @generated
	 */
	EEnum getSecurityKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ProtocolKind <em>Protocol Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Protocol Kind</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ProtocolKind
	 * @generated
	 */
	EEnum getProtocolKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CompresionKind <em>Compresion Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Compresion Kind</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CompresionKind
	 * @generated
	 */
	EEnum getCompresionKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CryptoAlgorithmKind <em>Crypto Algorithm Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Crypto Algorithm Kind</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CryptoAlgorithmKind
	 * @generated
	 */
	EEnum getCryptoAlgorithmKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.TokenKind <em>Token Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Token Kind</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.TokenKind
	 * @generated
	 */
	EEnum getTokenKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.PayloadEncryptionKind <em>Payload Encryption Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payload Encryption Kind</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.PayloadEncryptionKind
	 * @generated
	 */
	EEnum getPayloadEncryptionKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.TimeFormatKind <em>Time Format Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Format Kind</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.TimeFormatKind
	 * @generated
	 */
	EEnum getTimeFormatKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.OntologyKind <em>Ontology Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ontology Kind</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.OntologyKind
	 * @generated
	 */
	EEnum getOntologyKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.HttpMethodKind <em>Http Method Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Http Method Kind</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.HttpMethodKind
	 * @generated
	 */
	EEnum getHttpMethodKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SemanticsKind <em>Semantics Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Semantics Kind</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SemanticsKind
	 * @generated
	 */
	EEnum getSemanticsKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InstanceNamingStandardKind <em>Instance Naming Standard Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Instance Naming Standard Kind</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InstanceNamingStandardKind
	 * @generated
	 */
	EEnum getInstanceNamingStandardKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.StatusCodeKind <em>Status Code Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status Code Kind</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.StatusCodeKind
	 * @generated
	 */
	EEnum getStatusCodeKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CoAPMetodKind <em>Co AP Metod Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Co AP Metod Kind</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CoAPMetodKind
	 * @generated
	 */
	EEnum getCoAPMetodKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SchemaType <em>Schema Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Schema Type</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SchemaType
	 * @generated
	 */
	EEnum getSchemaType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.PhysicalLayerKind <em>Physical Layer Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Physical Layer Kind</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.PhysicalLayerKind
	 * @generated
	 */
	EEnum getPhysicalLayerKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.MacKind <em>Mac Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mac Kind</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.MacKind
	 * @generated
	 */
	EEnum getMacKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.EngineeringProcedureKind <em>Engineering Procedure Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Engineering Procedure Kind</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.EngineeringProcedureKind
	 * @generated
	 */
	EEnum getEngineeringProcedureKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.OSKind <em>OS Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OS Kind</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.OSKind
	 * @generated
	 */
	EEnum getOSKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LinuxKind <em>Linux Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Linux Kind</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LinuxKind
	 * @generated
	 */
	EEnum getLinuxKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeploymentLocationKind <em>Deployment Location Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Deployment Location Kind</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeploymentLocationKind
	 * @generated
	 */
	EEnum getDeploymentLocationKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeploymentTimeKind <em>Deployment Time Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Deployment Time Kind</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeploymentTimeKind
	 * @generated
	 */
	EEnum getDeploymentTimeKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceKind <em>Device Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Device Kind</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceKind
	 * @generated
	 */
	EEnum getDeviceKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ProcessortKind <em>Processort Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Processort Kind</em>'.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ProcessortKind
	 * @generated
	 */
	EEnum getProcessortKind();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SysDImpl <em>Sys D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SysDImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSysD()
		 * @generated
		 */
		EClass SYS_D = eINSTANCE.getSysD();

		/**
		 * The meta object literal for the '<em><b>Devicedesign</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYS_D__DEVICEDESIGN = eINSTANCE.getSysD_Devicedesign();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceDesignImpl <em>Device Design</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceDesignImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDeviceDesign()
		 * @generated
		 */
		EClass DEVICE_DESIGN = eINSTANCE.getDeviceDesign();

		/**
		 * The meta object literal for the '<em><b>Networkdesign</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_DESIGN__NETWORKDESIGN = eINSTANCE.getDeviceDesign_Networkdesign();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.NetworkDesignImpl <em>Network Design</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.NetworkDesignImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getNetworkDesign()
		 * @generated
		 */
		EClass NETWORK_DESIGN = eINSTANCE.getNetworkDesign();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SysDDImpl <em>Sys DD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SysDDImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSysDD()
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
		 * The meta object literal for the '<em><b>Devicedesigndesciption</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYS_DD__DEVICEDESIGNDESCIPTION = eINSTANCE.getSysDD_Devicedesigndesciption();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceDesignDesciptionImpl <em>Device Design Desciption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceDesignDesciptionImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDeviceDesignDesciption()
		 * @generated
		 */
		EClass DEVICE_DESIGN_DESCIPTION = eINSTANCE.getDeviceDesignDesciption();

		/**
		 * The meta object literal for the '<em><b>Certificate Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_DESIGN_DESCIPTION__CERTIFICATE_LEVEL = eINSTANCE.getDeviceDesignDesciption_CertificateLevel();

		/**
		 * The meta object literal for the '<em><b>Network Design Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_DESIGN_DESCIPTION__NETWORK_DESIGN_DESCRIPTION = eINSTANCE.getDeviceDesignDesciption_NetworkDesignDescription();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.NetworkDesignDescriptiionImpl <em>Network Design Descriptiion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.NetworkDesignDescriptiionImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getNetworkDesignDescriptiion()
		 * @generated
		 */
		EClass NETWORK_DESIGN_DESCRIPTIION = eINSTANCE.getNetworkDesignDescriptiion();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.InterfaceDesignDescriptionImpl <em>Interface Design Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.InterfaceDesignDescriptionImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getInterfaceDesignDescription()
		 * @generated
		 */
		EClass INTERFACE_DESIGN_DESCRIPTION = eINSTANCE.getInterfaceDesignDescription();

		/**
		 * The meta object literal for the '<em><b>Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_DESIGN_DESCRIPTION__ENCODING = eINSTANCE.getInterfaceDesignDescription_Encoding();

		/**
		 * The meta object literal for the '<em><b>Security</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_DESIGN_DESCRIPTION__SECURITY = eINSTANCE.getInterfaceDesignDescription_Security();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_DESIGN_DESCRIPTION__PROTOCOL = eINSTANCE.getInterfaceDesignDescription_Protocol();

		/**
		 * The meta object literal for the '<em><b>Compression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_DESIGN_DESCRIPTION__COMPRESSION = eINSTANCE.getInterfaceDesignDescription_Compression();

		/**
		 * The meta object literal for the '<em><b>Crypto Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_DESIGN_DESCRIPTION__CRYPTO_ALGORITHM = eINSTANCE.getInterfaceDesignDescription_CryptoAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_DESIGN_DESCRIPTION__TOKEN = eINSTANCE.getInterfaceDesignDescription_Token();

		/**
		 * The meta object literal for the '<em><b>Certificate Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_DESIGN_DESCRIPTION__CERTIFICATE_LEVEL = eINSTANCE.getInterfaceDesignDescription_CertificateLevel();

		/**
		 * The meta object literal for the '<em><b>Payload Encryption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_DESIGN_DESCRIPTION__PAYLOAD_ENCRYPTION = eINSTANCE.getInterfaceDesignDescription_PayloadEncryption();

		/**
		 * The meta object literal for the '<em><b>Time Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_DESIGN_DESCRIPTION__TIME_FORMAT = eINSTANCE.getInterfaceDesignDescription_TimeFormat();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ServiceDescriptionImpl <em>Service Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ServiceDescriptionImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getServiceDescription()
		 * @generated
		 */
		EClass SERVICE_DESCRIPTION = eINSTANCE.getServiceDescription();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SubsetOfImpl <em>Subset Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SubsetOfImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSubsetOf()
		 * @generated
		 */
		EClass SUBSET_OF = eINSTANCE.getSubsetOf();

		/**
		 * The meta object literal for the '<em><b>Base Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSET_OF__BASE_DEPENDENCY = eINSTANCE.getSubsetOf_Base_Dependency();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Certificate Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__CERTIFICATE_LEVEL = eINSTANCE.getDevice_CertificateLevel();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.MetaDataEntryImpl <em>Meta Data Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.MetaDataEntryImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getMetaDataEntry()
		 * @generated
		 */
		EClass META_DATA_ENTRY = eINSTANCE.getMetaDataEntry();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_DATA_ENTRY__BASE_CLASS = eINSTANCE.getMetaDataEntry_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_DATA_ENTRY__DATA = eINSTANCE.getMetaDataEntry_Data();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeployedServiceImpl <em>Deployed Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeployedServiceImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDeployedService()
		 * @generated
		 */
		EClass DEPLOYED_SERVICE = eINSTANCE.getDeployedService();

		/**
		 * The meta object literal for the '<em><b>Deployed Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYED_SERVICE__DEPLOYED_SERVICE_NAME = eINSTANCE.getDeployedService_DeployedServiceName();

		/**
		 * The meta object literal for the '<em><b>URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYED_SERVICE__URL = eINSTANCE.getDeployedService_URL();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYED_SERVICE__PORT = eINSTANCE.getDeployedService_Port();

		/**
		 * The meta object literal for the '<em><b>Certificate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYED_SERVICE__CERTIFICATE = eINSTANCE.getDeployedService_Certificate();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYED_SERVICE__METADATA = eINSTANCE.getDeployedService_Metadata();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYED_SERVICE__BASE_PROPERTY = eINSTANCE.getDeployedService_Base_Property();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.LocalCloudDesignImpl <em>Local Cloud Design</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.LocalCloudDesignImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getLocalCloudDesign()
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
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.LocalCLoudDesignDescriptionImpl <em>Local CLoud Design Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.LocalCLoudDesignDescriptionImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getLocalCLoudDesignDescription()
		 * @generated
		 */
		EClass LOCAL_CLOUD_DESIGN_DESCRIPTION = eINSTANCE.getLocalCLoudDesignDescription();

		/**
		 * The meta object literal for the '<em><b>Sys DD</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_CLOUD_DESIGN_DESCRIPTION__SYS_DD = eINSTANCE.getLocalCLoudDesignDescription_SysDD();

		/**
		 * The meta object literal for the '<em><b>Get Sys DD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOCAL_CLOUD_DESIGN_DESCRIPTION___GET_SYS_DD__SYSDD = eINSTANCE.getLocalCLoudDesignDescription__GetSysDD__SysDD();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeployedDeviceImpl <em>Deployed Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeployedDeviceImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDeployedDevice()
		 * @generated
		 */
		EClass DEPLOYED_DEVICE = eINSTANCE.getDeployedDevice();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYED_DEVICE__METADATA = eINSTANCE.getDeployedDevice_Metadata();

		/**
		 * The meta object literal for the '<em><b>Mac Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYED_DEVICE__MAC_ADDRESS = eINSTANCE.getDeployedDevice_MacAddress();

		/**
		 * The meta object literal for the '<em><b>Network Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYED_DEVICE__NETWORK_INTERFACE = eINSTANCE.getDeployedDevice_NetworkInterface();

		/**
		 * The meta object literal for the '<em><b>Mac Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYED_DEVICE__MAC_PROTOCOL = eINSTANCE.getDeployedDevice_MacProtocol();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYED_DEVICE__BASE_PROPERTY = eINSTANCE.getDeployedDevice_Base_Property();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeployedLocalCloudImpl <em>Deployed Local Cloud</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeployedLocalCloudImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDeployedLocalCloud()
		 * @generated
		 */
		EClass DEPLOYED_LOCAL_CLOUD = eINSTANCE.getDeployedLocalCloud();

		/**
		 * The meta object literal for the '<em><b>Gatekeeper System Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYED_LOCAL_CLOUD__GATEKEEPER_SYSTEM_NAME = eINSTANCE.getDeployedLocalCloud_GatekeeperSystemName();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYED_LOCAL_CLOUD__BASE_PROPERTY = eINSTANCE.getDeployedLocalCloud_Base_Property();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DataSemanticsImpl <em>Data Semantics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DataSemanticsImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDataSemantics()
		 * @generated
		 */
		EClass DATA_SEMANTICS = eINSTANCE.getDataSemantics();

		/**
		 * The meta object literal for the '<em><b>Semantic Model</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SEMANTICS__SEMANTIC_MODEL = eINSTANCE.getDataSemantics_SemanticModel();

		/**
		 * The meta object literal for the '<em><b>Ontology</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SEMANTICS__ONTOLOGY = eINSTANCE.getDataSemantics_Ontology();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SEMANTICS__SCHEMA = eINSTANCE.getDataSemantics_Schema();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SEMANTICS__BASE_CLASS = eINSTANCE.getDataSemantics_Base_Class();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeployedEntityImpl <em>Deployed Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeployedEntityImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDeployedEntity()
		 * @generated
		 */
		EClass DEPLOYED_ENTITY = eINSTANCE.getDeployedEntity();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYED_ENTITY__BASE_PROPERTY = eINSTANCE.getDeployedEntity_Base_Property();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ServiceRegistryFormImpl <em>Service Registry Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ServiceRegistryFormImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getServiceRegistryForm()
		 * @generated
		 */
		EClass SERVICE_REGISTRY_FORM = eINSTANCE.getServiceRegistryForm();

		/**
		 * The meta object literal for the '<em><b>Metadata4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REGISTRY_FORM__METADATA4 = eINSTANCE.getServiceRegistryForm_Metadata4();

		/**
		 * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REGISTRY_FORM__SERVICE_NAME = eINSTANCE.getServiceRegistryForm_ServiceName();

		/**
		 * The meta object literal for the '<em><b>Producing System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REGISTRY_FORM__PRODUCING_SYSTEM = eINSTANCE.getServiceRegistryForm_ProducingSystem();

		/**
		 * The meta object literal for the '<em><b>Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REGISTRY_FORM__ENCODING = eINSTANCE.getServiceRegistryForm_Encoding();

		/**
		 * The meta object literal for the '<em><b>End Of Validity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REGISTRY_FORM__END_OF_VALIDITY = eINSTANCE.getServiceRegistryForm_EndOfValidity();

		/**
		 * The meta object literal for the '<em><b>Service URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REGISTRY_FORM__SERVICE_URI = eINSTANCE.getServiceRegistryForm_ServiceURI();

		/**
		 * The meta object literal for the '<em><b>Authentication Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REGISTRY_FORM__AUTHENTICATION_INFO = eINSTANCE.getServiceRegistryForm_AuthenticationInfo();

		/**
		 * The meta object literal for the '<em><b>Secure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REGISTRY_FORM__SECURE = eINSTANCE.getServiceRegistryForm_Secure();

		/**
		 * The meta object literal for the '<em><b>Compression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REGISTRY_FORM__COMPRESSION = eINSTANCE.getServiceRegistryForm_Compression();

		/**
		 * The meta object literal for the '<em><b>Metadata1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REGISTRY_FORM__METADATA1 = eINSTANCE.getServiceRegistryForm_Metadata1();

		/**
		 * The meta object literal for the '<em><b>Metadata2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REGISTRY_FORM__METADATA2 = eINSTANCE.getServiceRegistryForm_Metadata2();

		/**
		 * The meta object literal for the '<em><b>Metadata3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REGISTRY_FORM__METADATA3 = eINSTANCE.getServiceRegistryForm_Metadata3();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SystemRegistryFormImpl <em>System Registry Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SystemRegistryFormImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSystemRegistryForm()
		 * @generated
		 */
		EClass SYSTEM_REGISTRY_FORM = eINSTANCE.getSystemRegistryForm();

		/**
		 * The meta object literal for the '<em><b>System Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_REGISTRY_FORM__SYSTEM_NAME = eINSTANCE.getSystemRegistryForm_SystemName();

		/**
		 * The meta object literal for the '<em><b>Host Device</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_REGISTRY_FORM__HOST_DEVICE = eINSTANCE.getSystemRegistryForm_HostDevice();

		/**
		 * The meta object literal for the '<em><b>Authentication Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_REGISTRY_FORM__AUTHENTICATION_INFO = eINSTANCE.getSystemRegistryForm_AuthenticationInfo();

		/**
		 * The meta object literal for the '<em><b>End Of Validity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_REGISTRY_FORM__END_OF_VALIDITY = eINSTANCE.getSystemRegistryForm_EndOfValidity();

		/**
		 * The meta object literal for the '<em><b>Service URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_REGISTRY_FORM__SERVICE_URI = eINSTANCE.getSystemRegistryForm_ServiceURI();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_REGISTRY_FORM__VERSION = eINSTANCE.getSystemRegistryForm_Version();

		/**
		 * The meta object literal for the '<em><b>Deploy Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_REGISTRY_FORM__DEPLOY_TIME = eINSTANCE.getSystemRegistryForm_DeployTime();

		/**
		 * The meta object literal for the '<em><b>Metadata1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_REGISTRY_FORM__METADATA1 = eINSTANCE.getSystemRegistryForm_Metadata1();

		/**
		 * The meta object literal for the '<em><b>Metadata2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_REGISTRY_FORM__METADATA2 = eINSTANCE.getSystemRegistryForm_Metadata2();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceRegistryFormImpl <em>Device Registry Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceRegistryFormImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDeviceRegistryForm()
		 * @generated
		 */
		EClass DEVICE_REGISTRY_FORM = eINSTANCE.getDeviceRegistryForm();

		/**
		 * The meta object literal for the '<em><b>Host Device</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_REGISTRY_FORM__HOST_DEVICE = eINSTANCE.getDeviceRegistryForm_HostDevice();

		/**
		 * The meta object literal for the '<em><b>Authentication Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_REGISTRY_FORM__AUTHENTICATION_INFO = eINSTANCE.getDeviceRegistryForm_AuthenticationInfo();

		/**
		 * The meta object literal for the '<em><b>End Of Validity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_REGISTRY_FORM__END_OF_VALIDITY = eINSTANCE.getDeviceRegistryForm_EndOfValidity();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_REGISTRY_FORM__VERSION = eINSTANCE.getDeviceRegistryForm_Version();

		/**
		 * The meta object literal for the '<em><b>Deploy Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_REGISTRY_FORM__DEPLOY_TIME = eINSTANCE.getDeviceRegistryForm_DeployTime();

		/**
		 * The meta object literal for the '<em><b>Metadata1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_REGISTRY_FORM__METADATA1 = eINSTANCE.getDeviceRegistryForm_Metadata1();

		/**
		 * The meta object literal for the '<em><b>Metadata2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_REGISTRY_FORM__METADATA2 = eINSTANCE.getDeviceRegistryForm_Metadata2();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.CertificateCreationFormImpl <em>Certificate Creation Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.CertificateCreationFormImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getCertificateCreationForm()
		 * @generated
		 */
		EClass CERTIFICATE_CREATION_FORM = eINSTANCE.getCertificateCreationForm();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CERTIFICATE_CREATION_FORM__BASE_CLASS = eINSTANCE.getCertificateCreationForm_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Commom Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE_CREATION_FORM__COMMOM_NAME = eINSTANCE.getCertificateCreationForm_CommomName();

		/**
		 * The meta object literal for the '<em><b>Key Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE_CREATION_FORM__KEY_ALGORITHM = eINSTANCE.getCertificateCreationForm_KeyAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Key Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE_CREATION_FORM__KEY_FORMAT = eINSTANCE.getCertificateCreationForm_KeyFormat();

		/**
		 * The meta object literal for the '<em><b>Privat Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE_CREATION_FORM__PRIVAT_KEY = eINSTANCE.getCertificateCreationForm_PrivatKey();

		/**
		 * The meta object literal for the '<em><b>Public Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE_CREATION_FORM__PUBLIC_KEY = eINSTANCE.getCertificateCreationForm_PublicKey();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SystemofLocalCloudsDesignImpl <em>Systemof Local Clouds Design</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SystemofLocalCloudsDesignImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSystemofLocalCloudsDesign()
		 * @generated
		 */
		EClass SYSTEMOF_LOCAL_CLOUDS_DESIGN = eINSTANCE.getSystemofLocalCloudsDesign();

		/**
		 * The meta object literal for the '<em><b>LCD</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEMOF_LOCAL_CLOUDS_DESIGN__LCD = eINSTANCE.getSystemofLocalCloudsDesign_LCD();

		/**
		 * The meta object literal for the '<em><b>Get LCD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYSTEMOF_LOCAL_CLOUDS_DESIGN___GET_LCD__LOCALCLOUDDESIGN = eINSTANCE.getSystemofLocalCloudsDesign__GetLCD__LocalCloudDesign();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SystemofLocalCloudsDesignDescriptionImpl <em>Systemof Local Clouds Design Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SystemofLocalCloudsDesignDescriptionImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSystemofLocalCloudsDesignDescription()
		 * @generated
		 */
		EClass SYSTEMOF_LOCAL_CLOUDS_DESIGN_DESCRIPTION = eINSTANCE.getSystemofLocalCloudsDesignDescription();

		/**
		 * The meta object literal for the '<em><b>LCDD</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEMOF_LOCAL_CLOUDS_DESIGN_DESCRIPTION__LCDD = eINSTANCE.getSystemofLocalCloudsDesignDescription_LCDD();

		/**
		 * The meta object literal for the '<em><b>Get LCDD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYSTEMOF_LOCAL_CLOUDS_DESIGN_DESCRIPTION___GET_LCDD__LOCALCLOUDDESIGNDESCRIPTION = eINSTANCE.getSystemofLocalCloudsDesignDescription__GetLCDD__LocalCLoudDesignDescription();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.NetworkImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__BASE_CLASS = eINSTANCE.getNetwork_Base_Class();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ApplicationSysDDHTTPImpl <em>Application Sys DDHTTP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ApplicationSysDDHTTPImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getApplicationSysDDHTTP()
		 * @generated
		 */
		EClass APPLICATION_SYS_DDHTTP = eINSTANCE.getApplicationSysDDHTTP();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SystemofLocalCloudsDeployedImpl <em>Systemof Local Clouds Deployed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SystemofLocalCloudsDeployedImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSystemofLocalCloudsDeployed()
		 * @generated
		 */
		EClass SYSTEMOF_LOCAL_CLOUDS_DEPLOYED = eINSTANCE.getSystemofLocalCloudsDeployed();

		/**
		 * The meta object literal for the '<em><b>Local Cloud Deployed</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEMOF_LOCAL_CLOUDS_DEPLOYED__LOCAL_CLOUD_DEPLOYED = eINSTANCE.getSystemofLocalCloudsDeployed_LocalCloudDeployed();

		/**
		 * The meta object literal for the '<em><b>Get Local Cloud Deployed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYSTEMOF_LOCAL_CLOUDS_DEPLOYED___GET_LOCAL_CLOUD_DEPLOYED__ELIST = eINSTANCE.getSystemofLocalCloudsDeployed__GetLocalCloudDeployed__EList();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.LocalCloudDeployedImpl <em>Local Cloud Deployed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.LocalCloudDeployedImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getLocalCloudDeployed()
		 * @generated
		 */
		EClass LOCAL_CLOUD_DEPLOYED = eINSTANCE.getLocalCloudDeployed();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceDeployedImpl <em>Device Deployed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceDeployedImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDeviceDeployed()
		 * @generated
		 */
		EClass DEVICE_DEPLOYED = eINSTANCE.getDeviceDeployed();

		/**
		 * The meta object literal for the '<em><b>Localclouddeployed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_DEPLOYED__LOCALCLOUDDEPLOYED = eINSTANCE.getDeviceDeployed_Localclouddeployed();

		/**
		 * The meta object literal for the '<em><b>Networkdeployed</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_DEPLOYED__NETWORKDEPLOYED = eINSTANCE.getDeviceDeployed_Networkdeployed();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.NetworkDeployedImpl <em>Network Deployed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.NetworkDeployedImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getNetworkDeployed()
		 * @generated
		 */
		EClass NETWORK_DEPLOYED = eINSTANCE.getNetworkDeployed();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SDDDImpl <em>SDDD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SDDDImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSDDD()
		 * @generated
		 */
		EClass SDDD = eINSTANCE.getSDDD();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.MQTT_topicImpl <em>MQTT topic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.MQTT_topicImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getMQTT_topic()
		 * @generated
		 */
		EClass MQTT_TOPIC = eINSTANCE.getMQTT_topic();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MQTT_TOPIC__BASE_CLASS = eINSTANCE.getMQTT_topic_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Security</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MQTT_TOPIC__SECURITY = eINSTANCE.getMQTT_topic_Security();

		/**
		 * The meta object literal for the '<em><b>Topic Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MQTT_TOPIC__TOPIC_NAME = eINSTANCE.getMQTT_topic_TopicName();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.HttpOperationImpl <em>Http Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.HttpOperationImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getHttpOperation()
		 * @generated
		 */
		EClass HTTP_OPERATION = eINSTANCE.getHttpOperation();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_OPERATION__KIND = eINSTANCE.getHttpOperation_Kind();

		/**
		 * The meta object literal for the '<em><b>Base Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_OPERATION__BASE_OPERATION = eINSTANCE.getHttpOperation_Base_Operation();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SystemRequirementsImpl <em>System Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SystemRequirementsImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSystemRequirements()
		 * @generated
		 */
		EClass SYSTEM_REQUIREMENTS = eINSTANCE.getSystemRequirements();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_REQUIREMENTS__BASE_PACKAGE = eINSTANCE.getSystemRequirements_Base_Package();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.NetworkRequirementsImpl <em>Network Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.NetworkRequirementsImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getNetworkRequirements()
		 * @generated
		 */
		EClass NETWORK_REQUIREMENTS = eINSTANCE.getNetworkRequirements();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_REQUIREMENTS__BASE_PACKAGE = eINSTANCE.getNetworkRequirements_Base_Package();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.LocaCloudRequirementsImpl <em>Loca Cloud Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.LocaCloudRequirementsImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getLocaCloudRequirements()
		 * @generated
		 */
		EClass LOCA_CLOUD_REQUIREMENTS = eINSTANCE.getLocaCloudRequirements();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCA_CLOUD_REQUIREMENTS__BASE_PACKAGE = eINSTANCE.getLocaCloudRequirements_Base_Package();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SystemofLocalCloudsRequirementsImpl <em>Systemof Local Clouds Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SystemofLocalCloudsRequirementsImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSystemofLocalCloudsRequirements()
		 * @generated
		 */
		EClass SYSTEMOF_LOCAL_CLOUDS_REQUIREMENTS = eINSTANCE.getSystemofLocalCloudsRequirements();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEMOF_LOCAL_CLOUDS_REQUIREMENTS__BASE_PACKAGE = eINSTANCE.getSystemofLocalCloudsRequirements_Base_Package();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceRequirementsImpl <em>Device Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceRequirementsImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDeviceRequirements()
		 * @generated
		 */
		EClass DEVICE_REQUIREMENTS = eINSTANCE.getDeviceRequirements();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_REQUIREMENTS__BASE_PACKAGE = eINSTANCE.getDeviceRequirements_Base_Package();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SystemofLocalCloudsMaintenanceImpl <em>Systemof Local Clouds Maintenance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SystemofLocalCloudsMaintenanceImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSystemofLocalCloudsMaintenance()
		 * @generated
		 */
		EClass SYSTEMOF_LOCAL_CLOUDS_MAINTENANCE = eINSTANCE.getSystemofLocalCloudsMaintenance();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEMOF_LOCAL_CLOUDS_MAINTENANCE__BASE_CLASS = eINSTANCE.getSystemofLocalCloudsMaintenance_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Systemoflocalcloudsdeployed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEMOF_LOCAL_CLOUDS_MAINTENANCE__SYSTEMOFLOCALCLOUDSDEPLOYED = eINSTANCE.getSystemofLocalCloudsMaintenance_Systemoflocalcloudsdeployed();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SystemofLocalCloudsEvolutionImpl <em>Systemof Local Clouds Evolution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SystemofLocalCloudsEvolutionImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSystemofLocalCloudsEvolution()
		 * @generated
		 */
		EClass SYSTEMOF_LOCAL_CLOUDS_EVOLUTION = eINSTANCE.getSystemofLocalCloudsEvolution();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEMOF_LOCAL_CLOUDS_EVOLUTION__BASE_CLASS = eINSTANCE.getSystemofLocalCloudsEvolution_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Systemoflocalcloudsdeployed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEMOF_LOCAL_CLOUDS_EVOLUTION__SYSTEMOFLOCALCLOUDSDEPLOYED = eINSTANCE.getSystemofLocalCloudsEvolution_Systemoflocalcloudsdeployed();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.LocalCloudMaintenanceImpl <em>Local Cloud Maintenance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.LocalCloudMaintenanceImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getLocalCloudMaintenance()
		 * @generated
		 */
		EClass LOCAL_CLOUD_MAINTENANCE = eINSTANCE.getLocalCloudMaintenance();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_CLOUD_MAINTENANCE__BASE_CLASS = eINSTANCE.getLocalCloudMaintenance_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Systemoflocalcloudsmaintenance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_CLOUD_MAINTENANCE__SYSTEMOFLOCALCLOUDSMAINTENANCE = eINSTANCE.getLocalCloudMaintenance_Systemoflocalcloudsmaintenance();

		/**
		 * The meta object literal for the '<em><b>Localclouddeployed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_CLOUD_MAINTENANCE__LOCALCLOUDDEPLOYED = eINSTANCE.getLocalCloudMaintenance_Localclouddeployed();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.LocalCloudEvolutionImpl <em>Local Cloud Evolution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.LocalCloudEvolutionImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getLocalCloudEvolution()
		 * @generated
		 */
		EClass LOCAL_CLOUD_EVOLUTION = eINSTANCE.getLocalCloudEvolution();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_CLOUD_EVOLUTION__BASE_CLASS = eINSTANCE.getLocalCloudEvolution_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Systemoflocalcloudsevolution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_CLOUD_EVOLUTION__SYSTEMOFLOCALCLOUDSEVOLUTION = eINSTANCE.getLocalCloudEvolution_Systemoflocalcloudsevolution();

		/**
		 * The meta object literal for the '<em><b>Localclouddeployed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_CLOUD_EVOLUTION__LOCALCLOUDDEPLOYED = eINSTANCE.getLocalCloudEvolution_Localclouddeployed();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SysMaintenanceImpl <em>Sys Maintenance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SysMaintenanceImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSysMaintenance()
		 * @generated
		 */
		EClass SYS_MAINTENANCE = eINSTANCE.getSysMaintenance();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYS_MAINTENANCE__BASE_CLASS = eINSTANCE.getSysMaintenance_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Sysimplementation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYS_MAINTENANCE__SYSIMPLEMENTATION = eINSTANCE.getSysMaintenance_Sysimplementation();

		/**
		 * The meta object literal for the '<em><b>Localcloudmaintenance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYS_MAINTENANCE__LOCALCLOUDMAINTENANCE = eINSTANCE.getSysMaintenance_Localcloudmaintenance();

		/**
		 * The meta object literal for the '<em><b>Devicemaintenance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYS_MAINTENANCE__DEVICEMAINTENANCE = eINSTANCE.getSysMaintenance_Devicemaintenance();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SysImplementationImpl <em>Sys Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SysImplementationImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSysImplementation()
		 * @generated
		 */
		EClass SYS_IMPLEMENTATION = eINSTANCE.getSysImplementation();

		/**
		 * The meta object literal for the '<em><b>Localcloudimplementation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYS_IMPLEMENTATION__LOCALCLOUDIMPLEMENTATION = eINSTANCE.getSysImplementation_Localcloudimplementation();

		/**
		 * The meta object literal for the '<em><b>Deviceimplementation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYS_IMPLEMENTATION__DEVICEIMPLEMENTATION = eINSTANCE.getSysImplementation_Deviceimplementation();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.LocalCLoudImplementationImpl <em>Local CLoud Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.LocalCLoudImplementationImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getLocalCLoudImplementation()
		 * @generated
		 */
		EClass LOCAL_CLOUD_IMPLEMENTATION = eINSTANCE.getLocalCLoudImplementation();

		/**
		 * The meta object literal for the '<em><b>Systemoflocalcloudsimplementation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_CLOUD_IMPLEMENTATION__SYSTEMOFLOCALCLOUDSIMPLEMENTATION = eINSTANCE.getLocalCLoudImplementation_Systemoflocalcloudsimplementation();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SystemofLocalCloudsImplementationImpl <em>Systemof Local Clouds Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SystemofLocalCloudsImplementationImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSystemofLocalCloudsImplementation()
		 * @generated
		 */
		EClass SYSTEMOF_LOCAL_CLOUDS_IMPLEMENTATION = eINSTANCE.getSystemofLocalCloudsImplementation();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceImplementationImpl <em>Device Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceImplementationImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDeviceImplementation()
		 * @generated
		 */
		EClass DEVICE_IMPLEMENTATION = eINSTANCE.getDeviceImplementation();

		/**
		 * The meta object literal for the '<em><b>Networkimplementation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_IMPLEMENTATION__NETWORKIMPLEMENTATION = eINSTANCE.getDeviceImplementation_Networkimplementation();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.NetworkImplementationImpl <em>Network Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.NetworkImplementationImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getNetworkImplementation()
		 * @generated
		 */
		EClass NETWORK_IMPLEMENTATION = eINSTANCE.getNetworkImplementation();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceMaintenanceImpl <em>Device Maintenance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceMaintenanceImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDeviceMaintenance()
		 * @generated
		 */
		EClass DEVICE_MAINTENANCE = eINSTANCE.getDeviceMaintenance();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MAINTENANCE__BASE_CLASS = eINSTANCE.getDeviceMaintenance_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Devicedeployed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MAINTENANCE__DEVICEDEPLOYED = eINSTANCE.getDeviceMaintenance_Devicedeployed();

		/**
		 * The meta object literal for the '<em><b>Networkmaintenance</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_MAINTENANCE__NETWORKMAINTENANCE = eINSTANCE.getDeviceMaintenance_Networkmaintenance();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.NetworkMaintenanceImpl <em>Network Maintenance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.NetworkMaintenanceImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getNetworkMaintenance()
		 * @generated
		 */
		EClass NETWORK_MAINTENANCE = eINSTANCE.getNetworkMaintenance();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_MAINTENANCE__BASE_CLASS = eINSTANCE.getNetworkMaintenance_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Networkdeployed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_MAINTENANCE__NETWORKDEPLOYED = eINSTANCE.getNetworkMaintenance_Networkdeployed();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SysEvolutionImpl <em>Sys Evolution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SysEvolutionImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSysEvolution()
		 * @generated
		 */
		EClass SYS_EVOLUTION = eINSTANCE.getSysEvolution();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYS_EVOLUTION__BASE_CLASS = eINSTANCE.getSysEvolution_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Localcloudevolution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYS_EVOLUTION__LOCALCLOUDEVOLUTION = eINSTANCE.getSysEvolution_Localcloudevolution();

		/**
		 * The meta object literal for the '<em><b>Sysimplementation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYS_EVOLUTION__SYSIMPLEMENTATION = eINSTANCE.getSysEvolution_Sysimplementation();

		/**
		 * The meta object literal for the '<em><b>Deviceevolution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYS_EVOLUTION__DEVICEEVOLUTION = eINSTANCE.getSysEvolution_Deviceevolution();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceEvolutionImpl <em>Device Evolution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceEvolutionImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDeviceEvolution()
		 * @generated
		 */
		EClass DEVICE_EVOLUTION = eINSTANCE.getDeviceEvolution();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_EVOLUTION__BASE_CLASS = eINSTANCE.getDeviceEvolution_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Networkevolution</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_EVOLUTION__NETWORKEVOLUTION = eINSTANCE.getDeviceEvolution_Networkevolution();

		/**
		 * The meta object literal for the '<em><b>Devicedeployed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_EVOLUTION__DEVICEDEPLOYED = eINSTANCE.getDeviceEvolution_Devicedeployed();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.NetworkEvolutionImpl <em>Network Evolution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.NetworkEvolutionImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getNetworkEvolution()
		 * @generated
		 */
		EClass NETWORK_EVOLUTION = eINSTANCE.getNetworkEvolution();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_EVOLUTION__BASE_CLASS = eINSTANCE.getNetworkEvolution_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Networkdeployed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_EVOLUTION__NETWORKDEPLOYED = eINSTANCE.getNetworkEvolution_Networkdeployed();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeploymentImpl <em>Deployment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeploymentImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDeployment()
		 * @generated
		 */
		EClass DEPLOYMENT = eINSTANCE.getDeployment();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__BASE_PACKAGE = eINSTANCE.getDeployment_Base_Package();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.RequirementsImpl <em>Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.RequirementsImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getRequirements()
		 * @generated
		 */
		EClass REQUIREMENTS = eINSTANCE.getRequirements();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS__BASE_PACKAGE = eINSTANCE.getRequirements_Base_Package();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.FunctionalDesignImpl <em>Functional Design</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.FunctionalDesignImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getFunctionalDesign()
		 * @generated
		 */
		EClass FUNCTIONAL_DESIGN = eINSTANCE.getFunctionalDesign();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_DESIGN__BASE_PACKAGE = eINSTANCE.getFunctionalDesign_Base_Package();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ProcurementEngineeringImpl <em>Procurement Engineering</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ProcurementEngineeringImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getProcurementEngineering()
		 * @generated
		 */
		EClass PROCUREMENT_ENGINEERING = eINSTANCE.getProcurementEngineering();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCUREMENT_ENGINEERING__BASE_PACKAGE = eINSTANCE.getProcurementEngineering_Base_Package();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.MaintenanceImpl <em>Maintenance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.MaintenanceImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getMaintenance()
		 * @generated
		 */
		EClass MAINTENANCE = eINSTANCE.getMaintenance();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAINTENANCE__BASE_PACKAGE = eINSTANCE.getMaintenance_Base_Package();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.EvolutionImpl <em>Evolution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.EvolutionImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getEvolution()
		 * @generated
		 */
		EClass EVOLUTION = eINSTANCE.getEvolution();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVOLUTION__BASE_PACKAGE = eINSTANCE.getEvolution_Base_Package();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SysDeployedImpl <em>Sys Deployed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.SysDeployedImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSysDeployed()
		 * @generated
		 */
		EClass SYS_DEPLOYED = eINSTANCE.getSysDeployed();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYS_DEPLOYED__BASE_CLASS = eINSTANCE.getSysDeployed_Base_Class();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ChoreographyDefinitionImpl <em>Choreography Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ChoreographyDefinitionImpl
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getChoreographyDefinition()
		 * @generated
		 */
		EClass CHOREOGRAPHY_DEFINITION = eINSTANCE.getChoreographyDefinition();

		/**
		 * The meta object literal for the '<em><b>Base Collaboration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOREOGRAPHY_DEFINITION__BASE_COLLABORATION = eINSTANCE.getChoreographyDefinition_Base_Collaboration();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CertificateKind <em>Certificate Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CertificateKind
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getCertificateKind()
		 * @generated
		 */
		EEnum CERTIFICATE_KIND = eINSTANCE.getCertificateKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.EncodingKind <em>Encoding Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.EncodingKind
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getEncodingKind()
		 * @generated
		 */
		EEnum ENCODING_KIND = eINSTANCE.getEncodingKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SecurityKind <em>Security Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SecurityKind
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSecurityKind()
		 * @generated
		 */
		EEnum SECURITY_KIND = eINSTANCE.getSecurityKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ProtocolKind <em>Protocol Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ProtocolKind
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getProtocolKind()
		 * @generated
		 */
		EEnum PROTOCOL_KIND = eINSTANCE.getProtocolKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CompresionKind <em>Compresion Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CompresionKind
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getCompresionKind()
		 * @generated
		 */
		EEnum COMPRESION_KIND = eINSTANCE.getCompresionKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CryptoAlgorithmKind <em>Crypto Algorithm Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CryptoAlgorithmKind
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getCryptoAlgorithmKind()
		 * @generated
		 */
		EEnum CRYPTO_ALGORITHM_KIND = eINSTANCE.getCryptoAlgorithmKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.TokenKind <em>Token Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.TokenKind
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getTokenKind()
		 * @generated
		 */
		EEnum TOKEN_KIND = eINSTANCE.getTokenKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.PayloadEncryptionKind <em>Payload Encryption Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.PayloadEncryptionKind
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getPayloadEncryptionKind()
		 * @generated
		 */
		EEnum PAYLOAD_ENCRYPTION_KIND = eINSTANCE.getPayloadEncryptionKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.TimeFormatKind <em>Time Format Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.TimeFormatKind
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getTimeFormatKind()
		 * @generated
		 */
		EEnum TIME_FORMAT_KIND = eINSTANCE.getTimeFormatKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.OntologyKind <em>Ontology Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.OntologyKind
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getOntologyKind()
		 * @generated
		 */
		EEnum ONTOLOGY_KIND = eINSTANCE.getOntologyKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.HttpMethodKind <em>Http Method Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.HttpMethodKind
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getHttpMethodKind()
		 * @generated
		 */
		EEnum HTTP_METHOD_KIND = eINSTANCE.getHttpMethodKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SemanticsKind <em>Semantics Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SemanticsKind
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSemanticsKind()
		 * @generated
		 */
		EEnum SEMANTICS_KIND = eINSTANCE.getSemanticsKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InstanceNamingStandardKind <em>Instance Naming Standard Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InstanceNamingStandardKind
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getInstanceNamingStandardKind()
		 * @generated
		 */
		EEnum INSTANCE_NAMING_STANDARD_KIND = eINSTANCE.getInstanceNamingStandardKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.StatusCodeKind <em>Status Code Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.StatusCodeKind
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getStatusCodeKind()
		 * @generated
		 */
		EEnum STATUS_CODE_KIND = eINSTANCE.getStatusCodeKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CoAPMetodKind <em>Co AP Metod Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CoAPMetodKind
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getCoAPMetodKind()
		 * @generated
		 */
		EEnum CO_AP_METOD_KIND = eINSTANCE.getCoAPMetodKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SchemaType <em>Schema Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SchemaType
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getSchemaType()
		 * @generated
		 */
		EEnum SCHEMA_TYPE = eINSTANCE.getSchemaType();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.PhysicalLayerKind <em>Physical Layer Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.PhysicalLayerKind
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getPhysicalLayerKind()
		 * @generated
		 */
		EEnum PHYSICAL_LAYER_KIND = eINSTANCE.getPhysicalLayerKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.MacKind <em>Mac Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.MacKind
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getMacKind()
		 * @generated
		 */
		EEnum MAC_KIND = eINSTANCE.getMacKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.EngineeringProcedureKind <em>Engineering Procedure Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.EngineeringProcedureKind
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getEngineeringProcedureKind()
		 * @generated
		 */
		EEnum ENGINEERING_PROCEDURE_KIND = eINSTANCE.getEngineeringProcedureKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.OSKind <em>OS Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.OSKind
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getOSKind()
		 * @generated
		 */
		EEnum OS_KIND = eINSTANCE.getOSKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LinuxKind <em>Linux Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LinuxKind
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getLinuxKind()
		 * @generated
		 */
		EEnum LINUX_KIND = eINSTANCE.getLinuxKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeploymentLocationKind <em>Deployment Location Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeploymentLocationKind
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDeploymentLocationKind()
		 * @generated
		 */
		EEnum DEPLOYMENT_LOCATION_KIND = eINSTANCE.getDeploymentLocationKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeploymentTimeKind <em>Deployment Time Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeploymentTimeKind
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDeploymentTimeKind()
		 * @generated
		 */
		EEnum DEPLOYMENT_TIME_KIND = eINSTANCE.getDeploymentTimeKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceKind <em>Device Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceKind
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getDeviceKind()
		 * @generated
		 */
		EEnum DEVICE_KIND = eINSTANCE.getDeviceKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ProcessortKind <em>Processort Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ProcessortKind
		 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.ArrowheadSysMLProfilePackageImpl#getProcessortKind()
		 * @generated
		 */
		EEnum PROCESSORT_KIND = eINSTANCE.getProcessortKind();

	}

} //ArrowheadSysMLProfilePackage
