package dev.odes.celerity.app.domain.profile;

import dev.odes.celerity.app.core.Model;

public class ProfileModel extends Profile implements Model {
  @Override
  public void setDefaultValue() {
    this.setEmail("email");
  }
}
