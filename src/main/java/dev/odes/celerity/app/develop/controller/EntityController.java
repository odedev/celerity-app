package dev.odes.celerity.app.develop.controller;

import dev.odes.celerity.app.develop.service.EntityService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entity")
public class EntityController {
  private final EntityService entityService;

  public EntityController(EntityService entityService) {
    this.entityService = entityService;
  }

}
