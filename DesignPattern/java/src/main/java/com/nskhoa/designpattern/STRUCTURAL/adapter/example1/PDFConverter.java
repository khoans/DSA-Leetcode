package com.nskhoa.designpattern.STRUCTURAL.adapter.example1;

// Adaptee classes simulating different formats
public class PDFConverter {
    void convertPDF(String filePath) {
        System.out.println("Converting PDF: " + filePath);
    }
}
