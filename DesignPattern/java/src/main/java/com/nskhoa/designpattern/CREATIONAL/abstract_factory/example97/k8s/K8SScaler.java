package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example97.k8s;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example97.Scaler;

public class K8SScaler implements Scaler {
    public void scale(String service, int replicas) {
        System.out.println("K8S Scaled " + service + " to " + replicas);
    }
}

