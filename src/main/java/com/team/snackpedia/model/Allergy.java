package com.team.snackpedia.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Allergy {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private Integer milk;
  private Integer bean;
  private Integer wheat;
  private Integer egg;
  private Integer fork;
  private Integer fish;
}
