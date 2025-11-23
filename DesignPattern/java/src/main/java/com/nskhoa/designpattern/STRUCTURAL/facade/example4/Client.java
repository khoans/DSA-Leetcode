package com.nskhoa.designpattern.STRUCTURAL.facade.example4;

class FileManager {
    void openFile() { System.out.println("File opened"); }
}

class SoftwareInstaller {
    void installSoftware() { System.out.println("Software installed"); }
}

class SystemConfigurator {
    void configure() { System.out.println("System configured"); }
}

class OSFacade {
    private FileManager fileManager = new FileManager();
    private SoftwareInstaller installer = new SoftwareInstaller();
    private SystemConfigurator configurator = new SystemConfigurator();

    void startup() {
        System.out.println("Starting OS...");
        fileManager.openFile();
        installer.installSoftware();
        configurator.configure();
    }
}

public class Client {
    public static void main(String[] args) {
        OSFacade os = new OSFacade();
        os.startup();
    }
}
