package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example24;

// Client runner
public class ErrorLoggingDemo {
    public static void main(String[] args) {
        ErrorLogger criticalLogger = new CriticalLogger();
        ErrorLogger generalLogger = new GeneralLogger();
        ErrorLogger minorLogger = new MinorLogger();

        criticalLogger.setNextLogger(generalLogger);
        generalLogger.setNextLogger(minorLogger);

        Error e1 = new Error("NullPointerException", 3);
        Error e2 = new Error("IOException", 2);
        Error e3 = new Error("MinorWarning", 1);

        criticalLogger.log(e1);
        criticalLogger.log(e2);
        criticalLogger.log(e3);
    }
}

