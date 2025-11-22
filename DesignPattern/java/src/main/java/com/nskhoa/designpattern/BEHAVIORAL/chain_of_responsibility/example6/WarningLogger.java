package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example6;

public class WarningLogger extends Logger {
    private final int LEVEL = 2;

    @Override
    public void logMessage(int level, String message) {
        if (level >= LEVEL) {
            System.out.println("Warning Logger: " + message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }
}
