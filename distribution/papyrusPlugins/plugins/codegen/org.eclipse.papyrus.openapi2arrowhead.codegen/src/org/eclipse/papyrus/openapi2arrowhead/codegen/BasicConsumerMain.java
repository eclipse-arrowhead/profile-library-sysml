/*******************************************************************************
 * Copyright (c) 2021 CEA LIST.
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 *
 *  SPDX-License-Identifier: EPL-2.0
 *  
 *  Contributors:
 *    Saadia Dhouib (CEA LIST) saadia.dhouib@cea.fr
 *    Fadwa Tmar (CEA LIST) fadwa.tmar@cea.fr 
 *    HUANG Yining (CEA LIST) yining.huang@cea.fr
 *******************************************************************************/

package org.eclipse.papyrus.openapi2arrowhead.codegen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Properties;
 
import org.eclipse.papyrus.openapi2arrowhead.codegen.eu.models.OrchestrationFormRequestDTO;
import org.eclipse.papyrus.openapi2arrowhead.codegen.eu.models.OrchestrationResponseDTO;
import org.eclipse.papyrus.openapi2arrowhead.codegen.eu.models.OrchestrationResultDTO;
import org.eclipse.papyrus.openapi2arrowhead.codegen.eu.models.ServiceQueryFormDTO;
import org.eclipse.papyrus.openapi2arrowhead.codegen.eu.models.SystemRequestDTO;
import org.eclipse.papyrus.openapi2arrowhead.codegen.eu.models.SystemResponseDTO;
import org.eclipse.papyrus.openapi2arrowhead.codegen.eu.models.TemperatureReadout;

import com.google.gson.Gson;

//Simple java project with minimal dependencies
public class BasicConsumerMain {
	private static Properties prop;
	private static final String ORCH_URI = getProp().getProperty("orch_uri",
			"http://localhost:8441/orchestrator/orchestration");

	public static void main(String[] args) throws Exception {

		// payload is the request to send to the orchestrator
		//String payload = compileSRF();
		OrchestrationFormRequestDTO orchestrationFormRequestDTO = createOrchestrationRequest();
		String payload = orchestrationFormRequestDTO.toString();
		Gson json = new Gson();
		String jsonRequest = json.toJson(orchestrationFormRequestDTO).toString();
		System.out.println("Sending this request form for the Orchestrator: " + jsonRequest);
		// sendServiceRequest Sends payload to the orchestrator
		String providerURI = sendServiceRequest(jsonRequest);
		// String providerURI = "http://localhost:8888/uploadFile";
		System.out.println("Received provider system URL: " + providerURI);
		// auth rule

		File file = new java.io.File(
				"C:\\Users\\ft238791\\git\\SysML-AHT\\Arrowhead Codegen\\client-skeleton-java-spring-boot\\BasicConsumer\\uploadedDir\\HomeAutomationSystem2ST4Econfig.json");
		// upload File
		postJsonFile(file, providerURI);
		
	}

