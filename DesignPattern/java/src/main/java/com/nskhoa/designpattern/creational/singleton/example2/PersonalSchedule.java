package com.nskhoa.designpattern.creational.singleton.example2;

import java.util.ArrayList;
import java.util.List;

public class PersonalSchedule {
    private static PersonalSchedule instance;
    private List<String> events = new ArrayList<>();

    private PersonalSchedule() {
    }

    public static PersonalSchedule getInstance() {
        if (instance == null) {
            instance = new PersonalSchedule();
        }
        return instance;
    }

    public void addEvent(String event) {
        events.add(event);
    }

    public List<String> getEvents() {
        return events;
    }

    public static void main(String[] args) {
        PersonalSchedule schedule = PersonalSchedule.getInstance();
        schedule.addEvent("Doctor's appointment at 10 AM");
        schedule.addEvent("Lunch with Sarah at 1 PM");

        System.out.println("My Events:");
        for (String event : schedule.getEvents()) {
            System.out.println("- " + event);
        }
    }
}
