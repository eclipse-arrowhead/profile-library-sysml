/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CertificateKind;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceDesignDesciption;
import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkDesignDescriptiion;

import org.eclipse.papyrus.sysml16.blocks.internal.impl.BlockImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Design Desciption</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceDesignDesciptionImpl#getCertificateLevel <em>Certificate Level</em>}</li>
 *   <li>{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.impl.DeviceDesignDesciptionImpl#getNetworkDesignDescription <em>Network Design Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceDesignDesciptionImpl extends BlockImpl implements DeviceDesignDesciption {
	/**
	 * The default value of the '{@link #getCertificateLevel() <em>Certificate Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificateLevel()
	 * @generated
	 * @ordered
	 */
	protected static final CertificateKind CERTIFICATE_LEVEL_EDEFAULT = CertificateKind.DEVICE;

	/**
	 * The cached value of the '{@link #getCertificateLevel() <em>Certificate Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificateLevel()
	 * @generated
	 * @ordered
	 */
	protected CertificateKind certificateLevel = CERTIFICATE_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNetworkDesignDescription() <em>Network Design Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkDesignDescription()
	 * @generated
	 * @ordered
	 */
	protected NetworkDesignDescriptiion networkDesignDescription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceDesignDesciptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadSysMLProfilePackage.Literals.DEVICE_DESIGN_DESCIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CertificateKind getCertificateLevel() {
		return certificateLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCertificateLevel(CertificateKind newCertificateLevel) {
		CertificateKind oldCertificateLevel = certificateLevel;
		certificateLevel = newCertificateLevel == null ? CERTIFICATE_LEVEL_EDEFAULT : newCertificateLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCIPTION__CERTIFICATE_LEVEL, oldCertificateLevel, certificateLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkDesignDescriptiion getNetworkDesignDescription() {
		if (networkDesignDescription != null && networkDesignDescription.eIsProxy()) {
			InternalEObject oldNetworkDesignDescription = (InternalEObject)networkDesignDescription;
			networkDesignDescription = (NetworkDesignDescriptiion)eResolveProxy(oldNetworkDesignDescription);
			if (networkDesignDescription != oldNetworkDesignDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCIPTION__NETWORK_DESIGN_DESCRIPTION, oldNetworkDesignDescription, networkDesignDescription));
			}
		}
		return networkDesignDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkDesignDescriptiion basicGetNetworkDesignDescription() {
		return networkDesignDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkDesignDescription(NetworkDesignDescriptiion newNetworkDesignDescription) {
		NetworkDesignDescriptiion oldNetworkDesignDescription = networkDesignDescription;
		networkDesignDescription = newNetworkDesignDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCIPTION__NETWORK_DESIGN_DESCRIPTION, oldNetworkDesignDescription, networkDesignDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCIPTION__CERTIFICATE_LEVEL:
				return getCertificateLevel();
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCIPTION__NETWORK_DESIGN_DESCRIPTION:
				if (resolve) return getNetworkDesignDescription();
				return basicGetNetworkDesignDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCIPTION__CERTIFICATE_LEVEL:
				setCertificateLevel((CertificateKind)newValue);
				return;
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCIPTION__NETWORK_DESIGN_DESCRIPTION:
				setNetworkDesignDescription((NetworkDesignDescriptiion)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCIPTION__CERTIFICATE_LEVEL:
				setCertificateLevel(CERTIFICATE_LEVEL_EDEFAULT);
				return;
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCIPTION__NETWORK_DESIGN_DESCRIPTION:
				setNetworkDesignDescription((NetworkDesignDescriptiion)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCIPTION__CERTIFICATE_LEVEL:
				return certificateLevel != CERTIFICATE_LEVEL_EDEFAULT;
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCIPTION__NETWORK_DESIGN_DESCRIPTION:
				return networkDesignDescription != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (CertificateLevel: ");
		result.append(certificateLevel);
		result.append(')');
		return result.toString();
	}

} //DeviceDesignDesciptionImpl
