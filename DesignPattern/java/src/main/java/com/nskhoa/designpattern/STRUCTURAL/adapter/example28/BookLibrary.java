package com.nskhoa.designpattern.STRUCTURAL.adapter.example28;

public class BookLibrary {
    private final Book[] books = new Book[10];
    private int count = 0;

    void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
        }
    }

    MyIterator<Book> createIterator() {
        return new BookIterator();
    }

    private class BookIterator implements MyIterator<Book> {
        int index = 0;

        public boolean hasNext() {
            return index < count;
        }

        public Book next() {
            return books[index++];
        }
    }
}
