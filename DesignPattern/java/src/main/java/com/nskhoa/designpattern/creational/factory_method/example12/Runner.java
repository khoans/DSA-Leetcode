package com.nskhoa.designpattern.CREATIONAL.factory_method.example12;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example12.factory.Logger;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example12.factory.LoggerFactory;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example12.factory.console.ConsoleLoggerFactory;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example12.factory.file.FileLoggerFactory;

public class Runner {
    public static void main(String[] args) {
        LoggerFactory consoleLoggerFactory = new ConsoleLoggerFactory();
        Logger consoleLogger = consoleLoggerFactory.createLogger();
        consoleLogger.log("This is a log message to the console.");

        LoggerFactory fileLoggerFactory = new FileLoggerFactory();
        Logger fileLogger = fileLoggerFactory.createLogger();
        fileLogger.log("This is a log message to the file.");
    }
}
