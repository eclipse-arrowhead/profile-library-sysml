library package AFPVNDatatypes {
private import Metaobjects::SemanticMetadata;
attribute def String;
attribute def Int;
/*DataTypes */
		enum def ApplicationProtocolKind{
			enum 'http';
			enum 'mqtt';
			enum 'coap';
			enum 'websocket';
			enum 'OtherApplicationProtocol';
		}
		enum def ArrowheadCertificateKind {
			enum 'ApplicationSystem';
			enum 'Device';
			enum 'CoreSystem';
			enum 'Management';
			enum 'InterCloud';
			enum 'Other';
		}
		enum def ArrowheadSecurityKind {
			enum 'CERTIFICATE';
			enum 'TOKEN';
			enum 'NOT_SECURE';
		}
		enum def BusinessPolicyKind {
			enum 'Other';
		}
		enum def CertificateKind {
			enum 'x509_Arrowhead';/*https://github.com/eclipse-arrowhead/documentation/blob/master/distribution/Eclipse%20Arrowhead%20X.509%20Certificate%20Profiles%20v1.0.Proposal.pdf */
			enum 'OtherCertificate';
		}
		enum def CoAPMethodKind {
			enum 'GET';
			enum 'PUT';
			enum 'POST';
			enum 'DELETE';
			enum 'OtherCoAPMethod';
		}
		enum def ComprressionKind {
			enum 'NONE';
			enum 'EXI';
			enum 'OtherCompression';
		}
		enum def CryptoAlgorithmKind {
			enum 'RSA';
			enum 'ElipticCurve';
			enum 'DiffieHellman';
			enum 'Serpent';
			enum 'AES';
			enum 'Other';
		}
		enum def DatamodelStandardKind {
			enum 'NONE';
			enum 'ISO_10303';
			enum 'ISO_15926';
			enum 'SenML';
			enum 'ISO_12006';
			enum 'IEC_81346';
			enum 'ISO_15739_IFC';
			enum 'IEC_61850';
			enum 'OtherDatamodelStandard';
		}
		enum def EncodingKind {
			enum 'JSON';
			enum 'XML';
			enum 'CBOR';
			enum 'OtherEncoding';
		}
		enum def HTTP11MethodKind {
			/*https://www.rfc-editor.org/rfc/rfc9110.html */
			enum 'POST';
			enum 'GET';
			enum 'DELETE';
			enum 'PUT';
			enum 'HEAD';
			enum 'OtherHTTPMethod';
			enum 'CONNECT';
			enum 'OPTIONS';
			enum 'TRACE';
		}
		enum def HTTP2FrameKind {
			enum 'OtherHTTP2Frame';
			enum 'HEADERS';
			enum 'DATA';
			enum 'RST_STREAM';
			enum 'SETTINGS';
			enum 'PUSH_PROMISE';
			enum 'PING';
			enum 'GOAWAY';
			enum 'WINDOW_UPDATE';
			enum 'CONTINUATION';
		}
		enum def LifecyclePolicyKind {
			enum 'Other';
		}
		enum def MacLayerKind {
			enum 'TDMA';
			enum 'CDMA';
			enum 'OtherMacLayer';
		}
		enum def MACProtocolKind {
			enum '802_11b_MAC';
			enum '802_11a_MAC';
			enum 'OtherMacProtocol';
		}
		enum def MonitoringPolicyKind {
			enum 'ISA95';
			enum 'OtherMonitoringPolicy';
		}
		enum def MQTT311MessageTypeKind {
			enum 'Connect';
			enum 'CONNACK';
			enum 'CONNECT';
			enum 'DISCONNECT';
			enum 'PINGREQ';
			enum 'PINGRESP';
			enum 'PUBACK';
			enum 'PUBCOMP';
			enum 'PUBLISH';
			enum 'PUBREC';
			enum 'PUBREL';
			enum 'SUBACK';
			enum 'SUBSCRIBE';
			enum 'UNSUBACK';
			enum 'UNSUBSCRIBE';	
		}
		enum def MQTT50MessageTypeKind {
			enum 'Connect';
			enum 'CONNECT';
			enum 'DISCONNECT';
			enum 'PUBLISH';
			enum 'CONNACK';
			enum 'PUBACK';
			enum 'PUBREC';
			enum 'PUBREL';
			enum 'PUBCOMP';
			enum 'SUBSCRIBE';
			enum 'SUBACK';
			enum 'UNSUBSCRIBE';
			enum 'UNSUBACK';
			enum 'PINGREQ';
			enum 'PINGRESP';
			enum 'AUTH';		
		}
		enum def OSKind {
			enum 'Windows';
			enum 'MacOS';
			enum 'Linux';
			enum 'OtherOS';
			enum 'ROS';
		}
		enum def PayloadEncryptionKind {
			enum 'DTLS 1.2';
			enum 'TLS 1.2';/*https://www.ietf.org/rfc/rfc5246.txt */
			enum 'Other';
			enum 'TLS 1.3';/*https://www.ietf.org/blog/tls13/ */
			enum 'DTLS 1.3';/*https://datatracker.ietf.org/doc/rfc9147/ */
		}
		enum def PhysicalLayerKind {
			enum 'IEEE802_3';
			enum 'IEEE802_15_4';
			enum 'IEEE802_11a';
			enum 'IEEE802_11b';
			enum 'OtherPhysicalLayer';
		}
		enum def SecurityPolicyKind {
			enum 'NGAC';
			enum 'Other';
		}
		enum def SystemDatabaseKind {
			enum 'MySQL';
			enum 'Undefined';
			enum 'MariaDB';
			enum 'mongoDB';
			enum 'neo4j';
		}
		enum def TimeFormatKind {
			enum 'RFC_3339';
			enum 'ISO_8601';
			enum 'Unix_time';
			enum 'OtherTimeFormat';
		}
		enum def TokenKind {
			enum 'ArrowheadToken';
			enum 'OtherToken';
			}
		enum def TransportLayerKind {
			enum 'TCP';
			enum 'UDP';
			}
		enum def WebsocketDataFramingTypeKind {
			enum 'BaseFramingProtocol';
			enum 'Client-to-Server_Masking';
			enum 'Fragmentation';
			enum 'EnumerationLiteral4';
			enum 'ControlFrames';
			enum 'DataFrames';
		}
		enum def WorkflowKind {
			enum 'BPMN';
			enum 'SysML_Statemachine';
			enum 'NodeRed';
			enum 'OtherWorkflowLanguage';
			enum 'PetriNet';
		}
		enum def StatusKodKind {
			enum '100 - Continue';
			enum '101 - Switch protocol';
			enum '102 - Processing';
			enum '103 - Early Hints';
			enum '200 - OK';
			enum '201 - Created';
			enum '202 - Accepted';
			enum '203 - Non-Authoritative Information';
			enum '204 - No Content';
			enum '205 - Reset Content';
			enum '206 - Partial Content';
			enum '207 - Multi-Status';
			enum '208 - Already Reported';	/*null */	
		}

		/*les ports */
metadata def FullPort :> SemanticMetadata;

metadata def ProxyPort :> SemanticMetadata;
		
		}
		
