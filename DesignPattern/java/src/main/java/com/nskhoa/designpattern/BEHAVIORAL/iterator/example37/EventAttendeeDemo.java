package com.nskhoa.designpattern.BEHAVIORAL.iterator.example37;

public class EventAttendeeDemo {
    public static void main(String[] args) {
        Event event = new Event();
        event.addAttendee(new Attendee("John"));
        event.addAttendee(new Attendee("Jane"));

        MyIterator<Attendee> it = event.createIterator();
        while (it.hasNext()) {
            System.out.println(it
                                       .next()
                                       .getName());
        }
    }
}

