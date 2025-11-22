package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example24;

// Concrete Handlers
public class CriticalLogger extends ErrorLogger {
    @Override
    public void log(Error error) {
        if (error.getSeverity() >= 3) {
            System.out.println("CriticalLogger: Alert sent for error: " + error.getType());
        }
        if (nextLogger != null) {
            nextLogger.log(error);
        }
    }
}
