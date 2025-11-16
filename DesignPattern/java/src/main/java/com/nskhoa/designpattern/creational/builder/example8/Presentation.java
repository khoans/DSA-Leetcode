package com.nskhoa.designpattern.CREATIONAL.builder.example8;

import java.util.ArrayList;
import java.util.List;

public class Presentation {
    private List<String> slides;
    private String content;
    private String images;

    private Presentation(Builder builder) {
        this.slides = builder.slides; this.content = builder.content; this.images = builder.images;
    }

    public static class Builder {
        private List<String> slides = new ArrayList<>();
        private String content;
        private String images;

        public Builder addSlide(String s) {
            slides.add(s); return this;
        }

        public Builder content(String c) {
            this.content = c; return this;
        }

        public Builder images(String i) {
            this.images = i; return this;
        }

        public Presentation build() {
            return new Presentation(this);
        }
    }

    public static void main(String[] args) {
        Presentation presentation = new Presentation.Builder()
                .addSlide("Introduction")
                .addSlide("Main Content")
                .addSlide("Conclusion")
                .content("This is the content of the presentation.")
                .images("image1.png, image2.png")
                .build();
        System.out.println("Presentation:");
        System.out.println("Slides: " + presentation.slides);
        System.out.println("Content: " + presentation.content);
        System.out.println("Images: " + presentation.images);
    }
}
