package com.nskhoa.designpattern.creational.factory_method.example16.factory.xml;

import com.nskhoa.designpattern.creational.factory_method.example16.factory.Parser;

public class XMLParser implements Parser {
    public void parse(String content) {
        System.out.println("Parsed XML: " + content);
    }

}
