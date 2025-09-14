package com.nskhoa.leetcode.array.easy.week1_array.largest_3_same_digit;

import java.util.List;

/**
 * Given a string num representing a large integer, return the largest 3-digit substring of num that consists of only the same digit. If no such substring exists, return an empty string.
 * A substring is a contiguous sequence of characters within a string.
 * Example 1:
 * Input: num = "6777133339"
 * Output: "777"
 * Explanation: The 3-digit substrings of num that consist of only the same digit are "777" and "333".
 * "777" is the largest, so we return "777".
 * Example 2:
 * Input: num = "2300019"
 * Output: "000"
 * Explanation: The only 3-digit substring of num that consists of only the same digit is "000".
 * Since "000" is the largest, we return "000".
 * Example 3:
 * Input: num = "42352338"
 * Output: ""
 * Explanation: There are no 3-digit substrings of num that consist of only the same digit.
 * Thus, we return an empty string "".
 * Constraints:
 * 3 <= num.length <= 1000
 * num only consists of digits.
 */
public class Largest3SameDigitNumber {
    class Solution {
        private List<String> sameDigitNumbers = List.of(
                "999",
                "888",
                "777",
                "666",
                "555",
                "444",
                "333",
                "222",
                "111",
                "000"
                                                       );

        // Check whether the 'num' string contains the 'sameDigitNumber' string or not.
        private boolean contains(String sameDigitNumber, String num) {
            for (int index = 0; index <= num.length() - 3; ++index) {
                if (num.charAt(index) == sameDigitNumber.charAt(0) &&
                    num.charAt(index + 1) == sameDigitNumber.charAt(1) &&
                    num.charAt(index + 2) == sameDigitNumber.charAt(2)) {
                    return true;
                }
            }
            return false;
        }

        public String largestGoodInteger(String num) {
            // Iterate on all 'sameDigitNumbers' and check if the string 'num' contains it.
            for (String sameDigitNumber : sameDigitNumbers) {
                if (contains(sameDigitNumber, num)) {
                    // Return the current 'sameDigitNumbers'.
                    return sameDigitNumber;
                }
            }
            // No 3 consecutive same digits are present in the string 'num'.
            return "";
        }
    }

    static class Solution2 {
        public String largestGoodInteger(String num) {
            String answer = "";
            String longest = "";
            for (int i = 9 ; i >= 0; i--) {
                longest = String.valueOf(i).repeat(3);
                if (num.indexOf(longest) != -1) {
                    answer = longest;
                    return answer;
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        String num = "6333317779";
        String num2 = "6888817779";
        var sol2 = new Solution2();
//        var result = sol2.largestGoodInteger(num);
        var result2 = sol2.largestGoodInteger(num2);
//        System.out.println(result);
        System.out.println(result2);
    }
}
