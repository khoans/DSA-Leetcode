package com.nskhoa.leetcode.string.medium.permutation_in_string;

public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        return true;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.checkInclusion("ab", "eidbaooo")); // true
        System.out.println(solution.checkInclusion("ab", "eidboaoo")); // false
    }
}
