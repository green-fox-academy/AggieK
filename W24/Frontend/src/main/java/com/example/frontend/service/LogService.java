package com.example.frontend.service;

import com.example.frontend.modells.Log;
import com.example.frontend.repo.LogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
