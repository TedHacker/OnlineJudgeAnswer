package leetcode;

/**
 * Created by TedHakcer on 2015/8/15 0015.
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 */
public class BestTimetoBuyandSellStockII {
    public class Solution {
        public int maxProfit(int[] prices) {
            int n = prices.length;
            for (int i = 0; i < n - 1; ++i)
                prices[i] = prices[i + 1] - prices[i];
            int sum = 0;
            for (int i = 0; i < n - 1; ++i)
                if (prices[i] > 0)
                    sum += prices[i];
            return sum;
        }
    }
}
