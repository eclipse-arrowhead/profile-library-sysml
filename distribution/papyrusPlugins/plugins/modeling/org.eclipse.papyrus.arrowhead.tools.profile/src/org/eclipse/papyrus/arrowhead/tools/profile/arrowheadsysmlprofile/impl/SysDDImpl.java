/**
 */
package org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.CertificateLevel;
import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SysDD;

import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.util.ArrowheadSysMLProfileValidator;

import org.eclipse.papyrus.sysml16.blocks.internal.impl.BlockImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sys DD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.impl.SysDDImpl#getCertificateLevel <em>Certificate Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SysDDImpl extends BlockImpl implements SysDD {
	/**
	 * The default value of the '{@link #getCertificateLevel() <em>Certificate Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificateLevel()
	 * @generated
	 * @ordered
	 */
	protected static final CertificateLevel CERTIFICATE_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCertificateLevel() <em>Certificate Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificateLevel()
	 * @generated
	 * @ordered
	 */
	protected CertificateLevel certificateLevel = CERTIFICATE_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SysDDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArrowheadSysMLProfilePackage.Literals.SYS_DD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CertificateLevel getCertificateLevel() {
		return certificateLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCertificateLevel(CertificateLevel newCertificateLevel) {
		CertificateLevel oldCertificateLevel = certificateLevel;
		certificateLevel = newCertificateLevel == null ? CERTIFICATE_LEVEL_EDEFAULT : newCertificateLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArrowheadSysMLProfilePackage.SYS_DD__CERTIFICATE_LEVEL, oldCertificateLevel, certificateLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean DeployedatDevice(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ArrowheadSysMLProfileValidator.DIAGNOSTIC_SOURCE,
						 ArrowheadSysMLProfileValidator.SYS_DD__DEPLOYEDAT_DEVICE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeployedatDevice", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean Constraint27(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ArrowheadSysMLProfileValidator.DIAGNOSTIC_SOURCE,
						 ArrowheadSysMLProfileValidator.SYS_DD__CONSTRAINT27,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "Constraint27", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArrowheadSysMLProfilePackage.SYS_DD__CERTIFICATE_LEVEL:
				return getCertificateLevel();
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
			case ArrowheadSysMLProfilePackage.SYS_DD__CERTIFICATE_LEVEL:
				setCertificateLevel((CertificateLevel)newValue);
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
			case ArrowheadSysMLProfilePackage.SYS_DD__CERTIFICATE_LEVEL:
				setCertificateLevel(CERTIFICATE_LEVEL_EDEFAULT);
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
			case ArrowheadSysMLProfilePackage.SYS_DD__CERTIFICATE_LEVEL:
				return certificateLevel != CERTIFICATE_LEVEL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ArrowheadSysMLProfilePackage.SYS_DD___DEPLOYEDAT_DEVICE__DIAGNOSTICCHAIN_MAP:
				return DeployedatDevice((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ArrowheadSysMLProfilePackage.SYS_DD___CONSTRAINT27__DIAGNOSTICCHAIN_MAP:
				return Constraint27((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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

} //SysDDImpl
