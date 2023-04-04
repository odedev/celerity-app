package dev.odes.celerity.app.develop.persistence;

import dev.odes.celerity.app.core.MapperPersistence;
import dev.odes.celerity.app.develop.model.EntityFieldModel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EntityFieldMapperPersistence extends MapperPersistence<EntityFieldModel> {
}
