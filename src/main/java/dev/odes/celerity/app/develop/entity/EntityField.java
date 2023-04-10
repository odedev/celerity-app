package dev.odes.celerity.app.develop.entity;

import dev.odes.celerity.app.core.AbstractEntity;
import dev.odes.celerity.app.enumeration.DataTypeEnum;

public class EntityField extends AbstractEntity {

  /**
   * 主键ID
   * type: uuid
   */
  private String id;

  /**
   * 实体ID
   */
  private String entity;

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
   * default: false
   */
  private Boolean isSearchable;

  /**
   * 是否隐藏
   * default: false
   */
  private Boolean isHidden;

  /**
   * 是否默认显示
   * default: true
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


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getEntity() {
    return entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
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

  public Boolean getNullable() {
    return isNullable;
  }

  public void setNullable(Boolean nullable) {
    isNullable = nullable;
  }

  public Boolean getEditable() {
    return isEditable;
  }

  public void setEditable(Boolean editable) {
    isEditable = editable;
  }

  public Boolean getSearchable() {
    return isSearchable;
  }

  public void setSearchable(Boolean searchable) {
    isSearchable = searchable;
  }

  public Boolean getHidden() {
    return isHidden;
  }

  public void setHidden(Boolean hidden) {
    isHidden = hidden;
  }

  public Boolean getDefaultDisplay() {
    return isDefaultDisplay;
  }

  public void setDefaultDisplay(Boolean defaultDisplay) {
    isDefaultDisplay = defaultDisplay;
  }

  public Boolean getPrimaryKey() {
    return isPrimaryKey;
  }

  public void setPrimaryKey(Boolean primaryKey) {
    isPrimaryKey = primaryKey;
  }

  public Boolean getParentField() {
    return isParentField;
  }

  public void setParentField(Boolean parentField) {
    isParentField = parentField;
  }

  public DataTypeEnum getDataType() {
    return dataType;
  }

  public void setDataType(DataTypeEnum dataType) {
    this.dataType = dataType;
  }

  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public String getInitialValue() {
    return initialValue;
  }

  public void setInitialValue(String initialValue) {
    this.initialValue = initialValue;
  }

  public String getReferenceEnum() {
    return referenceEnum;
  }

  public void setReferenceEnum(String referenceEnum) {
    this.referenceEnum = referenceEnum;
  }

  public String getReferenceEntity() {
    return referenceEntity;
  }

  public void setReferenceEntity(String referenceEntity) {
    this.referenceEntity = referenceEntity;
  }

  public String getReferenceEntityField() {
    return referenceEntityField;
  }

  public void setReferenceEntityField(String referenceEntityField) {
    this.referenceEntityField = referenceEntityField;
  }
}
