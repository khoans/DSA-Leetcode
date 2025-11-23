package com.nskhoa.designpattern.STRUCTURAL.facade.example16;

class AppManager {
    void openApps() { System.out.println("Opening apps"); }
}
class VideoPlayer {
    void playVideo() { System.out.println("Playing video"); }
}
class SystemSetup {
    void configureSettings() { System.out.println("Configuring TV settings"); }
}

class SmartTVFacade {
    private AppManager apps = new AppManager();
    private VideoPlayer video = new VideoPlayer();
    private SystemSetup setup = new SystemSetup();

    void startTV() {
        apps.openApps();
        video.playVideo();
        setup.configureSettings();
    }
}

public class Client {
    public static void main(String[] args) {
        SmartTVFacade smartTV = new SmartTVFacade();
        smartTV.startTV();
    }
}
