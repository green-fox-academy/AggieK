package com.gfa.todo2.controller;

import com.gfa.todo2.model.Assignee;
import com.gfa.todo2.service.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

  @GetMapping("/{id}/edit")
  public String editAssignee(@PathVariable long id, @ModelAttribute Assignee assignee, Model model){
    Assignee editAssignee = assigneeService.findAssigneeById(id);
    model.addAttribute("assignee" , editAssignee);
    return "assigneeEdit";
  }

  @GetMapping("/{id}/remove")
  public String removeAssignee(@PathVariable long id){
    assigneeService.removeAssignee(id);
    return "redirect:/assignee/list";
  }

}
