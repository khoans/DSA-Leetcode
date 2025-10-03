package com.nskhoa.leetcode.string.medium.permutation_in_string;

/*
Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.



Example 1:

Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").
Example 2:

Input: s1 = "ab", s2 = "eidboaoo"
Output: false


Constraints:

1 <= s1.length, s2.length <= 104
s1 and s2 consist of lowercase English letters.
 * */
public class PermutationInString {
    /*
    Complexity analysis
Time complexity : O(l1 * (l2 - l1)).
    Assume that l1 and l2 are the lengths of s1 and s2 respectively,the time complexity is O(l1 * (l2 - l1)).
Space complexity : O(1).
    * */
    class Solution {
        public boolean checkInclusion(String s1, String s2) {
            if (s1.length() > s2.length()) {
                return false;
            }
            int[] s1arr = new int[26];
            for (int i = 0; i < s1.length(); i++) {
                s1arr[s1.charAt(i) - 'a']++;
            }
            for (int i = 0; i <= s2.length() - s1.length(); i++) {
                int[] s2arr = new int[26];
                for (int j = 0; j < s1.length(); j++) {
                    s2arr[s2.charAt(i + j) - 'a']++;
                }
                if (matches(s1arr, s2arr)) {
                    return true;
                }
            }
            return false;
        }

        public boolean matches(int[] s1arr, int[] s2arr) {
            for (int i = 0; i < 26; i++) {
                if (s1arr[i] != s2arr[i]) {
                    return false;
                }
            }
            return true;
        }
    }


    /*
    Complexity analysis
Time complexity : O(l1 + 26 * (l2 - l1)).
    Assume that l1 and l2 are the lengths of s1 and s2 respectively,
    Space complexity : O(1).
    * */
    class Solution2 {
        public boolean checkInclusion(String s1, String s2) {
            if (s1.length() > s2.length()) {
                return false;
            }
            int[] s1arr = new int[26];
            int[] s2arr = new int[26];
            for (int i = 0; i < s1.length(); i++) {
                s1arr[s1.charAt(i) - 'a']++;
                s2arr[s2.charAt(i) - 'a']++;
            }
            for (int i = 0; i < s2.length() - s1.length(); i++) {
                if (matches(s1arr, s2arr)) {
                    return true;
                }
                s2arr[s2.charAt(i + s1.length()) - 'a']++;
                s2arr[s2.charAt(i) - 'a']--;
            }
            return matches(s1arr, s2arr);
        }

        public boolean matches(int[] s1arr, int[] s2arr) {
            for (int i = 0; i < 26; i++) {
                if (s1arr[i] != s2arr[i]) {
                    return false;
                }
            }
            return true;
        }
    }

    /*
    Complexity analysis
Time complexity : O(l1 + l2).
    Assume that l1 and l2 are the lengths of s1 and s2 respectively
Space complexity : O(1).
    * */
    class Solution3 {
        public boolean checkInclusion(String s1, String s2) {
            if (s1.length() > s2.length()) {
                return false;
            }
            int[] s1arr = new int[26];
            int[] s2arr = new int[26];
            for (int i = 0; i < s1.length(); i++) {
                s1arr[s1.charAt(i) - 'a']++;
                s2arr[s2.charAt(i) - 'a']++;
            }

            int count = 0;
            for (int i = 0; i < 26; i++) {
                if (s1arr[i] == s2arr[i]) {
                    count++;
                }
            }

            for (int i = 0; i < s2.length() - s1.length(); i++) {
                int r = s2.charAt(i + s1.length()) - 'a', l = s2.charAt(i) - 'a';
                if (count == 26) {
                    return true;
                }
                s2arr[r]++;
                if (s2arr[r] == s1arr[r]) {
                    count++;
                }
                else if (s2arr[r] == s1arr[r] + 1) {
                    count--;
                }
                s2arr[l]--;
                if (s2arr[l] == s1arr[l]) {
                    count++;
                }
                else if (s2arr[l] == s1arr[l] - 1) {
                    count--;
                }
            }
            return count == 26;
        }
    }

    public static void main(String[] args) {
        Solution3 solution = new PermutationInString().new Solution3();
        System.out.println(solution.checkInclusion("ab", "eidbaooo")); // true
        System.out.println(solution.checkInclusion("ab", "eidboaoo")); // false
    }
}
