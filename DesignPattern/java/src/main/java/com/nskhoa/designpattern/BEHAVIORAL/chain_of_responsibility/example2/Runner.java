package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example2;

// Client runner
public class Runner {
    public static void main(String[] args) {
        SupportHandler l1 = new LevelOneSupport();
        SupportHandler l2 = new LevelTwoSupport();
        SupportHandler l3 = new LevelThreeSupport();

        l1.setNextHandler(l2);
        l2.setNextHandler(l3);

        SupportTicket t1 = new SupportTicket(1);
        SupportTicket t2 = new SupportTicket(2);
        SupportTicket t3 = new SupportTicket(3);
        SupportTicket t4 = new SupportTicket(4);

        l1.handleTicket(t1);
        l1.handleTicket(t2);
        l1.handleTicket(t3);
        l1.handleTicket(t4);
    }
}

