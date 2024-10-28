package com.file_sharing.app.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

/**
 * Entity representing a refresh token for user authentication.
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class RefreshToken {
    /** Unique identifier for the refresh token. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /** The refresh token string used to obtain a new access token. */
    private String refreshTokenHold;

    /** The expiration date of the refresh token. */
    private Instant expiresDate;

    /** The user associated with the refresh token. */
    @OneToOne
    private UserEntity user;
}
