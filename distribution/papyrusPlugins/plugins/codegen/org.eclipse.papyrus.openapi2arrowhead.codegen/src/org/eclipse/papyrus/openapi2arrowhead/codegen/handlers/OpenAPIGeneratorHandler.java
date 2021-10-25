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
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.internal.resources.File;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.osgi.framework.Bundle;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.papyrus.openapi2arrowhead.codegen.OpenAPIGeneratorDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class OpenAPIGeneratorHandler extends AbstractHandler {

	private String projectNature;
	private String inputFile;
	private String outputDirectory;
	private String rootPackageName;
	private String groupId;
	private String artifactId;
	private String artifactVersion;
	private List<String> listAddProp = new ArrayList<String>();
	private String addInfo = "--additional-properties=";
	
	//private String jarFilePath = "C:\\Users\\YH262742\\Documents\\OpenAPI Generator\\openapi-generator-cli.jar";
	private String jarFilePath;
	private BufferedReader error;
	private BufferedReader op;
	private int exitVal;
	
	@SuppressWarnings("restriction")
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		ISelection selection = window.getSelectionService().getSelection();
		Object selectionFirst = ((IStructuredSelection)selection).getFirstElement();
		OpenAPIGeneratorDialog eid = new OpenAPIGeneratorDialog(Display.getCurrent().getActiveShell());
		eid.init((File)selectionFirst);
		if (eid.open() == Window.OK) {
			this.projectNature = eid.getCombo_str();
			this.inputFile = eid.getInputFilePath();
			this.outputDirectory = eid.getoutputDirectoryPath();
			this.rootPackageName = eid.getRootPackageName();
			this.groupId = eid.getGroupId();
			this.artifactId = eid.getArticactId();
			this.artifactVersion = eid.getArtifactVersion();
		}
		
		final List<String> actualArgs = new ArrayList<String>();
		actualArgs.add("java");
	    actualArgs.add("-jar");
	    //looking for the jarFilePath 
	    Bundle bundle = Platform.getBundle("org.eclipse.papyrus.designer.languages.arrowhead.lib");

		if (bundle != null) {
			final URL extLibEclipseURL = FileLocator.find(bundle, new Path("/openapi-generator-cli-5.0.1.jar"), null);
			//final URL extLibEclipseURL = FileLocator.find(bundle, new Path("/openapi-generator-3.0.1.jar"), null);

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
						this.jarFilePath = jarFile.getPath();

					}
				}
			
		
	    
	    actualArgs.add("\""+this.jarFilePath+"\"");
	    
	    actualArgs.add("generate");
	    actualArgs.add("-g");
	    actualArgs.add(this.projectNature);
	    actualArgs.add("-o");
	    actualArgs.add("\""+this.outputDirectory+"\"");
	    actualArgs.add("-i");
	    actualArgs.add("\""+this.inputFile+"\"");
	    if (grabAdditionalInformation()) {
	    	for (String addprop : listAddProp) {
	    		addInfo = addInfo + addprop +",";
	    	}
	    	actualArgs.add(addInfo);
	    }
	    
	   
	        //final Runtime re = Runtime.getRuntime();
	        //final Process command = re.exec(cmdString, args.toArray(new String[0]));
	        String[] cmd = actualArgs.toArray(new String[0]);
	        System.out.println("here is the command"+cmd.toString());
	        ProcessBuilder pb = new ProcessBuilder(cmd);
	        final Process command = pb.start();
	        InputStream isInput = command.getInputStream();
	        int data = 0;
	        while ((data = isInput.read())!= -1) {
	        	//System.out.println((byte)data);
	        }
	        InputStream isErr = command.getErrorStream();
	        data = 0;
	        while ((data = isErr.read())!= -1) {
	        	//System.err.println((byte)data);
	        }
	        // Wait for the application to Finish
	        command.waitFor();
	        this.exitVal = command.exitValue();
	       // this.op=command.getOutputStream().flush();
	        this.error=new BufferedReader(new InputStreamReader(command.getErrorStream()));
	        System.out.println("exitVal: " + this.exitVal + ", error: " + error + ", output: " + this.op);
	        if (this.exitVal != 0) {
	            throw new IOException("Failed to execure jar, " + this.getExecutionLog());
	        }

	    } catch (final IOException | InterruptedException e) {
	    	e.printStackTrace();
	    }
		return null;
	}
		return null;
	}
	
	public String getExecutionLog() {
	    String error = "";
	    String line;
	    try {
	        while((line = this.error.readLine()) != null) {
	            error = error + "\n" + line;
	        }
	    } catch (final IOException e) {
	    }
	    String output = "";
	    try {
	        while((line = this.op.readLine()) != null) {
	            output = output + "\n" + line;
	        }
	    } catch (final IOException e) {
	    }
	    try {
	        this.error.close();
	        this.op.close();
	    } catch (final IOException e) {
	    }
	    return "exitVal: " + this.exitVal + ", error: " + error + ", output: " + output;
	}
	
	public boolean grabAdditionalInformation() {
		
		boolean add = false;
		if (!((rootPackageName == null)||(rootPackageName == ""))) {
			add = true;
			
			if(projectNature.matches("spring")) {
				listAddProp.add("invokerPackage="+rootPackageName +".api");
				listAddProp.add("apiPackage="+rootPackageName +".api");
				listAddProp.add("configPackage="+rootPackageName +".configuration");
				listAddProp.add("modelPackage="+rootPackageName +".model");
			} else if(projectNature.matches("java")) {
				listAddProp.add("invokerPackage="+rootPackageName +".client");
				listAddProp.add("apiPackage="+rootPackageName +".client.api");
				listAddProp.add("modelPackage="+rootPackageName +".client.model");
			}
		}
		if(!((groupId == null)||(groupId == ""))) {
			add = true;
			listAddProp.add("groupId="+groupId);
		}
		if (!((artifactId == null)||(artifactId == ""))) {
			add = true;
			listAddProp.add("artifactId="+artifactId);
		}
		if (!((artifactVersion == null)||(artifactVersion == ""))) {
			add = true;
			listAddProp.add("artifactVersion="+artifactVersion);
		}
		return add;
	}
}
