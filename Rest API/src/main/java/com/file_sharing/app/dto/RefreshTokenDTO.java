package com.file_sharing.app.dto;

import lombok.*;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RefreshTokenDTO {
    private int id;                   // Unique identifier for the refresh token
    private String refreshTokenHold;  // The actual refresh token string
    private Instant expiresDate;      // Expiration date of the refresh token
    private UserDTo user;             // Associated user details
}
