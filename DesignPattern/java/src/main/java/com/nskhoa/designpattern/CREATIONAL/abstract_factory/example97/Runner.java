package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example97;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example97.k8s.KubernetesFactory;
import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example97.swarm.SwarmFactory;

public class Runner {
    public static void main(String[] args) {
        OrchestrationAbstractFactory kubernetesFactory = new KubernetesFactory();
        Scheduler k8sScheduler = kubernetesFactory.createScheduler();
        Scaler k8sScaler = kubernetesFactory.createScaler();
        k8sScheduler.schedule("K8S Pod");
        k8sScaler.scale("K8S Deployment", 5);

        OrchestrationAbstractFactory swarmFactory = new SwarmFactory();
        Scheduler swarmScheduler = swarmFactory.createScheduler();
        Scaler swarmScaler = swarmFactory.createScaler();
        swarmScheduler.schedule("Swarm Service");
        swarmScaler.scale("Swarm Service", 3);
    }
}
