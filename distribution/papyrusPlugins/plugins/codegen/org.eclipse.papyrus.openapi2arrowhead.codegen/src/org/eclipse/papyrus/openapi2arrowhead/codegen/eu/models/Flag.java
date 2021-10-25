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

public enum Flag {
	
	//=================================================================================================
	// elements
	
	MATCHMAKING("matchmaking"),
	METADATA_SEARCH("metadataSearch"),
	ONLY_PREFERRED("onlyPreferred"),
	PING_PROVIDERS("pingProviders"),
	OVERRIDE_STORE("overrideStore"),
	TRIGGER_INTER_CLOUD("triggerInterCloud"),
	EXTERNAL_SERVICE_REQUEST("externalServiceRequest"),
	ENABLE_INTER_CLOUD("enableInterCloud"),
	ENABLE_QOS("enableQoS");
	
	//=================================================================================================
	// members
	
	private final String flag;
	
	//=================================================================================================
	// methods
	
	//-------------------------------------------------------------------------------------------------
	public String getFlag() { return flag; }
	
	//-------------------------------------------------------------------------------------------------
	@Override
	public String toString() {
		return getFlag();
	}
	
	//=================================================================================================
	// assistant methods
	
	//-------------------------------------------------------------------------------------------------
	private Flag(final String flag) {
		this.flag = flag;
	}
}