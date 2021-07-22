package com.team.snackpedia.comment.controller;

import com.team.snackpedia.comment.service.CommentService;
import com.team.snackpedia.model.Comment;
import com.team.snackpedia.model.Snack;
import com.team.snackpedia.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.ManyToOne;
import java.util.List;

@RestController
public class CommentController {

  @Autowired
  CommentService commentService;

  @CrossOrigin("*")
  @GetMapping("/comment/{id}")
  public List<Comment> getComment(@PathVariable String id) {
    return commentService.getComment(id);
  }

  @CrossOrigin("*")
  @PostMapping("/comment/regist")
  public Comment commentPost(@ModelAttribute Comment comment, @RequestPart String snackId){
    return commentService.commentPost(comment, snackId);
  }


}
