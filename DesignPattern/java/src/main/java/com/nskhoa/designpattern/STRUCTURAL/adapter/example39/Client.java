package com.nskhoa.designpattern.STRUCTURAL.adapter.example39;

public class Client {
    private CI_CDTool ci_cdTool;
    public Client(CI_CDTool ci_cdTool) {
        this.ci_cdTool = ci_cdTool;
    }
    public void buildProject(String project) {
        ci_cdTool.triggerBuild(project);
    }

    public static void main(String[] args) {
        CI_CDTool jenkins = new JenkinsAdapter();
        CI_CDTool travis = new TravisCIAdapter();
        CI_CDTool circleci = new CircleCIAdapter();

        Client jenkinsClient = new Client(jenkins);
        Client travisClient = new Client(travis);
        Client circleciClient = new Client(circleci);

        jenkinsClient.buildProject("ProjectA");
        travisClient.buildProject("ProjectB");
        circleciClient.buildProject("ProjectC");
    }
}
