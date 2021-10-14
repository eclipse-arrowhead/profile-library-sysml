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


package org.eclipse.papyrus.designer.languages.arrowhead.codegen;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.papyrus.designer.languages.arrowhead.codegen.transformations.ArrowHeadModelElementsCreator;
import org.eclipse.papyrus.designer.languages.arrowhead.codegen.transformations.LocateArrowHeadProject;
import org.eclipse.papyrus.designer.languages.common.base.ModelElementsCreator;
import org.eclipse.papyrus.designer.languages.common.extensionpoints.ILangCodegen;
import org.eclipse.papyrus.designer.languages.common.extensionpoints.MethodInfo;
import org.eclipse.papyrus.designer.languages.common.extensionpoints.SyncInformation;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PackageableElement;


/**
 * OpenAPI language support
 */

public class OpenAPILangCodegen implements ILangCodegen {
	
	protected ModelElementsCreator creator = null;
	
	protected IProject lastProject = null;

	@Override
	public String getDescription() {
		return "A generator for Arrowhead tools/OpenAPI.";
	}

	@Override
	public boolean isEligible(Element modelElement) {
		if (modelElement instanceof Classifier) {
			//////////////////////////////////////////////////////////////////
			// TODO check stereotype
			//////////////////////////////////////////////////////////////////
			return true;
		}
		return false;
	}

	@Override
	public String getSuffix(FILE_KIND fileKind) {
	//////////////////////////////////////////////////////////////////
	// TODO check json or yaml
	//////////////////////////////////////////////////////////////////
		return "yaml";
	}

	@Override
	public void generateCode(IProject project, PackageableElement element, IProgressMonitor monitor) {
		manageCreator(project, element);
		creator.createPackageableElement(element, monitor);
		
	}

	@Override
	public void cleanCode(IProject project, PackageableElement element, IProgressMonitor monitor) {
		manageCreator(project, element);
		creator.removePackageableElement(element, monitor);
	}
	
	@Override
	public IProject getTargetProject(PackageableElement pe, boolean createIfMissing) {
		return LocateArrowHeadProject.getTargetProject(pe, createIfMissing);
	}

	@Override
	public String getFileName(IProject project, NamedElement element) {
		manageCreator(project, element);
		return creator.getFileName(element);
	}
	
	protected void manageCreator(IProject project, Element element) {
		if ((project == null) && (element instanceof PackageableElement)) {
			project = getTargetProject((PackageableElement) element, false);
		}
		if ((creator == null) || (project != lastProject)) {
			lastProject = project;
			creator = new ArrowHeadModelElementsCreator(project);
		}
	}

	@Override
	public SyncInformation getSyncInformation(String methodName, String body) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MethodInfo getMethodInfo(NamedElement operationOrBehavior) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cleanCode(IProject project, PackageableElement element, List<String> keepFiles,
			IProgressMonitor monitor) {
		// TODO Auto-generated method stub
		
	}

}
