package com.nskhoa.designpattern.CREATIONAL.factory_method.example12.factory.console;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example12.factory.Logger;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example12.factory.LoggerFactory;

public class ConsoleLoggerFactory extends LoggerFactory {
    public Logger createLogger() {
        return new ConsoleLogger();
    }
}

