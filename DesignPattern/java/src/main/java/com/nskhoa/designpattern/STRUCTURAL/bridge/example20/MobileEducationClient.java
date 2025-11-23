package com.nskhoa.designpattern.STRUCTURAL.bridge.example20;

public class MobileEducationClient extends EducationClient {
    public MobileEducationClient(CourseManagementSystem system) { super(system); }
    public void showCourses() {
        System.out.print("Mobile UI: ");
        system.listCourses();
    }
}
