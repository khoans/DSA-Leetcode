package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example19;

// Request class
public class BugReport {
    private String severity;

    public BugReport(String severity) {
        this.severity = severity;
    }

    public String getSeverity() {
        return severity;
    }
}
