package dev.odes.celerity.app.core;

import java.util.List;

public interface Repository<T> {

  public T findById(String id);

  public List<T> findById(Iterable<String> ids);

  public List<T> find();

  public T insert(T t);

}
