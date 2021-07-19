package com.team.snackpedia.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Comment {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private Integer userRating;
  private Integer score;
  private Integer a;
  private Integer b;
  private Integer c;
  private Integer d;
  private Integer e;

  @ManyToOne
  private User user;
}
