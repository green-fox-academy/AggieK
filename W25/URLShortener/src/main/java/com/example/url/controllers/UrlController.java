package com.example.url.controllers;

import com.example.url.models.MyURL;
import com.example.url.service.MyURLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class UrlController {

  MyURLService myURLService;

  public UrlController(MyURLService myURLService) {
    this.myURLService = myURLService;
  }

  @Autowired


  @GetMapping()
  public String renderMain() {
    return "main";
  }

  @PostMapping("/save-link")
  public String submitNewAlias(@ModelAttribute(name = "myURL") String myURL, @ModelAttribute(name = "alias") String alias, Model model) {
    if (myURLService.checkAlias(alias) == true) {
      MyURL newMyURL = new MyURL(myURL, alias);
      myURLService.saveNewMyURL(newMyURL);
      model.addAttribute("newMyURL", newMyURL);
      return "main_success";
    } else return "main_error";
  }

//  @GetMapping("/a/{alias}")
//  public String renderAliasPage(@PathVariable String alias){
//    if (myURLService.checkAlias(alias) == true) {
//      ArrayList<MyURL> myURLs = myURLService.findAliasByName(alias);
//    }
//
//  }


}
