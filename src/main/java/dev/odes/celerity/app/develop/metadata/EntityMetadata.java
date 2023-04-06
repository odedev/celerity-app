package dev.odes.celerity.app.develop.metadata;

import dev.odes.celerity.app.core.Field;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;


public final class EntityMetadata {
  public static final String entity = "dev.odes.celerity.app.develop.entity.Entity";
  public static final String model = "dev.odes.celerity.app.develop.model.EntityModel";
  public static final String code = "Entity";
  public static final String name = "实体";
  public static final String description = "实体定义";
  public static final Boolean isPageable = true;
  public static final Integer referenceCount = 0;

  public static final Map<String, Field> fields = new HashMap<>(
    Map.ofEntries(
      new AbstractMap.SimpleEntry<>("id", new Field()),
      new AbstractMap.SimpleEntry<>("code", new Field()),
      new AbstractMap.SimpleEntry<>("name", new Field()),
      new AbstractMap.SimpleEntry<>("age", new Field())
    )
  );

}
