/**
 */
package org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Mandatory Core System Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getMandatoryCoreSystemKind()
 * @model
 * @generated
 */
public enum MandatoryCoreSystemKind implements Enumerator {
	/**
	 * The '<em><b>ORCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORCH_VALUE
	 * @generated
	 * @ordered
	 */
	ORCH(0, "ORCH", "ORCH"),

	/**
	 * The '<em><b>AUTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTH_VALUE
	 * @generated
	 * @ordered
	 */
	AUTH(1, "AUTH", "AUTH"),

	/**
	 * The '<em><b>SR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SR_VALUE
	 * @generated
	 * @ordered
	 */
	SR(2, "SR", "SR");

	/**
	 * The '<em><b>ORCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ORCH_VALUE = 0;

	/**
	 * The '<em><b>AUTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AUTH_VALUE = 1;

	/**
	 * The '<em><b>SR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SR_VALUE = 2;

	/**
	 * An array of all the '<em><b>Mandatory Core System Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MandatoryCoreSystemKind[] VALUES_ARRAY =
		new MandatoryCoreSystemKind[] {
			ORCH,
			AUTH,
			SR,
		};

	/**
	 * A public read-only list of all the '<em><b>Mandatory Core System Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MandatoryCoreSystemKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Mandatory Core System Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MandatoryCoreSystemKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MandatoryCoreSystemKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mandatory Core System Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MandatoryCoreSystemKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MandatoryCoreSystemKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mandatory Core System Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MandatoryCoreSystemKind get(int value) {
		switch (value) {
			case ORCH_VALUE: return ORCH;
			case AUTH_VALUE: return AUTH;
			case SR_VALUE: return SR;
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
	private MandatoryCoreSystemKind(int value, String name, String literal) {
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
	
} //MandatoryCoreSystemKind
