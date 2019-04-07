package com.example.url.models;

import java.util.ArrayList;

public class MyURLList {
  private ArrayList<MyURL> entires;

  public MyURLList(ArrayList<MyURL> entires) {
    this.entires = entires;
  }

  public MyURLList(){}

  public ArrayList<MyURL> getEntires() {
    return entires;
  }

  public void setEntires(ArrayList<MyURL> entires) {
    this.entires = entires;
  }
}
