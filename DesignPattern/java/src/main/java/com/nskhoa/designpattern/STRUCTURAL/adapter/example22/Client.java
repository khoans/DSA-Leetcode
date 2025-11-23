package com.nskhoa.designpattern.STRUCTURAL.adapter.example22;

public class Client {
    private EmailService emailService;

    public Client(EmailService emailService) {
        this.emailService = emailService;
    }

    public void send(String to, String subject, String body) {
        emailService.sendEmail(to, subject, body);
    }

    public static void main(String[] args) {
        EmailService smtpAdapter = new SmtpAdapter();
        EmailService sendGridAdapter = new SendGridAdapter();
        EmailService amazonSESAdapter = new AmazonSESAdapter();

        Client smtpClient = new Client(smtpAdapter);
        Client sendGridClient = new Client(sendGridAdapter);
        Client amazonSESClient = new Client(amazonSESAdapter);

        smtpClient.send("abc@gmail.com", "SMTP Subject", "SMTP Body");
        sendGridClient.send("sendgrid@gmail.com", "SendGrid Subject", "SendGrid Body");
        amazonSESClient.send("ses@gmail.com", "SES Subject", "SES Body");
    }
}
