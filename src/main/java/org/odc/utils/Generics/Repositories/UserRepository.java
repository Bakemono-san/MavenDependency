package org.odc.utils.Generics.Repositories;

import org.odc.utils.Generics.Entities.AbstractUserEntity;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//@Repository
public interface UserRepository {
    Optional<AbstractUserEntity> findByUsername(String username);
}
