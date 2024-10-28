package com.file_sharing.app.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JwtRequest implements Serializable {
    private String username;  // The username of the user attempting to authenticate
    private String password;  // The password for the given username
}
