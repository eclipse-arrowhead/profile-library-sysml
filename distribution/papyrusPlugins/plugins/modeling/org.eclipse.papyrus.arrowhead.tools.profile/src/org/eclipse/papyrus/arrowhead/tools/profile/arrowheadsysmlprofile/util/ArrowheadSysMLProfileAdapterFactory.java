/**
 */
package org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.*;

import org.eclipse.papyrus.sysml16.blocks.Block;

import org.eclipse.papyrus.sysml16.portsandflows.FullPort;
import org.eclipse.papyrus.sysml16.portsandflows.InterfaceBlock;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage
 * @generated
 */
public class ArrowheadSysMLProfileAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArrowheadSysMLProfilePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrowheadSysMLProfileAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ArrowheadSysMLProfilePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrowheadSysMLProfileSwitch<Adapter> modelSwitch =
		new ArrowheadSysMLProfileSwitch<Adapter>() {
			@Override
			public Adapter caseSysDD(SysDD object) {
				return createSysDDAdapter();
			}
			@Override
			public Adapter caseIdentifiable(Identifiable object) {
				return createIdentifiableAdapter();
			}
			@Override
			public Adapter caseDeviceDesignDescription(DeviceDesignDescription object) {
				return createDeviceDesignDescriptionAdapter();
			}
			@Override
			public Adapter caseDeviceDesign(DeviceDesign object) {
				return createDeviceDesignAdapter();
			}
			@Override
			public Adapter caseLocalCloudDesign(LocalCloudDesign object) {
				return createLocalCloudDesignAdapter();
			}
			@Override
			public Adapter caseSysD(SysD object) {
				return createSysDAdapter();
			}
			@Override
			public Adapter caseLocalCLoudDesignDescription(LocalCLoudDesignDescription object) {
				return createLocalCLoudDesignDescriptionAdapter();
			}
			@Override
			public Adapter caseNetworkDesign(NetworkDesign object) {
				return createNetworkDesignAdapter();
			}
			@Override
			public Adapter caseNetworkDesignDescriptiion(NetworkDesignDescriptiion object) {
				return createNetworkDesignDescriptiionAdapter();
			}
			@Override
			public Adapter caseSystemofLocalCloudsDesign(SystemofLocalCloudsDesign object) {
				return createSystemofLocalCloudsDesignAdapter();
			}
			@Override
			public Adapter caseSystemofLocalCloudsDesignDescription(SystemofLocalCloudsDesignDescription object) {
				return createSystemofLocalCloudsDesignDescriptionAdapter();
			}
			@Override
			public Adapter caseConsumer(Consumer object) {
				return createConsumerAdapter();
			}
			@Override
			public Adapter caseProvider(Provider object) {
				return createProviderAdapter();
			}
			@Override
			public Adapter caseIDD(IDD object) {
				return createIDDAdapter();
			}
			@Override
			public Adapter caseSD(SD object) {
				return createSDAdapter();
			}
			@Override
			public Adapter caseMandatoryCoreSystemSysD(MandatoryCoreSystemSysD object) {
				return createMandatoryCoreSystemSysDAdapter();
			}
			@Override
			public Adapter caseSupportCoreSystemSysD(SupportCoreSystemSysD object) {
				return createSupportCoreSystemSysDAdapter();
			}
			@Override
			public Adapter caseApplicationSysD(ApplicationSysD object) {
				return createApplicationSysDAdapter();
			}
			@Override
			public Adapter caseMandatoryCoreSystemSysDD(MandatoryCoreSystemSysDD object) {
				return createMandatoryCoreSystemSysDDAdapter();
			}
			@Override
			public Adapter caseSupportCoreSystemSysDD(SupportCoreSystemSysDD object) {
				return createSupportCoreSystemSysDDAdapter();
			}
			@Override
			public Adapter caseApplicationSysDD(ApplicationSysDD object) {
				return createApplicationSysDDAdapter();
			}
			@Override
			public Adapter caseDataSemantics(DataSemantics object) {
				return createDataSemanticsAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseNetworkDesignDescription(NetworkDesignDescription object) {
				return createNetworkDesignDescriptionAdapter();
			}
			@Override
			public Adapter caseDeploy(Deploy object) {
				return createDeployAdapter();
			}
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter caseFullPort(FullPort object) {
				return createFullPortAdapter();
			}
			@Override
			public Adapter caseInterfaceBlock(InterfaceBlock object) {
				return createInterfaceBlockAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SysDD <em>Sys DD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SysDD
	 * @generated
	 */
	public Adapter createSysDDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.Identifiable
	 * @generated
	 */
	public Adapter createIdentifiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DeviceDesignDescription <em>Device Design Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DeviceDesignDescription
	 * @generated
	 */
	public Adapter createDeviceDesignDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DeviceDesign <em>Device Design</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DeviceDesign
	 * @generated
	 */
	public Adapter createDeviceDesignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.LocalCloudDesign <em>Local Cloud Design</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.LocalCloudDesign
	 * @generated
	 */
	public Adapter createLocalCloudDesignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SysD <em>Sys D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SysD
	 * @generated
	 */
	public Adapter createSysDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.LocalCLoudDesignDescription <em>Local CLoud Design Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.LocalCLoudDesignDescription
	 * @generated
	 */
	public Adapter createLocalCLoudDesignDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.NetworkDesign <em>Network Design</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.NetworkDesign
	 * @generated
	 */
	public Adapter createNetworkDesignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.NetworkDesignDescriptiion <em>Network Design Descriptiion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.NetworkDesignDescriptiion
	 * @generated
	 */
	public Adapter createNetworkDesignDescriptiionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SystemofLocalCloudsDesign <em>Systemof Local Clouds Design</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SystemofLocalCloudsDesign
	 * @generated
	 */
	public Adapter createSystemofLocalCloudsDesignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SystemofLocalCloudsDesignDescription <em>Systemof Local Clouds Design Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SystemofLocalCloudsDesignDescription
	 * @generated
	 */
	public Adapter createSystemofLocalCloudsDesignDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.Consumer <em>Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.Consumer
	 * @generated
	 */
	public Adapter createConsumerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.Provider
	 * @generated
	 */
	public Adapter createProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.IDD <em>IDD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.IDD
	 * @generated
	 */
	public Adapter createIDDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SD <em>SD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SD
	 * @generated
	 */
	public Adapter createSDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.MandatoryCoreSystemSysD <em>Mandatory Core System Sys D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.MandatoryCoreSystemSysD
	 * @generated
	 */
	public Adapter createMandatoryCoreSystemSysDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SupportCoreSystemSysD <em>Support Core System Sys D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SupportCoreSystemSysD
	 * @generated
	 */
	public Adapter createSupportCoreSystemSysDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ApplicationSysD <em>Application Sys D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ApplicationSysD
	 * @generated
	 */
	public Adapter createApplicationSysDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.MandatoryCoreSystemSysDD <em>Mandatory Core System Sys DD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.MandatoryCoreSystemSysDD
	 * @generated
	 */
	public Adapter createMandatoryCoreSystemSysDDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SupportCoreSystemSysDD <em>Support Core System Sys DD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.SupportCoreSystemSysDD
	 * @generated
	 */
	public Adapter createSupportCoreSystemSysDDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ApplicationSysDD <em>Application Sys DD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.ApplicationSysDD
	 * @generated
	 */
	public Adapter createApplicationSysDDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DataSemantics <em>Data Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.DataSemantics
	 * @generated
	 */
	public Adapter createDataSemanticsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.NetworkDesignDescription <em>Network Design Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.NetworkDesignDescription
	 * @generated
	 */
	public Adapter createNetworkDesignDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.Deploy <em>Deploy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.tools.profile.arrowheadsysmlprofile.Deploy
	 * @generated
	 */
	public Adapter createDeployAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.sysml16.blocks.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.sysml16.blocks.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.sysml16.portsandflows.FullPort <em>Full Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.FullPort
	 * @generated
	 */
	public Adapter createFullPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.sysml16.portsandflows.InterfaceBlock <em>Interface Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.sysml16.portsandflows.InterfaceBlock
	 * @generated
	 */
	public Adapter createInterfaceBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ArrowheadSysMLProfileAdapterFactory
