package com.nskhoa.leetcode.array.medium.insert_interval;

/*
https://leetcode.com/problems/insert-interval/description/
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
 */

import java.util.ArrayList;
import java.util.List;

public class InsertInterval
{
    public int[][] insertLinearSearch(int[][] intervals, int[] newInterval)
    {
        List<int[]> res = new ArrayList<>();
        int n = intervals.length;
        int i = 0;

        // Case 1 : No overlapping, keep the original interval
        while (i < n && intervals[i][1] < newInterval[0])
        {
            res.add(intervals[i]);
            i++;
        }

        // Case 2: Overlapping, merged
        while (i < n && intervals[i][0] <= newInterval[1])
        {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        res.add(newInterval);

        while (i < n)
        {
            res.add(intervals[i]);
            i++;
        }

        return res.toArray(new int[res.size()][1]);
    }

    public static int[][] insertBinarySearch(int[][] intervals, int[] newInterval)
    {
        // Case 1: No item in intervals, return newInterval
        if (intervals.length == 0)
        {
            return new int[][]{newInterval};
        }

        int n = intervals.length;
        int left = 0;
        int right = intervals.length - 1;
        int target = newInterval[0];

        // Doing binary search to find the insertion point
        while (left <= right)
        {
            int mid = left + (right - left) / 2;
            if (intervals[mid][0] < target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }

        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < left; i++)
        {
            result.add(intervals[i]);
        }
        result.add(newInterval);
        for (int i = left; i < n; i++)
        {
            result.add(intervals[i]);
        }

        List<int[]> merged = new ArrayList<>();
        for (int[] interval : result)
        {
            int mergedLength = merged.size();

            // No overlapping
            if (merged.isEmpty() || merged.get(mergedLength - 1)[1] < interval[0])
            {
                merged.add(interval);
            }
            else
            {
                merged.get(mergedLength - 1)[1] = Math.max(merged.get(mergedLength - 1)[1], interval[1]);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {
                {1, 2},
                {3, 5},
                {6, 7},
                {8, 10},
                {12, 16}
        };

        int[] newInterval = {4, 8};

        int[][] result = insertBinarySearch(intervals, newInterval);

        // Print the result
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print("[" + result[i][0] + ", " + result[i][1] + "]");
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
