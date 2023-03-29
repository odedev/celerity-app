package dev.odes.celerity.app.user;

import dev.odes.celerity.app.core.AbstractEntity;
import jakarta.persistence.Entity;

@Entity
public class User extends AbstractEntity {
  private String id;
  private String username;
  private String password;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
