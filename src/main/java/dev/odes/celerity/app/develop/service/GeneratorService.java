package dev.odes.celerity.app.develop.service;

import dev.odes.celerity.app.develop.entity.Entity;
import dev.odes.celerity.app.develop.generator.CodeGenerator;
import dev.odes.celerity.app.develop.generator.TemplateContext;
import org.springframework.stereotype.Service;

@Service
public class GeneratorService {

  public Object generate() {
    Entity entity = new Entity();
    entity.setCode("Dictionary");
    entity.setName("数据字典");
    entity.setDescription("数据字典");
    TemplateContext templateContext = new TemplateContext(entity, null);
    CodeGenerator codeGenerator = new CodeGenerator();
    codeGenerator.generate(templateContext);

    return "gen";
  }
}
