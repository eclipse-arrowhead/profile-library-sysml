/**
 */
package s4elibrary.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import s4elibrary.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see s4elibrary.S4elibraryPackage
 * @generated
 */
public class S4elibrarySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static S4elibraryPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public S4elibrarySwitch() {
		if (modelPackage == null) {
			modelPackage = S4elibraryPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case S4elibraryPackage.TEMPERATUREDS18B20: {
				temperatureds18b20 temperatureds18b20 = (temperatureds18b20)theEObject;
				T result = casetemperatureds18b20(temperatureds18b20);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case S4elibraryPackage.TEMPERATUREDHT11: {
				temperaturedht11 temperaturedht11 = (temperaturedht11)theEObject;
				T result = casetemperaturedht11(temperaturedht11);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case S4elibraryPackage.HUMIDITYDHT11: {
				humiditydht11 humiditydht11 = (humiditydht11)theEObject;
				T result = casehumiditydht11(humiditydht11);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case S4elibraryPackage.TEMPERATUREDHT21: {
				temperaturedht21 temperaturedht21 = (temperaturedht21)theEObject;
				T result = casetemperaturedht21(temperaturedht21);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case S4elibraryPackage.HUMIDITYDHT21: {
				humiditydht21 humiditydht21 = (humiditydht21)theEObject;
				T result = casehumiditydht21(humiditydht21);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case S4elibraryPackage.TEMPERATUREDHT22: {
				temperaturedht22 temperaturedht22 = (temperaturedht22)theEObject;
				T result = casetemperaturedht22(temperaturedht22);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case S4elibraryPackage.HUMIDITYDHT22: {
				humiditydht22 humiditydht22 = (humiditydht22)theEObject;
				T result = casehumiditydht22(humiditydht22);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case S4elibraryPackage.TEMPERATUREDHT: {
				temperaturedht temperaturedht = (temperaturedht)theEObject;
				T result = casetemperaturedht(temperaturedht);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case S4elibraryPackage.HUMIDITYDHT: {
				humiditydht humiditydht = (humiditydht)theEObject;
				T result = casehumiditydht(humiditydht);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case S4elibraryPackage.STATICRELAY: {
				staticrelay staticrelay = (staticrelay)theEObject;
				T result = casestaticrelay(staticrelay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case S4elibraryPackage.MOSFETRELAY: {
				mosfetrelay mosfetrelay = (mosfetrelay)theEObject;
				T result = casemosfetrelay(mosfetrelay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case S4elibraryPackage.ANGULARSERVO: {
				angularservo angularservo = (angularservo)theEObject;
				T result = caseangularservo(angularservo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case S4elibraryPackage.CONTINUOUSSERVO: {
				continuousservo continuousservo = (continuousservo)theEObject;
				T result = casecontinuousservo(continuousservo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case S4elibraryPackage.TEMPERATUREX_NUCLEO_IKS01A3: {
				temperaturex_nucleo_iks01a3 temperaturex_nucleo_iks01a3 = (temperaturex_nucleo_iks01a3)theEObject;
				T result = casetemperaturex_nucleo_iks01a3(temperaturex_nucleo_iks01a3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case S4elibraryPackage.HUMIDITYX_NUCLEO_IKS01A3: {
				humidityx_nucleo_iks01a3 humidityx_nucleo_iks01a3 = (humidityx_nucleo_iks01a3)theEObject;
				T result = casehumidityx_nucleo_iks01a3(humidityx_nucleo_iks01a3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case S4elibraryPackage.PRESSUREX_NUCLEO_IKS01A3: {
				pressurex_nucleo_iks01a3 pressurex_nucleo_iks01a3 = (pressurex_nucleo_iks01a3)theEObject;
				T result = casepressurex_nucleo_iks01a3(pressurex_nucleo_iks01a3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case S4elibraryPackage.ACCELEROMETERX_NUCLEO_IKS01A3: {
				accelerometerx_nucleo_iks01a3 accelerometerx_nucleo_iks01a3 = (accelerometerx_nucleo_iks01a3)theEObject;
				T result = caseaccelerometerx_nucleo_iks01a3(accelerometerx_nucleo_iks01a3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case S4elibraryPackage.GYROX_NUCLEO_IKS01A3: {
				gyrox_nucleo_iks01a3 gyrox_nucleo_iks01a3 = (gyrox_nucleo_iks01a3)theEObject;
				T result = casegyrox_nucleo_iks01a3(gyrox_nucleo_iks01a3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case S4elibraryPackage.MAGNETX_NUCLEO_IKS01A3: {
				magnetx_nucleo_iks01a3 magnetx_nucleo_iks01a3 = (magnetx_nucleo_iks01a3)theEObject;
				T result = casemagnetx_nucleo_iks01a3(magnetx_nucleo_iks01a3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>temperatureds18b20</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>temperatureds18b20</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetemperatureds18b20(temperatureds18b20 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>temperaturedht11</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>temperaturedht11</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetemperaturedht11(temperaturedht11 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>humiditydht11</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>humiditydht11</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casehumiditydht11(humiditydht11 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>temperaturedht21</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>temperaturedht21</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetemperaturedht21(temperaturedht21 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>humiditydht21</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>humiditydht21</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casehumiditydht21(humiditydht21 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>temperaturedht22</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>temperaturedht22</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetemperaturedht22(temperaturedht22 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>humiditydht22</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>humiditydht22</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casehumiditydht22(humiditydht22 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>temperaturedht</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>temperaturedht</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetemperaturedht(temperaturedht object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>humiditydht</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>humiditydht</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casehumiditydht(humiditydht object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>staticrelay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>staticrelay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casestaticrelay(staticrelay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>mosfetrelay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>mosfetrelay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemosfetrelay(mosfetrelay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>angularservo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>angularservo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseangularservo(angularservo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>continuousservo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>continuousservo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecontinuousservo(continuousservo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>temperaturex nucleo iks01a3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>temperaturex nucleo iks01a3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetemperaturex_nucleo_iks01a3(temperaturex_nucleo_iks01a3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>humidityx nucleo iks01a3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>humidityx nucleo iks01a3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casehumidityx_nucleo_iks01a3(humidityx_nucleo_iks01a3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>pressurex nucleo iks01a3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>pressurex nucleo iks01a3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casepressurex_nucleo_iks01a3(pressurex_nucleo_iks01a3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>accelerometerx nucleo iks01a3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>accelerometerx nucleo iks01a3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseaccelerometerx_nucleo_iks01a3(accelerometerx_nucleo_iks01a3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>gyrox nucleo iks01a3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>gyrox nucleo iks01a3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casegyrox_nucleo_iks01a3(gyrox_nucleo_iks01a3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>magnetx nucleo iks01a3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>magnetx nucleo iks01a3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemagnetx_nucleo_iks01a3(magnetx_nucleo_iks01a3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //S4elibrarySwitch
