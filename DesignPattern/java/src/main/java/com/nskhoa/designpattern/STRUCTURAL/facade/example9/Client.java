package com.nskhoa.designpattern.STRUCTURAL.facade.example9;

class NavigationSystem {
    void navigate() { System.out.println("Navigating"); }
}

class MusicPlayer {
    void playMusic() { System.out.println("Playing music"); }
}

class PhoneConnector {
    void connectPhone() { System.out.println("Connecting phone"); }
}

class CarInfotainmentFacade {
    private NavigationSystem navigation = new NavigationSystem();
    private MusicPlayer music = new MusicPlayer();
    private PhoneConnector phone = new PhoneConnector();

    void startSystem() {
        navigation.navigate();
        music.playMusic();
        phone.connectPhone();
    }
}

public class Client {
    public static void main(String[] args) {
        CarInfotainmentFacade facade = new CarInfotainmentFacade();
        facade.startSystem();
    }
}
