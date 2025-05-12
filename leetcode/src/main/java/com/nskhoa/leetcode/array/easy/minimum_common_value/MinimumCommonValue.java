package com.nskhoa.leetcode.array.easy.minimum_common_value;

import java.util.HashSet;
import java.util.Set;

/*
https://leetcode.com/problems/minimum-common-value/description
Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return the minimum integer common to both arrays. If there is no common integer amongst nums1 and nums2, return -1.

Note that an integer is said to be common to nums1 and nums2 if both arrays have at least one occurrence of that integer.



Example 1:

Input: nums1 = [1,2,3], nums2 = [2,4]
Output: 2
Explanation: The smallest element common to both arrays is 2, so we return 2.
Example 2:

Input: nums1 = [1,2,3,6], nums2 = [2,3,4,5]
Output: 2
Explanation: There are two common elements in the array 2 and 3 out of which 2 is the smallest, so 2 is returned.


Constraints:

1 <= nums1.length, nums2.length <= 105
1 <= nums1[i], nums2[j] <= 109
Both nums1 and nums2 are sorted in non-decreasing order.
 */
public class MinimumCommonValue
{
    /*
    Approach 1: HashSet

    Complexity Analysis
    Let n be the length of nums1 and m be the length of nums2.

    Time complexity: O(n+m)

    Creating set1 takes O(n).

    We search for each element of nums2 in set1. Searching for an element in a hash set takes O(1) on average, so the time complexity of this step is O(m).

    The total time complexity will be O(n+m).

    Space complexity: O(n)

    We initialize the set set1, which is size O(e) where e is the number of distinct elements in nums1. At worst, there can be n distinct elements, so the space complexity is O(n).
     */

    public class Solution1 {
        public int getCommon(int[] nums1, int[] nums2) {
            Set<Integer> set1 = new HashSet<>();

            // Add the elements from nums1 to set1
            for (int num : nums1) {
                set1.add(num);
            }

            // Search for each element of nums2 in set1
            // Return the first common element found
            for (int num : nums2) {
                if (set1.contains(num)) {
                    return num;
                }
            }

            // Return -1 if there are no common elements
            return -1;
        }
    }


    /*
    Approach 2: Two Pointers

	Complexity Analysis
    Let n be the length of nums1 and m be the length of nums2.

    Time complexity: O(n+m)

    We iterate through nums1 and nums2 using two pointers. On each iteration of the loop, one of the pointers is incremented, but not both. Each pointer can be incremented as many times as n or m, respectively, meaning we will iterate at most n+m times. With each iteration, we performed O(1) work. Therefore, the time complexity is O(n+m).

    Space complexity: O(1)

    We use a couple of variables and no additional data structures that grow with input size, so the space complexity is constant, O(1).
     */

    public class Solution2 {
        public int getCommon(int[] nums1, int[] nums2) {
            int first = 0;
            int second = 0;

            // Traverse through both arrays with two pointers
            // Increment the pointer with a smaller value at that index
            // Return the first common element found
            while (first < nums1.length && second < nums2.length) {
                if (nums1[first] < nums2[second]) {
                    first++;
                } else if (nums1[first] > nums2[second]) {
                    second++;
                } else {
                    return nums1[first];
                }
            }

            // Return -1 if there are no common elements
            return -1;
        }
    }

    /*
    Approach 3: Binary Search

	Complexity Analysis
    Let n be the length of the shorter array and m be the length of the longer array.

    Time complexity: O(nlogm)

    We iterate through the shorter array, using binary search to look for each element in the longer array. Binary Search takes O(logm) time to search through m elements, so the overall time complexity is O(nlogm).

    If one of the arrays is very large relative to the other, this approach will be more efficient than the previous two.

    Space complexity: O(1)

    We use a couple of variables and no additional data structures that grow with input size, so the space complexity is constant, O(1).
     */

    public class Solution3 {
        public int getCommon(int[] nums1, int[] nums2) {
            // Binary search should be done on the larger array
            // If nums1 is longer, call getCommon with the arrays swapped
            if (nums1.length > nums2.length) {
                return getCommon(nums2, nums1);
            }

            // Search for each element of nums1 in nums2
            // Return the first common element found
            for (int num : nums1) {
                if (binarySearch(num, nums2)) {
                    return num;
                }
            }

            // Return -1 if there are no common elements
            return -1;
        }

        private boolean binarySearch(int target, int[] nums) {
            int left = 0;
            int right = nums.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] > target) {
                    right = mid - 1;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    return true;
                }
            }
            return false;
        }
    }
}
