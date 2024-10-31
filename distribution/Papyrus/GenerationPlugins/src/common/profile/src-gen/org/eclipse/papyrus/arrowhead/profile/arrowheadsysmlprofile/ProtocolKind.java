/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Protocol Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage#getProtocolKind()
 * @model
 * @generated
 */
public enum ProtocolKind implements Enumerator {
	/**
	 * The '<em><b>HTTP 09</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP_09_VALUE
	 * @generated
	 * @ordered
	 */
	HTTP_09(0, "HTTP_0_9", "HTTP_0_9"),

	/**
	 * The '<em><b>HTTP 10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP_10_VALUE
	 * @generated
	 * @ordered
	 */
	HTTP_10(1, "HTTP_1_0", "HTTP_1_0"),

	/**
	 * The '<em><b>HTTP 11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP_11_VALUE
	 * @generated
	 * @ordered
	 */
	HTTP_11(2, "HTTP_1_1", "HTTP_1_1"),

	/**
	 * The '<em><b>HTTP 20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP_20_VALUE
	 * @generated
	 * @ordered
	 */
	HTTP_20(3, "HTTP_2_0", "HTTP_2_0"),

	/**
	 * The '<em><b>Co AP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CO_AP_VALUE
	 * @generated
	 * @ordered
	 */
	CO_AP(4, "CoAP", "CoAP"),

	/**
	 * The '<em><b>Co AP TCP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CO_AP_TCP_VALUE
	 * @generated
	 * @ordered
	 */
	CO_AP_TCP(5, "CoAP_TCP", "CoAP_TCP"),

	/**
	 * The '<em><b>Co APS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CO_APS_VALUE
	 * @generated
	 * @ordered
	 */
	CO_APS(6, "CoAPS", "CoAPS"),

	/**
	 * The '<em><b>Co APS TCP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CO_APS_TCP_VALUE
	 * @generated
	 * @ordered
	 */
	CO_APS_TCP(7, "CoAPS_TCP", "CoAPS_TCP"),

	/**
	 * The '<em><b>MQTT 311</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MQTT_311_VALUE
	 * @generated
	 * @ordered
	 */
	MQTT_311(8, "MQTT_3_1_1", "MQTT_3_1_1"),

	/**
	 * The '<em><b>MQTT 50</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MQTT_50_VALUE
	 * @generated
	 * @ordered
	 */
	MQTT_50(9, "MQTT_5_0", "MQTT_5_0"),

	/**
	 * The '<em><b>Websocket</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEBSOCKET_VALUE
	 * @generated
	 * @ordered
	 */
	WEBSOCKET(10, "Websocket", "Websocket"),

	/**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(11, "OTHER", "OTHER");

	/**
	 * The '<em><b>HTTP 09</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP_09
	 * @model name="HTTP_0_9"
	 * @generated
	 * @ordered
	 */
	public static final int HTTP_09_VALUE = 0;

	/**
	 * The '<em><b>HTTP 10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP_10
	 * @model name="HTTP_1_0"
	 * @generated
	 * @ordered
	 */
	public static final int HTTP_10_VALUE = 1;

	/**
	 * The '<em><b>HTTP 11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP_11
	 * @model name="HTTP_1_1"
	 * @generated
	 * @ordered
	 */
	public static final int HTTP_11_VALUE = 2;

	/**
	 * The '<em><b>HTTP 20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP_20
	 * @model name="HTTP_2_0"
	 * @generated
	 * @ordered
	 */
	public static final int HTTP_20_VALUE = 3;

	/**
	 * The '<em><b>Co AP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CO_AP
	 * @model name="CoAP"
	 * @generated
	 * @ordered
	 */
	public static final int CO_AP_VALUE = 4;

	/**
	 * The '<em><b>Co AP TCP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CO_AP_TCP
	 * @model name="CoAP_TCP"
	 * @generated
	 * @ordered
	 */
	public static final int CO_AP_TCP_VALUE = 5;

	/**
	 * The '<em><b>Co APS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CO_APS
	 * @model name="CoAPS"
	 * @generated
	 * @ordered
	 */
	public static final int CO_APS_VALUE = 6;

	/**
	 * The '<em><b>Co APS TCP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CO_APS_TCP
	 * @model name="CoAPS_TCP"
	 * @generated
	 * @ordered
	 */
	public static final int CO_APS_TCP_VALUE = 7;

	/**
	 * The '<em><b>MQTT 311</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MQTT_311
	 * @model name="MQTT_3_1_1"
	 * @generated
	 * @ordered
	 */
	public static final int MQTT_311_VALUE = 8;

	/**
	 * The '<em><b>MQTT 50</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MQTT_50
	 * @model name="MQTT_5_0"
	 * @generated
	 * @ordered
	 */
	public static final int MQTT_50_VALUE = 9;

	/**
	 * The '<em><b>Websocket</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEBSOCKET
	 * @model name="Websocket"
	 * @generated
	 * @ordered
	 */
	public static final int WEBSOCKET_VALUE = 10;

	/**
	 * The '<em><b>OTHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 11;

	/**
	 * An array of all the '<em><b>Protocol Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProtocolKind[] VALUES_ARRAY =
		new ProtocolKind[] {
			HTTP_09,
			HTTP_10,
			HTTP_11,
			HTTP_20,
			CO_AP,
			CO_AP_TCP,
			CO_APS,
			CO_APS_TCP,
			MQTT_311,
			MQTT_50,
			WEBSOCKET,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Protocol Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProtocolKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Protocol Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProtocolKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProtocolKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Protocol Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProtocolKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProtocolKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Protocol Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProtocolKind get(int value) {
		switch (value) {
			case HTTP_09_VALUE: return HTTP_09;
			case HTTP_10_VALUE: return HTTP_10;
			case HTTP_11_VALUE: return HTTP_11;
			case HTTP_20_VALUE: return HTTP_20;
			case CO_AP_VALUE: return CO_AP;
			case CO_AP_TCP_VALUE: return CO_AP_TCP;
			case CO_APS_VALUE: return CO_APS;
			case CO_APS_TCP_VALUE: return CO_APS_TCP;
			case MQTT_311_VALUE: return MQTT_311;
			case MQTT_50_VALUE: return MQTT_50;
			case WEBSOCKET_VALUE: return WEBSOCKET;
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
	private ProtocolKind(int value, String name, String literal) {
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
	
} //ProtocolKind
