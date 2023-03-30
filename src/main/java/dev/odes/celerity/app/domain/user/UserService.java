package dev.odes.celerity.app.domain.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public List<UserModel> find() {
    List<String> ids = new ArrayList<>();
    ids.add("");

    List<UserModel> userList = this.userRepository.findById(ids);

    User user = new User();
    return userList;
  }
}
