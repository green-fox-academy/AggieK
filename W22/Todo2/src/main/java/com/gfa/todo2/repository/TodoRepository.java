package com.gfa.todo2.repository;

import com.gfa.todo2.model.Todo2;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo2, Long> {
}
