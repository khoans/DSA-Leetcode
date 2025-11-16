package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example96.aws;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example96.Network;

public class AWSNetwork implements Network {
    public String subnet(String zone) {
        return "AWS Subnet in " + zone;
    }
}

