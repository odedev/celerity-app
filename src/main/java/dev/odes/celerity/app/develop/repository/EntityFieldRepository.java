package dev.odes.celerity.app.develop.repository;

import dev.odes.celerity.app.core.AbstractRepository;
import dev.odes.celerity.app.core.Persistence;
import dev.odes.celerity.app.develop.model.EntityFieldModel;
import dev.odes.celerity.app.develop.persistence.EntityFieldMapperPersistence;
import org.springframework.stereotype.Repository;

@Repository
public class EntityFieldRepository extends AbstractRepository<EntityFieldModel, EntityFieldMapperPersistence> {
  private final Persistence<EntityFieldModel> persistence;

  public EntityFieldRepository(EntityFieldMapperPersistence persistence) {
    super(persistence);
    this.persistence = persistence;
  }

  public void find() {
    this.persistence.findMany();
  }


}
