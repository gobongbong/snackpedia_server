package com.team.snackpedia.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
  private String milk;
  private String bean;
  private String wheat;
  private String egg;
  private String fork;
  private String fish;
  private String oily;
  private String spicy;
  private String sweet;
  private String salty;
  private String sour;
  private String flat;
  private String crispy;
  private String soft;
  private Integer repurchase;
  private Integer satiety;
  private Integer creativity;
  private Integer costPerformance;
  private Integer flavor;
  private String msg;
  private String color;
  private String atsodium;
  private String sulfite;
  private String atsugar;
  private String atfat;
  private String swelling;
  private String asparm;
}
