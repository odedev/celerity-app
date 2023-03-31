package dev.odes.celerity.app.domain.user;

import dev.odes.celerity.app.core.Persistence;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserPersistence<User> extends Persistence<User> {

}
