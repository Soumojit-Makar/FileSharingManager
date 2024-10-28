package com.file_sharing.app.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.Instant;

/**
 * Entity representing a file in the file sharing application.
 */
@Data
@Entity
public class FileEntity {
    
    /** Unique identifier for the file. */
    @Id
    private String fileId;

    /** Name of the file. */
    private String fileName;

    /** Type of the file (e.g., PDF, JPEG). */
    private String fileType;

    /** User who uploaded the file. */
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private UserEntity uploadBy;

    /** Date and time when the file was uploaded. */
    private Instant uploadDate;

    /** Date and time when the file expires, if applicable. */
    private Instant expiryDate;

    /** Binary data of the file. Stored as a LOB (Large Object). */
    @Lob
    @Column(name = "data", columnDefinition = "LONGBLOB")
    private byte[] fileData;
}
