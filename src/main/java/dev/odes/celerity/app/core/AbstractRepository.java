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
  public List<T> findMany() {
    return null;
  }

  @Override
  public T findOne(String id) {
    return null;
  }

  @Override
  public T findOneById(String id) {
    return null;
  }

  @Override
  public List<T> findManyById(Iterable<String> ids) {
    return null;
  }

  @Override
  public void insertOne(T t) {

  }

  @Override
  public void insertMany(Iterable<T> list) {

  }
}
