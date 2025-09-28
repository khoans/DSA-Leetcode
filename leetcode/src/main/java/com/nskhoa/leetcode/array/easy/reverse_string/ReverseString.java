package com.nskhoa.leetcode.array.easy.reverse_string;


/*
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.



Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]


Constraints:

1 <= s.length <= 105
s[i] is a printable ascii character.
 * */
public class ReverseString {
    /*
    Complexity Analysis

Time complexity : O(N) to swap N/2 element.

Space complexity : O(1), it's a constant space solution.
    * */
    class Solution {
        public void reverseString(char[] s) {
            int left = 0, right = s.length - 1;
            while (left < right) {
                char tmp = s[left];
                s[left] = s[right];
                s[right] = tmp;
                left++;
                right--;
            }
        }
    }

    /*
Complexity Analysis

Time complexity : O(N) time to perform N/2 swaps.

Space complexity : O(N) to keep the recursion stack.
     * */
    class Solution2 {
        public void helper(char[] s, int left, int right) {
            if (left >= right) {
                return;
            }
            char tmp = s[left];
            s[left++] = s[right];
            s[right--] = tmp;
            helper(s, left, right);
        }

        public void reverseString(char[] s) {
            helper(s, 0, s.length - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new ReverseString().new Solution();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(s);
        System.out.println(s); // Output: ["o","l","l","e","h"]
    }
}
