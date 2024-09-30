package org.odc.utils.Generics.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
public abstract class RoleEntity {
    @Id
    @GeneratedValue
    private long id;

    private String libelle;

    @OneToMany(mappedBy = "role")
    @JoinColumn(name = "owner_id")
    private List<AbstractUserEntity> owner;

}
