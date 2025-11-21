package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example49;

public class PyTorchTrainer implements Trainer {
    public void train(String dataset) {
        System.out.println("PyTorch Trained: " + dataset);
    }
}
