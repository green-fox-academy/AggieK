package com.example.url.service;

import com.example.url.models.MyURL;
import com.example.url.models.MyURLList;
import com.example.url.repo.MyURLRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyURLService {

   MyURLRepo myURLRepo;

   @Autowired

  public MyURLService(MyURLRepo myURLRepo) {
    this.myURLRepo = myURLRepo;
  }

  public void saveNewMyURL(MyURL myURL){
     myURLRepo.save(myURL);
  }

//  public ArrayList checkAlias(String alias){
//     myURLRepo.findByName(alias);
//  }

  public ArrayList<MyURL> findAllMyURL(){
     ArrayList<MyURL> myURLS = new ArrayList<>();
     myURLRepo.findAll().forEach(myURLS::add);
     return myURLS;
  }

  public boolean checkAlias(String alias){
     if (alias != null){
       ArrayList<MyURL> myURLS = findAllMyURL();
       for(MyURL myURL:myURLS){
         if (myURL.getAlias().equalsIgnoreCase(alias)){
           return false;
         }
       }
     }
     return true;
  }

  public ArrayList<MyURL> findAliasByName(String alias){
     return myURLRepo.findByAliasContaining(alias);
  }


  public MyURLList createMyURLList() {
     ArrayList<MyURL> entries = findAllMyURL();
     return new MyURLList(entries);
  }
}
