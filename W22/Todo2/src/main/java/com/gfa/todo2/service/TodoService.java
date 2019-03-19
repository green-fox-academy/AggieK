package com.gfa.todo2.service;

import com.gfa.todo2.model.Todo2;
import com.gfa.todo2.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TodoService {

  TodoRepository todoRepository;

  @Autowired
  public TodoService(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public ArrayList<Todo2> listAllItems(){
    ArrayList<Todo2>todo2s = new ArrayList<>();
    todoRepository.findAll().forEach(todo2s::add);
    return todo2s;
  }

  public ArrayList<Todo2> listUndoneItems() {
    ArrayList<Todo2> todo2s = listAllItems();
    ArrayList<Todo2> undoneTodo2s = new ArrayList<>();
    for (Todo2 todo2 : todo2s) {
      if (!todo2.isDone()) {
        undoneTodo2s.add(todo2);
      }
    }
    return undoneTodo2s;
  }

  public void saveNewTodo(Todo2 todo2){
    todoRepository.save(todo2);
  }

  public void deleteTodo(long id){
    todoRepository.deleteById(id);
  }

  public Todo2 findTodoById(long id) {
    return todoRepository.findById(id).get();
  }
}
