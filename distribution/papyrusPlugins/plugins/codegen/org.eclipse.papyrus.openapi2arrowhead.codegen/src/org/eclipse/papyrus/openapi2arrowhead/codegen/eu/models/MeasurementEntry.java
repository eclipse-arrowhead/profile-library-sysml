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

//SenML format - expected response from the Provider client
public class MeasurementEntry {

  private String n;
  private double v;
  private double t;

  public MeasurementEntry() {
  }

  public MeasurementEntry(String n, double v, double t) {
    this.n = n;
    this.v = v;
    this.t = t;
  }

  public String getN() {
    return n;
  }

  public void setN(String n) {
    this.n = n;
  }

  public double getV() {
    return v;
  }

  public void setV(double v) {
    this.v = v;
  }

  public double getT() {
    return t;
  }

  public void setT(double t) {
    this.t = t;
  }

}
