package com.nskhoa.designpattern.STRUCTURAL.adapter.example14;

public class ImageProcessingApp {
    private ImageProcessor processor;
    public ImageProcessingApp(ImageProcessor processor) {
        this.processor = processor;
    }
    void execute(String imagePath) {
        processor.processImage(imagePath);
    }

    public static void main(String[] args) {
        ImageProcessor openCVAdapter = new OpenCVAdapter();
        ImageProcessor imageJAdapter = new ImageJAdapter();

        ImageProcessingApp app1 = new ImageProcessingApp(openCVAdapter);
        ImageProcessingApp app2 = new ImageProcessingApp(imageJAdapter);

        app1.execute("image1.jpg");
        app2.execute("image2.png");
    }
}
