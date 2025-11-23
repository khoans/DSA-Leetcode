package com.nskhoa.designpattern.STRUCTURAL.facade.example18;

class CourseCatalog {
    void browseCourses() { System.out.println("Browsing courses"); }
}
class LessonManager {
    void manageLessons() { System.out.println("Managing lessons"); }
}
class ProgressTracker {
    void trackProgress() { System.out.println("Tracking progress"); }
}

class LearningPlatformFacade {
    private CourseCatalog catalog = new CourseCatalog();
    private LessonManager lessons = new LessonManager();
    private ProgressTracker progress = new ProgressTracker();

    void usePlatform() {
        catalog.browseCourses();
        lessons.manageLessons();
        progress.trackProgress();
    }
}

public class Client {
    public static void main(String[] args) {
        LearningPlatformFacade platform = new LearningPlatformFacade();
        platform.usePlatform();
    }
}
