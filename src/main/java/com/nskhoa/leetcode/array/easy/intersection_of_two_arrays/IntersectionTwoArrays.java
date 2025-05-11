package com.nskhoa.leetcode.array.easy.intersection_of_two_arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


/**
 * https://leetcode.com/problems/intersection-of-two-arrays/description/
 *
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 * Example 2:
 *
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 * Explanation: [4,9] is also accepted.
 *
 *
 * Constraints:
 *
 * 1 <= nums1.length, nums2.length <= 1000
 * 0 <= nums1[i], nums2[i] <= 1000
 */

public class IntersectionTwoArrays {

    class Solution {
        /**
         *  * Approach 1: HashSet - RetainAll
         *
         * Complexity Analysis
         * Time complexity: O(n+m), where n and m are the arrays' lengths in the average case and O(n×m) in the worst case when the load factor is high enough.
         *
         * Space complexity: O(m+n) because in the worst case, when all elements in the arrays are unique, n space is used to store set1 and m space is used to store set2. The space used to store the result is not counted in the space complexity.
         */
        public int[] intersetion(int[] nums1, int[] nums2) {
            Set<Integer> set1 = new HashSet<>();
            for (Integer n : nums1) {
                set1.add(n);
            }
            Set<Integer> set2 = new HashSet<>();
            for (Integer n : nums2) {
                set2.add(n);
            }
            set1.retainAll(set2);
            int[] output = new int[set1.size()];
            int idx = 0;
            for (int s : set1) {
                output[idx++] = s;
            }
            return output;
        }


        /**
         * Approach 2: Two Sets
         *
         * Complexity Analysis
         * Time complexity: O(n+m), where n and m are the arrays' lengths. O(n) time is used to convert nums1 into a set, O(m) time is used to convert nums2, and contains/in operations are O(1) in the average case.
         *
         * Space complexity: O(m+n) because in the worst case, when all elements in the arrays are unique, n space is used to store set1 and m space is used to store set2.
         *
         */
        public int[] setIntersection(Set<Integer> set1, Set<Integer> set2) {
            int[] output = new int[set1.size()];
            int idx = 0;
            for (Integer s : set1) {
                if (set2.contains(s)){
                    output[idx++] = s;
                }
            }
            return Arrays.copyOf(output, idx);
        }
        public int[] intersection2(int[] nums1, int[] nums2) {
            Set<Integer> set1 = new HashSet<>();
            for (Integer n : nums1) {
                set1.add(n);
            }
            Set<Integer> set2 = new HashSet<>();
            for (Integer n : nums2) {
                set2.add(n);
            }
            if (set1.size() < set2.size()){
                return setIntersection(set1, set2);
            } else {
                return setIntersection(set2, set1);
            }
        }
    }
}
