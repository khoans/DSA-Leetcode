package com.nskhoa.designpattern.CREATIONAL.factory_method.example19.factory.pdf;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example19.factory.Report;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example19.factory.ReportFactory;

public class PDFFactory extends ReportFactory {
    public Report createReport() {
        return new PDFReport();
    }
}
