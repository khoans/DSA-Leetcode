package com.nskhoa.leetcode.array.easy.unique_email_addresses;

import java.util.HashSet;
import java.util.Set;

/**
 * Every valid email consists of a local name and a domain name, separated by the '@' sign. Besides lowercase letters, the email may contain one or more '.' or '+'.
 * For example, in "alice@leetcode.com", "alice" is the local name, and "leetcode.com" is the domain name.
 * If you add periods '.' between some characters in the local name part of an email address, mail sent there will be forwarded to the same address without dots in the local name. Note that this rule does not apply to domain names.
 * For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.
 * If you add a plus '+' in the local name, everything after the first plus sign will be ignored. This allows certain emails to be filtered. Note that this rule does not apply to domain names.
 * For example, "m.y+name@email.com" will be forwarded to "my@email.com".
 * It is possible to use both of these rules at the same time.
 * Given an array of strings emails where we send one email to each emails[i], return the number of different addresses that actually receive mails.
 * Example 1:
 * Input: emails = ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
 * Output: 2
 * Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails.
 * Example 2:
 * Input: emails = ["a@leetcode.com","b@leetcode.com","c@leetcode.com"]
 * Output: 3
 */
public class UniqueEmailAddresses {
    class Solution {
        public int numUniqueEmails(String[] emails) {
            // hash set to store all the unique emails
            Set<String> uniqueEmails = new HashSet<>();

            for (String email : emails) {
                // split into two parts local and domain
                String[] parts = email.split("@");

                // split local by '+'
                String[] local = parts[0].split("\\+");

                // remove all '.', and concatenate '@' and append domain
                uniqueEmails.add(local[0].replace(".", "") + "@" + parts[1]);
            }

            return uniqueEmails.size();
        }
    }

    public static void main(String[] args) {
        Solution solution = new UniqueEmailAddresses().new Solution();
        String[] emails1 = {"khoa@gmail.com", "kien@gmail.com", "lan@gmail.com", "khoa+1@gmail.com"};
        System.out.println(solution.numUniqueEmails(emails1)); // Output: 3
    }
}
