package dev.odes.celerity.app.core;

import java.util.List;

public abstract class AbstractRepository<T extends Model, P extends Persistence<T>> implements Repository<T> {
  private final P persistence;

  public AbstractRepository(P persistence) {
    this.persistence = persistence;
  }

  public P getPersistence() {
    return persistence;
  }

  @Override
  public List<T> findMany() {
    return null;
  }

  @Override
  public T findOne(String id) {
    this.beforeFind();
    this.persistence.findOne();
    this.found();
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
    t.validate();
    t.setDefaultValue();
    this.validate(t);
    this.setDefaultValue(t);
    this.beforeInsert();
    this.persistence.insertOne(t);
    this.inserted();
  }

  @Override
  public void insertMany(Iterable<T> list) {
    list.forEach(t -> {
      t.validate();
      t.setDefaultValue();
    });
    this.validate(list);
    this.setDefaultValue();
    this.beforeInsert();
    this.persistence.insert(list);
    this.inserted(list);
  }
}
