package com.nskhoa.leetcode.array.easy.pascal_triangle;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    static class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> triangle = new ArrayList<List<Integer>>();

            triangle.add(new ArrayList<>());
            triangle
                    .get(0)
                    .add(1);

            for (int rowNum = 1; rowNum < numRows; rowNum++) {
                List<Integer> row = new ArrayList<>();
                List<Integer> prevRow = triangle.get(rowNum - 1);

                // The first row element is always 1.
                row.add(1);

                // Each triangle element (except the first and last of each row)
                for (int j = 1; j < rowNum; j++) {
                    row.add(prevRow.get(j - 1) + prevRow.get(j));
                }

                // The last row element is always 1.
                row.add(1);

                triangle.add(row);
            }

            return triangle;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.generate(5));
    }
}
