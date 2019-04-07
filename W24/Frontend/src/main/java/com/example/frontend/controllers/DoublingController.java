package com.example.frontend.controllers;

import com.example.frontend.models.*;
import com.example.frontend.service.LogService;
import com.example.frontend.service.RestService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoublingController {

  private RestService restService;
  private LogService logService;

  public DoublingController(RestService restService, LogService logService) {
    this.restService = restService;
    this.logService = logService;
  }

  @GetMapping("/doubling")
  public Object doubleInput(@RequestParam(required = false) Integer input) {

    logService.saveLog(new Log("/doubling", "input=" + input));

    if (input == null) {
      return new MyError("Please provide an input!");
    } else
      return new Doubling(input);
  }

  @GetMapping("/greeter")
  public Object greetSomeone(@RequestParam(required = false) String name,
                             @RequestParam(required = false) String title) {

    logService.saveLog(new Log("/greeter", "name=" + name + "&title=" + title));

    if (name == null && title == null) {
      return new MyError("Please provide a name and a title!");
    } else if (name != null && title == null) {
      return new MyError("Please provide a title!");
    } else if (name == null && title != null) {
      return new MyError("Please provide a name!");
    } else return new Greeting(name, title);
  }

  @GetMapping("/appenda/{appendable}")
  public Object renderAppendA(@PathVariable String appendable) {
    logService.saveLog(new Log("/appendable/" + appendable, "appendable= " + appendable));
    if (appendable == null) {
      return "redirect:/error";
    } else return new AppendA(appendable);
  }

  @GetMapping("/error")
  public String renderError() {
    return "404";
  }

  @PostMapping("/dountil/{action}")
  public Object renderDoUntil(@PathVariable String action, @RequestBody(required = false) Until until) {
    logService.saveLog(new Log("/dountil/" + action, "until:" + until.getUntil()));
    if (action.equalsIgnoreCase("sum") && until != null) {
      Result result = new Result(0);
      for (int i = 0; i <= until.getUntil(); i++) {
        result.setResult(result.getResult() + i);
      }
      return result;
    } else if (action.equalsIgnoreCase("factor") && until != null) {
      Result result = new Result(1);
      for (int i = 1; i <= until.getUntil(); i++) {
        result.setResult(result.getResult() * i);
      }
      return result;
    } else return new MyError("Please provide a number!");
  }

  @PostMapping("/arrays")
  public ResponseEntity<Object> arrayHandler(@RequestBody(required = false) ArrayHandler arrayHandler) {
    logService.saveLog(new Log("/arrays", "what:" + arrayHandler.getWhat() + "& numbers:" + arrayHandler.getNumbers()));
    if (arrayHandler == null) {
      return ResponseEntity.status(404).body(new MyError("valami nem jo!"));
    }
    if (arrayHandler != null) {
      if (arrayHandler.getWhat() != null) {
        if (arrayHandler.getNumbers() != null) {
        }
        if (arrayHandler.getWhat().equalsIgnoreCase("sum")) {
          return ResponseEntity.status(HttpStatus.OK).body(restService.calculateResultObject(arrayHandler.getWhat(), arrayHandler.getNumbers()));
        }
        if (arrayHandler.getWhat().equalsIgnoreCase("multiply")) {
          return ResponseEntity.status(HttpStatus.OK).body(restService.calculateResultObject(arrayHandler.getWhat(), arrayHandler.getNumbers()));
        }
        if (arrayHandler.getWhat().equalsIgnoreCase("double")) {
          return ResponseEntity.status(HttpStatus.OK).body(restService.doublingResultObject(arrayHandler.getWhat(), arrayHandler.getNumbers()));
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new MyError("Please provide infos!"));
      }
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new MyError("Please provide a WHAT field to do with the numbers!"));
    }
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new MyError("Please provide a NUMBERS field to do something with the numbers!"));
  }

  @GetMapping("/log")
  public LogList listTheLog() {
    return logService.createLogList();
  }
}
