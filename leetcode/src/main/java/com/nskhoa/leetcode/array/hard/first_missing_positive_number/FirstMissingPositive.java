package com.nskhoa.leetcode.array.hard.first_missing_positive_number;

/*
Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.



Example 1:

Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.
Example 2:

Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.
Example 3:

Input: nums = [7,8,9,11,12]
Output: 1
Explanation: The smallest positive integer 1 is missing.


Constraints:

1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
 * */
public class FirstMissingPositive {
    /*
    Complexity Analysis
Let n be the length of nums.

Time complexity: O(n)

We loop through the elements in nums once, swapping elements to sort the array. Swapping takes constant time. Sorting nums using cycle sort takes O(n) time.

Iterating through the sorted array and finding the first missing positive can take up to O(n).

The total time complexity is O(2n), which simplifies to O(n).

Space complexity: O(n)

We modify the array nums and use it to determine the answer, so the space complexity is O(n).

nums is the input array, so the auxiliary space used is O(1).
     * */
    class Solution {

        public int firstMissingPositive(int[] nums) {
            int n = nums.length;

            // Use cycle sort to place positive elements smaller than n
            // at the correct index
            int i = 0;
            while (i < n) {
                int correctIdx = nums[i] - 1;
                if (nums[i] > 0 && nums[i] <= n && nums[i] != nums[correctIdx]) {
                    swap(nums, i, correctIdx);
                }
                else {
                    i++;
                }
            }

            // Iterate through nums
            // return smallest missing positive integer
            for (i = 0; i < n; i++) {
                if (nums[i] != i + 1) {
                    return i + 1;
                }
            }

            // If all elements are at the correct index
            // the smallest missing positive number is n + 1
            return n + 1;
        }

        // Swaps two elements in nums
        private void swap(int[] nums, int index1, int index2) {
            int temp = nums[index1];
            nums[index1] = nums[index2];
            nums[index2] = temp;
        }
    }

    class Solution2 {

        public int firstMissingPositive(int[] nums) {
            int n = nums.length;
            boolean contains1 = false;

            // Replace negative numbers, zeros,
            // and numbers larger than n with 1s.
            // After this nums contains only positive numbers.
            for (int i = 0; i < n; i++) {
                // Check whether 1 is in the original array
                if (nums[i] == 1) {
                    contains1 = true;
                }
                if (nums[i] <= 0 || nums[i] > n) {
                    nums[i] = 1;
                }
            }

            if (!contains1) {
                return 1;
            }

            // Mark whether integers 1 to n are in nums
            // Use index as a hash key and negative sign as a presence detector.
            for (int i = 0; i < n; i++) {
                int value = Math.abs(nums[i]);
                if (value == n) {
                    nums[0] = -Math.abs(nums[0]);
                }
                else {
                    nums[value] = -Math.abs(nums[value]);
                }
            }

            // First positive in nums is smallest missing positive integer
            for (int i = 1; i < n; i++) {
                if (nums[i] > 0) {
                    return i;
                }
            }

            // nums[0] stores whether n is in nums
            if (nums[0] > 0) {
                return n;
            }

            // If nums contains all elements 1 to n
            // the smallest missing positive number is n + 1
            return n + 1;
        }
    }

    public static void main(String[] args) {
        Solution solution = new FirstMissingPositive().new Solution();
//        int[] nums1 = {1, 2, 0};
//        System.out.println(solution.firstMissingPositive(nums1)); // Output: 3

        int[] nums2 = {3, 4, -1, 1};
        System.out.println(solution.firstMissingPositive(nums2)); // Output: 2

//        int[] nums3 = {7, 8, 9, 11, 12};
//        System.out.println(solution.firstMissingPositive(nums3)); // Output: 1
    }
}
