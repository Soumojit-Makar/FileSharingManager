package com.file_sharing.app.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JwtResponse {
    private String jwtToken;      // The JWT token generated for the authenticated user
    private UserDTo user;         // The user data object containing user details
    private RefreshTokenDTO refreshToken; // The refresh token associated with the JWT
}
