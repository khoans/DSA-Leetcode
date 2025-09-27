package com.nskhoa.leetcode.array.easy.IntersectionOfTwoArrays;


import java.util.*;

/*
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.



Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.


Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
* */
public class IntersectionOfTwoArrays {
    /*
    Complexity Analysis
Time complexity: O(n+m), where n and m are the arrays' lengths. O(n) time is used to convert nums1 into a set, O(m) time is used to convert nums2, and contains/in operations are O(1) in the average case.

Space complexity: O(m+n) because in the worst case, when all elements in the arrays are unique, n space is used to store set1 and m space is used to store set2.
     * */
    class Solution {
        public int[] setIntersection(Set<Integer> set1, Set<Integer> set2) {
            int[] output = new int[set1.size()];
            int idx = 0;
            for (Integer s : set1) {
                if (set2.contains(s)) {
                    output[idx++] = s;
                }
            }
            return Arrays.copyOf(output, idx);
        }

        public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> set1 = new HashSet<>();
            for (Integer n : nums1) {
                set1.add(n);
            }
            Set<Integer> set2 = new HashSet<>();
            for (Integer n : nums2) {
                set2.add(n);
            }
            if (set1.size() < set2.size()) {
                return setIntersection(set1, set2);
            }
            else {
                return setIntersection(set2, set1);
            }
        }
    }

    /*
    Time Complexity: O(n + m)
      Space Complexity: O(n)
    * */
    class Solution2 {
        public int[] intersection(int[] nums1, int[] nums2) {

            // Initialize seen map and result list
            Map<Integer, Integer> seen = new HashMap<>();
            List<Integer> result = new ArrayList<>();

            // Mark values occurring in nums1
            for (int x : nums1) {
                seen.put(x, 1);
            }

            // Check if n is in dictionary and not in the result
            for (int x : nums2) {
                if (seen.containsKey(x) && seen.get(x) == 1) {
                    result.add(x);
                    seen.put(x, 0);
                }
            }

            // Convert to int array and result the result
            return result
                    .stream()
                    .mapToInt(i -> i)
                    .toArray();

        }
    }

    public static void main(String[] args) {
        Solution solution = new IntersectionOfTwoArrays().new Solution();
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = solution.intersection(nums1, nums2);
        System.out.println(Arrays.toString(result)); // Output: [2]
    }
}
