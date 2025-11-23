package com.nskhoa.designpattern.BEHAVIORAL.iterator.example35;

public class Itinerary {
    private final Destination[] destinations = new Destination[10];
    private int count = 0;

    void addDestination(Destination d) { if (count < destinations.length) destinations[count++] = d; }

    MyIterator<Destination> createIterator() { return new ItineraryIterator(); }

    private class ItineraryIterator implements MyIterator<Destination> {
        int index = 0;
        public boolean hasNext() { return index < count; }
        public Destination next() { return destinations[index++]; }
    }
}
