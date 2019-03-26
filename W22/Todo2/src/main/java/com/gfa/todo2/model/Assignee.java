package com.gfa.todo2.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Assignee {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String name;
  private String email;

  @OneToMany(cascade = CascadeType.PERSIST)
  @JoinColumn(name="assignee_id")
  List <Todo2> todo2s;

  public Assignee(){}

//  public Assignee(String name){
//    this.name=name;

  public List<Todo2> getTodo2s() {
    return todo2s;
  }

  public void setTodo2s(List<Todo2> todo2s) {
    this.todo2s = todo2s;
  }
//  }

  public Assignee(String name, String email){
    this.name=name;
    this.email=email;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
