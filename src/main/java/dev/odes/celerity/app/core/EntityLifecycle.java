package dev.odes.celerity.app.core;

/**
 * package: dev.odes.celerity.app.core
 * class: EntityLifecycle
 * date: 2023/4/1 0:02
 * version: 1.0.0
 * description: TODO delete
 */
public interface EntityLifecycle {
  default void setDefaultValue() {}
  default void validate() {}
  default void beforeFind(String where, String order) {}
  default void found() {}
  default void beforeInsert() {}
  default void inserted() {}
  default void beforeUpdate() {}
  default void updated() {}
  default void beforeDelete() {}
  default void deleted() {}
}
