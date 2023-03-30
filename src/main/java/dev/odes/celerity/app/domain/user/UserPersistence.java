package dev.odes.celerity.app.domain.user;

import dev.odes.celerity.app.core.Persistence;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPersistence<User> extends Persistence<User>, JpaRepository<User, String> {

}
