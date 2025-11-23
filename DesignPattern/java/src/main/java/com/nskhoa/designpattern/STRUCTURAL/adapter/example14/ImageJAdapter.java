package com.nskhoa.designpattern.STRUCTURAL.adapter.example14;

public class ImageJAdapter implements ImageProcessor {
    private ImageJProcessor imageJ = new ImageJProcessor();
    public void processImage(String imagePath) {
        imageJ.imageJProcess(imagePath);
    }
}