	private static String sendServiceRequest(String payload) throws Exception {
		
		URL url = new URL(ORCH_URI);

		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setDoOutput(true);
		connection.setDoInput(true);
		connection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
		connection.setRequestProperty("Accept", "application/json");
		connection.setRequestMethod("POST");

		OutputStreamWriter wr = new OutputStreamWriter(connection.getOutputStream());
		wr.write(payload);
		wr.close();

		StringBuilder sb = new StringBuilder();
		int HttpResult = connection.getResponseCode();
		if (HttpResult == HttpURLConnection.HTTP_OK) {
			BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
			String line;
			while ((line = br.readLine()) != null) {
				sb.append(line).append("\n");
			}
			br.close();
		} else {
			throw new Exception(connection.getResponseMessage());
		}
 
		System.out.println("Orchestrator response : " + sb.toString());
		OrchestrationResponseDTO orchestrationResponse = new Gson().fromJson(sb.toString(), OrchestrationResponseDTO.class);
		OrchestrationResultDTO orchestrationResult = orchestrationResponse.getResponse().get(0);
		SystemResponseDTO provider = orchestrationResult.getProvider();
		String serviceUri = orchestrationResult.getServiceUri();

		if (provider.getPort() > 0) {
			if (serviceUri == null) {
				return "http://" + provider.getAddress() + ":" + provider.getPort();
			} else if (serviceUri.startsWith("/")) {
				return "http://" + provider.getAddress() + ":" + provider.getPort() + serviceUri;
			} else {
				return "http://" + provider.getAddress() + ":" + provider.getPort() + "/" + serviceUri;
			}
		} else {
			if (serviceUri == null) {
				return "http://" + provider.getAddress();
			} else if (serviceUri.startsWith("/")) {
				return "http://" + provider.getAddress() + serviceUri;
			} else {
				return "http://" + provider.getAddress() + "/" + serviceUri;
			}
		}
	}

//	private static String compileSRF() throws JSONException {
//		JSONObject requesterSystem = new JSONObject();
//		JSONObject requestedService = new JSONObject();
//		JSONObject orchestrationFlags = new JSONObject();
//
//		requesterSystem.put("systemName", "test_consumer5");
//		requesterSystem.put("address", "localhost");
//
//		requestedService.put("serviceDefinition", "file-uploader");
//		List<String> interfaces = new ArrayList<>();
//		interfaces.add("HTTP-INSECURE-JSON");
//		requestedService.put("interfaces", interfaces);
//
//		orchestrationFlags.put("overrideStore", true);
//		orchestrationFlags.put("matchmaking", true);
//
//		JSONObject payload = new JSONObject();
//		payload.put("requesterSystem", requesterSystem);
//		payload.put("requestedService", requestedService);
//		payload.put("orchestrationFlags", orchestrationFlags);
//
//		return payload.toString(4);
//	}
	public static OrchestrationFormRequestDTO createOrchestrationRequest() {
	System.out.println("Orchestration request for " + "file-uploader" + " service:");
	final ServiceQueryFormDTO serviceQueryForm = new ServiceQueryFormDTO.Builder(FileUploaderConstants.FILE_UPLOADER_SERVICE_DEFINITION)
																		.interfaces("HTTP-INSECURE-JSON")
																		.build();
	
	final SystemRequestDTO thisSystem = new SystemRequestDTO();
	String clientSystemName = "consumer_1";
	thisSystem.setSystemName(clientSystemName);
	String clientSystemAddress = "127.0.0.1";
	thisSystem.setAddress(clientSystemAddress);
	Integer clientSystemPort = 8888;  
	thisSystem.setPort(clientSystemPort);
	
	final OrchestrationFormRequestDTO orchestrationFormRequest = new OrchestrationFormRequestDTO();
	orchestrationFormRequest.setRequestedService(serviceQueryForm);
	orchestrationFormRequest.setRequesterSystem(thisSystem);
	HashMap<String,Boolean> hm=  new HashMap<String,Boolean>();
	//hm.put("matchmaking", false);
	hm.put("overrideStore", true);
	orchestrationFormRequest.setOrchestrationFlags(hm);
	HashMap<String,Boolean> hms=  new HashMap<String,Boolean>();
	hms.put("overrideStore", true);
	orchestrationFormRequest.setOrchestrationFlags(hms);
	
																				   
	
	System.out.println("orchestrationFormRequest"+orchestrationFormRequest);
	return orchestrationFormRequest;		
	}
	
	private static synchronized Properties getProp() {
		try {
			if (prop == null) {
				prop = new Properties();
				File file = new File("config" + File.separator + "app.properties");
				FileInputStream inputStream = new FileInputStream(file);
				prop.load(inputStream);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return prop;
	}

	private static double connectToProvider(String URL) throws Exception {
		URL url = new URL(URL);

		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setDoOutput(true);
		connection.setRequestProperty("charset", "utf-8");
		connection.setRequestMethod("GET");

		StringBuilder sb = new StringBuilder();
		int HttpResult = connection.getResponseCode();
		if (HttpResult == HttpURLConnection.HTTP_OK) {
			BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
			String line;
			while ((line = br.readLine()) != null) {
				sb.append(line).append("\n");
			}
			br.close();
		} else {
			throw new Exception(connection.getResponseMessage());
		}

		TemperatureReadout readout = new Gson().fromJson(sb.toString(), TemperatureReadout.class);
		if (readout.getE().get(0) == null) {
			throw new RuntimeException("Provider did not send any MeasurementEntry.");
		} else {
			return readout.getE().get(0).getV();
		}
	}

	private static void postJsonFile(File jsonFile, String uri) {
		System.out.println("postJsonFile");

		URL url;

		// String attachmentName = ((File)selectionFirst).toString();
		// convert org.eclipse.core.internal.resources.File to java.io.File
		// java.io.File uploadFile = (java.io.File)selectionFirst;

		try {
			MultipartUtility multipartUtility = new MultipartUtility(uri, Charset.forName("UTF8").toString());
			multipartUtility.addFilePart("file", jsonFile);
			multipartUtility.finish();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
