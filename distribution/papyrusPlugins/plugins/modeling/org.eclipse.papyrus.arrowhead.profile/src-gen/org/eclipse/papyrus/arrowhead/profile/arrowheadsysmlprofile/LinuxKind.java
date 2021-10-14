/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Linux Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getLinuxKind()
 * @model
 * @generated
 */
public enum LinuxKind implements Enumerator {
	/**
	 * The '<em><b>Ubuntu 20 10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UBUNTU_20_10_VALUE
	 * @generated
	 * @ordered
	 */
	UBUNTU_20_10(0, "Ubuntu_20_10", "Ubuntu_20_10"),

	/**
	 * The '<em><b>Ubuntu 20 04 LTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UBUNTU_20_04_LTS_VALUE
	 * @generated
	 * @ordered
	 */
	UBUNTU_20_04_LTS(1, "Ubuntu_20_04_LTS", "Ubuntu_20_04_LTS"),

	/**
	 * The '<em><b>Ubuntu Raspberry Pi 2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UBUNTU_RASPBERRY_PI_2_VALUE
	 * @generated
	 * @ordered
	 */
	UBUNTU_RASPBERRY_PI_2(2, "Ubuntu_Raspberry_Pi_2", "Ubuntu_Raspberry_Pi_2"),

	/**
	 * The '<em><b>Ubuntu Raspberry Pi 3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UBUNTU_RASPBERRY_PI_3_VALUE
	 * @generated
	 * @ordered
	 */
	UBUNTU_RASPBERRY_PI_3(3, "Ubuntu_Raspberry_Pi_3", "Ubuntu_Raspberry_Pi_3"),

	/**
	 * The '<em><b>Ubuntu Raspberry Pi 4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UBUNTU_RASPBERRY_PI_4_VALUE
	 * @generated
	 * @ordered
	 */
	UBUNTU_RASPBERRY_PI_4(4, "Ubuntu_Raspberry_Pi_4", "Ubuntu_Raspberry_Pi_4");

	/**
	 * The '<em><b>Ubuntu 20 10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UBUNTU_20_10
	 * @model name="Ubuntu_20_10"
	 * @generated
	 * @ordered
	 */
	public static final int UBUNTU_20_10_VALUE = 0;

	/**
	 * The '<em><b>Ubuntu 20 04 LTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UBUNTU_20_04_LTS
	 * @model name="Ubuntu_20_04_LTS"
	 * @generated
	 * @ordered
	 */
	public static final int UBUNTU_20_04_LTS_VALUE = 1;

	/**
	 * The '<em><b>Ubuntu Raspberry Pi 2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UBUNTU_RASPBERRY_PI_2
	 * @model name="Ubuntu_Raspberry_Pi_2"
	 * @generated
	 * @ordered
	 */
	public static final int UBUNTU_RASPBERRY_PI_2_VALUE = 2;

	/**
	 * The '<em><b>Ubuntu Raspberry Pi 3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UBUNTU_RASPBERRY_PI_3
	 * @model name="Ubuntu_Raspberry_Pi_3"
	 * @generated
	 * @ordered
	 */
	public static final int UBUNTU_RASPBERRY_PI_3_VALUE = 3;

	/**
	 * The '<em><b>Ubuntu Raspberry Pi 4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UBUNTU_RASPBERRY_PI_4
	 * @model name="Ubuntu_Raspberry_Pi_4"
	 * @generated
	 * @ordered
	 */
	public static final int UBUNTU_RASPBERRY_PI_4_VALUE = 4;

	/**
	 * An array of all the '<em><b>Linux Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LinuxKind[] VALUES_ARRAY =
		new LinuxKind[] {
			UBUNTU_20_10,
			UBUNTU_20_04_LTS,
			UBUNTU_RASPBERRY_PI_2,
			UBUNTU_RASPBERRY_PI_3,
			UBUNTU_RASPBERRY_PI_4,
		};

	/**
	 * A public read-only list of all the '<em><b>Linux Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LinuxKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Linux Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LinuxKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LinuxKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Linux Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LinuxKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LinuxKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Linux Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LinuxKind get(int value) {
		switch (value) {
			case UBUNTU_20_10_VALUE: return UBUNTU_20_10;
			case UBUNTU_20_04_LTS_VALUE: return UBUNTU_20_04_LTS;
			case UBUNTU_RASPBERRY_PI_2_VALUE: return UBUNTU_RASPBERRY_PI_2;
			case UBUNTU_RASPBERRY_PI_3_VALUE: return UBUNTU_RASPBERRY_PI_3;
			case UBUNTU_RASPBERRY_PI_4_VALUE: return UBUNTU_RASPBERRY_PI_4;
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
	private LinuxKind(int value, String name, String literal) {
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
	
} //LinuxKind
