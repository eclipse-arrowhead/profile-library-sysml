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

import java.util.ArrayList;
import java.util.List;

//SenML format - expected response from the Provider client
public class TemperatureReadout {

  private String bn;
  private double bt;
  private String bu;
  private int ver;
  private List<MeasurementEntry> e = new ArrayList<>();

  public TemperatureReadout() {
  }

  public TemperatureReadout(String bn, double bt, String bu, int ver) {
    this.bn = bn;
    this.bt = bt;
    this.bu = bu;
    this.ver = ver;
  }

  public TemperatureReadout(String bn, double bt, String bu, int ver, List<MeasurementEntry> e) {
    super();
    this.bn = bn;
    this.bt = bt;
    this.bu = bu;
    this.ver = ver;
    this.e = e;
  }

  public String getBn() {
    return bn;
  }

  public void setBn(String bn) {
    this.bn = bn;
  }

  public double getBt() {
    return bt;
  }

  public void setBt(double bt) {
    this.bt = bt;
  }

  public String getBu() {
    return bu;
  }

  public void setBu(String bu) {
    this.bu = bu;
  }

  public int getVer() {
    return ver;
  }

  public void setVer(int ver) {
    this.ver = ver;
  }

  public List<MeasurementEntry> getE() {
    return e;
  }

  public void setE(List<MeasurementEntry> e) {
    this.e = e;
  }

}
