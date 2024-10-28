package com.file_sharing.app.repositories;

import com.file_sharing.app.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolesRepository extends JpaRepository<Role, String> {

    /**
     * Finds a role by its name.
     *
     * @param name the name of the role to find
     * @return an Optional containing the found Role, or empty if not found
     */
    Optional<Role> findByRoleName(String name);
}
