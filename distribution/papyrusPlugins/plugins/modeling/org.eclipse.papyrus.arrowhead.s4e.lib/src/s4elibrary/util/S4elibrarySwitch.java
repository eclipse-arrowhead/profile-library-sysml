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
			case S4elibraryPackage.HIGHVOLTAGECONTROLRELAY: {
				Highvoltagecontrolrelay highvoltagecontrolrelay = (Highvoltagecontrolrelay)theEObject;
				T result = caseHighvoltagecontrolrelay(highvoltagecontrolrelay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case S4elibraryPackage.CONTINUOUSROTATIONSERVOMOTORSERVO: {
				Continuousrotationservomotorservo continuousrotationservomotorservo = (Continuousrotationservomotorservo)theEObject;
				T result = caseContinuousrotationservomotorservo(continuousrotationservomotorservo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case S4elibraryPackage.ANGULARSERVOMOTORSERVO: {
				Angularservomotorservo angularservomotorservo = (Angularservomotorservo)theEObject;
				T result = caseAngularservomotorservo(angularservomotorservo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case S4elibraryPackage.HUMIDITYSENSOR_XNUCLEOIKS01A3: {
				humiditysensorXNUCLEOIKS01A3 humiditysensorXNUCLEOIKS01A3 = (humiditysensorXNUCLEOIKS01A3)theEObject;
				T result = casehumiditysensorXNUCLEOIKS01A3(humiditysensorXNUCLEOIKS01A3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case S4elibraryPackage.TEMPERATURESENSOR_XNUCLEOIKS01A3: {
				temperaturesensorXNUCLEOIKS01A3 temperaturesensorXNUCLEOIKS01A3 = (temperaturesensorXNUCLEOIKS01A3)theEObject;
				T result = casetemperaturesensorXNUCLEOIKS01A3(temperaturesensorXNUCLEOIKS01A3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case S4elibraryPackage.MAGNETOMETERSENSOR_XNUCLEOIKS01A3: {
				magnetometersensorXNUCLEOIKS01A3 magnetometersensorXNUCLEOIKS01A3 = (magnetometersensorXNUCLEOIKS01A3)theEObject;
				T result = casemagnetometersensorXNUCLEOIKS01A3(magnetometersensorXNUCLEOIKS01A3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case S4elibraryPackage.ACCELEROMETERSENSOR_XNUCLEOIKS01A3: {
				accelerometersensorXNUCLEOIKS01A3 accelerometersensorXNUCLEOIKS01A3 = (accelerometersensorXNUCLEOIKS01A3)theEObject;
				T result = caseaccelerometersensorXNUCLEOIKS01A3(accelerometersensorXNUCLEOIKS01A3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case S4elibraryPackage.ANGULAR_GYROSCOPESENSOR_XNUCLEOIKS01A3: {
				angular_gyroscopesensorXNUCLEOIKS01A3 angular_gyroscopesensorXNUCLEOIKS01A3 = (angular_gyroscopesensorXNUCLEOIKS01A3)theEObject;
				T result = caseangular_gyroscopesensorXNUCLEOIKS01A3(angular_gyroscopesensorXNUCLEOIKS01A3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case S4elibraryPackage.TEMPERATURESENSORDS18B20: {
				temperaturesensords18b20 temperaturesensords18b20 = (temperaturesensords18b20)theEObject;
				T result = casetemperaturesensords18b20(temperaturesensords18b20);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Highvoltagecontrolrelay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Highvoltagecontrolrelay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHighvoltagecontrolrelay(Highvoltagecontrolrelay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuousrotationservomotorservo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuousrotationservomotorservo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuousrotationservomotorservo(Continuousrotationservomotorservo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angularservomotorservo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angularservomotorservo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngularservomotorservo(Angularservomotorservo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>humiditysensor XNUCLEOIKS01A3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>humiditysensor XNUCLEOIKS01A3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casehumiditysensorXNUCLEOIKS01A3(humiditysensorXNUCLEOIKS01A3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>temperaturesensor XNUCLEOIKS01A3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>temperaturesensor XNUCLEOIKS01A3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetemperaturesensorXNUCLEOIKS01A3(temperaturesensorXNUCLEOIKS01A3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>magnetometersensor XNUCLEOIKS01A3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>magnetometersensor XNUCLEOIKS01A3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemagnetometersensorXNUCLEOIKS01A3(magnetometersensorXNUCLEOIKS01A3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>accelerometersensor XNUCLEOIKS01A3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>accelerometersensor XNUCLEOIKS01A3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseaccelerometersensorXNUCLEOIKS01A3(accelerometersensorXNUCLEOIKS01A3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>angular gyroscopesensor XNUCLEOIKS01A3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>angular gyroscopesensor XNUCLEOIKS01A3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseangular_gyroscopesensorXNUCLEOIKS01A3(angular_gyroscopesensorXNUCLEOIKS01A3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>temperaturesensords18b20</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>temperaturesensords18b20</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetemperaturesensords18b20(temperaturesensords18b20 object) {
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
