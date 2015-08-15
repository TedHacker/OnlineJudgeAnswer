package leetcode;

/**
 * Created by TedHakcer on 2015/8/15 0015.
 * https://leetcode.com/problems/single-number/
 */
public class SingleNumber {
    public class Solution {
        public int singleNumber(int[] nums) {
            int res = nums[0];
            for (int i = 1; i < nums.length; ++i)
                res ^= nums[i];
            return res;
        }
    }
}
