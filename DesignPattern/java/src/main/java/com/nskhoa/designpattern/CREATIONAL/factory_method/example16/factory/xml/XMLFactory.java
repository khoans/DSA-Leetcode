package com.nskhoa.designpattern.CREATIONAL.factory_method.example16.factory.xml;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example16.factory.DocumentFactory;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example16.factory.Parser;

public class XMLFactory extends DocumentFactory {
    public Parser createParser() {
        return new XMLParser();
    }
}
