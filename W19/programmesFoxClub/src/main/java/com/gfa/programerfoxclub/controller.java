package com.gfa.programerfoxclub;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class controller {

  @GetMapping("/login")
  public String renderLogin(){
    return "login";
  }

  @RequestMapping(value = "login", method = RequestMethod.POST)
  public String postLoginForm(@RequestParam(name = "name") String name, Model model){
    model.addAttribute("name", name);
    return "redirect:/information/?name="+name;
  }


  @GetMapping("/information")
  public String renderInfoPage(@RequestParam (name="name") String name, Model model){
    model.addAttribute("name", name);
    return "information";
  }
}
