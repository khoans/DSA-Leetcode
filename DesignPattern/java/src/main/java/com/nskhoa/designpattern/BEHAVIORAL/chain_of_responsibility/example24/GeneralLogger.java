package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example24;

public class GeneralLogger extends ErrorLogger {
    @Override
    public void log(Error error) {
        if (error.getSeverity() == 2) {
            System.out.println("GeneralLogger: Logged error: " + error.getType());
        }
        if (nextLogger != null) {
            nextLogger.log(error);
        }
    }
}
