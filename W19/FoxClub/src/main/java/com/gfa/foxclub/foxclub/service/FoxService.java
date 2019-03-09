package com.gfa.foxclub.foxclub.service;

import com.gfa.foxclub.foxclub.model.Fox;
import com.gfa.foxclub.foxclub.model.Trick;
import com.gfa.foxclub.foxclub.repository.FoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;

@Service
public class FoxService {

  private FoxRepository foxRepository;


  @Autowired
  public FoxService(FoxRepository foxRepository) {
    this.foxRepository = foxRepository;
  }

  public Fox loginAFox(String name) {
    Fox fox = foxRepository.findFoxByName(name);
    if (fox == null) {
      fox = new Fox(name);
      foxRepository.save(fox);
    }
    return fox;
  }

  public void feedTheFox(String name, String food, String drink) {
    Fox fox = foxRepository.findFoxByName(name);
    String currentFood = fox.getFood();
    String currentDrink = fox.getDrink();
    fox.setDrink(drink);
    fox.setFood(food);

    String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());

    String actionDrink = timestamp + " Drink has been changed from: " + currentDrink + " to " + drink + " .";
    String actionFood = timestamp + " Food has been changed from: " + currentFood + " to " + food + " .";
    fox.getActionHistory().add(actionDrink);
    fox.getActionHistory().add(actionFood);
  }

  public void teachTheFox(String name, String trickName) {
    Fox fox = foxRepository.findFoxByName(name);

    fox.getCompletedTricks().add(new Trick(trickName));

    String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
    String actionTrick = timestamp + "New skill added: " + trickName + " .";
    fox.getActionHistory().add(actionTrick);
  }

  public ArrayList<String> last5Action(String name) {
    Fox fox = foxRepository.findFoxByName(name);
    ArrayList<String> allAction = fox.getActionHistory();
    int numberOfActions = fox.getActionHistory().size();
    ArrayList<String> fiveLastAction = new ArrayList<>();

    if (numberOfActions >= 5) {
      for (int i = 0; i < 5; i++) {
        fiveLastAction.add(fox.getActionHistory().get(i));
      }
    }else fiveLastAction = allAction;
      return fiveLastAction;
  }

  public Fox searchFoxByName(String name) {
    return foxRepository.findFoxByName(name);
  }

}
