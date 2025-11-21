package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example49;

public class PyTorchFactory implements MLAbstractFactory {
    public Trainer createTrainer() {
        return new PyTorchTrainer();
    }

    public Predictor createPredictor() {
        return new PyTorchPredictor();
    }
}
