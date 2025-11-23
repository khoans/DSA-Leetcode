package com.nskhoa.designpattern.STRUCTURAL.bridge.example2;

public class Client {
    public static void main(String[] args) {
        GraphicsPlatform windowsPlatform = new WindowsGraphics();
        Window dialog = new DialogWindow(windowsPlatform, "Settings");
        dialog.draw();

        GraphicsPlatform linuxPlatform = new LinuxGraphics();
        Window linuxDialog = new DialogWindow(linuxPlatform, "Preferences");
        linuxDialog.draw();
    }
}
