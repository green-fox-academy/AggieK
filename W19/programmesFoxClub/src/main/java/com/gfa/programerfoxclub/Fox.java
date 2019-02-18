package com.gfa.programerfoxclub;

import java.util.ArrayList;

public class Fox {

  private String name;

  private ArrayList<String> tricksLearned;
  private ArrayList<String> foodEaten;
  private ArrayList<String> drinksDrunk;

  public Fox(String name){
    this.name = name;
  }

  public void addTricks(String newTrick){
    tricksLearned.add(newTrick);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
