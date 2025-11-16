package com.nskhoa.designpattern.creational.factory_method.example19.factory.pdf;

import com.nskhoa.designpattern.creational.factory_method.example19.factory.Report;

public class PDFReport implements Report {
    public void generate(String data) {
        System.out.println("Generated PDF Report: " + data);
    }
}
