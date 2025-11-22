package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example28;

// Concrete Handlers
public class StreamCloseHandler extends CleanupHandler {
    @Override
    public void cleanup() {
        System.out.println("Closing streams...");
        if (nextHandler != null) {
            nextHandler.cleanup();
        }
    }
}
