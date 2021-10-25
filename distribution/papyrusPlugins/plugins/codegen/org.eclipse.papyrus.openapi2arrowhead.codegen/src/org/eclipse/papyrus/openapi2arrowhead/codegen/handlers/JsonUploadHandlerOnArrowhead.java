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
package org.eclipse.papyrus.openapi2arrowhead.codegen.handlers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Properties;

import org.eclipse.core.commands.AbstractHandlerWithState;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.State;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.papyrus.openapi2arrowhead.codegen.FileUploaderConstants;
import org.eclipse.papyrus.openapi2arrowhead.codegen.JsonUploadDialog;
import org.eclipse.papyrus.openapi2arrowhead.codegen.JsonUploadToArrowheadDialog;
import org.eclipse.papyrus.openapi2arrowhead.codegen.MultipartUtility;
import org.eclipse.papyrus.openapi2arrowhead.codegen.eu.models.OrchestrationFormRequestDTO;
import org.eclipse.papyrus.openapi2arrowhead.codegen.eu.models.OrchestrationResponseDTO;
import org.eclipse.papyrus.openapi2arrowhead.codegen.eu.models.OrchestrationResultDTO;
import org.eclipse.papyrus.openapi2arrowhead.codegen.eu.models.ServiceQueryFormDTO;
import org.eclipse.papyrus.openapi2arrowhead.codegen.eu.models.SystemRequestDTO;
import org.eclipse.papyrus.openapi2arrowhead.codegen.eu.models.SystemResponseDTO;
import org.eclipse.papyrus.openapi2arrowhead.codegen.eu.models.TemperatureReadout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.handlers.HandlerUtil;


import com.google.gson.Gson;

