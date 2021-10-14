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
			case S4elibraryPackage.HIGHVOLTAGECONTROLRELAY: return createHighvoltagecontrolrelay();
			case S4elibraryPackage.CONTINUOUSROTATIONSERVOMOTORSERVO: return createContinuousrotationservomotorservo();
			case S4elibraryPackage.ANGULARSERVOMOTORSERVO: return createAngularservomotorservo();
			case S4elibraryPackage.HUMIDITYSENSOR_XNUCLEOIKS01A3: return createhumiditysensorXNUCLEOIKS01A3();
			case S4elibraryPackage.TEMPERATURESENSOR_XNUCLEOIKS01A3: return createtemperaturesensorXNUCLEOIKS01A3();
			case S4elibraryPackage.MAGNETOMETERSENSOR_XNUCLEOIKS01A3: return createmagnetometersensorXNUCLEOIKS01A3();
			case S4elibraryPackage.ACCELEROMETERSENSOR_XNUCLEOIKS01A3: return createaccelerometersensorXNUCLEOIKS01A3();
			case S4elibraryPackage.ANGULAR_GYROSCOPESENSOR_XNUCLEOIKS01A3: return createangular_gyroscopesensorXNUCLEOIKS01A3();
			case S4elibraryPackage.TEMPERATURESENSORDS18B20: return createtemperaturesensords18b20();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Highvoltagecontrolrelay createHighvoltagecontrolrelay() {
		HighvoltagecontrolrelayImpl highvoltagecontrolrelay = new HighvoltagecontrolrelayImpl();
		return highvoltagecontrolrelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Continuousrotationservomotorservo createContinuousrotationservomotorservo() {
		ContinuousrotationservomotorservoImpl continuousrotationservomotorservo = new ContinuousrotationservomotorservoImpl();
		return continuousrotationservomotorservo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Angularservomotorservo createAngularservomotorservo() {
		AngularservomotorservoImpl angularservomotorservo = new AngularservomotorservoImpl();
		return angularservomotorservo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public humiditysensorXNUCLEOIKS01A3 createhumiditysensorXNUCLEOIKS01A3() {
		humiditysensorXNUCLEOIKS01A3Impl humiditysensorXNUCLEOIKS01A3 = new humiditysensorXNUCLEOIKS01A3Impl();
		return humiditysensorXNUCLEOIKS01A3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public temperaturesensorXNUCLEOIKS01A3 createtemperaturesensorXNUCLEOIKS01A3() {
		temperaturesensorXNUCLEOIKS01A3Impl temperaturesensorXNUCLEOIKS01A3 = new temperaturesensorXNUCLEOIKS01A3Impl();
		return temperaturesensorXNUCLEOIKS01A3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public magnetometersensorXNUCLEOIKS01A3 createmagnetometersensorXNUCLEOIKS01A3() {
		magnetometersensorXNUCLEOIKS01A3Impl magnetometersensorXNUCLEOIKS01A3 = new magnetometersensorXNUCLEOIKS01A3Impl();
		return magnetometersensorXNUCLEOIKS01A3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public accelerometersensorXNUCLEOIKS01A3 createaccelerometersensorXNUCLEOIKS01A3() {
		accelerometersensorXNUCLEOIKS01A3Impl accelerometersensorXNUCLEOIKS01A3 = new accelerometersensorXNUCLEOIKS01A3Impl();
		return accelerometersensorXNUCLEOIKS01A3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public angular_gyroscopesensorXNUCLEOIKS01A3 createangular_gyroscopesensorXNUCLEOIKS01A3() {
		angular_gyroscopesensorXNUCLEOIKS01A3Impl angular_gyroscopesensorXNUCLEOIKS01A3 = new angular_gyroscopesensorXNUCLEOIKS01A3Impl();
		return angular_gyroscopesensorXNUCLEOIKS01A3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public temperaturesensords18b20 createtemperaturesensords18b20() {
		temperaturesensords18b20Impl temperaturesensords18b20 = new temperaturesensords18b20Impl();
		return temperaturesensords18b20;
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
