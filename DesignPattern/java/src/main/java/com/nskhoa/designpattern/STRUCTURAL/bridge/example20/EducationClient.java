package com.nskhoa.designpattern.STRUCTURAL.bridge.example20;

public abstract class EducationClient {
    protected CourseManagementSystem system;
    protected EducationClient(CourseManagementSystem system) { this.system = system; }
    abstract void showCourses();
}
