package dev.odes.celerity.app.core;

import dev.odes.celerity.app.enumeration.DataTypeEnum;

public class Field {

  /**
   * 编码
   */
  private String code;

  /**
   * 名称
   */
  private String name;

  /**
   * 描述
   */
  private String description;

  /**
   * 是否可空
   * default: true
   */
  private Boolean isNullable;

  /**
   * 是否可编辑
   * default: true
   */
  private Boolean isEditable;

  /**
   * 是否可搜索
   * default: true
   */
  private Boolean isSearchable;

  /**
   * 是否隐藏
   * default: false
   */
  private Boolean isHidden;

  /**
   * 是否默认显示, 只能有一个字段为 true
   * default: false
   */
  private Boolean isDefaultDisplay;

  /**
   * 是否主键, 只能有一个字段为 true
   * default: false
   */
  private Boolean isPrimaryKey;

  /**
   * 是否父字段, 只能有一个字段为 true
   * default: false
   */
  private Boolean isParentField;

  /**
   * 是否主实体字段, 只能有一个字段为 true, 主从关系使用
   * default: false
   */
  private Boolean isMasterField;

  /**
   * 是否从实体字段, 主从关系使用
   * default: false
   */
  private Boolean isSlaveField;

  /**
   * 数据类型
   */
  private DataTypeEnum dataType;

  /**
   * 长度
   * default: 255
   */
  private Integer length;

  /**
   * 默认值
   */
  private String defaultValue;

  /**
   * 初始化值
   */
  private String initialValue;

  /**
   * 引用枚举
   */
  private String referenceEnum;

  /**
   * 引用实体
   */
  private String referenceEntity;

  /**
   * 引用实体字段
   */
  private String referenceEntityField;

  public Field() {
  }

  public Field(String code, String name, String description, Boolean isNullable, Boolean isEditable, Boolean isSearchable, Boolean isPageable, Boolean isHidden, Boolean isDefaultDisplay, Boolean isPrimaryKey, DataTypeEnum dataType, Integer length, String defaultValue, String referenceEnum, String referenceEntity, String referenceEntityField) {
    this.code = code;
    this.name = name;
    this.description = description;
    this.isNullable = isNullable;
    this.isEditable = isEditable;
    this.isSearchable = isSearchable;
    this.isHidden = isHidden;
    this.isDefaultDisplay = isDefaultDisplay;
    this.isPrimaryKey = isPrimaryKey;
    this.dataType = dataType;
    this.length = length;
    this.defaultValue = defaultValue;
    this.referenceEnum = referenceEnum;
    this.referenceEntity = referenceEntity;
    this.referenceEntityField = referenceEntityField;
  }

  public String getCode() {
    return code;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public Boolean getNullable() {
    return isNullable;
  }

  public Boolean getEditable() {
    return isEditable;
  }

  public Boolean getSearchable() {
    return isSearchable;
  }

  public Boolean getHidden() {
    return isHidden;
  }

  public Boolean getDefaultDisplay() {
    return isDefaultDisplay;
  }

  public Boolean getPrimaryKey() {
    return isPrimaryKey;
  }

  public DataTypeEnum getDataType() {
    return dataType;
  }

  public Integer getLength() {
    return length;
  }

  public String getDefaultValue() {
    return defaultValue;
  }

  public String getReferenceEnum() {
    return referenceEnum;
  }

  public String getReferenceEntity() {
    return referenceEntity;
  }

  public String getReferenceEntityField() {
    return referenceEntityField;
  }
}
