package com.bankofsimba.demo.controllers;

import com.bankofsimba.demo.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
public class BankAccountController {

  private List<BankAccount> bankAccounts = new ArrayList<>();

  public BankAccountController() {
    bankAccounts.add(new BankAccount("Simba", 2000, "lion", true, true));
    bankAccounts.add(new BankAccount("Nala", 2500, "lion", false, true));
    bankAccounts.add(new BankAccount("Timon", 550, "meerkat", false, true));
    bankAccounts.add(new BankAccount("Pumbaa", 8300, "warthog", false, true));
    bankAccounts.add(new BankAccount("Zordon", -1200, "lion", true, false));
  }

  @RequestMapping("/show")
  public String showBankAccount(Model model) {
    model.addAttribute("bankAccounts", bankAccounts);
    return "show";
  }

  @RequestMapping("/showtext")
  public String showText(Model model) {
    model.addAttribute("text", "This is an empty HTML text. Enjoy yourself");
    return "showtext";
  }

  @RequestMapping("/showtext2")
  public String showText2(Model model) {
    model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "showtext";
  }

  @RequestMapping("/showAll")
  public String showAllAccounts(Model model) {
    model.addAttribute("bankAccounts", bankAccounts);
    return "showAll";
  }

  @GetMapping("raiseBalance")
  public String raiseBalance(Model model) {
    model.addAttribute("bankAccounts", bankAccounts);
    return "raiseBalance";
  }

  @RequestMapping(path = "/raiseBalance", method = RequestMethod.POST)
  public String raiseBalance(@ModelAttribute(value = "name") String animal) {
    raiseBalanceByAnimal(animal);
    return "redirect:/showAll";
  }

  public void raiseBalanceByAnimal(String animal) {
    for (BankAccount account : bankAccounts) {
      if (account.getName().equals(animal)) {
        if (account.isRoyalStatus()) {
          account.setBalance(account.getBalance() + 100);
        } else {
          account.setBalance(account.getBalance() + 10);
        }
      }
    }
  }

  @GetMapping("/createANewAccount")
  public String createANewAccount() {
    return "createANewAccount";
  }

  @PostMapping("/createANewAccount")
  public String createANewAccount
      (@ModelAttribute(value = "name") String newName,
       @ModelAttribute(value = "balance") Integer balance,
       @ModelAttribute(value = "animalType") String animalType,
       @ModelAttribute(value = "royalStatus") String royalStatus,
       @ModelAttribute(value = "goodOrBad") String goodOrBad){

    bankAccounts.add(new BankAccount(newName, balance, animalType, royalStatus.contains("true"), goodOrBad.contains("true")));

    return "redirect:/showAll";
  }

}
