package com.nskhoa.leetcode.array.easy.unique_email_addresses;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/unique-email-addresses/editorial/
 *
 *
 *
 * */
public class UniqueEmailAddresses {
    class Solution {

        /**
         * Approach 2: Using String Split Method
         * Intuition
         *
         * A more elegant way of cleaning emails is to leverage built-in functions such as split and replace.
         *
         * The string split() method breaks a given string around matches of the given regular expression.
         * The string replace() method returns a new string after replacing all occurrences of some substring or character (in this case '.') with a new substring or character (in this case '').
         * Algorithm
         *
         * For each email present in the emails array:
         * Split the string into two parts separated by'@', local name, and domain name.
         * Split the local name into parts separated by '+'. Since we do not need the part after '+', let the first part be the local name.
         * Remove all '.' from the local name and append the domain name to it.
         * After cleaning the email, insert it into the hash set.
         * Return the size of the hash set.
         *
         * Complexity Analysis
         *
         * Let N be the number of the emails and M be the average length of an email.
         *
         * Time Complexity: O(N⋅M)
         * The split method must iterate over all of the characters in each email and the replace method must iterate over all of the characters in each local name. As such, they both require linear time and are O(M) operations.
         * Since there are N emails and the average email has M characters in it, the complexity is of order (Number of emails) * (Number of characters in an email) = N*M.
         *
         * Space Complexity: O(N⋅M)
         * In the worst case, when all emails are unique, we will store every email address given to us in the hash set.
         */
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
}
