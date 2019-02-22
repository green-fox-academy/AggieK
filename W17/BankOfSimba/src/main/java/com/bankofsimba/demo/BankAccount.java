package com.bankofsimba.demo;

public class BankAccount {

  private String name;
  private int balance;
  private String animalType;
  private boolean royalStatus;
  private boolean goodOrBad;

//  public boolean isRoyalStatus() {
//    return royalStatus;
//  }
//
//  public void setRoyalStatus(boolean royalStatus) {
//    this.royalStatus = royalStatus;
//  }
//
//  public boolean isGoodOrBad() {
//    return goodOrBad;
//  }

  public void setGoodOrBad(boolean goodOrBad) {
    this.goodOrBad = goodOrBad;
  }

  public BankAccount(String name, int balance, String animalType, boolean royalStatus, boolean goodOrBad) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.royalStatus = royalStatus;
    this.goodOrBad = goodOrBad;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public boolean isRoyalStatus() {
    return royalStatus;
  }

  public void setRoyalStatus(boolean royalStatus) {
    this.royalStatus = royalStatus;
  }

  public boolean isGoodOrBad() {
    return goodOrBad;
  }
}
