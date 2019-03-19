package com.gfa.todo2.controller;

import com.gfa.todo2.model.Todo2;
import com.gfa.todo2.repository.TodoRepository;
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

  @Autowired
  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }

//  @GetMapping("/")
//  @ResponseBody
//  public String list() {
//    return "This is my first Todo";
//  }

  @GetMapping("/list")
  public String todoList(Model model, @RequestParam(required=false) boolean isActive) {
    if(!isActive){
      model.addAttribute("models",todoService.listUndoneItems());
    } else
    model.addAttribute("models", todoService.listAllItems());
    return "todolist";
  }

  @GetMapping("/add")
  public String renderAddPage(){
    return "add";
  }

  @PostMapping("/add")
  public String addNewTodo(@ModelAttribute(name="title") String title){
    Todo2 todo = new Todo2(title);
    todoService.saveNewTodo(todo);
    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/delete")
  public String deleteTodo(@PathVariable long id){
    todoService.deleteTodo(id);
    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/edit")
  public String renderEditPage(@PathVariable long id, @ModelAttribute Todo2 todo, Model model){
    Todo2 editTodo = todoService.findTodoById(id);
    model.addAttribute("todo", editTodo);
    return "edit";
  }
}
