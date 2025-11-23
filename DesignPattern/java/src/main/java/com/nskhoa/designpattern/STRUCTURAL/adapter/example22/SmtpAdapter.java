package com.nskhoa.designpattern.STRUCTURAL.adapter.example22;

public class SmtpAdapter implements EmailService {
    private SmtpService smtp = new SmtpService();

    public void sendEmail(String to, String subject, String body) {
        smtp.sendSmtpMail(to, subject, body);
    }
}
