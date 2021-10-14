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

public class CloudRequestDTO{
	private String authenticationInfo	;
	private Integer gatekeeperRelayIds	; //[integer($int64)]
	private Integer gatewayRelayIds;//	[integer($int64)]
	private String name	;
	private Boolean neighbor;	
	private String operator	;
	private Boolean secure	;
	public String getAuthenticationInfo() {
		return authenticationInfo;
	}
	public void setAuthenticationInfo(String authenticationInfo) {
		this.authenticationInfo = authenticationInfo;
	}
	public Integer getGatekeeperRelayIds() {
		return gatekeeperRelayIds;
	}
	public void setGatekeeperRelayIds(Integer gatekeeperRelayIds) {
		this.gatekeeperRelayIds = gatekeeperRelayIds;
	}
	public Integer getGatewayRelayIds() {
		return gatewayRelayIds;
	}
	public void setGatewayRelayIds(Integer gatewayRelayIds) {
		this.gatewayRelayIds = gatewayRelayIds;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getNeighbor() {
		return neighbor;
	}
	public void setNeighbor(Boolean neighbor) {
		this.neighbor = neighbor;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public Boolean getSecure() {
		return secure;
	}
	public void setSecure(Boolean secure) {
		this.secure = secure;
	}
}

