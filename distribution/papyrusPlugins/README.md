# Papyrus-Arrowhead-SysML-1.6

## Arrowhead SysML profile and library. 
A profile supporting modelling of Eclipse Arrowhead compliant services, systems, devices and local clouds. It's complemented by a library of sensors for the Studio4Education toolchain. The profile is available on top of SysML 1.6 IBD and BDD diagrams.
 
## Code generators.
### Code Generator from SysML models to executable Java Code. 
The code generator generates YaML files for provider and consumer services in an Arrowhead LocalCloud model. Then the OpenAPI Generator is called to generate Java code for clients and Spring code for servers.
### Code generator from SysML to Json configuration file for Blockly. 
In the context of Studio4Education use case, Papyrus is used in the SoS functional design phase; STudio4Education (a Blockly specialization) is used in the development phase. Each LocalCloud designed in Papyrus is mapped to a Json Configuration file containing the corresponding actuators and sensors identification information. Papyrus is able to communicate with Blockly via Arrowhead: JSON generated files could be uploaded and made available in Arrowhead. Indeed, a stakeholder (e.g. a professor) can generate and upload to Arrowhead the Json File to be used by his students in order to configure Blockly for STM32 Cards development. Then Blockly consumes the list of actuators and sensors from Papyrus via Arrowhead. 
