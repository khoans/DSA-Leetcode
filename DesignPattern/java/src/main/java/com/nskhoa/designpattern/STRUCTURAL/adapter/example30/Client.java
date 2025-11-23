package com.nskhoa.designpattern.STRUCTURAL.adapter.example30;

public class Client {
    public static void main(String[] args) {
        MessageQueue rabbitAdapter = new RabbitMQAdapter();
        rabbitAdapter.sendMessage("Hello via RabbitMQ");

        MessageQueue kafkaAdapter = new KafkaAdapter();
        kafkaAdapter.sendMessage("Hello via Kafka");

        MessageQueue sqsAdapter = new SQSAdapter();
        sqsAdapter.sendMessage("Hello via Amazon SQS");
    }
}
