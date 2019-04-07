package com.example.url.repo;

import com.example.url.models.MyURL;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyURLRepo extends CrudRepository<MyURL, Long> {
}
