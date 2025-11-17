package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example13;

public class Runner {
    public static void main(String[] args) {
        LoggingAbstractFactory factory = new ConsoleFactory();
        Logger logger = factory.createLogger();
        Appender appender = factory.createAppender();

        logger.log("This is a log message.");
        appender.append("This is appended data.");
    }
}
