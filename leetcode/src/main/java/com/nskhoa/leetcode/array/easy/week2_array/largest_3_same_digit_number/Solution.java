package com.nskhoa.leetcode.array.easy.week2_array.largest_3_same_digit_number;

public class Solution {
    public String largestGoodInteger(String num) {
        String answer = "";
        String longest = "";
        for (int i = 9; i >= 0; i--) {
            longest = String
                    .valueOf(i)
                    .repeat(3);
            if (num.indexOf(longest) != -1) {
                answer = longest;
                return answer;
            }
        }
        return answer;
    }

}
