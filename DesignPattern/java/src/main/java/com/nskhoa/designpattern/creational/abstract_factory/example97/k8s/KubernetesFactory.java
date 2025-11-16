package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example97.k8s;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example97.OrchestrationAbstractFactory;
import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example97.Scaler;
import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example97.Scheduler;

public class KubernetesFactory implements OrchestrationAbstractFactory {
    public Scheduler createScheduler() {
        return new K8SScheduler();
    }

    public Scaler createScaler() {
        return new K8SScaler();
    }
}
