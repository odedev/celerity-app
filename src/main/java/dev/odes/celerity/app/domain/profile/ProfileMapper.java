package dev.odes.celerity.app.domain.profile;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface ProfileMapper extends ProfilePersistence {
  public List<ProfileModel> find();
}
