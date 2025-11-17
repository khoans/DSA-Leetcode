package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example24;

// Usage: EmailAbstractFactory factory = new SMTPFactory(); Sender sender = factory.createSender(); sender.send("Hello");
public class Runner {
    public static void main(String[] args) {
        EmailAbstractFactory factory = new SMTPFactory();
        Sender sender = factory.createSender();
        Template template = factory.createTemplate();
        String message = template.format("Hello via SMTP");
        sender.send(message);

        factory = new APIFactory();
        sender = factory.createSender();
        template = factory.createTemplate();
        message = template.format("Hello via API");
        sender.send(message);
    }
}
