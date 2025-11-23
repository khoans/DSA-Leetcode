package com.nskhoa.designpattern.STRUCTURAL.bridge.example2;

public class DialogWindow extends Window {
    private String title;

    DialogWindow(GraphicsPlatform platform, String title) {
        super(platform);
        this.title = title;
    }

    public void draw() {
        platform.drawWindow(title);
    }
}
