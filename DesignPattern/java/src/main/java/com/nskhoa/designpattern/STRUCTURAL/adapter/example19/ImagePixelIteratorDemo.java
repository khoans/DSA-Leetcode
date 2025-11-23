package com.nskhoa.designpattern.STRUCTURAL.adapter.example19;

public class ImagePixelIteratorDemo {
    public static void main(String[] args) {
        Image image = new Image(2, 2);
        image.setPixel(0, 0, 255);
        image.setPixel(1, 0, 128);

        MyIterator<Pixel> it = image.createIterator();
        while (it.hasNext()) {
            Pixel p = it.next();
            System.out.println("Pixel (" + p.getX() + "," + p.getY() + ") Color: " + p.getColor());
        }
    }
}

