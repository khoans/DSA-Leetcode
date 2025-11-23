package com.nskhoa.designpattern.BEHAVIORAL.iterator.example19;

public class Pixel {
    private final int x, y;
    private final int color;

    Pixel(int x, int y, int color) {
        this.x = x; this.y = y; this.color = color;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    int getColor() {
        return color;
    }
}
