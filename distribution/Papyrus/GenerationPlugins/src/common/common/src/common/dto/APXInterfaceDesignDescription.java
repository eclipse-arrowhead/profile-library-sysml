package common.dto;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * 
 * The Interface Design Description (IDD) is a SysML stereotype that displays every service that a
 * certain system provides including networking, format and security parameters.
 *
 * @author fernand0labra
 *
 */
public class APXInterfaceDesignDescription {
	
	//=================================================================================================
	// attributes
	
	private String name; // Interface Name
	private String role; // Role of the system with the interface (Consumer or Provider)
	
	private String encoding; // Encoding of the payload
	private String protocol; // Communication Protocol
	
	private ArrayList<APXServiceDescription> operations; // List of operations that the interface serves
	
	// Legacy
	private String url; // URL Path of the interface
	
	
	//=================================================================================================
	// auxiliary methods
	
	//-------------------------------------------------------------------------------------------------	
	public String getName() { return name; }
	public String getRole() { return role; }
	public String getEncoding() { return encoding; }
	public String getProtocol() { return protocol; }
	public ArrayList<APXServiceDescription> getOperations() { return operations; }
	public String getUrl() { return url; }

	//-------------------------------------------------------------------------------------------------
	public void setName(String name) { this.name = name; }
	public void setRole(String role) { this.role = role; }
	public void setEncoding(String encoding) { this.encoding = encoding; }
	public void setProtocol(String protocol) { this.protocol = protocol; }
	public void setOperations(ArrayList<APXServiceDescription> operations) { this.operations = operations; }
	public void setUrl(String url) { this.url = url; }
	
	//-------------------------------------------------------------------------------------------------
	public APXInterfaceDesignDescription() {
		this.name = "";
		this.role = "";
		this.encoding = "";
		this.protocol = "";
		this.operations = new ArrayList<APXServiceDescription>();
		this.url = "";
	}
	
	public APXInterfaceDesignDescription(APXInterfaceDesignDescription other) {
		this.name = other.getName();
		this.role = other.getRole();
		this.encoding = other.getEncoding();
		this.protocol = other.getProtocol();
		this.operations = new ArrayList<APXServiceDescription>();
		
		for(APXServiceDescription service : other.getOperations())
			this.operations.add(new APXServiceDescription(service));
		
		this.url = other.getUrl();
	}
	
	//-------------------------------------------------------------------------------------------------
	@Override
	public String toString() {
		String operationsString = "";
		for (APXServiceDescription operation : operations)
			operationsString += operation.toString();
		
		return "\n\t\t\t\t" + name + "\n\t\t\t\t\tRole: " + role + "\n\t\t\t\t\tProtocol: " + protocol + 
				"\n\t\t\t\t\tEncoding: " + encoding + "\n\t\t\t\t\tUrl:"  + url + "\n\t\t\t\t\tOperations:" + operationsString;
	}
	
