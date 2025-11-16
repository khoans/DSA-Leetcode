package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example97.swarm;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example97.Scheduler;

public class SwarmScheduler implements Scheduler {
    public void schedule(String pod) {
        System.out.println("Swarm Scheduled: " + pod);
    }
}

