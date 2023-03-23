package com.baseRestApi.springjwt.models;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;

/**
 * modele user.
 * @author yann.bundy
 *
 */
@Entity
@Table(name = "users")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @jakarta.validation.constraints.NotBlank
  @jakarta.validation.constraints.Size(max = 20)
  private String username;

  @jakarta.validation.constraints.NotBlank
  @jakarta.validation.constraints.Size(max = 50)
  @jakarta.validation.constraints.Email
  private String email;

  @jakarta.validation.constraints.NotBlank
  @jakarta.validation.constraints.Size(max = 120)
  private String password;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(  name = "user_roles", 
        joinColumns = @JoinColumn(name = "user_id"), 
        inverseJoinColumns = @JoinColumn(name = "role_id"))
  private Set<Role> roles = new HashSet<>();

  public User() {
  }

  /**
   * 
   * @param username
   * @param email
   * @param password
   */
  public User(String username, String email, String password) {
    this.username = username;
    this.email = email;
    this.password = password;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  /**
   * 
   * @param username
   */
  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  /**
   * 
   * @param email
   */
  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  /**
   * 
   * @param password
   */
  public void setPassword(String password) {
    this.password = password;
  }

  public Set<Role> getRoles() {
    return roles;
  }

  /**
   * 
   * @param roles
   */
  public void setRoles(Set<Role> roles) {
    this.roles = roles;
  }
}
