package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example25;

// Abstract Handler
public abstract class NotificationChannel {
    protected NotificationChannel nextChannel;

    public void setNextChannel(NotificationChannel nextChannel) {
        this.nextChannel = nextChannel;
    }

    public abstract void send(Notification notification);
}
