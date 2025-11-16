package com.nskhoa.designpattern.creational.builder.example6;

public class TravelSchedule {
    private String transport;
    private String hotel;
    private String activity;

    private TravelSchedule(Builder builder) {
        this.transport = builder.transport; this.hotel = builder.hotel; this.activity = builder.activity;
    }

    public static class Builder {
        private String transport;
        private String hotel;
        private String activity;

        public Builder transport(String t) {
            this.transport = t; return this;
        }

        public Builder hotel(String h) {
            this.hotel = h; return this;
        }

        public Builder activity(String a) {
            this.activity = a; return this;
        }

        public TravelSchedule build() {
            return new TravelSchedule(this);
        }
    }

    public static void main(String[] args) {
        TravelSchedule schedule = new TravelSchedule.Builder()
                .transport("Flight")
                .hotel("5-Star Hotel")
                .activity("City Tour")
                .build();
        System.out.println("Travel Schedule:");
        System.out.println("Transport: " + schedule.transport);
        System.out.println("Hotel: " + schedule.hotel);
        System.out.println("Activity: " + schedule.activity);
    }
}
