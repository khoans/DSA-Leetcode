package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example25;

public class PushChannel extends NotificationChannel {
    @Override
    public void send(Notification notification) {
        boolean success = true;  // simulate success
        System.out.println("Trying to send push notification: " + notification.getMessage());
        if (success) {
            System.out.println("Push notification sent successfully.");
        }
        else if (nextChannel != null) {
            nextChannel.send(notification);
        }
        else {
            System.out.println("All notification channels failed.");
        }
    }
}
