package dev.odes.celerity.app.generator;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class TemplateMap {

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

    return templateMap;
  }

  public static String getVMPath(String fileName) {
    return "template" + File.separator + fileName;
  }

}
