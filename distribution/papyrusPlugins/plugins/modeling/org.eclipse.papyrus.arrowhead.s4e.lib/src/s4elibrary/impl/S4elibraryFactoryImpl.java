/**
 */
package s4elibrary.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import s4elibrary.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class S4elibraryFactoryImpl extends EFactoryImpl implements S4elibraryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static S4elibraryFactory init() {
		try {
			S4elibraryFactory theS4elibraryFactory = (S4elibraryFactory)EPackage.Registry.INSTANCE.getEFactory(S4elibraryPackage.eNS_URI);
			if (theS4elibraryFactory != null) {
				return theS4elibraryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new S4elibraryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public S4elibraryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case S4elibraryPackage.TEMPERATUREDS18B20: return createtemperatureds18b20();
			case S4elibraryPackage.TEMPERATUREDHT11: return createtemperaturedht11();
			case S4elibraryPackage.HUMIDITYDHT11: return createhumiditydht11();
			case S4elibraryPackage.TEMPERATUREDHT21: return createtemperaturedht21();
			case S4elibraryPackage.HUMIDITYDHT21: return createhumiditydht21();
			case S4elibraryPackage.TEMPERATUREDHT22: return createtemperaturedht22();
			case S4elibraryPackage.HUMIDITYDHT22: return createhumiditydht22();
			case S4elibraryPackage.TEMPERATUREDHT: return createtemperaturedht();
			case S4elibraryPackage.HUMIDITYDHT: return createhumiditydht();
			case S4elibraryPackage.STATICRELAY: return createstaticrelay();
			case S4elibraryPackage.MOSFETRELAY: return createmosfetrelay();
			case S4elibraryPackage.ANGULARSERVO: return createangularservo();
			case S4elibraryPackage.CONTINUOUSSERVO: return createcontinuousservo();
			case S4elibraryPackage.TEMPERATUREX_NUCLEO_IKS01A3: return createtemperaturex_nucleo_iks01a3();
			case S4elibraryPackage.HUMIDITYX_NUCLEO_IKS01A3: return createhumidityx_nucleo_iks01a3();
			case S4elibraryPackage.PRESSUREX_NUCLEO_IKS01A3: return createpressurex_nucleo_iks01a3();
			case S4elibraryPackage.ACCELEROMETERX_NUCLEO_IKS01A3: return createaccelerometerx_nucleo_iks01a3();
			case S4elibraryPackage.GYROX_NUCLEO_IKS01A3: return creategyrox_nucleo_iks01a3();
			case S4elibraryPackage.MAGNETX_NUCLEO_IKS01A3: return createmagnetx_nucleo_iks01a3();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public temperatureds18b20 createtemperatureds18b20() {
		temperatureds18b20Impl temperatureds18b20 = new temperatureds18b20Impl();
		return temperatureds18b20;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public temperaturedht11 createtemperaturedht11() {
		temperaturedht11Impl temperaturedht11 = new temperaturedht11Impl();
		return temperaturedht11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public humiditydht11 createhumiditydht11() {
		humiditydht11Impl humiditydht11 = new humiditydht11Impl();
		return humiditydht11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public temperaturedht21 createtemperaturedht21() {
		temperaturedht21Impl temperaturedht21 = new temperaturedht21Impl();
		return temperaturedht21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public humiditydht21 createhumiditydht21() {
		humiditydht21Impl humiditydht21 = new humiditydht21Impl();
		return humiditydht21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public temperaturedht22 createtemperaturedht22() {
		temperaturedht22Impl temperaturedht22 = new temperaturedht22Impl();
		return temperaturedht22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public humiditydht22 createhumiditydht22() {
		humiditydht22Impl humiditydht22 = new humiditydht22Impl();
		return humiditydht22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public temperaturedht createtemperaturedht() {
		temperaturedhtImpl temperaturedht = new temperaturedhtImpl();
		return temperaturedht;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public humiditydht createhumiditydht() {
		humiditydhtImpl humiditydht = new humiditydhtImpl();
		return humiditydht;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public staticrelay createstaticrelay() {
		staticrelayImpl staticrelay = new staticrelayImpl();
		return staticrelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mosfetrelay createmosfetrelay() {
		mosfetrelayImpl mosfetrelay = new mosfetrelayImpl();
		return mosfetrelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public angularservo createangularservo() {
		angularservoImpl angularservo = new angularservoImpl();
		return angularservo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public continuousservo createcontinuousservo() {
		continuousservoImpl continuousservo = new continuousservoImpl();
		return continuousservo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public temperaturex_nucleo_iks01a3 createtemperaturex_nucleo_iks01a3() {
		temperaturex_nucleo_iks01a3Impl temperaturex_nucleo_iks01a3 = new temperaturex_nucleo_iks01a3Impl();
		return temperaturex_nucleo_iks01a3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public humidityx_nucleo_iks01a3 createhumidityx_nucleo_iks01a3() {
		humidityx_nucleo_iks01a3Impl humidityx_nucleo_iks01a3 = new humidityx_nucleo_iks01a3Impl();
		return humidityx_nucleo_iks01a3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public pressurex_nucleo_iks01a3 createpressurex_nucleo_iks01a3() {
		pressurex_nucleo_iks01a3Impl pressurex_nucleo_iks01a3 = new pressurex_nucleo_iks01a3Impl();
		return pressurex_nucleo_iks01a3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public accelerometerx_nucleo_iks01a3 createaccelerometerx_nucleo_iks01a3() {
		accelerometerx_nucleo_iks01a3Impl accelerometerx_nucleo_iks01a3 = new accelerometerx_nucleo_iks01a3Impl();
		return accelerometerx_nucleo_iks01a3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gyrox_nucleo_iks01a3 creategyrox_nucleo_iks01a3() {
		gyrox_nucleo_iks01a3Impl gyrox_nucleo_iks01a3 = new gyrox_nucleo_iks01a3Impl();
		return gyrox_nucleo_iks01a3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public magnetx_nucleo_iks01a3 createmagnetx_nucleo_iks01a3() {
		magnetx_nucleo_iks01a3Impl magnetx_nucleo_iks01a3 = new magnetx_nucleo_iks01a3Impl();
		return magnetx_nucleo_iks01a3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public S4elibraryPackage getS4elibraryPackage() {
		return (S4elibraryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static S4elibraryPackage getPackage() {
		return S4elibraryPackage.eINSTANCE;
	}

} //S4elibraryFactoryImpl
