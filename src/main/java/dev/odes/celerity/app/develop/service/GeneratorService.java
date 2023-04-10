package dev.odes.celerity.app.develop.service;

import dev.odes.celerity.app.develop.entity.Entity;
import dev.odes.celerity.app.develop.entity.EntityField;
import dev.odes.celerity.app.develop.generator.CodeGenerator;
import dev.odes.celerity.app.develop.generator.TemplateContext;
import dev.odes.celerity.app.enumeration.DataTypeEnum;
import dev.odes.celerity.app.response.ResponseData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class GeneratorService {

  public Object generate() {
    Entity entity = new Entity();
    entity.setCode("Dictionary");
    entity.setName("数据字典");
    entity.setDescription("数据字典");

    EntityField entityField = new EntityField();
    entityField.setCode("code");
    entityField.setName("编码");
    entityField.setDataType(DataTypeEnum.INTEGER);
    EntityField entityField1 = new EntityField();
    entityField1.setCode("name");
    entityField1.setName("名称");
    entityField1.setDataType(DataTypeEnum.BOOLEAN);

    ArrayList<EntityField> entityFields = new ArrayList<>();
    entityFields.add(entityField);
    entityFields.add(entityField1);

    TemplateContext templateContext = new TemplateContext(entity, entityFields);
    CodeGenerator codeGenerator = new CodeGenerator();
    codeGenerator.generate(templateContext);

    return new ResponseData("gen");
  }
}
