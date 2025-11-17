package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example25;

public interface QueueAbstractFactory {
    Producer createProducer();

    Consumer createConsumer();
}

// Usage: QueueAbstractFactory factory = new RabbitMQFactory(); Producer prod = factory.createProducer(); prod.produce("Event");

