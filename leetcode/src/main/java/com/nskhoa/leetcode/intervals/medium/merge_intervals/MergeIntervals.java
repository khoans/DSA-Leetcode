package com.nskhoa.leetcode.intervals.medium.merge_intervals;

import java.util.Arrays;
import java.util.LinkedList;

/*
Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.



Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
Example 3:

Input: intervals = [[4,7],[1,4]]
Output: [[1,7]]
Explanation: Intervals [1,4] and [4,7] are considered overlapping.


Constraints:

1 <= intervals.length <= 104
intervals[i].length == 2
0 <= starti <= endi <= 104
 * */
public class MergeIntervals {
    /*
    Time Complexity: O(N log N), where N is the number of intervals. This is due to the sorting step.
    Space Complexity: O(N), in the worst case, all intervals might be non-overlapping
    * */
    class Solution {
        public int[][] merge(int[][] intervals) {
            Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
            LinkedList<int[]> merged = new LinkedList<>();
            for (int[] interval : intervals) {
                // if the list of merged intervals is empty or if the current
                // interval does not overlap with the previous, simply append it.
                if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                    merged.add(interval);
                }
                // otherwise, there is overlap, so we merge the current and previous
                // intervals.
                else {
                    merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
                }
            }
            return merged.toArray(new int[merged.size()][]);
        }
    }

    public static void main(String[] args) {
        Solution solution = new MergeIntervals().new Solution();
        System.out.println(Arrays.deepToString(solution.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}}))); // [[1,6],[8,10],[15,18]]
        System.out.println(Arrays.deepToString(solution.merge(new int[][]{{1, 4}, {4, 5}}))); // [[1,5]]
        System.out.println(Arrays.deepToString(solution.merge(new int[][]{{4, 7}, {1, 4}}))); // [[1,7]]
    }
}
