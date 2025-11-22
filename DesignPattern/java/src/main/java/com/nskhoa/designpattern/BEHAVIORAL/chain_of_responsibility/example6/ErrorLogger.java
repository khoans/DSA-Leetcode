package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example6;

// Concrete Handlers
public class ErrorLogger extends Logger {
    private final int LEVEL = 3;

    @Override
    public void logMessage(int level, String message) {
        if (level >= LEVEL) {
            System.out.println("Error Logger: " + message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }
}
