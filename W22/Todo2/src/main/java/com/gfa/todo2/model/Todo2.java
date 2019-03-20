package com.gfa.todo2.model;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;

@Entity
public class Todo2 {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String title;
  private boolean urgent;
  private boolean done;

  @ManyToOne
  @JoinColumn(name="todo2_id")
  private Assignee assignee;

  public Todo2() {
  }

  public Todo2(String title) {
    this.title = title;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isUrgent() {
    return urgent;
  }

  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }

  public boolean isDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }
}
