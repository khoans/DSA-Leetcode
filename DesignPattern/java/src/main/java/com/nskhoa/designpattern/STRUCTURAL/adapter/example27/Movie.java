package com.nskhoa.designpattern.STRUCTURAL.adapter.example27;

public class Movie {
    private final String title;
    private final String director;

    Movie(String title, String director) { this.title = title; this.director = director; }
    String getTitle() { return title; }
    String getDirector() { return director; }
}
