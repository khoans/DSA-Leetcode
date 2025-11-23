package com.nskhoa.designpattern.STRUCTURAL.adapter.example30;

public class RabbitMQAdapter implements MessageQueue {
    private RabbitMQ rabbit = new RabbitMQ();

    public void sendMessage(String message) {
        rabbit.rabbitSend(message);
    }
}
