package dev.odes.celerity.app.core;

import java.util.List;

public interface Persistence<T> {

  public T findOne();

  public List<T> findMany();

  public void insertOne(T t);

  public void insert(T t);

}
