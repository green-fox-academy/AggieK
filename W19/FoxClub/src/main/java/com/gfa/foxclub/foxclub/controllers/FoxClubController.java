package com.gfa.foxclub.foxclub.controllers;

import com.gfa.foxclub.foxclub.model.Fox;
import com.gfa.foxclub.foxclub.service.NutritionService;
import com.gfa.foxclub.foxclub.service.FoxService;
import com.gfa.foxclub.foxclub.service.TrickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FoxClubController {

  private FoxService foxService;
  private NutritionService nutritionService;
  private TrickService trickService;

  @Autowired
  public FoxClubController(FoxService foxService, NutritionService nutritionService, TrickService trickService) {
    this.foxService = foxService;
    this.nutritionService = nutritionService;
    this.trickService = trickService;
  }

  @GetMapping("/index")
  public String renderIndexPage() {
    return "index";
  }

  @GetMapping("/login")
  public String renderLoginPage() {
    return "login";
  }

  @PostMapping("/login")
  public String postLogin(@RequestParam(name = "name") String name) {
    return "redirect:/information?name=" + name;
  }

  @GetMapping("/information")
  public String renderInfoPage(@RequestParam(value = "name") String name, Model model) {
    Fox fox = foxService.loginAFox(name);
    model.addAttribute("fox", fox);
    return "information";
  }

  @GetMapping("/nutrition")
  public String renderNutritionPage(@RequestParam(value = "name") String name, Model model) {
    Fox fox = foxService.loginAFox(name);
    model.addAttribute("fox", fox);
    model.addAttribute("drinks", nutritionService.displayDrinks());
    model.addAttribute("foods", nutritionService.displayFoods());
    return "nutrition";
  }

  @PostMapping("/nutrition")
  public String feedTheFox(@RequestParam(value = "name")String name, @ModelAttribute(value ="food") String food, @ModelAttribute(value="drink") String drink){
    foxService.feedTheFox(name,food,drink);
    return "redirect:/information?name=" + name;
  }

  @GetMapping("/trickcenter")
  public String renderTrickCenterPage(@RequestParam(value="name") String name, Model model){
    Fox fox = foxService.loginAFox(name);
    model.addAttribute("fox", fox);
    model.addAttribute("tricks", trickService.displayTricks());
    return "tricks";
  }


}
