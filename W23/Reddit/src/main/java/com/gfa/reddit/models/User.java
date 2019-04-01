package com.gfa.reddit.models;

import org.hibernate.sql.ordering.antlr.GeneratedOrderByLexer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String name;
  private String email;

  public User () {}


}
