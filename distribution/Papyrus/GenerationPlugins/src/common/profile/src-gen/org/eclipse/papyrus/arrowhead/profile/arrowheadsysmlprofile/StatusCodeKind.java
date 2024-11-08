/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Status Code Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getStatusCodeKind()
 * @model
 * @generated
 */
public enum StatusCodeKind implements Enumerator {
	/**
	 * The '<em><b>100</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OK
	 * <!-- end-model-doc -->
	 * @see #_100_VALUE
	 * @generated
	 * @ordered
	 */
	_100(0, "_100", "_100"),

	/**
	 * The '<em><b>200</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OK
	 * Normal response, no error
	 * <!-- end-model-doc -->
	 * @see #_200_VALUE
	 * @generated
	 * @ordered
	 */
	_200(1, "_200", "_200"),

	/**
	 * The '<em><b>201</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Created: Normal response, no error
	 * <!-- end-model-doc -->
	 * @see #_201_VALUE
	 * @generated
	 * @ordered
	 */
	_201(2, "_201", "_201"),

	/**
	 * The '<em><b>400</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bad request
	 * Incorrect request
	 * <!-- end-model-doc -->
	 * @see #_400_VALUE
	 * @generated
	 * @ordered
	 */
	_400(3, "_400", "_400"),

	/**
	 * The '<em><b>401</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not authorized
	 * Missing or faulty credentials
	 * <!-- end-model-doc -->
	 * @see #_401_VALUE
	 * @generated
	 * @ordered
	 */
	_401(4, "_401", "_401"),

	/**
	 * The '<em><b>422</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unprocessable entity
	 * Impossible to process the entity
	 * <!-- end-model-doc -->
	 * @see #_422_VALUE
	 * @generated
	 * @ordered
	 */
	_422(5, "_422", "_422"),

	/**
	 * The '<em><b>500</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Internal server error
	 * Database failure, hardware error etc.
	 * <!-- end-model-doc -->
	 * @see #_500_VALUE
	 * @generated
	 * @ordered
	 */
	_500(6, "_500", "_500");

	/**
	 * The '<em><b>100</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OK
	 * <!-- end-model-doc -->
	 * @see #_100
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int _100_VALUE = 0;

	/**
	 * The '<em><b>200</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OK
	 * Normal response, no error
	 * <!-- end-model-doc -->
	 * @see #_200
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int _200_VALUE = 1;

	/**
	 * The '<em><b>201</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Created: Normal response, no error
	 * <!-- end-model-doc -->
	 * @see #_201
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int _201_VALUE = 2;

	/**
	 * The '<em><b>400</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bad request
	 * Incorrect request
	 * <!-- end-model-doc -->
	 * @see #_400
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int _400_VALUE = 3;

	/**
	 * The '<em><b>401</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not authorized
	 * Missing or faulty credentials
	 * <!-- end-model-doc -->
	 * @see #_401
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int _401_VALUE = 4;

	/**
	 * The '<em><b>422</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unprocessable entity
	 * Impossible to process the entity
	 * <!-- end-model-doc -->
	 * @see #_422
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int _422_VALUE = 5;

	/**
	 * The '<em><b>500</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Internal server error
	 * Database failure, hardware error etc.
	 * <!-- end-model-doc -->
	 * @see #_500
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int _500_VALUE = 6;

	/**
	 * An array of all the '<em><b>Status Code Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StatusCodeKind[] VALUES_ARRAY =
		new StatusCodeKind[] {
			_100,
			_200,
			_201,
			_400,
			_401,
			_422,
			_500,
		};

	/**
	 * A public read-only list of all the '<em><b>Status Code Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StatusCodeKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Status Code Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StatusCodeKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StatusCodeKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Status Code Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StatusCodeKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StatusCodeKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Status Code Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StatusCodeKind get(int value) {
		switch (value) {
			case _100_VALUE: return _100;
			case _200_VALUE: return _200;
			case _201_VALUE: return _201;
			case _400_VALUE: return _400;
			case _401_VALUE: return _401;
			case _422_VALUE: return _422;
			case _500_VALUE: return _500;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StatusCodeKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //StatusCodeKind
