package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example67;

public class BatchTransformer implements Transformer {
    public String transform(String input) {
        return "Batch Transformed: " + input;
    }
}
