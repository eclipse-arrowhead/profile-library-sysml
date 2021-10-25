/**
 */
package org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.papyrus.sysml16.blocks.BlocksPackage;

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
 * @see org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.Studio4EducationProfileFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='studio4education'"
 * @generated
 */
public interface Studio4EducationProfilePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "studio4educationprofile";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://Papyrus/Studio4EducationProfile";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Studio4EducationProfile";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Studio4EducationProfilePackage eINSTANCE = org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.impl.Studio4EducationProfilePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.impl.DeviceImpl
	 * @see org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.impl.Studio4EducationProfilePackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 0;

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
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__LABEL = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__KIND = BlocksPackage.BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__LEVEL = BlocksPackage.BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 3;

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
	 * The meta object id for the '{@link org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.DeviceKind <em>Device Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.DeviceKind
	 * @see org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.impl.Studio4EducationProfilePackageImpl#getDeviceKind()
	 * @generated
	 */
	int DEVICE_KIND = 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.Device#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.Device#getLabel()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.Device#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.Device#getKind()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.Device#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.Device#getLevel()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Level();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.DeviceKind <em>Device Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Device Kind</em>'.
	 * @see org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.DeviceKind
	 * @generated
	 */
	EEnum getDeviceKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Studio4EducationProfileFactory getStudio4EducationProfileFactory();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.impl.DeviceImpl
		 * @see org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.impl.Studio4EducationProfilePackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__LABEL = eINSTANCE.getDevice_Label();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__KIND = eINSTANCE.getDevice_Kind();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__LEVEL = eINSTANCE.getDevice_Level();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.DeviceKind <em>Device Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.DeviceKind
		 * @see org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.impl.Studio4EducationProfilePackageImpl#getDeviceKind()
		 * @generated
		 */
		EEnum DEVICE_KIND = eINSTANCE.getDeviceKind();

	}

} //Studio4EducationProfilePackage
