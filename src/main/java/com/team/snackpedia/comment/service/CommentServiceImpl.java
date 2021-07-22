package com.team.snackpedia.comment.service;

import com.team.snackpedia.model.Comment;
import com.team.snackpedia.model.Snack;
import com.team.snackpedia.model.User;
import com.team.snackpedia.repository.CommentRepository;
import com.team.snackpedia.repository.SnackRepository;
import com.team.snackpedia.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

@Service
public class CommentServiceImpl implements CommentService{
  @Autowired
  CommentRepository commentRepository;

  @Autowired
  UserRepository userRepository;

  @Autowired
  SnackRepository snackRepository;

  @CrossOrigin("*")
  @Override
  public Comment commentPost(Comment comment, String snackId) {
    System.out.println("유저 이름 >>> " + comment.getUserName());

    User user = userRepository.findByUserName(comment.getUserName());
    Optional<Snack> result = snackRepository.findById(Long.parseLong(snackId));

    Snack snack = result.get();


    comment.setUserName(user.getUserName());
    comment.setSnackId(snack.getId());


    return  commentRepository.save(comment);
  }

  @Override
  public List<Comment> getComment(String id) {
    return commentRepository.findAllBySnackId(Long.parseLong(id));
  }

}