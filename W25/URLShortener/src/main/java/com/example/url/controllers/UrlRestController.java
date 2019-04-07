package com.example.url.controllers;

import com.example.url.models.MyURLList;
import com.example.url.service.MyURLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlRestController {

  private MyURLService myURLService;

  public UrlRestController(MyURLService myURLService) {
    this.myURLService = myURLService;
  }

  @Autowired


@GetMapping("/api/links")
  public MyURLList listTheURLs(){
  return myURLService.createMyURLList();
}


}
