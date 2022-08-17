/**
 */
package org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.*;

import org.eclipse.papyrus.sysml16.blocks.Block;

import org.eclipse.papyrus.sysml16.portsandflows.FullPort;
import org.eclipse.papyrus.sysml16.portsandflows.InterfaceBlock;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage
 * @generated
 */
public class ArrowheadSysMLProfileSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArrowheadSysMLProfilePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrowheadSysMLProfileSwitch() {
		if (modelPackage == null) {
			modelPackage = ArrowheadSysMLProfilePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ArrowheadSysMLProfilePackage.SYS_DD: {
				SysDD sysDD = (SysDD)theEObject;
				T result = caseSysDD(sysDD);
				if (result == null) result = caseBlock(sysDD);
				if (result == null) result = caseIdentifiable(sysDD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.IDENTIFIABLE: {
				Identifiable identifiable = (Identifiable)theEObject;
				T result = caseIdentifiable(identifiable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN_DESCRIPTION: {
				DeviceDesignDescription deviceDesignDescription = (DeviceDesignDescription)theEObject;
				T result = caseDeviceDesignDescription(deviceDesignDescription);
				if (result == null) result = caseBlock(deviceDesignDescription);
				if (result == null) result = caseIdentifiable(deviceDesignDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.DEVICE_DESIGN: {
				DeviceDesign deviceDesign = (DeviceDesign)theEObject;
				T result = caseDeviceDesign(deviceDesign);
				if (result == null) result = caseBlock(deviceDesign);
				if (result == null) result = caseIdentifiable(deviceDesign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.LOCAL_CLOUD_DESIGN: {
				LocalCloudDesign localCloudDesign = (LocalCloudDesign)theEObject;
				T result = caseLocalCloudDesign(localCloudDesign);
				if (result == null) result = caseBlock(localCloudDesign);
				if (result == null) result = caseIdentifiable(localCloudDesign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.SYS_D: {
				SysD sysD = (SysD)theEObject;
				T result = caseSysD(sysD);
				if (result == null) result = caseBlock(sysD);
				if (result == null) result = caseIdentifiable(sysD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.LOCAL_CLOUD_DESIGN_DESCRIPTION: {
				LocalCLoudDesignDescription localCLoudDesignDescription = (LocalCLoudDesignDescription)theEObject;
				T result = caseLocalCLoudDesignDescription(localCLoudDesignDescription);
				if (result == null) result = caseBlock(localCLoudDesignDescription);
				if (result == null) result = caseIdentifiable(localCLoudDesignDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.NETWORK_DESIGN: {
				NetworkDesign networkDesign = (NetworkDesign)theEObject;
				T result = caseNetworkDesign(networkDesign);
				if (result == null) result = caseBlock(networkDesign);
				if (result == null) result = caseIdentifiable(networkDesign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.NETWORK_DESIGN_DESCRIPTIION: {
				NetworkDesignDescriptiion networkDesignDescriptiion = (NetworkDesignDescriptiion)theEObject;
				T result = caseNetworkDesignDescriptiion(networkDesignDescriptiion);
				if (result == null) result = caseBlock(networkDesignDescriptiion);
				if (result == null) result = caseIdentifiable(networkDesignDescriptiion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_DESIGN: {
				SystemofLocalCloudsDesign systemofLocalCloudsDesign = (SystemofLocalCloudsDesign)theEObject;
				T result = caseSystemofLocalCloudsDesign(systemofLocalCloudsDesign);
				if (result == null) result = caseBlock(systemofLocalCloudsDesign);
				if (result == null) result = caseIdentifiable(systemofLocalCloudsDesign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.SYSTEMOF_LOCAL_CLOUDS_DESIGN_DESCRIPTION: {
				SystemofLocalCloudsDesignDescription systemofLocalCloudsDesignDescription = (SystemofLocalCloudsDesignDescription)theEObject;
				T result = caseSystemofLocalCloudsDesignDescription(systemofLocalCloudsDesignDescription);
				if (result == null) result = caseBlock(systemofLocalCloudsDesignDescription);
				if (result == null) result = caseIdentifiable(systemofLocalCloudsDesignDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.CONSUMER: {
				Consumer consumer = (Consumer)theEObject;
				T result = caseConsumer(consumer);
				if (result == null) result = caseFullPort(consumer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.PROVIDER: {
				Provider provider = (Provider)theEObject;
				T result = caseProvider(provider);
				if (result == null) result = caseFullPort(provider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.IDD: {
				IDD idd = (IDD)theEObject;
				T result = caseIDD(idd);
				if (result == null) result = caseSD(idd);
				if (result == null) result = caseInterfaceBlock(idd);
				if (result == null) result = caseBlock(idd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.SD: {
				SD sd = (SD)theEObject;
				T result = caseSD(sd);
				if (result == null) result = caseInterfaceBlock(sd);
				if (result == null) result = caseBlock(sd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.MANDATORY_CORE_SYSTEM_SYS_D: {
				MandatoryCoreSystemSysD mandatoryCoreSystemSysD = (MandatoryCoreSystemSysD)theEObject;
				T result = caseMandatoryCoreSystemSysD(mandatoryCoreSystemSysD);
				if (result == null) result = caseSysD(mandatoryCoreSystemSysD);
				if (result == null) result = caseBlock(mandatoryCoreSystemSysD);
				if (result == null) result = caseIdentifiable(mandatoryCoreSystemSysD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.SUPPORT_CORE_SYSTEM_SYS_D: {
				SupportCoreSystemSysD supportCoreSystemSysD = (SupportCoreSystemSysD)theEObject;
				T result = caseSupportCoreSystemSysD(supportCoreSystemSysD);
				if (result == null) result = caseSysD(supportCoreSystemSysD);
				if (result == null) result = caseBlock(supportCoreSystemSysD);
				if (result == null) result = caseIdentifiable(supportCoreSystemSysD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.APPLICATION_SYS_D: {
				ApplicationSysD applicationSysD = (ApplicationSysD)theEObject;
				T result = caseApplicationSysD(applicationSysD);
				if (result == null) result = caseSysD(applicationSysD);
				if (result == null) result = caseBlock(applicationSysD);
				if (result == null) result = caseIdentifiable(applicationSysD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.MANDATORY_CORE_SYSTEM_SYS_DD: {
				MandatoryCoreSystemSysDD mandatoryCoreSystemSysDD = (MandatoryCoreSystemSysDD)theEObject;
				T result = caseMandatoryCoreSystemSysDD(mandatoryCoreSystemSysDD);
				if (result == null) result = caseSysDD(mandatoryCoreSystemSysDD);
				if (result == null) result = caseBlock(mandatoryCoreSystemSysDD);
				if (result == null) result = caseIdentifiable(mandatoryCoreSystemSysDD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.SUPPORT_CORE_SYSTEM_SYS_DD: {
				SupportCoreSystemSysDD supportCoreSystemSysDD = (SupportCoreSystemSysDD)theEObject;
				T result = caseSupportCoreSystemSysDD(supportCoreSystemSysDD);
				if (result == null) result = caseSysDD(supportCoreSystemSysDD);
				if (result == null) result = caseBlock(supportCoreSystemSysDD);
				if (result == null) result = caseIdentifiable(supportCoreSystemSysDD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.APPLICATION_SYS_DD: {
				ApplicationSysDD applicationSysDD = (ApplicationSysDD)theEObject;
				T result = caseApplicationSysDD(applicationSysDD);
				if (result == null) result = caseSysDD(applicationSysDD);
				if (result == null) result = caseBlock(applicationSysDD);
				if (result == null) result = caseIdentifiable(applicationSysDD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.DATA_SEMANTICS: {
				DataSemantics dataSemantics = (DataSemantics)theEObject;
				T result = caseDataSemantics(dataSemantics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.NETWORK_DESIGN_DESCRIPTION: {
				NetworkDesignDescription networkDesignDescription = (NetworkDesignDescription)theEObject;
				T result = caseNetworkDesignDescription(networkDesignDescription);
				if (result == null) result = caseInterfaceBlock(networkDesignDescription);
				if (result == null) result = caseBlock(networkDesignDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArrowheadSysMLProfilePackage.DEPLOY: {
				Deploy deploy = (Deploy)theEObject;
				T result = caseDeploy(deploy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sys DD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sys DD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSysDD(SysDD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiable(Identifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Design Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Design Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceDesignDescription(DeviceDesignDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Design</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Design</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceDesign(DeviceDesign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Cloud Design</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Cloud Design</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalCloudDesign(LocalCloudDesign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sys D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sys D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSysD(SysD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local CLoud Design Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local CLoud Design Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalCLoudDesignDescription(LocalCLoudDesignDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Design</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Design</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkDesign(NetworkDesign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Design Descriptiion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Design Descriptiion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkDesignDescriptiion(NetworkDesignDescriptiion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Systemof Local Clouds Design</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Systemof Local Clouds Design</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemofLocalCloudsDesign(SystemofLocalCloudsDesign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Systemof Local Clouds Design Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Systemof Local Clouds Design Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemofLocalCloudsDesignDescription(SystemofLocalCloudsDesignDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsumer(Consumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvider(Provider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IDD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDD(IDD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSD(SD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mandatory Core System Sys D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mandatory Core System Sys D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMandatoryCoreSystemSysD(MandatoryCoreSystemSysD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Support Core System Sys D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Support Core System Sys D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportCoreSystemSysD(SupportCoreSystemSysD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Sys D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Sys D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationSysD(ApplicationSysD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mandatory Core System Sys DD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mandatory Core System Sys DD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMandatoryCoreSystemSysDD(MandatoryCoreSystemSysDD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Support Core System Sys DD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Support Core System Sys DD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportCoreSystemSysDD(SupportCoreSystemSysDD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Sys DD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Sys DD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationSysDD(ApplicationSysDD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Semantics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Semantics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSemantics(DataSemantics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Design Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Design Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkDesignDescription(NetworkDesignDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deploy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deploy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploy(Deploy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Full Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Full Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFullPort(FullPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceBlock(InterfaceBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ArrowheadSysMLProfileSwitch
