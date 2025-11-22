package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example9;

public class ValidationProcessor extends DocumentProcessor {
    @Override
    public void process(Document document) {
        System.out.println("Validating document...");
        // Simulate validation step (always valid in this example)
        if (nextProcessor != null) {
            nextProcessor.process(document);
        }
    }
}
