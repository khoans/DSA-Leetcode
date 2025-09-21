package com.nskhoa.leetcode.array.easy.is_subsequence;

/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).



Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false


Constraints:

0 <= s.length <= 100
0 <= t.length <= 104
s and t consist only of lowercase English letters.


Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k >= 109, and you want to check one by one to see if t has its subsequence. In this scenario, how would you change your code?
 * */
public class IsSubsequence {
    // Greedy
    class Solution {
        String source, target;
        Integer leftBound, rightBound;

        private boolean rec_isSubsequence(int leftIndex, int rightIndex) {
            // base cases
            if (leftIndex == leftBound) {
                return true;
            }
            if (rightIndex == rightBound) {
                return false;
            }

            // consume both strings or just the target string
            if (source.charAt(leftIndex) == target.charAt(rightIndex)) {
                ++leftIndex;
            }
            ++rightIndex;

            return rec_isSubsequence(leftIndex, rightIndex);
        }

        public boolean isSubsequence(String s, String t) {
            this.source = s;
            this.target = t;
            this.leftBound = s.length();
            this.rightBound = t.length();

            return rec_isSubsequence(0, 0);
        }
    }

    // Two Pointer
    class Solution2 {

        public boolean isSubsequence(String s, String t) {
            Integer leftBound = s.length(), rightBound = t.length();
            Integer pLeft = 0, pRight = 0;

            while (pLeft < leftBound && pRight < rightBound) {
                // move both pointers or just the right pointer
                if (s.charAt(pLeft) == t.charAt(pRight)) {
                    pLeft += 1;
                }
                pRight += 1;
            }
            return pLeft == leftBound;
        }
    }

    public static void main(String[] args) {
        Solution solution = new IsSubsequence().new Solution();
        String s = "abc", t = "ahbgdc";
        System.out.println(solution.isSubsequence(s, t));
    }
}
