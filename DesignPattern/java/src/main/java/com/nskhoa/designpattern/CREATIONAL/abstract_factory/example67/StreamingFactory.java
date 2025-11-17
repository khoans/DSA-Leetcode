package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example67;

public class StreamingFactory implements PipelineAbstractFactory {
    public Processor createProcessor() {
        return new StreamingProcessor();
    }

    public Transformer createTransformer() {
        return new StreamingTransformer();
    }
}
