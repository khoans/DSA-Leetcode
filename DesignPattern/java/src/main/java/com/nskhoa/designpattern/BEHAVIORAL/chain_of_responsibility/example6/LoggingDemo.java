package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example6;

// Client Runner

public class LoggingDemo {
    public static void main(String[] args) {
        Logger errorLogger = new ErrorLogger();
        Logger warningLogger = new WarningLogger();
        Logger infoLogger = new InfoLogger();

        errorLogger.setNextLogger(warningLogger);
        warningLogger.setNextLogger(infoLogger);

        System.out.println("Logging a WARNING:");
        errorLogger.logMessage(2, "This is a warning level log");

        System.out.println("\nLogging an ERROR:");
        errorLogger.logMessage(3, "This is an error level log");

        System.out.println("\nLogging an INFO:");
        errorLogger.logMessage(1, "This is an info level log");
    }
}

