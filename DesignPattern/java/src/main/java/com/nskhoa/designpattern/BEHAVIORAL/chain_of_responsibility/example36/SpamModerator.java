package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example36;

// Concrete Handlers
public class SpamModerator extends ContentModerator {
    @Override
    public void moderate(UserContent content) {
        if (content
                .getText()
                .toLowerCase()
                .contains("spam")) {
            System.out.println("Spam detected and blocked.");
        }
        else if (nextModerator != null) {
            nextModerator.moderate(content);
        }
        else {
            System.out.println("Content approved.");
        }
    }
}
