package com.nskhoa.designpattern.creational.prototype.example6;

public class EmailTemplate implements Cloneable {
    private String subject;
    private String body;

    public EmailTemplate(String subject, String body) {
        this.subject = subject; this.body = body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public EmailTemplate clone() {
        try {
            return (EmailTemplate) super.clone();
        }
        catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public static void main(String[] args) {
        EmailTemplate welcomeEmail = new EmailTemplate("Welcome!", "Hello, welcome to our service.");

        EmailTemplate clonedEmail = welcomeEmail.clone();
        clonedEmail.setBody("Hello, welcome to our premium service.");

        System.out.println("Original Email Body: " + welcomeEmail.body);
        System.out.println("Cloned Email Body: " + clonedEmail.body);
    }
}
