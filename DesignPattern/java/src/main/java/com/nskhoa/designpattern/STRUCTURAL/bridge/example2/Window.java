package com.nskhoa.designpattern.STRUCTURAL.bridge.example2;

public abstract class Window {
    protected GraphicsPlatform platform;

    Window(GraphicsPlatform platform) {
        this.platform = platform;
    }

    abstract void draw();
}
