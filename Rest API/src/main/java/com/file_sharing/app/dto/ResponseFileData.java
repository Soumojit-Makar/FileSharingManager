package com.file_sharing.app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseFileData {
    private String fileName;   // Name of the file
    private String fileType;   // Type or extension of the file (e.g., "image/png")
    private String url;        // URL where the file can be accessed
    private long fileSize;     // Size of the file in bytes
    private String fileId;     // Unique identifier for the file
}
