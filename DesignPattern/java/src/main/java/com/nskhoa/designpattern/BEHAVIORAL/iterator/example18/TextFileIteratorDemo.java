package com.nskhoa.designpattern.BEHAVIORAL.iterator.example18;

public class TextFileIteratorDemo {
    public static void main(String[] args) {
        String[] lines = {"Line one", "Line two", "Line three"};
        TextFile file = new TextFile(lines);

        MyIterator<String> it = file.createIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

