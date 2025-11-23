package com.nskhoa.designpattern.STRUCTURAL.adapter.example38;

public class Bug {
    private final String id;
    private final String description;

    Bug(String id, String description) {
        this.id = id; this.description = description;
    }

    String getId() {
        return id;
    }

    String getDescription() {
        return description;
    }
}
