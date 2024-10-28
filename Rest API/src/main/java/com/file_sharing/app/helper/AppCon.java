package com.file_sharing.app.helper;

/**
 * This class holds application-wide constants for pagination and roles.
 */
public final class AppCon {
    
    // Default pagination settings
    public static final int PAGE_NUMBER = 0; // Default starting page number
    public static final int PAGE_SIZE = 10;   // Default number of items per page
    public static final String SORT_BY = "name"; // Default sorting field
    public static final String SORT_DIR = "asc";  // Default sorting direction

    // User roles
    public static final String ROLE_ADMIN = "ADMIN";   // Role for admin users
    public static final String ROLE_NORMAL = "NORMAL"; // Role for normal users

    // Private constructor to prevent instantiation
    private AppCon() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}
