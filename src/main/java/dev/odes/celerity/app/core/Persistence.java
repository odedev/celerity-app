package dev.odes.celerity.app.core;

import java.util.List;

public interface Persistence<T> {

  List<T> find();

  T findOne();

  void insertOne(T t);

}
