package com.nskhoa.leetcode.intervals.medium.insert_interval;

import java.util.ArrayList;
import java.util.List;

/*
You are given an array of non-overlapping intervals intervals where intervals[i] = [starti, endi] represent the start and the end of the ith interval and intervals is sorted in ascending order by starti. You are also given an interval newInterval = [start, end] that represents the start and end of another interval.

Insert newInterval into intervals such that intervals is still sorted in ascending order by starti and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).

Return intervals after the insertion.

Note that you don't need to modify intervals in-place. You can make a new array and return it.



Example 1:

Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
Output: [[1,5],[6,9]]
Example 2:

Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
Output: [[1,2],[3,10],[12,16]]
Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].


Constraints:

0 <= intervals.length <= 104
intervals[i].length == 2
0 <= starti <= endi <= 105
intervals is sorted by starti in ascending order.
newInterval.length == 2
0 <= start <= end <= 105
 * */
public class InsertIntervals {
    /*
    Time Complexity: O(N), where N is the number of intervals in the given list. We traverse the list of intervals at most once.
    Space Complexity: O(N), in the worst case, we might need to store all the intervals
    * */
    class Solution {
        public int[][] insert(int[][] intervals, int[] newInterval) {
            int n = intervals.length, i = 0;
            List<int[]> res = new ArrayList<>();

            // Case 1: No overlapping before merging intervals
            while (i < n && intervals[i][1] < newInterval[0]) {
                res.add(intervals[i]);
                i++;
            }

            // Case 2: Overlapping and merging intervals
            while (i < n && newInterval[1] >= intervals[i][0]) {
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
                i++;
            }
            res.add(newInterval);

            // Case 3: No overlapping after merging newInterval
            while (i < n) {
                res.add(intervals[i]);
                i++;
            }

            // Convert List to array
            return res.toArray(new int[res.size()][]);
        }
    }

    public static void main(String[] args) {
        Solution solution = new InsertIntervals().new Solution();
        int[][] intervals = {{1, 3}, {8, 9}};
        int[] newInterval = {5, 6};
        int[][] result = solution.insert(intervals, newInterval);
        for (int[] interval : result) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }
}
