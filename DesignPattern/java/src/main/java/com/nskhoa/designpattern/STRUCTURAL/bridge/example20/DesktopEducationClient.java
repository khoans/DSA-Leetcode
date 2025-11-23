package com.nskhoa.designpattern.STRUCTURAL.bridge.example20;

public class DesktopEducationClient extends EducationClient {
    public DesktopEducationClient(CourseManagementSystem system) { super(system); }
    public void showCourses() {
        System.out.print("Desktop UI: ");
        system.listCourses();
    }
}
