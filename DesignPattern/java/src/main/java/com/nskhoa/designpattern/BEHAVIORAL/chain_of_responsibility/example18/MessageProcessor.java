package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example18;

// Abstract Handler
public abstract class MessageProcessor {
    protected MessageProcessor nextProcessor;

    public void setNextProcessor(MessageProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public abstract void process(Message message);
}
