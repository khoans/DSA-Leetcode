package com.nskhoa.designpattern.STRUCTURAL.adapter.example1;

public class Client {
    public static void main(String[] args) {
        DocumentConverter converter = new DocumentConverterAdapter();
        converter.convert("document.pdf");
        converter.convert("report.docx");
        converter.convert("notes.txt");
        converter.convert("image.jpg");
    }
}
