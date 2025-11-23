package com.nskhoa.designpattern.BEHAVIORAL.iterator.example26;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar calendar = new Calendar();
        calendar.addEvent(new Event("Meeting", "2025-12-01"));
        calendar.addEvent(new Event("Doctor Appointment", "2025-12-05"));

        MyIterator<Event> it = calendar.createIterator();
        while (it.hasNext()) {
            Event e = it.next();
            System.out.println(e.getDate() + ": " + e.getTitle());
        }
    }
}

