package dev.odes.celerity.app.domain.profile;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class ProfileController {
  private final ProfileService profileService;
  public ProfileController(ProfileService profileService) {
    this.profileService = profileService;
  }

  @GetMapping("")
  public Object find() {
    return this.profileService.find();
  }

  @PostMapping("")
  public Object insert(@RequestBody ProfileModel profile) {
    return this.profileService.insert(profile);
  }


}
