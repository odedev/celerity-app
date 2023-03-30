package dev.odes.celerity.app.core;

import java.util.List;

public abstract class AbstractRepository<T extends Model, P extends Persistence<T>> implements Repository<T> {
  private final P persistence;
  public AbstractRepository(P persistence) {
    this.persistence = persistence;
  }

  public void setDefaultValue(T t) {
    t.setDefaultValue();

  }

  @Override
  public T insert(T t) {
    this.setDefaultValue(t);
    this.persistence.insertOne(t);
    return t;
  }

  @Override
  public T findById(String id) {
    return null;
  }

  @Override
  public List<T> findById(Iterable<String> ids) {
    return null;
  }
}
