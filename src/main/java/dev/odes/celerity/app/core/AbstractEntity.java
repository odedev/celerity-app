package dev.odes.celerity.app.core;

import org.springframework.context.Lifecycle;
import org.springframework.context.SmartLifecycle;

import java.io.Serializable;
import java.util.Date;

public abstract class AbstractEntity implements Serializable {
  private static final long serial = 1L;

  private Date createdAt;
  private Date updatedAt;
  private Date deletedAt;
}
