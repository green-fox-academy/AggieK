package com.example.frontend.repo;

import com.example.frontend.models.Log;
import org.springframework.data.repository.CrudRepository;

public interface LogRepo extends CrudRepository <Log, Long>{
}
