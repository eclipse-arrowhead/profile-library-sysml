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

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.internal.resources.File;
import org.eclipse.jface.viewers.IStructuredSelection;

public class JSONTester extends PropertyTester {

	//The property to check
		public static final String IS_JSON = "isJSON";

		/**
		 * This method is mainly suitable for checking whether the right-clicked object satisfies the condition
		 *
		 * @param receiver the selected object
		 * @param property the property defined in the file plugin.xml
		 * @return the result of test
		 */
		@Override
		public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
			// TODO Auto-generated method stub
			
			if (IS_JSON.equals(property) && receiver instanceof IStructuredSelection){
				Object object = null;
				
				if (((IStructuredSelection)receiver).size() != 1){
					return false;
				}
				object = ((IStructuredSelection)receiver).getFirstElement();
				if (object != null){
					//System.out.println(object.getClass());
					if (object instanceof File) {
						@SuppressWarnings("restriction")
						String extension = ((File) object).getFileExtension();
						
						if (extension.equals("json")) {
							return true;
						}
					}
				}
			}
			return false;
		}

}
