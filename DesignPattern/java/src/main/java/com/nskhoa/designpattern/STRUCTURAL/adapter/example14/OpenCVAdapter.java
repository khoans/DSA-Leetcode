package com.nskhoa.designpattern.STRUCTURAL.adapter.example14;

public class OpenCVAdapter implements ImageProcessor {
    private OpenCVProcessor openCV = new OpenCVProcessor();
    public void processImage(String imagePath) {
        openCV.openCVProcess(imagePath);
    }
}
