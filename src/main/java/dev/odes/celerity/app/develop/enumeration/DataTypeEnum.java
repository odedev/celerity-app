package dev.odes.celerity.app.develop.enumeration;

public enum DataTypeEnum {
  BOOLEAN(0, "BOOLEAN"),
  INTEGER(1, "INTEGER"),
  ENTITY(2, "ENTITY");

  private final Integer value;
  private final String name;

  DataTypeEnum(Integer value, String name) {
    this.value = value;
    this.name = name;
  }

  public Integer getValue() {
    return value;
  }

  public String getName() {
    return name;
  }
}
