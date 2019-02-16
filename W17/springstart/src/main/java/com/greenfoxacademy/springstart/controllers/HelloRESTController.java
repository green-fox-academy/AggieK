package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greetings;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

  @RequestMapping("greeting/{name}")
  public Greetings greeting(@PathVariable String name) {
    Greetings greeting = new Greetings(1, "Hello, World, " + name + "!");
    return greeting;
  }

  long counter = 0;

  @RequestMapping("greeting")
  public Greetings greeting2(@RequestParam String name) {
    counter++;
    Greetings greetings = new Greetings(counter, "Hello World, " + name + " !");
    return greetings;
  }
}
