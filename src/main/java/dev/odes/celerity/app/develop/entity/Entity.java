package dev.odes.celerity.app.develop.entity;

import dev.odes.celerity.app.core.AbstractEntity;

public class Entity extends AbstractEntity {
  private String id;
  private String code;
  private String name;
  private String description;
  private Integer segmentCount;

  /**
   * 是否可分页
   * default: true
   */
  private Boolean isPageable;

}
