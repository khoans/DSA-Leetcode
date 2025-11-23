package com.nskhoa.designpattern.BEHAVIORAL.iterator.example21;

public class Inbox {
    private final Email[] emails = new Email[10];
    private int count = 0;

    void addEmail(Email email) {
        if (count < emails.length) {
            emails[count++] = email;
        }
    }

    MyIterator<Email> createIterator() {
        return new InboxIterator();
    }

    private class InboxIterator implements MyIterator<Email> {
        int index = 0;

        public boolean hasNext() {
            return index < count;
        }

        public Email next() {
            return emails[index++];
        }
    }
}
