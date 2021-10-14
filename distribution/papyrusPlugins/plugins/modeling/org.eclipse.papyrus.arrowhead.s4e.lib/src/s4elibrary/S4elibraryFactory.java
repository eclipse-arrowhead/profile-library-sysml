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
package s4elibrary;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see s4elibrary.S4elibraryPackage
 * @generated
 */
public interface S4elibraryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	S4elibraryFactory eINSTANCE = s4elibrary.impl.S4elibraryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Highvoltagecontrolrelay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Highvoltagecontrolrelay</em>'.
	 * @generated
	 */
	Highvoltagecontrolrelay createHighvoltagecontrolrelay();

	/**
	 * Returns a new object of class '<em>Continuousrotationservomotorservo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Continuousrotationservomotorservo</em>'.
	 * @generated
	 */
	Continuousrotationservomotorservo createContinuousrotationservomotorservo();

	/**
	 * Returns a new object of class '<em>Angularservomotorservo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Angularservomotorservo</em>'.
	 * @generated
	 */
	Angularservomotorservo createAngularservomotorservo();

	/**
	 * Returns a new object of class '<em>humiditysensor XNUCLEOIKS01A3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>humiditysensor XNUCLEOIKS01A3</em>'.
	 * @generated
	 */
	humiditysensorXNUCLEOIKS01A3 createhumiditysensorXNUCLEOIKS01A3();

	/**
	 * Returns a new object of class '<em>temperaturesensor XNUCLEOIKS01A3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>temperaturesensor XNUCLEOIKS01A3</em>'.
	 * @generated
	 */
	temperaturesensorXNUCLEOIKS01A3 createtemperaturesensorXNUCLEOIKS01A3();

	/**
	 * Returns a new object of class '<em>magnetometersensor XNUCLEOIKS01A3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>magnetometersensor XNUCLEOIKS01A3</em>'.
	 * @generated
	 */
	magnetometersensorXNUCLEOIKS01A3 createmagnetometersensorXNUCLEOIKS01A3();

	/**
	 * Returns a new object of class '<em>accelerometersensor XNUCLEOIKS01A3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>accelerometersensor XNUCLEOIKS01A3</em>'.
	 * @generated
	 */
	accelerometersensorXNUCLEOIKS01A3 createaccelerometersensorXNUCLEOIKS01A3();

	/**
	 * Returns a new object of class '<em>angular gyroscopesensor XNUCLEOIKS01A3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>angular gyroscopesensor XNUCLEOIKS01A3</em>'.
	 * @generated
	 */
	angular_gyroscopesensorXNUCLEOIKS01A3 createangular_gyroscopesensorXNUCLEOIKS01A3();

	/**
	 * Returns a new object of class '<em>temperaturesensords18b20</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>temperaturesensords18b20</em>'.
	 * @generated
	 */
	temperaturesensords18b20 createtemperaturesensords18b20();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	S4elibraryPackage getS4elibraryPackage();

} //S4elibraryFactory
