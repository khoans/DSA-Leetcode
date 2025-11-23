package com.nskhoa.designpattern.STRUCTURAL.adapter.example13;

public class SmsAdapter implements NotificationService {
    private SmsService smsService = new SmsService();
    public void send(String message) {
        smsService.sendSms(message);
    }
}
