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

import org.eclipse.core.resources.IProject;
import org.eclipse.papyrus.designer.languages.common.extensionpoints.*;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Package;

public class ArrowHeadLangProjectSupport implements ILangProjectSupport {

	@Override
	public IProject createProject(String projectName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IProject createProject(String projectName, Package modelRoot) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSettings(IProject project, AbstractSettings settings) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AbstractSettings initialConfigurationData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void gatherConfigData(Classifier implementation, AbstractSettings settings) {
		// TODO Auto-generated method stub
		
	}


}
