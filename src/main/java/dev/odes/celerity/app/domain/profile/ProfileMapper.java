package dev.odes.celerity.app.domain.profile;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProfileMapper extends ProfilePersistence {
  public List<ProfileModel> find();
}
