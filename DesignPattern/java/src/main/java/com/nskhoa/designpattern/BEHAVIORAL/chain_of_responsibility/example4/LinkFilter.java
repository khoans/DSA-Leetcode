package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example4;

public class LinkFilter extends SpamFilter {
    @Override
    public void filterEmail(Email email) {
        if (email
                .getContent()
                .contains("click here")) {
            System.out.println("LinkFilter detected spam.");
        }
        else if (nextFilter != null) {
            nextFilter.filterEmail(email);
        }
        else {
            System.out.println("Email is clean.");
        }
    }
}
