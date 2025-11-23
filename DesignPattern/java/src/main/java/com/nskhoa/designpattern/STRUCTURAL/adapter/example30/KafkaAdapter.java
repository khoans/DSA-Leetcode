package com.nskhoa.designpattern.STRUCTURAL.adapter.example30;

public class KafkaAdapter implements MessageQueue {
    private Kafka kafka = new Kafka();

    public void sendMessage(String message) {
        kafka.kafkaSend(message);
    }
}
