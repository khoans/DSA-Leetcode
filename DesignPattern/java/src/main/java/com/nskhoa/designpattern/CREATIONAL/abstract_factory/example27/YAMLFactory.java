package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example27;

public class YAMLFactory implements ConfigAbstractFactory {
    public Loader createLoader() {
        return new YAMLLoader();
    }

    public Validator createValidator() {
        return new YAMLValidator();
    }
}
