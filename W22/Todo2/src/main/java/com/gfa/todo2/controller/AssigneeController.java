package com.gfa.todo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/assignee")
public class AssigneeController {

  @GetMapping()
  public String renderAssignee(){
    return "assigneeMain";
  }
}
