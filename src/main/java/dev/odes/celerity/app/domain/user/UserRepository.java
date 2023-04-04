package dev.odes.celerity.app.domain.user;

import dev.odes.celerity.app.core.AbstractRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository extends AbstractRepository<UserModel, UserPersistence<UserModel>> {

  public UserRepository(UserPersistence userPersistence) {
    super(userPersistence);
  }

  @Override
  public List<UserModel> findMany() {
    return null;
  }

  @Override
  public void insertOne(UserModel userModel) {

  }
}
