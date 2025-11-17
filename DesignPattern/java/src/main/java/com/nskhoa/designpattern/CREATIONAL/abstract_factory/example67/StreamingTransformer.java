package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example67;

public class StreamingTransformer implements Transformer {
    public String transform(String input) {
        return "Streaming Transformed: " + input;
    }
}
