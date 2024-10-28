package com.file_sharing.app.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@Builder
public class ApiResponseMessage {
    private String message;       // Custom message describing the result of the operation
    private boolean success;       // Indicator of success or failure
    private HttpStatus httpStatus; // HTTP status code for the response
}
