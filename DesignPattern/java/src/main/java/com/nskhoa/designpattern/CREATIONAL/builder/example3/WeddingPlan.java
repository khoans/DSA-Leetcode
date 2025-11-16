package com.nskhoa.designpattern.CREATIONAL.builder.example3;

public class WeddingPlan {
    private String venue;
    private String menu;
    private String decoration;

    private WeddingPlan(Builder builder) {
        this.venue = builder.venue; this.menu = builder.menu; this.decoration = builder.decoration;
    }

    public static class Builder {
        private String venue;
        private String menu;
        private String decoration;

        public Builder venue(String venue) {
            this.venue = venue; return this;
        }

        public Builder menu(String menu) {
            this.menu = menu; return this;
        }

        public Builder decoration(String dec) {
            this.decoration = dec; return this;
        }

        public WeddingPlan build() {
            return new WeddingPlan(this);
        }
    }

    public static void main(String[] args) {
        WeddingPlan plan = new WeddingPlan.Builder()
                .venue("Beach Resort")
                .menu("Seafood Buffet")
                .decoration("Tropical Theme")
                .build();
        System.out.println("Venue: " + plan.venue);
        System.out.println("Menu: " + plan.menu);
        System.out.println("Decoration: " + plan.decoration);
    }
}
