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
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.List;
/**
 * A widget to choose where to export the file with a given name
 * 
 * @author yining.huang
 * @version 1.0
 */
public class OpenAPIGeneratorDialog extends Dialog{
	
	//path of file
	private String inputFilePath;
	private String outputDirectoryPath = "";
	
	//Variables
	private String combo_str;
	private String inputFile;
	private String outputDirectory;
	private String rootPackageName;
	private String articactId;
	private static String groupId = "";
	private String artifactVersion;
	private String inputFileName;
	
	
	public OpenAPIGeneratorDialog(Shell parentShell) {
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
        //Project Nature
        Label lblProjectNature = new Label(container, SWT.NONE);
        lblProjectNature.setText("Project nature :  ");
        
        Combo combo;
        combo = new Combo(container, SWT.NONE);
        combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        combo.add("spring");
        combo.add("java");
        if (inputFilePath.contains("service")) {
        	combo.setText("spring");
        } else if(inputFilePath.contains("client")) {
        	combo.setText("java");
        }
        combo_str = combo.getText();
        combo.addModifyListener(e -> {
            Combo textWidget = (Combo) e.getSource();
            combo_str = textWidget.getText();
            System.out.print(combo_str);
        });
        new Label(container, SWT.NONE);
        
        //Input File
        Label lblInputFile = new Label(container, SWT.NONE);
        lblInputFile.setText("Input File : ");
        Text inputFileText;
        inputFileText = new Text(container, SWT.BORDER);
        inputFileText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        inputFileText.setText(inputFilePath);
        inputFileText.addModifyListener(e -> {
            Text textWidget = (Text) e.getSource();
            inputFile = textWidget.getText();
        });
        new Label(container, SWT.NONE);
        
        //Out Director
        Label lbloutDirectory = new Label(container, SWT.NONE);
        lbloutDirectory.setText("Output Directory : ");
        Text outDirectory;
        outDirectory = new Text(container, SWT.BORDER);
        outDirectory.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        Button button1 = new Button(container, SWT.PUSH);
        button1.setText("Choose directory");
        new Label(container, SWT.NONE);
        new Label(container, SWT.NONE);
        new Label(container, SWT.NONE);
        button1.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
            	DirectoryDialog dialog = new DirectoryDialog(getShell(), SWT.OPEN);
            	dialog.setText(inputFileName);
        		outputDirectoryPath = dialog.open();
        		outDirectory.setText(outputDirectoryPath);
        		System.out.println(outputDirectoryPath);
            }
        });
        outDirectory.addModifyListener(e -> {
            Text textWidget = (Text) e.getSource();
            outputDirectoryPath = textWidget.getText();
        });
        outputDirectory = outputDirectoryPath;
        
        //Additional Properties 
        Group additionalProperties = new Group(container, SWT.NONE);
        additionalProperties.setText("Additional Properties");
        GridLayout gridLayout = new GridLayout();
        gridLayout.numColumns = 4;
        additionalProperties.setLayout(gridLayout);
        GridData gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
        gridData.horizontalSpan = 2;
        additionalProperties.setLayoutData(gridData);
        new Label(additionalProperties, SWT.NONE);
        new Label(additionalProperties, SWT.NONE);
        
        //Root Package Name
        Label lblRootPackageName = new Label(additionalProperties, SWT.NONE);
        lblRootPackageName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        lblRootPackageName.setText("Root Package Name : ");
        Text txtRootPackageName;
        txtRootPackageName = new Text(additionalProperties, SWT.BORDER);
        txtRootPackageName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        txtRootPackageName.addModifyListener(e -> {
            Text textWidget = (Text) e.getSource();
            rootPackageName = textWidget.getText();
        });
        new Label(additionalProperties, SWT.NONE);
        new Label(additionalProperties, SWT.NONE);
        //Group ID
        Label lblGroupId = new Label(additionalProperties, SWT.NONE);
        lblGroupId.setText("Group ID : ");
        Text txtGroupId;
        txtGroupId = new Text(additionalProperties, SWT.BORDER);
        txtGroupId.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        txtGroupId.setText(groupId);
        txtGroupId.addModifyListener(e -> {
            Text textWidget = (Text) e.getSource();
            groupId = textWidget.getText();
        });
        new Label(additionalProperties, SWT.NONE);
        new Label(additionalProperties, SWT.NONE);
        //Artifact ID
        Label lblArtifactId = new Label(additionalProperties, SWT.NONE);
        lblArtifactId.setText("Artifact ID : ");
        Text txtArticactId;
        txtArticactId = new Text(additionalProperties, SWT.BORDER);
        txtArticactId.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        txtArticactId.addModifyListener(e -> {
            Text textWidget = (Text) e.getSource();
            articactId = textWidget.getText();
        });
        new Label(additionalProperties, SWT.NONE);
        new Label(additionalProperties, SWT.NONE);
        Label lblArtifactVersion = new Label(additionalProperties, SWT.NONE);
        lblArtifactVersion.setText("Artifact Version : ");
        Text txtArtifactVersion;
        txtArtifactVersion = new Text(additionalProperties, SWT.BORDER);
        txtArtifactVersion.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        txtArtifactVersion.setText("1.0.0");
        txtArtifactVersion.addModifyListener(e -> {
            Text textWidget = (Text) e.getSource();
            artifactVersion = textWidget.getText();
        });
        new Label(container, SWT.NONE);
        
        
		return parent;
	}
	public String getoutputDirectoryPath() {
		return outputDirectoryPath;
	}

	// to change the title
	 @Override
	    protected void configureShell(Shell newShell) {
	        super.configureShell(newShell);
	        newShell.setText("Save project");
	    }
	 
	 //Set initial size
	    @Override
	    protected Point getInitialSize() {
	        return new Point(800, 500);
	    }

		@SuppressWarnings("restriction")
		public void init(File selectionFirst) {
			// TODO Auto-generated method stub
			inputFilePath = selectionFirst.getRawLocation().toString();
			inputFileName = selectionFirst.getName();
		}

		public String getInputFilePath() {
			return inputFilePath;
		}

		public String getOutputDirectoryPath() {
			return outputDirectoryPath;
		}

		public String getCombo_str() {
			return combo_str;
		}

		public String getInputFile() {
			return inputFile;
		}

		public String getOutputDirectory() {
			return outputDirectory;
		}

		public String getRootPackageName() {
			return rootPackageName;
		}

		public String getArticactId() {
			return articactId;
		}

		public String getGroupId() {
			return groupId;
		}

		public String getArtifactVersion() {
			return artifactVersion;
		}
		

}
