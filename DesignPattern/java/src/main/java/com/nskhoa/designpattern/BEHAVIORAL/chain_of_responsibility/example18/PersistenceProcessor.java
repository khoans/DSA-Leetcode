package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example18;

public class PersistenceProcessor extends MessageProcessor {
    @Override
    public void process(Message message) {
        System.out.println("Saving message to database");
    }
}
