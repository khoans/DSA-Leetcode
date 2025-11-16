package com.nskhoa.designpattern.creational.factory_method.example16;

import com.nskhoa.designpattern.creational.factory_method.example16.factory.DocumentFactory;
import com.nskhoa.designpattern.creational.factory_method.example16.factory.Parser;
import com.nskhoa.designpattern.creational.factory_method.example16.factory.pdf.PDFFactory;
import com.nskhoa.designpattern.creational.factory_method.example16.factory.xml.XMLFactory;

public class Runner {
    public static void main(String[] args) {
        DocumentFactory xmlFactory = new XMLFactory();
        Parser xmlParser = xmlFactory.createParser();
        xmlParser.parse("<data>XML Data</data>");

        DocumentFactory pdfFactory = new PDFFactory();
        Parser pdfParser = pdfFactory.createParser();
        pdfParser.parse("%PDF-1.4 PDF Data");

    }
}
