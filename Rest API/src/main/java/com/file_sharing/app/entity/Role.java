package com.file_sharing.app.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Entity representing a user role in the system.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Role {
    /** Unique identifier for the role. */
    @Id
    private String roleId;

    /** Name of the role (e.g., ADMIN, USER). */
    private String roleName;

    /** List of users associated with this role. */
    @ManyToMany(mappedBy = "roles", fetch = FetchType.LAZY)
    private List<UserEntity> users = new ArrayList<>();
}
