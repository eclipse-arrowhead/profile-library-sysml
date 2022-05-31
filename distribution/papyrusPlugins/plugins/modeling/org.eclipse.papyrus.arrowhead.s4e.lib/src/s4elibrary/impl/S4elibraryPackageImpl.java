/**
 */
package s4elibrary.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import s4elibrary.S4elibraryFactory;
import s4elibrary.S4elibraryPackage;
import s4elibrary.accelerometerx_nucleo_iks01a3;
import s4elibrary.angularservo;
import s4elibrary.continuousservo;
import s4elibrary.gyrox_nucleo_iks01a3;
import s4elibrary.humiditydht;
import s4elibrary.humiditydht11;
import s4elibrary.humiditydht21;
import s4elibrary.humiditydht22;
import s4elibrary.humidityx_nucleo_iks01a3;
import s4elibrary.magnetx_nucleo_iks01a3;
import s4elibrary.mosfetrelay;
import s4elibrary.pressurex_nucleo_iks01a3;
import s4elibrary.staticrelay;
import s4elibrary.temperaturedht;
import s4elibrary.temperaturedht11;
import s4elibrary.temperaturedht21;
import s4elibrary.temperaturedht22;
import s4elibrary.temperatureds18b20;
import s4elibrary.temperaturex_nucleo_iks01a3;

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
	private EClass temperatureds18b20EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temperaturedht11EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass humiditydht11EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temperaturedht21EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass humiditydht21EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temperaturedht22EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass humiditydht22EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temperaturedhtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass humiditydhtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticrelayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mosfetrelayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angularservoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuousservoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temperaturex_nucleo_iks01a3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass humidityx_nucleo_iks01a3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pressurex_nucleo_iks01a3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accelerometerx_nucleo_iks01a3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gyrox_nucleo_iks01a3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass magnetx_nucleo_iks01a3EClass = null;

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
	public EClass gettemperatureds18b20() {
		return temperatureds18b20EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettemperaturedht11() {
		return temperaturedht11EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gethumiditydht11() {
		return humiditydht11EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettemperaturedht21() {
		return temperaturedht21EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gethumiditydht21() {
		return humiditydht21EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettemperaturedht22() {
		return temperaturedht22EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gethumiditydht22() {
		return humiditydht22EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettemperaturedht() {
		return temperaturedhtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gethumiditydht() {
		return humiditydhtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getstaticrelay() {
		return staticrelayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmosfetrelay() {
		return mosfetrelayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getangularservo() {
		return angularservoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcontinuousservo() {
		return continuousservoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettemperaturex_nucleo_iks01a3() {
		return temperaturex_nucleo_iks01a3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gethumidityx_nucleo_iks01a3() {
		return humidityx_nucleo_iks01a3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getpressurex_nucleo_iks01a3() {
		return pressurex_nucleo_iks01a3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getaccelerometerx_nucleo_iks01a3() {
		return accelerometerx_nucleo_iks01a3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getgyrox_nucleo_iks01a3() {
		return gyrox_nucleo_iks01a3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmagnetx_nucleo_iks01a3() {
		return magnetx_nucleo_iks01a3EClass;
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
		temperatureds18b20EClass = createEClass(TEMPERATUREDS18B20);

		temperaturedht11EClass = createEClass(TEMPERATUREDHT11);

		humiditydht11EClass = createEClass(HUMIDITYDHT11);

		temperaturedht21EClass = createEClass(TEMPERATUREDHT21);

		humiditydht21EClass = createEClass(HUMIDITYDHT21);

		temperaturedht22EClass = createEClass(TEMPERATUREDHT22);

		humiditydht22EClass = createEClass(HUMIDITYDHT22);

		temperaturedhtEClass = createEClass(TEMPERATUREDHT);

		humiditydhtEClass = createEClass(HUMIDITYDHT);

		staticrelayEClass = createEClass(STATICRELAY);

		mosfetrelayEClass = createEClass(MOSFETRELAY);

		angularservoEClass = createEClass(ANGULARSERVO);

		continuousservoEClass = createEClass(CONTINUOUSSERVO);

		temperaturex_nucleo_iks01a3EClass = createEClass(TEMPERATUREX_NUCLEO_IKS01A3);

		humidityx_nucleo_iks01a3EClass = createEClass(HUMIDITYX_NUCLEO_IKS01A3);

		pressurex_nucleo_iks01a3EClass = createEClass(PRESSUREX_NUCLEO_IKS01A3);

		accelerometerx_nucleo_iks01a3EClass = createEClass(ACCELEROMETERX_NUCLEO_IKS01A3);

		gyrox_nucleo_iks01a3EClass = createEClass(GYROX_NUCLEO_IKS01A3);

		magnetx_nucleo_iks01a3EClass = createEClass(MAGNETX_NUCLEO_IKS01A3);
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
		initEClass(temperatureds18b20EClass, temperatureds18b20.class, "temperatureds18b20", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(temperaturedht11EClass, temperaturedht11.class, "temperaturedht11", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(humiditydht11EClass, humiditydht11.class, "humiditydht11", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(temperaturedht21EClass, temperaturedht21.class, "temperaturedht21", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(humiditydht21EClass, humiditydht21.class, "humiditydht21", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(temperaturedht22EClass, temperaturedht22.class, "temperaturedht22", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(humiditydht22EClass, humiditydht22.class, "humiditydht22", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(temperaturedhtEClass, temperaturedht.class, "temperaturedht", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(humiditydhtEClass, humiditydht.class, "humiditydht", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(staticrelayEClass, staticrelay.class, "staticrelay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mosfetrelayEClass, mosfetrelay.class, "mosfetrelay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(angularservoEClass, angularservo.class, "angularservo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(continuousservoEClass, continuousservo.class, "continuousservo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(temperaturex_nucleo_iks01a3EClass, temperaturex_nucleo_iks01a3.class, "temperaturex_nucleo_iks01a3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(humidityx_nucleo_iks01a3EClass, humidityx_nucleo_iks01a3.class, "humidityx_nucleo_iks01a3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pressurex_nucleo_iks01a3EClass, pressurex_nucleo_iks01a3.class, "pressurex_nucleo_iks01a3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accelerometerx_nucleo_iks01a3EClass, accelerometerx_nucleo_iks01a3.class, "accelerometerx_nucleo_iks01a3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gyrox_nucleo_iks01a3EClass, gyrox_nucleo_iks01a3.class, "gyrox_nucleo_iks01a3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(magnetx_nucleo_iks01a3EClass, magnetx_nucleo_iks01a3.class, "magnetx_nucleo_iks01a3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		  (temperatureds18b20EClass,
		   source,
		   new String[] {
			   "originalName", "temperature.ds18b20"
		   });
		addAnnotation
		  (temperaturedht11EClass,
		   source,
		   new String[] {
			   "originalName", "temperature.dht11"
		   });
		addAnnotation
		  (humiditydht11EClass,
		   source,
		   new String[] {
			   "originalName", "humidity.dht11"
		   });
		addAnnotation
		  (temperaturedht21EClass,
		   source,
		   new String[] {
			   "originalName", "temperature.dht21"
		   });
		addAnnotation
		  (humiditydht21EClass,
		   source,
		   new String[] {
			   "originalName", "humidity.dht21"
		   });
		addAnnotation
		  (temperaturedht22EClass,
		   source,
		   new String[] {
			   "originalName", "temperature.dht22"
		   });
		addAnnotation
		  (humiditydht22EClass,
		   source,
		   new String[] {
			   "originalName", "humidity.dht22"
		   });
		addAnnotation
		  (temperaturedhtEClass,
		   source,
		   new String[] {
			   "originalName", "temperature.dht"
		   });
		addAnnotation
		  (humiditydhtEClass,
		   source,
		   new String[] {
			   "originalName", "humidity.dht"
		   });
		addAnnotation
		  (staticrelayEClass,
		   source,
		   new String[] {
			   "originalName", "static.relay"
		   });
		addAnnotation
		  (mosfetrelayEClass,
		   source,
		   new String[] {
			   "originalName", "mosfet.relay"
		   });
		addAnnotation
		  (angularservoEClass,
		   source,
		   new String[] {
			   "originalName", "angular.servo"
		   });
		addAnnotation
		  (continuousservoEClass,
		   source,
		   new String[] {
			   "originalName", "continuous.servo"
		   });
		addAnnotation
		  (temperaturex_nucleo_iks01a3EClass,
		   source,
		   new String[] {
			   "originalName", "temperature.x_nucleo_iks01a3"
		   });
		addAnnotation
		  (humidityx_nucleo_iks01a3EClass,
		   source,
		   new String[] {
			   "originalName", "humidity.x_nucleo_iks01a3"
		   });
		addAnnotation
		  (pressurex_nucleo_iks01a3EClass,
		   source,
		   new String[] {
			   "originalName", "pressure.x_nucleo_iks01a3"
		   });
		addAnnotation
		  (accelerometerx_nucleo_iks01a3EClass,
		   source,
		   new String[] {
			   "originalName", "accelerometer.x_nucleo_iks01a3"
		   });
		addAnnotation
		  (gyrox_nucleo_iks01a3EClass,
		   source,
		   new String[] {
			   "originalName", "gyro.x_nucleo_iks01a3"
		   });
		addAnnotation
		  (magnetx_nucleo_iks01a3EClass,
		   source,
		   new String[] {
			   "originalName", "magnet.x_nucleo_iks01a3"
		   });
	}

} //S4elibraryPackageImpl
