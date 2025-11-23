package com.nskhoa.designpattern.STRUCTURAL.bridge.example4;

public class PDFFormatter implements DocumentFormatter {
    public void format(String content) {
        System.out.println("Formatting PDF: " + content);
    }
}
