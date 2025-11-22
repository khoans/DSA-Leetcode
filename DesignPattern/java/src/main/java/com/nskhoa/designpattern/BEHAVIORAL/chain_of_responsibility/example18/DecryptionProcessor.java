package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example18;

// Concrete Handlers
public class DecryptionProcessor extends MessageProcessor {
    @Override
    public void process(Message message) {
        System.out.println("Decrypting message...");
        if (nextProcessor != null) {
            nextProcessor.process(message);
        }
    }
}
