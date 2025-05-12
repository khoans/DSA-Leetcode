package com.nskhoa.leetcode.array.easy.unique_number_of_occurences;

import java.util.*;

/*
https://leetcode.com/problems/unique-number-of-occurrences/description/
Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.



Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
Example 2:

Input: arr = [1,2]
Output: false
Example 3:

Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true


Constraints:

1 <= arr.length <= 1000
-1000 <= arr[i] <= 1000
 */
public class UniqueNumberOfOccurences
{
    /*
    Approach 1: Counting Sort

    Complexity Analysis
    Here, N is the size of array arr, and K is equal to 1000.

    Time complexity: O(N+KlogK).

    We first iterate over the array arr to store the frequency in the array freq. This takes O(N) time. Then we sort the array freq that has a size of 2K = 2000. Hence it takes O(2Klog2K) time that can be simplified to O(KlogK). In the end, we iterate over the array freq to check duplicate values, and this takes O(2K) time. Therefore the total time complexity is equal to O(N+KlogK).

    Space complexity: O(K).

    The only space required is the frequency array freq of size 2K to store the frequency of all the elements. Thus, the total space complexity is equal to O(K).
     */
    class Solution1 {
        // Constant to make elements non-negative.
        final int K = 1000;

        public boolean uniqueOccurrences(int[] arr) {
            int freq[] = new int[2 * K + 1];

            // Store the frequency of elements in the unordered map.
            for (int num : arr) {
                freq[num + K]++;
            }

            // Sort the frequency count.
            Arrays.sort(freq);

            // If the adjacent freq count is equal, then the freq count isn't unique.
            for (int i = 0; i < 2 * K; i++) {
                if (freq[i] != 0 && freq[i] == freq[i + 1]) {
                    return false;
                }
            }

            // If all the elements are traversed, it implies frequency counts are unique.
            return true;
        }
    }

    /*
    Approach 2: HashMap & HashSet

    Complexity Analysis
    Here, N is the size of array arr.

    Time complexity: O(N).

    We iterate over the array arr to find the frequency and store them in the hash map freq. Then, we insert these frequencies in the hash set freqSet, which has the insertion complexity of O(1). Hence, the total time complexity is equal to O(N).

    Space complexity: O(N).

    We are storing the N frequencies in the hash map freq that takes O(1) space for each element. We also store the frequency count in the hash set. Therefore, the total space complexity is equal to O(N).
     */
    class Solution2 {
        public boolean uniqueOccurrences(int[] arr) {
            // Store the frequency of elements in the unordered map.
            Map<Integer, Integer> freq = new HashMap<>();
            for (int num : arr) {
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }

            // Store the frequency count of elements in the unordered set.
            Set<Integer> freqSet = new HashSet<>(freq.values());

            // If the set size is equal to the map size,
            // It implies frequency counts are unique.
            return freq.size() == freqSet.size();
        }
    }
}
