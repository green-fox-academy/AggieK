package com.example.url.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Url {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String url;
  private String alias;
  private int hit_count;
  private int secret_code;

  public Url() {}

  public Url(String url, String alias) {
    this.url = url;
    this.alias = alias;
    this.secret_code=(int)(Math.random()*9999);
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public int getHit_count() {
    return hit_count;
  }

  public void setHit_count(int hit_count) {
    this.hit_count = hit_count;
  }

  public int getSecret_code() {
    return secret_code;
  }

  public void setSecret_code(int secret_code) {
    this.secret_code = secret_code;
  }
}
