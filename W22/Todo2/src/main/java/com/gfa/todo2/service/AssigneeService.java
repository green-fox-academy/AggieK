package com.gfa.todo2.service;

import com.gfa.todo2.model.Assignee;
import com.gfa.todo2.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AssigneeService {

  AssigneeRepository assigneeRepository;

  @Autowired
  public AssigneeService(AssigneeRepository assigneeRepository) {
    this.assigneeRepository = assigneeRepository;
  }

  public ArrayList<Assignee> listAllAssignees() {
    ArrayList<Assignee> assignees = new ArrayList<>();
    assigneeRepository.findAll().forEach(assignees::add);
    return assignees;
  }

  public void saveNewAssignee(Assignee assignee) {
    assigneeRepository.save(assignee);
  }

  public Assignee findAssigneeById(long id) {
    return assigneeRepository.findById(id).get();
  }

  public void removeAssignee(long id) {
    assigneeRepository.deleteById(id);
  }
}
