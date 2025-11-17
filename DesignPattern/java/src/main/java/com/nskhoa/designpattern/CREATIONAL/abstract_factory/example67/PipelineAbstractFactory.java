package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example67;

public interface PipelineAbstractFactory {
    Processor createProcessor();

    Transformer createTransformer();
}

