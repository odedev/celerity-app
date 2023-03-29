package dev.odes.celerity.app.core;

import java.util.List;

public interface Repository<T, P extends Persistence> {

  T findById(String id);

  List<T> findById(Iterable<String> ids);

}
