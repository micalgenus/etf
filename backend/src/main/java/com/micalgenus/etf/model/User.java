package com.micalgenus.etf.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user")
@Getter
@Setter
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "uid")
  private Long uid;

  @Column(name = "id", length = 30, nullable = false)
  private String id;

  @Column(name = "name", length = 30, nullable = true)
  private String name;

  @Column(name = "password", length = 256, nullable = false)
  private String password;
}