package com.nskhoa.designpattern.STRUCTURAL.adapter.example26;

public class Calendar {
    private final Event[] events = new Event[10];
    private int count = 0;

    void addEvent(Event event) {
        if (count < events.length) {
            events[count++] = event;
        }
    }

    MyIterator<Event> createIterator() {
        return new EventIterator();
    }

    private class EventIterator implements MyIterator<Event> {
        int index = 0;

        public boolean hasNext() {
            return index < count;
        }

        public Event next() {
            return events[index++];
        }
    }
}
