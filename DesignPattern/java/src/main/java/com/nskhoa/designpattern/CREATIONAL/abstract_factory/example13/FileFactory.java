package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example13;

public class FileFactory implements LoggingAbstractFactory {
    public Logger createLogger() {
        return new FileLogger();
    }

    public Appender createAppender() {
        return new FileAppender();
    }
}
