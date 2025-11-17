package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example67;

public class BatchFactory implements PipelineAbstractFactory {
    public Processor createProcessor() {
        return new BatchProcessor();
    }

    public Transformer createTransformer() {
        return new BatchTransformer();
    }
}
