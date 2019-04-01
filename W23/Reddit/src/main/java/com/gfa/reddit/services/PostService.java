package com.gfa.reddit.services;

import com.gfa.reddit.models.Post;
import com.gfa.reddit.repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;

@Service
public class PostService {

  PostRepo postRepo;

  @Autowired
  public PostService(PostRepo postRepo) {
    this.postRepo = postRepo;
  }

  public ArrayList<Post> listAllItems() {
    ArrayList<Post> posts = new ArrayList<>();
    postRepo.findAll().forEach(posts::add);
    return posts;
  }

  public void addNewPost(Post post) {
    postRepo.save(post);
  }

  public void upVote(long id) {
    Post post = findPostById(id);
    post.setScore(post.getScore() + 1);
    postRepo.save(post);
  }

  private Post findPostById(long id) {
    return postRepo.findById(id).get();
  }

  public void downVote(long id) {
    Post post = findPostById(id);
    post.setScore(post.getScore() - 1);
    postRepo.save(post);
  }

  public void remove(long id) {
    postRepo.deleteById(id);
  }

  public ArrayList<Post> findAllPostByScoreOrderDesc() {
    return postRepo.findAllByOrderByScoreDesc();
  }

  public ArrayList<Post> findTop10() {
    ArrayList<Post> top10post = new ArrayList<>();
    ArrayList<Post> allPost = findAllPostByScoreOrderDesc();
    int listSize = allPost.size();

    if (listSize >= 10) {
      for (int i = 0; i < 10; i++) {
        top10post.add(allPost.get(i));
      }
    } else {
      top10post = allPost;
    }
    return top10post;
  }

  public ArrayList<Post> findTenner(int page) {
    ArrayList<Post> tenPost = new ArrayList<>();
    ArrayList<Post> allPost = findAllPostByScoreOrderDesc();
    int listSize = allPost.size();

    for (int i = (page * 10); i < (page * 10 + 10); i++) {
      if (i >= listSize) {
        tenPost.add(allPost.get(i));
      } else return tenPost;
    }
    return tenPost;
  }
}
