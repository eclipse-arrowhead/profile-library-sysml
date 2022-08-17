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

package org.eclipse.papyrus.designer.languages.arrowhead.codegen.ui.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.papyrus.designer.languages.arrowhead.codegen.transformations.ArrowHeadModelElementsCreator;
import org.eclipse.papyrus.uml.diagram.common.handlers.CmdHandler;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.PackageableElement;


public class GenerateCodeHandler extends CmdHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
		System.out.println("ArrowHead code generation handler is executed!");
		if (selectedEObject instanceof PackageableElement) {
			PackageableElement packageableElement = (PackageableElement) selectedEObject;
			
			IProject project = getCurrentProject();
			if (project != null) {
				//get the container for the current element
				ArrowHeadModelElementsCreator modelElementsCreator = new ArrowHeadModelElementsCreator(project);
				generate(modelElementsCreator, packageableElement);
			}
		}
		return null;
	}

	/**
	 * 
	 * @param modelElementsCreator
	 * @param packageableElement
	 */
	private void generate(ArrowHeadModelElementsCreator modelElementsCreator, PackageableElement packageableElement) {
		// TODO Auto-generated method stub
		modelElementsCreator.createPackageableElement(packageableElement, null, true);
	}

	private IProject getCurrentProject() {
		// TODO Auto-generated method stub
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		URI uri = selectedEObject.eResource().getURI();
		IProject project = root.getProject(uri.segment(1));
		return project;
	}
	
	@Override
	public boolean isEnabled() {
		updateSelectedEObject();
		return (selectedEObject instanceof Package || selectedEObject instanceof Classifier);		
	}

}
