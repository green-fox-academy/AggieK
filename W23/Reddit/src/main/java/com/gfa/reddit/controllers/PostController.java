package com.gfa.reddit.controllers;

import com.gfa.reddit.models.Post;
import com.gfa.reddit.repo.PostRepo;
import com.gfa.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class PostController {

  private PostRepo postRepo;
  private PostService postService;

  @Autowired
  public PostController(PostRepo postRepo, PostService postService) {
    this.postRepo = postRepo;
    this.postService = postService;
  }

  @GetMapping("/")
  public String renderMain (Model model) {
    ArrayList<Post> posts = postRepo.findAllByOrderByScoreDesc();
    model.addAttribute("page", 0);
    model.addAttribute("models", postService.findTop10());
    return "main";
  }

  @GetMapping("/submit")
  public String renderAddPage(){
    return "add";
  }

  @PostMapping("/submit")
  public String addNewPost(@ModelAttribute Post post){
    postService.addNewPost(post);
    return "redirect:/";
  }

  @GetMapping("/{id}/upvote")
  public String upVoteScore (@PathVariable long id){
    postService.upVote(id);
    return "redirect:/";
  }

  @GetMapping("/{id}/downvote")
  public String downVoteScore (@PathVariable long id){
    postService.downVote(id);
    return "redirect:/";
  }

  @GetMapping("/{id}/remove")
  public String removePost(@PathVariable long id){
    postService.remove(id);
    return "redirect:/";
  }

  @GetMapping("/{page}")
  public String renderPageByTennersPlus(@PathVariable int page, Model model){
    model.addAttribute("page", page);
    model.addAttribute("models", postService.findTenner(0));
    return "main";
  }
}
