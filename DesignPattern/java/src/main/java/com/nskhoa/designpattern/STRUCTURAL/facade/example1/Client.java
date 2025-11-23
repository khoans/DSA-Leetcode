package com.nskhoa.designpattern.STRUCTURAL.facade.example1;

class StreamingLibrary {
    void playStream() { System.out.println("Playing stream..."); }
    void manageLibrary() { System.out.println("Managing media library..."); }
    void recommendContent() { System.out.println("Recommending content..."); }
}

class StreamingFacade {
    private StreamingLibrary library = new StreamingLibrary();
    public void play() {
        library.playStream();
    }
    public void browseLibrary() {
        library.manageLibrary();
    }
    public void getRecommendations() {
        library.recommendContent();
    }
}

// Client usage
// StreamingFacade streaming = new StreamingFacade();
// streaming.play();
// streaming.browseLibrary();
// streaming.getRecommendations();

public class Client {
    public static void main(String[] args) {
        StreamingFacade streaming = new StreamingFacade();
        streaming.play();
        streaming.browseLibrary();
        streaming.getRecommendations();
    }
}
