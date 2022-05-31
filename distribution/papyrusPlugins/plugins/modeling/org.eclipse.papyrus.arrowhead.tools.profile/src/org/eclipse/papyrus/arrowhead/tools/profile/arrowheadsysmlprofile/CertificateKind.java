/**
 */
package org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Certificate Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getCertificateKind()
 * @model
 * @generated
 */
public enum CertificateKind implements Enumerator {
	/**
	 * The '<em><b>DEVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE(0, "DEVICE", "DEVICE"),

	/**
	 * The '<em><b>APPLICATION SYSTEM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_SYSTEM(1, "APPLICATION_SYSTEM", "APPLICATION_SYSTEM"),

	/**
	 * The '<em><b>CORE SYSTEM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORE_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	CORE_SYSTEM(2, "CORE_SYSTEM", "CORE_SYSTEM"),

	/**
	 * The '<em><b>MANAGEMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANAGEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	MANAGEMENT(3, "MANAGEMENT", "MANAGEMENT"),

	/**
	 * The '<em><b>INTERCLOUD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERCLOUD_VALUE
	 * @generated
	 * @ordered
	 */
	INTERCLOUD(4, "INTERCLOUD", "INTERCLOUD");

	/**
	 * The '<em><b>DEVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_VALUE = 0;

	/**
	 * The '<em><b>APPLICATION SYSTEM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_SYSTEM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_SYSTEM_VALUE = 1;

	/**
	 * The '<em><b>CORE SYSTEM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORE_SYSTEM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CORE_SYSTEM_VALUE = 2;

	/**
	 * The '<em><b>MANAGEMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANAGEMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MANAGEMENT_VALUE = 3;

	/**
	 * The '<em><b>INTERCLOUD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERCLOUD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTERCLOUD_VALUE = 4;

	/**
	 * An array of all the '<em><b>Certificate Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CertificateKind[] VALUES_ARRAY =
		new CertificateKind[] {
			DEVICE,
			APPLICATION_SYSTEM,
			CORE_SYSTEM,
			MANAGEMENT,
			INTERCLOUD,
		};

	/**
	 * A public read-only list of all the '<em><b>Certificate Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CertificateKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Certificate Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CertificateKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CertificateKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Certificate Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CertificateKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CertificateKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Certificate Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CertificateKind get(int value) {
		switch (value) {
			case DEVICE_VALUE: return DEVICE;
			case APPLICATION_SYSTEM_VALUE: return APPLICATION_SYSTEM;
			case CORE_SYSTEM_VALUE: return CORE_SYSTEM;
			case MANAGEMENT_VALUE: return MANAGEMENT;
			case INTERCLOUD_VALUE: return INTERCLOUD;
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
	private CertificateKind(int value, String name, String literal) {
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
	
} //CertificateKind
