package com.nskhoa.designpattern.creational.abstract_factory.example99.factory.jenkins;

import com.nskhoa.designpattern.creational.abstract_factory.example99.factory.Builder;

public class JenkinsBuilder implements Builder {
    public void build(String repo) {
        System.out.println("Jenkins Built: " + repo);
    }
}
