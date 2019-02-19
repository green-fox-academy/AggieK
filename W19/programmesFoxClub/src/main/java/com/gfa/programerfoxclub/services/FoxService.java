package com.gfa.programerfoxclub.services;

import com.gfa.programerfoxclub.models.Fox;

import java.util.HashMap;

public class FoxService {

  private HashMap<String, Fox>foxes;

  public FoxService(){
    this.foxes = new HashMap<>();
  }

  public void addNewFox(Fox fox){
    foxes.put(fox.getName(),fox);
  }

  public Fox foxSearcher (String name){
    Fox existingFox = null;
    if(foxes.containsKey(name)){
      existingFox=foxes.get(name);
      return existingFox;
    }
    else return new Fox(name);
  }
}
