package com.example.frontend.models;

import java.util.Arrays;

public class ArrayHandler {

  private String what;
  private int[] numbers;

  public ArrayHandler(String what, int[] numbers) {
    this.what = what;
    this.numbers = numbers;
  }

  public ArrayHandler() {}

  public int[] getNumbers() {
    return numbers;
  }

  public void setNumbers(int[] numbers) {
    this.numbers = numbers;
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  @Override
  public String toString() {
    return "ArrayHandler{" +
        "numbers=" + Arrays.toString(numbers) +
        ", what='" + what + '\'' +
        '}';
  }
}
