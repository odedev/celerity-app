package dev.odes.celerity.app.develop.service;

import dev.odes.celerity.app.generator.CodeGenerator;
import dev.odes.celerity.app.generator.context.EntityContext;
import dev.odes.celerity.app.generator.context.TemplateContext;
import org.springframework.stereotype.Service;

@Service
public class GeneratorService {

  public Object generate() {
    EntityContext entityContext = new EntityContext();
    entityContext.setField("testttttt");
    entityContext.setCode("Dictionary");
    entityContext.setName("数据字典");
    entityContext.setDescription("数据字典");
    TemplateContext templateContext = new TemplateContext();
    templateContext.setEntityContext(entityContext);
    CodeGenerator codeGenerator = new CodeGenerator(templateContext);
    codeGenerator.generate();

    return "gen";
  }
}
