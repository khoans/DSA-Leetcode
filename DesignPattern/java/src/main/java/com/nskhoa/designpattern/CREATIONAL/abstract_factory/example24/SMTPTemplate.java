package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example24;

public class SMTPTemplate implements Template {
    public String format(String content) {
        return "SMTP: " + content;
    }
}
