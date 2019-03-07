package com.gfa.foxclub.foxclub.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;

@Repository
public class TrickRepository {
  private ArrayList<String> tricksToLearn;

  public TrickRepository() {
    this.tricksToLearn = new ArrayList<>(Arrays.asList("HTML", "Java", "Catching hens"));
  }

  public void addTrick(String trick){
    tricksToLearn.add(trick);
  }

  public ArrayList<String> getTricksToLearn() {
    return tricksToLearn;
  }

  public void setTricksToLearn(ArrayList<String> tricksToLearn) {
    this.tricksToLearn = tricksToLearn;
  }
}
