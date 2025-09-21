package com.nskhoa.leetcode.string.hard.find_index_of_first_occurrence_in_string;

/*
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.



Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.


Constraints:

1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters.
 * */
public class FindIndexOfFirstOccurrenceInAString {
    /*
    Time complexity: O(n * m)
    Space complexity: O(1)
    * */
    class Solution {
        public int strStr(String haystack, String needle) {
            int m = needle.length();
            int n = haystack.length();

            for (int windowStart = 0; windowStart <= n - m; windowStart++) {
                for (int i = 0; i < m; i++) {
                    if (needle.charAt(i) != haystack.charAt(windowStart + i)) {
                        break;
                    }
                    if (i == m - 1) {
                        return windowStart;
                    }
                }
            }

            return -1;
        }
    }

    /*
    Rabin-Karp Algorithm
    Time complexity: O(n + m)
    Space complexity: O(1)
    * */
    class Solution2 {
        public int hashValue(String string, int RADIX, int MOD, int m) {
            long ans = 0;
            long factor = 1;
            for (int i = m - 1; i >= 0; i--) {
                ans = (ans + (string.charAt(i) - 'a') * factor) % MOD;
                factor = (factor * RADIX) % MOD;
            }
            return (int) ans;
        }

        public int strStr(String haystack, String needle) {
            int m = needle.length();
            int n = haystack.length();
            if (n < m) {
                return -1;
            }

            // CONSTANTS
            int RADIX = 26;
            int MOD = 1000000033;
            long MAX_WEIGHT = 1;

            for (int i = 0; i < m; i++) {
                MAX_WEIGHT = (MAX_WEIGHT * RADIX) % MOD;
            }

            // Compute hash of needle
            long hashNeedle = hashValue(needle, RADIX, MOD, m), hashHay = 0;

            // Check for each m-substring of haystack, starting at index windowStart
            for (int windowStart = 0; windowStart <= n - m; windowStart++) {
                if (windowStart == 0) {
                    // Compute hash of the First Substring
                    hashHay = hashValue(haystack, RADIX, MOD, m);
                }
                else {
                    // Update Hash using Previous Hash Value in O(1)
                    hashHay = (((hashHay * RADIX) % MOD) -
                               (((int) (haystack.charAt(windowStart - 1) - 'a') *
                                 MAX_WEIGHT) %
                                MOD) +
                               (int) (haystack.charAt(windowStart + m - 1) - 'a') +
                               MOD) %
                              MOD;
                }
                // If the hash matches, Check Character by Character.
                // Because of Mod, spurious hits can be there.
                if (hashNeedle == hashHay) {
                    for (int i = 0; i < m; i++) {
                        if (needle.charAt(i) != haystack.charAt(i + windowStart)) {
                            break;
                        }
                        if (i == m - 1) {
                            return windowStart;
                        }
                    }
                }
            }

            return -1;
        }
    }

    /*
    Rabin-Karp Algorithm with Double Hashing
    Time complexity: O(n + m)
    Space complexity: O(1)
    Reduces Probability of Spurious Hit to almost zero.
    * */
    class Solution3 {
        // CONSTANTS
        final int RADIX_1 = 26;
        final int MOD_1 = 1000000033;
        final int RADIX_2 = 27;
        final int MOD_2 = 2147483647;

        // Return Array of Hash Values
        public long[] hashPair(String string, int m) {
            long hash1 = 0, hash2 = 0;
            long factor1 = 1, factor2 = 1;

            for (int i = m - 1; i >= 0; i--) {
                hash1 += ((int) (string.charAt(i) - 'a') * (factor1)) % MOD_1;
                factor1 = (factor1 * RADIX_1) % MOD_1;
                hash2 += ((int) (string.charAt(i) - 'a') * (factor2)) % MOD_2;
                factor2 = (factor2 * RADIX_2) % MOD_2;
            }

            return new long[]{hash1 % MOD_1, hash2 % MOD_2};
        }

