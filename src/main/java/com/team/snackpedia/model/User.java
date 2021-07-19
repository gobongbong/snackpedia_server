package com.team.snackpedia.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String userName;
  private String userEmail;
  private String userPassword;
  private String userProfilePath;
}
