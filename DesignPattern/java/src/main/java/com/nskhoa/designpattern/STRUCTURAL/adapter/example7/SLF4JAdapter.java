package com.nskhoa.designpattern.STRUCTURAL.adapter.example7;

public class SLF4JAdapter implements Logger {
    private SLF4J logger = new SLF4J();
    public void log(String message) {
        logger.info(message);
    }
}
