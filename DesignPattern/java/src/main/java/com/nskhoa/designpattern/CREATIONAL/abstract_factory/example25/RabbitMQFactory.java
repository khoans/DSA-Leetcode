package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example25;

public class RabbitMQFactory implements QueueAbstractFactory {
    public Producer createProducer() {
        return new RabbitProducer();
    }

    public Consumer createConsumer() {
        return new RabbitConsumer();
    }
}
