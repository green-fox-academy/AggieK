package com.example.frontend.service;

import com.example.frontend.modells.ArrayHandler;
import com.example.frontend.modells.ArrayHandlerArrayResult;
import com.example.frontend.modells.ArrayHandlerIntResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RestService {

  public RestService() {
  }

  public ArrayHandlerIntResult calculateResultObject(String what, int[] numbers) {
    ArrayHandlerIntResult newObject = null;
    if (what.equalsIgnoreCase("sum")) {
      newObject = new ArrayHandlerIntResult(sumArrayElements(numbers));
    }
    if (what.equalsIgnoreCase("multiply")) {
      newObject = new ArrayHandlerIntResult(multiplyArrayElements(numbers));
    }
    return newObject;
  }

  private int multiplyArrayElements(int[] numbers) {
    int sum =1;
    for (int i = 0; i <numbers.length ; i++) {
      sum *= numbers[i];
    }
    return sum;
  }

  public ArrayHandlerArrayResult doublingResultObject(String what, int[] numbers) {
    ArrayHandlerArrayResult newObject = null;
    if (what.equalsIgnoreCase("double")) {
      newObject = new ArrayHandlerArrayResult(doubledNumbers(numbers));
    }
    return newObject;
  }

  private int[] doubledNumbers(int[] numbers) {
    int doubledArray[] = new int[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
      doubledArray[i] = numbers[i] * 2;
    }
    return doubledArray;
  }


  private int sumArrayElements(int[] numbers) {
  int sum = 0;
    for (int i = 0; i < numbers.length ; i++) {
      sum += numbers[i];
    }
    return sum;
  }

}
