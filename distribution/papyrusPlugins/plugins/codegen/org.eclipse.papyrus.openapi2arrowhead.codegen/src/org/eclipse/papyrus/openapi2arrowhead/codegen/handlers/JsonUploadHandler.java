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
import java.io.DataOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.Builder;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandlerWithState;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.State;
import org.eclipse.core.internal.resources.File;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.papyrus.openapi2arrowhead.codegen.JsonUploadDialog;
import org.eclipse.papyrus.openapi2arrowhead.codegen.MultipartUtility;
import org.eclipse.papyrus.openapi2arrowhead.codegen.OpenAPIGeneratorDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.osgi.framework.Bundle;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;


import com.sun.source.tree.WhileLoopTree;

public class JsonUploadHandler extends AbstractHandlerWithState {

	private String portNumber;
	private String jarFilePath = "jar/springboot-file-uploader-0.0.1-SNAPSHOT.jar";

	// private String jarFilePath = "C:\\Users\\ft238791\\git\\SysML-AHT\\Arrowhead
	// Codegen\\org.eclipse.papyrus.openapi2arrowhead.codegen\\jar\\springboot-file-uploader-0.0.1-SNAPSHOT.jar";

	private int exitVal;
	private BufferedReader error;

	@Override
	public void handleStateChange(State state, Object oldValue) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub

		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		ISelection selection = window.getSelectionService().getSelection();
		Object selectionFirst = ((IStructuredSelection) selection).getFirstElement();
		JsonUploadDialog jsonUploaderDialog = new JsonUploadDialog(Display.getCurrent().getActiveShell());
//		java.io.File jsonFile = new java.io.File(selectionFirst.toString());
		jsonUploaderDialog.init((File) selectionFirst);
		if (jsonUploaderDialog.open() == Window.OK) {
			this.portNumber = jsonUploaderDialog.getPortNumber();
		}

		if (serviceAvailable()) {
			// Post json File
			System.out.println("the service is available");
			System.out.println("selectionFirst : " + selectionFirst.toString());
			postJsonFile(selectionFirst);
		} else {
			// execute the jar
			System.out.println("the service is not available");
			Runnable runnable = () ->{
				System.out.println("executing the jar file");
				executeJar();
			};
			Thread t = new Thread(runnable);
			t.start();
			// Waiting for the server to start
			try {
				Thread.sleep(3000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int compteur = 0;
			// Post json File
			// Waiting for the server to start 
			while (!serviceAvailable() && compteur <20){
				compteur++;
				try {
					Thread.sleep(1000);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(serviceAvailable()) {
				postJsonFile(selectionFirst);
			}else {
				System.out.println("the server encountered a problem to start...");
			}
		
		}

		return null;
	}

	private void executeJar() {
		List<String> cmdList = new ArrayList<String>();
		cmdList.add("java");
		cmdList.add("-jar");
		// TODO test the port number
		// assign the input port number
		cmdList.add("-Dserver.port=" + this.portNumber);

		// construct the jar file path
		// String
		String workSpaceRootpath = this.getClass().getProtectionDomain().getCodeSource().getLocation().getPath();
		String jarFileAbsolutPath = workSpaceRootpath+jarFilePath;
		System.out.println("jarFileAbsolutPath Path :"+jarFileAbsolutPath);
		Bundle bundle = Platform.getBundle("org.eclipse.papyrus.designer.languages.arrowhead.lib");

		if (bundle != null) {
			final URL extLibEclipseURL = FileLocator.find(bundle, new Path("/springboot-file-uploader-0.0.1.jar"), null);

			String extLibURL = null;
			try {
				URL fileURL = FileLocator.toFileURL(extLibEclipseURL);
				if (fileURL != null) {
					extLibURL = fileURL.toString();
					System.out.println("extLibURL :"+extLibURL.toString());
					if (extLibURL != null) {
						
						extLibURL = extLibURL.replaceAll("file:/", "");
						// find the jar
						java.io.File jarFile = new java.io.File(extLibURL);
						System.out.println("existe :"+jarFile.exists() +" jarFile Path :"+jarFile.toString());
						cmdList.add("\""+jarFile.getPath()+"\"");

					}
				}

				
				String[] cmd = cmdList.toArray(new String[0]);
				System.out.println("jar file executed cmd:"+ cmd);
				
				ProcessBuilder processBuilder = new ProcessBuilder();
				processBuilder.command(cmd);

				final Process process = processBuilder.start();
				InputStream isInput = process.getInputStream();
				int data = 0;
//				while ((data = isInput.read()) != -1) {
//					System.out.println((byte) data);
//				}
//				InputStream isErr = process.getErrorStream();
//				// Wait for the application to Finish
//
//				int exitCode = process.waitFor();
//				System.out.println("\nExited with error code : " + exitCode);
				BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
				String line;
				MessageConsole myConsole = ConsoleManagement.findConsole(ConsoleManagement.AH_CONSOLE);
				MessageConsoleStream out = myConsole.newMessageStream();
				out.println(" *** Your Json File was successfully uploaded to http://localhost:" + this.portNumber + "/uploadFile/ ***");
				

				while ((line = reader.readLine()) != null) {
					System.out.println(line);
					out.println(line);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}

	}

	private boolean serviceAvailable() {
		String uri = "http://localhost:" + this.portNumber + "/downloadFile/";

		try {

			URL url = new URL(uri);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
//                throw new RuntimeException("Failed : HTTP Error code : "
//                        + conn.getResponseCode());
				conn.disconnect();
				return false;
			}
			conn.disconnect();
			return true;
		} catch (Exception e) {
			System.out.println("Relancement du service ");
			
		}
		return false;
	}

	private void postJsonFile(Object selectionFirst) {
		System.out.println("postJsonFile");
		String uri = "http://localhost:" + this.portNumber + "/uploadFile/";
		URL url;

		
		MessageConsole myConsole = ConsoleManagement.findConsole(ConsoleManagement.AH_CONSOLE);
		MessageConsoleStream out = myConsole.newMessageStream();
		out.println(" *** Your Json File was successfully uploaded to http://localhost:" + this.portNumber + "/uploadFile/ ***");
		
		// String attachmentName = ((File)selectionFirst).toString();
		// convert org.eclipse.core.internal.resources.File to java.io.File
		// java.io.File uploadFile = (java.io.File)selectionFirst;
		URI uriResource = ((File) selectionFirst).getLocationURI();
		System.out.println("uriResource : " + uriResource.toString());
		java.io.File jsonFile = new java.io.File(uriResource);

		String attachmentFileName = selectionFirst.toString();
		try {
			MultipartUtility multipartUtility = new MultipartUtility(uri, Charset.forName("UTF8").toString());
			multipartUtility.addFilePart("file", jsonFile);
			multipartUtility.finish();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			out.println("test +++++++"+e.getMessage());

		}

	}

	public String getExecutionLog() {
		String error = "";
		String line;
		try {
			while ((line = this.error.readLine()) != null) {
				error = error + "\n" + line;
			}
		} catch (final IOException e) {
		}
		// String output = "";
//	    try {
//	        while((line = this.op.readLine()) != null) {
//	            output = output + "\n" + line;
//	        }
//	    } catch (final IOException e) {
//	    }
		try {
			this.error.close();
			// this.op.close();
		} catch (final IOException e) {
		}
		// return "exitVal: " + this.exitVal + ", error: " + error + ", output: " +
		// output;
		return "exitVal: " + this.exitVal + ", error: " + error;
	}

}
