package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example49;

// Usage: MLAbstractFactory factory = new TensorFlowFactory(); Trainer trainer = factory.createTrainer(); trainer.train("images");
public class Runner {
    public static void main(String[] args) {
        MLAbstractFactory factory = new TensorFlowFactory();
        Trainer trainer = factory.createTrainer();
        Predictor predictor = factory.createPredictor();

        trainer.train("Image Dataset");
        double result = predictor.predict("New Image");
        System.out.println("Prediction: " + result);
    }
}
