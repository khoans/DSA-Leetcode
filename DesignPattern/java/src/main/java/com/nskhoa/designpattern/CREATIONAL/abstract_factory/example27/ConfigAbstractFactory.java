package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example27;

import java.util.Map;

public interface ConfigAbstractFactory {
    Loader createLoader();

    Validator createValidator();
}

// Usage: ConfigAbstractFactory factory = new PropertiesFactory(); Loader loader = factory.createLoader(); loader.load("config.properties");

