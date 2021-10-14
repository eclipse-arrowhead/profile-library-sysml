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
package org.eclipse.papyrus.designer.languages.arrowhead.codegen.utils;

import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.ParameterEffectKind;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl;

public class ParameterUtils {
	
	//Parameter effects
	final public static ParameterEffectKind CREATE = ParameterEffectKind.CREATE_LITERAL;
	final public static ParameterEffectKind READ = ParameterEffectKind.READ_LITERAL;
	final public static ParameterEffectKind DELETE = ParameterEffectKind.DELETE_LITERAL;
	final public static ParameterEffectKind UPDATE = ParameterEffectKind.UPDATE_LITERAL;
	
	//Parameter directions
	final public static ParameterDirectionKind IN = ParameterDirectionKind.IN_LITERAL;
	final public static ParameterDirectionKind INOUT = ParameterDirectionKind.INOUT_LITERAL;
	final public static ParameterDirectionKind OUT = ParameterDirectionKind.OUT_LITERAL;
	final public static ParameterDirectionKind RETURN = ParameterDirectionKind.RETURN_LITERAL;
	


	
}
