package com.nskhoa.designpattern.CREATIONAL.factory_method.example19.factory.csv;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example19.factory.Report;

public class CSVReport implements Report {
    public void generate(String data) {
        System.out.println("Generated CSV Report: " + data);
    }
}
