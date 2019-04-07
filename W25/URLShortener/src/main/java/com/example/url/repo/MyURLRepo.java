package com.example.url.repo;

import com.example.url.models.MyURL;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface MyURLRepo extends CrudRepository<MyURL, Long>{
  ArrayList <MyURL> findByAliasContaining(String alias);
}
