package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example25;

public class SmsChannel extends NotificationChannel {
    @Override
    public void send(Notification notification) {
        boolean success = false; // simulate failure
        System.out.println("Trying to send SMS: " + notification.getMessage());
        success = false;
        if (success) {
            System.out.println("SMS sent successfully.");
        }
        else if (nextChannel != null) {
            nextChannel.send(notification);
        }
        else {
            System.out.println("All notification channels failed.");
        }
    }
}
