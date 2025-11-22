package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example18;

// Client runner
public class MessageProcessingDemo {
    public static void main(String[] args) {
        MessageProcessor decryptor = new DecryptionProcessor();
        MessageProcessor validator = new ValidationProcessor();
        MessageProcessor persister = new PersistenceProcessor();

        decryptor.setNextProcessor(validator);
        validator.setNextProcessor(persister);

        Message message = new Message("Encrypted data");
        decryptor.process(message);
    }
}

