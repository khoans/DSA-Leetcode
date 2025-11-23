package com.nskhoa.designpattern.BEHAVIORAL.iterator.example26;

public class Event {
    private final String title;
    private final String date;

    Event(String title, String date) {
        this.title = title; this.date = date;
    }

    String getTitle() {
        return title;
    }

    String getDate() {
        return date;
    }
}
