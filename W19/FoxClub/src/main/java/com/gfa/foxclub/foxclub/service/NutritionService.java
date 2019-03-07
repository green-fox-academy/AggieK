package com.gfa.foxclub.foxclub.service;

import com.gfa.foxclub.foxclub.repository.NutritionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

@Service
public class NutritionService {

  private NutritionRepository nutritionRepository;

  @Autowired
  public NutritionService(NutritionRepository nutritionRepository) {
    this.nutritionRepository = nutritionRepository;
  }

  public ArrayList<String> displayFoods(){
    return nutritionRepository.getFoodsToChoose();
  }

  public ArrayList<String> displayDrinks(){
    return nutritionRepository.getDrinksToChoose();
  }

}
