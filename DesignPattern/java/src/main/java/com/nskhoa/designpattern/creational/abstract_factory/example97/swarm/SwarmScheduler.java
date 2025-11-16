package com.nskhoa.designpattern.creational.abstract_factory.example97.swarm;

import com.nskhoa.designpattern.creational.abstract_factory.example97.Scheduler;

public class SwarmScheduler implements Scheduler {
    public void schedule(String pod) {
        System.out.println("Swarm Scheduled: " + pod);
    }
}

