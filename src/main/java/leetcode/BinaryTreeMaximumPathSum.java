package leetcode;

/**
 * Created by TedHakcer on 2015/8/16 0016.
 * https://leetcode.com/problems/binary-tree-maximum-path-sum/
 */
public class BinaryTreeMaximumPathSum {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {
        private int res;

        private int dfs(TreeNode root) {
            int a = 0, b = 0;
            int tmp = Integer.MIN_VALUE;
            if (root.left != null) {
                a = dfs(root.left);
                res = Math.max(res, a + root.val);
                tmp = Math.max(tmp, a);
            }
            if (root.right != null) {
                b = dfs(root.right);
                res = Math.max(res, b + root.val);
                tmp = Math.max(tmp, b);
            }
            if (root.left != null && root.right != null) {
                res = Math.max(res, a + b + root.val);
            }
            res = Math.max(res, root.val);
            return root.val + (tmp > 0 ? tmp : 0);
        }

        public int maxPathSum(TreeNode root) {
            if (root == null) return 0;
            res = Integer.MIN_VALUE;
            dfs(root);
            return res;
        }
    }
}
