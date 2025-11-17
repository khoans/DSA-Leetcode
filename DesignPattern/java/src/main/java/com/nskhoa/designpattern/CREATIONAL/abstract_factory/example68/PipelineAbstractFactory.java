package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example68;

public interface PipelineAbstractFactory {
    Processor createProcessor();

    Transformer createTransformer();
}

