package dev.odes.celerity.app.develop.generator.context;

import dev.odes.celerity.app.develop.generator.context.EntityContext;
import dev.odes.celerity.app.develop.generator.context.ModelContext;
import dev.odes.celerity.app.develop.generator.context.RepositoryContext;

public class TemplateContext {

  private EntityContext entityContext;
  private ModelContext modelContext;
  private RepositoryContext repositoryContext;

  public EntityContext getEntityContext() {
    return entityContext;
  }

  public void setEntityContext(EntityContext entityContext) {
    this.entityContext = entityContext;
  }

  public ModelContext getModelContext() {
    return modelContext;
  }

  public void setModelContext(ModelContext modelContext) {
    this.modelContext = modelContext;
  }

  public RepositoryContext getRepositoryContext() {
    return repositoryContext;
  }

  public void setRepositoryContext(RepositoryContext repositoryContext) {
    this.repositoryContext = repositoryContext;
  }
}