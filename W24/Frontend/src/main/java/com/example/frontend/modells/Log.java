package com.example.frontend.modells;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Log {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private LocalDateTime createdAt;
  private String endpoint;
  private String data;

  public Log() {
    this.createdAt = LocalDateTime.now();
  }

  public Log(String endpoint, String data){
    this.endpoint = endpoint;
    this.data = data;
    this.createdAt = LocalDateTime.now();
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }
}
