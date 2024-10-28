package com.file_sharing.app.exceptions;

/**
 * Custom exception class for handling file-related exceptions in the application.
 */
public class FileExceptions extends RuntimeException {
    
    /** Default constructor that calls the parent class constructor. */
    public FileExceptions() {
        super();
    }

    /** 
     * Constructor that accepts a custom error message.
     * 
     * @param message the detail message to be included with the exception.
     */
    public FileExceptions(String message) {
        super(message);
    }
}
