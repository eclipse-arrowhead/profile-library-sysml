/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ontology Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getOntologyKind()
 * @model
 * @generated
 */
public enum OntologyKind implements Enumerator {
	/**
	 * The '<em><b>Sen ML</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEN_ML_VALUE
	 * @generated
	 * @ordered
	 */
	SEN_ML(0, "SenML", "SenML"),

	/**
	 * The '<em><b>ISO10303 AP203</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISO10303_AP203_VALUE
	 * @generated
	 * @ordered
	 */
	ISO10303_AP203(1, "ISO10303_AP203", "ISO10303_AP203"),

	/**
	 * The '<em><b>ISO15396</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISO15396_VALUE
	 * @generated
	 * @ordered
	 */
	ISO15396(2, "ISO15396", "ISO15396");

	/**
	 * The '<em><b>Sen ML</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEN_ML
	 * @model name="SenML"
	 * @generated
	 * @ordered
	 */
	public static final int SEN_ML_VALUE = 0;

	/**
	 * The '<em><b>ISO10303 AP203</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISO10303_AP203
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISO10303_AP203_VALUE = 1;

	/**
	 * The '<em><b>ISO15396</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISO15396
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISO15396_VALUE = 2;

	/**
	 * An array of all the '<em><b>Ontology Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OntologyKind[] VALUES_ARRAY =
		new OntologyKind[] {
			SEN_ML,
			ISO10303_AP203,
			ISO15396,
		};

	/**
	 * A public read-only list of all the '<em><b>Ontology Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OntologyKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ontology Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OntologyKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OntologyKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ontology Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OntologyKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OntologyKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ontology Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OntologyKind get(int value) {
		switch (value) {
			case SEN_ML_VALUE: return SEN_ML;
			case ISO10303_AP203_VALUE: return ISO10303_AP203;
			case ISO15396_VALUE: return ISO15396;
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
	private OntologyKind(int value, String name, String literal) {
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
	
} //OntologyKind
