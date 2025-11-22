package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example32;

// Abstract Handler
public abstract class TaskProcessor {
    protected TaskProcessor nextProcessor;

    public void setNextProcessor(TaskProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public abstract void process(Task task);
}
