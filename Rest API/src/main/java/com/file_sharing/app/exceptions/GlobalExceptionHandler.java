package com.file_sharing.app.exceptions;

import com.file_sharing.app.dto.ApiResponseMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Global exception handler for handling various exceptions in the application.
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * Handles ResourceNotFoundException and returns a custom response.
     *
     * @param ex the ResourceNotFoundException instance.
     * @return ResponseEntity with error message and status.
     */
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponseMessage> resourceNotFoundException(ResourceNotFoundException ex) {
        logger.error("Resource not found: {}", ex.getMessage());
        return new ResponseEntity<>(
                ApiResponseMessage.builder()
                        .message(ex.getMessage())
                        .success(false)
                        .httpStatus(HttpStatus.NOT_FOUND)
                        .build(),
                HttpStatus.NOT_FOUND
        );
    }

    /**
     * Handles FileExceptions and returns a custom response.
     *
     * @param ex the FileExceptions instance.
     * @return ResponseEntity with error message and status.
     */
    @ExceptionHandler(FileExceptions.class)
    public ResponseEntity<ApiResponseMessage> fileException(FileExceptions ex) {
        logger.error("File exception occurred: {}", ex.getMessage());
        return new ResponseEntity<>(
                ApiResponseMessage.builder()
                        .message(ex.getMessage())
                        .success(false)
                        .httpStatus(HttpStatus.BAD_REQUEST)
                        .build(),
                HttpStatus.BAD_REQUEST
        );
    }

    /**
     * Handles BadCredentialsException and returns a custom response.
     *
     * @param exception the BadCredentialsException instance.
     * @return ResponseEntity with error message and status.
     */
    @ExceptionHandler(BadCredentialsException.class)
    public ResponseEntity<ApiResponseMessage> badCredentialsExceptionHandler(BadCredentialsException exception) {
        logger.warn("Bad credentials: {}", exception.getMessage());
        return new ResponseEntity<>(
                ApiResponseMessage.builder()
                        .httpStatus(HttpStatus.UNAUTHORIZED)
                        .message(exception.getMessage())
                        .success(false)  // Adjusted to false to reflect a failure in authentication.
                        .build(),
                HttpStatus.UNAUTHORIZED
        );
    }
}
