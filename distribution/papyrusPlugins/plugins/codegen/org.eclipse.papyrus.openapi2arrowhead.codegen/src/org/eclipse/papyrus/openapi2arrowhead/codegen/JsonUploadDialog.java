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

import org.eclipse.core.internal.resources.File;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class JsonUploadDialog extends Dialog {
	
	//path of file
	private String inputFilePath;
	private String inputFileName;
	
	//Variables
	private String portNumber;
	private String ipAdress;
	
	public JsonUploadDialog(Shell parentShell) {
		super(parentShell);
		// TODO Auto-generated constructor stub
	}
	protected Control createDialogArea(Composite parent){
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        GridLayout layout = new GridLayout(3, false);
        GridData data = new GridData();
        data.horizontalSpan = 3;
        container.setLayout(layout);
        container.setData(data);
        //File uploader service information
        Label lblInfo = new Label(container, SWT.NONE);
        lblInfo.setText("Upolad the informations about your file uploader service  :  ");
        
        //Port Number
        Label lblportNumber = new Label(container, SWT.NONE);
        lblportNumber.setText("Port Number : ");
        Text portNumberText;
        portNumberText = new Text(container, SWT.BORDER);
        portNumberText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        
        portNumberText.addModifyListener(e -> {
            Text textWidget = (Text) e.getSource();
            portNumber = textWidget.getText();
        });
//      //Ip Address 
//        Label lblIpAddress = new Label(container, SWT.NONE);
//        lblIpAddress.setText("IP Address : ");
//        Text ipAdressText;
//        ipAdressText = new Text(container, SWT.BORDER);
//        ipAdressText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
//        
//        ipAdressText.addModifyListener(e -> {
//            Text textWidget = (Text) e.getSource();
//            ipAdress = textWidget.getText();
//        });
        new Label(container, SWT.NONE);
        new Label(container, SWT.NONE);
        
		return parent;
	}
	@SuppressWarnings("restriction")
	public void init(File selectionFirst) {
		// TODO Auto-generated method stub
		inputFilePath = selectionFirst.getRawLocation().toString();
		inputFileName = selectionFirst.getName();
	}
	public String getInputFileName() {
		return inputFileName;
	}
	public String getInputFilePath() {
		return inputFilePath;
	}
	public String getPortNumber() {
		return portNumber;
	}
	
}
