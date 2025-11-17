package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example25;

public class RabbitProducer implements Producer {
    public void produce(String message) {
        System.out.println("Rabbit Produced: " + message);
    }
}
