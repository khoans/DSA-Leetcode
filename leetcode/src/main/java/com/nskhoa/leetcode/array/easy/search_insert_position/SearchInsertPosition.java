package com.nskhoa.leetcode.array.easy.search_insert_position;

/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4


Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104
 * */
public class SearchInsertPosition {
    /*
    Time complexity: O(log n)
    Space complexity: O(1)
    * */
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int pivot, left = 0, right = nums.length - 1;
            while (left <= right) {
                pivot = left + (right - left) / 2;
                if (nums[pivot] == target) {
                    return pivot;
                }
                if (target < nums[pivot]) {
                    right = pivot - 1;
                }
                else {
                    left = pivot + 1;
                }
            }
            return left;
        }
    }

    public static void main(String[] args) {
        Solution solution = new SearchInsertPosition().new Solution();
        System.out.println(solution.searchInsert(new int[]{1, 3, 5, 6}, 5)); // 2
        System.out.println(solution.searchInsert(new int[]{1, 3, 5, 6}, 2)); // 1
        System.out.println(solution.searchInsert(new int[]{1, 3, 5, 6}, 7)); // 4
        System.out.println(solution.searchInsert(new int[]{1, 3, 5, 6}, 0)); // 0
    }
}
