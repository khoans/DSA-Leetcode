package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example4;

// Concrete Handlers
public class KeywordFilter extends SpamFilter {
    @Override
    public void filterEmail(Email email) {
        if (email
                .getContent()
                .contains("win money")) {
            System.out.println("KeywordFilter detected spam.");
        }
        else if (nextFilter != null) {
            nextFilter.filterEmail(email);
        }
        else {
            System.out.println("Email is clean.");
        }
    }
}
