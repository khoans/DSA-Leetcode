package com.nskhoa.designpattern.STRUCTURAL.facade.example13;

class GameLibrary {
    void loadGames() { System.out.println("Loading games"); }
}
class NetworkConnection {
    void connectOnline() { System.out.println("Connecting to network"); }
}
class SystemSettings {
    void configureSettings() { System.out.println("Configuring system settings"); }
}

class GamingConsoleFacade {
    private GameLibrary library = new GameLibrary();
    private NetworkConnection network = new NetworkConnection();
    private SystemSettings settings = new SystemSettings();

    void startConsole() {
        library.loadGames();
        network.connectOnline();
        settings.configureSettings();
    }
}

public class Client {
    public static void main(String[] args) {
        GamingConsoleFacade console = new GamingConsoleFacade();
        console.startConsole();
    }
}
