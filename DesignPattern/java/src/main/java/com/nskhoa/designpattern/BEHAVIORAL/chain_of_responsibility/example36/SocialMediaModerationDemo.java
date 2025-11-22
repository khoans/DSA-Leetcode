package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example36;

// Client runner
public class SocialMediaModerationDemo {
    public static void main(String[] args) {
        ContentModerator spam = new SpamModerator();
        ContentModerator offensive = new OffensiveContentModerator();
        ContentModerator policy = new PolicyModerator();

        spam.setNextModerator(offensive);
        offensive.setNextModerator(policy);

        UserContent c1 = new UserContent("This is normal content.");
        UserContent c2 = new UserContent("This is spam content.");
        UserContent c3 = new UserContent("This is offensive content.");

        System.out.println("Moderating c1:");
        spam.moderate(c1);

        System.out.println("\nModerating c2:");
        spam.moderate(c2);

        System.out.println("\nModerating c3:");
        spam.moderate(c3);
    }
}
