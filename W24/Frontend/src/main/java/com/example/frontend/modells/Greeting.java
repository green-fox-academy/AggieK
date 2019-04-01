package com.example.frontend.modells;

public class Greeting {

  private String name;
  private String title;
  private String welcome_message;

  public Greeting(String myName, String myTitle) {
    this.name = myName;
    this.title = myTitle;
    this.welcome_message = "Oh, hi there " + myName + ", my dear " + myTitle + " !";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }
}
