package dev.odes.celerity.app.domain.profile;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {
  private final ProfileRepository profileRepository;

  public ProfileService(ProfileRepository profileRepository) {
    this.profileRepository = profileRepository;
  }

  public List<ProfileModel> find() {
    return this.profileRepository.find();
  }

  public ProfileModel insert(ProfileModel profile) {
    this.profileRepository.insertOne(profile);
    return profile;
  }
}
