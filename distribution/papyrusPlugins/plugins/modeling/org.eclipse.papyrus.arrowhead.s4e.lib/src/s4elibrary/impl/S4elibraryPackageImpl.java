/*******************************************************************************
 * Copyright (c) 2021 CEA LIST.
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 *
 *  SPDX-License-Identifier: EPL-2.0
 *  
 *  Contributors:
 *    Saadia Dhouib (CEA LIST) saadia.dhouib@cea.fr
 *    Fadwa Tmar (CEA LIST) fadwa.tmar@cea.fr 
 *******************************************************************************/
/**
 */
package s4elibrary.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import s4elibrary.Angularservomotorservo;
import s4elibrary.Continuousrotationservomotorservo;
import s4elibrary.Highvoltagecontrolrelay;
import s4elibrary.S4elibraryFactory;
import s4elibrary.S4elibraryPackage;
import s4elibrary.accelerometersensorXNUCLEOIKS01A3;
import s4elibrary.angular_gyroscopesensorXNUCLEOIKS01A3;
import s4elibrary.humiditysensorXNUCLEOIKS01A3;
import s4elibrary.magnetometersensorXNUCLEOIKS01A3;
import s4elibrary.temperaturesensorXNUCLEOIKS01A3;
import s4elibrary.temperaturesensords18b20;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class S4elibraryPackageImpl extends EPackageImpl implements S4elibraryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass highvoltagecontrolrelayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuousrotationservomotorservoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angularservomotorservoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass humiditysensorXNUCLEOIKS01A3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temperaturesensorXNUCLEOIKS01A3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass magnetometersensorXNUCLEOIKS01A3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accelerometersensorXNUCLEOIKS01A3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angular_gyroscopesensorXNUCLEOIKS01A3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temperaturesensords18b20EClass = null;

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
	 * @see s4elibrary.S4elibraryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private S4elibraryPackageImpl() {
		super(eNS_URI, S4elibraryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link S4elibraryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static S4elibraryPackage init() {
		if (isInited) return (S4elibraryPackage)EPackage.Registry.INSTANCE.getEPackage(S4elibraryPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredS4elibraryPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		S4elibraryPackageImpl theS4elibraryPackage = registeredS4elibraryPackage instanceof S4elibraryPackageImpl ? (S4elibraryPackageImpl)registeredS4elibraryPackage : new S4elibraryPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theS4elibraryPackage.createPackageContents();

		// Initialize created meta-data
		theS4elibraryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theS4elibraryPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(S4elibraryPackage.eNS_URI, theS4elibraryPackage);
		return theS4elibraryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHighvoltagecontrolrelay() {
		return highvoltagecontrolrelayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinuousrotationservomotorservo() {
		return continuousrotationservomotorservoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAngularservomotorservo() {
		return angularservomotorservoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gethumiditysensorXNUCLEOIKS01A3() {
		return humiditysensorXNUCLEOIKS01A3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettemperaturesensorXNUCLEOIKS01A3() {
		return temperaturesensorXNUCLEOIKS01A3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmagnetometersensorXNUCLEOIKS01A3() {
		return magnetometersensorXNUCLEOIKS01A3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getaccelerometersensorXNUCLEOIKS01A3() {
		return accelerometersensorXNUCLEOIKS01A3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getangular_gyroscopesensorXNUCLEOIKS01A3() {
		return angular_gyroscopesensorXNUCLEOIKS01A3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettemperaturesensords18b20() {
		return temperaturesensords18b20EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public S4elibraryFactory getS4elibraryFactory() {
		return (S4elibraryFactory)getEFactoryInstance();
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
		highvoltagecontrolrelayEClass = createEClass(HIGHVOLTAGECONTROLRELAY);

		continuousrotationservomotorservoEClass = createEClass(CONTINUOUSROTATIONSERVOMOTORSERVO);

		angularservomotorservoEClass = createEClass(ANGULARSERVOMOTORSERVO);

		humiditysensorXNUCLEOIKS01A3EClass = createEClass(HUMIDITYSENSOR_XNUCLEOIKS01A3);

		temperaturesensorXNUCLEOIKS01A3EClass = createEClass(TEMPERATURESENSOR_XNUCLEOIKS01A3);

		magnetometersensorXNUCLEOIKS01A3EClass = createEClass(MAGNETOMETERSENSOR_XNUCLEOIKS01A3);

		accelerometersensorXNUCLEOIKS01A3EClass = createEClass(ACCELEROMETERSENSOR_XNUCLEOIKS01A3);

		angular_gyroscopesensorXNUCLEOIKS01A3EClass = createEClass(ANGULAR_GYROSCOPESENSOR_XNUCLEOIKS01A3);

		temperaturesensords18b20EClass = createEClass(TEMPERATURESENSORDS18B20);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(highvoltagecontrolrelayEClass, Highvoltagecontrolrelay.class, "Highvoltagecontrolrelay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(continuousrotationservomotorservoEClass, Continuousrotationservomotorservo.class, "Continuousrotationservomotorservo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(angularservomotorservoEClass, Angularservomotorservo.class, "Angularservomotorservo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(humiditysensorXNUCLEOIKS01A3EClass, humiditysensorXNUCLEOIKS01A3.class, "humiditysensorXNUCLEOIKS01A3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(temperaturesensorXNUCLEOIKS01A3EClass, temperaturesensorXNUCLEOIKS01A3.class, "temperaturesensorXNUCLEOIKS01A3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(magnetometersensorXNUCLEOIKS01A3EClass, magnetometersensorXNUCLEOIKS01A3.class, "magnetometersensorXNUCLEOIKS01A3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accelerometersensorXNUCLEOIKS01A3EClass, accelerometersensorXNUCLEOIKS01A3.class, "accelerometersensorXNUCLEOIKS01A3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(angular_gyroscopesensorXNUCLEOIKS01A3EClass, angular_gyroscopesensorXNUCLEOIKS01A3.class, "angular_gyroscopesensorXNUCLEOIKS01A3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(temperaturesensords18b20EClass, temperaturesensords18b20.class, "temperaturesensords18b20", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		  (highvoltagecontrolrelayEClass,
		   source,
		   new String[] {
			   "originalName", "High voltage control.relay"
		   });
		addAnnotation
		  (continuousrotationservomotorservoEClass,
		   source,
		   new String[] {
			   "originalName", "Continuous rotation servomotor.servo"
		   });
		addAnnotation
		  (angularservomotorservoEClass,
		   source,
		   new String[] {
			   "originalName", "Angular servomotor.servo"
		   });
		addAnnotation
		  (humiditysensorXNUCLEOIKS01A3EClass,
		   source,
		   new String[] {
			   "originalName", "humidity sensor.X-NUCLEO-IKS01A3"
		   });
		addAnnotation
		  (temperaturesensorXNUCLEOIKS01A3EClass,
		   source,
		   new String[] {
			   "originalName", "temperature sensor.X-NUCLEO-IKS01A3"
		   });
		addAnnotation
		  (magnetometersensorXNUCLEOIKS01A3EClass,
		   source,
		   new String[] {
			   "originalName", "magnetometer sensor.X-NUCLEO-IKS01A3"
		   });
		addAnnotation
		  (accelerometersensorXNUCLEOIKS01A3EClass,
		   source,
		   new String[] {
			   "originalName", "accelerometer sensor.X-NUCLEO-IKS01A3"
		   });
		addAnnotation
		  (angular_gyroscopesensorXNUCLEOIKS01A3EClass,
		   source,
		   new String[] {
			   "originalName", "angular_gyroscope sensor.X-NUCLEO-IKS01A3"
		   });
		addAnnotation
		  (temperaturesensords18b20EClass,
		   source,
		   new String[] {
			   "originalName", "temperature sensor.ds18b20"
		   });
	}

} //S4elibraryPackageImpl
