package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example32;

// Request class
public class Task {
    private int priority;
    private String status = "pending";

    public Task(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }

    public void approve() {
        status = "approved";
    }

    public void reject() {
        status = "rejected";
    }

    public void escalate() {
        status = "escalated";
    }
}
