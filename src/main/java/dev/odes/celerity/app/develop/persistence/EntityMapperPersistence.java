package dev.odes.celerity.app.develop.persistence;

import dev.odes.celerity.app.core.MapperPersistence;
import dev.odes.celerity.app.develop.model.EntityFieldModel;
import dev.odes.celerity.app.develop.model.EntityModel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EntityMapperPersistence extends MapperPersistence<EntityModel> {
}
