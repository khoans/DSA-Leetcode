package com.nskhoa.designpattern.STRUCTURAL.adapter.example28;

public class BookLibraryDemo {
    public static void main(String[] args) {
        BookLibrary library = new BookLibrary();
        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("Brave New World", "Aldous Huxley"));

        MyIterator<Book> it = library.createIterator();
        while (it.hasNext()) {
            Book b = it.next();
            System.out.println(b.getTitle() + " by " + b.getAuthor());
        }
    }
}

