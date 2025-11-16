package com.nskhoa.designpattern.creational.factory_method.example16.factory.xml;

import com.nskhoa.designpattern.creational.factory_method.example16.factory.DocumentFactory;
import com.nskhoa.designpattern.creational.factory_method.example16.factory.Parser;

public class XMLFactory extends DocumentFactory {
    public Parser createParser() {
        return new XMLParser();
    }
}
