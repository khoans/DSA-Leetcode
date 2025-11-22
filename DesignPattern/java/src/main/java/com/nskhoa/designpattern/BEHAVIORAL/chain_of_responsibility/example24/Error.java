package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example24;

// Request class
public class Error {
    private String type;
    private int severity;

    public Error(String type, int severity) {
        this.type = type;
        this.severity = severity;
    }

    public String getType() {
        return type;
    }

    public int getSeverity() {
        return severity;
    }
}
