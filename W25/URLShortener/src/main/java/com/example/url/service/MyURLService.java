package com.example.url.service;

import com.example.url.models.MyURL;
import com.example.url.repo.MyURLRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
