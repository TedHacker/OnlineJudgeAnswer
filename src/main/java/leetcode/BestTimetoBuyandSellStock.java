package leetcode;

/**
 * Created by qinjuntao on 2015/8/14.
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class BestTimetoBuyandSellStock {
    public class Solution {
        public int maxProfit(int[] prices) {
            int minx = Integer.MAX_VALUE;
            int maxx = 0;
            for (int i = 0; i < prices.length; ++i) {
                maxx = Math.max(maxx, prices[i] - minx); //第i个值减去0~i-1的最小值，比较它和已知最大收益的大小
                minx = Math.min(minx, prices[i]);// 保存0~i的最小值
            }
            return maxx;
        }
    }
}
