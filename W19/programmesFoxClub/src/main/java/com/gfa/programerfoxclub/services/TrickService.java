package com.gfa.programerfoxclub.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TrickService {

  private ArrayList<String> tricks;

  public TrickService(){
    this.tricks = new ArrayList<>();
  }

  public void addTricks(String newTrick){
    tricks.add(newTrick);
  }

  public ArrayList<String> listAllTricks(){
    return tricks;
  }

  public int tricksCounter(){
    return tricks.size();
  }

}
