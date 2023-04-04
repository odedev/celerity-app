package dev.odes.celerity.app.develop.repository;

import dev.odes.celerity.app.core.AbstractRepository;
import dev.odes.celerity.app.core.Persistence;
import dev.odes.celerity.app.develop.model.EntityModel;
import dev.odes.celerity.app.develop.persistence.EntityMapperPersistence;
import org.springframework.stereotype.Repository;

@Repository
public class EntityRepository extends AbstractRepository<EntityModel, EntityMapperPersistence> {
  private Persistence<EntityModel> persistence;
  public EntityRepository(EntityMapperPersistence persistence) {
    super(persistence);
    this.persistence = persistence;
  }


}
