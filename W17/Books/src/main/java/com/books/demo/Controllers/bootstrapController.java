package com.books.demo.Controllers;

import com.books.demo.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web")
public class bootstrapController {

  @GetMapping("/getHandler")
  public String bootstrap(Model model){
    Book book = new Book();
    book.setId(5);
    book.setTitle("Timequake");
    book.setAuthor("Vonnegut");
    model.addAttribute("book", book);
    return "bootstrap";
  }

  @PostMapping("/postHandler")
  public String postHandler(){
      return "redirect:/";
    }
  }
