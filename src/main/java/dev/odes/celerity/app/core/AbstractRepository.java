package dev.odes.celerity.app.core;

import java.util.List;

public abstract class AbstractRepository<T extends Model, P extends Persistence> implements Repository<T, P> {
  private P persistence;
  public AbstractRepository(P persistence) {
    this.persistence = persistence;
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
