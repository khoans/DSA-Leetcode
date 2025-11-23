package com.nskhoa.designpattern.STRUCTURAL.bridge.example2;

public class LinuxGraphics implements GraphicsPlatform {
    public void drawWindow(String title) {
        System.out.println("Drawing window on Linux: " + title);
    }
}
