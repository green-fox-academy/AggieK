package com.example.url.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UrlController {

  @GetMapping()
    public String renderMain(){
    return "main";
    }
}
