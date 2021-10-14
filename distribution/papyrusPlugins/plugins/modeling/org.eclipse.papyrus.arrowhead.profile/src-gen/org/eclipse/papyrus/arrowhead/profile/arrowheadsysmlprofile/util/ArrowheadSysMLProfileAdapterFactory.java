/**
 */
package org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.*;

import org.eclipse.papyrus.sysml16.blocks.Block;

import org.eclipse.papyrus.sysml16.portsandflows.InterfaceBlock;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ArrowheadSysMLProfilePackage
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
			public Adapter caseSysD(SysD object) {
				return createSysDAdapter();
			}
			@Override
			public Adapter caseDeviceDesign(DeviceDesign object) {
				return createDeviceDesignAdapter();
			}
			@Override
			public Adapter caseNetworkDesign(NetworkDesign object) {
				return createNetworkDesignAdapter();
			}
			@Override
			public Adapter caseSysDD(SysDD object) {
				return createSysDDAdapter();
			}
			@Override
			public Adapter caseDeviceDesignDesciption(DeviceDesignDesciption object) {
				return createDeviceDesignDesciptionAdapter();
			}
			@Override
			public Adapter caseNetworkDesignDescriptiion(NetworkDesignDescriptiion object) {
				return createNetworkDesignDescriptiionAdapter();
			}
			@Override
			public Adapter caseInterfaceDesignDescription(InterfaceDesignDescription object) {
				return createInterfaceDesignDescriptionAdapter();
			}
			@Override
			public Adapter caseServiceDescription(ServiceDescription object) {
				return createServiceDescriptionAdapter();
			}
			@Override
			public Adapter caseSubsetOf(SubsetOf object) {
				return createSubsetOfAdapter();
			}
			@Override
			public Adapter caseDevice(Device object) {
				return createDeviceAdapter();
			}
			@Override
			public Adapter caseMetaDataEntry(MetaDataEntry object) {
				return createMetaDataEntryAdapter();
			}
			@Override
			public Adapter caseDeployedService(DeployedService object) {
				return createDeployedServiceAdapter();
			}
			@Override
			public Adapter caseLocalCloudDesign(LocalCloudDesign object) {
				return createLocalCloudDesignAdapter();
			}
			@Override
			public Adapter caseLocalCLoudDesignDescription(LocalCLoudDesignDescription object) {
				return createLocalCLoudDesignDescriptionAdapter();
			}
			@Override
			public Adapter caseDeployedDevice(DeployedDevice object) {
				return createDeployedDeviceAdapter();
			}
			@Override
			public Adapter caseDeployedLocalCloud(DeployedLocalCloud object) {
				return createDeployedLocalCloudAdapter();
			}
			@Override
			public Adapter caseDataSemantics(DataSemantics object) {
				return createDataSemanticsAdapter();
			}
			@Override
			public Adapter caseDeployedEntity(DeployedEntity object) {
				return createDeployedEntityAdapter();
			}
			@Override
			public Adapter caseServiceRegistryForm(ServiceRegistryForm object) {
				return createServiceRegistryFormAdapter();
			}
			@Override
			public Adapter caseSystemRegistryForm(SystemRegistryForm object) {
				return createSystemRegistryFormAdapter();
			}
			@Override
			public Adapter caseDeviceRegistryForm(DeviceRegistryForm object) {
				return createDeviceRegistryFormAdapter();
			}
			@Override
			public Adapter caseCertificateCreationForm(CertificateCreationForm object) {
				return createCertificateCreationFormAdapter();
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
			public Adapter caseNetwork(Network object) {
				return createNetworkAdapter();
			}
			@Override
			public Adapter caseApplicationSysDDHTTP(ApplicationSysDDHTTP object) {
				return createApplicationSysDDHTTPAdapter();
			}
			@Override
			public Adapter caseSystemofLocalCloudsDeployed(SystemofLocalCloudsDeployed object) {
				return createSystemofLocalCloudsDeployedAdapter();
			}
			@Override
			public Adapter caseLocalCloudDeployed(LocalCloudDeployed object) {
				return createLocalCloudDeployedAdapter();
			}
			@Override
			public Adapter caseDeviceDeployed(DeviceDeployed object) {
				return createDeviceDeployedAdapter();
			}
			@Override
			public Adapter caseNetworkDeployed(NetworkDeployed object) {
				return createNetworkDeployedAdapter();
			}
			@Override
			public Adapter caseSDDD(SDDD object) {
				return createSDDDAdapter();
			}
			@Override
			public Adapter caseMQTT_topic(MQTT_topic object) {
				return createMQTT_topicAdapter();
			}
			@Override
			public Adapter caseHttpOperation(HttpOperation object) {
				return createHttpOperationAdapter();
			}
			@Override
			public Adapter caseSystemRequirements(SystemRequirements object) {
				return createSystemRequirementsAdapter();
			}
			@Override
			public Adapter caseNetworkRequirements(NetworkRequirements object) {
				return createNetworkRequirementsAdapter();
			}
			@Override
			public Adapter caseLocaCloudRequirements(LocaCloudRequirements object) {
				return createLocaCloudRequirementsAdapter();
			}
			@Override
			public Adapter caseSystemofLocalCloudsRequirements(SystemofLocalCloudsRequirements object) {
				return createSystemofLocalCloudsRequirementsAdapter();
			}
			@Override
			public Adapter caseDeviceRequirements(DeviceRequirements object) {
				return createDeviceRequirementsAdapter();
			}
			@Override
			public Adapter caseSystemofLocalCloudsMaintenance(SystemofLocalCloudsMaintenance object) {
				return createSystemofLocalCloudsMaintenanceAdapter();
			}
			@Override
			public Adapter caseSystemofLocalCloudsEvolution(SystemofLocalCloudsEvolution object) {
				return createSystemofLocalCloudsEvolutionAdapter();
			}
			@Override
			public Adapter caseLocalCloudMaintenance(LocalCloudMaintenance object) {
				return createLocalCloudMaintenanceAdapter();
			}
			@Override
			public Adapter caseLocalCloudEvolution(LocalCloudEvolution object) {
				return createLocalCloudEvolutionAdapter();
			}
			@Override
			public Adapter caseSysMaintenance(SysMaintenance object) {
				return createSysMaintenanceAdapter();
			}
			@Override
			public Adapter caseSysImplementation(SysImplementation object) {
				return createSysImplementationAdapter();
			}
			@Override
			public Adapter caseLocalCLoudImplementation(LocalCLoudImplementation object) {
				return createLocalCLoudImplementationAdapter();
			}
			@Override
			public Adapter caseSystemofLocalCloudsImplementation(SystemofLocalCloudsImplementation object) {
				return createSystemofLocalCloudsImplementationAdapter();
			}
			@Override
			public Adapter caseDeviceImplementation(DeviceImplementation object) {
				return createDeviceImplementationAdapter();
			}
			@Override
			public Adapter caseNetworkImplementation(NetworkImplementation object) {
				return createNetworkImplementationAdapter();
			}
			@Override
			public Adapter caseDeviceMaintenance(DeviceMaintenance object) {
				return createDeviceMaintenanceAdapter();
			}
			@Override
			public Adapter caseNetworkMaintenance(NetworkMaintenance object) {
				return createNetworkMaintenanceAdapter();
			}
			@Override
			public Adapter caseSysEvolution(SysEvolution object) {
				return createSysEvolutionAdapter();
			}
			@Override
			public Adapter caseDeviceEvolution(DeviceEvolution object) {
				return createDeviceEvolutionAdapter();
			}
			@Override
			public Adapter caseNetworkEvolution(NetworkEvolution object) {
				return createNetworkEvolutionAdapter();
			}
			@Override
			public Adapter caseDeployment(Deployment object) {
				return createDeploymentAdapter();
			}
			@Override
			public Adapter caseRequirements(Requirements object) {
				return createRequirementsAdapter();
			}
			@Override
			public Adapter caseFunctionalDesign(FunctionalDesign object) {
				return createFunctionalDesignAdapter();
			}
			@Override
			public Adapter caseProcurementEngineering(ProcurementEngineering object) {
				return createProcurementEngineeringAdapter();
			}
			@Override
			public Adapter caseMaintenance(Maintenance object) {
				return createMaintenanceAdapter();
			}
			@Override
			public Adapter caseEvolution(Evolution object) {
				return createEvolutionAdapter();
			}
			@Override
			public Adapter caseSysDeployed(SysDeployed object) {
				return createSysDeployedAdapter();
			}
			@Override
			public Adapter caseChoreographyDefinition(ChoreographyDefinition object) {
				return createChoreographyDefinitionAdapter();
			}
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysD <em>Sys D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysD
	 * @generated
	 */
	public Adapter createSysDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceDesign <em>Device Design</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceDesign
	 * @generated
	 */
	public Adapter createDeviceDesignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkDesign <em>Network Design</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkDesign
	 * @generated
	 */
	public Adapter createNetworkDesignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysDD <em>Sys DD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysDD
	 * @generated
	 */
	public Adapter createSysDDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceDesignDesciption <em>Device Design Desciption</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceDesignDesciption
	 * @generated
	 */
	public Adapter createDeviceDesignDesciptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkDesignDescriptiion <em>Network Design Descriptiion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkDesignDescriptiion
	 * @generated
	 */
	public Adapter createNetworkDesignDescriptiionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription <em>Interface Design Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.InterfaceDesignDescription
	 * @generated
	 */
	public Adapter createInterfaceDesignDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceDescription <em>Service Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceDescription
	 * @generated
	 */
	public Adapter createServiceDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SubsetOf <em>Subset Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SubsetOf
	 * @generated
	 */
	public Adapter createSubsetOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Device
	 * @generated
	 */
	public Adapter createDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.MetaDataEntry <em>Meta Data Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.MetaDataEntry
	 * @generated
	 */
	public Adapter createMetaDataEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedService <em>Deployed Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedService
	 * @generated
	 */
	public Adapter createDeployedServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudDesign <em>Local Cloud Design</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudDesign
	 * @generated
	 */
	public Adapter createLocalCloudDesignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCLoudDesignDescription <em>Local CLoud Design Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCLoudDesignDescription
	 * @generated
	 */
	public Adapter createLocalCLoudDesignDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedDevice <em>Deployed Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedDevice
	 * @generated
	 */
	public Adapter createDeployedDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedLocalCloud <em>Deployed Local Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedLocalCloud
	 * @generated
	 */
	public Adapter createDeployedLocalCloudAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DataSemantics <em>Data Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DataSemantics
	 * @generated
	 */
	public Adapter createDataSemanticsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedEntity <em>Deployed Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeployedEntity
	 * @generated
	 */
	public Adapter createDeployedEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm <em>Service Registry Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ServiceRegistryForm
	 * @generated
	 */
	public Adapter createServiceRegistryFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemRegistryForm <em>System Registry Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemRegistryForm
	 * @generated
	 */
	public Adapter createSystemRegistryFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRegistryForm <em>Device Registry Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRegistryForm
	 * @generated
	 */
	public Adapter createDeviceRegistryFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CertificateCreationForm <em>Certificate Creation Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.CertificateCreationForm
	 * @generated
	 */
	public Adapter createCertificateCreationFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsDesign <em>Systemof Local Clouds Design</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsDesign
	 * @generated
	 */
	public Adapter createSystemofLocalCloudsDesignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsDesignDescription <em>Systemof Local Clouds Design Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsDesignDescription
	 * @generated
	 */
	public Adapter createSystemofLocalCloudsDesignDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Network
	 * @generated
	 */
	public Adapter createNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ApplicationSysDDHTTP <em>Application Sys DDHTTP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ApplicationSysDDHTTP
	 * @generated
	 */
	public Adapter createApplicationSysDDHTTPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsDeployed <em>Systemof Local Clouds Deployed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsDeployed
	 * @generated
	 */
	public Adapter createSystemofLocalCloudsDeployedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudDeployed <em>Local Cloud Deployed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudDeployed
	 * @generated
	 */
	public Adapter createLocalCloudDeployedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceDeployed <em>Device Deployed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceDeployed
	 * @generated
	 */
	public Adapter createDeviceDeployedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkDeployed <em>Network Deployed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkDeployed
	 * @generated
	 */
	public Adapter createNetworkDeployedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SDDD <em>SDDD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SDDD
	 * @generated
	 */
	public Adapter createSDDDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.MQTT_topic <em>MQTT topic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.MQTT_topic
	 * @generated
	 */
	public Adapter createMQTT_topicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.HttpOperation <em>Http Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.HttpOperation
	 * @generated
	 */
	public Adapter createHttpOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemRequirements <em>System Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemRequirements
	 * @generated
	 */
	public Adapter createSystemRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkRequirements <em>Network Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkRequirements
	 * @generated
	 */
	public Adapter createNetworkRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocaCloudRequirements <em>Loca Cloud Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocaCloudRequirements
	 * @generated
	 */
	public Adapter createLocaCloudRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsRequirements <em>Systemof Local Clouds Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsRequirements
	 * @generated
	 */
	public Adapter createSystemofLocalCloudsRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRequirements <em>Device Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceRequirements
	 * @generated
	 */
	public Adapter createDeviceRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsMaintenance <em>Systemof Local Clouds Maintenance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsMaintenance
	 * @generated
	 */
	public Adapter createSystemofLocalCloudsMaintenanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsEvolution <em>Systemof Local Clouds Evolution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsEvolution
	 * @generated
	 */
	public Adapter createSystemofLocalCloudsEvolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudMaintenance <em>Local Cloud Maintenance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudMaintenance
	 * @generated
	 */
	public Adapter createLocalCloudMaintenanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudEvolution <em>Local Cloud Evolution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCloudEvolution
	 * @generated
	 */
	public Adapter createLocalCloudEvolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysMaintenance <em>Sys Maintenance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysMaintenance
	 * @generated
	 */
	public Adapter createSysMaintenanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysImplementation <em>Sys Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysImplementation
	 * @generated
	 */
	public Adapter createSysImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCLoudImplementation <em>Local CLoud Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.LocalCLoudImplementation
	 * @generated
	 */
	public Adapter createLocalCLoudImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsImplementation <em>Systemof Local Clouds Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SystemofLocalCloudsImplementation
	 * @generated
	 */
	public Adapter createSystemofLocalCloudsImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceImplementation <em>Device Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceImplementation
	 * @generated
	 */
	public Adapter createDeviceImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkImplementation <em>Network Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkImplementation
	 * @generated
	 */
	public Adapter createNetworkImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceMaintenance <em>Device Maintenance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceMaintenance
	 * @generated
	 */
	public Adapter createDeviceMaintenanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkMaintenance <em>Network Maintenance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkMaintenance
	 * @generated
	 */
	public Adapter createNetworkMaintenanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysEvolution <em>Sys Evolution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysEvolution
	 * @generated
	 */
	public Adapter createSysEvolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceEvolution <em>Device Evolution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.DeviceEvolution
	 * @generated
	 */
	public Adapter createDeviceEvolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkEvolution <em>Network Evolution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.NetworkEvolution
	 * @generated
	 */
	public Adapter createNetworkEvolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Deployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Deployment
	 * @generated
	 */
	public Adapter createDeploymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Requirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Requirements
	 * @generated
	 */
	public Adapter createRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.FunctionalDesign <em>Functional Design</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.FunctionalDesign
	 * @generated
	 */
	public Adapter createFunctionalDesignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ProcurementEngineering <em>Procurement Engineering</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ProcurementEngineering
	 * @generated
	 */
	public Adapter createProcurementEngineeringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Maintenance <em>Maintenance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Maintenance
	 * @generated
	 */
	public Adapter createMaintenanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Evolution <em>Evolution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.Evolution
	 * @generated
	 */
	public Adapter createEvolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysDeployed <em>Sys Deployed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.SysDeployed
	 * @generated
	 */
	public Adapter createSysDeployedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ChoreographyDefinition <em>Choreography Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.arrowhead.profile.arrowheadsysmlprofile.ChoreographyDefinition
	 * @generated
	 */
	public Adapter createChoreographyDefinitionAdapter() {
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
