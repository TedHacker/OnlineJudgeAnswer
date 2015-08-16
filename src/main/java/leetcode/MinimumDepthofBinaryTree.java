package leetcode;

/**
 * Created by TedHakcer on 2015/8/16 0016.
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/
 * 题目是The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 * 即根到叶子结点的距离
 */
public class MinimumDepthofBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public int minDepth(TreeNode root) {
            if (root == null) return 0;
            if (root.left == null && root.right == null) return 1; //当无左右孩纸时，才是叶子结点
            if (root.left == null) { //无左孩纸，距离必须从右孩纸开始算
                return minDepth(root.right) + 1;
            } else if (root.right == null) { //同上
                return minDepth(root.left) + 1;
            } else {
                return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
            }
        }
    }
}
