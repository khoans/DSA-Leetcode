package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example27;

import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        ConfigAbstractFactory factory = new YAMLFactory();
        Loader loader = factory.createLoader();
        Validator validator = factory.createValidator();

        loader.load("config.yaml");
        boolean isValid = validator.validate(Map.of("key", "value"));
        System.out.println("Is config valid? " + isValid);
    }
}
