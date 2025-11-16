package com.nskhoa.designpattern.creational.factory_method.example12.factory.file;

import com.nskhoa.designpattern.creational.factory_method.example12.factory.Logger;
import com.nskhoa.designpattern.creational.factory_method.example12.factory.LoggerFactory;

public class FileLoggerFactory extends LoggerFactory {
    public Logger createLogger() {
        return new FileLogger();
    }
}
