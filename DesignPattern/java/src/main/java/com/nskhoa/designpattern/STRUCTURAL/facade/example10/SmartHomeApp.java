package com.nskhoa.designpattern.STRUCTURAL.facade.example10;

class VoiceRecognition {
    void recognizeVoice() {
        System.out.println("Recognizing voice commands");
    }
}

class DeviceController {
    void controlDevices() {
        System.out.println("Controlling devices");
    }
}

class MusicService {
    void playMusic() {
        System.out.println("Playing music");
    }
}

class SmartHomeAssistantFacade {
    private VoiceRecognition voiceRecognition = new VoiceRecognition();
    private DeviceController deviceController = new DeviceController();
    private MusicService musicService = new MusicService();

    void interact() {
        voiceRecognition.recognizeVoice();
        deviceController.controlDevices();
        musicService.playMusic();
    }
}

public class SmartHomeApp {
    public static void main(String[] args) {
        SmartHomeAssistantFacade assistant = new SmartHomeAssistantFacade();
        assistant.interact();
    }
}
