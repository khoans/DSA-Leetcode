package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example17;

public class MetricsListener extends EventListener {
    @Override
    public void onEvent(Event event) {
        System.out.println("MetricsListener processed event: " + event.getType());
        if (nextListener != null) {
            nextListener.onEvent(event);
        }
    }
}
