package org.odc.utils.Generics.Entities;

import java.time.LocalDateTime;


public abstract class EntityAbstract {
    protected boolean deleted = false;

    protected LocalDateTime deletedAt;
    protected LocalDateTime createdAt;
    protected LocalDateTime updatedAt;
}
