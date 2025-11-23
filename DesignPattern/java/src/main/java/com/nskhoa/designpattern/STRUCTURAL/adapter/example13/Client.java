package com.nskhoa.designpattern.STRUCTURAL.adapter.example13;

public class Client {
    private NotificationService notificationService;
    public Client(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    public void notifyUser(String message) {
        notificationService.send(message);
    }

    public static void main(String[] args) {
        NotificationService emailAdapter = new EmailAdapter();
        NotificationService smsAdapter = new SmsAdapter();

        Client emailClient = new Client(emailAdapter);
        Client smsClient = new Client(smsAdapter);

        emailClient.notifyUser("Hello via Email!");
        smsClient.notifyUser("Hello via SMS!");
    }
}