        public int strStr(String haystack, String needle) {
            int m = needle.length();
            int n = haystack.length();
            if (n < m) {
                return -1;
            }

            // COMPUTING CONSTANTS
            long MAX_WEIGHT_1 = 1;
            long MAX_WEIGHT_2 = 1;
            for (int i = 0; i < m; i++) {
                MAX_WEIGHT_1 = (MAX_WEIGHT_1 * RADIX_1) % MOD_1;
                MAX_WEIGHT_2 = (MAX_WEIGHT_2 * RADIX_2) % MOD_2;
            }

            // Compute hash pair of needle
            long[] hashNeedle = hashPair(needle, m);
            long[] hashHay = {0, 0};

            // Check for each m-substring of haystack, starting at index windowStart
            for (int windowStart = 0; windowStart <= n - m; windowStart++) {
                if (windowStart == 0) {
                    // Compute hashPair of First Substring
                    hashHay = hashPair(haystack, m);
                }
                else {
                    // Update Hash Pair using Previous Hash Value in O(1)
                    hashHay[0] = (((hashHay[0] * RADIX_1) % MOD_1) -
                                  (((int) (haystack.charAt(windowStart - 1) - 'a') *
                                    MAX_WEIGHT_1) %
                                   MOD_1) +
                                  (int) (haystack.charAt(windowStart + m - 1) - 'a') +
                                  MOD_1) %
                                 MOD_1;
                    hashHay[1] = (((hashHay[1] * RADIX_2) % MOD_2) -
                                  (((int) (haystack.charAt(windowStart - 1) - 'a') *
                                    MAX_WEIGHT_2) %
                                   MOD_2) +
                                  (int) (haystack.charAt(windowStart + m - 1) - 'a') +
                                  MOD_2) %
                                 MOD_2;
                }

                // If the hash matches, return immediately. Probability of Spurious Hit tends to zero.
                if (hashNeedle[0] == hashHay[0] && hashNeedle[1] == hashHay[1]) {
                    return windowStart;
                }
            }

            return -1;
        }
    }

    /*
    Knuth-Morris-Pratt (KMP) Algorithm
    Time complexity: O(n).
    Space complexity: O(m)
    * */
    class Solution4 {
        public int strStr(String haystack, String needle) {
            int m = needle.length();
            int n = haystack.length();

            if (n < m) {
                return -1;
            }

            // PREPROCESSING
            // longest_border array
            int[] longest_border = new int[m];
            // Length of Longest Border for prefix before it.
            int prev = 0;
            // Iterating from index-1. longest_border[0] will always be 0
            int i = 1;

            while (i < m) {
                if (needle.charAt(i) == needle.charAt(prev)) {
                    // Length of Longest Border Increased
                    prev += 1;
                    longest_border[i] = prev;
                    i += 1;
                }
                else {
                    // Only empty border exist
                    if (prev == 0) {
                        longest_border[i] = 0;
                        i += 1;
                    }
                    // Try finding longest border for this i with reduced prev
                    else {
                        prev = longest_border[prev - 1];
                    }
                }
            }

            // SEARCHING
            // Pointer for haystack
            int haystackPointer = 0;
            // Pointer for needle.
            // Also indicates number of characters matched in current window.
            int needlePointer = 0;

            while (haystackPointer < n) {
                if (
                        haystack.charAt(haystackPointer) == needle.charAt(needlePointer)
                ) {
                    // Matched Increment Both
                    needlePointer += 1;
                    haystackPointer += 1;
                    // All characters matched
                    if (needlePointer == m) {
                        // m characters behind last matching will be start of window
                        return haystackPointer - m;
                    }
                }
                else {
                    if (needlePointer == 0) {
                        // Zero Matched
                        haystackPointer += 1;
                    }
                    else {
                        // Optimally shift left needlePointer. Don't change haystackPointer
                        needlePointer = longest_border[needlePointer - 1];
                    }
                }
            }

            return -1;
        }
    }
}
