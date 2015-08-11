package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by qinjuntao on 2015/8/11.
 * https://leetcode.com/problems/symmetric-tree/
 */
public class SymmetricTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {
        Queue<TreeNode> left = new LinkedList<TreeNode>();
        Queue<TreeNode> right = new LinkedList<TreeNode>();

        public boolean isSymmetric(TreeNode root) {
            if (root == null || (root.left == null && root.right == null)) return true;
            if ((root.left == null && root.right != null) || (root.left != null && root.right == null)) return false;
            left.offer(root.left);
            right.offer(root.right);
            TreeNode l, r;
            for (; (!left.isEmpty()) && (!right.isEmpty()); ) {
                l = left.peek();
                left.poll();
                r = right.peek();
                right.poll();
                if (l == null && r == null) continue;
                if ((l == null && r != null) || (l != null && r == null)) return false;
                if (l.val != r.val) return false;
                left.offer(l.left);
                left.offer(l.right);
                right.offer(r.right);
                right.offer(r.left);
            }
            return true;
        }
    }
}
