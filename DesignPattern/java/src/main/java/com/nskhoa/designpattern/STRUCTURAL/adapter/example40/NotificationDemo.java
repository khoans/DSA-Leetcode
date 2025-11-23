package com.nskhoa.designpattern.STRUCTURAL.adapter.example40;

public class NotificationDemo {
    public static void main(String[] args) {
        NotificationCenter center = new NotificationCenter();
        center.addNotification(new Notification("New message received"));
        center.addNotification(new Notification("Update available"));

        MyIterator<Notification> it = center.createIterator();
        while (it.hasNext()) {
            System.out.println(it
                                       .next()
                                       .getMessage());
        }
    }
}
