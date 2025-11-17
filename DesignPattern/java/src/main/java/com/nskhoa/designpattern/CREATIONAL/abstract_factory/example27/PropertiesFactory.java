package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example27;

public class PropertiesFactory implements ConfigAbstractFactory {
    public Loader createLoader() {
        return new PropertiesLoader();
    }

    public Validator createValidator() {
        return new PropertiesValidator();
    }
}
