package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greetings;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class GreetingController {

  long counter = 0;

  @ResponseBody
  @RequestMapping(value = "web/greeting")
  public String greeting2(@RequestParam String name) {
    counter++;
    return "Hello, " + name + " ! This site was loaded " + counter + " times since last server start. ";
  }
}
