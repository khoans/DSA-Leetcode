package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example25;

public class Runner {
    public static void main(String[] args) {
        QueueAbstractFactory factory = new RabbitMQFactory();
        Producer producer = factory.createProducer();
        Consumer consumer = factory.createConsumer();

        producer.produce("Hello RabbitMQ");
        System.out.println(consumer.consume());

        factory = new KafkaFactory();
        producer = factory.createProducer();
        consumer = factory.createConsumer();

        producer.produce("Hello Kafka");
        System.out.println(consumer.consume());
    }
}