public class JsonUploadHandlerOnArrowhead extends AbstractHandlerWithState {
	private static Properties prop;
//	private static final String ORCH_URI = getProp().getProperty("orch_uri",
//			"http://localhost:8441/orchestrator/orchestration");
	private static String orchURI = "http://localhost:8441/orchestrator/orchestration";
	private static String clientSystemName = "consumer_1";
	private static String clientSystemAddress = "127.0.0.1";
	private static Integer clientSystemPort = 8888;
	@Override
	public void handleStateChange(State state, Object oldValue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException{
		// TODO Auto-generated method stub
		MessageConsole myConsole = ConsoleManagement.findConsole(ConsoleManagement.AH_CONSOLE);
		MessageConsoleStream out = myConsole.newMessageStream();
		
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		ISelection selection = window.getSelectionService().getSelection();
		Object selectionFirst = ((IStructuredSelection) selection).getFirstElement();
		JsonUploadToArrowheadDialog jsonUploadToArrowheadDialog = new JsonUploadToArrowheadDialog(Display.getCurrent().getActiveShell());
		jsonUploadToArrowheadDialog.init((org.eclipse.core.internal.resources.File) selectionFirst);
		if (jsonUploadToArrowheadDialog.open() == Window.OK) {
			System.out.println("orchestrator URI : http://"+jsonUploadToArrowheadDialog.getOrchIpAddress()+":"+jsonUploadToArrowheadDialog.getOrchPortNumber()+"/orchestrator/orchestration");
			out.println("Sending Get request to the orchestrator: URI : http://"+jsonUploadToArrowheadDialog.getOrchIpAddress()+":"+jsonUploadToArrowheadDialog.getOrchPortNumber()+"/orchestrator/orchestration");
			JsonUploadHandlerOnArrowhead.orchURI = "http://"+jsonUploadToArrowheadDialog.getOrchIpAddress()+":"+jsonUploadToArrowheadDialog.getOrchPortNumber()+"/orchestrator/orchestration";
			JsonUploadHandlerOnArrowhead.clientSystemName = jsonUploadToArrowheadDialog.getClientSystemName();
			JsonUploadHandlerOnArrowhead.clientSystemAddress = jsonUploadToArrowheadDialog.getClientSystemAddress();
			JsonUploadHandlerOnArrowhead.clientSystemPort = Integer.parseInt(jsonUploadToArrowheadDialog.getClientSystemPort());
			
		}

		
		
		
		// payload is the request to send to the orchestrator
				
				OrchestrationFormRequestDTO orchestrationFormRequestDTO = createOrchestrationRequest();
				String payload = orchestrationFormRequestDTO.toString();
				Gson json = new Gson();
				String jsonRequest = json.toJson(orchestrationFormRequestDTO).toString();
				System.out.println("Sending this request form for the Orchestrator: " + jsonRequest);
				out.println("Request form for the Orchestrator: " + jsonRequest);
				
				// sendServiceRequest Sends payload to the orchestrator
				String providerURI;
				try {
					providerURI = sendServiceRequest(jsonRequest);
					// String providerURI = "http://localhost:8888/uploadFile";
					System.out.println("Received provider system URL: " + providerURI);
					out.println("Received provider system URL: " + providerURI);
										
					// auth rule

					// upload File
					postJsonFile(selectionFirst, providerURI);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					out.println(e.getMessage());
					
				}
				
		return null;
	}
private static String sendServiceRequest(String payload) throws Exception {
		MessageConsole myConsole = ConsoleManagement.findConsole(ConsoleManagement.AH_CONSOLE);
		MessageConsoleStream out = myConsole.newMessageStream();
	
		URL url = new URL(orchURI);

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
		out.println("Orchestrator response : "  + sb.toString());
		
		
		OrchestrationResponseDTO orchestrationResponse = new Gson().fromJson(sb.toString(), OrchestrationResponseDTO.class);
		out.println("Orchestrator response : " + orchestrationResponse.toString());
		OrchestrationResultDTO orchestrationResult = orchestrationResponse.getResponse().get(0);
		SystemResponseDTO provider = orchestrationResult.getProvider();
		out.println("System Provider Information");
		out.println("- Provider Id : "  + provider.getId());
		out.println("- Provider systemName : "  + provider.getSystemName());
		out.println("- Provider address : "  + provider.getAddress());
		out.println("- Provider port : "  + provider.getPort());
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
	
	thisSystem.setSystemName(clientSystemName);
	
	thisSystem.setAddress(clientSystemAddress);
	  
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

//	private static void postJsonFile(File jsonFile, String uri) {
//		System.out.println("postJsonFile");
//
//		URL url;
//
//		// String attachmentName = ((File)selectionFirst).toString();
//		// convert org.eclipse.core.internal.resources.File to java.io.File
//		// java.io.File uploadFile = (java.io.File)selectionFirst;
//
//		try {
//			MultipartUtility multipartUtility = new MultipartUtility(uri, Charset.forName("UTF8").toString());
//			multipartUtility.addFilePart("file", jsonFile);
//			multipartUtility.finish();
//
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
	private void postJsonFile(Object selectionFirst, String uri) {
		System.out.println("postJsonFile");
		

		// String attachmentName = ((File)selectionFirst).toString();
		// convert org.eclipse.core.internal.resources.File to java.io.File
		// java.io.File uploadFile = (java.io.File)selectionFirst;
		URI uriResource = ((org.eclipse.core.internal.resources.File) selectionFirst).getLocationURI();
		System.out.println("uriResource : " + uriResource.toString());
		java.io.File jsonFile = new java.io.File(uriResource);
		MessageConsole myConsole = ConsoleManagement.findConsole(ConsoleManagement.AH_CONSOLE);
		MessageConsoleStream out = myConsole.newMessageStream();

		//String attachmentFileName = selectionFirst.toString();
		try {
			MultipartUtility multipartUtility = new MultipartUtility(uri, Charset.forName("UTF8").toString());
			multipartUtility.addFilePart("file", jsonFile);
			multipartUtility.finish();
			
			out.println(" *** Your Json File was successfully uploaded to "+ uri +" ***");
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
