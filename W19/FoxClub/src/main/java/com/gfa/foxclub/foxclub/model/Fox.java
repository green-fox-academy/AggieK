package com.gfa.foxclub.foxclub.model;

import java.util.ArrayList;

public class Fox {

  private String name;
  public String food;
  public String drink;
  private ArrayList<Trick> completedTricks;

  public Fox(String name){
    this.name = name;
  }

  public Fox(String name, String food, String drink) {
    this.name = name;
    this.food = food;
    this.drink = drink;
  }

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
}
