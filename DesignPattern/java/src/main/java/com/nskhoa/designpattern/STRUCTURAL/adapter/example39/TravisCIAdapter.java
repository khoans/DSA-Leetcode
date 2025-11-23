package com.nskhoa.designpattern.STRUCTURAL.adapter.example39;

public class TravisCIAdapter implements CI_CDTool {
    private TravisCITool travis = new TravisCITool();
    public void triggerBuild(String project) {
        travis.travisBuild(project);
    }
}
