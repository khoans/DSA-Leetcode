package com.nskhoa.designpattern.STRUCTURAL.facade.example8;

class AppManager {
    void manageApps() { System.out.println("Managing apps"); }
}

class SystemSettings {
    void configureSettings() { System.out.println("Configuring system settings"); }
}

class SecurityManager {
    void manageSecurity() { System.out.println("Managing security"); }
}

class SmartphoneOSFacade {
    private AppManager appManager = new AppManager();
    private SystemSettings settings = new SystemSettings();
    private SecurityManager security = new SecurityManager();

    void launch() {
        appManager.manageApps();
        settings.configureSettings();
        security.manageSecurity();
    }
}

public class Client {
    public static void main(String[] args) {
        SmartphoneOSFacade osFacade = new SmartphoneOSFacade();
        osFacade.launch();
    }
}
