package com.nskhoa.designpattern.creational.factory_method.example16.factory.pdf;

import com.nskhoa.designpattern.creational.factory_method.example16.factory.DocumentFactory;
import com.nskhoa.designpattern.creational.factory_method.example16.factory.Parser;

public class PDFFactory extends DocumentFactory {
    public Parser createParser() {
        return new PDFParser();
    }
}
