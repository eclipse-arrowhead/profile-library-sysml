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

import org.eclipse.papyrus.infra.core.log.LogHelper;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
	
	private static BundleContext context;

	public static LogHelper log;

	static BundleContext getContext() {
		return context;
	}

	@Override
	public void start(BundleContext bundleContext) throws Exception {
		// TODO Auto-generated method stub
		Activator.context = bundleContext;
		log = new LogHelper(context.getBundle());
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		Activator.context = null;
	}

}
