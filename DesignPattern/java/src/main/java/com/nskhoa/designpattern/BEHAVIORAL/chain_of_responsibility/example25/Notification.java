package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example25;

// Request class
public class Notification {
    private String message;

    public Notification(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
