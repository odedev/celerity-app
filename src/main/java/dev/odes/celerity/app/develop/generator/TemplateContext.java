package dev.odes.celerity.app.develop.generator;

import dev.odes.celerity.app.develop.entity.Entity;
import dev.odes.celerity.app.develop.entity.EntityField;

import java.util.List;

public class TemplateContext {
  private Entity entity;
  private List<EntityField> entityFields;

  public TemplateContext(Entity entity, List<EntityField> entityFields) {
    this.entity = entity;
    this.entityFields = entityFields;
  }

  public Entity getEntity() {
    return entity;
  }

  public void setEntity(Entity entity) {
    this.entity = entity;
  }

  public List<EntityField> getEntityFields() {
    return entityFields;
  }

  public void setEntityFields(List<EntityField> entityFields) {
    this.entityFields = entityFields;
  }
}
