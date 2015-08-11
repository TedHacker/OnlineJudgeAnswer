/**
 * Created by qinjuntao on 2015/8/11.
 * https://leetcode.com/problems/balanced-binary-tree/
 */
public class BalancedBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {
        private boolean flag = true;

        private int dfs(TreeNode root) {
            if (root == null) return 0;
            int left = dfs(root.left);
            int right = dfs(root.right);
            if (Math.abs(left - right) > 1) {
                flag = false;
            }
            return Math.max(left, right) + 1;
        }

        public boolean isBalanced(TreeNode root) {
            dfs(root);
            return flag;
        }
    }
}
