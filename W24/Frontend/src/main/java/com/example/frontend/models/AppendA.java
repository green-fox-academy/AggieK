package com.example.frontend.models;

public class AppendA {

  private String appendable;
  private String appended;

  public AppendA(String appendable) {
    this.appendable = appendable;
    appended = appendable + "a";
  }

  public String getAppendable() {
    return appendable;
  }

  public void setAppendable(String appendable) {
    this.appendable = appendable;
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
