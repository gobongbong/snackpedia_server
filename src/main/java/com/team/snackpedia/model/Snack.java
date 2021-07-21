package com.team.snackpedia.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Snack {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String snackName;
  private Integer sodium;
  private Integer protein;
  private Integer fat;
  private Integer calories;
  private Integer sugar;
  private Integer carbo;
  private Integer chol;
  private Integer amount;
  private Integer favorite;
  private String snackOriginalPath;
  private String snackThumbnailPath;
  private String category;

  @OneToOne
  private Allergy allergy;

  @OneToOne
  private Tag tag;
}
