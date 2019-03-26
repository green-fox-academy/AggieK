package com.gfa.todo2.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Todo2 {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String title;
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate createdAt;
  private boolean urgent;
  private boolean done;
  private LocalDate dueDate;


  @ManyToOne
  @JoinColumn(name="assignee_id")
  private Assignee assignee;

  public Todo2(){
    this.createdAt= LocalDate.now();
}

  public LocalDate getDueDate() {
    return dueDate;
  }

  public void setDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
  }

  public LocalDate getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDate createdAt) {
    this.createdAt = createdAt;
  }

  public Assignee getAssignee() {
    return assignee;
  }

  public void setAssignee(Assignee assignee) {
    this.assignee = assignee;
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
