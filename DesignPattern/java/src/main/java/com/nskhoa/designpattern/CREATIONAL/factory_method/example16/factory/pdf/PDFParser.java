package com.nskhoa.designpattern.CREATIONAL.factory_method.example16.factory.pdf;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example16.factory.Parser;

public class PDFParser implements Parser {
    public void parse(String content) { System.out.println("Parsed PDF: " + content); }
}
