package com.nskhoa.leetcode.array.easy.maximum_score_after_splitting_a_string;


/*
https://leetcode.com/problems/maximum-score-after-splitting-a-string/description/
Given a string s of zeros and ones, return the maximum score after splitting the string into two non-empty substrings (i.e. left substring and right substring).

The score after splitting a string is the number of zeros in the left substring plus the number of ones in the right substring.



Example 1:

Input: s = "011101"
Output: 5
Explanation:
All possible ways of splitting s into two non-empty substrings are:
left = "0" and right = "11101", score = 1 + 4 = 5
left = "01" and right = "1101", score = 1 + 3 = 4
left = "011" and right = "101", score = 1 + 2 = 3
left = "0111" and right = "01", score = 1 + 1 = 2
left = "01110" and right = "1", score = 2 + 1 = 3
Example 2:

Input: s = "00111"
Output: 5
Explanation: When left = "00" and right = "111", we get the maximum score = 2 + 3 = 5
Example 3:

Input: s = "1111"
Output: 3


Constraints:

2 <= s.length <= 500
The string s consists of characters '0' and '1' only.
 */
public class MaximumScoreAfterSplittingAString
{

	/*
	Approach 1: Count zeros

	Complexity Analysis

    Given n as the length of nums,

    Time complexity: O(n)

    We start by finding the frequency of 1, which costs O(n). Next, we iterate over the string once, performing O(1) work at each iteration. Thus, our time complexity is O(2n)=O(n).

    Space complexity: O(1)

    We aren't using any extra space other than a few integers.
	 */
    static class Solution1 {
        public int maxScore(String s) {
            int ones = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    ones++;
                }
            }

            int ans = 0;
            int zeros = 0;
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == '1') {
                    ones--;
                } else {
                    zeros++;
                }

                ans = Math.max(ans, zeros + ones);
            }

            return ans;
        }

    }

    /*
    Approach 2: One Pass
    \
    Given n as the length of nums,

    Time complexity: O(n)

    We make one pass over nums, performing O(1) work at each iteration.

    Space complexity: O(1)

    We aren't using any extra space other than a few integers.

     */

    class Solution2 {
        public int maxScore(String s) {
            int ones = 0;
            int zeros = 0;
            int best = Integer.MIN_VALUE;

            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == '1') {
                    ones++;
                } else {
                    zeros++;
                }

                best = Math.max(best, zeros - ones);
            }

            if (s.charAt(s.length() - 1) == '1') {
                ones++;
            }

            return best + ones;
        }
    }

    public static void main(String[] args)
    {
        Solution1 sol1 = new Solution1();
        String s = "000100111";
        int i = sol1.maxScore(s);
        System.out.println(i);
    }
}
