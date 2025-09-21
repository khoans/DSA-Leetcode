package com.nskhoa.leetcode.array.easy.largest_3_same_digit_number;

/*
You are given a string num representing a large integer. An integer is good if it meets the following conditions:

It is a substring of num with length 3.
It consists of only one unique digit.
Return the maximum good integer as a string or an empty string "" if no such integer exists.

Note:

A substring is a contiguous sequence of characters within a string.
There may be leading zeroes in num or a good integer.


Example 1:

Input: num = "6777133339"
Output: "777"
Explanation: There are two distinct good integers: "777" and "333".
"777" is the largest, so we return "777".
Example 2:

Input: num = "2300019"
Output: "000"
Explanation: "000" is the only good integer.
Example 3:

Input: num = "42352338"
Output: ""
Explanation: No substring of length 3 consists of only one unique digit. Therefore, there are no good integers.


Constraints:

3 <= num.length <= 1000
num only consists of digits.
 * */
public class Largest3SameDigitNumber {
    class Solution {
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

    public static void main(String[] args) {
        Solution solution = new Largest3SameDigitNumber().new Solution();
        String num = "6777133339";
        System.out.println(solution.largestGoodInteger(num)); // 777
    }
}
