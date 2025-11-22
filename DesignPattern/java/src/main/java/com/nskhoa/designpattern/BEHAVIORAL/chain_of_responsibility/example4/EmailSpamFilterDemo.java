package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example4;

// Client runner
public class EmailSpamFilterDemo {
    public static void main(String[] args) {
        SpamFilter keywordFilter = new KeywordFilter(); SpamFilter linkFilter = new LinkFilter();
        SpamFilter blacklistFilter = new BlacklistFilter();

        keywordFilter.setNextFilter(linkFilter); linkFilter.setNextFilter(blacklistFilter);

        Email email1 = new Email("Congratulations! You can win money now");
        Email email2 = new Email("Please click here to verify your account");
        Email email3 = new Email("Hello, this is a clean email");
        Email email4 = new Email("This email is from blacklisted.com");

        keywordFilter.filterEmail(email1); keywordFilter.filterEmail(email2); keywordFilter.filterEmail(email3);
        keywordFilter.filterEmail(email4);
    }
}

