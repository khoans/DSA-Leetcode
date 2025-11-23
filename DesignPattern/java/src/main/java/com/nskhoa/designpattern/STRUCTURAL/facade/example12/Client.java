package com.nskhoa.designpattern.STRUCTURAL.facade.example12;

class ContentCreator {
    void createContent() { System.out.println("Creating content"); }
}
class ContentEditor {
    void editContent() { System.out.println("Editing content"); }
}
class ContentManager {
    void publishContent() { System.out.println("Publishing content"); }
}

class CMSFacade {
    private ContentCreator creator = new ContentCreator();
    private ContentEditor editor = new ContentEditor();
    private ContentManager manager = new ContentManager();

    void manageContentWorkflow() {
        creator.createContent();
        editor.editContent();
        manager.publishContent();
    }
}

public class Client {
    public static void main(String[] args) {
        CMSFacade cmsFacade = new CMSFacade();
        cmsFacade.manageContentWorkflow();
    }
}
