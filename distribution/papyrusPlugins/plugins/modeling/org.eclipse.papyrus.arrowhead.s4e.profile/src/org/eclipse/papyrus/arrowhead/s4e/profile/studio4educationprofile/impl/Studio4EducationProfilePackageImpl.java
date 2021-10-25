/**
 */
package org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.Device;
import org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.DeviceKind;
import org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.Studio4EducationProfileFactory;
import org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.Studio4EducationProfilePackage;

import org.eclipse.papyrus.sysml16.blocks.BlocksPackage;

import org.eclipse.papyrus.sysml16.sysml.SysMLPackage;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.profile.standard.StandardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Studio4EducationProfilePackageImpl extends EPackageImpl implements Studio4EducationProfilePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deviceKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.papyrus.arrowhead.s4e.profile.studio4educationprofile.Studio4EducationProfilePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Studio4EducationProfilePackageImpl() {
		super(eNS_URI, Studio4EducationProfileFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Studio4EducationProfilePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Studio4EducationProfilePackage init() {
		if (isInited) return (Studio4EducationProfilePackage)EPackage.Registry.INSTANCE.getEPackage(Studio4EducationProfilePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStudio4EducationProfilePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Studio4EducationProfilePackageImpl theStudio4EducationProfilePackage = registeredStudio4EducationProfilePackage instanceof Studio4EducationProfilePackageImpl ? (Studio4EducationProfilePackageImpl)registeredStudio4EducationProfilePackage : new Studio4EducationProfilePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		StandardPackage.eINSTANCE.eClass();
		SysMLPackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theStudio4EducationProfilePackage.createPackageContents();

		// Initialize created meta-data
		theStudio4EducationProfilePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStudio4EducationProfilePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Studio4EducationProfilePackage.eNS_URI, theStudio4EducationProfilePackage);
		return theStudio4EducationProfilePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_Label() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_Kind() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_Level() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeviceKind() {
		return deviceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Studio4EducationProfileFactory getStudio4EducationProfileFactory() {
		return (Studio4EducationProfileFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		deviceEClass = createEClass(DEVICE);
		createEAttribute(deviceEClass, DEVICE__LABEL);
		createEAttribute(deviceEClass, DEVICE__KIND);
		createEAttribute(deviceEClass, DEVICE__LEVEL);

		// Create enums
		deviceKindEEnum = createEEnum(DEVICE_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BlocksPackage theBlocksPackage = (BlocksPackage)EPackage.Registry.INSTANCE.getEPackage(BlocksPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		deviceEClass.getESuperTypes().add(theBlocksPackage.getBlock());

		// Initialize classes, features, and operations; add parameters
		initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDevice_Label(), theTypesPackage.getString(), "label", null, 1, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDevice_Kind(), this.getDeviceKind(), "kind", null, 1, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDevice_Level(), theTypesPackage.getString(), "level", null, 1, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(deviceKindEEnum, DeviceKind.class, "DeviceKind");
		addEEnumLiteral(deviceKindEEnum, DeviceKind.SENSOR);
		addEEnumLiteral(deviceKindEEnum, DeviceKind.ACTUATOR);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "originalName", "studio4education"
		   });
	}

} //Studio4EducationProfilePackageImpl
