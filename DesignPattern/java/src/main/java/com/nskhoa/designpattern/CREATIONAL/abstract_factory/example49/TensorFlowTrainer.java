package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example49;

public class TensorFlowTrainer implements Trainer {
    public void train(String dataset) {
        System.out.println("TensorFlow Trained: " + dataset);
    }
}
