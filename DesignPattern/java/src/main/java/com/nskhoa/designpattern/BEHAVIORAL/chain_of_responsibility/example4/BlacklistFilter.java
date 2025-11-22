package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example4;

public class BlacklistFilter extends SpamFilter {
    @Override
    public void filterEmail(Email email) {
        if (email
                .getContent()
                .contains("blacklisted.com")) {
            System.out.println("BlacklistFilter detected spam.");
        }
        else {
            System.out.println("Email is clean.");
        }
    }
}
