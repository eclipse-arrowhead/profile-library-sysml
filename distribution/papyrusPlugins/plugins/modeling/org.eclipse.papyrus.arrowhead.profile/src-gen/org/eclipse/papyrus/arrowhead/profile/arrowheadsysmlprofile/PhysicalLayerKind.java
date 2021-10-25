/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Physical Layer Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getPhysicalLayerKind()
 * @model
 * @generated
 */
public enum PhysicalLayerKind implements Enumerator {
	/**
	 * The '<em><b>802 3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_802_3_VALUE
	 * @generated
	 * @ordered
	 */
	_802_3(0, "_802_3", "_802_3"),

	/**
	 * The '<em><b>802 15 4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_802_15_4_VALUE
	 * @generated
	 * @ordered
	 */
	_802_15_4(1, "_802_15_4", "_802_15_4"),

	/**
	 * The '<em><b>802 11a</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_802_11A_VALUE
	 * @generated
	 * @ordered
	 */
	_802_11A(2, "_802_11a", "_802_11a"),

	/**
	 * The '<em><b>802 11 b</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_802_11_B_VALUE
	 * @generated
	 * @ordered
	 */
	_802_11_B(3, "_802_11_b", "_802_11_b");

	/**
	 * The '<em><b>802 3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_802_3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int _802_3_VALUE = 0;

	/**
	 * The '<em><b>802 15 4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_802_15_4
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int _802_15_4_VALUE = 1;

	/**
	 * The '<em><b>802 11a</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_802_11A
	 * @model name="_802_11a"
	 * @generated
	 * @ordered
	 */
	public static final int _802_11A_VALUE = 2;

	/**
	 * The '<em><b>802 11 b</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_802_11_B
	 * @model name="_802_11_b"
	 * @generated
	 * @ordered
	 */
	public static final int _802_11_B_VALUE = 3;

	/**
	 * An array of all the '<em><b>Physical Layer Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PhysicalLayerKind[] VALUES_ARRAY =
		new PhysicalLayerKind[] {
			_802_3,
			_802_15_4,
			_802_11A,
			_802_11_B,
		};

	/**
	 * A public read-only list of all the '<em><b>Physical Layer Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PhysicalLayerKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Physical Layer Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PhysicalLayerKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PhysicalLayerKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Physical Layer Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PhysicalLayerKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PhysicalLayerKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Physical Layer Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PhysicalLayerKind get(int value) {
		switch (value) {
			case _802_3_VALUE: return _802_3;
			case _802_15_4_VALUE: return _802_15_4;
			case _802_11A_VALUE: return _802_11A;
			case _802_11_B_VALUE: return _802_11_B;
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
	private PhysicalLayerKind(int value, String name, String literal) {
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
	
} //PhysicalLayerKind
