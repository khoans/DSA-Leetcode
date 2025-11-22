package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example25;

// Client runner
public class NotificationDispatchingDemo {
    public static void main(String[] args) {
        NotificationChannel email = new EmailChannel();
        NotificationChannel sms = new SmsChannel();
        NotificationChannel push = new PushChannel();

        email.setNextChannel(sms);
        sms.setNextChannel(push);

        Notification notification = new Notification("You have a new message!");

        email.send(notification);
    }
}

