package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example13;

public interface LoggingAbstractFactory {
    Logger createLogger();

    Appender createAppender();
}

// Usage: LoggingAbstractFactory factory = new ConsoleFactory(); Logger logger = factory.createLogger(); logger.log("Error");

