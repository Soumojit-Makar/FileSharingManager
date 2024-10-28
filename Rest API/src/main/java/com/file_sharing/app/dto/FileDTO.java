package com.file_sharing.app.dto;

import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.file_sharing.app.entity.UserEntity;

import lombok.Data;

@Data
public class FileDTO {
    private String fileId;           // Unique identifier for the file
    private String fileName;         // Name of the file
    private String fileType;         // Type of the file (e.g., "image/png", "application/pdf")
    
    @JsonIgnore
    private UserEntity uploadBy;     // The user who uploaded the file (not serialized in JSON)
    
    private Instant uploadDate;      // Timestamp when the file was uploaded
    private byte[] fileData;         // Raw file data 
}