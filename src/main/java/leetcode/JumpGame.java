package leetcode;

/**
 * Created by TedHakcer on 2015/8/15 0015.
 * https://leetcode.com/problems/jump-game/
 */
public class JumpGame {
    public class Solution {
        public boolean canJump(int[] nums) {
            int jump = nums[0];
            for (int i = 1; i < nums.length; ++i) {
                jump -= 1;
                if (jump < 0) return false;
                jump = jump > nums[i] ? jump : nums[i];
            }
            return jump >= 0;
        }
    }
}
