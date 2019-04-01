package com.gfa.todo2.controller;

import com.gfa.todo2.model.Todo2;
import com.gfa.todo2.repository.TodoRepository;
import com.gfa.todo2.service.AssigneeService;
import com.gfa.todo2.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/todo")
public class TodoController {

  private TodoService todoService;
  private AssigneeService assigneeService;

  @Autowired
  public TodoController(TodoService todoService, AssigneeService assigneeService) {
    this.todoService = todoService;
    this.assigneeService = assigneeService;
  }


//  @GetMapping("/")
//  @ResponseBody
//  public String list() {
//    return "This is my first Todo";
//  }

  @PostMapping("/list")
  public String todoList(Model model, @RequestParam(required = false) String word) {
    ArrayList<Todo2> filteredTodos = new ArrayList<>();
    if (word == null) {
      filteredTodos = todoService.listAllItems();
    } else {
      filteredTodos = todoService.findTodoByName(word);
    }
    model.addAttribute("models", filteredTodos);
    model.addAttribute("attribute", assigneeService.listAllAssignees());
    return "todolist";
  }

  @GetMapping("/list")
  public String todoList(Model model, @RequestParam(required = false) boolean isActive) {
    if (!isActive) {
      model.addAttribute("models", todoService.listUndoneItems());
    } else {
      model.addAttribute("models", todoService.listAllItems());
    }
    model.addAttribute("attribute", assigneeService.listAllAssignees());
    return "todolist";
  }


  @GetMapping("/add")
  public String renderAddPage() {
    return "add";
  }

  @PostMapping("/add")
  public String addNewTodo(@ModelAttribute Todo2 todo2) {
    todoService.saveNewTodo(todo2);
    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/delete")
  public String deleteTodo(@PathVariable long id) {
    todoService.deleteTodo(id);
    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/edit")
  public String renderEditPage(@PathVariable long id, @ModelAttribute Todo2 todo2, Model model) {
    Todo2 editTodo = todoService.findTodoById(id);
    model.addAttribute("todo", editTodo);
    model.addAttribute("assignees", assigneeService.listAllAssignees());
    return "edit";
  }

  @PostMapping("/{id}/edit")
  public String editTodoOrAssignee(@ModelAttribute Todo2 todo2, Model model) {
    todoService.saveNewTodo(todo2);
    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/details")
  public String renderTodoDetails(@PathVariable long id, Model model) {
    Todo2 todo = todoService.findTodoById(id);
    model.addAttribute("todo2", todo);
    return "details";
  }
}
