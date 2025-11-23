package com.nskhoa.designpattern.STRUCTURAL.bridge.example20;

public class BridgePatternExample {
    public static void main(String[] args) {
        EducationClient mobileOnline = new MobileEducationClient(new OnlineCourseSystem());
        mobileOnline.showCourses();

        EducationClient desktopOffline = new DesktopEducationClient(new OfflineCourseSystem());
        desktopOffline.showCourses();
    }
}
