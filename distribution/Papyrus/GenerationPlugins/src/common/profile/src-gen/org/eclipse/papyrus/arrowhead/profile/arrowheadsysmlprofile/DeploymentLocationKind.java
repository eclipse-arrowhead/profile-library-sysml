/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Deployment Location Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getDeploymentLocationKind()
 * @model
 * @generated
 */
public enum DeploymentLocationKind implements Enumerator {
	/**
	 * The '<em><b>Coordinates</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COORDINATES_VALUE
	 * @generated
	 * @ordered
	 */
	COORDINATES(0, "Coordinates", "Coordinates"),

	/**
	 * The '<em><b>Location ID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCATION_ID_VALUE
	 * @generated
	 * @ordered
	 */
	LOCATION_ID(1, "LocationID", "LocationID"),

	/**
	 * The '<em><b>Power ID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_ID_VALUE
	 * @generated
	 * @ordered
	 */
	POWER_ID(2, "PowerID", "PowerID"),

	/**
	 * The '<em><b>Network ID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETWORK_ID_VALUE
	 * @generated
	 * @ordered
	 */
	NETWORK_ID(3, "NetworkID", "NetworkID");

	/**
	 * The '<em><b>Coordinates</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COORDINATES
	 * @model name="Coordinates"
	 * @generated
	 * @ordered
	 */
	public static final int COORDINATES_VALUE = 0;

	/**
	 * The '<em><b>Location ID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCATION_ID
	 * @model name="LocationID"
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION_ID_VALUE = 1;

	/**
	 * The '<em><b>Power ID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_ID
	 * @model name="PowerID"
	 * @generated
	 * @ordered
	 */
	public static final int POWER_ID_VALUE = 2;

	/**
	 * The '<em><b>Network ID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETWORK_ID
	 * @model name="NetworkID"
	 * @generated
	 * @ordered
	 */
	public static final int NETWORK_ID_VALUE = 3;

	/**
	 * An array of all the '<em><b>Deployment Location Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DeploymentLocationKind[] VALUES_ARRAY =
		new DeploymentLocationKind[] {
			COORDINATES,
			LOCATION_ID,
			POWER_ID,
			NETWORK_ID,
		};

	/**
	 * A public read-only list of all the '<em><b>Deployment Location Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DeploymentLocationKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Deployment Location Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeploymentLocationKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeploymentLocationKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Deployment Location Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeploymentLocationKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeploymentLocationKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Deployment Location Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeploymentLocationKind get(int value) {
		switch (value) {
			case COORDINATES_VALUE: return COORDINATES;
			case LOCATION_ID_VALUE: return LOCATION_ID;
			case POWER_ID_VALUE: return POWER_ID;
			case NETWORK_ID_VALUE: return NETWORK_ID;
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
	private DeploymentLocationKind(int value, String name, String literal) {
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
	
} //DeploymentLocationKind
