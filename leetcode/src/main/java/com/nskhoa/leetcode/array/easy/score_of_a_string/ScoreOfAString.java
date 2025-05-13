package com.nskhoa.leetcode.array.easy.score_of_a_string;

/**
 * https://leetcode.com/problems/score-of-a-string/editorial/
 */
public class ScoreOfAString {
    class Solution {
        public int scoreOfString(String s) {
            int score = 0;
            // Iterate over all indices from 0 to the second-to-last index
            // Calculate and accumulate the absolute difference of ASCII values
            // between adjacent characters
            for (int i = 0; i < s.length() - 1; i++) {
                score += Math.abs(s.charAt(i) - s.charAt(i + 1));
            }
            return score;
        }
    }
}
