package org.odc.utils.Generics.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface SoftDeleteRepository<T,ID> extends JpaRepository<T, ID> {
    @Modifying
    @Transactional
    @Query("UPDATE #{#entityName} e SET e.deleted = true, e.deletedAt = CURRENT_TIMESTAMP WHERE e.id = ?1")
    void softDelete(Long id);

    @Modifying
    @Transactional
    @Query("UPDATE #{#entityName} e SET e.deleted = true, e.deletedAt = CURRENT_TIMESTAMP WHERE e.id = ?1")
    void delete(T entity);


    @Query("SELECT e FROM #{#entityName} e WHERE e.deleted = false")
    List<T> findAll();

    @Query("SELECT e FROM #{#entityName} e WHERE e.deleted = false AND e.id = ?1")
    Optional<T> findById(ID id);

    @Query("SELECT e FROM #{#entityName} e WHERE e.deleted = true")
    List<T> findAllDeleted();

    @Query("SELECT e FROM #{#entityName} e WHERE e.deleted = true AND e.id = ?1")
    Optional<T> findDeletedById(ID id);

    @Query("SELECT e FROM #{#entityName} e")
    List<T> findWithAllDeleted();

    @Query("SELECT e FROM #{#entityName} e WHERE e.id = ?1")
    Optional<T> findWithDeletedById(ID id);


    @Modifying
    @Transactional
    @Query("UPDATE #{#entityName} e SET e.deleted = false, e.deletedAt = null WHERE e.id = ?1")
    void restore(ID id);
}
