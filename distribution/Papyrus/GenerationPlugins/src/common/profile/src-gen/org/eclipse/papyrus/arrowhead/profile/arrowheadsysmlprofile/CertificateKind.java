/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Certificate Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getCertificateKind()
 * @model
 * @generated
 */
public enum CertificateKind implements Enumerator {
	/**
	 * The '<em><b>Device</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE(0, "Device", "Device"),

	/**
	 * The '<em><b>System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	SYSTEM(1, "System", "System"),

	/**
	 * The '<em><b>Core Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORE_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	CORE_SERVICE(2, "CoreService", "CoreService"),

	/**
	 * The '<em><b>Application Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_SERVICE(3, "ApplicationService", "ApplicationService"),

	/**
	 * The '<em><b>Management Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANAGEMENT_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	MANAGEMENT_SERVICE(4, "ManagementService", "ManagementService");

	/**
	 * The '<em><b>Device</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE
	 * @model name="Device"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_VALUE = 0;

	/**
	 * The '<em><b>System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSTEM
	 * @model name="System"
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEM_VALUE = 1;

	/**
	 * The '<em><b>Core Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORE_SERVICE
	 * @model name="CoreService"
	 * @generated
	 * @ordered
	 */
	public static final int CORE_SERVICE_VALUE = 2;

	/**
	 * The '<em><b>Application Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_SERVICE
	 * @model name="ApplicationService"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_SERVICE_VALUE = 3;

	/**
	 * The '<em><b>Management Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANAGEMENT_SERVICE
	 * @model name="ManagementService"
	 * @generated
	 * @ordered
	 */
	public static final int MANAGEMENT_SERVICE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Certificate Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CertificateKind[] VALUES_ARRAY =
		new CertificateKind[] {
			DEVICE,
			SYSTEM,
			CORE_SERVICE,
			APPLICATION_SERVICE,
			MANAGEMENT_SERVICE,
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
			case SYSTEM_VALUE: return SYSTEM;
			case CORE_SERVICE_VALUE: return CORE_SERVICE;
			case APPLICATION_SERVICE_VALUE: return APPLICATION_SERVICE;
			case MANAGEMENT_SERVICE_VALUE: return MANAGEMENT_SERVICE;
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
