package com.nskhoa.leetcode.array.easy.week1_array.best_time_to_buy_stock;

public class BestTimeToBuyAndSellStock {
    class Solution {
        public int maxProfit(int[] prices) {
            int minPrice = Integer.MAX_VALUE;
            int maxProfit = 0;

            for (int i = 0 ; i < prices.length ; i++) {
                if (minPrice > prices[i]) {
                    minPrice = prices[i];
                }
                int profit = prices[i] - minPrice;

                if (maxProfit < profit) {
                    maxProfit = profit;
                }
            }

            return maxProfit;
        }
    }
}
