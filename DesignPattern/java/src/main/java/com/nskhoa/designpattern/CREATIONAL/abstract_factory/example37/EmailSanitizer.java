package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example37;

public class EmailSanitizer implements Sanitizer {
    public String sanitize(String data) {
        return "Sanitized Email";
    }
}
