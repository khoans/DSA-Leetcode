package com.nskhoa.leetcode.array.easy.week2_array.count_number_of_consistent_strings;

/*
You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.

Return the number of consistent strings in the array words.



Example 1:

Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
Example 2:

Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
Output: 7
Explanation: All strings are consistent.
Example 3:

Input: allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
Output: 4
Explanation: Strings "cc", "acd", "ac", and "d" are consistent.


Constraints:

1 <= words.length <= 104
1 <= allowed.length <= 26
1 <= words[i].length <= 10
The characters in allowed are distinct.
words[i] and allowed contain only lowercase English letters.
 * */
public class CountNumberOfConsistentStrings {
    class Solution {

        public int countConsistentStrings(String allowed, String[] words) {
            boolean[] isAllowed = new boolean[26];

            for (int i = 0; i < allowed.length(); i++) {
                isAllowed[allowed.charAt(i) - 'a'] = true;
            }

            int consistentCount = 0;

            for (String word : words) {
                boolean isConsistent = true;

                for (int i = 0; i < word.length(); i++) {
                    if (!isAllowed[word.charAt(i) - 'a']) {
                        isConsistent = false;
                        break;
                    }
                }

                if (isConsistent) {
                    consistentCount++;
                }
            }

            return consistentCount;
        }
    }

    public static void main(String[] args) {
        Solution solution = new CountNumberOfConsistentStrings().new Solution();
        System.out.println(solution.countConsistentStrings(
                "ab",
                new String[]{"ad", "bd", "aaab", "baa", "badab"}
                                                          )); // 2
        System.out.println(solution.countConsistentStrings(
                "abc",
                new String[]{"a", "b", "c", "ab", "ac", "bc", "abc"}
                                                          )); // 7
        System.out.println(solution.countConsistentStrings(
                "cad",
                new String[]{"cc", "acd", "b", "ba", "bac", "bad", "ac", "d"}
                                                          )); // 4
    }
}
