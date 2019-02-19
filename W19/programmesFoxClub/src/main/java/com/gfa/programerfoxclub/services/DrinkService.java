package com.gfa.programerfoxclub.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DrinkService {

  private ArrayList<String>drinks;

  public DrinkService(){
    this.drinks=new ArrayList<>();
  }

  public void addDrink(String newDrink){
    drinks.add(newDrink);
  }

  public ArrayList<String>listAllDrinks(){
    return drinks;
  }

}
