package com.team.snackpedia.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Comment {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String userName;
  private String content;

  @ManyToOne
  private User user;

  @ManyToOne
  private Snack snack;
}
