/**
 * Created by qinjuntao on 2015/8/10.
 * https://leetcode.com/problems/invert-binary-tree/
 */
public class InvertBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {
        private void invertNode(TreeNode root) {
            TreeNode tmp;
            tmp = root.left;
            root.left = root.right;
            root.right = tmp;
        }

        public TreeNode invertTree(TreeNode root) {
            if (root == null) return null;
            invertTree(root.left);
            invertTree(root.right);
            invertNode(root);
            return root;
        }
    }
}
