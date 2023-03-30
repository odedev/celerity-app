package dev.odes.celerity.app.core;

import java.util.List;

public interface Persistence<T> {

  public List<T> find();

  public T findOne();

  public void insertOne(T t);

  public void insert(T t);
}
