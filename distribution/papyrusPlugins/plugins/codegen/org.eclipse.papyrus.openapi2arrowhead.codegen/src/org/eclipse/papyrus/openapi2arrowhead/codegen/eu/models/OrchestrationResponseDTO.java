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

package org.eclipse.papyrus.openapi2arrowhead.codegen.eu.models;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class OrchestrationResponseDTO implements Serializable {

	//=================================================================================================
	// members
	
	private static final long serialVersionUID = -7019947320156696116L;
	
	protected List<OrchestrationResultDTO> response = new ArrayList<>();
	
	//=================================================================================================
	// methods
	
	//-------------------------------------------------------------------------------------------------
	public OrchestrationResponseDTO() {}

	//-------------------------------------------------------------------------------------------------
	public OrchestrationResponseDTO(final List<OrchestrationResultDTO> response) {
		this.response = response != null ? response : List.of();
	}

	//-------------------------------------------------------------------------------------------------
	public List<OrchestrationResultDTO> getResponse() { return response; }

	//-------------------------------------------------------------------------------------------------
	public void setResponse(final List<OrchestrationResultDTO> response) {
		if (response != null) {
			this.response = response;
		}
	}
}