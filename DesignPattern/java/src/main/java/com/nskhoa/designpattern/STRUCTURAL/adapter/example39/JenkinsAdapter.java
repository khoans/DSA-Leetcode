package com.nskhoa.designpattern.STRUCTURAL.adapter.example39;

public class JenkinsAdapter implements CI_CDTool {
    private JenkinsTool jenkins = new JenkinsTool();
    public void triggerBuild(String project) {
        jenkins.jenkinsBuild(project);
    }
}
