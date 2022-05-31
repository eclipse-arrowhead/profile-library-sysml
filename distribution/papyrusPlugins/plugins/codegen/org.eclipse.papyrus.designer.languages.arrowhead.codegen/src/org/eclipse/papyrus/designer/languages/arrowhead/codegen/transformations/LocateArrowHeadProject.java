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
package org.eclipse.papyrus.designer.languages.arrowhead.codegen.transformations;

import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourceAttributes;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.papyrus.designer.languages.arrowhead.codegen.Activator;
import org.eclipse.papyrus.designer.languages.common.base.TestInfo;
import org.eclipse.papyrus.designer.languages.common.extensionpoints.ILangProjectSupport;
import org.eclipse.papyrus.designer.languages.common.extensionpoints.LanguageProjectSupport;
import org.eclipse.papyrus.uml.tools.utils.PackageUtil;
import org.eclipse.swt.widgets.Display;

public class LocateArrowHeadProject {
	
	private static final boolean Headless = TestInfo.runsHeadless();

	public static IProject getTargetProject(PackageableElement pe, boolean createIfMissing) {
		
		Package rootPkg = PackageUtil.getRootPackage(pe);

		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();

		org.eclipse.papyrus.designer.languages.common.profile.Codegen.Project projectStereo =
				UMLUtil.getStereotypeApplication(rootPkg, org.eclipse.papyrus.designer.languages.common.profile.Codegen.Project.class);
		
		String projectName;
		if (projectStereo != null) {
			projectName = projectStereo.getProjectName();
		}
		else {
			projectName = rootPkg.getName(); //$NON-NLS-1$
		}
		IProject modelProject = root.getProject(projectName);
		
		
		if (!modelProject.exists()) {
			if (Headless)
			{
				try {
					modelProject.create(null);
				} catch (CoreException e) {
					return null;
				}
			}
			else {
				/*
				boolean create = createIfMissing && openQuestion(
						"Create ArrowHead project?",
						String.format("Create ArrowHead project with name %s? ", projectName));
						*/
				if (createIfMissing) {
					// TODO - there is no Python project support yet, projectSupport will always throw an exception
					//  => create PythonProjectSupport
					try {
						/*ILangProjectSupport projectSupport = LanguageProjectSupport.getProjectSupport("yaml"); //$NON-NLS-1$
						modelProject = projectSupport.createProject(projectName);
						projectSupport.setSettings(modelProject, projectSupport.initialConfigurationData());
						if (modelProject == null) {
							return null;
						}
						*/
						IProject[] projects = root.getProjects();
						for (IProject project : projects) {
							if (project.getFile(projectName+".di").exists()) {
								modelProject = project;
							}
						}
					}
					catch (Exception e) {
						// create standard project
						IProgressMonitor progressMonitor = new NullProgressMonitor();
						try {
							modelProject.create(progressMonitor);
						} catch (CoreException ce) {
							Activator.log.error(ce);
						}
					}
				}
				else {
					return null;
				}
			}
			
		}
		
		// Make sure the target project is open. If it was just created then it is likely open,
		// however if it is an old project then it could have been closed.
		if (!modelProject.isOpen()) {
			try {
				modelProject.open(null);
			} catch (CoreException e) {
				return null;
			}
		}
		
		// Create generate Folder
		IProgressMonitor monitor = new NullProgressMonitor();
		try {
			IContainer target = modelProject.getProject().getFolder("openapi-gen");
			if (!target.getLocation().toFile().exists()) {
				target.getLocation().toFile().mkdirs();
			}
			target.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		monitor.done();
		return modelProject;
	}
	
	private static boolean openQuestion(final String title, final String message)
	{
		final boolean[] ret = new boolean[] { false };
		Display.getDefault().syncExec(new Runnable() {
			@Override
			public void run() {
				ret[0] = MessageDialog.openQuestion(Display.getCurrent().getActiveShell(), title, message);
			}
		});
		return ret[0];
	}
}
