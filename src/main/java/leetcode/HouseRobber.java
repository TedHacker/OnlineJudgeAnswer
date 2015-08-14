package leetcode;

/**
 * Created by qinjuntao on 2015/8/14.
 * https://leetcode.com/problems/house-robber/
 */
public class HouseRobber {
    public class Solution {
        public int rob(int[] nums) {
            if (nums == null) return 0;
            int[] a = new int[nums.length];//在第i户时不取第i户情况下的最大值
            int[] b = new int[nums.length];//在第i户时取第i户情况下的最大值
            a[0] = 0;
            b[0] = nums[0];
            for (int i = 1; i < nums.length; ++i) {
                a[i] = Math.max(a[i - 1], b[i - 1]);
                b[i] = a[i - 1] + nums[i];
            }
            return Math.max(a[nums.length - 1], b[nums.length - 1]);
        }
    }
}
