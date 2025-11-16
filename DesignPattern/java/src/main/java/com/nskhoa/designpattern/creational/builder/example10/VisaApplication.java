package com.nskhoa.designpattern.creational.builder.example10;

import java.util.ArrayList;
import java.util.List;

public class VisaApplication {
    private String passport;
    private String info;
    private List<String> documents = new ArrayList<>();

    private VisaApplication(Builder builder) {
        this.passport = builder.passport; this.info = builder.info; this.documents.addAll(builder.documents);
    }

    public static class Builder {
        private String passport;
        private String info;
        private List<String> documents = new ArrayList<>();

        public Builder passport(String p) {
            this.passport = p; return this;
        }

        public Builder info(String i) {
            this.info = i; return this;
        }

        public Builder addDocument(String d) {
            documents.add(d); return this;
        }

        public VisaApplication build() {
            return new VisaApplication(this);
        }
    }

    public static void main(String[] args) {
        VisaApplication application = new VisaApplication.Builder()
                .passport("A12345678")
                .info("Tourist Visa Application")
                .addDocument("Photo")
                .addDocument("Bank Statement")
                .addDocument("Travel Itinerary")
                .build();

        System.out.println("Visa Application:");
        System.out.println("Passport: " + application.passport);
        System.out.println("Info: " + application.info);
        System.out.println("Documents: " + String.join(", ", application.documents));
    }
}
