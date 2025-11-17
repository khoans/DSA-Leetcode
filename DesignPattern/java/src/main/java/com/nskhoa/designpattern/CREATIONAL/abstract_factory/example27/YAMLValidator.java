package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example27;

import java.util.Map;

public class YAMLValidator implements Validator {
    public boolean validate(Map<String, String> config) {
        return true;
    }
}
