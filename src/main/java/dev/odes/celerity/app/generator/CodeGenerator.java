package dev.odes.celerity.app.generator;

import dev.odes.celerity.app.constant.Constant;
import dev.odes.celerity.app.generator.context.TemplateContext;
import org.apache.commons.io.FileUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Map;

public class CodeGenerator {
  private static final String ROOT_PATH = "";
  private static final String MODULE_PATH = "";
  private static final String MODULE_DOMAIN_PATH = "";
  private static final String MODULE_APP_PATH = "";
  private static final String ROOT_PACKAGE = "dev.odes.celerity.app";

  private final TemplateContext templateContext;

  public CodeGenerator(TemplateContext templateContext) {
    this.templateContext = templateContext;
  }

  public String getFilePath() {
    return "workspace/test.txt";
  }

  public void generate() {

    VelocityInitializer.init();
    VelocityContext velocityContext = new VelocityContext();
    velocityContext.put("templateContext", this.templateContext);

    Map<String, String> templateMap = TemplateMap.getTemplateMap();
    for (Map.Entry<String, String> entry : templateMap.entrySet()) {
      String fileName = entry.getKey();
      String templatePath = entry.getValue();
      StringWriter stringWriter = new StringWriter();

      Template template = Velocity.getTemplate(templatePath, Constant.TEMPLATE_ENCODING);
      template.merge(velocityContext, stringWriter);
      String content = stringWriter.toString();
      String path = getFilePath();

      try {
        FileUtils.writeStringToFile(new File(path), content, Constant.TEMPLATE_ENCODING);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }

      System.out.println(content);

    }

  }

}
