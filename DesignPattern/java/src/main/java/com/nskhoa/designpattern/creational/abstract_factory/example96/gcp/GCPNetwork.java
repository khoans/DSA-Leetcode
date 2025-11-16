package com.nskhoa.designpattern.creational.abstract_factory.example96.gcp;

import com.nskhoa.designpattern.creational.abstract_factory.example96.Network;

public class GCPNetwork implements Network {
    public String subnet(String zone) {
        return "GCP Subnet in " + zone;
    }
}

