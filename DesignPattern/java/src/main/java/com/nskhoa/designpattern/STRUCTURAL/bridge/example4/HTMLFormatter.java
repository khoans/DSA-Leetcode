package com.nskhoa.designpattern.STRUCTURAL.bridge.example4;

public class HTMLFormatter implements DocumentFormatter {
    public void format(String content) {
        System.out.println("Formatting HTML: " + content);
    }
}
