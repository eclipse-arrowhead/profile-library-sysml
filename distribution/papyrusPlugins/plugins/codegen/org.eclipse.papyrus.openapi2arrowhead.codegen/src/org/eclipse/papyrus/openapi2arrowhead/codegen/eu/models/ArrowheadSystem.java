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

public class ArrowheadSystem {

  private String systemName;
  private String address;
  private int port;
  private String authenticationInfo;

  public ArrowheadSystem() {
  }

  public ArrowheadSystem(String systemName, String address, int port, String authenticationInfo) {
    this.systemName = systemName;
    this.address = address;
    this.port = port;
    this.authenticationInfo = authenticationInfo;
  }

  public String getSystemName() {
    return systemName;
  }

  public void setSystemName(String systemName) {
    this.systemName = systemName;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getPort() {
    return port;
  }

  public void setPort(int port) {
    this.port = port;
  }

  public String getAuthenticationInfo() {
    return authenticationInfo;
  }

  public void setAuthenticationInfo(String authenticationInfo) {
    this.authenticationInfo = authenticationInfo;
  }

  public boolean isValid() {
    return systemName != null && address != null;
  }

  public boolean isValidForDatabase() {
    return systemName != null;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    ArrowheadSystem that = (ArrowheadSystem) o;

    if (!systemName.equals(that.systemName)) {
      return false;
    }
    return address.equals(that.address);
  }

  @Override
  public int hashCode() {
    int result = systemName.hashCode();
    result = 31 * result + address.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "\"" + systemName + "\"";
  }

}
