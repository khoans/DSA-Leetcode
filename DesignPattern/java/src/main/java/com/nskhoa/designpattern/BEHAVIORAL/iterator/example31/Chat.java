package com.nskhoa.designpattern.BEHAVIORAL.iterator.example31;

public class Chat {
    private final Message[] messages = new Message[10];
    private int count = 0;

    void addMessage(Message m) {
        if (count < messages.length) {
            messages[count++] = m;
        }
    }

    MyIterator<Message> createIterator() {
        return new ChatIterator();
    }

    private class ChatIterator implements MyIterator<Message> {
        int index = 0;

        public boolean hasNext() {
            return index < count;
        }

        public Message next() {
            return messages[index++];
        }
    }
}
