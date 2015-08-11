package leetcode;

/**
 * Created by TedHakcer on 2015/8/11 0011.
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 */
public class FindMinimuminRotatedSortedArray {
    public class Solution {
        private int find(int[] nums, int left, int right) {
            if (left == right) {
                return nums[left];
            }
            int mid = (left + right) / 2;
            if (nums[mid] > nums[right]) {
                return find(nums, mid + 1, right);
            } else {
                return find(nums, left, mid);
            }
        }

        public int findMin(int[] nums) {
            return find(nums, 0, nums.length - 1);
        }
    }
}
