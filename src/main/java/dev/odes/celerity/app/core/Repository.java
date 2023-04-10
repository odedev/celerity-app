package dev.odes.celerity.app.core;

import java.util.List;

public interface Repository<T> {

  public List<T> findMany();

  public T findOne(String condition);

  public List<T> findManyById(Iterable<String> ids);

  public T findOneById(String id);

  public void insertOne(T t);

  public void insertMany(Iterable<T> list);


  default void validate() {}
  default void validate(T t) {}
  default void validate(Iterable<T> list) {}
  default void setDefaultValue() {}
  default void setDefaultValue(T t) {}
  default void setDefaultValue(Iterable<T> list) {}
  default void beforeFind() {}
  default void found() {}
  default void beforeInsert() {}
  default void inserted() {}
  default void inserted(Iterable<T> list) {}

//  default void beforeUpdate() {}
//  default void updated() {}
//  default void beforeDelete() {}
//  default void deleted() {}

}
