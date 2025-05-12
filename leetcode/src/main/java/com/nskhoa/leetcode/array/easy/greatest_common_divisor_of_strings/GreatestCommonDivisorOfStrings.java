package com.nskhoa.leetcode.array.easy.greatest_common_divisor_of_strings;

/*
https://leetcode.com/problems/greatest-common-divisor-of-strings/description/
For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.



Example 1:

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
Example 2:

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
Example 3:

Input: str1 = "LEET", str2 = "CODE"
Output: ""


Constraints:

1 <= str1.length, str2.length <= 1000
str1 and str2 consist of English uppercase letters.
 */
public class GreatestCommonDivisorOfStrings
{

    /*
    Approach 1: Brute Force

    Let m,n be the lengths of the two input strings str1 and str2.

    Time complexity: O(min(m,n)⋅(m+n))
    We checked every prefix string base of the shorter string among str1 and str2, and verify if both strings are made by multiples of base. There are up to min(m,n) prefix strings to verify and each check involves iterating over the two input strings to check if the current base is the GCD string, which costs O(m+n). Therefore, the overall time complexity is O(min(m,n)⋅(m+n)).

    Space complexity: O(min(m,n))
    We need to keep a copy of base in each iteration, which takes O(min(m,n)) space.
     */

    class Solution1 {
        public boolean valid(String str1, String str2, int k) {
            int len1 = str1.length(), len2 = str2.length();
            if (len1 % k > 0 || len2 % k > 0) {
                return false;
            } else {
                String base = str1.substring(0, k);
                return str1.replace(base, "").isEmpty() && str2.replace(base, "").isEmpty();
            }
        }


        public String gcdOfStrings(String str1, String str2) {
            int len1 = str1.length(), len2 = str2.length();
            for (int i = Math.min(len1, len2); i >= 1; --i) {
                if (valid(str1, str2, i)) {
                    return str1.substring(0, i);
                }
            }
            return "";
        }
    }

    /*
    	Approach 2: Greatest Common Divisor

    	Complexity Analysis

        Let m,n be the lengthes of the two input strings str1 and str2.

        Time complexity: O(m+n)

        We need to compare the two concatenations of length O(m+n), it takes O(m+n) time.
        We calculate the GCD using binary Euclidean algorithm, it takes log(m⋅n) time.
        To sum up, the overall time complexity is O(m+n).
        Space complexity: O(m+n)
        We need to compare the two concatenations of length O(m+n).
     */

    static class Solution2 {
        public int gcd(int x, int y) {
            if (y == 0) {
                return x;
            } else {
                return gcd(y, x % y);
            }
        }

        public String gcdOfStrings(String str1, String str2) {
            // Check if they have non-zero GCD string.
            if (!(str1 + str2).equals(str2 + str1)) {
                return "";
            }

            // Get the GCD of the two lengths.
            int gcdLength = gcd(str1.length(), str2.length());
            return str1.substring(0, gcdLength);
        }
    }

    public static void main(String[] args)
    {
        String s = "ABCABCABCABC";
        String t = "ABCABC";

        Solution2 sol = new Solution2();
        String solution = sol.gcdOfStrings(s, t);
        System.out.println(solution);
    }
}
