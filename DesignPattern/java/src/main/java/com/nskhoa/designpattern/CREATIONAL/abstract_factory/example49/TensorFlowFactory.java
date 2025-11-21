package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example49;

public class TensorFlowFactory implements MLAbstractFactory {
    public Trainer createTrainer() {
        return new TensorFlowTrainer();
    }

    public Predictor createPredictor() {
        return new TensorFlowPredictor();
    }
}
