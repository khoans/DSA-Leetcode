package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example17;

// Request class
public class Event {
    private String type;

    public Event(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
