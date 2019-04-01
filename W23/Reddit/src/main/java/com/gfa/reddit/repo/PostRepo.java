package com.gfa.reddit.repo;

import com.gfa.reddit.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface PostRepo extends CrudRepository<Post, Long> {
  ArrayList<Post> findAllByOrderByScoreDesc();
}
