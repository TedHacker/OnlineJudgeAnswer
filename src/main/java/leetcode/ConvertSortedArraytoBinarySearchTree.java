package leetcode;

/**
 * Created by TedHakcer on 2015/8/10 0010.
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 */
public class ConvertSortedArraytoBinarySearchTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {
        private TreeNode buildTree(int[] nums, int left, int right) {
            if (left > right) return null;
            int mid = (left + right) / 2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = buildTree(nums, left, mid - 1);
            root.right = buildTree(nums, mid + 1, right);
            return root;
        }

        public TreeNode sortedArrayToBST(int[] nums) {
            if (nums == null || nums.length < 1) return null;
            return buildTree(nums, 0, nums.length - 1);
        }
    }
}
