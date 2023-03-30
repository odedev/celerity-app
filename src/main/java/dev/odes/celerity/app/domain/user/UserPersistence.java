package dev.odes.celerity.app.domain.user;

import dev.odes.celerity.app.core.Persistence;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

@Mapper
public interface UserPersistence<User> extends Persistence<User> {

}
