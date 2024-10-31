/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Instance Naming Standard Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getInstanceNamingStandardKind()
 * @model
 * @generated
 */
public enum InstanceNamingStandardKind implements Enumerator {
	/**
	 * The '<em><b>ISO15296</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISO15296_VALUE
	 * @generated
	 * @ordered
	 */
	ISO15296(0, "ISO15296", "ISO15296"),

	/**
	 * The '<em><b>ISO10303</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISO10303_VALUE
	 * @generated
	 * @ordered
	 */
	ISO10303(1, "ISO10303", "ISO10303"),

	/**
	 * The '<em><b>BIM v5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIM_V5_VALUE
	 * @generated
	 * @ordered
	 */
	BIM_V5(2, "BIM_v5", "BIM_v5"),

	/**
	 * The '<em><b>BIM v4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIM_V4_VALUE
	 * @generated
	 * @ordered
	 */
	BIM_V4(3, "BIM_v4", "BIM_v4"),

	/**
	 * The '<em><b>BIM v3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIM_V3_VALUE
	 * @generated
	 * @ordered
	 */
	BIM_V3(4, "BIM_v3", "BIM_v3"),

	/**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(5, "OTHER", "OTHER");

	/**
	 * The '<em><b>ISO15296</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISO15296
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISO15296_VALUE = 0;

	/**
	 * The '<em><b>ISO10303</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISO10303
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISO10303_VALUE = 1;

	/**
	 * The '<em><b>BIM v5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIM_V5
	 * @model name="BIM_v5"
	 * @generated
	 * @ordered
	 */
	public static final int BIM_V5_VALUE = 2;

	/**
	 * The '<em><b>BIM v4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIM_V4
	 * @model name="BIM_v4"
	 * @generated
	 * @ordered
	 */
	public static final int BIM_V4_VALUE = 3;

	/**
	 * The '<em><b>BIM v3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIM_V3
	 * @model name="BIM_v3"
	 * @generated
	 * @ordered
	 */
	public static final int BIM_V3_VALUE = 4;

	/**
	 * The '<em><b>OTHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 5;

	/**
	 * An array of all the '<em><b>Instance Naming Standard Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InstanceNamingStandardKind[] VALUES_ARRAY =
		new InstanceNamingStandardKind[] {
			ISO15296,
			ISO10303,
			BIM_V5,
			BIM_V4,
			BIM_V3,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Instance Naming Standard Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InstanceNamingStandardKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Instance Naming Standard Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InstanceNamingStandardKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InstanceNamingStandardKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Instance Naming Standard Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InstanceNamingStandardKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InstanceNamingStandardKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Instance Naming Standard Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InstanceNamingStandardKind get(int value) {
		switch (value) {
			case ISO15296_VALUE: return ISO15296;
			case ISO10303_VALUE: return ISO10303;
			case BIM_V5_VALUE: return BIM_V5;
			case BIM_V4_VALUE: return BIM_V4;
			case BIM_V3_VALUE: return BIM_V3;
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
	private InstanceNamingStandardKind(int value, String name, String literal) {
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
	
} //InstanceNamingStandardKind
