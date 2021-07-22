package com.team.snackpedia.comment.service;

import com.team.snackpedia.model.Comment;

import java.util.List;

public interface CommentService {
  public Comment commentPost(Comment comment, String snackId);
  List<Comment> getComment(String id);
}