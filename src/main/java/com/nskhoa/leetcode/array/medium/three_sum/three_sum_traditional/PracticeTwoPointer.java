package com.nskhoa.leetcode.array.medium.three_sum.three_sum_traditional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeTwoPointer
{
    public static List<List<Integer>> threeSum(int[] nums)
    {
        // Sort Array
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length && nums[i] <= 0; i++)
        {
            if (i == 0 || (nums[i - 1] != nums[i]))
            {

                twoSumIIPointer(nums, i, res);
            }
        }
        return res;
    }

    public static void twoSumIIPointer(int[] nums, int i, List<List<Integer>> res)
    {
        int left = i + 1;
        int right = nums.length - 1;

        while (left < right)
        {
            int sum = nums[i] + nums[left] + nums[right];
            if (sum < 0)
            {
                left++;
            }
            else if (sum > 0)
            {
                right--;
            }
            else
            {
                res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                left++;
                right--;
                while (left < right && nums[left] == nums[left - 1])
                {
                    left++;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int[] nums = {
                -3,
                -2,
                -1,
                0,
                1,
                2,
                3,
                5,
                -1,
                -4
        };

        System.out.println(threeSum(nums));

    }
}
