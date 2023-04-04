package dev.odes.celerity.app.domain.user;

import dev.odes.celerity.app.core.AbstractEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class User extends AbstractEntity {

  @Id
  @NotBlank
  private String id;

  @NotBlank
  private String username;

  @NotBlank
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
