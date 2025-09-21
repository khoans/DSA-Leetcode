package com.nskhoa.leetcode.array.easy.plus_one;

/*
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.



Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].


Constraints:

1 <= digits.length <= 100
0 <= digits[i] <= 9
digits does not contain any leading 0's.
 * */
public class PlusOne {
    /*
    Complexity Analysis

Let N be the number of elements in the input list.

Time complexity: O(N) since it's not more than one pass along the input list.

Space complexity: O(N)

Although we perform the operation in-place (i.e. on the input list itself),
in the worst scenario, we would need to allocate an intermediate space to hold the result,
which contains the N+1 elements.
Hence the overall space complexity of the algorithm is O(N).
     * */
    class Solution {
        public int[] plusOne(int[] digits) {
            int n = digits.length;

            //Move along the input array starting from the end
            for (int idx = n - 1; idx >= 0; --idx) {
                //Set all the nines at the end of the array to zeros
                if (digits[idx] == 9) {
                    digits[idx] = 0;
                }
                //Here we have the rightmost not-nine
                else {
                    // Increase this rightmost not-nine by 1
                    digits[idx]++;

                    // and the job is done
                    return digits;
                }
            }

            // We're here because all the digits are nines
            digits = new int[n + 1];
            digits[0] = 1;
            return digits;
        }
    }

    public static void main(String[] args) {
        Solution solution = new PlusOne().new Solution();
        int[] digits1 = {1, 2, 3};
        int[] result1 = solution.plusOne(digits1);
        System.out.print("Result 1: [");
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i]);
            if (i < result1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]"); // Output: [1, 2, 4]

        int[] digits2 = {4, 3, 2, 1};
        int[] result2 = solution.plusOne(digits2);
        System.out.print("Result 2: [");
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i]);
            if (i < result2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]"); // Output: [4, 3, 2, 2]

        int[] digits3 = {9};
        int[] result3 = solution.plusOne(digits3);
        System.out.print("Result 3: [");
        for (int i = 0; i < result3.length; i++) {
            System.out.print(result3[i]);
            if (i < result3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]"); // Output: [1, 0]
    }
}
