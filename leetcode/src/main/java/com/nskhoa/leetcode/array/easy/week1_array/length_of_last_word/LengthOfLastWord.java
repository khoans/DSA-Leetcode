package com.nskhoa.leetcode.array.easy.week1_array.length_of_last_word;

public class LengthOfLastWord {
    static class Solution {
        public int lengthOfLastWord(String s) {
            int p = s.length() -1;

            while (p >= 0 && s.charAt(p) == ' ') {
                p--;
            }

            int length = 0;
            while (p >= 0 && s.charAt(p) != ' ') {
                length++;
                p--;
            }

            return length;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLastWord("Hello World        "));
    }
}
