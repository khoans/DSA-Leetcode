package com.nskhoa.leetcode.array.easy.next_greater_element_i;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementI {
    public static class Solution {

        public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
            Stack<Integer> stack = new Stack<>();
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < nums2.length; i++) {
                while (!stack.empty() && nums2[i] > stack.peek()) {
                    map.put(
                            stack.pop(), // actual num in question
                            nums2[i] // the item that is larger
                    );
                }
                stack.push(nums2[i]);
            }

            while (!stack.empty()) {
                map.put(stack.pop(), -1);
            }

            int[] res = new int[nums1.length];
            for (int i = 0; i < nums1.length; i++) {
                res[i] = map.get(nums1[i]);
            }

            return res;
        }

        static void printArray(int arr[])
        {
            int n = arr.length;
            for (int i = 0; i < n; i++)
            {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            int[] nums1 = new int[]{2,3,5,1};
            int[] nums2 = new int[]{2,3,5,1,0,7,3}; // 3 is duplicated

            int[] result = nextGreaterElement(nums1, nums2);

            printArray(result);
        }
    }
}
