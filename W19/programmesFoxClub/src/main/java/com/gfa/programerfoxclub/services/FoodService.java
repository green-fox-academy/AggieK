package com.gfa.programerfoxclub.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FoodService {

  private ArrayList<String> food;

  public FoodService(){
    this.food = new ArrayList<>();
  }

  public void addFood(String newFood){
    food.add(newFood);
  }

  public ArrayList<String> listAllFood(){
    return food;
  }
}
