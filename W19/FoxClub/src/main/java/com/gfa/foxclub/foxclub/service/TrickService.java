package com.gfa.foxclub.foxclub.service;

import com.gfa.foxclub.foxclub.model.Trick;
import com.gfa.foxclub.foxclub.repository.TrickRepository;
import com.gfa.foxclub.foxclub.service.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TrickService {
private TrickRepository trickRepository;

  @Autowired
  public TrickService(TrickRepository trickRepository) {
    this.trickRepository = trickRepository;
  }

  public ArrayList<String> displayTricks (){
    return trickRepository.getTricksToLearn();
  }

  public int trickCount(){
    return listOfTricks.size();
  }
}