library package ArrowheadProfile {
	private import Metaobjects::SemanticMetadata;
	private import AFPVNDatatypes::*;
	private import SysML::*;
	private import Parts::*;
	private import Ports::*;
	private import ScalarValues::*;
	attribute def String;
    attribute def Int;
    
/*use case */
metadata def ArrowheadUseCase :> SemanticMetadata;
/*Requirement */
metadata def ArrowheadDSLRequirement :> SemanticMetadata;
/*les Operations */
	metadata def ArrowHeadServiceInterfaceHTTP:> SemanticMetadata{
		attribute Method:HTTP11MethodKind[1];
		attribute SubURL:String[1];
	}
	metadata def ArrowHeadServiceInterfaceMQTT:> SemanticMetadata{
		attribute Method:MQTT50MessageTypeKind[1];
		attribute SubURL:String[1];
	}
	metadata def ArrowHeadServiceInterfaceCOAP:> SemanticMetadata{
		
		attribute Method:CoAPMethodKind[1];
		attribute SubURL:String[1];
	}
	metadata def ArrowHeadServiceInterfaceWebsocket:> SemanticMetadata{
		attribute Method:WebsocketDataFramingTypeKind[1];
		attribute SubURL:String[1];
	}
	
	/*SD-IDD-IDD_Implementation */
	
	metadata def SD :> SemanticMetadata { 
		@ SysML::PortUsage;
		doc/* ServiceInterfaces: add more if required. Define Method name and parameters */
		attribute MicroserviceName:String[1];
		action Operation;	
	}
	metadata def IDD :> SD { 
		@ SysML::PortUsage;
		port Port[1];
		attribute Proyocol:ApplicationProtocolKind[1];
		attribute Encoding:EncodingKind[1];
		attribute Security:ArrowheadSecurityKind[1];
		attribute Compression:ComprressionKind[1];
		attribute Certificate_level:ArrowheadCertificateKind[1];
		attribute Token:TokenKind[1];
		attribute Crypto_algorithm:CryptoAlgorithmKind[1];
		attribute Datamodel:DatamodelStandardKind[1];	
		
		
	}
	metadata def IDD_Implementation :> IDD{	
		@ SysML::PortUsage;
	}

/*SysD-SysDD-System_Implementation */
	metadata def SysD :> SemanticMetadata {
		@ SysML::PartUsage;
		doc/* Microservies SD to be added to a microsystem (SysD) as a full port */
		attribute MicrosystemName:String[*];
		attribute FunctionalProperties:String[1..*];
		attribute SystemDatabase:SystemDatabaseKind[1];
		attribute MicrosystemBehaviour:BusinessPolicyKind[1..*];
		
	}
	metadata def SysDD :>SysD {
		@ SysML::PartUsage;
		attribute Timeformat:TimeFormatKind[1];
		attribute ArrowheadCertificate:ArrowheadCertificateKind[1];
	}
	metadata def System_Implementation :>SysDD{
		@ SysML::PartUsage;
	}

/*System_of_LocalcloudsDesign-System_of_LocacloudsDesignDescription-System_of_LocalcloudsImplementation */	
	metadata def System_of_LocalcloudsDesign :> SemanticMetadata{
		@ SysML::PartUsage;
		attribute SoLCName:String[1];
		attribute SoLC_SecurityStrategy:SecurityPolicyKind[*];
		attribute SoLC_BusinessStrategy:BusinessPolicyKind[*];
		attribute SoLC_LifecycleStrategy:LifecyclePolicyKind[1];
	}
	metadata def System_of_LocacloudsDesignDescription :> System_of_LocalcloudsDesign{
		@ SysML::PartUsage;
		attribute SoLC_Orchestration:String[1];
		attribute SoLC_Workflow:String[1];
	}
	metadata def System_of_LocalcloudsImplementation :>System_of_LocacloudsDesignDescription {
		@ SysML::PartUsage;
		attribute SoLC_Documentation:String[1];
		
	}
	
/*LocalCloudDesign-LocalcloudDesignDescription-LocalcloudImplementation */	
    metadata def LocalCloudDesign :> SemanticMetadata{
    	@ SysML::PartUsage;
		attribute LC_Name:String[1];
		attribute FunctionalProperties:String[1];
		attribute LC_SecurityStrategy:SecurityPolicyKind[*];
		attribute LC_BusinessStrategy:BusinessPolicyKind[*];
		attribute LC_LifecycleStrategy:LifecyclePolicyKind[1];
	}
    metadata def LocalcloudDesignDescription :> LocalCloudDesign{
    	@ SysML::PartUsage;
    	attribute LC_Orchestration:String[1];
		attribute LC_Workflow:String[1];
	}
     metadata def LocalcloudImplementation :> LocalcloudDesignDescription{
     	@ SysML::PartUsage;
    	attribute LC_Documentation:String[1];
    } 

 /*DeviceDesign-DeviceDesignDescription*/   	
  metadata def  DeviceDesign{
     @ SysML::PartUsage;
  	attribute DeviceName:String[1..*];
  } 
   metadata def  DeviceDesignDescription{
     @ SysML::PartUsage;
   
  	attribute IOports:String[*];
  	attribute DeviceName:String[*];
	attribute memory:String[*];
	attribute processor:String[*];
	attribute operatingSystem:OSKind[1];
	attribute ArrowheadCertificate:ArrowheadCertificateKind[1];	
  } 
 
 /*IntracloudNetworkDesign-IntracloudNetworkDesignDescription*/ 
  metadata def IntracloudNetworkDesign{
    @ SysML::PartUsage;
  	attribute IntraNetworkDomain:String[1];
  	attribute IntraNetworkMacLayer:MacLayerKind[1..*];
  	
  }
   metadata def IntracloudNetworkDesignDescription{
     @ SysML::PartUsage;
     attribute IntraNetworkRouter:String[1..*];
   	 attribute IntraNetworkRouterConfig:String[1..*];
   	 attribute IntraNetworkDomain:String[1];
   }
  /*IntercloudNetworkDesign-IntercloudNetworkDesignDescription */
     metadata def IntercloudNetworkDesign{
      @ SysML::PartUsage;
      attribute InterNetworkDomain:String[*];
  	  attribute InterNetworkMacLayer:MacLayerKind[1..*];	
     }
     metadata def IntercloudNetworkDesignDescription{
     	 @ SysML::PartUsage;
     	 attribute InterNetworkRouter:String[*];
   	     attribute InterNetworkRouterConfig:String[*];
   	     attribute InterNetworkDomain:String[*];
     }
    
/*les Association*/
  connection def LocalCloudDesign_System_of_LocalcloudsDesign {
    end : System_of_LocalcloudsDesign;
    end : LocalCloudDesign;
}
 
 connection def System_of_LocacloudsDesignDescription_LocalcloudDesignDescription {
 	end : System_of_LocacloudsDesignDescription ;
 	end : LocalcloudDesignDescription;
 	
 }
 connection def System_of_LocalcloudsImplementation_LocalcloudImplementation {
 	end : System_of_LocalcloudsImplementation ;
 	end : LocalcloudImplementation;
 	
 }
connection def LocalcloudImplementation_System_Implementation {
 	end : System_Implementation ;
 	end : LocalcloudImplementation;
 	
 }
 connection def System_Implementation_IDD_Implementation  {
 	end : System_Implementation ;
 	end : IDD_Implementation;
 	
 }
connection def DeviceDesign_IntracloudNetworkDesign {
 	end : DeviceDesign ;
 	end : IntracloudNetworkDesign;
 	
 } 
 connection def DeviceDesign_IntercloudNetworkDesign {
 	end : DeviceDesign ;
 	end : IntercloudNetworkDesign;
 	
 }
  connection def DeviceDesignDescription_IntracloudNetworkDesignDescription {
 	end : DeviceDesignDescription ;
 	end : IntracloudNetworkDesignDescription;
 	
 } 
 connection def DeviceDesignDescription_IntercloudNetworkDesignDescription {
 	end : DeviceDesignDescription ;
 	end : IntercloudNetworkDesignDescription;
 	
 } 
}
