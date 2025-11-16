package com.nskhoa.designpattern.creational.factory_method.example19;

import com.nskhoa.designpattern.creational.factory_method.example19.factory.Report;
import com.nskhoa.designpattern.creational.factory_method.example19.factory.ReportFactory;
import com.nskhoa.designpattern.creational.factory_method.example19.factory.csv.CSVFactory;
import com.nskhoa.designpattern.creational.factory_method.example19.factory.pdf.PDFFactory;

public class Runner {
    public static void main(String[] args) {
        ReportFactory pdfFactory = new PDFFactory();
        Report pdfReport = pdfFactory.createReport();
        pdfReport.generate("PDF Report Data");

        ReportFactory csvFactory = new CSVFactory();
        Report csvReport = csvFactory.createReport();
        csvReport.generate("CSV Report Data");

    }
}
