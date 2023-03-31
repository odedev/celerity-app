package dev.odes.celerity.app.core;

import org.springframework.context.Lifecycle;
import org.springframework.context.SmartLifecycle;

import java.util.Date;

public abstract class AbstractEntity {
  private Date createdAt;
  private Date updatedAt;
  private Date deletedAt;


}
