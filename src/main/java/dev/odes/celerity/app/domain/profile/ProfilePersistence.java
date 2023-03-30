package dev.odes.celerity.app.domain.profile;

import dev.odes.celerity.app.core.Persistence;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProfilePersistence extends Persistence<ProfileModel> {


}
