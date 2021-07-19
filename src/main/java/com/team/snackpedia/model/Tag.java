package com.team.snackpedia.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Tag {
  @Id
  @GeneratedValue(strategy =  GenerationType.AUTO)
  private Long id;
  private Integer oily;
  private Integer spicy;
  private Integer sweet;
  private Integer salty;
  private Integer sour;
  private Integer flat;
  private Integer crispy;
  private Integer soft;
}
