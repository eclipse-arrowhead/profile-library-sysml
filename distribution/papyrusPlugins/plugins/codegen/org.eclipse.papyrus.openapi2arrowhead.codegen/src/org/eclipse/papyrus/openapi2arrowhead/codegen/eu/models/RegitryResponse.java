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

import java.math.BigInteger;

public class RegitryResponse {
	private String address;
	private String authenticationInfo;
	private String createdAt;
	private BigInteger id;
	private Integer port;
	private String systemName;
	private String updatedAt;
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAuthenticationInfo() {
		return authenticationInfo;
	}
	public void setAuthenticationInfo(String authenticationInfo) {
		this.authenticationInfo = authenticationInfo;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	public String getSystemName() {
		return systemName;
	}
	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}
	public String getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}
		

}
