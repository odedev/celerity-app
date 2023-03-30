package dev.odes.celerity.app.domain.user;

import dev.odes.celerity.app.core.AbstractRepository;

import java.util.List;

public class UserRepository extends AbstractRepository<UserModel, UserPersistence<UserModel>> {

  public UserRepository(UserPersistence userPersistence) {
    super(userPersistence);
  }

  @Override
  public List<UserModel> find() {
    return null;
  }

  @Override
  public UserModel insert(UserModel userModel) {
    return null;
  }
}
