package dev.odes.celerity.app.core;

import java.util.List;

public interface MapperPersistence<T> extends Persistence<T> {
  @Override
  List<T> findMany();

  @Override
  T findOne();

  @Override
  void insertOne(T t);

  @Override
  void insert(Iterable<T> list);
}
