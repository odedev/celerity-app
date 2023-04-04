package dev.odes.celerity.app.controller;

import dev.odes.celerity.app.generator.CodeGenerator;
import dev.odes.celerity.app.generator.context.EntityContext;
import dev.odes.celerity.app.generator.context.TemplateContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

  @GetMapping("/gen")
  public Object gen() {
    EntityContext entityContext = new EntityContext();
    entityContext.setField("testttttt");
    TemplateContext templateContext = new TemplateContext();
    templateContext.setEntityContext(entityContext);
    CodeGenerator codeGenerator = new CodeGenerator(templateContext);
    codeGenerator.generate();

    return "gen";
  }
}