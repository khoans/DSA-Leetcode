package com.nskhoa.designpattern.STRUCTURAL.facade.example17;

class GraphicsEngine {
    void renderGraphics() { System.out.println("Rendering graphics"); }
}
class AudioEngine {
    void playAudio() { System.out.println("Playing audio"); }
}
class UserInput {
    void trackMovement() { System.out.println("Tracking user movement"); }
}

class VRFacade {
    private GraphicsEngine graphics = new GraphicsEngine();
    private AudioEngine audio = new AudioEngine();
    private UserInput input = new UserInput();

    void runVRExperience() {
        graphics.renderGraphics();
        audio.playAudio();
        input.trackMovement();
    }
}

public class Client {
    public static void main(String[] args) {
        VRFacade vrFacade = new VRFacade();
        vrFacade.runVRExperience();
    }
}
