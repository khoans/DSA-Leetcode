package com.nskhoa.leetcode.array.easy.find_all_numbers_disappeared_in_an_array;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/*
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.



Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]


Constraints:

n == nums.length
1 <= n <= 105
1 <= nums[i] <= n


Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
* */
public class FindAllNumbersDisappearedInArray {
    /*
    Complexity Analysis

Time Complexity : O(N)
Space Complexity : O(N)

     * */
    class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {

            // Hash table for keeping track of the numbers in the array
            // Note that we can also use a set here since we are not
            // really concerned with the frequency of numbers.
            HashMap<Integer, Boolean> hashTable = new HashMap<Integer, Boolean>();

            // Add each of the numbers to the hash table
            for (int i = 0; i < nums.length; i++) {
                hashTable.put(nums[i], true);
            }

            // Response array that would contain the missing numbers
            List<Integer> result = new LinkedList<Integer>();

            // Iterate over the numbers from 1 to N and add all those
            // that don't appear in the hash table.
            for (int i = 1; i <= nums.length; i++) {
                if (!hashTable.containsKey(i)) {
                    result.add(i);
                }
            }

            return result;
        }
    }

    /*
    Time Complexity : O(N)
Space Complexity : O(1) since we are reusing the input array itself as a hash table and the space occupied by the output array doesn't count toward the space complexity of the algorithm.

     * */
    class Solution2 {
        public List<Integer> findDisappearedNumbers(int[] nums) {

            // Iterate over each of the elements in the original array
            for (int i = 0; i < nums.length; i++) {

                // Treat the value as the new index
                int newIndex = Math.abs(nums[i]) - 1;

                // Check the magnitude of value at this new index
                // If the magnitude is positive, make it negative
                // thus indicating that the number nums[i] has
                // appeared or has been visited.
                if (nums[newIndex] > 0) {
                    nums[newIndex] *= -1;
                }
            }

            // Response array that would contain the missing numbers
            List<Integer> result = new LinkedList<Integer>();

            // Iterate over the numbers from 1 to N and add all those
            // that have positive magnitude in the array
            for (int i = 1; i <= nums.length; i++) {

                if (nums[i - 1] > 0) {
                    result.add(i);
                }
            }

            return result;
        }
    }
}
