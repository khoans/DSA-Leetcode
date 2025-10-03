package com.nskhoa.leetcode.string.medium.length_of_longest_substring;

import java.util.HashMap;
import java.util.Map;

/*
Given a string s, find the length of the longest substring without duplicate characters.



Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
 * */
public class LengthOfLongestSubstring {
    public class Solution {

        /*
        Time Complexity: O(n)
        Space Complexity: O(1)
        128 is the number of ASCII characters
        * */
        public int lengthOfLongestSubstring(String s) {
            Integer[] chars = new Integer[128];

            int left = 0;
            int right = 0;

            int res = 0;
            while (right < s.length()) {
                char r = s.charAt(right);

                Integer index = chars[r];
                if (index != null && index >= left && index < right) {
                    left = index + 1;
                }

                res = Math.max(res, right - left + 1);

                chars[r] = right;
                right++;
            }

            return res;
        }
    }

    class Solution2 {

        public int lengthOfLongestSubstring(String s) {
            int n = s.length(), ans = 0;
            Map<Character, Integer> charToNextIndex = new HashMap<>(); // index after current character
            // try to extend the range [i, j]
            for (int j = 0, i = 0; j < n; j++) {
                if (charToNextIndex.containsKey(s.charAt(j))) {
                    i = Math.max(charToNextIndex.get(s.charAt(j)), i);
                }
                ans = Math.max(ans, j - i + 1);
                charToNextIndex.put(s.charAt(j), j + 1);
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution2 solution = new LengthOfLongestSubstring().new Solution2();
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println(solution.lengthOfLongestSubstring("bbbbb")); // 1
        System.out.println(solution.lengthOfLongestSubstring("pwwkew")); // 3
        System.out.println(solution.lengthOfLongestSubstring("")); // 0
        System.out.println(solution.lengthOfLongestSubstring(" ")); // 1
        System.out.println(solution.lengthOfLongestSubstring("au")); // 2
        System.out.println(solution.lengthOfLongestSubstring("dvdf")); // 3
    }
}
