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

public class OrchestrationForm {

  private ArrowheadService service;
  private ArrowheadSystem provider;
  private String serviceURI;
  private String instruction;
  private String authorizationToken;
  private String signature;

  public OrchestrationForm() {
  }

  public OrchestrationForm(ArrowheadService service, ArrowheadSystem provider, String serviceURI) {
    this.service = service;
    this.provider = provider;
    this.serviceURI = serviceURI;
  }

  public OrchestrationForm(ArrowheadService service, ArrowheadSystem provider, String serviceURI, String instruction, String authorizationToken,
                           String signature) {
    this.service = service;
    this.provider = provider;
    this.serviceURI = serviceURI;
    this.instruction = instruction;
    this.authorizationToken = authorizationToken;
    this.signature = signature;
  }

  public ArrowheadService getService() {
    return service;
  }

  public void setService(ArrowheadService service) {
    this.service = service;
  }

  public ArrowheadSystem getProvider() {
    return provider;
  }

  public void setProvider(ArrowheadSystem provider) {
    this.provider = provider;
  }

  public String getServiceURI() {
    return serviceURI;
  }

  public void setServiceURI(String serviceURI) {
    this.serviceURI = serviceURI;
  }

  public String getInstruction() {
    return instruction;
  }

  public void setInstruction(String instruction) {
    this.instruction = instruction;
  }

  public String getAuthorizationToken() {
    return authorizationToken;
  }

  public void setAuthorizationToken(String authorizationToken) {
    this.authorizationToken = authorizationToken;
  }

  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

}
