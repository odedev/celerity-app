package dev.odes.celerity.app.domain.profile;


import dev.odes.celerity.app.core.AbstractRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class ProfileRepository extends AbstractRepository<ProfileModel, ProfilePersistence> {

  private final ProfilePersistence profilePersistence;

  public ProfileRepository(ProfilePersistence profilePersistence) {
    super(profilePersistence);
    this.profilePersistence = profilePersistence;
  }

  public List<ProfileModel> find() {
    List<ProfileModel> profiles = this.profilePersistence.find();
    return profiles;
  }

  @Override
  public ProfileModel insert(ProfileModel profileModel) {
    return null;
  }

}
