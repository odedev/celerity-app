package dev.odes.celerity.app.develop.service;

import dev.odes.celerity.app.develop.entity.Entity;
import dev.odes.celerity.app.develop.generator.CodeGenerator;
import dev.odes.celerity.app.develop.generator.context.EntityContext;
import dev.odes.celerity.app.develop.generator.TemplateContext;
import org.springframework.stereotype.Service;

@Service
public class GeneratorService {

  public Object generate() {
    EntityContext entityContext = new EntityContext();
    Entity entity = new Entity();
    entityContext.setField("testttttt");
    entityContext.setCode("Dictionary");
    entityContext.setName("数据字典");
    entityContext.setDescription("数据字典");
    TemplateContext templateContext = new TemplateContext();
    templateContext.setEntityContext(entityContext);
    CodeGenerator codeGenerator = new CodeGenerator(templateContext);
    codeGenerator.generate(templateContext);

    return "gen";
  }
}
