package com.nskhoa.designpattern.STRUCTURAL.adapter.example40;

public class Notification {
    private final String message;

    Notification(String message) {
        this.message = message;
    }

    String getMessage() {
        return message;
    }
}
