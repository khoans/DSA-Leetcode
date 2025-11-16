package com.nskhoa.designpattern.CREATIONAL.factory_method.example19.factory.csv;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example19.factory.Report;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example19.factory.ReportFactory;

public class CSVFactory extends ReportFactory {
    public Report createReport() {
        return new CSVReport();
    }
}
