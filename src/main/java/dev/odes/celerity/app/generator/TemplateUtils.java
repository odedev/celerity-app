package dev.odes.celerity.app.generator;

import java.io.File;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class TemplateUtils {
  public static final String ROOT_PATH = "src"+ File.separator + "main" + File.separator + "java";
  public static final String DOMAIN_PATH = "dev" + File.separator + "odes" + File.separator + "celerity" + File.separator + "app" + File.separator + "domain";
  public static final String ROOT_PACKAGE = "dev.odes.celerity.app";
  public static final String DOMAIN_PACKAGE = "dev.odes.celerity.app.domain";
  public static final String TEMPLATE_DIR = "template";

  public static final Map<String, String> TEMPLATES = new HashMap<>(
    Map.ofEntries(
      new AbstractMap.SimpleEntry<>(".java", getVMPath("entity.java.vm")),
      new AbstractMap.SimpleEntry<>("Model.java", getVMPath("model.java.vm")),
//      new AbstractMap.SimpleEntry<>("Persistence.java", getVMPath("persistence.java.vm")),
//      new AbstractMap.SimpleEntry<>("Mapper.java", getVMPath("mapper.java.vm")),
//      new AbstractMap.SimpleEntry<>("Repository.java", getVMPath("repository.java.vm")),
//      new AbstractMap.SimpleEntry<>("Service.java", getVMPath("service.java.vm")),
//      new AbstractMap.SimpleEntry<>("Controller.java", getVMPath("controller.java.vm")),
      new AbstractMap.SimpleEntry<>("Metadata.java", getVMPath("metadata.java.vm"))

    )
  );

  public static Map<String, String> getTemplateMap() {
    Map<String, String> templateMap = new HashMap<>();
    templateMap.put("test.txt", getVMPath("test.vm"));

//    templateMap.put(".java", getVMPath("entity.java.vm"));
//    templateMap.put("Model.java", getVMPath("model.java.vm"));
//    templateMap.put("Persistence.java", getVMPath("persistence.java.vm"));
//    templateMap.put("Mapper.java", getVMPath("mapper.java.vm"));
//    templateMap.put("Repository.java", getVMPath("repository.java.vm"));
//    templateMap.put("Service.java", getVMPath("service.java.vm"));
//    templateMap.put("Controller.java", getVMPath("controller.java.vm"));
//    templateMap.put("Metadata.java", getVMPath("metadata.java.vm"));

    return templateMap;
  }

  public static String getVMPath(String fileName) {
    return TEMPLATE_DIR + File.separator + fileName;
  }

  public static String getFilePath(String fileName) {
    return ROOT_PATH + File.separator + DOMAIN_PATH + File.separator + fileName;
  }

}
