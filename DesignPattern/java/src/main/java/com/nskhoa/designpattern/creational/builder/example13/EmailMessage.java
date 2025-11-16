package com.nskhoa.designpattern.creational.builder.example13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmailMessage {
    private final String subject;      // Bắt buộc
    private final List<String> to;     // Bắt buộc
    private List<String> cc = new ArrayList<>();  // Tùy chọn
    private String body;               // Tùy chọn
    private List<String> attachments = new ArrayList<>();  // Tùy chọn

    private EmailMessage(Builder builder) {
        this.subject = builder.subject;
        this.to = builder.to;
        this.cc = builder.cc;
        this.body = builder.body;
        this.attachments = builder.attachments;
    }

    public static class Builder {
        private final String subject;
        private final List<String> to;
        private List<String> cc = new ArrayList<>();
        private String body;
        private List<String> attachments = new ArrayList<>();

        public Builder(String subject, List<String> to) {
            this.subject = subject;
            this.to = to;
        }

        public Builder cc(String email) {
            cc.add(email);
            return this;
        }

        public Builder body(String body) {
            this.body = body;
            return this;
        }

        public Builder attachment(String file) {
            attachments.add(file);
            return this;
        }

        public EmailMessage build() {
            return new EmailMessage(this);
        }
    }

    // Getters...
    public String getSubject() { return subject; }
    public List<String> getTo() { return to; }
    public List<String> getCc() { return cc; }
    public String getBody() { return body; }
    public List<String> getAttachments() { return attachments; }

    public static void main(String[] args) {
        List<String> recipients = Arrays.asList("user@example.com");
        EmailMessage email = new EmailMessage.Builder("Order Confirmation", recipients)
                .cc("admin@example.com")
                .body("Your order is shipped.")
                .attachment("invoice.pdf")
                .build();
        System.out.println("Email Message:");
        System.out.println("Subject: " + email.getSubject());
        System.out.println("To: " + String.join(", ", email.getTo()));
        System.out.println("CC: " + String.join(", ", email.getCc()));
        System.out.println("Body: " + email.getBody());
        System.out.println("Attachments: " + String.join(", ", email.getAttachments()));
    }
}
