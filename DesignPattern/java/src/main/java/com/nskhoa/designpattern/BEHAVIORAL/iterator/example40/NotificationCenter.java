package com.nskhoa.designpattern.BEHAVIORAL.iterator.example40;

public class NotificationCenter {
    private final Notification[] notifications = new Notification[10];
    private int count = 0;

    void addNotification(Notification n) {
        if (count < notifications.length) {
            notifications[count++] = n;
        }
    }

    MyIterator<Notification> createIterator() {
        return new NotificationIterator();
    }

    private class NotificationIterator implements MyIterator<Notification> {
        int index = 0;

        public boolean hasNext() {
            return index < count;
        }

        public Notification next() {
            return notifications[index++];
        }
    }
}
