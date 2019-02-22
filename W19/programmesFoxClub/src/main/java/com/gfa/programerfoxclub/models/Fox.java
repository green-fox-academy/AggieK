package com.gfa.programerfoxclub.models;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class Fox {

@Autowired
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

  public ArrayList<String> getTricksLearned() {
    return tricksLearned;
  }

  public void setTricksLearned(ArrayList<String> tricksLearned) {
    this.tricksLearned = tricksLearned;
  }

  public ArrayList<String> getFoodEaten() {
    return foodEaten;
  }

  public void setFoodEaten(ArrayList<String> foodEaten) {
    this.foodEaten = foodEaten;
  }

  public ArrayList<String> getDrinksDrunk() {
    return drinksDrunk;
  }

  public void setDrinksDrunk(ArrayList<String> drinksDrunk) {
    this.drinksDrunk = drinksDrunk;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
