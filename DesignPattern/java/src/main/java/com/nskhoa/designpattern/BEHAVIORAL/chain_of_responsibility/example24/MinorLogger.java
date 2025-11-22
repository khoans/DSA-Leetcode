package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example24;

public class MinorLogger extends ErrorLogger {
    @Override
    public void log(Error error) {
        if (error.getSeverity() == 1) {
            System.out.println("MinorLogger: Stored error: " + error.getType());
        }
    }
}
