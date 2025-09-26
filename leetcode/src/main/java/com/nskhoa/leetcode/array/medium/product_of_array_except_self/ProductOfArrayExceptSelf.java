package com.nskhoa.leetcode.array.medium.product_of_array_except_self;

/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.



Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]


Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The input is generated such that answer[i] is guaranteed to fit in a 32-bit integer.


Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)
 * */
public class ProductOfArrayExceptSelf {

    /*
    Time complexity : O(N) where N represents the number of elements in the input array. We use one iteration to construct the array L, one to construct the array R and one last to construct the answer array using L and R.
Space complexity : O(N) used up by the two intermediate arrays that we constructed to keep track of product of elements to the left and right.

     * */
    class Solution {

        /*
        Time complexity : O(N) where N represents the number of elements in the input array. We use one iteration to construct the array L, one to construct the array R and one last to construct the answer array using L and R.
Space complexity : O(N) used up by the two intermediate arrays that we constructed to keep track
        * */
        public int[] productExceptSelf(int[] nums) {
            // The length of the input array
            int length = nums.length;

            // The left and right arrays as described in the algorithm
            int[] L = new int[length];
            int[] R = new int[length];

            // Final answer array to be returned
            int[] answer = new int[length];

            // L[i] contains the product of all the elements to the left
            // Note: for the element at index '0', there are no elements to the left,
            // so L[0] would be 1
            L[0] = 1;
            for (int i = 1; i < length; i++) {
                // L[i - 1] already contains the product of elements to the left of 'i - 1'
                // Simply multiplying it with nums[i - 1] would give the product of all
                // elements to the left of index 'i'
                L[i] = nums[i - 1] * L[i - 1];
            }

            // R[i] contains the product of all the elements to the right
            // Note: for the element at index 'length - 1', there are no elements to the right,
            // so the R[length - 1] would be 1
            R[length - 1] = 1;
            for (int i = length - 2; i >= 0; i--) {
                // R[i + 1] already contains the product of elements to the right of 'i + 1'
                // Simply multiplying it with nums[i + 1] would give the product of all
                // elements to the right of index 'i'
                R[i] = nums[i + 1] * R[i + 1];
            }

            // Constructing the answer array
            for (int i = 0; i < length; i++) {
                // For the first element, R[i] would be product except self
                // For the last element of the array, product except self would be L[i]
                // Else, multiple product of all elements to the left and to the right
                answer[i] = L[i] * R[i];
            }

            return answer;
        }
    }


    /*
    Time complexity : O(N) where N represents the number of elements in the input array. We use one iteration to construct the array L, one to update the array answer.
Space complexity : O(1) since don't use any additional array for our computations. The problem statement mentions that using the answer array doesn't add to the space complexity.

     * */
    class Solution2 {

        public int[] productExceptSelf(int[] nums) {
            // The length of the input array
            int length = nums.length;

            // Final answer array to be returned
            int[] answer = new int[length];

            // answer[i] contains the product of all the elements to the left
            // Note: for the element at index '0', there are no elements to the left,
            // so the answer[0] would be 1
            answer[0] = 1;
            for (int i = 1; i < length; i++) {
                // answer[i - 1] already contains the product of elements to the left of 'i - 1'
                // Simply multiplying it with nums[i - 1] would give the product of all
                // elements to the left of index 'i'
                answer[i] = nums[i - 1] * answer[i - 1];
            }

            // R contains the product of all the elements to the right
            // Note: for the element at index 'length - 1', there are no elements to the right,
            // so the R would be 1
            int R = 1;
            for (int i = length - 1; i >= 0; i--) {
                // For the index 'i', R would contain the
                // product of all elements to the right. We update R accordingly
                answer[i] = answer[i] * R;
                R *= nums[i];
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution2 solution = new ProductOfArrayExceptSelf().new Solution2();
//        int[] nums1 = {1, 2, 3, 4};
        int[] nums1 = {4, 5, 1, 8, 2};
        int[] result1 = solution.productExceptSelf(nums1);
        // Output: [24,12,8,6]
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();

//        int[] nums2 = {-1, 1, 0, -3, 3};
//        int[] result2 = solution.productExceptSelf(nums2);
//        // Output: [0,0,9,0,0]
//        for (int num : result2) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
    }


}
