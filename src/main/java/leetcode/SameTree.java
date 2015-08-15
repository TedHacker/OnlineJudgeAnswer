package leetcode;

/**
 * Created by TedHakcer on 2015/8/15 0015.
 * https://leetcode.com/problems/same-tree/
 */
public class SameTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == null && q == null) return true;
            else if (p == null || q == null) return false;
            if (p.val != q.val) return false;
            if (!isSameTree(p.left, q.left)) return false;
            if (!isSameTree(p.right, q.right)) return false;
            return true;
        }
    }
}
