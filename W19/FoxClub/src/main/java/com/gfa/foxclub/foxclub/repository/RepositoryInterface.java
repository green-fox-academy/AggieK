package com.gfa.foxclub.foxclub.repository;

import com.gfa.foxclub.foxclub.model.Fox;

import java.util.HashMap;

public interface RepositoryInterface {
  HashMap<String, Fox> displayAll();
  void save(Fox fox);
  Fox findFoxByName(String name);

}
