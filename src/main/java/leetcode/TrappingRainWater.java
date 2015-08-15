package leetcode;

/**
 * Created by TedHakcer on 2015/8/15 0015.
 * https://leetcode.com/problems/trapping-rain-water/
 */
public class TrappingRainWater {
    public class Solution {
        public int trap(int[] height) {
            int left = 0;
            int right = height.length - 1;
            int summ = 0, sh = 0;
            for (; left < right; ) {
                if (height[left] < height[right]) {
                    sh = Math.max(sh, height[left]);
                    summ += sh - height[left];
                    ++left;
                } else {
                    sh = Math.max(sh, height[right]);
                    summ += sh - height[right];
                    --right;
                }
            }
            return summ;
        }
    }
}
