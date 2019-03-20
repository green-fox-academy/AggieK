package com.gfa.todo2.controller;

import com.gfa.todo2.model.Assignee;
import com.gfa.todo2.service.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/assignee")
public class AssigneeController {

  private AssigneeService assigneeService;

  @Autowired
  public AssigneeController(AssigneeService assigneeService) {
    this.assigneeService = assigneeService;
  }

  @GetMapping()
  public String renderAssignee() {
    return "assigneeMain";
  }

  @GetMapping("/list")
  public String listAssignees(Model model) {
    ArrayList<Assignee> assignees = assigneeService.listAllAssignees();
    model.addAttribute("assignees", assignees);
    return "assigneeList";
  }

  @GetMapping("/add")
  public String renderAddAssignee() {
    return "assigneeAdd";
  }

  @PostMapping("/add")
  public String addNewAssignee(@ModelAttribute Assignee newAssignee) {
    assigneeService.saveNewAssignee(newAssignee);
    return "redirect:/assignee/list";
  }

}
