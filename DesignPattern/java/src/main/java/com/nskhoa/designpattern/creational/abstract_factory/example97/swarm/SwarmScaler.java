package com.nskhoa.designpattern.creational.abstract_factory.example97.swarm;

import com.nskhoa.designpattern.creational.abstract_factory.example97.Scaler;

public class SwarmScaler implements Scaler {
    public void scale(String service, int replicas) {
        System.out.println("Swarm Scaled " + service + " to " + replicas);
    }
}

