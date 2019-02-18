package com.books.demo.Controllers;

import com.books.demo.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

  @RequestMapping("/postHandler")
  public String postHandler(@RequestParam String title, @RequestParam String author, @RequestParam String third){
    System.out.println(title + ", " + author + ", " + third);
    return "redirect:/web/getHandler";
    }

//  RequestMapping("/postHandler")
//  public String postHandler(@ModelAttribute Book book){
//    System.out.println(book.setTitle() + ", " + book.setId());
//    return "redirect:/web/getHandler";
//  }

  //  RequestMapping("/postHandler")
//  public String postHandler(@ModelAttribute(value="third")String third){
//    System.out.println(third);
//    return "redirect:/web/getHandler";
//  }
  }
