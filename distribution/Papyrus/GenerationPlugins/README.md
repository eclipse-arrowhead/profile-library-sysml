# Arrowhead Papyrus Utilities (Pre-Release v1.0.0-alpha)

## Table of Contents
1. [Introduction](#introduction)
    1. [About Arrowhead](#about-arrowhead)
    2. [About Papyrus](#about-papyrus)
2. [Pre-Release Utilities](#pre-release-utilities)
    1. [Installation](#installation)
    2. [UML/SysML Model](#umlsysml-model)
    3. [Common Requirements Plugin](#common-requirements-plugin)
    4. [Setup Plugins](#setup-plugins)
        1. [Service Registry](#service-registry)
    5. [Deployment Plugins](#deployment-plugins)
        1. [Local Cloud Core Systems](#local-cloud-core-systems)
        2. [Local Cloud Provider/Consumer Systems](#local-cloud-providerconsumer-systems)
        3. [Database System, Orchestration & Security Rules](#database-system-orchestration-and-security-rules)
    6. [Validation Plugins](#validation-plugins)
        1. [Code Validation](#code-validation)
        2. [Database Validation](#database-validation)

## Introduction
### About Arrowhead
The [Eclipse Arrowhead project](https://projects.eclipse.org/projects/iot.arrowhead) consists of systems and services that are needed for anyone to design, implement and deploy Arrowhead-compliant System of Systems. The generic concept of the Arrowhead Framework is based on the concept of Service Oriented Architectures, and aims at enabling all of its users to work in a common and unified approach – leading towards high levels of interoperability.

The [Arrowhead Framework](https://github.com/eclipse-arrowhead) is addressing IoT based automation and digitalisation. The approach taken is that the information exchange of elements in the Internet of Things is abstracted to services. This is to enable IoT interoperability in-between almost any IoT elements . The creation of automation is based on the idea of self-contained Local Clouds. Compared to the well-known concept of global clouds, in Arrowhead a local cloud can provide improvements and guarantees regarding:

* Real time data handling
* Data and system security
* Automation system engineering
* Scalability of automation systems

### About Papyrus
[Eclipse Papyrus](https://www.eclipse.org/papyrus/) is an open-source Model-Based Engineering tool that enables model-based techniques such as simulation, formal testing, safety analysis, performance/trade-offs analysis, and architecture exploration. It is a Domain Specific Language (DSL) platform based on the Unified Modeling Language (UML) and aims to implement the complete UML specification.

## Pre-Release Utilities
### Installation
This plugin offers a set of utilities for the systems' engineering automation of the **setup, deployment and validation** with the modeling help of Papyrus. The installation can be performed through Eclipse by selecting the released zip file of the plugin site in:
* Help -> Install New Software -> Add -> Archive

In the image below we can see that two plugin categories are offered. The installation process must be done in two separate steps, first the common utilities (*Step 1*) followed by the plugins (*Step 2*).

<p align="center">
<img src="https://github.com/fernand0labra/arrowhead-papyrus-utilities/assets/70638694/5e2088c4-316c-4b0a-9a41-b59bef3116c3">
</p>

Once everything is installed the upgraded workspace user interface should have a new menu *Arrowhead* containing **Setup, Deployment & Validation** tags for the execution of the plugins as well as three new buttons for each of the deployment plugins as seen in the left side of the image below.

<p align="center">
    <img src="https://github.com/fernand0labra/arrowhead-papyrus-utilities/assets/70638694/8614a0b8-cbf9-4152-93d5-daca48061161" width="751" height="176"/>
</p>

### UML/SysML Model
The release includes a UML model example of a distributed local cloud system. It is compound by a set of sensors, terminals, a middleware collector and a database. There are two interfaces offered *DataService* and *ConfigurationService* for respectively the obtention and update of data from sensor/database in different elements of the system and configuring the sampling ratio of the sensors.

In the left view we can see a high level description of the Local Cloud Design Descriptions (LCDDs), System Design Descriptions (SysDDs) and Interface Design Descriptions (IDDs). In contrast, the right view shows the internal display or low level description of a Local Cloud where a set of Deployed Entities based on the previously defined SysDDs and IDDs are interconnected, displaying the consumer and provider interactions.

<p align="center">
    <img src="https://github.com/fernand0labra/arrowhead-papyrus-utilities/assets/70638694/e2d6af14-88b3-4cb4-b5f3-957a970081f8">
</p>

### Common Requirements Plugin

The requirements plugin includes the common libraries shared by the plugins, the [Arrowhead Papyrus Profile (APP)](https://github.com/eclipse-arrowhead/profile-library-sysml/) for the UML/SysML modeling with Papyrus Eclipse, a common API for parsing the UML model and the generated code into APX (approximate) objects of the APP stereotype implementations, the APX class definitions and other utilities for e.g. script execution in different OS.

The utilities require the following programs and minimum versions for their correct functionality:
* Java SE Runtime Environment (JRE) - Version 11
* Maven - Version 3.5
* MySQL - Version 5.7

### Setup Plugins

The setup plugins are meant to define the configuration for the governing core or support systems in the local cloud. The current release includes the Service Registry, i.e. the system in charge of storing the information related to the systems, services, security configuration, etc.

#### Service Registry

This plugin performs two actions, the installation of the AH database and the creation of a user (default name *arrowhead*) with admin permits on the AH tables. The plugin requires the existing root and the new arrowhead users with their respective passwords. If the database already exists, the plugin resets the tables.

<p align="center">
  <img src="https://github.com/fernand0labra/arrowhead-papyrus-utilities/assets/70638694/4de13128-6144-469c-9bb5-29cdd46ea93e" width="486" height="296"/>
</p>

### Deployment Plugins

The deployment plugins are meant to automate the installation of the core/support systems, the skeleton implementation of the providing/consuming systems in a Local Cloud and the service registry rule creation for the systems' intracloud communication. The plugins generate the **arrowhead** folder in the selected workspace with the folders:

1. Core & Support systems in **arrowhead/core-systems**
2. Provider & Consumer systems in **arrowhead/local-cloud-name/cloud-systems**
3. Database Rules in **arrowhead/local-cloud-name/db-rules**

```
arrowhead
└───core-systems                     (1) Local Cloud Core Systems
└───example-cloud                    (2) Local Cloud Provider/Consumer Systems
    └───cloud-systems
    |   └───collector-provider
    |   |   └───src/main
    |   |       └───java
    |   |       └───resources
    |   ...
    |   └───terminal-b-consumer
    |       └───src/main
    |           └───java
    |           └───resources  
    └───db-rules                     (3) Database System, Orchestration & Security Rules
```

#### Local Cloud Core Systems

This plugin allows the download and compilation of the Arrowhead framework core/support systems into JAR executables. The executables along with the starting/stopping scripts can be found under the folder **arrowhead/core-systems** of the workspace. 

The only-core selection obtains the systems from the repository [arrowhead-core-systems](https://github.com/fernand0labra/arrowhead-core-systems) with version **4.4.1** where as the core+support selection obtains them from the repository [core-java-spring](https://github.com/eclipse-arrowhead/core-java-spring) with version **4.6.1** . 
* The current implementation works for Windows OS and Java. 
* The Maven compilation tests can be skipped for quicker compilation time. 

<p align="center">
<img src="https://github.com/fernand0labra/arrowhead-papyrus-utilities/assets/70638694/48982fdd-03d2-474c-a1c5-5701c81bbfa5" width="550" height="340"/>
</p>

#### Local Cloud Provider/Consumer Systems

This plugin allows the skeletons generation of the providing and consuming systems. The generated implementation includes the endpoint network configuration, the request and response data types (DTO package), the communication process with the core systems (Orchestrator, Service Registry & Authorization) and the Java/Maven project for compilation of executables.

Once the papyrus project with the UML model has been selected, the following screen will appear where the local cloud and the systems can be chosen for their code generation. 
* The Java files will be saved under the folder **arrowhead/local-cloud-name/cloud-systems**. 
* The current implementation works for Windows OS and Java. 

<p align="center">
    <img src="https://github.com/fernand0labra/arrowhead-papyrus-utilities/assets/70638694/dcc9f37c-6ef0-4796-9f08-583306e50b07" width="473" height="432"/>
</p>

In the following tree-like schema, we can see the structure of a providing and consuming system that has been generated with the plugin from the example UML/SysML model. It contains three packages for respectively the controller, the data and the security. 
* API Support for GET and POST operations
  * GET is assumed to not have a request
  * POST response is assumed to be a String
* Protocol Support for HTTP
* Encoding Support for JSON and XML
* Insecure communication (No certificates)

```
collector-provider/src/main                                 Provider & Consumer System
└───java
│   └───eu/arrowhead
│       └───provider
│       │   CollectorProviderMain.java                      Main Function         (Consumer behavior)
│       │   ProviderApplicationInitListener.java            Application Listener  (Provider behavior)
│       │   ServiceControllerHttp.java                      Service Controller    (Provider behavior)
│       └───dto
│       │   ConfigureRequestDTO.java
│       │   GetDataResponseDTO.java
│       │   UpdateDataRequestDTO.java
│       └───security                                        NOTE - Security files currently not in use
│           ProviderAccessControlFilter.java
│           ProviderSecurityConfig.java
│           ProviderTokenSecurityFilter.java
└───resources
    │   application.properties                              System & Network Configuration
    │   info.txt
    └───certificates                                        NOTE - Certificates should be self-generated
    └───META-INF
            additional-spring-configuration-metadata.json
```

#### Database System, Orchestration and Security Rules

This plugin allows the generation of SQL scripts for registering (1) the providing and consuming systems with their respective services, (2) the Orchestrator Store rules without Authorization check and (3) the Intra-cloud Security rules with Authorization check. The following extracts of the different scripts display the results of executing the plugin over the example UML/SysML model.

<p align="center">
    <img src="https://github.com/fernand0labra/arrowhead-papyrus-utilities/assets/70638694/1d9429c1-855a-4382-85b0-69cff18e83e6" width="426" height="386" hspace="25"/>
</p>

1. **system-service-registry.sql** inserts the systems' information onto *system_*, *service_definition*, *service_registry* and *service_registry_interface_connection*.
```
USE `arrowhead`;
INSERT INTO `system_` (`system_name`,`address`, `port`) 
VALUES ('collector-provider','127.0.0.1','8888');
...

INSERT INTO `service_definition` (`service_definition`)
VALUES ('ConfigurationService');
INSERT INTO `service_definition` (`service_definition`)
VALUES ('DataService');

SELECT @serviceID :=id FROM service_definition WHERE service_definition='DataService';
SELECT @systemID :=id FROM system_ WHERE system_name='collector-provider';
INSERT INTO `service_registry` (`service_id`,`system_id`, `service_uri`) 
VALUES (@serviceID,@systemID, '/getData');

SELECT @serviceRegistryID :=id FROM service_registry WHERE service_id=@serviceID AND system_id=@systemID;
INSERT INTO `service_registry_interface_connection` (`service_registry_id`,`interface_id`) 
VALUES (@serviceRegistryID, 2);
...
```

2. **orchestrator-rules.sql** inserts the connections' information onto *orchestrator_store*.
```
USE `arrowhead`;
SELECT @serviceID :=id FROM service_definition WHERE service_definition='ConfigurationService';
SELECT @providerID :=id FROM system_ WHERE system_name='sensor-a-provider';
SELECT @consumerID :=id FROM system_ WHERE system_name='collector-provider';
SELECT @srID :=id FROM service_registry WHERE service_id=@serviceID AND system_id=@providerID;
SELECT @interfaceID :=interface_id FROM service_registry_interface_connection WHERE service_registry_id=@srID;
INSERT INTO `orchestrator_store` (`consumer_system_id`,`provider_system_id`, `service_id`, `service_interface_id`, `priority`) 
VALUES (@consumerID,@providerID,@serviceID,@interfaceID,'2');
...
```

3. **security-rules.sql** inserts the connections' information onto *authorization_intra_cloud* and *authorization_intra_cloud_interface_connection*.
```
USE `arrowhead`;
SELECT @serviceID :=id FROM service_definition WHERE service_definition='ConfigurationService';
SELECT @providerID :=id FROM system_ WHERE system_name='sensor-b-provider';
SELECT @consumerID :=id FROM system_ WHERE system_name='collector-provider';
SELECT @srID :=id FROM service_registry WHERE service_id=@serviceID AND system_id=@providerID;
SELECT @interfaceID :=interface_id FROM service_registry_interface_connection WHERE service_registry_id=@srID;
INSERT INTO `authorization_intra_cloud` (`consumer_system_id`,`provider_system_id`, `service_id`) 
VALUES (@consumerID,@providerID,@serviceID);

SELECT @authoID :=id FROM authorization_intra_cloud WHERE service_id=@serviceID AND provider_system_id=@providerID;
INSERT INTO `authorization_intra_cloud_interface_connection` (`authorization_intra_cloud_id`,`interface_id`) 
VALUES (@authoID,@interfaceID);
...
```

### Validation Plugins

The validation plugins are meant to maintain the consistency of the model, the database (i.e. Service Registry) and the code that has been generated and possibly edited. The consistency is kept by editing both the UML model and the notation file defining the interface view.

When the plugins are executed there are three actions that can be done for updating the view:
* **Right Click** -> Filters -> Synchronized with Model
* **F5** (Refresh the Current Diagram)
* Close and Re-open the Papyrus Diagram

The block information can be displayed in different ways by using the actions:
* **Right Click** -> Filters -> Show/Hide Contents
* **Right Click** -> Filters -> Show/Hide Compartments

#### Code Validation

This plugin checks the model systems workspace under **arrowhead/local-cloud-name/cloud-systems** and parses every system onto an APX object. The parsed workspace is compared with the parsed model and based on the inconsistencies the plugin modifies the UML model to maintain a similarity between both.

As an example, a terminal is replicated with name **terminal-c** on the workspace. After the plugin is executed the resulting UML view displays, as seen in the left, that the new system has been added. Moreover, when synchronizing the view with the model the new SysDD **TerminalC** with the same services as its terminal peers can be seen.

<p align="center">
    <img src="https://github.com/fernand0labra/arrowhead-papyrus-utilities/assets/70638694/628cad4a-c763-4480-b2d0-1aec72c8892d" width="324" height="222"/>
    <img src="https://github.com/fernand0labra/arrowhead-papyrus-utilities/assets/70638694/9a33b744-07d7-4a08-80cd-d289fe544e70" width="482" height="147"/>
</p>
    
#### Database Validation

This plugin checks the list of systems defined in the Arrowhead database and compares them with the deployed entities defined on each of the local clouds. The block's color will be updated with green or red depending on the system being registered or not in the database.

From the example model, we have the following low level description view of the deployed entities. After executing the database validation plugin, the resulting view can be seen on the right where it has identified every system to be in the database due to the execution of the **system-service-registry.sql** script as explained in the section [Database System, Orchestration and Security Rules](#database-system-orchestration-and-security-rules).

<p align="center">
    <img src="https://github.com/fernand0labra/arrowhead-papyrus-utilities/assets/70638694/926d09ea-0c65-47fa-a3db-fe58aa8edcb2" width="800" height="204"/>
</p>

After adding a new deployed entity **terminalC** to our model and displaying it as a reference to the SysDD **TerminalC** together with its connections with the other systems, we execute again the validation plugin to see that this system was not in the database.
<p align="center">
    <img src="https://github.com/fernand0labra/arrowhead-papyrus-utilities/assets/70638694/1de96319-f452-466b-a603-b7ba9cac38f2" width="800" height="204"/>
</p>
