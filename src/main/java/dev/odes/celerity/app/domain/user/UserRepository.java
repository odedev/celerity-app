package dev.odes.celerity.app.domain.user;

import dev.odes.celerity.app.core.AbstractRepository;

public class UserRepository extends AbstractRepository<UserModel, UserPersistence> {

  public UserRepository(UserPersistence userPersistence) {
    super(userPersistence);
  }

}
