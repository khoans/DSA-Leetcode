package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example17;

public class NotificationListener extends EventListener {
    @Override
    public void onEvent(Event event) {
        System.out.println("NotificationListener notified about event: " + event.getType());
    }
}
