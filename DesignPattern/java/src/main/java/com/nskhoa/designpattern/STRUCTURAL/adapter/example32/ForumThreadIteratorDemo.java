package com.nskhoa.designpattern.STRUCTURAL.adapter.example32;

public class ForumThreadIteratorDemo {
    public static void main(String[] args) {
        Forum forum = new Forum();
        forum.addThread(new Thread("Java Help"));
        forum.addThread(new Thread("Design Patterns"));

        MyIterator<Thread> it = forum.createIterator();
        while (it.hasNext()) {
            Thread t = it.next();
            System.out.println(t.getTitle());
        }
    }
}
