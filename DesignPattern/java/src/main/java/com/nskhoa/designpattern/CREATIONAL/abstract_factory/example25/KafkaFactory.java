package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example25;

public class KafkaFactory implements QueueAbstractFactory {
    public Producer createProducer() {
        return new KafkaProducer();
    }

    public Consumer createConsumer() {
        return new KafkaConsumer();
    }
}
