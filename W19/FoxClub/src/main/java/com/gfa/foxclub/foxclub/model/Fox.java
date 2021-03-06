package com.gfa.foxclub.foxclub.model;

import java.util.ArrayList;

public class Fox {

  private String name;
  public String food;
  public String drink;
  private ArrayList<Trick> completedTricks = new ArrayList<>();
  private ArrayList<String> actionHistory = new ArrayList<>();

  public Fox(){
    this.name = name;
    this.food = "brisket";
    this.drink = "wine";
  }

  public Fox(String name) {
    this.name = name;
    this.food = "brisket";
    this.drink = "wine";
  }

//  public int trickCounter(){
//    return completedTricks.size();
//  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public ArrayList<Trick> getCompletedTricks() {
    return completedTricks;
  }

  public void setCompletedTricks(ArrayList<Trick> completedTricks) {
    this.completedTricks = completedTricks;
  }

  public ArrayList<String> getActionHistory() {
    return actionHistory;
  }

  public void setActionHistory(ArrayList<String> actionHistory) {
    this.actionHistory = actionHistory;
  }
}
