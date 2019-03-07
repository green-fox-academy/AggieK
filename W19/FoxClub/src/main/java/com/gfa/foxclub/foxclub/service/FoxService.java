package com.gfa.foxclub.foxclub.service;

import com.gfa.foxclub.foxclub.model.Fox;
import com.gfa.foxclub.foxclub.repository.FoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class FoxService {

  private FoxRepository foxRepository;


  @Autowired
  public FoxService(FoxRepository foxRepository){
    this.foxRepository = foxRepository;
  }

   public Fox loginAFox (String name) {
     Fox fox = foxRepository.findFoxByName(name);
     if (fox == null) {
       fox = new Fox(name);
       foxRepository.save(fox);
     }
     return fox;
   }

   public void feedTheFox(String name, String food, String drink){
    Fox fox = foxRepository.findFoxByName(name);
//    String currentFood = fox.getFood();
//    String currentDrink = fox.getDrink();
    fox.setDrink(drink);
    fox.setFood(food);
   }
}
