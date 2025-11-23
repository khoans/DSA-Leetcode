package com.nskhoa.designpattern.BEHAVIORAL.iterator.example31;

public class ChatIteratorDemo {
    public static void main(String[] args) {
        Chat chat = new Chat();
        chat.addMessage(new Message("Alice", "Hello"));
        chat.addMessage(new Message("Bob", "Hi Alice"));

        MyIterator<Message> it = chat.createIterator();
        while (it.hasNext()) {
            Message m = it.next();
            System.out.println(m.getSender() + ": " + m.getContent());
        }
    }
}

