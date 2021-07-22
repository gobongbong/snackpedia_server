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
  private String milk;
  private String bean;
  private String wheat;
  private String egg;
  private String fork;
  private String fish;
}
