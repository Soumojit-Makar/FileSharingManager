package com.file_sharing.app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoleDTo {

    private String roleId;            // Unique identifier for the role
    private String roleName;          // Name of the role (e.g., "Admin", "User")
    private List<UserDTo> users;      // List of users associated with this role
}
