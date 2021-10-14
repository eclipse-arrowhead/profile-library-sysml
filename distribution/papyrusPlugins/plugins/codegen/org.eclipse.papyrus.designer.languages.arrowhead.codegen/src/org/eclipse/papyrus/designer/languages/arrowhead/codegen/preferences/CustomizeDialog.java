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
package org.eclipse.papyrus.designer.languages.arrowhead.codegen.preferences;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.util.UMLUtil;

public class CustomizeDialog extends TitleAreaDialog  {
	
	private Text txtDescription;
	private Text txtTitle;
	private Text txtContactName;
	private Text txtContactEmail;
	
	private String description = "";
	private String api_title = "";
	private static String contactName = "";
	private static String contactEmail = "";

	public CustomizeDialog(Shell parentShell) {
		super(parentShell);
		// TODO Auto-generated constructor stub
	}
	
	public void create(Class clazz, boolean client) {
		String name = clazz.getName();
		setApi_title(name);
        super.create();
        setTitle(name);
        
        if (client) {
        	setMessage("This will be a client library", IMessageProvider.INFORMATION);
        } else {
        	setMessage("Personalize your service code", IMessageProvider.INFORMATION);
        }
    }
	
	public String getDescription() {
		return description;
	}

	public void setApi_title(String api_title) {
		this.api_title = api_title;
	}

	public String getTitle() {
		return api_title;
	}

	@Override
    protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);
        Composite container = new Composite(area, SWT.NONE);
        container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        GridLayout layout = new GridLayout(2, false);
        container.setLayout(layout);
        
        
        //Description
        Label lbldescription = new Label(container, SWT.NONE);
        lbldescription.setText("description:");
        
        txtDescription = new Text(container, SWT.BORDER);
        txtDescription.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        txtDescription.setText(description);
        txtDescription.addModifyListener(e -> {
            Text textWidget = (Text) e.getSource();
            String descriptionText = textWidget.getText();
            description = descriptionText;
        });
        
        
        //Title
        Label lbltitle = new Label(container, SWT.NONE);
        lbltitle.setText("title:");
        txtTitle = new Text(container, SWT.BORDER);
        txtTitle.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        txtTitle.setText(api_title);
        txtTitle.addModifyListener(e -> {
            Text textWidget = (Text) e.getSource();
            String titleText = textWidget.getText();
            api_title = titleText;
        });
        
        //Contact + Name + Email
        Group contact = new Group(container, SWT.NONE);
        contact.setText("Contact");
        GridLayout gridLayout = new GridLayout();
        gridLayout.numColumns = 2;
        contact.setLayout(gridLayout);
        GridData gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
        gridData.horizontalSpan = 2;
        contact.setLayoutData(gridData);
        //Contact name
        Label lblContactName = new Label(contact, SWT.NONE);
        lblContactName.setText("name:");
        txtContactName = new Text(contact, SWT.BORDER);
        txtContactName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        txtContactName.setText(contactName);
        txtContactName.addModifyListener(e -> {
            Text textWidget = (Text) e.getSource();
            String contactNameText = textWidget.getText();
            contactName = contactNameText;
        });
        //Contact Email
        Label lblContactEmail = new Label(contact, SWT.NONE);
        lblContactEmail.setText("email:");
        txtContactEmail = new Text(contact, SWT.BORDER);
        txtContactEmail.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        txtContactEmail.setText(contactEmail);
        txtContactEmail.addModifyListener(e -> {
            Text textWidget = (Text) e.getSource();
            String contactEmailText = textWidget.getText();
            contactEmail = contactEmailText;
        });
        
        
        return container;
    }
	
	public String getContactEmail() {
		return contactEmail;
	}

	public String getContactName() {
		return contactName;
	}
}
