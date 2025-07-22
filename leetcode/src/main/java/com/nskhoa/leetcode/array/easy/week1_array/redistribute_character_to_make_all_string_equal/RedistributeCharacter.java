package com.nskhoa.leetcode.array.easy.week1_array.redistribute_character_to_make_all_string_equal;

public class RedistributeCharacter {
    static class Solution {
        public boolean makeEqual(String[] words) {
            int[] counts = new int[26];
            for (String word : words) {
                for (char c : word.toCharArray()) {
                    counts[c - 'a']++;
                }
            }

            int n = words.length;
            for (int val : counts) {
                if (val % n != 0) {
                    return false;
                }
            }

            return true;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] words = new String[]{"abc","aabc","bc"};
        sol.makeEqual(words);
    }
}
