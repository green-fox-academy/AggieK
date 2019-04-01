package com.example.frontend.controllers;

import com.example.frontend.modells.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoublingController {

  @GetMapping("/doubling")
  public Object doubleInput(@RequestParam(required = false) Integer input) {
    if (input == null) {
      return new MyError("Please provide an input!");
    } else
      return new Doubling(input);
  }

  @GetMapping("/greeter")
  public Object greetSomeone(@RequestParam(required = false) String name,
                             @RequestParam(required = false) String title) {
    if (name == null && title == null) {
      return new MyError("Please provide a name and a title!");
    } else if (name != null && title == null) {
      return new MyError("Please provide a title!");
    } else if (name == null && title != null) {
      return new MyError("Please provide a name!");
    } else return new Greeting(name, title);
  }


}
