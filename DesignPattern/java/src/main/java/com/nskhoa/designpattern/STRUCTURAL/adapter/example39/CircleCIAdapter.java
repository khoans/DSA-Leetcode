package com.nskhoa.designpattern.STRUCTURAL.adapter.example39;

public class CircleCIAdapter implements CI_CDTool {
    private CircleCITool circleci = new CircleCITool();
    public void triggerBuild(String project) {
        circleci.circleBuild(project);
    }
}
