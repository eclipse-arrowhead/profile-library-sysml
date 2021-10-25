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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import s4elibrary.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see s4elibrary.S4elibraryPackage
 * @generated
 */
public class S4elibraryAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static S4elibraryPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public S4elibraryAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = S4elibraryPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected S4elibrarySwitch<Adapter> modelSwitch =
		new S4elibrarySwitch<Adapter>() {
			@Override
			public Adapter caseHighvoltagecontrolrelay(Highvoltagecontrolrelay object) {
				return createHighvoltagecontrolrelayAdapter();
			}
			@Override
			public Adapter caseContinuousrotationservomotorservo(Continuousrotationservomotorservo object) {
				return createContinuousrotationservomotorservoAdapter();
			}
			@Override
			public Adapter caseAngularservomotorservo(Angularservomotorservo object) {
				return createAngularservomotorservoAdapter();
			}
			@Override
			public Adapter casehumiditysensorXNUCLEOIKS01A3(humiditysensorXNUCLEOIKS01A3 object) {
				return createhumiditysensorXNUCLEOIKS01A3Adapter();
			}
			@Override
			public Adapter casetemperaturesensorXNUCLEOIKS01A3(temperaturesensorXNUCLEOIKS01A3 object) {
				return createtemperaturesensorXNUCLEOIKS01A3Adapter();
			}
			@Override
			public Adapter casemagnetometersensorXNUCLEOIKS01A3(magnetometersensorXNUCLEOIKS01A3 object) {
				return createmagnetometersensorXNUCLEOIKS01A3Adapter();
			}
			@Override
			public Adapter caseaccelerometersensorXNUCLEOIKS01A3(accelerometersensorXNUCLEOIKS01A3 object) {
				return createaccelerometersensorXNUCLEOIKS01A3Adapter();
			}
			@Override
			public Adapter caseangular_gyroscopesensorXNUCLEOIKS01A3(angular_gyroscopesensorXNUCLEOIKS01A3 object) {
				return createangular_gyroscopesensorXNUCLEOIKS01A3Adapter();
			}
			@Override
			public Adapter casetemperaturesensords18b20(temperaturesensords18b20 object) {
				return createtemperaturesensords18b20Adapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link s4elibrary.Highvoltagecontrolrelay <em>Highvoltagecontrolrelay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see s4elibrary.Highvoltagecontrolrelay
	 * @generated
	 */
	public Adapter createHighvoltagecontrolrelayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link s4elibrary.Continuousrotationservomotorservo <em>Continuousrotationservomotorservo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see s4elibrary.Continuousrotationservomotorservo
	 * @generated
	 */
	public Adapter createContinuousrotationservomotorservoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link s4elibrary.Angularservomotorservo <em>Angularservomotorservo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see s4elibrary.Angularservomotorservo
	 * @generated
	 */
	public Adapter createAngularservomotorservoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link s4elibrary.humiditysensorXNUCLEOIKS01A3 <em>humiditysensor XNUCLEOIKS01A3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see s4elibrary.humiditysensorXNUCLEOIKS01A3
	 * @generated
	 */
	public Adapter createhumiditysensorXNUCLEOIKS01A3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link s4elibrary.temperaturesensorXNUCLEOIKS01A3 <em>temperaturesensor XNUCLEOIKS01A3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see s4elibrary.temperaturesensorXNUCLEOIKS01A3
	 * @generated
	 */
	public Adapter createtemperaturesensorXNUCLEOIKS01A3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link s4elibrary.magnetometersensorXNUCLEOIKS01A3 <em>magnetometersensor XNUCLEOIKS01A3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see s4elibrary.magnetometersensorXNUCLEOIKS01A3
	 * @generated
	 */
	public Adapter createmagnetometersensorXNUCLEOIKS01A3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link s4elibrary.accelerometersensorXNUCLEOIKS01A3 <em>accelerometersensor XNUCLEOIKS01A3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see s4elibrary.accelerometersensorXNUCLEOIKS01A3
	 * @generated
	 */
	public Adapter createaccelerometersensorXNUCLEOIKS01A3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link s4elibrary.angular_gyroscopesensorXNUCLEOIKS01A3 <em>angular gyroscopesensor XNUCLEOIKS01A3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see s4elibrary.angular_gyroscopesensorXNUCLEOIKS01A3
	 * @generated
	 */
	public Adapter createangular_gyroscopesensorXNUCLEOIKS01A3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link s4elibrary.temperaturesensords18b20 <em>temperaturesensords18b20</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see s4elibrary.temperaturesensords18b20
	 * @generated
	 */
	public Adapter createtemperaturesensords18b20Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //S4elibraryAdapterFactory
