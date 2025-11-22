package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example25;

// Concrete Handlers
public class EmailChannel extends NotificationChannel {
    @Override
    public void send(Notification notification) {
        boolean success = false; // Simulate email fail/success
        System.out.println("Trying to send email: " + notification.getMessage());
        success = true; // simulate success
        if (success) {
            System.out.println("Email sent successfully.");
        }
        else if (nextChannel != null) {
            nextChannel.send(notification);
        }
        else {
            System.out.println("All notification channels failed.");
        }
    }
}
