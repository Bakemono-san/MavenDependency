package org.odc.utils.Generics.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class AbstractUserEntity<ID> extends EntityAbstract{
    @Id
    private ID id;


    private String username;

    private String password;

    @Column(nullable = false)
    private boolean enabled = true;

    public Boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @ManyToOne
    @JoinColumn(name = "role_id")
    private RoleEntity role;
}
