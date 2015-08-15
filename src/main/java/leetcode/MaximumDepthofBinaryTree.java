package leetcode;

/**
 * Created by TedHakcer on 2015/8/15 0015.
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */
public class MaximumDepthofBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {
        private int max(int a, int b) {
            return a > b ? a : b;
        }

        public int maxDepth(TreeNode root) {
            if (root == null) return 0;
            int l = 0, r = 0;
            if (root.left != null)
                l = maxDepth(root.left);
            if (root.right != null)
                r = maxDepth(root.right);
            return max(l, r) + 1;
        }
    }
}
