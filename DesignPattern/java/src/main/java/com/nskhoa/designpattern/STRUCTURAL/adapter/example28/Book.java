package com.nskhoa.designpattern.STRUCTURAL.adapter.example28;

public class Book {
    private final String title;
    private final String author;

    Book(String title, String author) {
        this.title = title; this.author = author;
    }

    String getTitle() {
        return title;
    }

    String getAuthor() {
        return author;
    }
}
