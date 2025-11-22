package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example9;

// Abstract Handler
public abstract class DocumentProcessor {
    protected DocumentProcessor nextProcessor;

    public void setNextProcessor(DocumentProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public abstract void process(Document document);
}
