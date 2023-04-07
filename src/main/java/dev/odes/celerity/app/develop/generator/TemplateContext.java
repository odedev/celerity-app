package dev.odes.celerity.app.develop.generator;

import dev.odes.celerity.app.develop.entity.Entity;
import dev.odes.celerity.app.develop.entity.EntityField;

public class TemplateContext {
  private Entity entity;
  private EntityField entityField;

  public TemplateContext(Entity entity, EntityField entityField) {
    this.entity = entity;
    this.entityField = entityField;
  }

  public Entity getEntity() {
    return entity;
  }

  public void setEntity(Entity entity) {
    this.entity = entity;
  }

  public EntityField getEntityField() {
    return entityField;
  }

  public void setEntityField(EntityField entityField) {
    this.entityField = entityField;
  }
}
