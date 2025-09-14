package com.nskhoa.leetcode.array.easy.week2_array.unique_email_addresses;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();

        for (String email : emails) {
            String[] parts = email.split("@");

            String[] local = parts[0].split("\\+");

            String convertedEmail = local[0].replace(".", "") + "@" + parts[1];

            uniqueEmails.add(convertedEmail);
        }

        return uniqueEmails.size();
    }
}
