package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example97.k8s;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example97.Scheduler;

public class K8SScheduler implements Scheduler {
    public void schedule(String pod) {
        System.out.println("K8S Scheduled: " + pod);
    }
}

