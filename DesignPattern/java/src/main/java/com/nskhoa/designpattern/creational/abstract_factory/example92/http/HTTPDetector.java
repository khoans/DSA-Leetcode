package com.nskhoa.designpattern.creational.abstract_factory.example92.http;

import com.nskhoa.designpattern.creational.abstract_factory.example92.Detector;

public class HTTPDetector implements Detector {
    public boolean detect(String traffic) {
        System.out.println("HTTP Detector: Analyzing traffic - " + traffic);
        // Simple detection logic: check if traffic contains "HTTP"
        return traffic.contains("HTTP");
    }
}

