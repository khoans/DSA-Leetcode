package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example6;

public class InfoLogger extends Logger {
    private final int LEVEL = 1;

    @Override
    public void logMessage(int level, String message) {
        if (level >= LEVEL) {
            System.out.println("Info Logger: " + message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }
}
