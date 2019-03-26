package com.gfa.todo2.repository;

import com.gfa.todo2.model.Todo2;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo2, Long> {
}
