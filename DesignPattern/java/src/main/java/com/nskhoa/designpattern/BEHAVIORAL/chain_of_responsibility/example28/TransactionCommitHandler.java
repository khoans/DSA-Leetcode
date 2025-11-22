package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example28;

public class TransactionCommitHandler extends CleanupHandler {
    @Override
    public void cleanup() {
        System.out.println("Committing transactions...");
        if (nextHandler != null) {
            nextHandler.cleanup();
        }
    }
}
