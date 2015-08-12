package leetcode;

/**
 * Created by qinjuntao on 2015/8/12.
 * https://leetcode.com/problems/rotate-array/
 */
public class RotateArray {
    public class Solution {
        private void reverse(int[] nums, int a, int b) {
            int tmp;
            for (int i = a, j = b - 1; i < j; ++i, --j) {
                tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
            return;
        }

        public void rotate(int[] nums, int k) {
            k = k % nums.length;//k可能超过nums的长度
            reverse(nums, 0, nums.length - k);
            reverse(nums, nums.length - k, nums.length);
            reverse(nums, 0, nums.length);
        }
    }
}
