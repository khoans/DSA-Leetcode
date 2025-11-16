package com.nskhoa.designpattern.CREATIONAL.factory_method.example16.factory.pdf;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example16.factory.DocumentFactory;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example16.factory.Parser;

public class PDFFactory extends DocumentFactory {
    public Parser createParser() {
        return new PDFParser();
    }
}
