package com.nskhoa.designpattern.STRUCTURAL.adapter.example38;

public class BugTrackerDemo {
    public static void main(String[] args) {
        BugTracker tracker = new BugTracker();
        tracker.addBug(new Bug("B001", "Null pointer exception"));
        tracker.addBug(new Bug("B002", "UI does not load"));

        MyIterator<Bug> it = tracker.createIterator();
        while (it.hasNext()) {
            Bug b = it.next();
            System.out.println(b.getId() + ": " + b.getDescription());
        }
    }
}

