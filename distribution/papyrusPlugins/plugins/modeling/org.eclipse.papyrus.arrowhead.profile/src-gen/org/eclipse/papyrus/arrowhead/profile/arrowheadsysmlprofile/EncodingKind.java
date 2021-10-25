/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Encoding Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getEncodingKind()
 * @model
 * @generated
 */
public enum EncodingKind implements Enumerator {
	/**
	 * The '<em><b>JSON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JSON_VALUE
	 * @generated
	 * @ordered
	 */
	JSON(0, "JSON", "JSON"),

	/**
	 * The '<em><b>XML</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XML_VALUE
	 * @generated
	 * @ordered
	 */
	XML(1, "XML", "XML"),

	/**
	 * The '<em><b>CBOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CBOR_VALUE
	 * @generated
	 * @ordered
	 */
	CBOR(2, "CBOR", "CBOR"),

	/**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(3, "OTHER", "OTHER");

	/**
	 * The '<em><b>JSON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JSON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JSON_VALUE = 0;

	/**
	 * The '<em><b>XML</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XML
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XML_VALUE = 1;

	/**
	 * The '<em><b>CBOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CBOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CBOR_VALUE = 2;

	/**
	 * The '<em><b>OTHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 3;

	/**
	 * An array of all the '<em><b>Encoding Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EncodingKind[] VALUES_ARRAY =
		new EncodingKind[] {
			JSON,
			XML,
			CBOR,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Encoding Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EncodingKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Encoding Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EncodingKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EncodingKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Encoding Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EncodingKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EncodingKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Encoding Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EncodingKind get(int value) {
		switch (value) {
			case JSON_VALUE: return JSON;
			case XML_VALUE: return XML;
			case CBOR_VALUE: return CBOR;
			case OTHER_VALUE: return OTHER;
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
	private EncodingKind(int value, String name, String literal) {
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
	
} //EncodingKind
