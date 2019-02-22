package com.gfa.programerfoxclub.controllers;

import com.gfa.programerfoxclub.models.Fox;
import com.gfa.programerfoxclub.services.FoxService;
import com.gfa.programerfoxclub.services.TrickService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class controller {

  private FoxService foxService;
  private TrickService trickService;

  @GetMapping("/login")
  public String renderLogin(){
    return "login";
  }

  @RequestMapping(value = "login", method = RequestMethod.POST)
  public String postLoginForm(@RequestParam(name = "name") String name, Model model){
    Fox fox =foxService.foxSearcher(name);
    model.addAttribute("foxy", name);
    model.addAttribute("trickCounter", trickService.tricksCounter());
    return "redirect:/information/?name="+name;
  }

  @GetMapping("/information")
  public String renderInfoPage(@RequestParam (name="name") String name, Model model){
    model.addAttribute("name", name);
    return "information";
  }
}
