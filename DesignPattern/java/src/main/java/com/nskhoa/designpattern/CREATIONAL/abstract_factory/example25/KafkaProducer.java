package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example25;

public class KafkaProducer implements Producer {
    public void produce(String message) {
        System.out.println("Kafka Produced: " + message);
    }
}
