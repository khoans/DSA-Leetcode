package com.nskhoa.designpattern.STRUCTURAL.adapter.example19;

public class Image {
    private final Pixel[][] pixels;
    private final int width, height;

    Image(int width, int height) {
        this.width = width; this.height = height;
        pixels = new Pixel[height][width];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                pixels[y][x] = new Pixel(x, y, 0);
            }
        }
    }

    void setPixel(int x, int y, int color) {
        if (x >= 0 && x < width && y >= 0 && y < height) {
            pixels[y][x] = new Pixel(x, y, color);
        }
    }

    MyIterator<Pixel> createIterator() {
        return new PixelIterator();
    }

    private class PixelIterator implements MyIterator<Pixel> {
        private int currentX = 0;
        private int currentY = 0;

        public boolean hasNext() {
            return currentY < height && currentX < width;
        }

        public Pixel next() {
            Pixel pixel = pixels[currentY][currentX];
            if (currentX < width - 1) {
                currentX++;
            }
            else {
                currentX = 0;
                currentY++;
            }
            return pixel;
        }
    }
}
