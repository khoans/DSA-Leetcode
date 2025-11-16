package com.nskhoa.designpattern.creational.singleton.example16;

public class LogManager {
    private static LogManager instance;

    private LogManager() {
        // Khởi tạo LogManager
        System.out.println("LogManager initialized");
    }

    public static synchronized LogManager getInstance() {
        if (instance == null) {
            instance = new LogManager();
        }
        return instance;
    }

    public void logInfo(String message) {
        System.out.println("[INFO]: " + message);
    }

    public void logError(String message) {
        System.err.println("[ERROR]: " + message);
    }

    public static void main(String[] args) {
        LogManager logManager = LogManager.getInstance();
        logManager.logInfo("This is an informational message.");
        logManager.logError("This is an error message.");
    }
}
