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
			public Adapter casetemperatureds18b20(temperatureds18b20 object) {
				return createtemperatureds18b20Adapter();
			}
			@Override
			public Adapter casetemperaturedht11(temperaturedht11 object) {
				return createtemperaturedht11Adapter();
			}
			@Override
			public Adapter casehumiditydht11(humiditydht11 object) {
				return createhumiditydht11Adapter();
			}
			@Override
			public Adapter casetemperaturedht21(temperaturedht21 object) {
				return createtemperaturedht21Adapter();
			}
			@Override
			public Adapter casehumiditydht21(humiditydht21 object) {
				return createhumiditydht21Adapter();
			}
			@Override
			public Adapter casetemperaturedht22(temperaturedht22 object) {
				return createtemperaturedht22Adapter();
			}
			@Override
			public Adapter casehumiditydht22(humiditydht22 object) {
				return createhumiditydht22Adapter();
			}
			@Override
			public Adapter casetemperaturedht(temperaturedht object) {
				return createtemperaturedhtAdapter();
			}
			@Override
			public Adapter casehumiditydht(humiditydht object) {
				return createhumiditydhtAdapter();
			}
			@Override
			public Adapter casestaticrelay(staticrelay object) {
				return createstaticrelayAdapter();
			}
			@Override
			public Adapter casemosfetrelay(mosfetrelay object) {
				return createmosfetrelayAdapter();
			}
			@Override
			public Adapter caseangularservo(angularservo object) {
				return createangularservoAdapter();
			}
			@Override
			public Adapter casecontinuousservo(continuousservo object) {
				return createcontinuousservoAdapter();
			}
			@Override
			public Adapter casetemperaturex_nucleo_iks01a3(temperaturex_nucleo_iks01a3 object) {
				return createtemperaturex_nucleo_iks01a3Adapter();
			}
			@Override
			public Adapter casehumidityx_nucleo_iks01a3(humidityx_nucleo_iks01a3 object) {
				return createhumidityx_nucleo_iks01a3Adapter();
			}
			@Override
			public Adapter casepressurex_nucleo_iks01a3(pressurex_nucleo_iks01a3 object) {
				return createpressurex_nucleo_iks01a3Adapter();
			}
			@Override
			public Adapter caseaccelerometerx_nucleo_iks01a3(accelerometerx_nucleo_iks01a3 object) {
				return createaccelerometerx_nucleo_iks01a3Adapter();
			}
			@Override
			public Adapter casegyrox_nucleo_iks01a3(gyrox_nucleo_iks01a3 object) {
				return creategyrox_nucleo_iks01a3Adapter();
			}
			@Override
			public Adapter casemagnetx_nucleo_iks01a3(magnetx_nucleo_iks01a3 object) {
				return createmagnetx_nucleo_iks01a3Adapter();
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
	 * Creates a new adapter for an object of class '{@link s4elibrary.temperatureds18b20 <em>temperatureds18b20</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see s4elibrary.temperatureds18b20
	 * @generated
	 */
	public Adapter createtemperatureds18b20Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link s4elibrary.temperaturedht11 <em>temperaturedht11</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see s4elibrary.temperaturedht11
	 * @generated
	 */
	public Adapter createtemperaturedht11Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link s4elibrary.humiditydht11 <em>humiditydht11</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see s4elibrary.humiditydht11
	 * @generated
	 */
	public Adapter createhumiditydht11Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link s4elibrary.temperaturedht21 <em>temperaturedht21</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see s4elibrary.temperaturedht21
	 * @generated
	 */
	public Adapter createtemperaturedht21Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link s4elibrary.humiditydht21 <em>humiditydht21</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see s4elibrary.humiditydht21
	 * @generated
	 */
	public Adapter createhumiditydht21Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link s4elibrary.temperaturedht22 <em>temperaturedht22</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see s4elibrary.temperaturedht22
	 * @generated
	 */
	public Adapter createtemperaturedht22Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link s4elibrary.humiditydht22 <em>humiditydht22</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see s4elibrary.humiditydht22
	 * @generated
	 */
	public Adapter createhumiditydht22Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link s4elibrary.temperaturedht <em>temperaturedht</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see s4elibrary.temperaturedht
	 * @generated
	 */
	public Adapter createtemperaturedhtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link s4elibrary.humiditydht <em>humiditydht</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see s4elibrary.humiditydht
	 * @generated
	 */
	public Adapter createhumiditydhtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link s4elibrary.staticrelay <em>staticrelay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see s4elibrary.staticrelay
	 * @generated
	 */
	public Adapter createstaticrelayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link s4elibrary.mosfetrelay <em>mosfetrelay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see s4elibrary.mosfetrelay
	 * @generated
	 */
	public Adapter createmosfetrelayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link s4elibrary.angularservo <em>angularservo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see s4elibrary.angularservo
	 * @generated
	 */
	public Adapter createangularservoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link s4elibrary.continuousservo <em>continuousservo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see s4elibrary.continuousservo
	 * @generated
	 */
	public Adapter createcontinuousservoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link s4elibrary.temperaturex_nucleo_iks01a3 <em>temperaturex nucleo iks01a3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see s4elibrary.temperaturex_nucleo_iks01a3
	 * @generated
	 */
	public Adapter createtemperaturex_nucleo_iks01a3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link s4elibrary.humidityx_nucleo_iks01a3 <em>humidityx nucleo iks01a3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see s4elibrary.humidityx_nucleo_iks01a3
	 * @generated
	 */
	public Adapter createhumidityx_nucleo_iks01a3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link s4elibrary.pressurex_nucleo_iks01a3 <em>pressurex nucleo iks01a3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see s4elibrary.pressurex_nucleo_iks01a3
	 * @generated
	 */
	public Adapter createpressurex_nucleo_iks01a3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link s4elibrary.accelerometerx_nucleo_iks01a3 <em>accelerometerx nucleo iks01a3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see s4elibrary.accelerometerx_nucleo_iks01a3
	 * @generated
	 */
	public Adapter createaccelerometerx_nucleo_iks01a3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link s4elibrary.gyrox_nucleo_iks01a3 <em>gyrox nucleo iks01a3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see s4elibrary.gyrox_nucleo_iks01a3
	 * @generated
	 */
	public Adapter creategyrox_nucleo_iks01a3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link s4elibrary.magnetx_nucleo_iks01a3 <em>magnetx nucleo iks01a3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see s4elibrary.magnetx_nucleo_iks01a3
	 * @generated
	 */
	public Adapter createmagnetx_nucleo_iks01a3Adapter() {
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
