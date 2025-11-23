package com.nskhoa.designpattern.STRUCTURAL.facade.example19;

class HealthTracker {
    void monitorHealth() { System.out.println("Monitoring health"); }
}
class NotificationCenter {
    void sendNotifications() { System.out.println("Sending notifications"); }
}
class PhoneConnector {
    void connectToPhone() { System.out.println("Connecting to smartphone"); }
}

class WearableDeviceFacade {
    private HealthTracker health = new HealthTracker();
    private NotificationCenter notifications = new NotificationCenter();
    private PhoneConnector phone = new PhoneConnector();

    void startDeviceFunctions() {
        health.monitorHealth();
        notifications.sendNotifications();
        phone.connectToPhone();
    }
}

public class Client {
    public static void main(String[] args) {
        WearableDeviceFacade device = new WearableDeviceFacade();
        device.startDeviceFunctions();
    }
}
