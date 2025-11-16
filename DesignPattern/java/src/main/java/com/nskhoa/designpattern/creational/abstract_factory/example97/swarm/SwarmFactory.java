package com.nskhoa.designpattern.creational.abstract_factory.example97.swarm;

import com.nskhoa.designpattern.creational.abstract_factory.example97.OrchestrationAbstractFactory;
import com.nskhoa.designpattern.creational.abstract_factory.example97.Scaler;
import com.nskhoa.designpattern.creational.abstract_factory.example97.Scheduler;

public class SwarmFactory implements OrchestrationAbstractFactory {
    public Scheduler createScheduler() {
        return new SwarmScheduler();
    }

    public Scaler createScaler() {
        return new SwarmScaler();
    }
}
