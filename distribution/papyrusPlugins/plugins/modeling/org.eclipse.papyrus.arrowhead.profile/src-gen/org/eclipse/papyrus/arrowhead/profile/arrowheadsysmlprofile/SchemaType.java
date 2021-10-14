/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Schema Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getSchemaType()
 * @model
 * @generated
 */
public enum SchemaType implements Enumerator {
	/**
	 * The '<em><b>XML Schema</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XML_SCHEMA_VALUE
	 * @generated
	 * @ordered
	 */
	XML_SCHEMA(0, "XML_Schema", "XML_Schema"),

	/**
	 * The '<em><b>JSON Schema</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JSON_SCHEMA_VALUE
	 * @generated
	 * @ordered
	 */
	JSON_SCHEMA(1, "JSON_Schema", "JSON_Schema");

	/**
	 * The '<em><b>XML Schema</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XML_SCHEMA
	 * @model name="XML_Schema"
	 * @generated
	 * @ordered
	 */
	public static final int XML_SCHEMA_VALUE = 0;

	/**
	 * The '<em><b>JSON Schema</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JSON_SCHEMA
	 * @model name="JSON_Schema"
	 * @generated
	 * @ordered
	 */
	public static final int JSON_SCHEMA_VALUE = 1;

	/**
	 * An array of all the '<em><b>Schema Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SchemaType[] VALUES_ARRAY =
		new SchemaType[] {
			XML_SCHEMA,
			JSON_SCHEMA,
		};

	/**
	 * A public read-only list of all the '<em><b>Schema Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SchemaType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Schema Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SchemaType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SchemaType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Schema Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SchemaType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SchemaType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Schema Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SchemaType get(int value) {
		switch (value) {
			case XML_SCHEMA_VALUE: return XML_SCHEMA;
			case JSON_SCHEMA_VALUE: return JSON_SCHEMA;
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
	private SchemaType(int value, String name, String literal) {
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
	
} //SchemaType
