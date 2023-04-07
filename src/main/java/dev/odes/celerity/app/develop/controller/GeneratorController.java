package dev.odes.celerity.app.develop.controller;

import dev.odes.celerity.app.develop.service.GeneratorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/develop/generator")
public class GeneratorController {
  private final GeneratorService generatorService;
  public GeneratorController(GeneratorService generatorService) {
    this.generatorService = generatorService;
  }

  @GetMapping("/code")
  public Object code() {
    return this.generatorService.generate();
  }

}
