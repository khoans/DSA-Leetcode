package com.nskhoa.designpattern.STRUCTURAL.adapter.example7;

public class Log4jAdapter implements Logger {
    private Log4j logger = new Log4j();
    public void log(String message) {
        logger.logInfo(message);
    }
}
