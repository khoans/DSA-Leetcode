package com.nskhoa.designpattern.creational.abstract_factory.example99;

import com.nskhoa.designpattern.creational.abstract_factory.example99.factory.ToolchainAbstractFactory;
import com.nskhoa.designpattern.creational.abstract_factory.example99.factory.github.GitHubFactory;
import com.nskhoa.designpattern.creational.abstract_factory.example99.factory.jenkins.JenkinsFactory;

public class Runner {
    public static void main(String[] args) {
        ToolchainAbstractFactory githubFactory = new GitHubFactory();
        var githubBuilder = githubFactory.createBuilder();
        var githubDeployer = githubFactory.createDeployer();
        githubBuilder.build("my-repo");
        githubDeployer.deploy("my-repo");

        ToolchainAbstractFactory jenkinsFactory = new JenkinsFactory();
        var jenkinsBuilder = jenkinsFactory.createBuilder();
        var jenkinsDeployer = jenkinsFactory.createDeployer();
        jenkinsBuilder.build("my-repo");
        jenkinsDeployer.deploy("my-repo");
    }
}
