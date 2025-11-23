package com.nskhoa.designpattern.STRUCTURAL.bridge.example5;

public class Client {
    public static void main(String[] args) {
        LogStorage fileStorage = new FileStorage();
        Logger errorLoggerFile = new ErrorLogger(fileStorage);
        errorLoggerFile.log("File not found");

        LogStorage dbStorage = new DatabaseStorage();
        Logger errorLoggerDb = new ErrorLogger(dbStorage);
        errorLoggerDb.log("Database connection failed");
    }
}
