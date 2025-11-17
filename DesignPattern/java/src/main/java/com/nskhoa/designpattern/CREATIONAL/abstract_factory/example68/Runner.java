package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example68;

public class Runner {
    public static void main(String[] args) {
        PipelineAbstractFactory factory = new BatchFactory();
        Processor processor = factory.createProcessor();
        Transformer transformer = factory.createTransformer();

        String data = "data1";
        String transformedData = transformer.transform(data);
        processor.process(transformedData);
    }
}
