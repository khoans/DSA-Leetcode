package com.nskhoa.designpattern.creational.abstract_factory.example99.factory.github;

import com.nskhoa.designpattern.creational.abstract_factory.example99.factory.Builder;

public class GitHubBuilder implements Builder { public void build(String repo) { System.out.println("GitHub Built: " + repo); } }
