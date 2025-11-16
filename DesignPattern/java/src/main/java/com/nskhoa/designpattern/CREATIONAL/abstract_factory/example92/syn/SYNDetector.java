package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example92.syn;

import com.nskhoa.designpattern.CREATIONAL.abstract_factory.example92.Detector;

public class SYNDetector implements Detector {
    public boolean detect(String traffic) {
        System.out.println("SYN Detector: Analyzing traffic - " + traffic);
        // Simple detection logic: check if traffic contains "SYN"
        return traffic.contains("SYN");
    }
}

