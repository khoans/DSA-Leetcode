package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example68;

public class BatchTransformer implements Transformer {
    public String transform(String input) {
        return "Batch Transformed: " + input;
    }
}
