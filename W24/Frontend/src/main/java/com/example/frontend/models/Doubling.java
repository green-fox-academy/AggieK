package com.example.frontend.models;

public class Doubling {

  int received;
  int result;

  public Doubling(int received) {
    this.received = received;
    result = 2*received;
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
