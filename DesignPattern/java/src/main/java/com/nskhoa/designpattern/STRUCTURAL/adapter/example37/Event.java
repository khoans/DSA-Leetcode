package com.nskhoa.designpattern.STRUCTURAL.adapter.example37;

public class Event {
    private final Attendee[] attendees = new Attendee[10];
    private int count = 0;

    void addAttendee(Attendee a) {
        if (count < attendees.length) {
            attendees[count++] = a;
        }
    }

    MyIterator<Attendee> createIterator() {
        return new AttendeeIterator();
    }

    private class AttendeeIterator implements MyIterator<Attendee> {
        int index = 0;

        public boolean hasNext() {
            return index < count;
        }

        public Attendee next() {
            return attendees[index++];
        }
    }
}
