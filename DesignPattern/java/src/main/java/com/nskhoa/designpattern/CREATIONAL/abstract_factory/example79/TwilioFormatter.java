package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example79;

public class TwilioFormatter implements Formatter {
    public String format(String text) {
        return "Twilio Formatted: " + text;
    }
}
