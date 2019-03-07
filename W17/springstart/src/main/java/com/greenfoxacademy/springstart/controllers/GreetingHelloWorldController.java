package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;
import java.util.Random;

@Controller
public class GreetingHelloWorldController {

  private String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
      "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
      "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
      "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

  private String[] colors = {"red", "green", "blue", "yellow", "orange"};

  @RequestMapping("web/greetingTheWorld")
  public String greetingTheWorld(Model model) {
    model.addAttribute("greeting", randomGreeting());
    model.addAttribute("color", randomRGB().toString());
    model.addAttribute("fontSize", randomFontSize());
    return "greetingManyLanguage";
  }

  private String randomGreeting() {
    return hellos[(int)(Math.random() * hellos.length)];
  }

  private String randomColor() {
    return colors[(int)(Math.random() * colors.length)];
  }

  private int randomFontSize() {
    return (int)(Math.random() * 100) + 10;
  }

  private String randomRGB(){
    int randomRed = (int)(Math.random()*256);
    int randomGreen = (int)(Math.random()*256);
    int randomBlue = (int)(Math.random()*256);
    String randomRGB ="rgb( " + randomRed +", " + randomGreen +", "  + randomBlue + ")";
    return randomRGB;
  }

//  private Color randomRGB(){
//    int randomRed = (int)(Math.random()*256);
//    int randomGreen = (int)(Math.random()*256);
//    int randomBlue = (int)(Math.random()*256);
//    Color randomRGB = new Color (randomRed, randomGreen, randomBlue);
//    return randomRGB;
//  }
}
