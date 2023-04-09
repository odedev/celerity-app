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

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getSegmentCount() {
    return segmentCount;
  }

  public void setSegmentCount(Integer segmentCount) {
    this.segmentCount = segmentCount;
  }

  public Boolean getPageable() {
    return isPageable;
  }

  public void setPageable(Boolean pageable) {
    isPageable = pageable;
  }
}
