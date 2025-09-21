package com.nskhoa.leetcode.string.hard.minimum_number_of_moves_to_make_palindrome;

/*
You are given a string s consisting only of lowercase English letters.

In one move, you can select any two adjacent characters of s and swap them.

Return the minimum number of moves needed to make s a palindrome.

Note that the input will be generated such that s can always be converted to a palindrome.



Example 1:

Input: s = "aabb"
Output: 2
Explanation:
We can obtain two palindromes from s, "abba" and "baab".
- We can obtain "abba" from s in 2 moves: "aabb" -> "abab" -> "abba".
- We can obtain "baab" from s in 2 moves: "aabb" -> "abab" -> "baab".
Thus, the minimum number of moves needed to make s a palindrome is 2.
Example 2:

Input: s = "letelt"
Output: 2
Explanation:
One of the palindromes we can obtain from s in 2 moves is "lettel".
One of the ways we can obtain it is "letelt" -> "letetl" -> "lettel".
Other palindromes such as "tleelt" can also be obtained in 2 moves.
It can be shown that it is not possible to obtain a palindrome in less than 2 moves.


Constraints:

1 <= s.length <= 2000
s consists only of lowercase English letters.
s can be converted to a palindrome using a finite number of moves.
 * */
public class MinimumNumberMovesToMakePalindrome {
    /*
    Time complexity: O(n^2)
    Space complexity: O(n)
    * */
    class Solution {
        public int minMovesToMakePalindrome(String S) {
            int l = 0;
            int n = S.length();
            int r = n - 1;

            int count = 0;
            int center_i = -1;
            char[] s = S.toCharArray();

            while (l < r) {
                if (s[l] == s[r]) {
                    l++;
                    r--;
                    continue;
                }

                int k = l + 1;
                for (; k < r; k++) {
                    if (s[k] == s[r]) {
                        break;
                    }
                }

                if (k == r) {
                    center_i = r;
                    r--;
                    continue;
                }

                for (int j = k; j > l; j--) {
                    swapChar(s, j, j - 1);
                    count++;
                }

                l++;
                r--;
            }

            if (center_i != -1) {
                count += (center_i - n / 2);
            }

            return count;
        }

        private void swapChar(char[] s, int i, int j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}
