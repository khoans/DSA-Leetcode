package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example36;

public class OffensiveContentModerator extends ContentModerator {
    @Override
    public void moderate(UserContent content) {
        if (content
                .getText()
                .toLowerCase()
                .contains("offensive")) {
            System.out.println("Offensive content blocked.");
        }
        else if (nextModerator != null) {
            nextModerator.moderate(content);
        }
        else {
            System.out.println("Content approved.");
        }
    }
}
