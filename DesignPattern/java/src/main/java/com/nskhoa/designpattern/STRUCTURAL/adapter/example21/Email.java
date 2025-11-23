package com.nskhoa.designpattern.STRUCTURAL.adapter.example21;

public class Email {
    private final String from;
    private final String subject;

    Email(String from, String subject) {
        this.from = from; this.subject = subject;
    }

    String getFrom() {
        return from;
    }

    String getSubject() {
        return subject;
    }
}
