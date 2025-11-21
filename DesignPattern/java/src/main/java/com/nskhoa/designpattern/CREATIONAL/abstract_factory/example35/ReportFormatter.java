package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example35;

public class ReportFormatter implements Formatter {
    public void format(String content) {
        System.out.println("Report Formatted: " + content);
    }
}
