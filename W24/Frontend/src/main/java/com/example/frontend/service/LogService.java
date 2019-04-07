package com.example.frontend.service;

import com.example.frontend.models.Log;
import com.example.frontend.models.LogList;
import com.example.frontend.repo.LogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class LogService {

  LogRepo logRepo;

  @Autowired
  public LogService(LogRepo logRepo) {
    this.logRepo = logRepo;
  }

  public LogService(){}

  public void saveLog (Log log){
    logRepo.save(log);
  }

  public ArrayList <Log> findAll(){
    ArrayList<Log> logs = new ArrayList<>();
    logRepo.findAll().forEach(logs::add);
    return logs;
  }

  public LogList createLogList(){
    ArrayList<Log> entries = findAll();
    return new LogList(entries, entries.size());
  }


}
