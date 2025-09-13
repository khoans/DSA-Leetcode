package com.nskhoa;

public class DatabaseConnection {

    // Volatile ensures that changes are visible to all threads immediately
    private static volatile DatabaseConnection instance;

    // Private constructor to prevent instantiation
    private DatabaseConnection() {
        // Simulate some initialization work
        System.out.println("DatabaseConnection created.");
    }

    // Public method to provide global access to the instance
    public static DatabaseConnection getInstance() {
        // Check if instance is already created (no sync on every call)
        if (instance == null) {
            // Synchronize only the first time
            synchronized (DatabaseConnection.class) {
                // Double-check if instance is still null
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    // Example method to show usage
    public void connect() {
        System.out.println("Connected to the database.");
    }
}
