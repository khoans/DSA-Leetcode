package com.nskhoa.leetcode.intervals.medium.non_overlapping_intervals;

import java.util.Arrays;
import java.util.Comparator;

/*
Given an array of intervals intervals where intervals[i] = [starti, endi], return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.

Note that intervals which only touch at a point are non-overlapping. For example, [1, 2] and [2, 3] are non-overlapping.



Example 1:

Input: intervals = [[1,2],[2,3],[3,4],[1,3]]
Output: 1
Explanation: [1,3] can be removed and the rest of the intervals are non-overlapping.
Example 2:

Input: intervals = [[1,2],[1,2],[1,2]]
Output: 2
Explanation: You need to remove two [1,2] to make the rest of the intervals non-overlapping.
Example 3:

Input: intervals = [[1,2],[2,3]]
Output: 0
Explanation: You don't need to remove any of the intervals since they're already non-overlapping.
 * */
public class NonOverlappingIntervals {

    /*
    Time Complexity: O(N log N), where N is the number of intervals. This is due to the sorting step.
    Space Complexity: O(1), since we are using only a constant amount of extra space
    * */
    class Solution {
        public int eraseOverlapIntervals(int[][] intervals) {
            Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
            int ans = 0;
            int k = Integer.MIN_VALUE;

            for (int i = 0; i < intervals.length; i++) {
                int x = intervals[i][0];
                int y = intervals[i][1];

                if (x >= k) {
                    // Case 1
                    k = y;
                }
                else {
                    // Case 2
                    ans++;
                }
            }

            return ans;
        }
    }

    public static void main(String[] args) {
        Solution solution = new NonOverlappingIntervals().new Solution();
        System.out.println(solution.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}})); // 1
        System.out.println(solution.eraseOverlapIntervals(new int[][]{{1, 2}, {1, 2}, {1, 2}})); // 2
        System.out.println(solution.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}})); // 0
    }
}
