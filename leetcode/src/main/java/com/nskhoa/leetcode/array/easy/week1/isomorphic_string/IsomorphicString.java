package com.nskhoa.leetcode.array.easy.week1.isomorphic_string;

import java.util.Arrays;

/**
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
 * Example 1:
 * Input: s = "egg", t = "add"
 * Output: true
 * Explanation:
 * The strings s and t can be made identical by:
 * Mapping 'e' to 'a'.
 * Mapping 'g' to 'd'.
 * Example 2:
 * Input: s = "foo", t = "bar"
 * Output: false
 * Explanation:
 * The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.
 * Example 3:
 * Input: s = "paper", t = "title"
 * Output: true
 * Constraints:
 * 1 <= s.length <= 5 * 104
 * t.length == s.length
 * s and t consist of any valid ascii character.
 */
public class IsomorphicString {
    static class Solution {
        public boolean isIsomorphic(String s, String t) {
            int[] mappingDictStoT = new int[256];
            Arrays.fill(mappingDictStoT, -1);

            int[] mappingDictTtoS = new int[256];
            Arrays.fill(mappingDictTtoS, -1);

            for (int i = 0; i < s.length(); ++i) {
                char c1 = s.charAt(i);
                char c2 = t.charAt(i);

                // Case 1: No mapping exists in either of the dictionaries
                if (mappingDictStoT[c1] == -1 && mappingDictTtoS[c2] == -1) {
                    mappingDictStoT[c1] = c2;
                    mappingDictTtoS[c2] = c1;
                }
                // Case 2: Either mapping doesn't exist in one of the dictionaries or Mapping exists and
                // it doesn't match in either of the dictionaries or both
                else if (
                        !(mappingDictStoT[c1] == c2 && mappingDictTtoS[c2] == c1)
                ) {
                    return false;
                }
            }

            return true;
        }
    }

    public static void main(String[] args) {
        String s = "polite";
        String t = "hellow";

        Solution sol = new Solution();
        sol.isIsomorphic(s,t);
    }
}
