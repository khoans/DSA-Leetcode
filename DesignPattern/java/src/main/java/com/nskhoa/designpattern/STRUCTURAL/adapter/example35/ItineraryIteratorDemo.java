package com.nskhoa.designpattern.STRUCTURAL.adapter.example35;

public class ItineraryIteratorDemo {
    public static void main(String[] args) {
        Itinerary itinerary = new Itinerary();
        itinerary.addDestination(new Destination("Paris"));
        itinerary.addDestination(new Destination("Tokyo"));

        MyIterator<Destination> it = itinerary.createIterator();
        while (it.hasNext()) {
            System.out.println(it.next().getName());
        }
    }
}

