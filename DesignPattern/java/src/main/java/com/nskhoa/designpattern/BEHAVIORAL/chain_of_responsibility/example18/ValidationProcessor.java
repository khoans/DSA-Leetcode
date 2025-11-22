package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example18;

public class ValidationProcessor extends MessageProcessor {
    @Override
    public void process(Message message) {
        System.out.println("Validating message content...");
        if (nextProcessor != null) {
            nextProcessor.process(message);
        }
    }
}
