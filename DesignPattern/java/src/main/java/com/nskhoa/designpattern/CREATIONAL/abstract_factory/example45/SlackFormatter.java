package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example45;

public class SlackFormatter implements Formatter {
    public String format(String alert) {
        return "Slack: " + alert;
    }
}
