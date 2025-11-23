package com.nskhoa.designpattern.STRUCTURAL.adapter.example30;

public class SQSAdapter implements MessageQueue {
    private AmazonSQS sqs = new AmazonSQS();

    public void sendMessage(String message) {
        sqs.sqsSend(message);
    }
}
