package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example17;

// Concrete Handlers
public class LoggingListener extends EventListener {
    @Override
    public void onEvent(Event event) {
        System.out.println("LoggingListener received event: " + event.getType());
        if (nextListener != null) {
            nextListener.onEvent(event);
        }
    }
}
