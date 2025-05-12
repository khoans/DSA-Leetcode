package com.nskhoa.leetcode.array.easy.merge_string_alternately;

/*
https://leetcode.com/problems/merge-strings-alternately/description/

You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.



Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
Example 2:

Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b
word2:    p   q   r   s
merged: a p b q   r   s
Example 3:

Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q
merged: a p b q c   d


Constraints:

1 <= word1.length, word2.length <= 100
word1 and word2 consist of lowercase English letters.
 */
public class MergeStringAlternately
{
    /*
    Approach 1: Two Pointer

    Complexity Analysis
    Here, m is the length of word1 and n is the length of word2.

    Time complexity: O(m+n)

    We iterate over word1 and word2 once and push their letters into result. It would take O(m+n) time.
    Space complexity: O(1) or O(m+n)

    Without considering the space consumed by the input strings (word1 and word2) and the output string (result), we do not use more than constant space.
    In Java, the StringBuilder requires O(n+m) space to store the merged result. Thus, while auxiliary space is O(1), total space complexity is O(n+m).
     */

    class Solution1 {
        public String mergeAlternately(String word1, String word2) {
            int m = word1.length();
            int n = word2.length();
            StringBuilder result = new StringBuilder();
            int i = 0, j = 0;

            while (i < m || j < n) {
                if (i < m) {
                    result.append(word1.charAt(i++));
                }
                if (j < n) {
                    result.append(word2.charAt(j++));
                }
            }

            return result.toString();
        }
    }

    /*
    Approach 2: One Pointer

    Complexity Analysis
    Here, m is the length of word1 and n is the length of word2.

    Time complexity: O(m+n)

    We iterate over word1 and word2 once pushing their letters into result. It would take O(m+n) time.
    Space complexity: O(1)

    Without considering the space consumed by the input strings (word1 and word2) and the output string (result), we do not use more than constant space.
     */
    class Solution2 {
        public String mergeAlternately(String word1, String word2) {
            int m = word1.length();
            int n = word2.length();
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < Math.max(m, n); i++) {
                if (i < m) {
                    result.append(word1.charAt(i));
                }
                if (i < n) {
                    result.append(word2.charAt(i));
                }
            }

            return result.toString();
        }
    }
}