	//-------------------------------------------------------------------------------------------------
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof APXInterfaceDesignDescription))
			return false;
		
		APXInterfaceDesignDescription idd = (APXInterfaceDesignDescription) o;
		
		return idd.getName().equals(this.getName()) && idd.getRole().equals(this.getRole());
	}
	
	//-------------------------------------------------------------------------------------------------
	public boolean checkConsistency(APXInterfaceDesignDescription other) {
		return 
				this.getName() == other.getName() &&
				this.getProtocol() == other.getProtocol() &&
				this.getEncoding() == other.getEncoding() && 
				this.getOperations().size() == other.getOperations().size() &&
				this.getUrl() == other.getUrl();
	}
	
	
	//=================================================================================================
	// auxiliary classes
		
	//-------------------------------------------------------------------------------------------------
	public static class InterfaceComparator implements Comparator<APXInterfaceDesignDescription> {

		//=================================================================================================
		// methods
		
		//-------------------------------------------------------------------------------------------------
		@Override
		public int compare(APXInterfaceDesignDescription o1, APXInterfaceDesignDescription o2) {
			return o1.getName().compareTo(o2.getName());
		}
		
	}
	
	//-------------------------------------------------------------------------------------------------
	/**
	 * 
	 * The ServiceDescriptizon is a SysML stereotype that displays the type and payload of an operation.
	 * 
	 * @author fernand0labra
	 *
	 */
	public class APXServiceDescription {
		
		//=================================================================================================
		// attributes
		
		private String name;  // Name of the operation
		private String method; // Method of the operation
		private String path;
		private ArrayList<String> subpaths;

		private String requestType;
		private String requestComplexType;
		private String requestEncoding;
		private ArrayList<APXPayload> requestPayload; // Request payload of the operation
		
		private String responseType;
		private String responseComplexType;
		private String responseEncoding;
		private ArrayList<APXPayload> responsePayload; // Response payload of the operation
		
	    private boolean withParameters; 
	    private ArrayList<APXParameter> parameters;
	    
	    
		//=================================================================================================
		// auxiliary methods
		
		//-------------------------------------------------------------------------------------------------
		public String getName() { return name; }
		public String getMethod() { return method; }
		public String getPath() { return path; }
		public ArrayList<String> getSubpaths() { return subpaths; }
		public String getRequestType() { return requestType; }
		public String getRequestComplexType() { return requestComplexType; }
		public String getRequestEncoding() { return requestEncoding; }
		public ArrayList<APXPayload> getRequestPayload() { return requestPayload; }
		public String getResponseType() { return responseType; }
		public String getResponseComplexType() { return responseComplexType; }
		public String getResponseEncoding() { return responseEncoding; }
		public ArrayList<APXPayload> getResponsePayload() { return responsePayload; }
		public boolean isWithParameters() { return withParameters; }
		public ArrayList<APXParameter> getParameters() { return parameters; }
		
		//-------------------------------------------------------------------------------------------------
		public void setName(String name) { this.name = name; }
		public void setMethod(String method) { this.method = method; }
		public void setPath(String path) { this.path = path; }
		public void setSubpaths(ArrayList<String> subpaths) { this.subpaths = subpaths; }
		public void setRequestType(String requestType) { this.requestType = requestType; }
		public void setRequestComplexType(String requestComplexType) { this.requestComplexType = requestComplexType; }
		public void setRequestEncoding(String requestEncoding) { this.requestEncoding = requestEncoding; }
		public void setRequestPayload(ArrayList<APXPayload> requestPayload) { this.requestPayload = requestPayload; }
		public void setResponseType(String responseType) { this.responseType = responseType; }
		public void setResponseComplexType(String responseComplexType) { this.responseComplexType = responseComplexType; }
		public void setResponseEncoding(String responseEncoding) { this.responseEncoding = responseEncoding; }
		public void setResponsePayload(ArrayList<APXPayload> responsePayload) { this.responsePayload = responsePayload; }
		public void setWithParameters(boolean withParameters) { this.withParameters = withParameters; }
		public void setParameters(ArrayList<APXParameter> parameters) { this.parameters = parameters; }
		
		//-------------------------------------------------------------------------------------------------
		public APXServiceDescription() {
			this.name = "";
			this.method = "";
			this.path = "";
			this.subpaths = new ArrayList<String>();
			
			this.requestType = "";
			this.requestComplexType = "";
			this.requestEncoding = "";
			this.requestPayload = new ArrayList<APXPayload>();

			this.responseType = "";
			this.responseComplexType = "";
			this.responseEncoding = "";
			this.responsePayload = new ArrayList<APXPayload>();
			
			this.withParameters = false;
			this.parameters = new ArrayList<APXParameter>();
		}
		
		public APXServiceDescription(APXServiceDescription other) {
			this.name = other.getName();
			this.method = other.getMethod();
			this.path = other.getPath();
			this.subpaths = other.getSubpaths();
			
			this.requestType = other.getRequestType();
			this.requestComplexType = other.getRequestComplexType();
			this.requestEncoding = other.getRequestEncoding();
			this.requestPayload = new ArrayList<APXPayload>();
			for(APXPayload payload : other.getRequestPayload())
				this.requestPayload.add(new APXPayload(payload));
			
			this.responseType = other.getResponseType();
			this.responseComplexType = other.getResponseComplexType();
			this.responseEncoding = other.getResponseEncoding();
			this.responsePayload = new ArrayList<APXPayload>();
			for(APXPayload payload : other.getResponsePayload())
				this.responsePayload.add(new APXPayload(payload));
			
			this.withParameters = other.isWithParameters();
			this.parameters = new ArrayList<APXParameter>();
			for(APXParameter parameter : other.getParameters())
				this.parameters.add(new APXParameter(parameter));
		}
		
		//-------------------------------------------------------------------------------------------------
		@Override
		public String toString() {
			String type = "";
			type += !requestType.equals("") ? "\n\t\t\t\t\t\t\t Request Type: " + requestType : "";
			type += !responseType.equals("") ? "\n\t\t\t\t\t\t\t Response Type: " + responseType : "";
			type += !requestComplexType.equals("") ? "\n\t\t\t\t\t\t\t Request Complex Type: " + requestComplexType : "";
			type += !responseComplexType.equals("") ? "\n\t\t\t\t\t\t\t Response Complex Type: " + responseComplexType : "";
			
			String encodingString = "";
			encodingString += !requestEncoding.equals("") ? requestEncoding: "";
			encodingString += !responseEncoding.equals("") & !responseEncoding.equals(requestEncoding)? responseEncoding : "";
			
			String subpathsString = "";
			for(String subpath : subpaths)
				subpathsString += subpath + " ";
			
			String payloadString = "";
			
			String requestPayloadString = "";
			for (APXPayload payload : requestPayload)
				requestPayloadString += payload.toString();
			payloadString += !requestPayloadString.equals("") ? "\n\t\t\t\t\t\t\t Request Payload: " + requestPayloadString : "";
			
			String responsePayloadString = "";
			for (APXPayload payload : responsePayload)
				responsePayloadString += payload.toString();
			payloadString += !responsePayloadString.equals("")? "\n\t\t\t\t\t\t\t Response Payload: " + responsePayloadString : "";
			
			String parameterString = "";
			for (APXParameter parameter : parameters)
				parameterString += parameter.toString();
			parameterString = withParameters ? "\n\t\t\t\t\t\t\t Parameters " + parameterString : "";
			
			return "\n\t\t\t\t\t\t" + name + "\n\t\t\t\t\t\t\t Method: " + method +  "\n\t\t\t\t\t\t\t Encoding: " + encodingString +
					"\n\t\t\t\t\t\t\t Path: " + path + "\n\t\t\t\t\t\t\t Subpaths: " +  subpathsString + type + payloadString + parameterString + "\n";
		}
		
		//-------------------------------------------------------------------------------------------------
		@Override
		public boolean equals(Object o) {
			if(!(o instanceof APXServiceDescription))
				return false;
			
			APXServiceDescription sd = (APXServiceDescription) o;
			
			return sd.getName().equals(this.getName());
		}
		
		//-------------------------------------------------------------------------------------------------
		public boolean checkConsistency(APXServiceDescription other) {
			return 
					this.getName() == other.getName() &&
					this.getMethod() == other.getMethod() &&
					this.getRequestType() == other.getRequestType() && 
					this.getRequestComplexType() == other.getRequestComplexType() &&
					this.getResponseType() == other.getResponseType() &&
					this.getResponseComplexType() == other.getResponseComplexType();
		}
		
		//-------------------------------------------------------------------------------------------------
		public String capitalizeService() {
			return this.getName().substring(0, 1).toUpperCase() + this.getName().substring(1, name.length());
		}
		
		//=================================================================================================
		// auxiliary classes
			
		//-------------------------------------------------------------------------------------------------
		public class OperationComparator implements Comparator<APXServiceDescription> {

			//=================================================================================================
			// methods
				
			//-------------------------------------------------------------------------------------------------
			@Override
			public int compare(APXServiceDescription o1, APXServiceDescription o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		}
		
		//-------------------------------------------------------------------------------------------------
		/**
		 * 
		 * The payload of a certain ServiceDescription stereotype
		 * 
		 * @author fernand0labra
		 *
		 */
		public class APXPayload {
			
			//=================================================================================================
			// attributes
			
			private String name; // Name of the parameter
			private String type; // Type of the parameter
			
			// Legacy
			private ArrayList<String[]> elements;
			private ArrayList<String[]> metadata;
			
			//=================================================================================================
			// auxiliary methods
				
			//-------------------------------------------------------------------------------------------------
			public String getName() { return name; }
			public String getType() { return type; }
			public ArrayList<String[]> getElements() { return elements; }
			public ArrayList<String[]> getMetadata() { return metadata; }			
			
			//-------------------------------------------------------------------------------------------------
			public void setName(String name) { this.name = name; }
			public void setType(String type) { this.type = type; }
			public void setElements(ArrayList<String[]> elements) { this.elements = elements; }
			public void setMetadata(ArrayList<String[]> metadata) { this.metadata = metadata; }
			
			//-------------------------------------------------------------------------------------------------
			public APXPayload() {
				this.name = "";
				this.type = "";
				this.elements = new ArrayList<String[]>();
				this.metadata = new ArrayList<String[]>();
			}
			
			public APXPayload(APXPayload other) {
				this.name = other.getName();
				this.type = other.getType();
				this.elements = other.getElements();
				this.metadata = other.getMetadata();
			}
			
			public APXPayload(ArrayList<String[]> elements, ArrayList<String[]> metadata) {
				this.name = "";
				this.type = "";
				this.elements = elements;
				this.metadata = metadata;
			}
			
			//-------------------------------------------------------------------------------------------------
			@Override
			public String toString() {
				return "\n\t\t\t\t\t\t\t\t" + name + " - " + type; 
			}
			
			public void printMetadata() {
				for (int i = 0; i > metadata.size(); i++)
					for (int j = 0; j > metadata.get(i).length; j++)
						System.out.println(metadata.get(i)[j]);
			}

			public void printElements() {
				for (int i = 0; i > elements.size(); i++)
					for (int j = 0; j > elements.get(i).length; j++)
						System.out.println(elements.get(i)[j]);
			}
			
			
			//=================================================================================================
			// auxiliary classes
				
			//-------------------------------------------------------------------------------------------------
			public class PayloadComparator implements Comparator<APXPayload> { // TODO Use at some point

				//=================================================================================================
				// methods
					
				//-------------------------------------------------------------------------------------------------
				@Override
				public int compare(APXPayload o1, APXPayload o2) {
					return o1.getName().compareTo(o2.getName());
				}
				
			}
		}
		
		//-------------------------------------------------------------------------------------------------
		/**
		 * 
		 * The parameter of a certain ServiceDescription stereotype
		 * 
		 * @author fernand0labra
		 *
		 */
		public class APXParameter {
			
			//=================================================================================================
			// attributes
			
			private String name; 
		    private String type; 
		    private String style; 
		    private String required;
		    
		    
		    //=================================================================================================
		    // auxiliary methods
		    
		    //-------------------------------------------------------------------------------------------------
			public String getName() { return name; }
			public String getType() { return type; }
			public String getStyle() { return style; }
			public String getRequired() { return required; }
			
			//-------------------------------------------------------------------------------------------------
			public void setName(String name) { this.name = name; }
			public void setType(String type) { this.type = type; }
			public void setStyle(String style) { this.style = style; }
			public void setRequired(String required) { this.required = required; }
			
			//-------------------------------------------------------------------------------------------------
			public APXParameter() {
				this.name = "";
				this.type = "";
				this.style = "";
				this.required = "";
			}
			
			public APXParameter(APXParameter other) {
				this.name = other.getName();
				this.type = other.getType();
				this.style = other.getStyle();
				this.required = other.getRequired();
			}
			
			//-------------------------------------------------------------------------------------------------
			@Override
			public String toString() {
				return "\n\t\t\t\t\t\t\t\t" + name + " - " + type + "\n\t\t\t\t\t\t\t\t Style: " + style + "\n\t\t\t\t\t\t\t\t Required: " + required; 
			}
			
			//=================================================================================================
			// auxiliary classes
				
			//-------------------------------------------------------------------------------------------------
			public class ParameterComparator implements Comparator<APXParameter> { // TODO Use at some point

				//=================================================================================================
				// methods
					
				//-------------------------------------------------------------------------------------------------
				@Override
				public int compare(APXParameter o1, APXParameter o2) {
					return o1.getName().compareTo(o2.getName());
				}
			}
		}
		
	}
}
