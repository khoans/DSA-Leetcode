package com.nskhoa.designpattern.STRUCTURAL.adapter.example21;

public class InboxDemo {
    public static void main(String[] args) {
        Inbox inbox = new Inbox();
        inbox.addEmail(new Email("alice@example.com", "Meeting Reminder"));
        inbox.addEmail(new Email("bob@example.com", "Invoice"));

        MyIterator<Email> it = inbox.createIterator();
        while (it.hasNext()) {
            Email email = it.next();
            System.out.println(email.getFrom() + ": " + email.getSubject());
        }
    }
}

