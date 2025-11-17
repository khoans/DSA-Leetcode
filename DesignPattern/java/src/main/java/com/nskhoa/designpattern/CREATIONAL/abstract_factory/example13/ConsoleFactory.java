package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example13;

public class ConsoleFactory implements LoggingAbstractFactory {
    public Logger createLogger() { return new ConsoleLogger(); }
    public Appender createAppender() { return new ConsoleAppender(); }
}
